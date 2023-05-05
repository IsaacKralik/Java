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
public class Triangulo extends FIGURA {
    
    public Triangulo(long altura, long base){
    super (altura,base);
    }
    @Override
    public double area(){
        return super.area()/2;
        
    }
        
}
