//this is Nation simulator. the game of being a country//

import java.util.*;
import java.lang.*;

//each city gives 100 industry strength and culture//
//boosting imporves that for one city//

//turn structure
//1 world report
//2 country event
//3 actions

//actions
//boost - for each 100 you spend, you can boost strength, industry, or culture//

public class main extends Nation{
  static boolean gameon = true;//this is to check if the game should keep running
  static void print(String inp){
    //make it more like python
    System.out.print(inp);
  }

  static void intro(){
    //introduction//
    Scanner keyboard = new Scanner(System.in);

    print("---------------------------------\n");
    print("---Welcome to Nation Simulator---\n");
    print("---------------------------------\n");
    print("");
    print("would you like to begin a new game?\n");
    print("(y/n):");
    String choice = keyboard.nextLine();

    //decide if you want to play or not//
    if (choice.equals("y")){
      return;
    }
    else{
      System.exit(0);
    }
  }

  static Nation psetup(){
    Scanner keyboard = new Scanner(System.in);
    Nation Player = new Nation(); //object for the player's country

    print("---------------------------------\n");
    print("\n");
    print("\n");
    print("---------------------------------\n");
    print("What continent would you like to start a country on?\n");
    String cont = keyboard.nextLine();
    print("\n");
    if (cont.substring(cont.length()-1).equals("a")){
      cont = cont+"n";
    }
    else{
      cont = cont+"an";
    }
    print("What would you like to name your country?\n");
    String cname = keyboard.nextLine();
    print("\n");
    print("And what is your name?\n");
    String pname = keyboard.nextLine();
    print("\n");
    print("All hail "+pname+", king of the "+cont+" country "+cname+"\n");

    Player.name = cname;
    Player.cont = cont;
    Player.king = pname;

    return Player;
  }

  static Nation [] gsetup(Nation Player){
    //define all of the information about countries you deal with
    Nation Jamaica = new Nation();
    Jamaica.name = "Jamaica";
    Jamaica.cont = "America";
    Jamaica.king = "Norman Manely";
    Nation Zaire = new Nation();
    Zaire.name = "Zaire";
    Zaire.cont = "Africa";
    Zaire.king = "Robert Mugabe";
    Nation Burma = new Nation();
    Burma.name = "Burma";
    Burma.cont = "Asia";
    Burma.king = "Than Shwe";
    Nation [] Nations = {Jamaica,Zaire,Burma,Player};
    return Nations;
  }

  static void report(Nation [] Nations){
    Nation Player = Nations[3];
    //first part of a turn. just gives surface level info about other countries
    print("---------------------------------\n");
    print(Player.name+"'s Turn!\n");
    print("---------------------------------\n");
    print("\n");
    print("---------------------------------\n");
    print("World Report:\n");
    //check to see if different Nations qualify for info
    for(int i = 0; i<4;i++){
      //economic info
      if (Nations[i].money<=0){
        print("-"+Nations[i].name+" is broke!\n");
      }
      else if (Nations[i].money<=10000){
        print("-"+Nations[i].name+"'s coffers are running low.\n");
      }
      else if (Nations[i].money>500000){
        print("-"+Nations[i].name+" is Rich!\n");
      }

      //industrial info
      if (Nations[i].industry>200){
        print("-"+Nations[i].name+" is getting industrial.\n");
      }
      else if (Nations[i].industry>350){
        print("-"+Nations[i].name+" is super industrial.\n");
      }
      else if (Nations[i].industry>500){
        print("-"+Nations[i].name+" is an industrial powerhouse!\n");
      }

      //culture info
      if (Nations[i].culture>200){
        print("-"+Nations[i].name+" is culturally progressing.\n");
      }
      else if (Nations[i].culture>350){
        print("-"+Nations[i].name+" has a thriving culture.\n");
      }
      else if (Nations[i].culture>500){
        print("-"+Nations[i].name+" is a cultural hub!\n");
      }

      //strength info
      if (Nations[i].strength<50){
        print("-"+Nations[i].name+" is ripe for the taking!\n");
      }
      if (Nations[i].strength>200){
        print("-"+Nations[i].name+" is getting stronger.\n");
      }
      else if (Nations[i].strength>200){
        print("-"+Nations[i].name+" is a forbidable power.\n");
      }
      else if (Nations[i].strength>200){
        print("-"+Nations[i].name+" is an unstoppable force of nature!\n");
      }

    }//close for loop
    print("---------------------------------\n");
  }//close world report

  static Nation [] yourgo(Nations){
    Scanner keyboard = new Scanner(System.in);
    print("\n");
    print("---------------------------------\n");
    print("How would you like to proceed?\n");
    print("1 - Boost Industry\n");
    print("2 - Boost Culture\n");
    print("3 - Boost Strength\n");
    print("4 - Start War\n");
    print("5 - Print Money\n")
    print("Your choice (number): ");
    String choice = keyboard.nextInt();
    print("---------------------------------\n");
    

  }

  static Nation [] turn(Nation [] Nations){
    //manage turn order
    report(Nations);
    Nation [] Nations = yourgo(Nations);
  }

  public static void main(String[] args){
    //manage gameplay order
    intro();
    Nation Player = psetup();
    Nation[] Nations = gsetup(Player);
    Nations[0].money = 600000;
    turn(Nations);
    //while (gameon){
      //turn(Nations);

    //turn
  }//Close main
}//close class
