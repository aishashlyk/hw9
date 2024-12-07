public class Temperature {
    private double temp;
    private char unit;
    //Constructors
    public Temperature() {
      this.temp = 0;
      this.unit = 'C';
    }
    public Temperature(double temp) {
        this.temp = temp;
        this.unit = 'C';
    }
    public Temperature(char unit) {
        this.temp = 0;
        this.unit = unit;
    }
    public Temperature(double temp, char unit) {
        if(unit == 'C'|| unit == 'F') {
            this.temp = temp;
            this.unit = unit;
        }else{
            System.out.println("Invalid unit specified");
        }
    }
    //Getters
    public double getDegreesC(){
        if(unit == 'C') {
            return temp;
        }else{
            return 5*(temp - 32)/9;
        }
    }
    public double getDegreesF(){
        if(unit == 'F') {
            return temp;
        }else{
            return (9*(temp/5))+32;
        }
    }
    public char getUnit(){
        return unit;
    }
    //Setters
    public void setDegreesC(double temp){
        this.temp = temp;
        this.unit = 'C';
    }
    public void setDegreesF(double temp){
        this.temp = temp;
        this.unit = 'F';
    }
    public void setUnit(char unit){
        if(unit == 'C' || unit == 'F'){
            this.unit = unit;
        }else{
            System.out.println("Invalid unit specified. " +
                    "It must be 'C' for Celsius or 'F' for Fahrenheit."
            );
        }
    }
    //Method toString
    @Override
    public String toString() {
        return String.format("Temperature in Celsius: %s, " +
                "\nTemperature in Fahrenheit: %s",
                getDegreesC(), getDegreesF());
    }

}
