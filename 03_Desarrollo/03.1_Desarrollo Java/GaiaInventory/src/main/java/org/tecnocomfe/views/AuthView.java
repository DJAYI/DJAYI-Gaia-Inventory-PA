package org.tecnocomfe.views;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AuthView extends JFrame {
    private JTextField TextFieldUsername;
    private JTextField textFieldPassword;
    private JButton BtnEntrar;
    public JPanel panel1;

    public AuthView() {
        setTitle("Gaia Inventory");
        setContentPane(panel1);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        BtnEntrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String Username = TextFieldUsername.getText();
                String Password = textFieldPassword.getText();
                if (Username.equals("admin") && Password.equals("admin")) {
                    MainView mainView = new MainView();

                    dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos, intente de nuevo");
                }

            }

        });
    }

}
