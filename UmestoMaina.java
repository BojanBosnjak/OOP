package cwt;

public class UmestoMaina {

	public static void main(String[] args) {
		Meni meni = new Meni (10);
        meni.dodaj (new Hrana("Hleb",600,7.5,0.4,49));
		meni.dodaj (new Pice ("Sok", 0.2,18540));
		meni.dodaj (new Hrana("Sir", 200,17,1.2,4));
		System.out.println (meni);
		}
		
//		Hrana h = new Hrana(10.0, "Musaka", 1, 1000, 18, 9, 12);
//		Pice pivo = new Pice(5, "Pivo", 1, 0.5, 300);
//		Pice burbon = new Pice(12, "4 Roses", 5, 1, 12);
								//ovde imam 2 stvari viska, energVr i id
		
//		System.out.println(h.getMasti());
//		System.out.println(h.getBelancevine());
//		System.out.println(h.getUgljeniHidrati());
//		
//		System.out.println(h.getEnergetskaVrednost());
		//System.out.println(h.toString());
		
//		System.out.println(pivo);
//		System.out.println(burbon);
		
//		int[] niz = {1,2,3,4,5};
//		
//		for(int i=0; i<niz.length;i++) {
//			System.out.println(niz[i]);
//		}
		
		}


