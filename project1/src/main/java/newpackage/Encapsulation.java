/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author DELL
 */
public class Encapsulation extends Inheritance
{
   private String ID;
   
   public Encapsulation()
   {
       super();
       this.ID = "";
   }
   
   public String getID()
   {
       return ID;
   }
   
   public void setID(String ID)
   {
       this.ID = ID;
   }
}
