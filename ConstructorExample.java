class Human {
    private int age;
    private String name;

    public Human() { // Default constructor
        age = 12;
        name = "Babu";
    }
    public Human(int age, String name) { // Parameterized constructor
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String n) {
        name = n;
    }

}
public class ConstructorExample {
    public static void main(String args[]) {
        Human humObj = new Human();
        System.out.println(humObj.getAge() + " : " + humObj.getName());
        humObj.setAge(40);
        humObj.setName("Bala Chandra");
        System.out.println(humObj.getAge() + " : " + humObj.getName());
        
        Human humObj1 = new Human(15, "Jonh");
        System.out.println(humObj1.getAge() + " : " + humObj1.getName());
    }
}
