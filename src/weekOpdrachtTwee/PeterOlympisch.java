package weekOpdrachtTwee;

public class PeterOlympisch {
	public static void main(String [] args) {
		System.out.println("Welkom bij de Olympische spelen!");
		Deelnemer peter = new Deelnemer(); 
		peter.naam = "Peter";
		Deelnemer tim = new Deelnemer();
		tim.naam = "Tim";
		Deelnemer renee = new Deelnemer();
		renee.naam = "Renee";
		peter.aandoening.gebrokenBeen();
		tim.aandoening.gebrokenArm();
		renee.aandoening.gebrokenBeen();
		System.out.println(peter.aandoening.punten);
		Scout eric = new Scout();
		eric.scoutDeelnemer("a");
		eric.scoutDeelnemer("b");
		Toernooi olympisch = new Toernooi();
		olympisch.Spelen(peter, tim);
	}
}
class Deelnemer{
	String naam; 
	Aandoening aandoening = new Aandoening();
	
}
class Aandoening{
	String naam;
	int punten;
	void gebrokenBeen() {
		System.out.println("Heeft een gebroken been");
		naam = "Gebroken been";
		punten += 5; 
	}
	void gebrokenArm() {
		System.out.println("Heeft een gebroken arm");
		naam = "Gebroken arm";
		punten += 3;
	}
}
class Scout{
	Deelnemer scoutDeelnemer(String s) {
		if (s == "a") {
			System.out.println("Nieuwe deelnemer gevonden!");
			return new Deelnemer();
		}
		System.out.println("Helaas geen nieuwe deelnemer gevonden..");
		return null;
	} 
}
class Toernooi{
	void Spelen(Deelnemer p, Deelnemer t) {
		int pr = p.aandoening.punten;
		int tm = t.aandoening.punten;
		if (pr > tm) {
			System.out.println(p.naam + " Wint");
		}
		else {
			System.out.println(t.naam + " Wint");
		}
	} 
}