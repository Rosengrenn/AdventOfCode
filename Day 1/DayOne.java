import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayOne{
    
    public static void main(String[] args ) throws FileNotFoundException{
        File objekt = new File("input.txt");
        Scanner reader = new Scanner(objekt);
        List<String> lista = new ArrayList<>();
        while(reader.hasNextLine()){
            String data = reader.nextLine();
    
           lista.add(data);
        }

        int max = 0;
        int elf = 0;
        
        for(int i=0; i < lista.size(); i++){
            if(!lista.get(i).isBlank()){
                int a = Integer.valueOf(lista.get(i));
                elf += a;
            }        
            if(elf > max){
                max = elf;
            }
            if(lista.get(i).isBlank()){
                elf = 0;
            }
        }
    
}
}
