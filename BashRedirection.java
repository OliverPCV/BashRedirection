import java.util.Scanner;
import java.util.ArrayList;

class BashRedirection{
    public static void main(String args[]) {
        ArrayList<String> numbers = new ArrayList<String>();
        ArrayList<Integer> numbersInt = new ArrayList<Integer>();

        boolean condition = true;
        double sum = 0;
        double average;

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte cisla, pro vypocet a ukonceni programu zadejte 'end'");


        while(condition){
            String number = sc.nextLine();
            numbers.add(number);
            if(number.equals("end"))
                condition = false;
        }

        int delend = numbers.size() - 1;
        numbers.remove(delend);

        for(int j = 0; j < numbers.size(); j++){
            numbersInt.add(Integer.parseInt(numbers.get(j)));
        }


        for(int counter = 0; counter < numbersInt.size(); counter++){
            sum += numbersInt.get(counter);
        }

        average = sum / numbersInt.size();

        int biggest = numbersInt.get(0);
        int smallest = numbersInt.get(0);


        for(int i = 0; i < numbersInt.size(); i++){
            if(numbersInt.get(i) > biggest)
                biggest = numbersInt.get(i);
        }

        for(int s = 0; s < numbersInt.size(); s++){
            if(numbersInt.get(s) < smallest)
                smallest = numbersInt.get(s);
        }
        
        System.out.println("Soucet cisel :" + sum);
        System.out.println("Prumer cisel :" + average);
        System.out.println("Nejvetsi cislo z cisel :" + biggest);
        System.out.println("Nejmensi cislo z cisel :" + smallest);

    }

}