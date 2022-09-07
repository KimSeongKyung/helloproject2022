package org.example;
import java.util.Scanner;
public class WordManager {
   Scanner sc = new Scanner(System.in);
   WordCRUD wordCRUD;

   WordManager() {
       wordCRUD = new WordCRUD(sc);
   }
    public int selectMenu() {

        return 0;
    }
    public void start() {
        while(true) {
            int menu = selectMenu();
            if(menu == 0) break;
            if(menu == 4) {
                //
            }
            else if(menu == 1){
                //
            }
        }
    }
}


