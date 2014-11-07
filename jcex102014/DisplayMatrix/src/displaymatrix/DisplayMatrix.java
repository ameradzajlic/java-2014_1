package displaymatrix;
public class DisplayMatrix {
    public static void main(String[] args) {
        int width = 20,height = 10;
        int[][] points = {{2,4},{1,5},{6,6},{3,2},{0,0}};
        for(int y=0;y<height;y++){
            for(int x=0;x<width;x++){
                boolean point_exist = false;
                    for(int u=0;u<points.length;u++){
                        if(points[u][0]==x&&points[u][1]==y){
                            point_exist = true;
                        }
                    }
                System.out.print(point_exist?"X":"O");
            }
            System.out.println();
        }
    }
}
