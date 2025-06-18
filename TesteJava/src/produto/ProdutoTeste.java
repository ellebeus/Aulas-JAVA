package produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        // Criação de um objeto da classe Produto
        Produto produto = new Produto();
        produto.setNomeDoProduto("Camiseta");
        produto.setPrecoDoProduto(89.99);
        produto.setMarcaDoProduto("Revest");
        produto.setDetalhesDoProduto("Camiseta de malha ecológica PET, tamanho M.");

        // Exibindo os detalhes do produto
        System.out.println("Nome do Produto: " + produto.getNomeDoProduto());
        System.out.println("Preço do Produto: R$ " + produto.getPrecoDoProduto());
        System.out.println("Marca do Produto: " + produto.getMarcaDoProduto());
        System.out.println("Detalhes do Produto: " + produto.getDetalhesDoProduto());
    }

}
