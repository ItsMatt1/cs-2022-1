#include <iostream>

int main()
{
    int dia, mes, ano, resultado;

    printf("Insira o ano mes e dia:");

    std::cin >> ano >> mes >> dia;

    resultado = dia + (mes * 30) + (ano * 365);

    std::cout << "O resultado eh: " << resultado;
}