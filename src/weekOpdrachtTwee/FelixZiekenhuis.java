package weekOpdrachtTwee;

public class FelixZiekenhuis {
	public static void main(String[] args) {
		Ziekenhuis AMC = new Ziekenhuis();
		Patient peter = new Patient();
		System.out.println(peter.ziek);
		AMC.felix.Opereren(peter);
		AMC.felix.Opereren(peter);
		AMC.felix.Opereren(peter);
		AMC.felix.Opereren(peter);
		System.out.println(AMC.omzet); 
		System.out.println(peter.ziek);
		RoloDex rolodex = new RoloDex(); 
		rolodex.vindPatient("a");
		rolodex.vindPatient("b");
	}
}
class Ziekenhuis{
	static int omzet = 0;
	Arts felix = new Arts();
}
class Arts{
	void Opereren(Patient patient) {
		patient.ziek = false;
		Ziekenhuis.omzet += 50;
		System.out.println("Operatie geslaagd, 50euro verdient!");
	}  
}
class Patient{
	boolean ziek = true; 
	}
class RoloDex{
	Patient vindPatient(String v){
		if (v == "b") {
			System.out.println("We hebben een patient gevonden!");
			return new Patient(); 
		}
		System.out.println("Helaas, we hebben geen patient kunnen vinden..");
		return null; 
		
	}
}