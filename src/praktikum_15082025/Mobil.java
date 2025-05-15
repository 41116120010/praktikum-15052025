
package praktikum_15082025;

public class Mobil extends Kendaraan {
    protected String bahanBakar;
    protected int kapasitasMesin;
    
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    public String getBahanBakar() {
        return bahanBakar;
    }
    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }
    public int getKapasitasMesin() {
        return kapasitasMesin;
    }
@Override
    public void hasil() {
        super.hasil();
        System.out.println("Kelas Mobil");
        System.out.println("Jenis Bahan Bakar : " +bahanBakar);
        System.out.println("Kapasitas Mesin : " +kapasitasMesin +"cc");
    }
}
