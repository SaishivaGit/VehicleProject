package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	public void vehicleNecessery() {
	System.out.println("now  a days vehicle necessery is must one");
}
public static void main(String[] args) {
	Vehicle v=new Vehicle();
	v.vehicleNecessery();
	
	TwoWheeler two=new TwoWheeler();
	two.bike();
	two.cycle();
	
	ThreeWheeler three=new ThreeWheeler();
	three.auto();
	
	FourWheeler four=new FourWheeler();
	four.car();
	four.bus();
	four.lorry();
	
}
}
