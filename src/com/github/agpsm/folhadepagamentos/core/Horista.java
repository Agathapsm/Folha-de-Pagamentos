package com.github.agpsm.folhadepagamentos.core;

public class Horista extends Funcionario {

    private int numero_de_horas;
    private float valor_hora;

    public Horista(String nome_funcionario, int numero_registro, float valor_hora, int numero_de_horas) {
        super(nome_funcionario, numero_registro);
        this.valor_hora = valor_hora;
        this.numero_de_horas = numero_de_horas;
    }

    public int getNumero_de_horas() {
        return numero_de_horas;
    }

    public void setNumero_de_horas(int numero_de_horas) {
        this.numero_de_horas = numero_de_horas;
    }

    public float getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(float valor_hora) {
        this.valor_hora = valor_hora;
    }

    @Override
    public float calcular_salario() {
        return this.numero_de_horas * this.valor_hora;
    }
}
