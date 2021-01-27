
package methodvoid;

public class MethodVoid {

    
    public static void main(String[] args) {
        //membuat object
        MethodVoid io= new MethodVoid();
        
        //memanggil method
        io.jenis();
        io.jumlah();
    }
    
    //variabel method
    String buku = "NOVEL";
    int rak1 = 47,rak2 = 36;
    
    //method 1
    String jenis (){
        System.out.println("Jenis bukunya adalah "+buku);
    return buku;
}
    //method 2
    int jumlah(){
        int  hasil = rak1 + rak2;
        System.out.println("Jumlah buku "+buku+" adalah "+hasil);
        return hasil;
    }
    
}
