public class Main {
    public static void main(String[] args) {
        // Criação de Variáveis
        String nome = "Maria";
        int idade = 28;
        double salarioMensal = 3500.00;
        int mesesTrabalhados = 12;
        int quantidadeProdutos = 15;
        double totalCompras = 1500.00;

        // Operações Simples
        double salarioAnualBruto = salarioMensal * mesesTrabalhados;
        double salarioAnualLiquido = salarioAnualBruto - 2000.00;
        double mediaGastoPorProduto = totalCompras / quantidadeProdutos;
        String mensagemFinal = "Nome: " + nome + ", Salário Anual Líquido: R$ " + salarioAnualLiquido;

        // Exibição de Resultados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Mensal: R$ " + salarioMensal);
        System.out.println("Salário Anual Bruto: R$ " + salarioAnualBruto);
        System.out.println("Salário Anual Líquido: R$ " + salarioAnualLiquido);
        System.out.println("Quantidade de Produtos: " + quantidadeProdutos);
        System.out.println("Média de Gasto por Produto: R$ " + mediaGastoPorProduto);
        System.out.println(mensagemFinal);
    }
}