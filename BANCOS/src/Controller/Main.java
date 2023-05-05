/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.util.Scanner;
import Model.Conta;
import Model.banco; 
    
                                                                           
/**
 *
 * @author UNIP
 */



public class Main {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Conta obj_Conta = new Conta ();
        
        System.out.printf("Informe o valor do saldo: ");
        obj_Conta.setsaldo(ler.nextDouble());
        
        System.out.printf("Informe o nome do titular: ");
        obj_Conta.setnome(ler.next());
        
        System.out.printf("Informe o valor que irá sacar: ");
        obj_Conta.sacar(ler.nextDouble());
        
       
        
        banco obj_banco = new banco ();
        obj_banco.setagencia("0000-01");
        obj_banco.setnumero(0001);
        
           
        
        System.out.println(obj_Conta.getnome());
        System.out.println(obj_Conta.getsaldo());
        
       
        System.out.println("O valor do seu novo saldo é: " +obj_Conta.getsaldo()+ " na conta pertencente a: " +obj_Conta.getnome());
        System.out.println("A agencia de sua conta é: " +obj_banco.getagencia()+ " de número: " +obj_banco.getnumero());
       

        
        
        /*Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
        double saldo;
        int nome;
      
        System.out.printf("Informe o valor do saldo: ");
        saldo = ler.nextDouble(); // 3. entrada de dados (lendo um valor inteiro)
       
        System.out.printf("Informe o nome do titular: ");
        nome = ler.nextInt();
        
     */
    }
}
