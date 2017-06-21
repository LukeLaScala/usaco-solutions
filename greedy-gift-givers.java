/*
ID: lascala1
LANG: JAVA
TASK: gift1
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Dictionary;
import java.util.StringTokenizer;

/**
 * Created by luklas on 6/19/17.
 */
public class gift1 {
    private static Dictionary<String, Integer> money = new Hashtable<String, Integer>();

    public static void main(String[] args) throws  IOException{
        BufferedReader in = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));

        //Get number of people
        int np = Integer.parseInt(in.readLine());

        String[] names = new String[np];

        //Populate array with names and set money to 0
        for(int i = 0; i < np; i ++){
            names[i] = in.readLine();
            money.put(names[i], 0);
        }


        for (int i = 0; i < np; i ++){
            String sender = in.readLine();

            StringTokenizer st = new StringTokenizer(in.readLine());


            int totalgift = Integer.parseInt(st.nextToken());
            int numRecipients = Integer.parseInt(st.nextToken());
            int gift;

            if (totalgift == 0){
                gift = 0;
            } else {
                gift = totalgift / numRecipients;
            }

            for (int j = 0; j < numRecipients; j++) {
                String recipient = in.readLine();


                money.put(recipient, money.get(recipient) + gift);

                money.put(sender, money.get(sender) - gift);

            }


        }

        for (String name : names){
           out.println(name + " " + money.get(name));
        }
        out.close();





    }

    public static void giftMoney(int money, String sender, ArrayList people){

    }
}
