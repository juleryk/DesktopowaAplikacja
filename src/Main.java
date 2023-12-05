import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    private JLabel klawisze;
    private Component object = new JTextField();
    public Main() {
        JPanel jPanel = new JPanel();
        JPanel jPanel1 = new JPanel();
        jPanel.setLayout(new FlowLayout());
        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));

        String scieżkaIkonaLewo = "src/img/lewo.png";
        ImageIcon ikonaLewo = new ImageIcon(scieżkaIkonaLewo);
        String scieżkaIkonaGora = "src/img/gora.png";
        ImageIcon ikonaGora = new ImageIcon(scieżkaIkonaGora);
        String scieżkaIkonaDol = "src/img/dol.png";
        ImageIcon ikonaDol = new ImageIcon(scieżkaIkonaDol);
        String sciezkaOlowek = "src/img/pencil.png";
        ImageIcon ikonaOlowek = new ImageIcon(sciezkaOlowek);


        JButton lewo = new JButton(ikonaLewo);
        JButton gora = new JButton(ikonaGora);
        JButton dol = new JButton(ikonaDol);

        JTextField jTextField = new JTextField(20);

        JButton olowek = new JButton(ikonaOlowek);

        klawisze = new JLabel("");

        jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                sluchaczKlawisza(e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        JFrame jf = new JFrame("Hello");
        JButton zamknij = new JButton("X");
        zamknij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.dispose();
            }
        });

        jTextField.requestFocusInWindow();

        jPanel.add(lewo);
        jPanel.add(gora);
        jPanel.add(dol);
        jPanel.add(jTextField);
        jPanel.add(olowek);
        jPanel.add(klawisze);
        jPanel.add(zamknij);

        jPanel1.add(jPanel);
        jPanel1.add(new TextArea());

        Dimension rozmiarPrzyRoz = new Dimension(20, 20);
        Dimension rozmiarLabel = new Dimension(220, 40);

        lewo.setPreferredSize(rozmiarPrzyRoz);
        gora.setPreferredSize(rozmiarPrzyRoz);
        dol.setPreferredSize(rozmiarPrzyRoz);
        olowek.setPreferredSize(rozmiarPrzyRoz);

        jTextField.setPreferredSize(rozmiarLabel);

        Dimension sizepanel = new Dimension(120,70);

        jPanel.setPreferredSize(sizepanel);

        lewo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.removeAll();
                jPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
                jPanel.add(lewo);
                jPanel.add(gora);
                jPanel.add(dol);
                jPanel.add(jTextField);
                jPanel.add(olowek);
                jPanel.add(klawisze);
                jPanel.add(zamknij);
                jPanel.revalidate();
                jPanel.repaint();
            }
        });


        gora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.removeAll();
                jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
                jPanel.add(lewo);
                jPanel.add(gora);
                jPanel.add(dol);
                jPanel.add(jTextField);
                jPanel.add(olowek);
                jPanel.add(klawisze);
                jPanel.add(zamknij);
                jPanel.revalidate();
                jPanel.repaint();
            }
        });

        dol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.removeAll();
                jPanel.setLayout(new FlowLayout(FlowLayout.TRAILING));
                jPanel.add(lewo);
                jPanel.add(gora);
                jPanel.add(dol);
                jPanel.add(jTextField);
                jPanel.add(olowek);
                jPanel.add(klawisze);
                jPanel.add(zamknij);
                jPanel.revalidate();
                jPanel.repaint();
            }
        });






//        JFrame jf = new JFrame("Hello");
        jf.add(jPanel1);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(780, 320);
        jf.setUndecorated(true);
        jPanel.requestFocusInWindow();
        jf.setLocationRelativeTo(null);
//        jf.pack();
        jf.setVisible(true);
    }

//    private void sluchaczKlawisza(String text) {
//        klawisze.setText(text);
//
//    }
    private void sluchaczKlawisza(char inchar) {
        klawisze.setText(String.valueOf(inchar));

    }


    public static void main(String[] args) {
        new Main();
    }
}
