# 💰 Folha de Pagamentos

Projeto desenvolvido em Java com foco na prática de Programação Orientada a Objetos (POO), simulando um sistema simples de folha de pagamentos de funcionários.

O sistema realiza cálculos relacionados aos pagamentos dos colaboradores, aplicando conceitos fundamentais da linguagem Java e reforçando a lógica de programação.

---

## 🚀 Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- IntelliJ IDEA
- Git & GitHub

---

## 📖 Sobre o Projeto

O projeto foi criado com o objetivo de praticar conceitos importantes da programação backend utilizando Java.

A aplicação simula o funcionamento básico de uma folha de pagamentos, permitindo trabalhar com informações de funcionários e cálculos salariais de forma organizada e orientada a objetos.

Durante o desenvolvimento, foram aplicados conceitos como:

- Classes e Objetos
- Encapsulamento
- Herança
- Polimorfismo
- Construtores
- Métodos
- Sobrescrita de métodos
- Organização em pacotes
- Lógica de cálculo

---

## 🏗️ Estrutura do Projeto

```bash
src
└── com.github.agpsm.folhadepagamentos
    ├── core
    │   ├── Funcionario.java
    │   ├── Chefe.java
    │   └── ...
    │
    └── ui
        └── MainClass.java
```

---

## 👨‍💼 Funcionalidades

✅ Cadastro de funcionários  
✅ Cálculo de salário  
✅ Exibição das informações dos funcionários  
✅ Organização utilizando POO  
✅ Simulação de folha de pagamento  

---

## 🔒 Conceitos de POO Utilizados

### Encapsulamento

Os atributos das classes foram protegidos utilizando modificadores de acesso e métodos getters/setters.

Exemplo:

```java
private double salario;

public double getSalario() {
    return salario;
}
```

---

### Herança

A herança permite reutilizar atributos e métodos de uma classe base em outras subclasses.

Exemplo:

```java
public class Gerente extends Funcionario
```

Nesse caso, a classe `Chefe` herda características da classe `Funcionario`.

---

### 🔁 Polimorfismo

O polimorfismo acontece quando subclasses alteram o comportamento de métodos da superclasse através da sobrescrita de métodos.

No projeto, isso acontece no método:

```java
calcularSalario()
```

Cada tipo de funcionário pode possuir uma forma diferente de calcular o salário.

Exemplo:

### Classe Funcionario

```java
public abstract float calcular_salario();
}
```

### Classe Chefe

```java
   @Override
    public float calcular_salario() {
        return this.salario + this.salario * this.adicional_funcao / 100 + this.beneficio;
    }
```

Assim, o mesmo método possui comportamentos diferentes dependendo do objeto, caracterizando o polimorfismo.

---

### Construtores

Utilização de construtores para inicializar os objetos no momento da criação.

```java
  public Funcionario(String nome_funcionario, int numero_registro) {
        this.nome_funcionario = nome_funcionario;
        this.numero_registro = numero_registro;
    }
```

---

### Métodos

Criação de métodos responsáveis pelos cálculos e exibição das informações dos funcionários.

```java
public float calcularSalario() {
    return salario;
}
```

---

## ▶️ Funcionamento

O sistema cria objetos de funcionários, realiza os cálculos salariais e exibe os dados no console.

Exemplo:

```java
 Funcionario folha[] = new Funcionario[2];
        folha[0] = new Chefe("Carlos Boss", 1234, 2500,15, 10000);
        folha[1] = new Comissionado("Joana Seller", 1235, 22, 3500);

         for( Funcionario f: folha) {
            System.out.println(String.format("| Registro: %-5d Nome: %-35s     |",
                    f.getNumero_registro(),
                    f.getNome_funcionario()));

            System.out.println(String.format("| Salário : R$ %-47.2f  |",
                    f.calcular_salario())); }
```

---

## 💻 Exemplo de Saída

```bash
+---------------------------------------------------------------+
| Registro: 1234  Nome: Carlos Boss                             |
| Salário : R$ 260015,00                                        |
+---------------------------------------------------------------+
```

---

## 📚 Conceitos Praticados

✅ Java  
✅ Programação Orientada a Objetos  
✅ Encapsulamento  
✅ Herança  
✅ Polimorfismo  
✅ Métodos  
✅ Construtores  
✅ Lógica de Programação  
✅ Organização em Pacotes  

---

## 👩‍💻 Desenvolvedora

Feito por Ágatha Paiva 💜

Projeto no GitHub:  
https://github.com/Agathapsm/Folha-de-Pagamentos
