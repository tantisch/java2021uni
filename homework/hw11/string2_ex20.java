package hw11;

public class string2_ex20{
    public static void main(String[] args) {
        String dates_s = "12-22-2000 23.04.2004 06-23-2019 06.10.2010";
        String[] dates = dates_s.split(" ");
        for(int i=0; i<dates.length; i++) {
            if (dates[i].contains("-")) {
                String mm = dates[i].substring(0, 2);
                String dd = dates[i].substring(3, 5);
                String year = dates[i].substring(6, 10);
                dates[i] = dd + "." + mm + "." + year;
            }
        }
        dates_s = String.join(" ", dates);
        System.out.println("Dates only with Ukrainian standard: " + dates_s);
    }
}