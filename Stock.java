public class Stock {
  public String symbol; /** Обозначение акции */
  public String name; /** Наименование акции */
  public double previousClosingPrice; /** Стоимость акции на момент закрытия предыдущего дня */
  private double currentPrice; /** Стоимость акции в настоящий момент */
        
  public double getCurrentPrice() {
    return currentPrice;
  }
    
  public void setCurrentPrice (double currentPrice){
    this.currentPrice = currentPrice;
  }
  
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
    double percentChange = ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100; /** Находим процентное изменение, используя для расчётов значения стоимости акции на момент закрытия предыдущего дня и стоимости акции в настоящий момент */
    return Double.parseDouble(String.format("", percentChange)); /** Возвращаем процентное изменение, округленное до двух десятичных знаков */
  }
  
}