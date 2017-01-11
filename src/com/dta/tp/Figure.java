package com.dta.tp;

import java.util.Collection;

public abstract class Figure {
	
	public abstract Point getCentre();
	
	public abstract Collection<Point> getPoints();
	
	public abstract boolean couvre(Point p);
	
	public void affiche(){
		System.out.println(this.toString());
	}
	
}
