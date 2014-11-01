package rpgheroes;
public abstract class BaseHero {
    public double health, mana;
    public boolean dead; 
    public void areaOfEffectHit(){ 
        receiveHit();
    }
    public abstract void receiveHit();
    public abstract void primaryFire();
    public abstract void secondaryFire();
}
