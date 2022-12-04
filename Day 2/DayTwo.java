import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class DayTwo{
    
    public static void main(String[] args ) throws FileNotFoundException{
        File objekt = new File("input.txt");
        Scanner reader = new Scanner(objekt);
        List<String> lista = new ArrayList<>();
        while(reader.hasNextLine()){
            String data = reader.nextLine();
                data = data.replaceAll("\\s","");
                lista.add(data);
            
        }

        int tot = 0;
        for(int i = 0; i < lista.size(); i++){
            //första iterationen
            String a = lista.get(i);  //CX
            String opponent = String.valueOf(a.charAt(0)); //C
            String self = String.valueOf(a.charAt(1)); //X

            tot += OGstrat(opponent, self);
        }
        System.out.println(tot);
    }
    public static int ownHandWorth(String self){
        switch (self){
            case "X":
                return 1;
            case "Y":
                return 2;
            case "Z":
                return 3;
            default:
                return -9999;

        }
    }

public static int OGstrat(String opponent , String self){
    switch(opponent){
        case "A": 
            if(self.equals("X")){
                return 0+3;    
            }
            if(self.equals("Y")){
                return 3+1;    
            }
            if(self.equals("Z")){
                return 6+2;    
            }

        case "B":
            if(self.equals("X")){
                return 0+1;    
            }
            if(self.equals("Y")){
                return 3+2;    
            }
            if(self.equals("Z")){
                return 6+3;    
            }
        
        case "C":
            if(self.equals("X")){
                return 0+2;    
            }
            if(self.equals("Y")){
                return 3+3;    
            }
            if(self.equals("Z")){
                return 6+1;    
            }    
        default:
            return -99999;
    }
}

    public static int wonOrNot(String opponent, String self){
        switch(opponent){
            case "A":
                if(self.equals("X")){
                    return 3;
                }
                if(self.equals("Y")){
                    return 6;
                }
                if(self.equals("Z")){
                    return 0;
                }

            case "B":
         
            if(self.equals("X")){
                return 0;
            }
            if(self.equals("Y")){
                return 3;
            }
            if(self.equals("Z")){
                return 6;
            }

            case "C":
         
            if(self.equals("X")){
                return 6;
            }
            if(self.equals("Y")){
                return 0;
            }
            if(self.equals("Z")){
                return 3;
            }

            default:
                return -99999;
        }
    }

}
