package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Product> allProducts = new ArrayList<>();

        allProducts.add(new Book("Lord Of The Rings", "J.R.R. Tolkien", 5421, 60));
        allProducts.add(new Book("The God Delusion", "Richard Dawkins", 5656, 70));
        allProducts.add(new ChildrensBook("Alice in Wonderland", "Some author", 4235, 45, "from 6 years old"));
        allProducts.add(new Movie("Interstellar", MovieGenre.ACTION, "Christopher Nolan", 2153, 30));
        allProducts.add(new Movie("Spider-Man", MovieGenre.ACTION, "Sam Raimi", 2527, 25));

        System.out.println("Welcome in Books and Movies store. What do you want to do?");
        System.out.printf("1 - Print all products \n2 - Print books \n3 - Print childrens books \n4 - Print movies \n5 - Search by product ID\n");

        int userChoice = input.nextInt();

        if (userChoice == 1) {
            System.out.println("These are our all products: \n");
            for (Product product : allProducts) {
                System.out.println(product);
            }
        } else if (userChoice == 2) {
            for (Product product : allProducts) {
                if (product instanceof Book) {
                    System.out.println(product);
                }
            }
        } else if (userChoice == 3) {
            for (Product product : allProducts) {
                if (product instanceof ChildrensBook) {
                    System.out.println(product);
                }
            }
        } else if (userChoice == 4) {
            for (Product product : allProducts) {
                if (product instanceof Movie) {
                    System.out.println(product);
                }
            }
        } else if (userChoice == 5) {
            System.out.println("Type product ID: ");
            int productId = input.nextInt();
            for (Product product : allProducts) {
                if (product.getProductId() == productId) {
                    System.out.println(product);
                } else {
                    System.out.println("We don't have product with this ID");
                    break;
                }
            }
        } else {
            System.out.println("Wrong choice. Bye bye!");
        }
    }
}
