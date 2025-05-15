
package praktikum_15082025;

public class SepedaListrik extends Sepeda {
    protected int kecepatanMaks;
    protected int jarakTempuh;
        
    public void setKecepatanMaks(int kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }
    public int getKecepatanMaks() {
        return kecepatanMaks;
    }
    public void setJarakTempuh(int jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }
    public int getJarakTempuh() {
        return jarakTempuh;
    }
@Override
    public void hasil() {
        super.hasil();
        System.out.println("Kelas Sepeda Listrik");
        System.out.println("Kecepatan Maksimkal : " +kecepatanMaks +"km");
        System.out.println("Jarak Tempuh : " +jarakTempuh +"km");
    }
}
