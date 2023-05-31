public class Main {
    public static void main(String[] args) {
        // Создаем объект акций с именем SB и обозначением ПАО
        Stock stock = new Stock("SB", "ПАО", 281.50, 282.87);

        // Выводим процент изменения стоимости акций
        System.out.printf("Процент изменения стоимости акций %s (%s): %.2f%%", stock.getName, stock.getSymbol, stock.getChangePercent());
    }
}
