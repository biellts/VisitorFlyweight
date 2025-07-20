package br.edu.ifnmg.poo.visitorflyweight.visitor;

import br.edu.ifnmg.poo.visitorflyweight.flyweight.Cor;

/**
 * Representa um quadrado com lado e cor, implementando o padrão Visitor.
 */
public class Quadrado implements Forma {
    private final int lado;
    private final Cor cor;

    public Quadrado(int lado, Cor cor) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado deve ser maior que zero.");
        }
        this.lado = lado;
        this.cor = cor;
    }

    public int getLado() {
        return lado;
    }

    @Override
    public Cor getCor() {
        return cor;
    }

    @Override
    public void aceitar(FormaVisitor visitor) {
        visitor.visitarQuadrado(this);
    }
}