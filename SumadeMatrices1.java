
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author falberto
 */
public class SumadeMatrices1 {

    public static void main(String[] args) {
        int filas, columnas;
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Filas:"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Columnas:"));
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];

        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = random.nextInt(20);
                matriz2[i][j] = random.nextInt(20);
            }
        }
        String m1 = "MATRIZ 1\n";
        for (int f = 0; f < matriz1.length; f++) {
            for (int c = 0; c < matriz2[f].length; c++) {
                m1 += matriz1[f][c] + "\t";
            }

            m1 += "\n";
        }
        System.out.println(m1);

        String m2 = "MATRIZ 2\n";
        for (int f = 0; f < matriz2.length; f++) {
            for (int c = 0; c < matriz2[f].length; c++) {
                m2 += matriz2[f][c] + "\t";
            }

            m2 += "\n";
        }
        System.out.println(m2);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("MATRIZ 1 + MATRIZ 2\n\tSUMA");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
