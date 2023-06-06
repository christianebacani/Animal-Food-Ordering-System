import java.util.Scanner;
public class AnimalFoodShopSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {580,680,780,880,980,1090,1190,590,690,790,890,990};
        int total = 0;
        boolean transaction = true;
        
        System.out.print("Animal Food Shop!\n");
        System.out.print("Username : ");
        String username = input.nextLine();
        
        System.out.print("Password : ");
        String password = input.nextLine();
        
        while(transaction){
            
        System.out.print("\n    AVAILABLE ANIMAL FOODS\n\n");
        System.out.print("CAT FOODS\t\tPRICE\n\n");
        System.out.print("1.) Farmina\t\tP 580\n\n");
        System.out.print("2.) VetDiet\t\tP 680\n\n");
        System.out.print("3.) Royal Canin\t\tP 780\n\n");
        System.out.print("4.) Hill's Science Diet P 880\n\n");
        System.out.print("5.) Whiskas    \t\tP 990\n\n");
        System.out.print("6.) Nature's Logic\tP 1090\n\n");
        System.out.print("7.) Purina Pro Plan\tP 1190\n\n\n");
        System.out.print("DOG FOODS\t\tPRICE\n\n");
        System.out.print("8.) Pupper Fuel\t\tP 590\n\n");
        System.out.print("9.) Wellness   \t\tP 690\n\n");
        System.out.print("10.) Canidae   \t\tP 790\n\n");
        System.out.print("11.) Instinct  \t\tP 890\n\n");
        System.out.print("12.) Orijen    \t\tP 990\n\n");
        
        
        
        System.out.print("Enter your order here : ");
        int order = input.nextInt();
        
        System.out.print("Enter the quantity here : ");
        int quantity = input.nextInt();
        
        total += price[order - 1] * quantity;
        
        System.out.print("Do you want to order more (y/n)?: ");
        input.nextLine();
        String buyMore = input.nextLine();
        
        if(buyMore.equalsIgnoreCase("n")){
            transaction = false;
            System.out.print("The total price is : P " + total + "\n");
            
            System.out.print("Enter your payment here : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            
            System.out.print("Change : P " + change + "\n\n");
            
        }
        
        }
        
        
        
        
        
    }
}
