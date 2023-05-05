/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author UNIP
 */
public class Conta {
    private int numero_conta;
    private String nome;
    private double saldo;
    double valor;
    
    public void sacar (double valor) {
       this.saldo = this.saldo - valor;
    }
    
    public void depositar(){
        null;
    }
    
    public void transferir (){
        null;
    }
    
    public String getnome(){
        
       return nome;
    }
    
    public void setnome(String nome){
      this.nome = nome;
      }
    
    public double getsaldo(){
        
       return saldo;
    }
    
    public void setsaldo(double saldo){
      this.saldo = saldo;
    }
}
  
