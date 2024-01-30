package main;

import controller.EquationController;
import model.EquationModel;
import view.EquationView;

public class Main {
    public static void main(String[] args) {
        EquationView view = new EquationView();
        EquationModel model = new EquationModel();
        EquationController controller = new EquationController(view, model);

        controller.processUserInput();
    }
}
