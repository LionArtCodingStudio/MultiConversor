/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javabinaryconversor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author leoga
 */
public class JavaBinaryConversor extends Conversores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        //Criar o frame------------------------------
        JFrame frame = new JFrame();
        
        frame.setSize( 420, 420);
        frame.setTitle("Java Conversor - VER 0.1");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	frame.setResizable(false);
	frame.setVisible(true);
        //__________________________________________
        //conversão de decimal para binario
        JLabel conv_dec_bi = new JLabel("Decimal => Binario");
        conv_dec_bi.setBounds(15,2,200,  15   );
        frame.add(conv_dec_bi);
        conv_dec_bi.setVisible(true);
        
        //input do usuario (decimal)----------------
        //label
        JLabel lbNum = new JLabel("Coloque um numero: ");
        lbNum.setVisible(true);
        lbNum.setBounds(15,15,200,  15   );
        frame.add(lbNum);
        //Campo de texto
        JTextField txtNumero = new JTextField();
        txtNumero.setBounds(15,30,165,  15);        
        frame.add(txtNumero);   
        
        //------------------------------------------
        //output resultado (Binario)
        //label
        JLabel lbBinario = new JLabel("Binario => ");
        lbBinario.setBounds(15,60,100,  15   );
        frame.add(lbBinario);
        lbBinario.setVisible(true);
        //Campo de texto
        JTextField resultado = new JTextField();
        resultado.setEditable(false);
        resultado.setBounds(80,60,100,  15);
        frame.add(resultado);
        //------------------------------------------
        //Botão comfirmar converção
        JButton converter = new JButton("converter");
        converter.setBounds(15,45,165,15);
        converter.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               resultado.setText("");
               String result = dec_bi(txtNumero.getText());
               resultado.setText(result);
               System.out.println("Resultado = "+result);
            }
        });
        frame.add(converter);
        
        
        
        
    }
    
}
