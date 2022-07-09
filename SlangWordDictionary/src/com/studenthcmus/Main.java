package com.studenthcmus;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	SlangWordApp app = new SlangWordApp();
    app.loadData("slang.txt");
    app.run();
    app.saveData("slang.txt");
    }
}

class SlangWordApp{
    public void run(){
        int id =0 ;
        do {
            clearScreen();
            System.out.println("\t---Welcome to Slang Word List Application---");
            System.out.println("1. Search by slang word\t\t\t6. Delete slang word");
            System.out.println("2. Search by definition\t\t\t7. Restore backup");
            System.out.println("3. View search history\t\t\t8. On this day slang word");
            System.out.println("4. Add new slang word\t\t\t9. Random game: guess the definition");
            System.out.println("5. Edit slang word\t\t\t10. Random game: guess the slang word");
            System.out.println("0. Exit");
            System.out.println("\t---------------------------------------------");
            if(id<0||id>10) {
                System.out.print("Invalid choice! Please enter your choice again: ");
            }
            else
            {
                System.out.print("Enter your choice: ");
            }

            BufferedReader bReader;
            try {
                bReader = new BufferedReader(new InputStreamReader(System.in, "utf-8"));
                String choice = bReader.readLine();
                if(isNumeric(choice)) {
                    id = Integer.parseInt(choice);
                }
                else{
                    id=-1;
                }
                switch (id) {
                    case 1:
                        clearScreen();
                        SearchSlangWord();
                        break;
                    case 2:
                        clearScreen();
                        SearchDefinition();
                        break;
                    case 3:
                        clearScreen();
                        ViewSearchHistory();
                        break;
                    case 4:
                        clearScreen();
                        AddNewWord();
                        break;
                    case 5:
                        clearScreen();
                        EditWord();
                        break;
                    case 6:
                        clearScreen();
                        DeleteWord();
                        break;
                    case 7:
                        clearScreen();
                        RestoreBackup();
                        break;
                    case 8:
                        clearScreen();
                        RandomWord();
                        break;
                    case 9:
                        clearScreen();
                        GuessDefinition();
                        break;
                    case 10:
                        clearScreen();
                        GuessSlangWord();
                        break;
                    case 0:
                        clearScreen();                        
                        System.out.println("Thank you for using Slang Word List Application!");
                        saveData("slang.txt");
                        System.exit(0);
                    default:
                        break;
                }
        } catch (  IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        } while (id<0||id>5);
    }


}
