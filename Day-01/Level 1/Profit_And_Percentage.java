public class Profit_And_Percentage {
    public static void main(String[] args) {
        double selling_price = 191;
        double cost_price = 129;
        double profit = selling_price-cost_price;
        double profit_percentage = profit/cost_price*100;
        System.out.println("The Cost Price is INR "+cost_price+" and Selling Price is INR "+selling_price + "\n"+
        "The Profit is INR "+profit+" and the Profit Percentage is " + String.format("%.5f",profit_percentage));
    }
}