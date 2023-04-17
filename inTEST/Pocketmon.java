package inTEST;

public class Pocketmon {

    int hp;
    int exp;
    int pp1;
    int pp2;
    int pp3;
    int pp4;
    String name;
    int index;

    Pocketmon(){

    }

    Pocketmon(int hp, int index) {
    }



    public void PocketmonControl(){
    Pocketmon pocke1 = new Pocketmon();
    item pocketmonItem = new item();
    Trainer pocketmontrainer = new Trainer();

    item sameitem = new item();
    Trainer sametrainer = new Trainer();
    Pocketmon samePocketmon = new Pocketmon();

        pocketmonItem.makeitemlist();

        pocke1.hp += 2;
        pocketmonItem.potion +=2;
        pocketmontrainer.money +=2;

        System.out.println("★★★ pocketmon class ★★★");
        System.out.println(" pocketmonHP in Pocketmon= " + pocke1.hp); 
        System.out.println("itempotion in Pocketmon= " + pocketmonItem.potion); 
        System.out.println("itemlist in Pocketmon= " + pocketmonItem.itemlist3); 
        System.out.println("trainer money in Pocketmon= " + pocketmontrainer.money); 
        System.out.println("sameitem potion in Pocketmon class= " + sameitem.potion); 
        System.out.println("sameitem itemlist in Pocketmon class= " + sameitem.itemlist3); 
        System.out.println("sametrainer money in Pocketmon class" + sametrainer.money+ "\n\n\n\n");
    }

    
}
