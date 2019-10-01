package cwt;

public abstract class Namirnica extends Energent {
	protected String ime;
	protected int id;
	private static int globalid=1;
	
	public Namirnica(String ime) {
		this.ime=ime;
		this.id=globalid++;
	}

		public String getIme() {
		return ime;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("["+id+"]"+" "+ ime + "_namirnice");
		return sb.toString();
	}

}
