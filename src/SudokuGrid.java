package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuGrid {
    private int[][] grid;

    public SudokuGrid() {
        grid = new int[9][9];
    }

    // Charger une grille à partir d'un fichier .txt
    public void loadFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (scanner.hasNextInt()) {
                    grid[i][j] = scanner.nextInt();
                }
            }
        }
        scanner.close();
    }

    public int getValue(int row, int col) {
        return grid[row][col];
    }

    public void setValue(int row, int col, int value) {
        grid[row][col] = value;
    }

    // Affichage de la grille avec les bordures
    public void display() {
        System.out.println("-------------------------");
        for (int i = 0; i < 9; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j] == 0 ? ". " : grid[i][j] + " ");
                if ((j + 1) % 3 == 0) System.out.print("| ");
            }
            System.out.println();
            if ((i + 1) % 3 == 0) {
                System.out.println("-------------------------");
            }
        }
    }
}
