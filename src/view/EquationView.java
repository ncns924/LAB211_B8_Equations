package view;

import java.util.List;

public class EquationView {
    public void displayMenu() {
        System.out.println("========= Equation Program =========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Please choose one option: ");
    }

public void displayCalculateEquation(float a, float b, List<Float> solutions) {
    System.out.println("----- Calculate Equation -----");
    System.out.println("Enter A: " + a);
    System.out.println("Enter B: " + b);

    if (solutions == null) {
        System.out.println("Infinite solutions");
    } else if (solutions.isEmpty()) {
        System.out.println("No solution");
    } else {
        System.out.print("Solution:");
        for (Float solution : solutions) {
            System.out.print(" x = " + solution);
        }

        System.out.print("\nOdd Number(s):");
        if (isOdd(b)) System.out.print(" " + b);
        for (Float solution : solutions) {
            if (isOdd(solution)) {
                System.out.print(" " + solution);
            }
        }

        System.out.print("\nNumber is Even:");
        if (isEven(a)) System.out.print(" " + a);

        System.out.print("\nNumber is Perfect Square:");
        if (isPerfectSquare(a)) System.out.print(" " + a);

        System.out.println();
    }
}

public void displayCalculateQuadraticEquation(float a, float b, float c, List<Float> solutions) {
    System.out.println("----- Calculate Quadratic Equation -----");
    System.out.println("Enter A: " + a);
    System.out.println("Enter B: " + b);
    System.out.println("Enter C: " + c);

    if (solutions == null) {
        System.out.println("No real solution");
    } else if (solutions.isEmpty()) {
        System.out.println("No real solution");
    } else {
        System.out.print("Solution:");
        for (Float solution : solutions) {
            System.out.print(" x = " + solution);
        }

        System.out.print("\nOdd Number(s):");
        if (isOdd(c)) System.out.print(" " + c);
        for (Float solution : solutions) {
            if (isOdd(solution)) {
                System.out.print(" " + solution);
            }
        }

        System.out.print("\nNumber is Even:");
        if (isEven(a)) System.out.print(" " + a);
        if (isEven(b)) System.out.print(" " + b);
        if (isEven(c)) System.out.print(" " + c);

        System.out.print("\nNumber is Perfect Square:");
        if (isPerfectSquare(a)) System.out.print(" " + a);
        if (isPerfectSquare(b)) System.out.print(" " + b);
        if (isPerfectSquare(c)) System.out.print(" " + c);

        System.out.println();
    }
}

private boolean isOdd(float number) {
    return (number % 2 != 0);
}

private boolean isEven(float number) {
    return (number % 2 == 0);
}

private boolean isPerfectSquare(float number) {
    double sqrt = Math.sqrt(number);
    return (sqrt - Math.floor(sqrt)) == 0;
}

}
