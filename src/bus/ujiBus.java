
package bus;

public class ujiBus {
    public static void main (String []args){
        
        //membuat objek busBesar dari classs bus 
        Bus busBesar = new Bus (40);
        busBesar.cetak();
        
        //penambahan penumpang 
        busBesar.addPenumpang(15);//menambahkan 15 penumpang 
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5);//menambahkan 5 penumpang 
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26);//menambahkan 26 penumpang 
        busBesar.cetak();
    }
        
        
    }
        
    
    

