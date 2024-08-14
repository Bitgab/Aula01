/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetopet;

/**
 *
 * @author Aluno
 */
public class ProjetoPet {

    public static void main(String[] args) {
       Pet pet = new Pet("Lulu", 3, "Pooble", "Pequeno", "Ração,porte pequeno");
   
       System.out.println("Nome: " + pet.getNome());
       System.out.println("Idade: " + pet.getIdade() + " anos");
       System.out.println("Raça: " + pet.getRaca());
       System.out.println("Porte: " +  pet.getPorte());
       System.out.println("Alimentação: " +  pet.getAlimentacao());
    }
}
