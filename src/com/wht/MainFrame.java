package com.wht;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import static java.awt.Frame.MAXIMIZED_BOTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MainFrame {
    public MainFrame() {
        JFrame jFrame = new JFrame("ϵͳ");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar bar = new JMenuBar();
        JMenu jMenuBook = new JMenu("�鼮����");
        // JMenuItem jMenuItem=new JMenuItem("");
        bar.add(jMenuBook);
        jMenuBook.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                //���鼮������
// ���� �������
                JDesktopPane desktopPane = new JDesktopPane();

                // ���� �ڲ�����
                JInternalFrame jInternalFrame = new BookFrame();

                // ��� �ڲ����� �� �������
                desktopPane.add(jInternalFrame);

                jFrame.add(desktopPane);
//                try {
//                    jInternalFrame.setSelected(true);
//                } catch (PropertyVetoException ex) {
//                    ex.printStackTrace();
//                }

            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }


        });
        JMenu jMenuReader=new JMenu("���߹���");
        bar.add(jMenuReader);

        jFrame.setJMenuBar(bar);
        jFrame.setExtendedState(MAXIMIZED_BOTH);
        jFrame.setVisible(true);

    }
}
