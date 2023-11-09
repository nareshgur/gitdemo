package com.automobile.twowheeler;

public class Hero extends com.automobile.Vechile{
    private String ModelName;
    private String RegistrationNumber;
    private String OwnerName;
    private int speed;
    public Hero(String ModelName,String RegistrationNumber,String OwnerName,int speed)
    {
    	this.ModelName= ModelName;
    	this.RegistrationNumber = RegistrationNumber;
    	this.OwnerName = OwnerName;
    	this.speed = speed;
    }
    
    
    public int getSpeed() {
    	return speed;
    }
    public void radio()
    {
    	System.out.println("Controlling radio");
    }
    @Override
    public String getModelName()
    {
    	return ModelName;
    }
    @Override
    public String getRegistrationNumber()
    {
    	return RegistrationNumber;
    }
    public String getOwnerName()
    {
    	return OwnerName;
    }
}
