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
public class Inheritance 
{
    private String FirstName;
    private String LastName;
    
    public Inheritance()
    {
        this.FirstName = "";
        this.LastName = "";
    }
    
    public Inheritance(String FirstName, String LastName)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    
    public String getFirstName()
    {
        return this.FirstName;
    }
    
    public void setFirstName(String FirstName)
    {
        this.FirstName = FirstName;
    }
    
    public String getLastName()
    {
        return this.LastName;
    }
    
    public void setLastName(String LastName)
    {
        this.LastName = LastName;
    }
}
