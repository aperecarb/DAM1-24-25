package ud6.apuntesgenericos;

public class E1201_MetodosGenericos {
    static <U> int numeroDeNulos(U[] tabla) {
        int cont = 0;
        for (U e : tabla)
            if (e == null) 
                cont++;
        return cont;
    }
}