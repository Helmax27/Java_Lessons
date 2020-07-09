package Lesson11;

public class Task1 {
    public static void main(String[] args) {
        DomesticDog domdog = new DomesticDog("Washington", "White House", "USA", "Charlik", "Cob", 40);
        ServiceDog serviceDog = new ServiceDog("Moscow", "Kremlin", "Russia", "Tuzik", "Cob", 45);
        HomelessDog homelessDog = new HomelessDog("The outside", "Homeless", "Sharik", "Cob", "Cob", 10);
        domdog.action();
        domdog.voice();
        serviceDog.action();
        serviceDog.voice();
        homelessDog.action();
        homelessDog.voice();

    }
}

abstract class Dog {
    private String nickname;
    private String gender;
    private double weight;

    public Dog(String nickname, String gender, double weight) {
        this.nickname = nickname;
        this.gender = gender;
        this.weight = weight;
    }

    public String getNickname() {
        return nickname;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void voice();

    public abstract void action();
}

class DomesticDog extends Dog {
    private String adress;
    private String organization;
    private String area;

    public DomesticDog(String adress, String organization, String area, String nickname, String gender, double weight) {
        super(nickname, gender, weight);
        this.adress = adress;
        this.organization = organization;
        this.area = area;
    }
    @Override
    public void voice() {
        System.out.println("Woof");
    }
    @Override
    public void action() {
        System.out.println("Lie");
    }
}

class ServiceDog extends Dog {
    private String adress;
    private String organization;
    private String area;

    public ServiceDog(String adress, String organization, String area, String nickname, String gender, double weight) {
        super(nickname, gender, weight);
        this.adress = adress;
        this.organization = organization;
        this.area = area;
    }

    public void voice() {
        System.out.println("Vaf");
    }

    public void action() {
        System.out.println("Carry slippers");
    }
}

class HomelessDog extends Dog {
    private String adress;
    private String organization;
    private String area;

    public HomelessDog(String adress, String organization, String area, String nickname, String gender, double weight) {
        super(nickname, gender, weight);
        this.adress = adress;
        this.organization = organization;
        this.area = area;
    }

    public void voice() {
        System.out.println("Gav");
    }

    public void action() {
        System.out.println("Look for food");
    }
}
