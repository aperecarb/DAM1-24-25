package ud2.ejercicioscondicionales;

public class EP0217_Random {
    public static void main(String[] args) {
        // Genera un número entero entre 1 y 99
        int MAX = 99;
        int MIN = 1;
        Math.random(); // genera un número mayor o igual que 0.0 y menor que 1.0
        double n = Math.random() * MAX; // genera un número mayor o igual que 0.0 y menor que 99.0
        int n2 = (int) (Math.random() * MAX); // genera un número mayor o igual que 0 y menor que 99
        int n3 = (int) (Math.random() * (MAX - MIN + 1)) + MIN; // genera un número mayor o igual que 1 y menor que 100
                                                                // 1 <= n3 <= 99

        for (int i = 0; i < 100000; i++) {
            int num = (int) (Math.random() * (MAX - MIN + 1)) + MIN; // genera un número mayor o igual que 1 y menor que
                                                                     // 100 1 <= n3 <= 99
            System.out.println(num);
            if (num > MAX)
                System.out.println("Número demasiado alto");
            if (num < MIN)
                System.out.println("Número demasiado bajo");
            if (num == 1)
                System.out.println("UNOOOO");
            if (num == 99)
                System.out.println("NOVENTA Y NUEVE");

        }
    }
}
