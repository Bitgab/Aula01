/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancariafuncionario;

/**
 *
 * @author Aluno
 */
public class ContaBancariaFuncionario {

    public static void main(String[] args) {
      Endereco endereco  = new Endereco("Rua Salvador", 175, "Salvador");
      ContaBancaria contabancaria = new ContaBancaria("Inter", 1234, 12345678, "Corrente", 5000.00, 4890.00);
      Funcionario funcionaros = new Funcionario(12, "Fuboca", endereco, "(71) 91234-5678", "senaidendezeiro@gmail.com", contabancaria);
    
        System.out.println("\nDados do Funcionario: ");
        System.out.println("Nome: " + funcionaros.getNome());
        System.out.println("Logradourob: " + funcionaros.getEndereco().getLogradouro());
        System.out.println("Número do imóvel: " + funcionaros.getEndereco().getNumero());
        System.out.println("Cidade: " + funcionaros.getEndereco().getCidade());
        System.out.println("Telefone: " + funcionaros.getTelefone());
        System.out.println("E-mail: " + funcionaros.getEmail());
        System.out.println("\nDados Conta Bancária: ");
        System.out.println("Banco:  " + funcionaros.getContabancaria().getBanco());
        System.out.println("Agência: " + funcionaros.getContabancaria().getAgencia());
        System.out.println("Número da conta: " + funcionaros.getContabancaria().getNumeroDaConta());
        System.out.println("Tipo da conta:  " + funcionaros.getContabancaria().getTipoDaConta());
        System.out.println("Saldo atual: " + funcionaros.getContabancaria().getSaldoAtual());
        System.out.println("Limite disponível: " + funcionaros.getContabancaria().getLimiteDisponivel());
      
      
    }
    
}
