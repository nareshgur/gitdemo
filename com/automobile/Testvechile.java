package com.automobile;
import com.automobile.Vechile;
import com.automobile.twowheeler.*;
import com.automobile.Fourwheeler.*;
public class Testvechile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hero h = new Hero("Hero Splendor","a3443ag5","Naresh",100);
       System.out.println("Model:"+h.getModelName());
       System.out.println("Registration:"+h.getRegistrationNumber());
       System.out.println("Owner:"+h.getOwnerName());
       System.out.println("Speed:"+h.getSpeed());
       h.radio();
       System.out.println("\n-----------------------------------------\n");
       Honda ho=new Honda("honda shine","ts02fa09","tharun",90);
       System.out.println("Model: "+ho.getModelName());
       System.out.println("Registration Number: "+ho.getRegistrationNumber());
       System.out.println("Owner: "+ho.getOwnerName());
       System.out.println("Speed: "+ho.getSpeed()+"kmph");
       ho.cdplayer();
       System.out.println("\n-----------------------------------------\n");
       Ford f=new Ford("Ford Endeavour","hhf10108","Peter",120);
       System.out.println("Model: "+f.getModelName());
       System.out.println("Registration Number: "+f.getRegistrationNumber());
       System.out.println("Owner: "+f.getOwnerName());
       System.out.println("Speed: "+f.Speed()+"kmph");
       f.tempControl();
       System.out.println("\n-----------------------------------------\n");
       Logan l=new Logan("Logan Express","hhf0t9y8","David",150);
       System.out.println("Model: "+l.getModelName());
       System.out.println("Registration Number: "+l.getRegistrationNumber());
       System.out.println("Owner: "+l.getOwnerName());
       System.out.println("Speed: "+l.Speed()+"kmph");
       l.gps();
       
	}

}
