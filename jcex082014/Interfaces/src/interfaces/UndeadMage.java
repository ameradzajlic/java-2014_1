package interfaces;
public class UndeadMage implements IChampion { 
    @Override
    public void receiveHit() { System.out.println("I'm hit"); } 
    @Override
    public void primaryFire() { System.out.println("Firing primary"); } 
    @Override
    public void secondaryFire() { System.out.println("Firing secondary"); } 
}
