/**
 * Lab05_Q2
 */
import java.util.Random;

public class Lab05_Q2 {

    public static void main(String[] args) {
        Random random = new Random();
        
//deck i kar ilk 26 p1 kalan kısım sub string ile p2
        String k = "1111";
        System.out.println("STARTİNG WİTH FOLLOWİNG DECK");
        for(int i  = 0;i <1;i++)
        {
            System.out.print(k);                                                                                                                      System.out.print("2222");  System.out.print("3333");   System.out.print("4444"); System.out.print("5555");System.out.print("6666");System.out.print("7777"); System.out.print("8888");System.out.print("9999");System.out.print("TTTT");System.out.print("JJJJ");System.out.print("QQQQ");System.out.print("KKK");


            System.out.println();

        }
        String deck = "111122223333444455556666777788889999TTTTJJJJQQQQKKK";
        int lenght_of_deck = deck.length();
        System.out.println("Inıtıally cards are dealing..");
        String deck_of_p1= "";
        String deck_of_p2= "";
        int lenght_of_p1_deck = deck_of_p1.length();

        int lenght_of_p2_deck = deck_of_p2.length();

        //give it half half mix
        int randomchoise = random.nextInt(50);
        String subs1  = deck.substring(0, randomchoise);
        String subs2  = deck.substring(randomchoise, lenght_of_deck);
            
        deck = subs2 + subs1;

        
        
    
        do 
        {
            lenght_of_deck = deck.length();
            int randomchoise2 = random.nextInt(lenght_of_deck-3) +2;
            char cardfordealing = deck.charAt(randomchoise2);
            deck_of_p1 = deck_of_p1 + Character.toString(cardfordealing);
            deck = deck.replaceFirst(Character.toString(cardfordealing), "");
            lenght_of_p1_deck = deck_of_p1.length();
        } 
        while (lenght_of_p1_deck <26);
        deck_of_p2 = deck;
        System.out.println("P1 hand:"+deck_of_p1);
        System.out.println("P2 hand:"+deck_of_p2);


        char a = 'a' ;
        char b = 'b';

        //REMOVİNG PAİRS FROM NOW on

        String deck_of_p1k= deck_of_p1;
        for(int i = 0;  i < lenght_of_p1_deck;i++)
        {
            lenght_of_p1_deck = deck_of_p1k.length();

            a = deck_of_p1k.charAt(i);

            String deck_of_p1_limited = deck_of_p1.replaceFirst(Character.toString(deck_of_p1k.charAt(i)), "");
            for(int p =0 ; p < deck_of_p1_limited.length(); p++)
            {
                b = deck_of_p1_limited.charAt(p);
                if( a == b )
                {
                    deck_of_p1= deck_of_p1.replaceFirst(Character.toString(a), "");

                    deck_of_p1= deck_of_p1.replaceFirst(Character.toString(b), "");break;//so that is work just fine for only 2 same number
                }//if there is a proglem add a condition in the for loop for fixingit propiatly and occasionally
            }
        }

        a = 'a' ;
        b = 'b';

        deck_of_p2 = deck;
        String deck_of_p2k= deck_of_p2;
        lenght_of_p2_deck = deck_of_p2k.length();
        for(int i = 0;  i < lenght_of_p2_deck;i++)
        {
            lenght_of_p2_deck = deck_of_p2k.length();

            a = deck_of_p2k.charAt(i);

            String deck_of_p2_limited = deck_of_p2.replaceFirst(Character.toString(deck_of_p2k.charAt(i)), "");
            for(int p =0 ; p < deck_of_p2_limited.length(); p++)
            {
                b = deck_of_p2_limited.charAt(p);
                if( a == b )
                {
                    deck_of_p2= deck_of_p2.replaceFirst(Character.toString(a), "");

                    deck_of_p2= deck_of_p2.replaceFirst(Character.toString(b), "");break;///so that is work just fine for only 2 same number
                } //if there is a proglem add a condition in the for loop for fixingit propiatly and occasionally

        }
        }

        System.out.println();
        System.out.println("PAİRS ARE REMOVED");
        System.out.println("P1: "+deck_of_p1);
        System.out.println("P2: "+deck_of_p2);



        //choosing card from openiont
        //first move is on p2
        lenght_of_p1_deck = deck_of_p1.length();
        lenght_of_p2_deck = deck_of_p2.length();
        

        //if we got winner
        
        do
        {
            System.out.println();
            System.out.println("start drawing ...");
            System.out.println("p2  is drawing from p1");
            lenght_of_p1_deck = deck_of_p1.length();
            char choosenCARD = deck_of_p1.charAt(random.nextInt(lenght_of_p1_deck-1));
            deck_of_p1= deck_of_p1.replaceFirst(Character.toString(choosenCARD), "");
            deck_of_p2 = deck_of_p2 + Character.toString(choosenCARD);


            System.out.println("deck of p1 : "+deck_of_p1 +"\n"+ "deck of p2 : "+deck_of_p2 );


            //removing pairs again
            System.out.println();
            System.out.println("pairs are removing again ");


        deck_of_p2k= deck_of_p2;
        lenght_of_p2_deck = deck_of_p2k.length();
        for(int i = 0;  i < lenght_of_p2_deck;i++)
        {
            lenght_of_p2_deck = deck_of_p2k.length();

            a = deck_of_p2k.charAt(i);

            String deck_of_p2_limited = deck_of_p2.replaceFirst(Character.toString(deck_of_p2k.charAt(i)), "");
            for(int p =0 ; p < deck_of_p2_limited.length(); p++)
            {
                b = deck_of_p2_limited.charAt(p);
                if( a == b )
                {
                    deck_of_p2= deck_of_p2.replaceFirst(Character.toString(a), "");

                    deck_of_p2= deck_of_p2.replaceFirst(Character.toString(b), "");break;//so that is work just fine for only 2 same number
                }   //if there is a proglem add a condition in the for loop for fixingit propiatly and occasionally   
            }
        }
            System.out.println("hand of p1 : "+ deck_of_p1);

            System.out.println("hand of p2 : " + deck_of_p2);
            //cheack point
            lenght_of_p2_deck = deck_of_p2.length();
            if(lenght_of_p2_deck==0){break;}lenght_of_p1_deck = deck_of_p1.length();
            if(lenght_of_p1_deck==0){break;}//so that it can exit from loop if needed
            //ad a if condition to the code for being precise about decising winner
            //p1 is chooseing card
            System.out.println();
            System.out.println("p1  is drawing from p2");
            lenght_of_p2_deck = deck_of_p2.length();
            choosenCARD = deck_of_p2.charAt(random.nextInt(lenght_of_p2_deck-1));
            deck_of_p2= deck_of_p2.replaceFirst(Character.toString(choosenCARD), "");
            deck_of_p1 = deck_of_p1 + Character.toString(choosenCARD);


            System.out.println("deck of p1 : "+deck_of_p1 +"\n"+ "deck of p2 : "+deck_of_p2 );


            //removing pairs again
            System.out.println();
            System.out.println("pairs are removing again ");


        deck_of_p1k= deck_of_p1;
        lenght_of_p1_deck = deck_of_p1k.length();
        for(int i = 0;  i < lenght_of_p1_deck;i++)
        {
            lenght_of_p1_deck = deck_of_p1k.length();

            a = deck_of_p1k.charAt(i);

            String deck_of_p1_limited = deck_of_p1.replaceFirst(Character.toString(deck_of_p1k.charAt(i)), "");
            for(int p =0 ; p < deck_of_p1_limited.length(); p++)
            {
                b = deck_of_p1_limited.charAt(p);
                if( a == b )
                {
                    deck_of_p1= deck_of_p1.replaceFirst(Character.toString(a), "");

                    deck_of_p1= deck_of_p1.replaceFirst(Character.toString(b), "");break;//so that is work just fine for only 2 same number
                }      
            }
        }
            System.out.println("hand of p1 : "+ deck_of_p1);

            System.out.println("hand of p2 : " + deck_of_p2);

    }while (!(lenght_of_p1_deck ==0) & !(lenght_of_p2_deck==0));
        if (lenght_of_p1_deck==0 )
        {
            System.out.println("game is over  \np1 won!!");
        }
        else if (lenght_of_p2_deck==0)
        {
            System.out.println("game is over  \np2 won!!");
        }
        while(!(lenght_of_p1_deck ==0) & !(lenght_of_p2_deck==0));
    }
}