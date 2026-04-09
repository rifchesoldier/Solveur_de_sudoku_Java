package src;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SudokuGrid grid = new SudokuGrid();
        
        if (args.length > 0) {
            try {
                grid.loadFromFile(args[0]);
                System.out.println("Grille chargée depuis : " + args[0]);
            } catch (FileNotFoundException e) {
                System.out.println("Erreur : Fichier non trouvé.");
                return;
            }
        } else {
            System.out.println("Aucun fichier spécifié. Utilisation de la saisie manuelle (non implémentée ici).");
            return;
        }

        System.out.println("Grille originale :");
        grid.display();

        SudokuSolver solver = new SudokuSolver(grid);
        if (solver.solve()) {
            System.out.println("\nSudoku résolu avec succès !");
            grid.display();
        } else {
            System.out.println("\nImpossible de résoudre ce Sudoku.");
        }
    }
}
