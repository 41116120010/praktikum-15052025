
package praktikum_15082025;

public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKm;
        
    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }
    public int getTarifAwal() {
        return tarifAwal;
    }
    public void setTarifPerKm(int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }
    public int getTarifPerKm() {
        return tarifPerKm;
    }
@Override
    public void hasil() {
        super.hasil();
        System.out.println("Kelas Taksi");
        System.out.println("Tarif Awal : Rp " +tarifAwal);
        System.out.println("Tarif per KM : Rp " +tarifPerKm);
    }
}
