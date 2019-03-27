package A3_p2;

public class A3_p2 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","Oracle Corporation",35.5);
        stock.setNewCurrentPrice(35.35);

        System.out.println("Stock :: Price Change in percentage : "+stock.getChangePercent());
    }
}
