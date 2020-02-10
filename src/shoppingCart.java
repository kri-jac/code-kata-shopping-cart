import java.util.Scanner;

public class shoppingCart {

    public static void main(String [] args){

        // receive an input string with the items
        System.out.print("Enter the list of items (use capital letters and no spaces): ");
        Scanner input = new Scanner(System.in);
        String list = input.next();

        // store the number of items for the items with discount (A and B)
        int as = 0;
        int bs = 0;

        // store the total amount
        int total = 0;

        // iterate through the string, add each item to the total, count number of items where discounts may apply
        for(int i = 0; i < list.length(); i++){
            char a = list.charAt(i);
            switch(a){
                case 'A':
                    as ++;
                    total += 50;
                    break;
                case 'B':
                    bs ++;
                    total += 30;
                    break;
                case 'C':
                    total += 20;
                    break;
                case 'D':
                    total += 10;
                    break;
                default:
                    total += 0;
            }
        }

        // apply discounts if pertinent
        if(as >= 3){
            total = total - ((as/3)*20);
        }
        if(bs >= 2){
            total = total - ((bs/2)*23);
        }

        System.out.println("Your total is: " + total);
    }
}
