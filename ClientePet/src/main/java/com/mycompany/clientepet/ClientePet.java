/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clientepet;

/**
 *
 * @author Aluno
 */
public class ClientePet {

    public static void main(String[] args) {
     Pet pet1 = new Pet("Lulu", 3, "Pooble");
     Cliente cliente = new Cliente("Larissa", 19, pet1);
     // Cliente cliente1 = new Cliente(nome:"Larissa", idade: 19, new Pet(nome: "Lulu", idade: 3, raca: "Pooble"));
     
        System.out.println("\nDados do Cliente: ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade() + " anos");
        System.out.println("\nDados do Pet: ");
        System.out.println("Nome: " + cliente.getPet().getNome());
        System.out.println("Idade : " + cliente.getPet().getIdade()+ " anos");
        System.out.println("Raça : " + cliente.getPet().getRaca());
       
    }   
}
