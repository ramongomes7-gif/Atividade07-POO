import java.util.Scanner;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Cadastro de Produto");
        System.out.print("Digite o ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o Nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Digite a Quantidade: ");
        int quantidade = sc.nextInt();

        Produto p1 = new Produto(id, nome, preco, quantidade);

        p1.exibirDados();

        System.out.print("\nDigite o novo preço do produto: ");
        double novoPreco = sc.nextDouble();

        p1.atualizarPreco(novoPreco);
        p1.exibirDados();

        sc.close();
    }
}
