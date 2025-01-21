package io.github.yhugorocha.builder;

import java.math.BigDecimal;

public class Produto {

    private String nome;
    private String categoria;
    private BigDecimal valor;

    public Produto(String nome, String categoria, BigDecimal valor) {
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", valor=" + valor +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String nome;
        private String categoria;
        private BigDecimal valor;

        public Builder nome (String nome){
            this.nome = nome;
            return this;
        }

        public Builder categoria(String categoria){
            this.categoria = categoria;
            return this;
        }

        public Builder valor(BigDecimal valor){
            this.valor = valor;
            return this;
        }

        public Produto build(){
            return new Produto(nome, categoria, valor);
        }
    }
}
