## Tarefa 005 - 10/06/2022 - Linguagens de Programação

1. Elaborar um pesquisa sobre linguagens de programação, abordar de forma generalizada os aspectos de pelo menos 5 linguagens. Abordar de forma mais específica as características de uma linguagem de sua preferência. Pode ser uma das cinco ou não.
2. O resultado desta pesquisa deverá ser um texto eaborado com suas próprias palavras explicitando seu entendimento acerca do conteúdo pesquisado.
Commitar no repositório pessoal até o dia 14/06.

## C#
C# é uma linguagem estáticamente tipada feita para propositos gerais e famosa por ser a principal linguagem do framework .NET, foi criada em 2000 
por Anders Hejlberg na Microsoft e foi pensada como um C moderno e orientada a objetos, no começo foi criticada por ser muito parecida com o Java,
mas aos poucos foi evoluindo e é uma das mais amadas nos dias de hoje. É usada para multipropósito como aplicativos desktop com .NET CORE, aplicativos para
celular cross-platform, aplicativos web com Blazer e jogos com framework da Unity. C# é orientado a objetos e possui Garbage Collector porém permite expressões
e funções lambda, além de permitir alocação dinamica com ponteiros é uma ótima linguagem para todos.

## Limbo
Limbo é uma linguagem de programação que foi desenvolvida pela Lucent Technologies Inc. para a execução de aplicações distribuídas de pouca escalabilidade.
Ele suporta programação modular, verificação de tipo forte em tempo de compilação e execução, comunicação entre processos em canais tipados, coleta automática de 
lixo e tipos de dados abstratos simples. Ele foi projetado para execução segura mesmo em máquinas pequenas sem proteção de memória de hardware.
Em sua implementação inicial para o sistema operacional Inferno, os objetos programados gerados pelo compilador Limbo são executados usando um interpretador para uma
máquina virtual. O Inferno e sua máquina virtual que o acompanha são executados de forma independente em hardware simples ou como um aplicativo em sistemas 
operacionais convencionais como Unix, Windows 95, Windows NT e Plan 9.

Um aplicativo Limbo consiste em um ou mais módulos, cada um dos quais fornece uma declaração de interface e uma parte de implementação. Um módulo que usa 
outro módulo inclui sua parte de declaração. Durante a execução, um módulo anexa outro módulo dinamicamente declarando o identificador de tipo do outro módulo e um 
local de onde carregar o código do objeto para sua implementação. Um exemplo: 

	implement Command;

	include "sys.m";
	include "draw.m";

	sys:	Sys;

	Command: module
	{
	    init: fn (ctxt: ref Draw->Context, argv: list of string);
	};
	# The canonical "Hello world" program, enhanced
	init(ctxt: ref Draw->Context, argv: list of string)
	{
		sys = load Sys Sys->PATH;
		sys->print("hello world\n");
		for (; argv!=nil; argv = tl argv)
			sys->print("%s ", hd argv);
		sys->print("\n");
	}


## Ruby
Ruby é uma linguagem dinâmica e interpretada que ficou famosa por levar a simplicidade e leitura de código (nível humano) ao extremo.
Ela foi concebida por "Matz" em 1993 com uma combinação de facilitadade de python e da real implementação de orientação a objetos como o smalltalk, mas
ela ficou famosa e realmente começou a ser usada com a criação do RubyOnRails, um sistema de Model-View-Controller, assim diminuindo a complexidade para fazer um app fullstack. Alguns dos exemplos que ele foi utilizado: Twitter, Github, airbnb entre outros.


