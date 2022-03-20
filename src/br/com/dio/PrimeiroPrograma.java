package br.com.dio;


import model.Cachorro;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro);

        Livro livro1 = new Livro("Harry Potter e a pedra filosofal", 233);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("hello word!"+ (a+b));*/
    }
}

class Livro {

    private String nome;
    private Integer numPaginas;

    public Livro (String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome=" + nome +
                ", numPaginas=" + numPaginas +
                '}';
    }
}