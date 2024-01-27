package com.mycompany.login;

import com.mycompany.login.igu.LoginPrincipal;
import javax.swing.JFrame;

public class Login {

    public static void main(String[] args) {
        
        LoginPrincipal ventanaPrin = new LoginPrincipal();
        ventanaPrin.setVisible(true);
        ventanaPrin.setLocationRelativeTo(null);
        ventanaPrin.setResizable(false);
        ventanaPrin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
