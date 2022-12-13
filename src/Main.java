import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", "21205", "R$50,00");
        serializar(produto);
        reader();
    }

    private static void serializar(Produto produto) {
        try {
            FileOutputStream fileOut = new FileOutputStream("produto.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(produto);
            out.close();
            fileOut.close();
            System.out.println("Dados salvos em produto.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    private static void reader() {
        try {
            FileInputStream fileIn = new FileInputStream("produto.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Produto produto = (Produto) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Dados lidos de produto.ser: ");
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Preço: " + produto.getPreco());
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Produto class not found");
            c.printStackTrace();
            return;
        }
    }
}