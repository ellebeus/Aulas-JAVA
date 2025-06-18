package produto;
public class Produto {
    // Atributos de visibilidade
    private String nomeDoProduto;
    private Double precoDoProduto;
    private String detalhesDoProduto;
    private String marcaDoProduto;

    // Colocando o modificador de acesso publico para permitir acesso externo
    // get eu coloco para ler o atributo 
    // set eu coloco para escrever o atributo
    //return é o que retorna o valor do atributo
    // this é utilizado para referenciar o objeto atual da classe
    public String getMarcaDoProduto() {
        return marcaDoProduto;
    }
    public void setMarcaDoProduto(String marcaDoProduto) {
        this.marcaDoProduto = marcaDoProduto;
    }
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }
    public Double getPrecoDoProduto() {
        return precoDoProduto;
    }
    public void setPrecoDoProduto(Double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }
    public String getDetalhesDoProduto() {
        return detalhesDoProduto;
    }
    public void setDetalhesDoProduto(String detalhesDoProduto) {
        this.detalhesDoProduto = detalhesDoProduto;
    }
    

}
