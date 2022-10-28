
package bus;

public class Bola {
    private double jarijari;
    private double diameter;
    private double luaspermukaan;
    private double volume;
    private double phi;
    
    public void setjarijari(double newjarijari){
        jarijari = newjarijari;
    }
    public void setdiameter(){
        diameter = 2* jarijari;
        System.out.println("Nilai Diameter adalah : "+diameter);
    }
    public void showluaspermukaan(double newluaspermukaan){
        luaspermukaan = 4 * phi * jarijari * jarijari;
        System.out.println("Nilai luas permukaan lingkaran adalah : "+luaspermukaan);
    }
    public void showvolume(double newvolume){
        volume = 4/3 * phi * jarijari * jarijari * jarijari ;
        System.out.println("Nilai volume lingkaran adalah : "+ volume);
    }
    public void setphi(double newphi){
        phi = newphi;
    }

    }

  
     


    