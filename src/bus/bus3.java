
package bus;

public class bus3 {
    public int penumpang;
    public int maxPenumpang;
    
    public bus3(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //Method Mutator 
    public void addpenumpang (int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp>maxPenumpang){
            System.out.println("penumpang melebihi kuota");
        }
        else{
            this.penumpang=temp;
        }
    }
    public void getpenumpang (int password){
        if(password==24){
            System.out.println("password benar");
        }
        else{
            System.out.println("password salah ");
        }
    }
    public void cetakpenumpang(){
        System.out.println("penumpang bus sekarang = "+penumpang);
        System.out.println("maksimum penumpang yang seharusnya adalah = "+maxPenumpang);
    }
    
    
    
}
