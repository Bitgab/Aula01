/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clienteendereco;

/**
 *
 * @author Aluno
 */
public class ClienteEndereco {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua Salvador", 175, "Salvador");
      Cliente cliente = new Cliente("Fuboca", 23, endereco1);
     
        System.out.println("\nDados do cliente: ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade() + " anos");
        System.out.println("\nDados do endereço do cliente: ");
        System.out.println("Endereço : " + cliente.getEndereco().getLogradouro());
        System.out.println("Número : " + cliente.getEndereco().getNumero());
        System.out.println("Cidade : " + cliente.getEndereco().getCidade());
    }
}
