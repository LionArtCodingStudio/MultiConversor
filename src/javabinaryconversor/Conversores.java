/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabinaryconversor;

import java.util.ArrayList;

/**
 *
 * @author leoga
 */
public class Conversores {
        // conversor Decimal para Binario
        public static String dec_bi(String numero){
            String resB;
            String numStr = numero;
    
            double N = Double.parseDouble(numStr);
            //listas------------------------------------------------------------
            ArrayList<Double> divisores = new ArrayList<>();
            ArrayList<Integer> binario = new ArrayList<>();
            
            for(double i = 1; i <= N;i++){
                if (N%i==0){
                    divisores.add(i);
                } 
            }
            //converte para binario---------------------------------------------
            double tempnum = N;
            while (tempnum > 0){
                int sobra = (int)(tempnum % 2);
                binario.add(sobra);
                tempnum /=2;
            }
            //inverte os numeros para formar um binario-------------------------
            StringBuilder revBinarioStr = new StringBuilder();
            for (int i = binario.size() -1; i >= 0; i--){
                revBinarioStr.append(binario.get(i));
            }  
            //Lembrete
            //Exemplo numero 1812
            // - 1 e usado pois .size conta o tamanho do array a partir de 1
            // ele subtrai o valor a partir do index 11 até o 1 
            // mas o array começa a partir do index 0 e vai ate 10
            // no caso do numero 1812 a var binario retorna 00101000111 (x=nada)
            //  bits nao invertidos        = 0  0  1  0  1  0  0  0  1  1  1  x
            //                               ^  ^  ^  ^  ^  ^  ^  ^  ^  ^  ^  ^
            //index(local) no array        = 0  1  2  3  4  5  6  7  8  9  10 x
            //binario.size retorna         = x  1  2  3  4  5  6  7  8  9  10 11
            //                                  ^  ^  ^  ^  ^  ^  ^  ^  ^  ^
            //     sem subtrair ele para aqui-> 1  1  1  0  0  0  1  0  1  0  
            //         e como não existe index 11 no array ele começa aqui ^
            //se voce subitrai cada valor do binari.size por -1 ele fica assim
            //index(local) no array        = 0  1  2  3  4  5  6  7  8  9  10 
            //binario.size-1 retorna       = 0  1  2  3  4  5  6  7  8  9  10 
            //                               ^  ^  ^  ^  ^  ^  ^  ^  ^  ^  ^
            //bits nao invertidos          = 0  0  1  0  1  0  0  0  1  1  1
            //------------------------------------------------------------------
            //converte o array para string--------------------------------------
            String divisoresStr = String.join("-> ", 
                divisores.stream()
                        .map(Object::toString)
                            .toArray(String[]::new));
            
            String binarioStr = revBinarioStr.toString();
            if (binarioStr.contains("1")) {
                binarioStr = binarioStr.replaceFirst("^0+(?!$)", "");
            }
            resB=binarioStr;
            return resB;
            
    }
        public static String bi_dec(String numero){
            String resDec="";
          // em progresso  
            return resDec;
        }
}
