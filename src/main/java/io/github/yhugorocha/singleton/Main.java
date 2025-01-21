package io.github.yhugorocha.singleton;

public class Main {
    public static void main(String[] args) {

        Gerenciador g1 = Gerenciador.getInstance();
        Gerenciador g2 = Gerenciador.getInstance();

        System.out.println(g1);
        System.out.println(g2);

    }
}
