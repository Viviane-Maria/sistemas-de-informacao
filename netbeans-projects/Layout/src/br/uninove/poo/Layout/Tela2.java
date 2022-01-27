package br.uninove.poo.Layout;
import java.awt.BorderLayout;
import javax.swing.*;
 
public class Tela2 extends JFrame {
 
    //Atributos locais
    private JButton btnCentro, btnLeste, btnOeste, btnNorte, btnSul;
 
    //Construtor:
    public Tela2() {
        setTitle("Exemplo com Border Layout");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 200);
        setLocation(300, 200);
        btnCentro = new JButton("Centro");
        add(btnCentro, BorderLayout.CENTER);
        btnLeste = new JButton("Leste");
        add(btnLeste, BorderLayout.EAST);
        btnSul = new JButton("Sul");
        add(btnSul, BorderLayout.SOUTH);
        btnNorte = new JButton("Norte");
        add(btnNorte, BorderLayout.NORTH);
        btnOeste = new JButton("Oeste");
        add(btnOeste, BorderLayout.WEST);
    }
}