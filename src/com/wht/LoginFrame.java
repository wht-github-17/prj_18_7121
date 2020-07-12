package com.wht;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {//为什么要继承？
    public LoginFrame(){
        JFrame jFrame=new JFrame("登录");
        jFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        //大小
        jFrame.setSize(500,300);

        JLabel jLabelLoginName=new JLabel("用户名：");
        jLabelLoginName.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField jTextFieldLoginName=new JTextField(10);
        JLabel jLabelPassword=new JLabel("密码：");
        jLabelPassword.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField jTextFieldPassword=new JTextField(10);

        JButton jButtonLogin=new JButton("登录");
        jButtonLogin.setSize(20,8);
        JButton jButtonRegister=new JButton("注册");

        JPanel jPanel=new JPanel(new GridLayout(3, 2,10,5));
        //jPanel.setSize(200,100);

        jPanel.add(jLabelLoginName);
        jPanel.add(jTextFieldLoginName);
        jPanel.add(jLabelPassword);
        jPanel.add(jTextFieldPassword);
        //jPanel.add(jButtonLogin);
        //jPanel.add(jButtonRegister);


        jFrame.add(jPanel);
        jFrame.add(jButtonLogin);
        //最大化按钮不可用
        jFrame.setResizable(false);
        //居中
        jFrame.setLocationRelativeTo(null);
        //jFrame.pack();
        jFrame.setVisible(true);
    }
}
