package cwt;

public class Meni {
	private Namirnica [] meni;
	private int brNamirnice;

	public Meni(int n) {
		meni = new Namirnica [n];
		
	}
	public void dodaj(Namirnica njam) {
		if (meni[brNamirnice]==null&&brNamirnice<meni.length)
			meni[brNamirnice++]=njam;
		else return;
	}
	
	public double enrgVr() {
		double d=0;
		for (int i=0; i<meni.length;i++) {
			if (meni[i]!=null)
				d+=meni[i].energVr(); //ovako se skuplja energetska vrednost i dodaje u niz.
			//dodaje se u novu promenljivu d.
				
		}
		return d;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Meni: (" + enrgVr() + " kJ)");
		for (int i=0; i<meni.length; i++) {
			if (meni[i]==null)continue;
			sb.append("\n"+meni[i]);
		}
		return sb.toString();
	}

}
