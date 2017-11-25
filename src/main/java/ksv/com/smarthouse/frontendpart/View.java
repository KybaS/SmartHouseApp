package ksv.com.smarthouse.frontendpart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {  //not implemented yet

    public void newArea() {
        TextArea1 gui = new TextArea1();
        gui.go();
    }

    public class TextArea1 implements ActionListener {
        JTextArea text;

        public void go() {

            JPanel panel = new JPanel();
            JPanel panel1 = new JPanel();

            JButton button = new JButton("Just click it");
            button.addActionListener(this);
            text = new JTextArea(25, 60);
            text.setLineWrap(true);

            JScrollPane scroller = new JScrollPane(text);
            scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            panel.add(scroller);

            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.getContentPane().add(BorderLayout.CENTER, panel);
            frame.getContentPane().add(BorderLayout.SOUTH, button);

            frame.setSize(750, 500);
            frame.setVisible(true);



            MyDrawPanel drawPanel = new MyDrawPanel();

            frame.getContentPane().add(drawPanel);
            frame.setTitle("Smart House Ψ");
            frame.setSize(1020, 540);
            frame.setVisible(true);
        }

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            text.append("test");
        }

        public class MyDrawPanel extends JPanel {
            public void paintComponent(Graphics g) {
                Image image = new ImageIcon("bg.jpg").getImage();
                g.drawImage(image, 0, 0, this);
            }
        }
    }
}
