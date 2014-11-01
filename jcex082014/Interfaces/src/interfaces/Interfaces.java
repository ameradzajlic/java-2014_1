package interfaces;
public class Interfaces {
    public static void main(String[] args) {
        UndeadMage undeadMage = new UndeadMage(); 
        IChampion champion = new IChampion() { 
            @Override
            public void receiveHit() { }
            @Override
            public void primaryFire() { }
            @Override
            public void secondaryFire() { }
        };
    } 
}
