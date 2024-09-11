package org.tecnocomfe.views;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AuthView {
    private JTextField textField1;
    private JTextField textField2;
    private JButton entrarButton;
    public JPanel panel1;

    public AuthView() {
        entrarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String Username = textField1.getText();
                String Password = textField2.getText();
                if (Username.equals("admin") && Password.equals("admin")) {
                    JFrame frame = new JFrame("MainView");
                    frame.setContentPane(new MainView().panel1);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.pack();

                    AuthView.this.panel1.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }

            }
        });
    }

}
