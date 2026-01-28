package com.example;

public class Colaborador extends Funcionario {
    public Colaborador(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    // Implementar o método calcularSalario
    @Override
    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * 0.10);
    }
}