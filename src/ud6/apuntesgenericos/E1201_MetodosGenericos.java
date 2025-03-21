package ud6.apuntesgenericos;

import ud3.apuntes.Persona;

public class E1201_MetodosGenericos {
    static <U> int numeroDeNulos(U[] tabla) {
        int cont = 0;
        for (U e : tabla)
            if (e == null) 
                cont++;
        return cont;
    }

    public static void main(String[] args) {
        Integer[] numeros = {3, 5, 8, null, 2, null};
        Persona[] personas = {new Persona("Pepe"), null, new Persona("María")};

        System.out.println(numeroDeNulos(numeros));
        System.out.println(numeroDeNulos(personas));
    }
}