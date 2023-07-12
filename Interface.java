
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
//permite criar aplicação desktop sem necessecidade de outras bibliotecas
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Interface {
    public static void main(String[] args) {

        /**
         * Criação de tela
         */
        final String USER = "Felecity";
        final String PASS = "sucesso";

        // mensagem na tela inicial de entrada
        JFrame frame = new JFrame(" Bem vindo!! \nAo nosso sistema.");

        // estou informando quando clicar caixa com x ira finalizar o progroma
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // para poder agrupar os componentes da janelas organizando
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        /**
         * pergunta pro usuario o nome e dica de acesso
         */
        JLabel lblusuario = new JLabel(" Usuario : ");// mensagem pergunta pro usuario
        JTextField txtUsuario = new JTextField(30); // Tamanho da caixa de texto
        txtUsuario.setToolTipText("Informe o seu usuário de acesso : "); // mensagem ao passar o mouse por cima

        /***
         * pergunta e informação para o usuario informa a senha e dica ao passar o mouse
         */
        JLabel lblsenha = new JLabel(" Senha : ");// mensagem pergunta pro usuario qual a senha
        JPasswordField txtsenha = new JPasswordField(30); // Tamanho da caixa de texto para senha
        txtsenha.setToolTipText("Informe a sua senha de acesso : "); // mensagem ao passar o mouse por cima
        /**
         * criando um botão de acesso após informações .
         */
        JButton btnlogin = new JButton(" LOGIN ");
        btnlogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (txtUsuario.getText().equals(USER) && new String(txtsenha.getPassword()).equals(PASS)) {
                    JOptionPane.showMessageDialog(frame, "Acesso permitido ");
                } else {
                    JOptionPane.showMessageDialog(frame, "Acesso negado ");
                }
            }
        });

        /**
         * Organizando as informações dentro da tela
         */

        panel.add(lblusuario);// 1- informação pro usuario
        panel.add(txtUsuario);// 2- caixa de texto

        panel.add(lblsenha);// 3- informação pro usuario qual a senha
        panel.add(txtsenha);// 4- caixa de entrada de senha

        panel.add(btnlogin);// 5-botao para entrada e confirmação

        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
