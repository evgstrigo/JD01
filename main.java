package ProstDrob;

public class Main {

	public static void main(String[] args) {
		ProstDrob dr1 = new ProstDrob(3,7);
		ProstDrob dr2 = new ProstDrob(4,6);
		ProstDrob.slozh(dr1,dr2);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		ProstDrob.slozhnew(dr1,dr2);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		vivodCons.vivod(dr1);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		ProstDrob[] dr3 = new ProstDrob[4];
		dr3[0] = dr1;
		dr3[1] = dr2;
		dr3[2] = dr2;
		dr3[3] = dr1;
		vivodCons.vivod(dr3);
	}

}
