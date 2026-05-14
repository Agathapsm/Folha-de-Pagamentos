package com.github.agpsm.folhadepagamentos.core;

public abstract class Funcionario {
    protected int numero_registro;
    protected  String nome_funcionario;

    public Funcionario(String nome_funcionario, int numero_registro) {
        this.nome_funcionario = nome_funcionario;
        this.numero_registro = numero_registro;
    }

    //
    public abstract float calcular_salario();

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public int getNumero_registro() {
        return numero_registro;
    }

    public void setNumero_registro(int numero_registro) {
        this.numero_registro = numero_registro;
    }
}
