class Stock {
    // Конструктор класса Stock
    constructor(symbol, name, previousClosingPrice, currentPrice) {
        // Инициализация полей данных
        this.symbol = symbol; // Обозначение акций
        this.name = name; // Наименование акций
        this.previousClosingPrice = previousClosingPrice; // Стоимость акций на момент закрытия предыдущего дня
        this.currentPrice = currentPrice; // Стоимость акций в настоящий момент
    }
    
    // Метод для получения процентного изменения стоимости акций
    getChangePercent() {
        let percentChange = ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;
        return percentChange.toFixed(2); // Возвращаем процентное изменение, округленное до двух десятичных знаков
    }
}

// Создаем объект акций с именем SB и обозначением ПАО
let stock = new Stock('SB', 'ПАО', 281.50, 282.87);

// Выводим процент изменения стоимости акций
console.log(`Процент изменения стоимости акций ${stock.name} (${stock.symbol}): ${stock.getChangePercent()}%`);
