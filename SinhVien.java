public class SinhVien {
    private String name;
    private String birthDate;
    private String id;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SinhVien(String name, String birthDate, String id) {
        this.name = name;
        this.birthDate = birthDate;
        this.id = id;
    }

    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien("Bui Van C", "22/06/2004", "21026868");
        System.out.println(sinhVien.getName());
        System.out.println(sinhVien.getBirthDate());
        System.out.println(sinhVien.getId());
    }
}
