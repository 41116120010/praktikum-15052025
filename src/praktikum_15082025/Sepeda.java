
package praktikum_15082025;

public class Sepeda extends Kendaraan {
    protected int jmlSadel;
    protected int jmlGir;
    
    public void setJmlSadel(int jmlSadel) {
        this.jmlSadel = jmlSadel;
    }
    public int getJmlSadel() {
        return jmlSadel;
    }
    public void setJmlGir(int jmlGir) {
        this.jmlGir = jmlGir;
    }
    public int getJmlGir() {
        return jmlGir;
    }
@Override
    public void hasil() {
        super.hasil();
        System.out.println("Kelas Sepeda");
        System.out.println("Jumlah Sadel : " +jmlSadel);
        System.out.println("Jumlah Gir : " +jmlGir);
    }
}
