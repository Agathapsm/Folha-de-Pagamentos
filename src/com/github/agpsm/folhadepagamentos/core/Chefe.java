package com.github.agpsm.folhadepagamentos.core;

public class Chefe extends Funcionario {

    private float salario;
    private float adicional_funcao;
    private float beneficio;

    public Chefe(String nome_funcionario, int numero_registro, float adicional_funcao, float beneficio, float salario) {
        super(nome_funcionario, numero_registro);
        this.adicional_funcao = adicional_funcao;
        this.beneficio = beneficio;
        this.salario = salario;
    }

    public float getAdicional_funcao() {
        return adicional_funcao;
    }

    public void setAdicional_funcao(float adicional_funcao) {
        this.adicional_funcao = adicional_funcao;
    }

    public float getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(float beneficio) {
        this.beneficio = beneficio;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public float calcular_salario() {
        return this.salario + this.salario * this.adicional_funcao / 100 + this.beneficio;
    }
}
