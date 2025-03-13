package ud5.mulleres;

// Clase abstracta
abstract class MullerTraballadora {
    protected String nome;
    protected String apelidos;
    protected int anoNacemento;

    public MullerTraballadora(String nome, String apelidos, int anoNacemento) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.anoNacemento = anoNacemento;
    }

    public abstract String descricionContribucion();

    public int getIdade(int anoActual) {
        return anoActual - anoNacemento;
    }

    @Override
    public String toString() {
        return nome + " " + apelidos + " (nada en " + anoNacemento + ")";
    }

    public static void main(String[] args) {
        
        // Instanciación de mulleres reais
        Cientifica marieCurie = new Cientifica("Marie", "Curie", 1867, "Descubriu o radio e o polonio");
        Artista fridaKahlo = new Artista("Frida", "Kahlo", 1907, "Surrealismo e pintura autobiográfica");
        Politica rosaParks = new Politica("Rosa", "Parks", 1913, "Loita polos dereitos civís e contra a segregación racial");
        Cientifica adaLovelace = new Cientifica("Ada", "Lovelace", 1815, "Primeira programadora da historia");
        Escritora virginiaWoolf = new Escritora("Virginia", "Woolf", 1882, "Orlando e Un cuarto de seu");
        Deportista serenaWilliams = new Deportista("Serena", "Williams", 1981, "Ser a tenista con máis títulos de Grand Slam na era aberta");
        Sindicalista claraCampoamor = new Sindicalista("Clara", "Campoamor", 1888, "Conseguíu o sufraxio feminino en España");


        // Uso dun array de polimorfismo
        MullerTraballadora[] mulleres = {marieCurie, fridaKahlo, rosaParks, adaLovelace, virginiaWoolf,serenaWilliams, claraCampoamor};

        // Recorrer o array con polimorfismo
        System.out.println("=== Mulleres Traballadoras Destacadas ===");
        for (MullerTraballadora muller : mulleres) {
            System.out.println(muller.descricionContribucion());
        }

        // Extra: Mostrar aportes específicos segundo a súa interface
        System.out.println("\n=== Detalles Específicos ===");
        for (MullerTraballadora muller : mulleres) {
            if (muller instanceof IPioneira) {
                IPioneira pioneira = (IPioneira) muller;
                System.out.println(muller.nome + " foi pioneira en: " + pioneira.getDescubrimentoOuAporte());
            }
            if (muller instanceof IActivista) {
                IActivista activista = (IActivista) muller;
                System.out.println(muller.nome + " defendeu a causa: " + activista.getCausaDefendida());
            }
        }
    }
}

