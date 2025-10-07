package pilasenteros;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PilaEnteros {
    private JPanel Ventana;
    private JTextField txtDato;
    private JButton btnIngresar;
    private JTextArea txtAMostrar;
    private JButton btnDesempilar;
    private JButton btnSeek;

    Pila numeros = new Pila();

    public PilaEnteros(){

        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros.push(Integer.parseInt(txtDato.getText()));
                txtDato.setText("");
                System.out.println(numeros.getPila());
                txtAMostrar.setText(numeros.toString());
            }
        });
        btnDesempilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + numeros.pop());
                    System.out.println(numeros.getPila());
                    txtAMostrar.setText(numeros.toString());
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        btnSeek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null, "El elemento en la cima es: " + numeros.peek());
                    System.out.println(numeros.getPila());
                    txtAMostrar.setText(numeros.toString());
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PilaEnteros");
        frame.setContentPane(new PilaEnteros().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}