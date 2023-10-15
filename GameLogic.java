package com.mycompany.textrpg3;

import java.util.Scanner;


public class GameLogic {
   static Scanner scanner = new Scanner(System.in);
   
   static Player player;
   
   //method to get user input from console
   
   public static int readInt(String prompt, int userChoices){
       int input;
       
     do{
         System.out.println(prompt);
         try{
             input = Integer.parseInt(scanner.next());
         }
         catch(Exception e){
             input = -1;
             System.out.println("por favor coloque um INT!");
         }
     }
     
     while(input < 1 || input > userChoices);
       return input;
   }
   
   // Java não tem o comando clear Console ent temos que criar uma função para simular
   public static void clearConsole(){
       for(int i = 0; i<50;i++)
           System.out.println();
   }
   //method to print a saparator with a lenth n
   public static void printSeparator(int n){
       for(int i = 0; i<n;i++)
           System.out.println("-");
           System.out.println();
   }
   
   //method to print a heading
   public static void printHeading(String title){
       printSeparator(15);
       System.out.println(title);
       printSeparator(15);
   }
   
   //method to stop the game until the player enters anything
   public static void anythigToContinue(){
       System.out.println("\nPressione algo para continuar...");
       scanner.next();
   }
   
   //method to start the game
   public static void startGame(){
       boolean nameSet = false;
       String name;
       //print title screen
       clearConsole();
       printSeparator(20);
       printSeparator(10);
       System.out.println("AGE OF THE EVIL EMPEROR");
       System.out.println("TEXT RPG");
       printSeparator(10);
       printSeparator(20);
       anythigToContinue();
       
       //getting the player name
       do{
           clearConsole();
           System.out.println("Qual é o seu nome?");
           name = scanner.next();
           //asking the player if he wants to correct his choice
           clearConsole();
           System.out.println("Seu nome e " + name + "\nIsso esta certo?");
           System.out.println("(1) sim esta correto!");
           System.out.println("(2) nao, este nao e meu nome!");
           int input = readInt("->", 2);
           if(input == 1)
               nameSet = true;
       }while(!nameSet);
       
       //create a new player object with the name
       player = new Player(name);
       
       //start main game loop
       //gameLoop();
   }
}
