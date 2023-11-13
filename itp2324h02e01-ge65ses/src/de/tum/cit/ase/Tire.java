package de.tum.cit.ase;

public class Tire {

    private float pressure; // measured in psi
    private float treadDepth = 9.0f;
    private boolean winterTire = true;

    public Tire(String pressure) {
        this.pressure = Float.parseFloat(pressure);
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    //1.2 Getters & Setters
    public boolean isWinterTire() {
        return winterTire;
    }
    public float getTreadDepth() {
        return treadDepth;
    }
    public void setWinterTire(boolean winterTire) {
        this.winterTire = winterTire;
    }
    public void setTreadDepth(float treadDepth) {
        this.treadDepth = treadDepth;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "pressure=" + pressure +
                '}';
    }
    //1.3 Create a new public method boolean validPressure()
    public boolean validPressure(){
        return pressure >= 1.4 && pressure <= 3.5;
    }
    //1.4 Valid Tread Depth
    public boolean validTreadDepth(){
        return treadDepth > 1.6;
    }

    //1.5 Valid Tire
    public boolean validTire(boolean isWinterTire){
        boolean validPressure = validPressure();
        boolean validTreadDepth = validTreadDepth();
        boolean validWinterTire = winterTire == isWinterTire;
        return validPressure && validTreadDepth && validWinterTire;
    }
}
