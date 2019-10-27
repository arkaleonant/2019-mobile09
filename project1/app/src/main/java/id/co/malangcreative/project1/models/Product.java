package id.co.malangcreative.project1.models;

public class Product {
    public String namaLaptop;
    public String hargaLaptop;
    public int imageLaptop;

    public Product(String namaLaptop, String hargaLaptop, int imageLaptop) {
        this.namaLaptop = namaLaptop;
        this.hargaLaptop = hargaLaptop;
        this.imageLaptop = imageLaptop;
    }

    public String getNamaLaptop() {
        return namaLaptop;
    }

//    public void setNamaLaptop(String namaLaptop) {
//        this.namaLaptop = namaLaptop;
//    }

    public String getHargaLaptop() {
        return hargaLaptop;
    }

//    public void setHargaLaptop(String hargaLaptop) {
//        this.hargaLaptop = hargaLaptop;
//    }

    public int getImageLaptop() {
        return imageLaptop;
    }

    public void setImageLaptop(int imageLaptop) {
        this.imageLaptop = imageLaptop;
    }
}
