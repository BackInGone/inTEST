package inTEST;

import java.util.Scanner;

public class battle {

    static int mypokeHP;
    static int opppokeHP;
    static int mypokeExp;
    static int gainMoney;


public static void main(String[] args) {


    System.out.println("start");

    play();
    battleStart();

    }




    public static void play() {

        item mainitem = new item();
        Pocketmon mainpocke = new Pocketmon();
        Trainer maintrainer = new Trainer();
        Trainer oppotrainer = new Trainer();


        item sameitem = new item();
        Trainer sametrainer = new Trainer();
        Pocketmon samePocketmon = new Pocketmon();

        mainitem.ItemControl();
        mainpocke.PocketmonControl();
        maintrainer.TrainerControl();
        mainitem.makeitemlist();


        System.out.println("★★★ battle class ★★★");
        System.out.println("PokcetmonHP in mainclass" + mainpocke.hp);
        System.out.println("Pokcetmon address in mainclass   " + mainpocke);
        System.out.println("item potion  in mainclass" + mainitem.potion);
        System.out.println("item address in mainclass    " + mainitem);
        System.out.println("trainer money in mainclass" + maintrainer.money);
        System.out.println("trainer address in mainclass" + maintrainer);

        System.out.println("sameitem potion in main class= " + sameitem.potion);
        System.out.println("sameitem address in main class= " + sameitem);
        System.out.println("sameitem itemlist in main class= " + sameitem.itemlist3);
        System.out.println("sameitem address in main class= " + sameitem);
        System.out.println("sametrainer money in main class" + sametrainer.money);
        System.out.println("sametrainer addresss in main class" + sametrainer);
        System.out.println("samepocketmon HP in main class" + samePocketmon.hp + "\n\n");

        for (int i = 0; i<5 ; i++) {
            System.out.println(maintrainer.pokelist[i]);
            System.out.println(maintrainer.pokelist[i].hp+i*20);
        }

    }


    public static void battleStart() {
        while (true) {
            if(공격){
                Scanner scan = new Scanner(System.in);

                switch(scan.nextInt()){
                    case 1 :{}
                    case 2 : {}
                    case 3 :{}
                    case 4 : {}
                }
            }
            if (포켓몬교체){
                maintrainer.
            }
            if(아이템사용) {
            }
            if(나가기){
                braek;

            }
        }
    }

}

