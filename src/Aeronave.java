public class Aeronave {
    private String codigo;
    private String descricao;
    private int capacidade;

    public Aeronave(String codigoIn, String descricaoIn, int capacidadeIn){
        codigo = codigoIn;
        descricao = descricaoIn;
        capacidade = capacidadeIn;
    }
    public String getCodigo() {
        return codigo;
    }
}
