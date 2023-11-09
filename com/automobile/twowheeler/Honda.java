package com.automobile.twowheeler;
import com.automobile.Vechile;

public class Honda extends com.automobile.Vechile{
    private String ModelName;
    private String RegistrationNumber;
    private String OwnerName;
    private int speed;
    public Honda(String ModelName,String RegistrationNumber,String OwnerName,int speed)
    {
    	this.ModelName= ModelName;
    	this.RegistrationNumber = RegistrationNumber;
    	this.OwnerName = OwnerName;
    	this.speed = speed;
    }
    
    
    public int getSpeed() {
    	return speed;
    }
    public void cdplayer()
    {
    	System.out.println("Controlling cdplayer");
    }
    @Override
    public String getModelName()
    {
    	return ModelName;
    }
    public void setModalName(String ModalName)
    {
    	this.ModelName=ModalName;
    }
    @Override
    public String getRegistrationNumber()
    {
    	return RegistrationNumber;
    }
    public void setRegistrationNumber(String RegistrationNumber)
    {
    	this.RegistrationNumber = RegistrationNumber;
    }
    public String getOwnerName()
    {
    	return OwnerName;
    }
}

	
   

