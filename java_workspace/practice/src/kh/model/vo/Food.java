package kh.model.vo;

import java.io.Serializable;

public class Food implements Serializable{
	String name;
	int Kcal;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(String name, int kcal)  {
		super();
		this.name = name;
		Kcal = kcal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return Kcal;
	}
	public void setKcal(int kcal) {
		Kcal = kcal;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", Kcal=" + Kcal + "]";
	}
	
	
	
}
