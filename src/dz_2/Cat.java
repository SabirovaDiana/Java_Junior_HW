package dz_2;
public class Cat extends Animal{

    private boolean participationInExhibitions;  // Участие в выставках.
    private boolean is_public_cat;               // Наличие публичности .

    public Cat(String name, int age, boolean is_public_cat, boolean participationInExhibitions) {
        super(name, age);
        this.is_public_cat = is_public_cat;
        this.participationInExhibitions = participationInExhibitions;
    }

    @Override
    public String toString() {
        return "\nКот: "                  + name +
                "\nВозраст: "             + age + " лет" +
                "\nУчастие в выставках: " + participationInExhibitions +
                "\nНаличие публичности в соц.сетях: " + is_public_cat;
    }


    public void makeSound() {                                                                       // Издает звуки.
        System.out.println("Голос: котик мяукает!");
    }

    public void showAffection() {                                                                   // Проявляет ласку.
        System.out.println("Котик мурлыкает и обтирается о Вашу ногу.");
    }

    public void showWindows(){
        System.out.println("Кот наблюдает за Вами в окошко");                                        // внимательность
    }

    public void hunting_for_mice(){
        System.out.println("Охота за мышами");
    }
    public boolean ParticipationInExhibitions() {                                                  // участие в выставках
        return ParticipationInExhibitions();
    }

    public boolean is_public_cat() {                                                                  // Имеет страничку в соц.сетях
        return is_public_cat();
    }
}