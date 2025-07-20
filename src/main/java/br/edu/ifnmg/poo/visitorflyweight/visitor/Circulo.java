package br.edu.ifnmg.poo.visitorflyweight.visitor;

import br.edu.ifnmg.poo.visitorflyweight.flyweight.Cor;

public class Circulo implements Forma {
    private final int raio;
    private final Cor cor;

    public Circulo(int raio, Cor cor) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
        this.cor = cor;
    }

    public int getRaio() {
        return raio;
    }

    @Override
    public Cor getCor() {
        return cor;
    }

    @Override
    public void aceitar(FormaVisitor visitor) {
        visitor.visitarCirculo(this);
    }
}