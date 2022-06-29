#include <iostream>

int main()
{
    int num;

    std::cout << "Insira um numero: ";

    std::cin >> num;

    std::cout << "Antecessor: \n" << num - 1 << "Sucessor: " << num + 1;
}