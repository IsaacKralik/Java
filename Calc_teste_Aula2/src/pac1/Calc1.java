/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pac1;
import java.util.Scanner; // 1. importando a classe Scanner
/**
 *
 * @author UNIP
 */
public class Calc1 {
    
  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
  int a, b;

  System.out.printf("Informe o primeiro valor: ");
  a = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)

  System.out.printf("Informe o segundo valor.: ");
  b = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)

  System.out.printf("\nResultados:\n");
  System.out.printf("%d + %d = %3d\n", a, b, (a + b));
  System.out.printf("%d - %d = %3d\n", a, b, (a - b));
  System.out.printf("%d * %d = %3d\n", a, b, (a * b));
  System.out.printf("%d / %d = %3d (divisão inteira)\n", a, b, (a / b));
  System.out.printf("%d / %d = %6.2f (divisão exata)\n", a, b, ((double)a / b));
  }

}

}
