Projeto VisitorFlyweight:

Este projeto demonstra a implementação dos padrões de projeto Visitor e Flyweight em Java. Ele inclui um sistema para criar e gerenciar formas geométricas (círculos e quadrados) com instâncias de cores compartilhadas, aplicando um visitor para realizar operações como desenhar.

Descrição

O código é organizado em pacotes que exemplificam:
Padrão Flyweight: Utilizado para gerenciar eficientemente objetos Cor (Cor), reduzindo o uso de memória por meio do compartilhamento de instâncias via uma CorFactory.
Padrão Visitor: Permite a adição de novas operações (ex.: desenhar) às formas (Circulo e Quadrado) sem modificar suas classes, usando a interface FormaVisitor e a implementação DesenharVisitor.

A classe Main orquestra a criação de formas com cores compartilhadas e aplica o visitor para exibir suas propriedades.
Funcionalidades

Criação de círculos e quadrados com instâncias de cores compartilhadas.
Implementação do padrão Visitor para desenhar formas.
Otimização de memória usando o padrão Flyweight para gerenciamento de cores.
Design extensível para adicionar novas operações ou formas.

Compilação e Execução:

Abra o projeto no seu IDE.
Compile todos os arquivos .java no diretório src.
Execute a classe Main localizada em br.edu.ifnmg.poo.visitorflyweight.main.

Uso

O programa cria instâncias de Circulo e Quadrado com raios/lados específicos e cores (vermelho e azul).
Um DesenharVisitor é aplicado a cada forma, imprimindo suas propriedades no console.
Saída esperada:
Desenhando círculo de raio 10 com cor vermelho
Desenhando círculo de raio 20 com cor vermelho
Desenhando quadrado de lado 15 com cor azul

Estrutura do Projeto

br.edu.ifnmg.poo.visitorflyweight.flyweight:
Cor.java: Define a classe Cor com um atributo de nome.
CorFactory.java: Gerencia um cache de instâncias de Cor usando o padrão Flyweight.


br.edu.ifnmg.poo.visitorflyweight.visitor:
Forma.java: Interface que define o contrato para formas geométricas.
FormaVisitor.java: Interface que define os métodos para visitar formas.
Circulo.java: Implementa Forma para representar um círculo.
Quadrado.java: Implementa Forma para representar um quadrado.
DesenharVisitor.java: Implementa FormaVisitor para desenhar formas.


br.edu.ifnmg.poo.visitorflyweight.main:
Main.java: Classe principal que executa o programa.
