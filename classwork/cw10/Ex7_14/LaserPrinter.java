package cw10.Ex7_14;

public class LaserPrinter extends Printer{

    private String laser_type;

    LaserPrinter(int p, String t, String n, String l_t) {
        super(p, t, n);
        this.laser_type = l_t;
    }

   public String get_laser_type(){
        return this.laser_type;
   }

   public void set_laser_type(String type){
        this.laser_type = type;
   }
}
