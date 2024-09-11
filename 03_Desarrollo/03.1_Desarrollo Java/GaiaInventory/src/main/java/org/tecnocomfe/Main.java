package org.tecnocomfe;

import org.tecnocomfe.views.AuthView;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Esto sera un sistema de inverario tipo KARDEX basado en el rpincipio FIFO para una marca de ropa femenina de nombre Gaia World
//        El nombre del sistema sera GaiaInventory
//        Abrir ventana de login
        JFrame frame = new JFrame("AuthView");
        frame.setContentPane(new AuthView().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}