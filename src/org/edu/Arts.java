package org.edu;

public class Arts extends Education {
public void bsc() {
	System.out.println("BSC");
}
public void bed() {
	System.out.println("B.ed");
}
public void ba() {
	System.out.println("BA");
}
public void bba() {
	System.out.println("BBA");
}
@Override
public void ug() {
	System.out.println("MMES");
	super.ug();
}
@Override
public void pg() {
	System.out.println("Greens");
	super.pg();
	
}
public static void main(String[] args) {
	Arts r = new Arts();
	r.ba();
	r.bba();
	r.bed();
	r.bsc();
	r.ug();
	r.pg();
	
}
}
