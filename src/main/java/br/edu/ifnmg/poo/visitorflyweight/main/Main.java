
package br.edu.ifnmg.poo.visitorflyweight.main;
import br.edu.ifnmg.poo.visitorflyweight.flyweight.Cor;
import br.edu.ifnmg.poo.visitorflyweight.flyweight.CorFactory;
import br.edu.ifnmg.poo.visitorflyweight.visitor.Circulo;
import br.edu.ifnmg.poo.visitorflyweight.visitor.DesenharVisitor;
import br.edu.ifnmg.poo.visitorflyweight.visitor.Forma;
import br.edu.ifnmg.poo.visitorflyweight.visitor.FormaVisitor;
import br.edu.ifnmg.poo.visitorflyweight.visitor.Quadrado;
import java.util.Arrays;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        // Criação das cores via Flyweight
        Cor vermelho = CorFactory.getCor("vermelho");
        Cor azul = CorFactory.getCor("azul");

        // Criação de formas com compartilhamento de instâncias de Cor
        List<Forma> formas = Arrays.asList(
            new Circulo(10, vermelho),
            new Circulo(20, vermelho),
            new Quadrado(15, azul)
        );

        // Aplicação do Visitor
        FormaVisitor desenhador = new DesenharVisitor();
        for (Forma f : formas) {
            f.aceitar(desenhador);
        }
    }
}

