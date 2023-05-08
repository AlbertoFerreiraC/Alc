
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;

public class SumadeMatrices {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int fila = Integer.parseInt(args[0]);
        int colum = Integer.parseInt(args[1]);
        int mat1[][] = new int[fila][colum];
        int mat2[][] = new int[fila][colum];
        int result[][] = new int[fila][colum];

        System.out.print("Ingrese los datos que desea agregar");
        for (int f = 0; f < mat1.length; f++) {
            for (int c = 0; c < mat1[f].length; c++) {
                //pedir datos
                mat1[f][c] = entrada.nextInt();
                mat2[f][c] = entrada.nextInt();
                result[f][c] = mat1[f][c] + mat2[f][c];
            }
        }

        String x = "matriz1\n";

        for (int f = 0; f < mat2.length; f++) {
            for (int c = 0; c < mat2[f].length; c++) {
                x += mat1[f][c] + "\t";
            }

            x += "\n";
        }

        x += "\n";

        x += "matriz2\n";
        for (int f = 0; f < mat2.length; f++) {
            for (int c = 0; c < mat2[f].length; c++) {
                x += mat2[f][c] + "\t";
            }

            x += "\n";
        }

        x += "\n";
        x += "resultado\n";
        for (int f = 0; f < mat2.length; f++) {
            for (int c = 0; c < mat2[f].length; c++) {
                x += result[f][c] + "\t";
            }

            x += "\n";
        }

        JTextArea r = new JTextArea();
        r.setText(x);
        JOptionPane.showMessageDialog(null, r);

    }
}
