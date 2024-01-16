package com.looseCoupling;

public class Mobile {
	Network sim; // Tight Coupling
	Mobile(Network sim){
		this.sim = sim; // this.sim = new Network();
	}
	
	public String getNetwork() {
		return this.sim.getSim();
	}
}
