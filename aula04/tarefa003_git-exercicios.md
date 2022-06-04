### Tarefa 003: Git Exercícios - 03/06/2021

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.

1. Qual o comando para obter a versão instalada do Git?
```
git --version
```
2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help
```
Mostra uma lista com os principais comandos do git e o que eles fazem.
```
  b. git help checkout

```
  R = Abre uma página explicando o que é o checkout do git, atualiza os arquivos na árvore de trabalho para corresponder à versão no índice ou na árvore especificada.
```
  c. git help merge
```
Abre uma página explicando o que é o merge do git, incorpora as alterações dos commits nomeados (desde o momento em que seus históricos divergiram da ramificação atual) na ramificação atual.
```
  d. git init
```
O comando git init cria um novo repositório do Git. Ele pode ser usado para converter um projeto existente e não versionado em um repositório do Git ou inicializar um novo repositório vazio.
```
  e. git add --all
```
  R = Coloca todos arquivos (novos, modificados e removidos) no index/stage.
```
  f. git add -u
```
  R = Coloca no Stage apenas arquivos modificados e removidos.
```
  g. git config -l
```
Lista todas as configurações do git (git config --list).
```
  h. git mv a.txt b.txt
```
Altera o nome de um arquivo.txt de a para b.
```
  i. git reset --hard
```
reseta o commits realizados, passando a exibir apenas o último.
```
  j. git log -27
```
Mostra os últimos 27 commits.
```
1. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
```
git add
git commit
```
2. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
```
git diff
```
3. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
```
git status --u
```
4. Qual o comando para efetuar um _commit_?
```
git commit -m "comment"
```
5. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
```
git reset teste.txt
```
6. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
```
Deve-se adicionar o nome do diretório em um arquivo .gitignore
```
7. O que acontece se o seu repositório local for acidentalmente removido?
```
Devemos usar o comando git clone, pois ainda estará no git.
```
8.  Como clonar um repositório remoto?
```
git clone [<url>](https://github.com/ItsMatt1/cs-2022-1)
```
9.  Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
```
git log --pretty=oneline
```
10. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
```
.git
```
11. Qual o comando para criar um repositório local?
```
git init
```
12. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
```
O nome fica o mesmo da pasta que está no momento.
```
13. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
```
git add -all
```
14. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
```
A sigla "SHA" significa secure hash algorithm (algoritmo de hash seguro), o SHA1 embaralha determinado arquivo para que seja gerado um conjunto de caracteres identificadores, caracteres esses únicos que possuem 40 dígitos, isso é muito útil pois qualquer coisa modificada se tem um conjunto diferente.
```
15. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
```
-abbrev-commit
```
16. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
```
Não, o git add -u adiciona somente os já trackeados, não de novos arquivos.
```
17. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
```
O primeiro comando retorna o repositório para o último commit, mas mantem os últimos arquivos no stage. 
O segundo comando mostra o último commit feito.
```
1.  Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
```
git clean -f
```
2.  Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
```
.gitignore
```
3.  Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
```
Adicione `*.class` no .gitignore
```
4.  jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
5.  No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
```
O comando git shortlog mostra uma versão menor do git log. 
As opções -sne mostram o número de commits do participante, 
classifica a lista de autores pelo número de commits e exibem o e-mail de cada autor.
```
25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
```
É exibido uma lista de links para o repositorio remoto.
```
26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
```
git tag
```
27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
```
git tag -l "2.0"
```
28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
```
Cria uma tag 3.4-gold e adiciona o comentario "minha versão ouro".
```
29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
```
Mostra os dados da tag junto com o commit.
```
30. O que o comando **git push origin 3.4-gold** teria como efeito?
```
Publicar o versionamento dessa tag.
```
31. Após executar um commit, qual o efeito de **git commit --amend**?
```
Substitui o commit anterior e a mensagem do commit novo é usada como a antiga, ao invés de uma mensagem vazia.
```
32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
```
Remove o arquivo x.txt da lista pra commmit.
```
33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
```
Desfaz as alterações feitas no arquivo na sua maquina mesmo antes do commit.
```
34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
```
O git checkout vai descartar todas as mudanças do último commit.
```
35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.
</DIV/>
