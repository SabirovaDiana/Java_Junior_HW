package dz_2;

public class Dog extends Animal{

    private boolean dog_training;           // Наличие дрессировки.
    private boolean medalsAvailability;     // Наличие медалей.

    public Dog(String name, int age, boolean dog_training, boolean medalsAvailability) {
        super(name, age);
        this.dog_training = dog_training;
        this.medalsAvailability = medalsAvailability;
    }

    @Override
    public String toString() {
        return "\nСобака: " + name +
                "\nВозраст: " + age + " лет" +
                "\nДрессировка: " + dog_training +
                "\nНаграды: " + medalsAvailability;
    }

    public void makeSound() {
        System.out.println("Собака лает!");                                  // Издает звуки.
    }


    public void dog_frisbee(){
        System.out.println("Собака ловит летающий диск.");                                               // Игра собаки с диском на прогулке
    }

    public void showAffection() {                                                   // Проявляет ласку.
        System.out.println("Собака машет хвостом.");
    }

    public void swimming() {                                                        // плавает
        System.out.println("Собака умеет нырять и плавать.");
    }
}