# Tarefa 011 - Padrões de Codificação (Leiaute e estilo), Reflexão e Programação defensiva - 08/07/2022

1. Fazer uma pesquisa sobre os três temas componentes do temas: **Padrões de Codificação**, **Reflexão** e **Programação Defensiva**:

## Texto

A organização do código fonte facilita os processos de desenvolvimento, retirada de bugs, atividades de validação e manutenção. Definir padrões é normal para que a equipe inteira escreva o código da mesma maneira. Quando definimos padrões e boas práticas, garantimos que todos da equipe conseguirão ter o mínimo de entendimento do código daquele projeto que está na empresa a tempos, e isso é importante porque se por acaso acontecer algum imprevisto com algum membro importante da equipe e a mesma tiver que se ausentar, outras pessoas DEVEM ser capazes de entender o código dessa pessoa para continuar o serviço normalmente.

Reflection é uma API que é usada para examinar ou modificar o comportamento de métodos, classes e interfaces em tempo de execução. A reflexão nos dá informações sobre a classe à qual um objeto pertence e também os métodos dessa classe que podem ser executados usando o objeto. Por meio da reflexão, podemos invocar métodos em tempo de execução, independentemente do especificador de acesso usado com eles. É importante quando: você precisa acessar atributos nos metadados do seu programa, para examinar e instanciar tipos em um assembly. Exemplo: 
```// Using Reflection to get information of an Assembly:
Assembly info = typeof(int).Assembly;
Console.WriteLine(info);
```

Programação defensiva é um conjunto de técnicas de projeto e programação objetivando a estabilidade e a segurança de um software independentemente de sua imprevibilidade. Técnicas de programação defensiva começaram a ser desenvolvidas quando sistemas de software começaram a possibilitar efeitos catastróficos, seja deliberadamente ou inadvertidamente.Um exemplo simples é verificar NULL depois de chamar malloc() e garantir que o programa lide com o caso normalmente.