class MetaHuman {
    private int age = 25;
    private String name = "Bala";
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
public class EncapulationExample {
    public static void main(String args[]) {
        MetaHuman humObj = new MetaHuman();
        System.out.println(humObj.getAge() + " : " + humObj.getName());
        humObj.setAge(40);
        humObj.setName("Bala Chandra");
        System.out.println(humObj.getAge() + " : " + humObj.getName());
    }
}
