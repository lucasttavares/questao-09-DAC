import java.io.Serializable;

public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private String codigo;
    private String preco;

    public Produto(String nome, String codigo, String preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto: " +
                "nome='" + nome + '\'' +
                ", código='" + codigo + '\'' +
                ", preco='" + preco;
    }

}