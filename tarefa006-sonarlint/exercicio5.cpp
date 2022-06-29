#include <iostream>

int main()
{
    double salarioMin, salarioAtual, resultado;

    std::cout << "Insira o salario minimo e o seu salario atual: ";

    std::cin >> salarioMin >> salarioAtual;

    resultado = salarioAtual / salarioMin;

    std::cout << "o seu salario da: " << resultado << " salarios.";
}