package checkcarconstructor;
public class CheckCarConstructor {
    public static void main(String[] args) {
        String carMake = "Ford";
        int doors = 4; 
        switch(carMake){
            case "Ford":
                switch(doors) {
                    case 2:
                        System.out.println("Car have two doors");
                    break;
                    case 3:
                        System.out.println("Car have three doors");
                    break;
                    case 4:
                        System.out.println("Car have four doors");
                    break;
                    case 5:
                        System.out.println("Car have five doors");
                    break;
                }
            break;
            default:
                System.out.println("Car manufacturer is not Ford");
            break;
        }
    } 
}
