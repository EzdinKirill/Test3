public class Main {
    public static void main(String[] args) {
        /** Создаем объект акций с именем SB и обозначением ПАО */
        Stock stock = new Stock("SB", "ПАО", 281.50, 282.87);

        /** Выводим процент изменения стоимости акций */
        System.out.println("Procent izmeneniya stoimosti akcii: " + stock.getChangePercent() + "%");
    }
}
