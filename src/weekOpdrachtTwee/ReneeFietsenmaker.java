package weekOpdrachtTwee;

public class ReneeFietsenmaker {
	public static void main(String [] args) {
		Klant renee = new Klant();
		Fietsenmaker frits = new Fietsenmaker();
		System.out.println(renee.fiets.stuk);
		frits.Maken(renee.fiets);
		System.out.println(renee.fiets.stuk);
		}
	}
class Fietsenmaker{
	void Maken(Fiets fiets) {
		fiets.stuk = false; 
	}
}
class Klant {
	Fiets fiets = new Fiets();
}
class Fiets {
	boolean stuk = true;
}