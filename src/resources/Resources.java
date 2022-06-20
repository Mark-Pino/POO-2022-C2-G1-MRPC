package resources;

import java.util.Date;


public class Resources {
    Date date= new Date();
    
    public String  generaID(){
        
        String id="";
        id=""+date.getTime();
        return id;
        
    }
    
    
}
