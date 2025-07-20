
package br.edu.ifnmg.poo.visitorflyweight.visitor;

import br.edu.ifnmg.poo.visitorflyweight.flyweight.Cor;


public interface Forma {
    void aceitar(FormaVisitor visitor);
    Cor getCor();
}
