package ud2.ejerciciosbucles;

public class NumerosEnTexto {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            System.out.println(i + " - " + numeroATexto(i));
        }
    }

    private static String numeroATexto(int i) {
        if (i < 1 || i > 99)
            return "";

        int decenas = i /10; // Obtengo las decenas: entre 0 y 9
        
        switch (decenas) {
            case 0: break;
            case 1: break;
            //etc.
        }

        String strUnidades = "";
        switch(i) {
            case 1: strUnidades = "uno"; break;
            case 2: strUnidades = "dos"; break;
            case 3: strUnidades = "tres"; break;
            case 4: strUnidades = "cuatro"; break;
            case 5: strUnidades = "cinco"; break;
            case 6: strUnidades = "seis"; break;
            case 7: strUnidades = "siete"; break;
            case 8: strUnidades = "ocho"; break;
            case 9: strUnidades = "nueve"; break;            
        }
        return strUnidades;
    }
}
