package slide_1;

public class Xe{
private String hangXe;
private int NamSangXuat;

public String getHangXe() {
	return hangXe;
}
public void setHangXe(String hangXe) {
	this.hangXe = hangXe;
}
public int getNamSangXuat() {
	return NamSangXuat;
}
public void setNamSangXuat(int namSangXuat) {
	NamSangXuat = namSangXuat;
}
@Override 
public String toString () {
	return " Xe  [hangXe "+hangXe+", namSangXuat=" +NamSangXuat+"]";
}

}
