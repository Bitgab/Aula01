/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Aluno
 */
public class Cliente extends Pessoa{
    private String dataCompra;
    private String formaDEPagamento;

    public Cliente(String dataCompra, String formaDEPagamento, String nome, int idade) {
        super(nome, idade);
        this.dataCompra = dataCompra;
        this.formaDEPagamento = formaDEPagamento;
    }

    public String getFormaDEPagamento() {
        return formaDEPagamento;
    }

    public void setFormaDEPagamento(String formaDEPagamento) {
        this.formaDEPagamento = formaDEPagamento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    
}
