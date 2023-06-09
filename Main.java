import java.util.Scanner;

public class Main {
  private Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    /** Создаем объект акции с именем SB, обозначением ПАО, стоимости на момент закрытия предыдущего дня = 281.50, стоимости акции в настоящий момент = 282.87 */
    Stock stock = new Stock("SB", "ПАО", 281.50, 282.87);
        
    System.out.println("\n********************************************");
    System.out.println("\nПрограмма для представления акции компании");
    System.out.println("\n********************************************");
      
    Main choiceMenu = new Main();
    
    int choice = choiceMenu.getMenuSelection();
    
    if(choice == 1){
    
    /** Выводим данные об акции */
    System.out.println("Данные об акции: " + "\nНаименование акции: " + stock.symbol + "\nОбозначение акции: " + stock.name + "\nСтоимость акции на момент закрытия предыдущего дня: " + stock.previousClosingPrice + "\nСтоимость акции в настоящий момент: " + stock.getCurrentPrice());
        
    }
    
    else if(choice == 2){
     
    /** Выводим процент изменения стоимости акции */
    System.out.println("Процент изменения стоимости акции: " + stock.getChangePercent() + "%");
        
    }
    
    else {
      
    }
    
  }
  
  /** Метод для получения меню выбора программы */  
  public int getMenuSelection(){
    int choice;
        
    Scanner input = new Scanner(System.in);
          
    while(true){
        
    System.out.println("\tОсновное меню:");
    System.out.println("1: Отображение данных об акции:");
    System.out.println("2: Отображение процента изменения стоимости акции:");
    System.out.print("\tВвод:");
        
    choice = input.nextInt();
    System.out.println("\n********************************************");
      
    if(choice < 1 || choice > 2){
    System.out.println("\tНекорректный пункт меню:");
        
    System.out.println("\n--------------------------------------------");
      
    }
              
    else {
      break;
    }
      
    }
        
    return choice;
      
  }
  
}