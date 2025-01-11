public class Volume_of_Earth {
    public static void main(String[] args) {
        double radius = 6378;
		//Volume of Earth = 4/3*pi*r^3
        double volume_of_earth = ((double)4/(double)3)*Math.PI*Math.pow(radius,3);
		//convert in miles
        double volume_of_earth_in_miles = volume_of_earth*1.6;
        System.out.println("The volume of earth in cubic kilometers is " +volume_of_earth+" and cubic miles is "+volume_of_earth_in_miles);
    }
}
