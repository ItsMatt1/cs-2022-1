#include <iostream>

int main()
{
    std::cout << "Media aritmetica entre 8, 9 e 7: " << (8 + 9 + 7) / 3 << std::endl;
    std::cout << "Media aritmetica entre 4, 5 e 6: " << (4 + 5 + 6) / 3 << std::endl;
    std::cout << "A soma das medias eh: " << ((4 + 5 + 6) / 3) + ((8 + 9 + 7) / 3) << std::endl;
    std::cout << "A media das medias eh: " << (((4 + 5 + 6) / 3) + ((8 + 9 + 7) / 3)) / 2.0 << std::endl;
}