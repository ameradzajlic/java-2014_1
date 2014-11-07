package multiarray;
public class MultiArray {
    public static void main(String[] args) {
        int[][] multiArray = new int[3][]; 
        multiArray[0] = new int[3];
        multiArray[1] = new int[3];
        multiArray[2] = new int[3]; 
        int[][] multiArray1 = {
            {1,2,3},
            {4,5,6}
        }; 
        
        String[][] players = {
            {"1","Peter","Jackson","150.51"},
            {"2","Sally","Jones","232.12"},
        };
        
        String[][] heroes = {
            {"1","Diablo","100"},
            {"2","Raynor","200"},
        };
        
        int[][] square = {
            {10,10},{100,10},{100,100},{10,100}
        };
        
        System.out.println("id\tname\tsurname\tbalance");
        for(int i=0;i<players.length;i++){
            System.out.print(players[i][0]+"\t");
            System.out.print(players[i][1]+"\t");
            System.out.print(players[i][2]+"\t");
            System.out.print(players[i][3]+"\n");
        }
        
        String[][] person_attributes = {
            {"good","smart","pretty","funny"},
            {"bad","smart","pretty"},
            {"ugly"}
        };
        for(int i=0;i<person_attributes.length;i++){
            System.out.println("************** Person "+i+" ***************");
            for(int j=0;j<person_attributes[i].length;j++){
                System.out.print(person_attributes[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
