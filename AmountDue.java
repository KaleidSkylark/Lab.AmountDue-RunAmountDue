import java.util.Scanner;
public class RunAmountDue {
    public static void main (String[] args){
        AmountDue shop = new AmountDue();
        Scanner a = new Scanner(System.in);
        System.out.println("Press any of the following then enter values separated by space: ");
        System.out.println("1 - Price Only \n2 - Price and Quantity \n3 - Price,Quantity and discount");
        
        int userInput = a.nextInt();
        if (userInput == 1){
            double x = a.nextDouble(); 
            System.out.println("Amount due is "+shop.computeAmountDue(x));
        }
        else if (userInput == 2){
            double x = a.nextDouble();
            double y = a.nextDouble();
            System.out.println("Amount due is "+shop.computeAmountDue(x,y));
        }
        else if (userInput == 3){
            double x = a.nextDouble();
            double y = a.nextDouble();
            double z = a.nextDouble();
            System.out.println("Amount due is "+shop.computeAmountDue(x,y,z));

        }
        else if (userInput <=4 ){ 
            System.out.println("Wrong Values!!");
        }
    }
}
