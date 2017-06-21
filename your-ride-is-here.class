/*
ID: lascala1
LANG: JAVA
TASK: ride
*/

import java.io.*;

public class ride {
    public static void main(String[] agrs) throws IOException{
        //BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

        out.println((strtonum47(f.readLine()) == strtonum47(f.readLine())) ? "GO" : "STAY");
        out.close();
    }

    private static int strtonum47(String string){
        int sum = 1;
        for (int i = 0; i < string.length(); i++){
            sum *= (char)string.charAt(i) - 64;
        }
        return sum % 47;
    }
}
