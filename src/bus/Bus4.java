
package bus;

public class Bus4 {
    public double penumpang;
    public double maxPenumpang;
    public double counter;
    public double penumpangBaru;
    public double Berat;
    public double rata;
    
    public Bus4(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //method Mutator
    public void addPenumpang (double penumpang){
        double shipo;
        shipo = this.penumpang +penumpang;
        if (shipo>maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = shipo;
            counter++;
        }
    }
    public void addBerat (double Berat){
        double shipo,rata,penumpang;
        shipo =(this.Berat+Berat);
        rata = (shipo/this.penumpang);
        this.Berat = shipo;
        this.rata= rata;
  
    }
    public void getPenumpang(int password){
        if(password == 24){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
        
    }
    public void cetak(){
        System.out.println("Penumpang Bus sekarang = "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah ="+ maxPenumpang);
        System.out.println("Berat bus sekarang adalah ="+Berat);
        System.out.println("Rata-rata bus sekarang adalah ="+rata);
    }
   
    
}
