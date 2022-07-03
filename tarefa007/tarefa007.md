# Tarefa 007 - 24/06/2022

1. Considere as seguintes referências utilizadas nas aulas dos dias 20 e 25/08/2021:
   1.1 - [Fatores de qualidade na programação.](https://www.devmedia.com.br/fatores-de-qualidade-na-programacao/29780)
   1.2 [Qualidade do código e sua importância para um desenvolvimento bem sucedido.](https://bring.com.br/blog/2019/09/10/qualidade-do-codigo-e-sua-importancia-para-um-desenvolvimento-bem-sucedido/)
   1.3 [Porque a qualidade de código é importante?](https://ezdevs.com.br/porque-a-qualidade-de-codigo-e-importante/)
     1.4 [Princípios para produzir um código bonito.](https://www.profissionaisti.com.br/principios-para-produzir-um-codigo-bonito/)
   1.5 [6 dicas fundamentais para um código de qualidade.](https://www.youtube.com/watch?v=MMAu_1KMcMA)
   1.6 [6 Questões para a Qualidade do Código.](https://vizir.com.br/2016/09/6-questoes-para-a-qualidade-do-codigo-ruby-conf-br-4/)
   1.7 [DevQA: Como medir qualidade de código?](https://kamillaqueiroz.medium.com/devqa-como-medir-qualidade-de-código-6149fada1e)
   1.8 [Como melhorar o gerenciamento do código fonte?](https://gaea.com.br/como-melhorar-o-gerenciamento-de-codigo-fonte/)

2. Elaborar um texto sobre um deles, destacando:
    2.1 - A idéias principais do texto;
    2.2 - O que é novidade para você, em relação ao conteúdo do artigo;
    2.3 - O que já era conhecido por você.
3. Escrever um parágrafo com suas palavras comentando o contéudo do artigo.

---------------------------------------------------------------------------------------------------------------------------------------

A referência escolhida foi a 1.5, vídeo do Filipe Deschamps, conhecido engenheiro de software que tem um canal no youtube comentando sobre vários tipos de conteúdos
como Design patterns, técnologias da moda para se usar entre muitas outas coisas como clean code, que no caso é o que eu escolhi para fazer um texto.
Nesse vídeo intitulado "6 dicas fundamentais para um código de qualidade" Felipe separa alguns tópicos importantes para se ter um clean code e porque isso é importante, como se diz no livro "Clean Code" de Robert Cecil Martin: "Mesmo um código ruim pode funcionar. Mas se ele não for limpo, pode acabar com uma empresa de desenvolvimento. Perdem-se a cada ano horas incontáveis e recursos importantes devido a um código mal escrito". Muitas vezes pensamos que quanto mais rápido escrevermos o código mais coisas serão entregues, porém na verdade quanto mais rápido lermos um código, mais coisas serão entregues. Um principio que o autor do vídeo comenta na dica #1 é o Princípio dos quatro olhos, onde 2 pares de olhos sempre trabalharão melhor que 1 par, essa técnica já é usada no meu trabalho onde para realizarmos um PR (Pull Request) é necessario via Gitlab abrir um Merge Request da branch que foi trabalhada para a branch de development onde apenas uma pessoa que não é dona da branch trabalhada pode analisar e aceitar o PR, assim o código que no caso eu escrevi, passa pelos olhos de outra pessoa também do projeto antes de ir para a main, evitando muito retrabalho e corrigindo possiveis problemas antes de se tornarem de fato problemas. Outra coisa comentada no vídeo, durante a dica #2 que eu não conhecia era o CI (continuous integration) que seria, antes de uma branch realizar o merge para a main passar por uma build de sérios de testes automatizados para que se em algum teste falhar, não seja possivél realizar o merge, é importante também sempre cuidar para que esses testes sejam realizados em um ambiente separado para que os testes não se viciem. O vídeo fala bastante sobre tópicos que toda empresa séria deve ter para que a produção seja o menos espaguete possível e se der problema em alguma parte do código que seja somente daquela parte, para que seja possível separar e resolver esse problema sem afetar em mais nada nos outros componente, foi bastante informativo e sinto que aprendi bastante com o vídeo!