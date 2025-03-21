package ud6.apuntesgenericos;

import java.util.Arrays;

import ud5.apuntesherencia.Persona;

public class E1201_MetodosGenericos {
    static <U> int numeroDeNulos(U[] tabla) {
        int cont = 0;
        for (U e : tabla)
            if (e == null) 
                cont++;
        return cont;
    }

    public static <U> U[] add(U e, U[] t) {
        return null;
    }

    public static <U> boolean buscar(U e, U[] t) {
        return true;
    }

    public static <U> U[] concatenar(U[] t1, U[] t2) {
        return null;
    }


    public static void main(String[] args) {
        Integer[] numeros = {3, 5, 8, null, 2, null};
        Persona[] personas = {new Persona("Pepe"), null, new Persona("María")};

        System.out.println(numeroDeNulos(numeros));
        System.out.println(numeroDeNulos(personas));

        numeros = add(7, numeros);
        System.out.println(Arrays.toString(numeros));
        personas = add(new Persona("Juancho"), personas);
        System.out.println(Arrays.toString(personas));

        System.out.println("Hay un 8 en números? " + buscar(8, numeros));
        System.out.println("Hay un 6 en números? " + buscar(6, numeros));

        System.out.println("Está Pepe? " + buscar(new Persona("Pepe"), personas));

        Integer[] numeros2 = {23, 45, 78, 23};
        Integer[] masNumeros = concatenar(numeros, numeros2);
        System.out.println(Arrays.toString(masNumeros));
    }
}