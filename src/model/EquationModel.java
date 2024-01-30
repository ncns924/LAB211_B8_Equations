package model;

import java.util.ArrayList;
import java.util.List;

public class EquationModel {
    public List<Float> calculateEquation(float a, float b) {
        List<Float> solutions = new ArrayList<>();

        if (a == 0) {
            if (b == 0) {
                // Infinitely many solutions (0x + 0 = 0)
                solutions = null;
            } else {
                // No solution for linear equation (0x + b = 0, where b is not zero)
                solutions = new ArrayList<>();
            }
        } else {
            // Only one solution for superlative equation (ax + b = 0)
            float solution = -b / a;
            solutions.add(solution);
        }

        return solutions;
    }

public List<Float> calculateQuadraticEquation(float a, float b, float c) {
    List<Float> solutions = new ArrayList<>();

    float delta = b * b - 4 * a * c;

    if (delta > 0) {
        float x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
        float x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
        solutions.add(x1);
        solutions.add(x2);
    } else if (delta == 0) {
        // Only one solution for quadratic equation (ax^2 + bx + c = 0)
        float x = -b / (2 * a);
        solutions.add(x);
    } else {
        // No real solution (delta < 0 for ax^2 + bx + c = 0)
        solutions = null;
    }

    return solutions;
}
}
