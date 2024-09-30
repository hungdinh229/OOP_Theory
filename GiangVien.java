public class GiangVien {
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

    public GiangVien(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public static void main(String[] args) {
        GiangVien giangVien = new GiangVien("Nguyen Van B", "20/02/1999");
        System.out.println(giangVien.getName());
        System.out.println(giangVien.getBirthDate());
    }
}
