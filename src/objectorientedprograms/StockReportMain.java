package objectorientedprograms;
import java.util.ArrayList;
import java.util.Scanner;

public class StockReportMain {
        static ArrayList<StockReport> arrayList = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            StockReportMain sr = new StockReportMain();
            System.out.println("@@@@@-------WELCOME TO STOCK REPORT-------@@@@@");
            while (true) {
                System.out.println("Enter your choice.....!!! \n1) Enter new Stock: " +
                        "\n2) Display Stock Report:" + "\n3) exit:");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        sr.addStocks();
                        return;
                    case 2:
                        sr.stockReport();
                        return;
                    case 3: {
                        System.out.println("Exiting");
                        System.exit(0);
                    }
                    default:
                        System.out.println("Invalid input");

                }
            }
        }

        public void addStocks() {
            StockReport stock = new StockReport();
            System.out.println("Enter the stock name");
            stock.setStockNames(scanner.next());

            System.out.println("Enter the number of shares present");
            stock.setNumOfShare(scanner.nextDouble());

            System.out.println("Enter the share price");
            stock.setSharePrice(scanner.nextDouble());

            //adding object to array list
            arrayList.add(stock);

        }

        public void stockReport() {
            Double sum = 0.0;
            System.out.println("$$$$$$$$$$$$$ STOCK REPORT $$$$$$$$$$$$$$$$");
            System.out.println("stock name            Number of shares         Stock price        Total price of stock ");
            for (int i = 0; i < arrayList.size(); i++) {
                StockReport s = arrayList.get(i);
                double totalPrice = s.getNumOfShare() * s.getSharePrice();
                totalPrice = sum + totalPrice;
//            System.out.format("stock name = " + s.getStockNames() + "\number of shares = " + s.getNumOfShare() +
//                    "\n stock price = " + s.getSharePrice() + "\nTotal price of stock = " + totalPrice + "\n");
                System.out.format("%-10s            %-10.3f               %-10.3f         %-10.3f\n", s.getStockNames(), s.getNumOfShare(), s.getSharePrice(), totalPrice);

            }
        }

    }
