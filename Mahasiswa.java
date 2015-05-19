public class Mahasiswa
{
        private String Nama;
        private int Umur;

        public Mahasiswa(String nm, int umr){
            Nama = nm;
            Umur = umr;
        }

    public void tampilkanbiodata() {
        System.out.println(":::BIODATA:::");
        System.out.println("Nama =" + Nama);
        System.out.println("Umur =" + Umur);
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nm) {
        Nama = nm;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int umr) {
        Umur = umr;
    }
}
