
package model;


public class User {
 //Atributos
 private String userName;
 private String userPass; 
 private String userEmail;

//contrutor
 public User(String user,String pass){
   this.userName = user;
   this.userPass = pass;
 }
 
 //Getter & Setters
 public String getUserName(){
  return this.userName;
 }
 
 public void setUserName(String name){
  this.userName = name;    
 }
 public String getUserPass(){
  return this.userPass;
 }
 
 public void setUserPass(String pass){
  this.userPass = pass; 
 }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

   //toString- Representação genérica do objeto 
   public String toString(){
     return "Nome:" + this.userName + "<br>Email:" 
        + this.userEmail; 
   }      
    
   //Métodos gerais
   public boolean isLogged(){
   return(this.userName.equals("furacão")
           &&this.userPass.equals("senha1234"));
   }
   
} //fim da class 

