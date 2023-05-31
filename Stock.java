    public class Stock {
        private String symbol; // Обозначение акций
        private String name; // Наименование акций
        private double previousClosingPrice; // Стоимость акций на момент закрытия предыдущего дня
        private double currentPrice; // Стоимость акций в настоящий момент
        
        // Конструктор класса Stock
        public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
            // Инициализация полей данных
            this.symbol = symbol;
            this.name = name;
            this.previousClosingPrice = previousClosingPrice;
            this.currentPrice = currentPrice;
        }
        
        // Метод для получения процентного изменения стоимости акций
        public double getChangePercent() {
            double percentChange = ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;
            return Double.parseDouble(String.format("%.2f", percentChange)); // Возвращаем процентное изменение, округленное до двух десятичных знаков
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            // Создаем объект акций с именем SB и обозначением ПАО
            Stock stock = new Stock("SB", "ПАО", 281.50, 282.87);
    
            // Выводим процент изменения стоимости акций
            System.out.printf("Процент изменения стоимости акций %s (%s): %.2f%%", stock.getName(), stock.getSymbol(), stock.getChangePercent());
        }
    }
