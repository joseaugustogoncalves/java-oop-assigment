package com.example;

public class Gestor extends Funcionario {
    private double bonus;

    public Gestor(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    // Implementar o método calcularSalario
}