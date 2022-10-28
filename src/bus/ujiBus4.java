
package bus;

public class ujiBus4 {
    public static void main (String []args){
        int password;
        
        //membuat objek busBesar dari kelas Bus4
        Bus4 busBesar = new Bus4(45);
        busBesar.cetak();
        
        //membuat penambahan penumpang 
        busBesar.addPenumpang(35);
        busBesar.addBerat (15);
        busBesar.cetak();
        
        busBesar.addPenumpang(24);
        busBesar.addBerat (14);
        busBesar.cetak();
        
        busBesar.addPenumpang(43);
        busBesar.addBerat (13);
        busBesar.cetak();
        
        busBesar.addPenumpang(28);
        busBesar.addBerat (12);
        busBesar.cetak();
        
        busBesar.addPenumpang(56);
        busBesar.addBerat (10);
        busBesar.cetak();
        
        
        
    }
    
}
