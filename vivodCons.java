package ProstDrob;

public class vivodCons {
	
public static void vivod (ProstDrob d1){
	System.out.println(d1.getCh()+"/"+d1.getZn());
}


public static void vivod (ProstDrob[] d1){
	for (int i=0; i<d1.length;i++){
		System.out.println(d1[i].getCh()+"/"+d1[i].getZn());
	}
}
}
