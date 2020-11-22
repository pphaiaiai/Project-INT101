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
        int inputPassword = input.nextInt();
        if (inputPassword == etc.getPassword()) {
            System.out.println("\n");
            System.out.println(">>> Correct <<<");
        } else {
            System.out.println("");
            System.out.println(">>> User or Password incorrect <<<\n");
            FoodApp();
        }

        while (true) {
            System.out.println("\n");
            System.out.println("-------- Welcome to NetCaféFoodSevice --------");
            System.out.println("Choose Menu");
            System.out.println("1.)Select Order");
            System.out.println("2.)Remaining Amount");
            System.out.println("3.)Top up Money");
            System.out.println("4.)Exit");
            System.out.println("-----------------------------------------------\n");
            System.out.print("Choose Menu :");

            int choose = sc.nextInt();

            switch (choose) {

                case 1:
                    System.out.println("\n");

                case 2:
                    System.out.println("\n");
                    System.out.print("Remaining Amount: ");
                    System.out.println(da.getRemainingAmount());
                case 3:
                    System.out.println("Money");
                case 4:
                    System.exit(0);
                    break;

            }

        }
    }

}
