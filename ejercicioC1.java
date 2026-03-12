import java.util.Scanner;

public class ejercicioC1 {
    public static void main(String[] args) {
        String palabrasecreta = "perico";
        Scanner sc = new Scanner(System.in);

        int intentos = 0;

        char[] progreso = new char[palabrasecreta.length()];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }

        String progresostring = new String(progreso);

        System.out.println("\nTienes que adivinar la palabra el progreso es este " + progresostring);

        while (progresostring.contains("_")) {
            System.out.println("\nIntroduce una letra");
            char letra = sc.next().toLowerCase().charAt(0);
            intentos++;

            for (int i = 0; i < palabrasecreta.length(); i++) {
               if (palabrasecreta.charAt(i) == letra && progreso[i] == '_')  {
                progreso[i] = letra;
                System.out.println("La palabra contiene esa letra "+progreso);
               }
            }
            

            
                

        }
    }
}
