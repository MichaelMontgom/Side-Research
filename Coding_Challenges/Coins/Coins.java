import java.util.Scanner;



public class Coins {

    public enum CoinValues{
        QUARTER(25), DIME(10), NICKEL(05), PENNY(1);
        
        private int value;
        private CoinValues(int value){
            this.value = value;
        }

    }

    public static void main(String[] args){

        double input;
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter change amount to get coins (ex. 0.75): ");

            input = Double.parseDouble(scanner.nextLine());

            getCoins(input);

        }
        catch(Exception e){
            e.getMessage();
        }
        
        
        
    }



    public static void getCoins(double change){
        int numOfQuarters = 0; 
        int numOfDimes = 0; 
        int numOfNickels = 0;
        int numOfPennies = 0;

        change = change * 100;

        if(change/CoinValues.QUARTER.value >= 1){
            numOfQuarters = (int)Math.floor(change/CoinValues.QUARTER.value);
            change = change - numOfQuarters*25;
        }

        if(change/CoinValues.DIME.value >= 1){
            numOfDimes = (int)Math.floor(change/CoinValues.DIME.value);
            change = change - numOfDimes*10;
        }

        if(change/CoinValues.NICKEL.value >= 1){
            numOfNickels = (int)Math.floor(change/CoinValues.NICKEL.value);
            change = change - numOfNickels*5;
        }

        if(change/CoinValues.PENNY.value >= 1){
            numOfPennies = (int)Math.floor(change/CoinValues.PENNY.value);
            change = change - numOfPennies*1;
        }

        System.out.println(String.format("Quarters: %d \nDimes: %d \nNickels: %d \nPennies: %d", numOfQuarters, numOfDimes, numOfNickels, numOfPennies));
        


    }

}