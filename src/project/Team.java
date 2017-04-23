package project;

import java.util.ArrayList;

public class Team extends Project{

	private ArrayList<Project> members;
	
	private String name;
	
	public Team(String name){
		this.name = name;
		members = new ArrayList<>();
	}
	
	@Override
	public ArrayList<Project> getMembers() {
		
		return members;
	}
	
	public String getName(){
		return name;
	}
	public double getDuration(){
		double duration = 0;
		for(Project mem : members){
			duration += mem.getHowMany()/mem.getDuration();
		}
		return Math.round(1/duration);
	}
	
	public double getCost(){
		double total = 0;
		for(Project mem : members){
			total += mem.getCost()*mem.getHowMany()*getDuration();
		}
		return Math.round(total);
	}

	@Override
	public boolean add(Project member) {
		
		return members.add(member);
	}

	@Override
	public boolean remove(Project member) {
		
		return members.remove(member);
	}

	@Override
	public String display() {
		String s = "";
		s += " "+getCost() + "$,"+getDuration()+" days";  
		return s;
	}

	@Override
	public int getHowMany() {
		
		return members.size();
	}

}
