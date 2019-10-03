//this is nation simulator. the game of being a country//

import java.util.*;
import java.lang.*;

//turn structure
//1 world report
//2 country event
//3 actions

public class main extends nation{
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

  static nation psetup(){
    Scanner keyboard = new Scanner(System.in);
    nation Player = new nation(); //object for the player's country

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
    print("All hail "+pname+", king of the "+cont+" country "+cname);

    Player.name = cname;
    Player.cont = cont;
    Player.king = pname;

    return Player;
  }

  static nation [] gsetup(nation Player){
    //define all of the information about countries you deal with
    nation Jamaica = new nation();
    Jamaica.name = "Jamaica";
    Jamaica.cont = "America";
    Jamaica.king = "Norman Manely";
    nation Zaire = new nation();
    Zaire.name = "Zaire";
    Zaire.cont = "Africa";
    Zaire.king = "Robert Mugabe";
    nation Burma = new nation();
    Burma.name = "Burma";
    Burma.cont = "Asia";
    Burma.king = "Than Shwe";
    nation [] nations = {Jamaica,Zaire,Burma,Player};
    return nations;
  }

  static nation report(nation nations){
    nation Player = nations[3];
    //first part of a turn. just gives surface level info about other countries
    print("---------------------------------\n");
    print(Player.name+"'s Turn!")
    print("---------------------------------\n");
    print("\n");
    print("---------------------------------\n");
    print("World Report:\n");
    //check to see if different nations qualify for info
    for(int i = 0; i<4;i++){
      //economic info
      if (nations[i].money<=0){
        print("-"+nation[i].name+" is broke!")
      }
      else if (nations[i].money<=10000){
        print("-"+nation[i].name+"'s coffers are running low.")
      }
      else if (nation[i].money<500000){
        print("-"+nation[i].name+" is Rich!")
      }
    }
  }

  static void turn(nations){
    //manage turn order
    report(nations);
  }

  public static void main(String[] args){
    //manage gameplay order
    intro();
    nation Player = psetup();
    nation [] nations = gsetup(Player);
    while (gameon){
      turn(nations);

    }//turn
  }//Close main
}//close class
