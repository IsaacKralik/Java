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

public class conta_corrente extends banco {
    private double limite;
        
     public void setlimite(double limite) {
        this.limite = limite;
    }
      public double getlimite(){
        return limite;
    }
    

}