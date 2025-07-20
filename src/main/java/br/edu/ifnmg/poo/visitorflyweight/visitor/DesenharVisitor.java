package br.edu.ifnmg.poo.visitorflyweight.visitor;

public class DesenharVisitor implements FormaVisitor {

    @Override
    public void visitarCirculo(Circulo c) {
        System.out.println("Desenhando círculo de raio " + c.getRaio() +
                           " com cor " + c.getCor().getNome());
    }

    @Override
    public void visitarQuadrado(Quadrado q) {
        System.out.println("Desenhando quadrado de lado " + q.getLado() +
                           " com cor " + q.getCor().getNome());
    }
}