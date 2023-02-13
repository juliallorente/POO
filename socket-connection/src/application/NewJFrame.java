package application;


import model.GoogleTalker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class NewJFrame extends JFrame {

    TelaPrincipal telaPrincipal = new TelaPrincipal();

    public NewJFrame() throws IOException {
        Container c = getContentPane();
        setTitle("Verifica Conexão no Socket ");
        setSize(new Dimension(400,200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.add(telaPrincipal);

    }

    public class TelaPrincipal extends JPanel {

        GoogleTalker googleTalker = new GoogleTalker();

        JLabel label = new JLabel();
        JLabel label2 = new JLabel();
        JButton button = new JButton();
        JTextField textField = new JTextField();

        public TelaPrincipal() throws IOException {
            String res = "";
            setLayout(new FlowLayout());
            textField.setColumns(30);
            label.setText("Pesquise alguma coisa:");
            button.setText("Pesquisar");

            button.addActionListener(new ActionListener() {
                @Override public void actionPerformed(ActionEvent e){
                    try {
                        String res = googleTalker.requisitarDados(String.valueOf(textField.getText()));
                        label2.setText("Status: " + res);

                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            });
            googleTalker.fecharConexao();

            this.add(label);
            this.add(textField);
            this.add(button).setPreferredSize(new Dimension(330,25));
            this.add(label2);
        }
    }

}
