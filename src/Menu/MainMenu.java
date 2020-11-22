package Menu;

import Goods.Goods;
import Goods.SetGoods;
import etc.Login;
import OrderSystem.Data;
import OrderSystem.FoodName;
import java.util.Arrays;
import java.util.Scanner;

public class MainMenu {

    Login etc = new Login();
    Data da = new Data();
    Scanner sc = new Scanner(System.in);
    SetGoods sg = new SetGoods(15);

    public MainMenu() {
        sg.append(new Goods(1, FoodName.Pizza, 129, 10));
        sg.append(new Goods(2, FoodName.Hamburgaer, 69, 10));
        sg.append(new Goods(3, FoodName.Spaghetti, 59, 10));
        sg.append(new Goods(4, FoodName.Fried_Chicken, 99, 10));
        sg.append(new Goods(5, FoodName.Friend_Fried, 35, 10));
        sg.append(new Goods(6, FoodName.Coke, 18, 10));
        sg.append(new Goods(7, FoodName.Sprite, 15, 10));
        sg.append(new Goods(8, FoodName.Fanta, 15, 10));
        sg.append(new Goods(9, FoodName.Pepsi, 15, 10));
        sg.append(new Goods(10, FoodName.Est, 10, 10));
        sg.append(new Goods(11, FoodName.Lay, 30, 10));
        sg.append(new Goods(12, FoodName.Tasto, 20, 10));
        sg.append(new Goods(13, FoodName.Pocky, 20, 10));
        sg.append(new Goods(14, FoodName.Khakai, 15, 10));
        sg.append(new Goods(15, FoodName.Bread, 12, 10));
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
                    System.out.print(sg);
                    System.out.println("");
                    System.out.print("Remaining Money Amount: ");
                    System.out.println(da.getRemainingAmount() + "฿");
                    System.out.print("Select Order Number: ");
                    int number = sc.nextInt();
                    int amount;
                    System.out.println();
                    switch (number) {
                        case 1:
                            System.out.println(SetGoods.goods[0]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[0].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[0].getPrice() * amount) && amount<=SetGoods.goods[0].getStock()) {
                                da.spending(SetGoods.goods[0].getPrice() * amount);
                                SetGoods.goods[0].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[0].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 2:
                            System.out.println(SetGoods.goods[1]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[1].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[1].getPrice() * amount) && amount<=SetGoods.goods[1].getStock()) {
                                da.spending(SetGoods.goods[1].getPrice() * amount);
                                SetGoods.goods[1].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[1].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 3:
                            System.out.println(SetGoods.goods[2]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[2].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[2].getPrice() * amount) && amount<=SetGoods.goods[2].getStock()) {
                                da.spending(SetGoods.goods[2].getPrice() * amount);
                                SetGoods.goods[2].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[2].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 4:
                            System.out.println(SetGoods.goods[3]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[3].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[3].getPrice() * amount) && amount<=SetGoods.goods[3].getStock()) {
                                da.spending(SetGoods.goods[3].getPrice() * amount);
                                SetGoods.goods[3].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[3].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 5:
                            System.out.println(SetGoods.goods[4]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[4].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[4].getPrice() * amount) && amount<=SetGoods.goods[4].getStock()) {
                                da.spending(SetGoods.goods[4].getPrice() * amount);
                                SetGoods.goods[4].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[4].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 6:
                            System.out.println(SetGoods.goods[5]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[5].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[5].getPrice() * amount) && amount<=SetGoods.goods[5].getStock()) {
                                da.spending(SetGoods.goods[5].getPrice() * amount);
                                SetGoods.goods[5].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[5].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 7:
                            System.out.println(SetGoods.goods[6]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[6].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[6].getPrice() * amount) && amount<=SetGoods.goods[6].getStock()) {
                                da.spending(SetGoods.goods[6].getPrice() * amount);
                                SetGoods.goods[6].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[6].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 8:
                            System.out.println(SetGoods.goods[7]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[7].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[7].getPrice() * amount) && amount<=SetGoods.goods[7].getStock()) {
                                da.spending(SetGoods.goods[7].getPrice() * amount);
                                SetGoods.goods[7].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[7].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 9:
                            System.out.println(SetGoods.goods[8]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[8].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[8].getPrice() * amount) && amount<=SetGoods.goods[8].getStock()) {
                                da.spending(SetGoods.goods[8].getPrice() * amount);
                                SetGoods.goods[8].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[8].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 10:
                            System.out.println(SetGoods.goods[9]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[9].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[9].getPrice() * amount) && amount<=SetGoods.goods[9].getStock()) {
                                da.spending(SetGoods.goods[9].getPrice() * amount);
                                SetGoods.goods[9].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[9].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 11:
                            System.out.println(SetGoods.goods[10]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[10].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[10].getPrice() * amount) && amount<=SetGoods.goods[10].getStock()) {
                                da.spending(SetGoods.goods[10].getPrice() * amount);
                                SetGoods.goods[10].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[10].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 12:
                            System.out.println(SetGoods.goods[11]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[11].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[11].getPrice() * amount) && amount<=SetGoods.goods[11].getStock()) {
                                da.spending(SetGoods.goods[11].getPrice() * amount);
                                SetGoods.goods[11].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[11].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 13:
                            System.out.println(SetGoods.goods[12]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[12].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[12].getPrice() * amount) && amount<=SetGoods.goods[12].getStock()) {
                                da.spending(SetGoods.goods[12].getPrice() * amount);
                                SetGoods.goods[12].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[12].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 14:
                            System.out.println(SetGoods.goods[13]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[13].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[13].getPrice() * amount) && amount<=SetGoods.goods[13].getStock()) {
                                da.spending(SetGoods.goods[13].getPrice() * amount);
                                SetGoods.goods[13].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[13].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                        case 15:
                            System.out.println(SetGoods.goods[14]);
                            System.out.print("Input number of your select: ");
                            amount = sc.nextInt();
                            System.out.println("Total prices: " + (SetGoods.goods[14].getPrice() * amount));
                            if (da.getRemainingAmount() >= (SetGoods.goods[14].getPrice() * amount) && amount<=SetGoods.goods[14].getStock()) {
                                da.spending(SetGoods.goods[14].getPrice() * amount);
                                SetGoods.goods[14].decreaseStock(amount);
                                System.out.print("Remaining Money Amount: ");
                                System.out.println(da.getRemainingAmount() + "฿");
                                System.out.println("You get: " + SetGoods.goods[14].getName() + " Amount: " + amount + "EA");
                            } else {
                                System.out.println("You don't have enough money or It's out of Stocks.");
                            }
                            break;
                    }

                    break;

                case 2:
                    System.out.println("\n");
                    System.out.print("Remaining Money Amount: ");
                    System.out.println(da.getRemainingAmount() + "฿");
                    break;
                case 3:
                    int topup = 0;
                    int x = 0;
                    do {
                        System.out.println("**[Minimum Top up 50฿]**");
                        System.out.print("Money Amounts: ");
                        topup = sc.nextInt();
                        System.out.println("฿");
                        if (topup >= 50) {
                            System.out.println("Remaining Money Amount: " + da.topup(topup) + "฿");
                        } else {
                            da.topup(0);
                            System.out.println("** Please insert money again with more than or equal 50฿ **");
                            String e = "1. Continue topup.\n" + "2. Back to Menu";
                            System.out.println(e);
                            System.out.print("Choose Menu :");
                            x = sc.nextInt();
                            System.out.println("");
                            switch (x) {
                                case 1:
                                    if (topup >= 50) {
                                        System.out.println("Remaining Money Amount: " + da.topup(topup) + "฿");
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
