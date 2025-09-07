package ObjectOrientedProgramming;

public class CabService {
    String car_type ;
    double km;
    double bill;

    CabService(String car_type, double km, double bill){
        car_type = " ";
        km = 0.0;
        bill = 0.0;
    }

    void accept(){
        System.out.println("Enter the car type \n 1 for AC \n 2 for Non AC");
        int car;
    }

}
