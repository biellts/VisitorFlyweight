
package br.edu.ifnmg.poo.visitorflyweight.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CorFactory {
    private static final Map<String, Cor> cache = new HashMap<>();

    public static Cor getCor(String nome) {
        return cache.computeIfAbsent(nome, Cor::new);
    }
}

