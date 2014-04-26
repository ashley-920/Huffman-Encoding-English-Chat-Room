/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashley
 */
public class SystemMessage extends Message implements java.io.Serializable{
    String msg;
    SystemMessage(){super.setType(0);}
    SystemMessage(String sn,String m){
        super.setType(0);
        super.setSenderNickName(sn);        
        msg=m;
    }
    
    public String getSystemMsg(){
        return msg;
    }   
}