## Lua - Linguagem escolhida para aprofundar
Lua é uma linguagem brasileira criada em 1993 na PUC-RIO, ela se caracteriza como multi-paradigma rápida de criação de script, para comparação ela é mais leve e fácil de aprender que Python, porém ela não fica pra trás em suas ferramentas, possui apenas uma estrutura de dados chamada Table, que representa um vetor árvores, dicionarios e mais, além de suportar corrotinas. Seus pacotes iniciais são simples existe um ecossistema chamado LUAROCKS que é bem grande e poderoso.
Os programas Lua não são interpretados diretamente do arquivo textual Lua, mas são compilados em bytecode, que é então executado na máquina virtual Lua. O processo 
de compilação normalmente é invisível para o usuário e é executado durante o tempo de execução, especialmente quando um compilador JIT é usado, mas pode ser feito 
offline para aumentar o desempenho de carregamento ou reduzir o consumo de memória do ambiente host, deixando de fora o compilador.
Lua é uma engine rápida e pequena que você pode facilmente embutir na sua aplicação. Lua tem uma API simples e bem documentada que permite uma integração forte com código escrito em outras linguagens. É simples estender Lua com bibliotecas escritas em outras linguagens. Também é simples estender programas escritos em outras linguagens com Lua. Lua é usada para estender programas escritos não só em C e C++, mas também em Java, C#, Smalltalk, Fortran, Ada, Erlang, e mesmo outras linguagens de script, como Perl and Ruby, além disso Lua é software livre de código aberto, distribuída sob uma licença muito liberal (a conhecida licença MIT). Lua pode ser usada para quaisquer propósitos, incluindo propósitos comerciais, sem qualquer custo ou burocracia. Basta fazer um download e começar a usa-lá.
O tipo de uma variável é assim determinado quando um script é executado e opcionalmente pode ser convertido para outro tipo. Não há problema em atribuir um número a uma variável e depois a uma string mais tarde no programa. No caso do tipo booleano, que aceita valores lógicos, false e nil são ambos falsos, enquanto uma string vazia ou 0 representam um valor verdadeiro. Isso é único e diferente do PHP, por exemplo, onde a atribuição de tipos arbitrários a valores lógicos tende a ser bastante caótica em vez de aderir a um método específico.

## Typescript
Typescript é uma linguagem de código aberto desenvolvida pela Microsoft, foi lançado para uso público em outubro de 2012, foi o resultado de dois anos 
de desenvolvimento com Anders Hejlsberg, o principal arquiteto de c#, bem como o criador do Delphi e do Turbo Pascal trabalhando também no projeto. que 
construída em cima do Javascript, que é muito difundido atualmente. Então esse “superset” foi criado para adicionar recursos de tipagem estáticas à linguagem 
original. JavaScript é uma linguagem dinâmica onde podemos fazer muitas coisas, como referenciar variaveis que não existem ou trabalhar com objetos sem uma cadeia, 
então ela é interpretada pelo browser só então que ela geraria erros no runtime, Typescript prevem esse tipo de erros extendendo o Javacript para uso forte de tipos.

O typeScript pode ser usado para desenvolver aplicativos JavaScript para execução do lado do cliente e do lado do servidor 
(como com Node.js ou Deno). Angular, em sua segunda versão, foi completamente reescrito por meio do TypeScript.
O teste cross-browser consiste em revisar e comparar as funcionalidades e estilos de aplicativos e sites em diferentes plataformas de navegação, 
dispositivos móveis e sistemas operacionais. Sua finalidade é identificar as divergências em cada um deles.
Nesse sentido, o TypeScript pode reduzir esse processo de teste, uma vez que ele garante a compatibilidade do JavaScript com todos os browsers que implementam os 
padrões ECMAScript 3 ou 5 ou para o commonjs. Logo, o desenvolvedor não tem a necessidade de repetir os códigos para diferentes navegadores.

# Meu entendimento sobre as pesquisa

Sobre o assuto pesquisado foi possivel perceber que mesmo sendo linguagens de programações na teoria com a mesma função de comunicar e enviar instruções para com o computador, elas são bastante diferentes. Nas minhas pesquisas eu escolhi 5 linguagens de programação para conhece-las e escolhi uma para me aprofundar, essas cinco foram: Ruby, C#, TypeScript, Limbo e a ultima e escolhi para pesquisar mais a fundo foi a Lua. TypeScript é uma espécie de JavaScript (linguagem interpretada de alto nível) porém tipada, já o Limbo por exemplo é uma linguagem de programação para escrever sistemas distribuidos, então quando vamos construir um software devemos pensar muito bem no que temos que fazer, qual o objetivo com o software, o que queremos alcançar? O foco é no alto nível ou baixo nível? É importante ter um garbage collector ou é estritamente necessário que o programador configure a alocação de memória? Pois dependendo das respostas dessas perguntas a linguagem que escolheremos pode mudar drásticamente. A engenharia de software e outros cursos similares são uns dos cursos com áreas mais abrangentes e complexas, existem muitas tecnologias que se atualizam dia pós dia para determinadas tarefas, como softwares de medicina ou de músicas, cada um com suas dependências e necessidades. No final é necessario um estudo grande sobre frameworks e é necessario uma grande adaptabilidade.