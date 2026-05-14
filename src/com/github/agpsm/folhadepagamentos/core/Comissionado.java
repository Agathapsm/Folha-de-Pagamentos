package com.github.agpsm.folhadepagamentos.core;

public class Comissionado extends Funcionario{

    private float salario;
    private float comissao;

    public Comissionado(String nome_funcionario, int numero_registro, float comissao, float salario) {
        super(nome_funcionario, numero_registro);
        this.comissao = comissao;
        this.salario = salario;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public float calcular_salario() {
        return this.salario + this.salario * this.comissao / 100;
    }
}
