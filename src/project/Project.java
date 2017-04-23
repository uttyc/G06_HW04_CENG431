package project;

import java.util.ArrayList;

public abstract class Project {
	
	
	public abstract ArrayList<Project> getMembers();
	public abstract boolean add(Project member);
	public abstract boolean remove(Project member);
	public abstract String display();
	public abstract double getCost();
	public abstract String getName();
	public abstract double getDuration();
	public abstract int getHowMany();
	
	public double calculateTime(){
		return 0.0;
	}
	public double calculateTotalCost(){
		return 0.0;
	}
	
	
}
