#include <iostream>

int main()
{
    double IPI, codigo, valor1, quant1, valor2, quant2, resposta = 0;

    std::cout << "Digite o IPI, codigo, valor1, quanta1, valor2 e quant2: ";

    std::cin >> IPI >> codigo >> valor1 >> quant1 >> valor2 >> quant2 >> resposta;

    resposta = (valor1 * quant1) + (valor2 * quant2) * (IPI / 100 + 1);

    std::cout << resposta;
}