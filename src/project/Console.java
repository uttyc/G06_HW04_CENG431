package project;

public class Console {

	public static void main(String[] args) {
		
		
		Team analysts = new Team("Analysis Team");
		Member senAnalyst = new Member("Senior",95, 90, 1);
		Member junAnalyst = new Member("Junior",65, 150, 3);
		
		analysts.add(senAnalyst);
		analysts.add(junAnalyst);
		
		Team designers = new Team("Design Team");
		Member senDesigner = new Member("Senior",85, 90, 1);
		Member junDesigner = new Member("Junior",55, 210, 3);
		
		designers.add(senDesigner);
		designers.add(junDesigner);
		
		
		Team developers = new Team("Developer Team");
		Member senDev = new Member("Senior",120, 180, 1);
		Member junDev = new Member("Junior",90, 365, 6);
		Member entLevDev = new Member("Entry Level Developer", 60, 730, 10);
		
		developers.add(senDev);
		developers.add(junDev);
		developers.add(entLevDev);
		
		Team testers = new Team("Test Team");
		Member senTester = new Member("Senior",100, 180, 2);
		Member testSpec = new Member("Test Specialist",130, 90, 2);
		
		
		testers.add(senTester);
		testers.add(testSpec);
		
		
		System.out.println("Analyst Team : "+analysts.display());
		System.out.println("Designer Team : "+designers.display());
		System.out.println("Developer Team : "+developers.display());
		System.out.println("Test Team : "+testers.display());
		
		
		
		
	}
	

}
