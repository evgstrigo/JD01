package ProstDrob;

public  class ProstDrob {

private int ch;
private int zn;
public ProstDrob(int ch, int zn){
this.ch = ch;
this.zn = zn;
}
public int getCh() {
	return ch;
}
private void setCh(int ch) {
	this.ch = ch;
}
public int getZn() {
	return zn;
}
private void setZn(int zn) {
	this.zn = zn;
}
// ������ ����� slozh �������� �� ���� ��� ����� � ������� ��������� �� ��������(��� ����������)
protected static void slozh(ProstDrob dr1,ProstDrob dr2){
	System.out.println(dr1.getCh()*dr2.getZn()+dr1.getZn()*dr2.getCh()+"/"+dr1.getZn()*dr2.getZn());
}
//������ ����� slozhnew �������� �� ���� ��� �����, ��������� ��������� �������� � �������� ��� � ����� �����, ���� ������� ����� �������
protected static  void slozhnew(ProstDrob dr1,ProstDrob dr2){
	ProstDrob pd = new ProstDrob(dr1.getCh()*dr2.getZn()+dr1.getZn()*dr2.getCh(),dr1.getZn()*dr2.getZn());
	System.out.println(pd.getCh() +"/" +pd.getZn());
}

}
