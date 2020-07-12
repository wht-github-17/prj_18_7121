package com.wht;

import javax.swing.*;

public class BookFrame extends JInternalFrame {
    public BookFrame() {
        super(" ÈºÆπ‹¿Ì",  // title
                true,       // resizable
                true,       // closable
                true,       // maximizable
                true        // iconifiable
        );

        this.setSize(500, 500);
        this.setVisible(true);
    }
}
