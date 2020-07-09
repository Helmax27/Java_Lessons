package Lesson11;

public class Task3 {
    public static void main(String[] args) {
        OrcPeon orcPeon=new OrcPeon("20","46","80");
        OrcCrunt orcCrunt=new OrcCrunt("10", "95", "100", "Hacking");
        OrcShaman orcShaman=new OrcShaman("89", "5", "60", "Magical");
        orcPeon.Attack();
        orcCrunt.Attack();
        orcShaman.Attack();

    }
}
abstract class Orc {
    String demage;
    String armor;
    String health;
    String typeAttack;

    public Orc(String demage, String armor, String health, String typeAttack) {
        this.demage = demage;
        this.armor = armor;
        this.health = health;
        this.typeAttack = typeAttack;
    }
    public abstract void Attack ();
}
class OrcPeon extends Orc {

    public OrcPeon(String demage, String armor, String health) {
        super(demage, armor, health, "Crushing");
    }
    public void Attack() {
        System.out.println("Damage: " + demage + "Attack type: " + typeAttack);
    }
}
class OrcCrunt extends Orc {

    public OrcCrunt(String demage, String armor, String health, String typeAttack) {
        super(demage, armor, health, typeAttack);
    }
    public void Attack() {
        System.out.println("Hacking1");
    }
}
class OrcShaman extends Orc {

    public OrcShaman(String demage, String armor, String health, String typeAttack) {
        super(demage, armor, health, typeAttack);
    }
    public void Attack() {
        System.out.println("Magical1");
    }
}
