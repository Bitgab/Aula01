/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula1;


import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Aula1 {
    static double parcela = 10;
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
       
         // Solicitando dados ao usuário.-
        System.out.println("Digite o valor do produto: ");
        double produto = ent.nextDouble();
        
        while (parcela < 0 || parcela > 5){
        System.out.println("Quantas vezes você quer parcela o produto:  ");
        }
        // Calculo da parcela.
        double valorparcela = produto / parcela;
        
        
        // Exibindo Resultado.
        System.out.println(" Valor do produto: R$ " + produto );
        System.out.println("Valor da parcela " + parcela +  "x de " + "R$:" + valorparcela + " sem juros");
        System.out.println("Mercado Mamão com açúcar ");
    }
}
