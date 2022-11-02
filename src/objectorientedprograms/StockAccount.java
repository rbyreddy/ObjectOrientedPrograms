package objectorientedprograms;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {

        static Scanner scanner = new Scanner(System.in);
        ArrayList<StockReport> arrayList = new ArrayList<>();
        static double balance = 10000000;

        public void addStock() {
            StockReport stockReport;
            stockReport = new StockReport();
            double withdraw = 0;

            System.out.println(" Enter the stock name");
            scanner.nextLine();
            stockReport.setStockNames(scanner.nextLine());

            System.out.println("Enter the Number of shares");
            stockReport.setNumOfShare((double) scanner.nextInt());

            System.out.println("Enter the each share price");
            stockReport.setSharePrice(scanner.nextDouble());
            withdraw = stockReport.getSharePrice() * stockReport.getNumOfShare();
            if (balance >= withdraw) {
                balance = balance - withdraw;
                arrayList.add(stockReport);
                System.out.println("Remaining balance = " + balance);
            } else
                debit(withdraw);
        }


        public void printStockReport() {
            StockReport stockReport;
            stockReport = new StockReport();
            for (int i = 0; i < arrayList.size(); i++) {
                stockReport = arrayList.get(i);
                System.out.println(stockReport.toString());

            }
        }

        public void debit(double withdraw) {
            if (withdraw > balance) {
                System.out.println("Debit amount exceeded account balance.");
                System.out.println("Remaining balance = "+balance);
                System.out.println("withdraw = "+withdraw);
            }


        }

        public static void main(String[] args) {
            StockAccount stockManagement = new StockAccount();
            while (true) {
                System.out.println("Enter the selection\n1)addStock\n2)displayStockReport\n3)exit");
                byte choice = scanner.nextByte();
                switch (choice) {
                    case 1 -> stockManagement.addStock();
                    case 2 -> stockManagement.printStockReport();
                    case 3 -> System.exit(1);
                }
            }

        }

    }

