import javax.swing.*;
public class Ejemplo1{
 public static void main(String[] args){
  boolean b1 = false;
  int[] n = new int[10];
  //int[] n1 = new int[];
  int[] n2 = {10,50,6,5,50};
  int[][] n3 = {{50,3,6},{5,50,60},{2,3,5},{50,80,90}};
  n3[0][0] = 40;
  //arreglo main 
  //BufferdReader try-catch
  //JOptionPane -- JTextArea
  //Scanner 
  String salida = "Indice\tValor\n";
  salida += "--------\t-------\n\n";
  for(int contador = 0; contador < n.length; contador++)
   salida += contador + "\t" + n[contador] + "\n";

   JTextArea areaSalida = new JTextArea();
   areaSalida.setText(salida);
   JOptionPane.showMessageDialog(null,areaSalida,"Utilizando JTextArea",
				 JOptionPane.INFORMATION_MESSAGE);
 }
}