package ud6.apuntesgenericos;

import java.util.Arrays;

import ud5.apuntesherencia.Persona;

public class ContenedorLista<T> {
    T[] objetos;

    public ContenedorLista(T[] t) {
        objetos = t;
    }

    void insertarAlPrincipio(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        for (int i = 0; i < objetos.length - 1; i++) {
            objetos[i + 1] = objetos[i];
        }
        objetos[0] = nuevo;
    }

    void insertarAlFinal(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        objetos[objetos.length - 1] = nuevo;
    }

    T extraerDelPrincipio() {
        T valor = null;
        if (objetos.length > 0) {
            valor = objetos[0];
            for (int i = 0; i < objetos.length; i++)
                objetos[i] = objetos[i+1];
            objetos = Arrays.copyOf(objetos, objetos.length - 1);
        } 
        return valor;
    }

    T extraerDelFinal() {
        T valor = null;
        if (objetos.length > 0) {
            valor = objetos[objetos.length - 1];
            objetos = Arrays.copyOf(objetos, objetos.length - 1);            
        }
        return valor;
    }

    void ordenar() {
        /* Generará una excepción si T no es Comparable "T cannot be cast to class java.lang.Comparable"
         * Se puede arreglar indicando que T debe implementar Comparable "T extends Comparable"
         */
        Arrays.sort(objetos);  
    }

    @Override
    public String toString() {
        return Arrays.toString(objetos);
    }

    public static void main(String[] args) {
        ContenedorLista<Integer> lista = new ContenedorLista<>(new Integer[0]);
        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);
        System.out.println(lista);

        ContenedorLista<Persona> listaP = new ContenedorLista<>(new Persona[0]);
        listaP.insertarAlFinal(new Persona("Pepe"));
        listaP.insertarAlFinal(new Persona("Maria"));
        listaP.insertarAlFinal(new Persona("Lola"));
        System.out.println(listaP);

        listaP.ordenar();

        System.out.println(listaP);
    }

}
