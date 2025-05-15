
package praktikum_15082025;

public class Truk extends Mobil {
    protected int muatanMaks;
        
    public void setMuatanMaks(int muatanMaks) {
        this.muatanMaks = muatanMaks;
    }
    public int getMuatanMaks() {
        return muatanMaks;
    }
@Override
    public void hasil() {
        super.hasil();
        System.out.println("Kelas Truk");
        System.out.println("Muatan Maksimal : " +muatanMaks +"kg");
    }
}
