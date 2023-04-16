package inTEST;

public class battle {

public static void main(String[] args) {


    System.out.println("start");

    play();
    }

    private static void play() {
        item mainitem = new item();
        Pocketmon mainpocke = new Pocketmon();
        Trainer maintrainer = new Trainer();


        item sameitem = new item();
        Trainer sametrainer = new Trainer();
        Pocketmon samePocketmon = new Pocketmon();

        mainitem.ItemControl();
        mainpocke.PocketmonControl();
        maintrainer.TrainerControl();

        mainitem.makeitemlist();


        System.out.println("PokcetmonHP in mainclass" + mainpocke.hp);
        System.out.println("item potion  in mainclass" + mainitem.potion);
        System.out.println("trainer money in mainclass" + maintrainer.money);

        System.out.println("sameitem potion in main class= " + sameitem.potion);
        System.out.println("sameitem itemlist in main class= " + sameitem.itemlist3);
        System.out.println("sametrainer money in main class" + sametrainer.money);
        System.out.println("samepocketmon HP in main class" + samePocketmon.hp + "\n\n\n\n");

    }
}

