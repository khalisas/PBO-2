
package bus;


public class TestSiswa {
    public static void main (String args []){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName ("Shiva");
        siswa.setAge(16);
        siswa.setAddress("Malang");
        
        System.out.println("Name : "+ siswa.getName());
        System.out.println("Absen: "+ siswa.getAbsen());
        System.out.println("Address: "+siswa.getAddress());
  
    }
}
