public class Main {
    public static void main(String[] args)
    {
        double totalPurchase = 0;
        double salesTax = 0;
        double purchasePrice = 35.00;
        double SALES_TAX_RATE = 0.05;

        salesTax = purchasePrice * SALES_TAX_RATE;
        totalPurchase = purchasePrice + salesTax;
        System.out.println("Your purchase price is: " + purchasePrice + " And your total price is: " + totalPurchase);






    }
}