package classes7;

import java.util.Scanner;
public class PoliticalAffiliation {

    public static void main(String[] args) {

        String input;

        Scanner sc = new Scanner(System.in);

        System.out.println("Select your party affiliation");

        System.out.println("D for Democrat");

        System.out.println("R for Republican");

        System.out.println("I for Independent");

        System.out.print("Enter your choice : ");

        input = sc.nextLine();

        char c;

        if(input.length()!=0){

            c = input.charAt(0);

        }else{

            c = 'O';

        }

        if(c=='D'){

            System.out.println("You get a Democratic Donkey.");

        }else if(c=='R'){

            System.out.println("You get a Republican Elephant.");

        }else if(c=='I'){

            System.out.println("You get an Independent Person.");

        }else{

            System.out.println("You get an Other");

        }

    }

}