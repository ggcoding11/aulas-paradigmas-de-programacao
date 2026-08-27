# trabalho-aula-2-munif
Trabalho da Aula 2 do Professor Munif

Lista de exercícios
Evolução das Principais Linguagens de Programação
20 questões autorais baseadas no capítulo 2; não reproduzem exercícios da bibliografia.
1. A genealogia das linguagens não é uma escada de progresso.
Explique essa afirmação e apresente dois fatores históricos que fazem uma linguagem influenciar outra sem necessariamente substituí-la.
Objetivos: obj01, obj05 · Referência: Sebesta, cap. 2, páginas PDF 50, 51.

R:  A afirmação destaca que o desenvolvimento de linguagens de programação não é linear. Uma nova linguagem não é intrinsecamente superior a uma mais antiga, sobretudo quando possuem domínios distintos, como o desenvolvimento web em comparação ao ambiente acadêmico. Conforme abordado na página 51 do livro, o Fortran exerceu forte influência no meio acadêmico, servindo de base e inspiração para reuniões que definiram parâmetros para a criação de novas linguagens voltadas ao contexto universitário.

2. Plankalkül não foi implementada em sua época. Ainda assim, por que ela é relevante para a história das linguagens? Cite três recursos antecipados por seu projeto e explique o valor de um deles.

R: No momento de sua criação, Plankalkül era a mais completa de sua época, sendo um marco revolucionário para as linguagens e tendo influenciado linguagens de programação até hoje. O Plankalkül se destacou principalmente por conta de seu avanço na área de estrutura de dados, pois passou a adotar como tipo de dado mais básico o bit para representar número inteiro e de pontos flutuantes, além de utilizar estruturas avançadas para dar maior eficiência ao armazenamento de memória, como, por exemplo, o “Bit oculto”. Em binário, é uma convenção se utilizar o número 1 antes de informar de fato o dado. Com essa estrutura de bit oculto, a linguagem já assume que a frente do número em binário já possui um número “1”, por exemplo. Dessa forma, o sistema salvaria espaço de um bit para que seja utilizado novamente. O Plankalkül também se destacava no quesito expressões matemáticas, pelas quais era importante, pois a linguagem permitia a verificação de relacionamentos atuais nas variáveis do programa, dessa forma permitindo que o sistema verificasse metodologicamente o ponto que a expressão matematica é verdadeira, pois, caso não fosse, isso resultaria em um erro lógico.
Objetivos: obj01, obj02 · Referência: Sebesta, cap. 2, páginas PDF 52, 53.

3. Compare Short Code, Speedcoding e os sistemas A-0/A-1/A-2 quanto ao problema enfrentado e à estratégia adotada. Por que chamá-los simplesmente de compiladores modernos seria impreciso?
Objetivos: obj01, obj02 · Referência: Sebesta, cap. 2, páginas PDF 53, 56.

R:  As 3 citadas foram maneiras de implementar uma programação de alto nível, visto que a linguagem de máquina era muito trabalhosa de utilizar e suscetível a muitos erros. Os três trouxeram abordagens primitivas para interpretar ou compilar “código de alto nível” para linguagem de máquina. Sobre o Short Code, a linguagem era implementada com um interpretador puro, o que fazia a execução demorar muito, mesmo facilitando a escrita. Sobre o SpeedCoding, também era interpretada, porém, muito pesado, tanto que não sobrava muita memória restante após carregar o interpretador. Já os A-0/A-1/A-2, o código de alto nível era “compilado” em subrotinas de linguagem de máquina. Não era exatamente uma compilação como conhecemos hoje, mas já era um começo.

4. Explique por que o projeto Fortran precisou convencer
programadores de que código traduzido podia competir com código de máquina escrito à mão. Relacione desempenho, custo de programação e adoção.

R: Para compreender a necessidade do Fortran em convencer os programadores, é preciso analisar o contexto histórico da década de 1950. Naquela época, o hardware era extremamente dispendioso, fazendo com que o tempo de processamento da máquina fosse mais valorizado do que o tempo investido pelo programador. Por esse motivo, os projetos de software priorizavam a máxima velocidade de execução, o que representava um grande desafio para a aceitação do Fortran. Antes do surgimento do Fortran, as linguagens existentes geravam códigos lentos, alimentando um preconceito contra o uso de linguagens de alto nível. Sob a ótica financeira, a programação tradicional era muito onerosa devido ao tempo excessivo exigido para desenvolver diretamente em linguagem de máquina, o que elevava substancialmente os custos do processo. A adoção do Fortran proporcionou o equilíbrio ideal entre esses fatores: reduziu consideravelmente os custos do desenvolvimento de software sem comprometer de forma significativa a eficiência e a velocidade de compilação. O desempenho era uma prioridade tão fundamental para os criadores do Fortran que eles dedicaram grandes esforços na otimização do compilador.
Objetivos: obj01, obj02, obj04 · Referência: Sebesta, cap. 2, páginas PDF 56, 60.


5. Lisp surgiu em um contexto diferente de Fortran. Compare os
domínios, a representação de dados e o estilo de computação
favorecido pelas duas linguagens.
Objetivos: obj02, obj03 · Referência: Sebesta, cap. 2, páginas PDF 61, 65.

R:  O Fortran surgiu em um momento de transição: muitos programadores estavam insatisfeitos com a lentidão da interpretação. Nesse sentido, o Fortran foi a primeira linguagem de alto nível compilada. Já o Lisp foi diferente: foi desenvolvida numa época em que estava crescendo o interesse por I.A. Além disso, a linguagem também adicionou algumas coisas que não existiam em outras linguagens da época. O Lisp trabalha com estruturas de dados, como átomos e listas. Já o Fortran trabalhava com inteiro e ponto flutuante. O Lisp era funcional, já o Fortran era procedural no início.

