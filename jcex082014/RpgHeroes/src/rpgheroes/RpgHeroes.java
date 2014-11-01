package rpgheroes;
public class RpgHeroes {
    public static void main(String[] args) {
        DwarfWarrior dwarfWarrior = new DwarfWarrior();
        dwarfWarrior.dead = false;
        dwarfWarrior.health = 25;
        dwarfWarrior.mana = 25;
        dwarfWarrior.show();
        dwarfWarrior.receiveHit();
        dwarfWarrior.show();
        dwarfWarrior.receiveHit();
        dwarfWarrior.show();
        dwarfWarrior.primaryFire();
        dwarfWarrior.show();
        dwarfWarrior.secondaryFire();
        dwarfWarrior.show();
        dwarfWarrior.receiveHit();
        dwarfWarrior.show();
    }
}
