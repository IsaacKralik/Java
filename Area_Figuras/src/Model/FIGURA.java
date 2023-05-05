package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author UNIP
 */
public class FIGURA  {
    
    private long altura;
    private long base;
    
    public FIGURA (long altura,long base) {
        this.setaltura(altura);
        this.setbase(base);
        
    }
    
    public double area (){
        return(getbase()* getaltura());
        
    }
   
    public long getaltura(){
        
       return altura;
    }
    
    public void setaltura (long base){
      this.altura = base;
    }
    
    public long getbase (){
        
       return base;
    }
    
    public void setbase(long base){
      this.base = base;
    }
    
   
}
