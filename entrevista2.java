import java.util.Arrays;

public class entrevista2 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,0,6},{7,8,9}};

        boolean[] filasconcero = new boolean[array.length];
        boolean[] columconcero = new boolean[array.length];
        
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array[i].length; j++) 
            {
                if (array[i][j] == 0) {
                    filasconcero[i] = true;
                    columconcero[j] = true;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
            if (filasconcero[i] || columconcero[j]){
                array[i][j] = 0;
            }
                
           }
        }
            for (int i = 0; i < array.length; i++) {
                 for (int j = 0; j < array[i].length; j++){
                    System.out.print(array[i][j]+ " ");
                 }
                 System.out.println();
            }
               
    
    }

}