package com.wht;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {//ΪʲôҪ�̳У�
    public LoginFrame(){
        JFrame jFrame=new JFrame("��¼");
        jFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        //��С
        jFrame.setSize(500,300);

        JLabel jLabelLoginName=new JLabel("�û�����");
        jLabelLoginName.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField jTextFieldLoginName=new JTextField(10);
        JLabel jLabelPassword=new JLabel("���룺");
        jLabelPassword.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField jTextFieldPassword=new JTextField(10);

        JButton jButtonLogin=new JButton("��¼");
        jButtonLogin.setSize(20,8);
        JButton jButtonRegister=new JButton("ע��");

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
        //��󻯰�ť������
        jFrame.setResizable(false);
        //����
        jFrame.setLocationRelativeTo(null);
        //jFrame.pack();
        jFrame.setVisible(true);
    }
}
