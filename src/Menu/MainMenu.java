package Menu;

import etc.Login;
import OrderSystem.Data;
import java.util.Scanner;

public class MainMenu {

    Login etc = new Login();
    Data da = new Data();
    Scanner sc = new Scanner(System.in);

    public MainMenu() {
        FoodApp();

    }

    public void FoodApp() {
        Scanner input = new Scanner(System.in);

        System.out.print("User :");
        String inputUser = input.nextLine();

        if (inputUser.equals(etc.getUser())) {
            System.out.print("Password :");
        } else {
            System.out.println("");
            System.out.println(">>> User or Password incorrect <<<\n");
            FoodApp();
        }
        String inputPassword = input.nextLine();
        if (inputPassword.equals(etc.getPassword())) {
            System.out.println("\n");
            System.out.println(">>> Correct <<<");
        } else {
            System.out.println("");
            System.out.println(">>> User or Password incorrect <<<\n");
            FoodApp();
        }

        while (true) {
            Menu();

            int choose = sc.nextInt();

            switch (choose) {

                case 1:
                    System.out.println("\n");

                case 2:
                    System.out.println("\n");
                    System.out.print("Remaining Amount: ");
                    System.out.println(da.getRemainingAmount());
                    break;
                case 3:
                    int topup = 0;
                    int x = 0;
                    do {
                        System.out.println("**[Minimum Top up 50฿]**");
                        System.out.print("Money Amounts: ");
                        topup = sc.nextInt();
                        if (topup >= 50) {
                            System.out.println("Remaining Amount: " + da.topup(topup));
                        } else {
                            da.topup(0);
                            System.out.println("** Please insert money again with more than or equal 50฿ **");
                            String e = "1. Continue topup.\n" + "2. Close Program.";
                            System.out.println(e);
                            System.out.print("Choose Menu :");
                            x = sc.nextInt();
                            switch (x) {
                                case 1:
                                    if (topup >= 50) {
                                        System.out.println("Remaining Amount: " + da.topup(topup));
                                    }
                                    break;
                                case 2:
                                    break;
                            }
                        }

                    } while (topup < 50 && x != 2);
                    break;

                case 4:
                    System.exit(0);
                    break;

            }

        }

    }

    public static void Menu() {
        System.out.println("\n");
        System.out.println("-------- Welcome to NetCaféFoodSevice --------");
        System.out.println("Choose Menu");
        System.out.println("1.)Select Order");
        System.out.println("2.)Remaining Amount");
        System.out.println("3.)Top up Money");
        System.out.println("4.)Exit");
        System.out.println("-----------------------------------------------\n");
        System.out.print("Choose Menu :");
    }

}
