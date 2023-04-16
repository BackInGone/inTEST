package inTEST;
public class Trainer extends inTEST.Person {

    public int money;
    Trainer() {
    }

    Pocketmon pocke1 = new Pocketmon();
    Pocketmon pocke2 = new Pocketmon();
    Pocketmon pocke3 = new Pocketmon();
    Pocketmon pocke4 = new Pocketmon();
    Pocketmon pocke5 = new Pocketmon();
    Pocketmon pocke6 = new Pocketmon();

    int index[] = new int[5];

    public void TrainerControl(){

        item traineritem = new item();
        Trainer trainer1 = new Trainer();
        Pocketmon trainerPocketmon = new Pocketmon();

        item sameitem = new item();
        Trainer sametrainer = new Trainer();
        Pocketmon samePocketmon = new Pocketmon();

        traineritem.makeitemlist();

        trainerPocketmon.hp += 1;
        traineritem.potion +=1;
        trainer1.money +=1;
        System.out.println("trainerpockeHP in Trainer class" + trainerPocketmon.hp);
        System.out.println("samepockeHP in Trainer class" + samePocketmon.hp);
        System.out.println("potion in trainer class " + traineritem.potion);
        System.out.println("itemlist in Trainer class= " + traineritem.itemlist3);
        System.out.println("money in trainer class" + trainer1.money);
        System.out.println("sameitem potion in Trainer class= " + sameitem.potion);
        System.out.println("sameitem itemlist in Trainer class= " + sameitem.itemlist3);
        System.out.println("sametrainer money in trainer class" + sametrainer.money+ "\n\n\n\n");
    }
}

    // int index[] = new int[5]
    // for(int i = 0 ; i>5 ; i++){
    //     // System.out.print("a" + i + ": " + eval("a" + i) + " ");
    // }

    // public void TrainerControl(){


    // }



