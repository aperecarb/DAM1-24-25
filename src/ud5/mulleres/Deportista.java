package ud5.mulleres;

public class Deportista extends MullerTraballadora implements IPioneira {
    private String fitoHistorico;

    public Deportista(String nome, String apelidos, int anoNacemento, String fitoHistorico) {
        super(nome, apelidos, anoNacemento);
        this.fitoHistorico = fitoHistorico;
    }

    @Override
    public String getDescubrimentoOuAporte() {
        return fitoHistorico;
    }

    @Override
    public String descricionContribucion() {
        return nome + " " + apelidos + " foi unha deportista pioneira que acadou o seguinte fito histórico: " + fitoHistorico;        
    }    

}
