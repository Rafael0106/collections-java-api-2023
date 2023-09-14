package list.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private double quantidade;


    public Item(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public double getQuantidade() {
        return this.quantidade;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", preco='" + getPreco() + "'" +
            ", quantidade='" + getQuantidade() + "'" +
            "}";
    }

}
