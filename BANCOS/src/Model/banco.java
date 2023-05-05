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
public class banco extends Conta {
    private String agencia;
    private int numero;
    
     public String getagencia(){
        
       return agencia;
    }
    
    public void setagencia(String agencia){
      this.agencia = agencia;
    }
    
     public double getnumero(){
        
       return numero;
    }
    
    public void setnumero(int numero){
      this.numero= numero;
    }
    
    
}
