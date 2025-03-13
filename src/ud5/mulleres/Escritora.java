package ud5.mulleres;

public class Escritora extends MullerTraballadora implements IPioneira {
    private String obraMaestra;

    
    public Escritora(String nome, String apelidos, int anoNacemento, String obraMaestra) {
        super(nome, apelidos, anoNacemento);
        this.obraMaestra = obraMaestra;
    }

    @Override
    public String getDescubrimentoOuAporte() {
        return obraMaestra;
    }

    @Override
    public String descricionContribucion() {
        return nome + " " + apelidos + " foi unha escritora pioneira que escribíu: " + obraMaestra;
    }

}
