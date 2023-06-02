public class Stock {
    public String symbol; /** Обозначение акции */
    public String name; /** Наименование акции */
    public double previousClosingPrice; /** Стоимость акции на момент закрытия предыдущего дня */
    public double currentPrice; /** Стоимость акции в настоящий момент */
        
    /** Конструктор класса Stock */
     public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        /** Инициализация полей данных */
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
        
    /** Метод для получения процентного изменения стоимости акции */
    public double getChangePercent() {
        double percentChange = ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;
        return Double.parseDouble(String.format("%.2f", percentChange)); /** Возвращаем процентное изменение, округленное до двух десятичных знаков */
    }
}