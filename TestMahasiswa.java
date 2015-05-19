public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa ("Dindha Maria", 19);
        mhs.tampilkanbiodata();

        System.out.println();

        mhs.setUmur(20);
        mhs.tampilkanbiodata();
    }
}
