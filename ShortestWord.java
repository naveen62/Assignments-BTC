package assignments;
import java.util.Scanner;

class ShortestWord {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String words[] = new String[5]; 
        System.out.println("Enter some words");
        for(int i=0;i<words.length;i++) {
            words[i] = s.nextLine();
        }
        int shortstW = words[0].length();
        int shortI = 0;
        s.close();
        for(int j=0;j<words.length;j++) {
            if(words[j].length() < shortstW) {
                shortstW = words[j].length();
                shortI = j;
            }
        }
        System.out.println("Shortest word is "+words[shortI]);
    }
}