15. A primeira aplicação de Java não foi a Web, mas a Web impulsionou sua adoção. Explique como mudanças de contexto podem reposicionar uma linguagem.
R: Uma linguagem de programação pode ser descoberta como eficiente para outras questões quando surge um ecossistema que permite que essa linguagem atue de melhor forma, utilizando as próprias implementações da linguagem sem necessidade de uma mudança massiva de funções. O caso do Java ser utilizado em aplicações WEB se deve à sua funcionalidade de applets Java, um recurso que utiliza programas muito leves, o que tornou o Java uma potência web inquestionável. Então, uma linguagem não precisa necessariamente ser criada para um propósito e só servir para um único propósito; elementos de sua criação podem ser difundidos e aproveitados também por outras áreas.

16. Compare Perl, JavaScript, PHP, Python, Ruby e Lua usando três
eixos: domínio inicial, estruturas de dados e estratégia de
implementação. Evite concluir que todas são iguais por serem
chamadas de scripting.
Objetivos: obj01, obj03 · Referência: Sebesta, cap. 2, páginas PDF 107, 113.

R:  Domínio: Perl é imperativa. JavaScript é multiparadigma. PHP é multiparadigma. Python é multiparadigma. Ruby é orientado a objeto. Lua é multiparadigma. Estruturas de dados: Perl possui vetores com tamanhos dinâmicos e que podem ter espaços em branco no meio. Em JavaScript, as cadeias de caracteres e os vetores têm tamanho dinâmico. Os vetores em PHP são uma combinação dos vetores de JavaScript e das dispersões em Perl. Em Python, em vez de vetores, inclui três tipos de estruturas de dados: listas; listas imutáveis, chama-
das de tuplas; e dispersões, chamadas de dicionários. Em Ruby, cada valor de dados é um objeto e todas as operações são feitas por meio de chamadas a métodos. Como estrutura de dados, Lua possui só uma: tabela. Estratégia de implementação: Perl é híbrido. JavaScript é interpretado. PHP é interpretado. Python é híbrido. Ruby é interpretado. Lua é híbrido.


6. Avalie três contribuições de ALGOL 60 que ultrapassaram sua
adoção comercial. Por que uma linguagem pode ser muito influente sem dominar o mercado?
R: Algol revolucionou o mercado com algumas práticas muito importantes e presentes até hoje, como, por exemplo, a sua estruturação de códigos baseados em blocos, o que dava livre acesso a alocação de variáveis locais, outra de suas práticas que foram adotadas.

Objetivos: obj02, obj04 · Referência: Sebesta, cap. 2, páginas PDF 66, 71.
7. COBOL foi desenhada para processamento comercial. Mostre como domínio e público influenciaram sua legibilidade, seus registros e sua
relação com FLOW-MATIC.
R:  A linguagem Flow-matic foi a primeira linguagem que mostrou que a sintaxe das linguagens deveriam ser escritas em inglês para melhorar a legibilidade dos códigos, onde o COBOL bebeu muito dessa influência em sua criação. Feita no pentágono em uma reunião feita pelo ministério da defesa americano. Na sua legibilidade, por ser em inglês, não pensava somente no programador, mas também no gerente, isso ajudou a impulsionar a linguagem no meio comercial, além disso o COBOL criou o meio em que tivemos os registros hierárquicos.
Objetivos: obj01, obj02, obj04 · Referência: Sebesta, cap. 2, páginas PDF 72, 76.
8. Compare Basic e PL/I como respostas ao desejo de ampliar o acesso ou o alcance da programação. Qual compromisso de projeto aparece em cada caso?
R: BASIC e PL/I surgiram na década de 1960 para expandir a programação, mas com abordagens totalmente opostas. O BASIC focou em ampliar o acesso, sendo desenhado para democratizar a computação e permitir que iniciantes e estudantes não técnicos pudessem programar facilmente. Seu compromisso de projeto foi sacrificar o desempenho computacional e os recursos avançados de estruturação de código em favor da extrema simplicidade, o que facilitava o aprendizado, mas frequentemente gerava códigos desorganizados. Por outro lado, o PL/I focou em ampliar o alcance, tentando unificar os domínios científico (que usava Fortran) e comercial (que usava COBOL) em uma única linguagem "faz-tudo" para os computadores da IBM. Seu compromisso de projeto foi sacrificar a simplicidade e a viabilidade do compilador em troca de uma abrangência total, resultando em uma linguagem gigantesca, excessivamente complexa para os programadores aprenderem e extremamente difícil de ser implementada de forma eficiente. 
Objetivos: obj01, obj04 · Referência: Sebesta, cap. 2, páginas PDF 77, 79.

20. Estudo de caso: uma equipe precisa escolher tecnologias para
cálculo científico, regras declarativas, aplicação Web interativa e
firmware restrito. Proponha famílias de linguagens, justifique
historicamente cada escolha e explicite dois trade-offs.
R:  Tenho como exemplo o Rust, pois ele atende aos requisitos, mesmo hoje em dia não sendo amplamente usado para embarcados com o Firmware restrito, ele está sendo muito popular por ser uma linguagem “Amigavel” e muito segura. Nesse caso, nossos trade-offs seria que temos muitos programadores usando essa linguagem e estudando seus limites, assim aumentando sua vida util, mas em contrapartida ainda uma linguagem considerada “nova”. Para o segundo trade-off temos a sua segurança de memória mas perdemos um controle ultra-fino do hardware
Objetivos: obj01, obj02, obj03, obj04, obj05 · Referência: Sebesta, cap. 2, páginas PDF 49, 118.
Questões e respostas autorais; não reproduzem os exercícios ou figuras do livro.
Respostas:





