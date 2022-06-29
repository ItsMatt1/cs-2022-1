#include <iostream>

int main()
{
    int salario;

    std::cout << "Insira o valor do saldo: " << std::endl;

    std::cin >> salario;

    std::cout << "O valor com o reajuste fica de: " << salario * 1.15 << std::endl;
}