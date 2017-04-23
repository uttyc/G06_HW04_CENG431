package project;

import java.util.ArrayList;

public class Member extends Project{
	private String name;
	private double cost;
	private double durationInDays;
	private int howMany;
	public Member(String name, double cost, double durationInDays, int howMany){
		this.name = name;
		this.cost = cost;
		this.durationInDays = durationInDays;
		this.howMany = howMany;
	}
	public int getHowMany(){
		return howMany;
	}
	@Override
	public ArrayList<Project> getMembers() {
		
		return null;
	}
	public double getDuration(){
		return durationInDays  ;	
	}
	public String getName(){
		return name;
	}
	public double getCost(){
	
		return cost;
	}

	@Override
	public boolean add(Project member) {

		return false;
	}

	@Override
	public boolean remove(Project member) {

		return false;
	}

	@Override
	public String display() {
		
		return "<"+name+"> ";
	}

}
