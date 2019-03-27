package A3_p2;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol,String name,double previousClosingPrice)
    {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = previousClosingPrice; // at very first previous price and current price are equal
    }

    public void setNewCurrentPrice(double currentPrice)
    {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent()
    {
        return ((Math.abs(this.currentPrice - this.previousClosingPrice))/previousClosingPrice)*100;
    }
}
