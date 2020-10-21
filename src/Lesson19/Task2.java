package Lesson19;

public class Task2 {
    public static void main(String[] args) {
        ElfWorrior worrior = new ElfWorrior(20, 30);
        ElfMage mage = new ElfMage(48, 63);
        GenericElf<Elf> elf = new GenericElf(mage);
        //elf.setElf(worrior);
        System.out.println(elf.getElf().toString());
        //elf.setElf("sdffdsf");
    }
}

class Elf {
    int helth;
    int demage;

    public Elf(int helth, int demage) {
        this.helth = helth;
        this.demage = demage;
    }

    public void strike() {
    }
}

class ElfWorrior extends Elf {

    public ElfWorrior(int helth, int demage) {
        super(helth, demage);
    }

    @Override
    public String toString() {
        return "ElfWorrior{" +
                "helth=" + helth +
                ", demage=" + demage +
                '}';
    }

    @Override
    public void strike() {
        System.out.println("  ");
    }
}

class ElfMage extends Elf {

    public ElfMage(int helth, int demage) {
        super(helth, demage);
    }

    @Override
    public String toString() {
        return "ElfMage{" +
                "helth=" + helth +
                ", demage=" + demage +
                '}';
    }

    @Override
    public void strike() {
        System.out.println("  ");
    }
}

class GenericElf<Elf> {
    private Elf elf;

    public GenericElf(Elf elf) {
        this.elf = elf;
    }

    public Elf getElf() {
        return elf;
    }

    public void setElf(Elf elf) {
        this.elf = elf;
    }
}
