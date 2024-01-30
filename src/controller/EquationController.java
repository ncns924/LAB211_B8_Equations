package controller;

import model.EquationModel;
import view.EquationView;

import java.util.List;
import java.util.Scanner;

public class EquationController {
    private EquationView view;
    private EquationModel model;

    public EquationController(EquationView view, EquationModel model) {
        this.view = view;
        this.model = model;
    }

    public void processUserInput() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    processSuperlativeEquation();
                    break;
                case 2:
                    processQuadraticEquation();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    private void processSuperlativeEquation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        float a = validateInput(scanner);

        System.out.print("Enter B: ");
        float b = validateInput(scanner);

        List<Float> solutions = model.calculateEquation(a, b);

        view.displayCalculateEquation(a, b, solutions);
    }

    private void processQuadraticEquation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        float a = validateInput(scanner);

        System.out.print("Enter B: ");
        float b = validateInput(scanner);

        System.out.print("Enter C: ");
        float c = validateInput(scanner);

        List<Float> solutions = model.calculateQuadraticEquation(a, b, c);

        view.displayCalculateQuadraticEquation(a, b, c, solutions);
    }

    private float validateInput(Scanner scanner) {
        while (true) {
            String input = scanner.next();
            try {
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
