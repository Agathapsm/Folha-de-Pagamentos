package com.github.agpsm.folhadepagamentos.core;

public class Empreiteiro extends Funcionario{

    private float valor_empreita;

    public Empreiteiro(String nome_funcionario, int numero_registro, float valor_empreita) {
        super(nome_funcionario, numero_registro);
        this.valor_empreita = valor_empreita;
    }

    public float getValor_empreita() {
        return valor_empreita;
    }

    public void setValor_empreita(float valor_empreita) {
        this.valor_empreita = valor_empreita;
    }

    @Override
    public float calcular_salario() {
        return this.valor_empreita;
    }
}


