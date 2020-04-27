import java.util.ArrayList;
public class GerenciadorAeronave {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronave(){
        this.aeronaves = new ArrayList<>();
    }
    public ArrayList<Aeronave> listarTodas(){
        ArrayList<Aeronave> aux = new ArrayList<>();
        for(Aeronave aviao : aeronaves)
            aux.add(aviao);
        return aux;
    }
    public void adicionar(Aeronave aviao){
        aeronaves.add(aviao);
    }
    public void removeAreonave(Aeronave aviao){
        aeronaves.remove(aviao);
    }
    public int sizeAeronaves(){
        return aeronaves.size();
    }
    public Aeronave buscaPorCodigo(String cod){
        for(Aeronave aviao : aeronaves){
            if(aviao.getCodigo().equals(cod)){
                return aviao;
            }
            else {
                System.out.println("aeronave não encontrada");
                return null;
            }
        }
        return null;
    }
}