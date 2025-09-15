public class Car {
    private String Brand;
    private String Model;
    private int Year;
    private double rentalPricePerDay;
    private boolean IsAvailable;


    //konstruktør
    public Car(String Brand,  String Model,  int Year,  double rentalPricePerDay,  boolean IsAvailable){
        this.Brand = Brand;
        this.Model = Model;
        this.Year = Year;
        this.rentalPricePerDay = rentalPricePerDay;
        this.IsAvailable = IsAvailable;
    }

    public Car() { this("Unknown", "Unknown", 0, 0.0, false); }

    //Getters
    public String getBrand(){return Brand;}
    public String getModel(){return Model;}
    public int getYear(){return Year;}
    public double getRentalPricePerDay(){return rentalPricePerDay;}
    public boolean getIsAvailable(){return IsAvailable;}

    //setters
    public void setBrand(String Brand){this.Brand = Brand;}
    public void setModel(String Model){this.Model = Model;}
    public void setYear(int Year){this.Year = Year;}
    public void setRentalPricePerDay(double rentalPricePerDay){this.rentalPricePerDay = rentalPricePerDay;}
    public void setIsAvailable(boolean IsAvailable){this.IsAvailable = IsAvailable;}

    @Override
    public String toString(){ return "Rental { " + Brand + " " + Model + " From Year: " + Year + " -currently only " + rentalPricePerDay + " - " + IsAvailable + " } ";}




}
