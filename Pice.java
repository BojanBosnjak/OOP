package cwt;

public class Pice extends Namirnica {
	private double kolicina;// u litrima
	private double enVr; // izrazna je u kJ kilo dzulima i odnosi se na 1l napitka

	public Pice(String ime, double kolicina, double enVr) {
		super(ime);
		this.kolicina=kolicina;
		this.enVr=enVr;

	}

	@Override
	public double energVr() { // ovde racunam energetsku vrednost kolicina*energetska vrednost po litru
		return enVr * kolicina;
	}

	public double getKolicina() {
		return kolicina;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[" + id + "] " + ime + " (" + kolicina + "l, " + enVr + " kJ).");
		return sb.toString();
	}

}
