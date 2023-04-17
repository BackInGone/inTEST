package inTEST;

import org.w3c.dom.ls.LSOutput;

public class Trainer extends inTEST.Person {

    public int money;
    public boolean istrainer = true;

    Trainer() {
            for (int i = 0; i < 5; i++) {
                pokelist[i] = new Pocketmon(i*40,i+1);
                pokelist[i].index = i;
            }
    }
//
//    Pocketmon pocke1 = new Pocketmon();
//    Pocketmon pocke2 = new Pocketmon();
//    Pocketmon pocke3 = new Pocketmon();
//    Pocketmon pocke4 = new Pocketmon();
//    Pocketmon pocke5 = new Pocketmon();
//    Pocketmon pocke6 = new Pocketmon();

    //    int index[] = new int[5];
    Pocketmon[] pokelist = new Pocketmon[5];
    public Pocketmon[] getPokelist() {
        return pokelist;
    }


    public void TrainerControl() {

        System.out.println("istrainer check = " + istrainer);
        if (istrainer) {
            for (int i = 0; i < pokelist.length; i++) {
                System.out.println("for문에서 출력 = "+ pokelist[i] + " + index =" + pokelist[i].index);

            }
            pokelist[0] = new Pocketmon(30, 1);


            item traineritem = new item();
            Trainer trainer1 = new Trainer();
            Pocketmon trainerPocketmon = new Pocketmon();

            item sameitem = new item();
            Trainer sametrainer = new Trainer();
            Pocketmon samePocketmon = new Pocketmon();

            traineritem.makeitemlist();

            trainerPocketmon.hp += 1;
            traineritem.potion += 1;
            trainer1.money += 1;
            System.out.println("★★★ trainer class ★★★");
            System.out.println("trainerpockeHP in Trainer class" + trainerPocketmon.hp);
            System.out.println("trainerpocke address in Trainer class  " + trainerPocketmon);
            System.out.println("samepockeHP in Trainer class" + samePocketmon.hp);
            System.out.println("samepocke address in Trainer class" + samePocketmon);
            System.out.println("potion in trainer class " + traineritem.potion);
            System.out.println("traineritem address in trainer class   " + traineritem);
            System.out.println("itemlist in Trainer class= " + traineritem.itemlist3);
            System.out.println("trainer1 address in trainer class   " + trainer1);
            System.out.println("sameitem potion in Trainer class= " + sameitem.potion);
            System.out.println("sameitem address in main class= " + sameitem);
            System.out.println("sameitem itemlist in Trainer class= " + sameitem.itemlist3);
            System.out.println("sameitem address in main class= " + sameitem);
            System.out.println("sametrainer addresss in main class" + sametrainer);

            for (int i = 0; i < 5; i++) {

                System.out.println(trainer1.pokelist[i]);
                System.out.println("hp  = " + trainer1.pokelist[i].hp + i * 20);
                System.out.println("index  = " + trainer1.pokelist[i].index);

            }
            System.out.println("sametrainer money in trainer class" + sametrainer.money + "\n\n\n\n");
        }
    }
}

    // int index[] = new int[5]
    // for(int i = 0 ; i>5 ; i++){
    //     // System.out.print("a" + i + ": " + eval("a" + i) + " ");
    // }

    // public void TrainerControl(){


    // }



