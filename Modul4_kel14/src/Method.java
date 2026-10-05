public class Method {

    public void sapa() {
        System.out.println("hai semua!!");
    }
    public String perkenalan (String nama, String kota, String hobi){
        return "Namaku " + nama + ", Aku dari " + kota + " dan hobiku adalah " + hobi;
    }
    public void umur ( int umur){
        System.out.println("Aku berumur " + umur + " tahun");
    }
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("------------------------------------------");
        Method objek = new Method();
        objek.sapa();
        System.out.println(objek.perkenalan("sawi", "ngawi", "nyawit"));
        objek.umur(19);
    }
}
