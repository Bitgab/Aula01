/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Aluno
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        Cliente clientes = new Cliente("14/08/2024", "Cartão de Débito", "Fuboca", 23);
        Funcionario funcionarios1 = new Funcionario("1212", "MastClass", 10000, "Rafael", 23);
        
        System.out.println("\nDados da Pessoa: ");
        System.out.println("Nome: " + clientes.getNome());
        System.out.println("Idade: " + clientes.getIdade() + " anos");
        
        System.out.println("\nDados do Cliente: ");
        System.out.println("Data do pagamento: " + clientes.getDataCompra());
        System.out.println("Forma de pagamento: " + clientes.getFormaDEPagamento());
        
        System.out.println("\nDados do Funcionario: ");
        System.out.println("Nome: " + funcionarios1.getNome());
        System.out.println("Idade: " + funcionarios1.getIdade() + " anos");
        System.out.println("Matricula: " + funcionarios1.getMatricula());
        System.out.println("Cargo: " + funcionarios1.getCargo());
        System.out.println("Salário: " + funcionarios1.getSalario());
        
    }
}
