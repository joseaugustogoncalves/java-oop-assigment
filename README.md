# Exercício de Herança em Java: Funcionários, Gestores e Colaboradores

## Objetivo
Criar um sistema orientado a objetos em Java representando uma hierarquia de funcionários com diferentes cálculos de salário.

## Descrição
Neste exercício, você deve implementar:

1. Classe abstrata `Funcionario` com atributos `nome`, `cp` e `salarioBase`, além do método `calcularSalario()`.
2. Subclasse `Gestor` com um atributo extra, `bonus`, que afeta o cálculo do salário.
3. Subclasse `Colaborador` que implementa uma redução de 10% no salário base.
4. Na classe `Main`, crie objetos para testar o sistema.

Exemplo:  
Um `Gestor` com salário base de 5000,00€ e bônus de 20% deve receber 6000,00€.  
Um `Colaborador` com salário base de 3000,00€ deve receber 2700,00€.

Boa sorte!