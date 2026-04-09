package src;

public class SudokuSolver {
    private SudokuGrid sudokuGrid;

    public SudokuSolver(SudokuGrid grid) {
        this.sudokuGrid = grid;
    }

    public boolean solve() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (sudokuGrid.getValue(row, col) == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(row, col, num)) {
                            sudokuGrid.setValue(row, col, num);
                            if (solve()) {
                                return true;
                            }
                            sudokuGrid.setValue(row, col, 0); // Backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int row, int col, int num) {
        // Vérifier la ligne et la colonne
        for (int i = 0; i < 9; i++) {
            if (sudokuGrid.getValue(row, i) == num || sudokuGrid.getValue(i, col) == num) {
                return false;
            }
        }
        // Vérifier le carré 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudokuGrid.getValue(startRow + i, startCol + j) == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
