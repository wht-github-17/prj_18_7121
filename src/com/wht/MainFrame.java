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
        JFrame jFrame = new JFrame("系统");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar bar = new JMenuBar();
        JMenu jMenuBook = new JMenu("书籍管理");
        // JMenuItem jMenuItem=new JMenuItem("");
        bar.add(jMenuBook);
        jMenuBook.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                //打开书籍管理窗口
// 创建 桌面面板
                JDesktopPane desktopPane = new JDesktopPane();

                // 创建 内部窗口
                JInternalFrame jInternalFrame = new BookFrame();

                // 添加 内部窗口 到 桌面面板
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
        JMenu jMenuReader=new JMenu("读者管理");
        bar.add(jMenuReader);

        jFrame.setJMenuBar(bar);
        jFrame.setExtendedState(MAXIMIZED_BOTH);
        jFrame.setVisible(true);

    }
}
