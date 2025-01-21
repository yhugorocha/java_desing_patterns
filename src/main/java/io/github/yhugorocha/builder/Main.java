package io.github.yhugorocha.builder;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        var produto = Produto.builder()
                .nome("produto teste")
                .valor(new BigDecimal(12))
                .categoria("categoria teste")
                .build();

        System.out.println(produto.toString());
    }
}
