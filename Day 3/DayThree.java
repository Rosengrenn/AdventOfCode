import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DayThree{
    
    public static void main(String[] args ) throws FileNotFoundException{
        File objekt = new File("input.txt");
        Scanner reader = new Scanner(objekt);
        List<String> lista = new ArrayList<>();
        while(reader.hasNextLine()){
            String data = reader.nextLine();
                
                lista.add(data);
            
        }
        int value = 0;

        for(int i = 0; i < lista.size(); i++){
            String common = findGemensam(lista.get(i));
            value += getValueofLetter(common);
        }
        System.out.println(value);
        //System.out.println(lista);
        //System.out.println(findGemensam("ytUloU"));
        //System.out.println(getValueofLetter("B"));
    }


    public static String findGemensam(String word){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        

        for(int i = 0; i < word.length()/2; i++){
            sb1.append(word.charAt(i));
        }
        for(int i = word.length()/2; i < word.length(); i++){
            sb2.append(word.charAt(i));
        }

        String comp1 = sb1.toString();
        String comp2 = sb2.toString();
        String commonWord = "";

        for(int i = 0; i < comp1.length(); i++){
            for(int j = 0; j < comp1.length(); j++){
                if(comp1.charAt(i) == comp2.charAt(j)){
                    commonWord = String.valueOf(comp1.charAt(i));
                }

            }
        }
        return commonWord;
    }
    public static int getValueofLetter(String commonWord){
        String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int value = 0; 
        for(int i = 0; i < abc.length(); i++){
            if(abc.charAt(i) == commonWord.charAt(0)){
                value = i+1;
            }
        }

        return value;


    }
}