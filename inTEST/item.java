package inTEST;
import java.util.*;
public class item {




    item() {
    }

     int potion;
     int superportion;
     int monsterball;
     int superball;
     int antidode;
     int cleaner;
     int strabgecandy;

     int redfruit;
     int bluefruit;
     int greenfruit;

    String[] itemlist = new String[20];
    String itemlist2[] = {"potion", "superpotion", "monsterball", "superball", "antidod", "cleaner", "strangecandy"
            , "redfruit" , "bluefruit", "greenfruit","","","","","","","","","",""};

    public HashMap<String,Integer> itemlist3 = new HashMap<String,Integer>();

    public void getitem(){
    }

    public void makeitemlist() {
            itemlist3.put("potion",1);
            itemlist3.put("superpotion",2);
            itemlist3.put("monsterball",3);
            itemlist3.put("superball",4);
            itemlist3.put("antidode",5);
            itemlist3.put("cleaner",6);
            itemlist3.put("strabgecandy",7);
            itemlist3.put("redfruit",8);
            itemlist3.put("bluefruit",9);
            itemlist3.put("greenfruit",10);
    }
// Scanner itemscan = new Scanner(System.in);

public void ItemControl(){
        Pocketmon itempoke = new Pocketmon();
        item item1 = new item();
        Trainer itemtrainer = new Trainer();

        item sameitem = new item();
        Trainer sametrainer = new Trainer();
        Pocketmon samePocketmon = new Pocketmon();

        makeitemlist();

        itempoke.hp += 3;
        item1.potion +=3;
        itemtrainer.money +=3;
    System.out.println("itempokeHP in item class" + itempoke.hp);
    System.out.println("item1 potion in itemclass= " + item1.potion);
    System.out.println("itemlist in itemclass= " + item1.itemlist3);
    System.out.println("itemtrainer money in itemclass " + itemtrainer.money);
    System.out.println("sameitem potion in item class= " + sameitem.potion); 
    System.out.println("sameitem itemlist in item class= " + sameitem.itemlist3);
    System.out.println("sametrainer money in item class" + sametrainer.money+ "\n\n\n\n");

}

//     public void useItem(itemscan(System.in)){
//         if(itemscan.equals("potion")){
//              this.hp +=30;
//             }
//         else if (itemscan.equals("superpotion")) {
//             this.hp += 50;
//             }
//         else if (itemscan.equals("monsterball")) {
//             if(this instanceof Trainer){

//             }
//         }

// }
}