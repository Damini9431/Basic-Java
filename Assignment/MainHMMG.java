package com.assignment;
class HillStations {
	public void location() {
        System.out.println("Hill station location.");
    }
    public void famousFor() {
        System.out.println("Famous for natural beauty.");
    }
}
class Manali extends HillStations {
	@Override
    public void location() {
        System.out.println("Manali is a town.Which is located in Himachal Pradesh.");
    }
    @Override
    public void famousFor() {
        System.out.println("Manali is famous for skiing , trekking and snowfall.");
    }
}
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is a hill station which is located in Uttarakhand.");
    }
    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its scenic views, good social life and entertainment.");
    }
}
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is a town which is located in Jammu & Kashmir.");
    }
    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for scenic beauty and adventure sports.");
    }
}
public class MainHMMG {
	public static void main(String[] args) {
		Manali manali = new Manali();
        manali.location();  
        manali.famousFor();  
        System.out.println();

        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();  
        mussoorie.famousFor();  
        System.out.println();

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();  
        gulmarg.famousFor(); 
    }
}
