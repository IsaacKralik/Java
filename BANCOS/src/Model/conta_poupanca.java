/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.time.LocalDate;
import java.time.Duration;
import java.util.Date;

/**
 *
 * @author UNIP
 */
public class conta_poupanca extends banco {
    
    private Date niver;
    private LocalDate data = LocalDate.now();
    
    
     public void setniver(Date niver) {
        this.niver = niver;
    }
      public Date getniver(){
        return niver;
    }
    
      public void rendimento () {
          return data.getTime();
          

      
        
        
        
    }
    
    
}
