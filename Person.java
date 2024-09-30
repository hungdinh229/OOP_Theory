public class Person {
    private String name;
    private String birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public static void main(String[] args) {
        Person person = new Person("Nguyen Van A", "01/01/2000");
        System.out.println(person.getName());
        System.out.println(person.getBirthDate());
    }
}


