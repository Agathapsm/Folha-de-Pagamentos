package com.github.agpsm.folhadepagamentos.ui;
import com.github.agpsm.folhadepagamentos.core.*;

public class MainClass {
    public static void main(String[] args) {

        Funcionario folha[] = new Funcionario[8];
        folha[0] = new Chefe("Carlos Boss", 1234, 2500,15, 10000);
        folha[1] = new Comissionado("Joana Seller", 1235, 22, 3500);
        folha[2] = new Comissionado("Paula Seller", 1236, 20, 3500);
        folha[3] = new Horista("João Designer", 1237,70, 30);
        folha[4] = new Horista("Jennifer Architect", 1238,82.30f, 45);
        folha[5] = new Empreiteiro("Leo Contructor", 1239, 4500.0f);
        folha[6] = new Empreiteiro("Pedro Builder", 1240, 390.0f);
        folha[7] = new Empreiteiro("Keila Decorator", 1241, 4230);

        for( Funcionario f: folha) {
            System.out.println("+---------------------------------------------------------------+");
            System.out.println(String.format("| Registro: %-5d Nome: %-35s     |",
                    f.getNumero_registro(),
                    f.getNome_funcionario()));

            System.out.println(String.format("| Salário : R$ %-47.2f  |",
                    f.calcular_salario()));

            System.out.println("+---------------------------------------------------------------+");
        }
    }
}
