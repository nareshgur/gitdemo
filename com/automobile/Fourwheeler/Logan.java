package com.automobile.Fourwheeler;

public class Logan extends com.automobile.Vechile {
   private String ModelName;
   private String RegistrationNumber;
   private String OwnerName;
   private int speed;
   public Logan(String m,String r,String o,int s)
   {
       ModelName=m;
       RegistrationNumber=r;
       OwnerName=o;
       speed=s;
   }
   public int Speed(){
       return speed;

   }
   public void gps(){
       System.out.println("Controlling gps");
   }
   @Override
	public String getModelName() {
		return ModelName;
	}


	@Override
	public String getRegistrationNumber() {
		return RegistrationNumber;
	}

	@Override
	public String getOwnerName() {
		return OwnerName;
	}
}
