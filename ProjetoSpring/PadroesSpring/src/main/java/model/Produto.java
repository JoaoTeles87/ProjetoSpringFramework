package model;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String nome;
    protected int quantidade;
    protected double preco;
    @ManyToOne
    protected Endereco sede;

    private Produto(Long id, String nome, int quantidade, double preco, Endereco sede) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.sede = sede;
    }

    public Produto() {

    }


    public static class ProdutoBuilder {
        public Long id;
        public String nome;
        public int quantidade;
        public double preco;
        public Endereco sede;

        public ProdutoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ProdutoBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public ProdutoBuilder quantidade(int quantidade) {
            this.quantidade = quantidade;
            return this;
        }

        public ProdutoBuilder preco(double preco) {
            this.preco = preco;
            return this;
        }

        public ProdutoBuilder sede(Endereco sede) {
            this.sede = sede;
            return this;
        }

        public Produto build() {
            return new Produto(id, nome, quantidade, preco, sede);
        }
    }

}
