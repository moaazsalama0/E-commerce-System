package com.Moaaz.project1;
import javax.swing.JOptionPane;

public class EcommerceSystemGUI{
    public static void main(String[] args){

        String idInput = JOptionPane.showInputDialog("Enter your ID:");
        int id = Integer.parseInt(idInput);

        String name = JOptionPane.showInputDialog("Enter your name:");
        String address = JOptionPane.showInputDialog("Enter your address:");

        Customer customer = new Customer(id, name, address);

        String sizeInput = JOptionPane.showInputDialog("How many Products do you want to add to your cart:");
        int size = Integer.parseInt(sizeInput);
        Cart cart = new Cart(customer.getCustomerId(), size);

        for (int i = 0; i < size; i++) {
            String choiceInput = JOptionPane.showInputDialog("Which product do you want to add?\n1- Smartphone\n2- T-shirt\n3- OOP");
            int choice = Integer.parseInt(choiceInput);
            Product product;
            switch(choice){
                case 1:
                    product = new ElectronicProduct(1, "Smartphone", 599.9f, "Samsung", 1);
                    break;
                case 2:
                    product = new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");
                    break;
                case 3:
                    product = new BookProduct(3, "OOP", 39.99f, "O’Reilly", "X Publications");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice, try again");
                    i--;
                    continue;
            }
            cart.addProduct(product, i);
        }

        int confirmOrder = JOptionPane.showConfirmDialog(null, "Your total is " + cart.calculatePrice() + ". Would you like to order?", "Order Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirmOrder == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Here is your order summary:\n" + cart.printOrderInfo());
        } else {
            JOptionPane.showMessageDialog(null, "Thank you for shopping!");
        }
    }
}
