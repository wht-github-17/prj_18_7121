package com.wht;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame1 extends JFrame {//为什么要继承？

    public LoginFrame1() {
        JFrame jFrame = new JFrame("登录");

        //大小

        JLabel jLabelLoginName = new JLabel("用户名：");
        jLabelLoginName.setHorizontalAlignment(SwingConstants.RIGHT);

        JTextField jTextFieldLoginName = new JTextField(10);

        JLabel jLabelPassword = new JLabel("密码：");
        jLabelPassword.setHorizontalAlignment(SwingConstants.RIGHT);

        JPasswordField jPasswordField = new JPasswordField(10);

        JButton jButtonLogin = new JButton("登录");
        jButtonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(true){

                    new MainFrame();
                    jFrame.dispose();

                }
            }
        });

        JButton jButtonRegister = new JButton("注册");


        JPanel jPanelLoginName = new JPanel();

        jPanelLoginName.add(jLabelLoginName);
        jPanelLoginName.add(jTextFieldLoginName);

        JPanel jPanelPassword = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        jPanelPassword.add(jLabelPassword);
        jPanelPassword.add(jPasswordField);

        JPanel jPanelButton = new JPanel();

        jPanelButton.add(jButtonLogin);
        jPanelButton.add(jButtonRegister);
//        Box box = Box.createVerticalBox();
//        box.add(jPanelLoginName);
//        box.add(jPanelPassword);
//        box.add(jPanelButton);
//        jFrame.add(box);
        jFrame.add(jPanelLoginName, BorderLayout.NORTH);
        jFrame.add(jPanelPassword, BorderLayout.CENTER);
        jFrame.add(jPanelButton, BorderLayout.SOUTH);


        //最大化按钮不可用
        jFrame.setResizable(false);
        jFrame.pack();
        //居中
        jFrame.setLocationRelativeTo(this);

        jFrame.setVisible(true);
    }
}
