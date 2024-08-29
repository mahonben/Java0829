package cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("AICat");
        cat.setBreeds("Persian");
        cat.setWeight(3.1);

        System.out.print("\n고양이 이름: " + cat.getName());
        System.out.print("\n고양이 종류: " + cat.getBreeds());
        System.out.print("\n고양이 무게: " + cat.getWeight()+"\n\n");

        System.out.printf("고양이 이름: %s\n", cat.getName());
        System.out.printf("고양이 종류: %s\n", cat.getBreeds());
        System.out.printf("고양이 무게: %.1f\n\n", cat.getWeight());

        System.out.print(cat.getName() + "이 ");
        cat.claw();

        System.out.print(cat.getName() + "이 ");
        cat.meow();
    }
}



