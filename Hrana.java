package cwt;

public class Hrana extends Namirnica {
	private double tezina;// tezina izrazena u gramima
	private double belancevine;// procentualni udeo od tezine
	private double masti;// procentualni udeo od tezine
	private double ugljeniHidrati;// procentualni udeo od tezine
	
	public Hrana(String ime, double tezina, double belancevine, double masti, double ugljeniHidrati) {
		super(ime);
		
		if (belancevine + masti + ugljeniHidrati > 100) return;
		else {
			this.tezina=tezina;
			this.belancevine=belancevine;
			this.masti=masti;
			this.ugljeniHidrati=ugljeniHidrati;
		}
		
	}
	// Hrana nije gotova! Moram da razmislim kako da preformulisem belancevine,
	// masti i UH u % i da njih racunam kao procente od tezine i na kraju da dobijem
	// od njihovog udela u tezini kolicinu kalorija

	

	public double getTezina() {
		return tezina;
	}

	public double getBelancevine() {// napravio sam ovako da bi mi od ukupne tezine hrane dao pravi procentualni
									// udeo u procentima
									// mnozim sa 100 jer su u pitanju grami
		return (tezina /100) * belancevine;
	}

	public double getMasti() {
		return (tezina/100 ) * masti;
	}

	public double getUgljeniHidrati() {
		return (tezina/100) *ugljeniHidrati;
	}

	@Override
	public double energVr() {
		double energVr = (getBelancevine() * 16.7) + (getMasti() * 37.6) + (getUgljeniHidrati() * 17.2);
		return energVr;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[" + id + "] " + ime + " (" + tezina + "g, " + energVr() + " kJ).");
		return sb.toString();
	}

	

}
