# Tarefa 011 - Padrões de Codificação (Leiaute e estilo), Reflexão e Programação defensiva - 08/07/2022

1. Fazer uma pesquisa sobre os três temas componentes do temas: **Padrões de Codificação**, **Reflexão** e **Programação Defensiva**:

  1.1. Sugestão de links para a pesquisa sobre Padrões de Codificação:

    1.1.1 [Link 1](https://www.devmedia.com.br/padroes-de-codificacao/16529);

    1.1.2 [Link 2](https://www.cin.ufpe.br/~rls2/processo_tg/Metodologia%20S&B/guidances/concepts/coding_standard_C98B0B0.html)

    1.1.3 [Link 3](https://micreiros.com/padroes-de-codificacao-no-desenvolvimento-de-sistemas/)

    1.1.4 [Link 4](https://tableless.com.br/introducao-a-padroes-de-codificacao/)

  1.2 Sugestão de links para a pesquisa sobre Reflexão:

    1.2.1 (Link 1)[https://www.howtogeek.com/devops/what-is-reflection-in-programming/]

    1.2.2 (Link 2)[https://dev.to/chris_bertrand/coding-concepts---reflection-4d2c]

    1.2.3 (Link 3)[https://docs.microsoft.com/pt-br/dotnet/csharp/programming-guide/concepts/reflection]

    1.2.4 (Link 4)[https://www.geeksforgeeks.org/reflection-in-java/]

  1.3. Sugestão de links para a pesquisa sobre programação defensiva:

    1.3.1 (Link 1)[https://medium.com/mindminerstechblog/protegendo-seu-c%C3%B3digo-dos-usu%C3%A1rios-e-de-voc%C3%AA-mesmo-com-programa%C3%A7%C3%A3o-defensiva-e-ofensiva-8b7218a8b975]

    1.3.2 (Link 2)[https://oque-e.com/o-que-e-programacao-defensiva/]

    1.3.3 (Link 3)[https://www.youtube.com/watch?v=Fd1XrX5hFD0]

2. Ao final da pesquisa, um texto deverá ser elaborado (no formato _markdown (md)_). Deste texto deverá constar:

  2.1 - A definição de cada um destes conceitos;

  2.2 - Um descrição de quando, onde e porque utilizá-lo e

  2.3 - Um exemplo de utilização.


## Texto

A organização do código fonte facilita os processos de desenvolvimento, retirada de bugs, atividades de validação e manutenção. Definir padrões é normal para que a equipe inteira escreva o código da mesma maneira. Quando definimos padrões e boas práticas, garantimos que todos da equipe conseguirão ter o mínimo de entendimento do código daquele projeto que está na empresa a tempos, e isso é importante porque se por acaso acontecer algum imprevisto com algum membro importante da equipe e a mesma tiver que se ausentar, outras pessoas DEVEM ser capazes de entender o código dessa pessoa para continuar o serviço normalmente.

Reflection é uma API que é usada para examinar ou modificar o comportamento de métodos, classes e interfaces em tempo de execução. A reflexão nos dá informações sobre a classe à qual um objeto pertence e também os métodos dessa classe que podem ser executados usando o objeto. Por meio da reflexão, podemos invocar métodos em tempo de execução, independentemente do especificador de acesso usado com eles. É importante quando: você precisa acessar atributos nos metadados do seu programa, para examinar e instanciar tipos em um assembly. Exemplo: 
```// Using Reflection to get information of an Assembly:
Assembly info = typeof(int).Assembly;
Console.WriteLine(info);
```

Programação defensiva é um conjunto de técnicas de projeto e programação objetivando a estabilidade e a segurança de um software independentemente de sua imprevibilidade. Técnicas de programação defensiva começaram a ser desenvolvidas quando sistemas de software começaram a possibilitar efeitos catastróficos, seja deliberadamente ou inadvertidamente.
**INSTRUÇÕES**
1. A entrega deve ser feita no seu repositório pessoal, utilizado para a disciplina, dentro de uma pasta chamada **tarefa011**.
2. O prazo para entrega desta tarefa é as 23h59min do dia 08/07/2022, as 23h59min.
