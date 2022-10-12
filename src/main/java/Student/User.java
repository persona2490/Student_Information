/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *Encapsulation User information 
 * @author wangsiyi
 */
public class User {

     String username;
     String userpassword;
    
     
    public User(String username, String userpassword) {
        this.username = username;
        this.userpassword = userpassword;
    }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }
    
     @Override
     public int hashCode(){//create the hash code to username
         final int prime = 31;
         int result = 17;
         result = prime * result + ((username == null)? 0: username.hashCode());
         return result;
         
     }
     @Override
     public boolean equals(Object obj){//Override the equal method to compare by using username
         if(this == obj)
         {
             return true;
         }
         if(obj == null)
         {
             return false;
         }
         if(getClass()!= obj.getClass())
             return false;
         User other = (User) obj;
         if(username == null)
         {
             if (other.username!=null)
                 return false;
         }
         else if (!username.equals(other.username))
             return false;
         return true;
                 
     }
     
     
    
    
    
}
