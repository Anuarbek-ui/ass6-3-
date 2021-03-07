package Task1;

public class VFurnitureFactory implements IFunitureFactory{
public Chair createChair() {
    return new VChair() {
        @Override
        public void hasLegs() {

        }

        @Override
        public void setOn() {

        }

        @Override
        public void hasSeats() {

        }
    };
}


    public Sofa createSofa() {
        return new VSofa();
    }


    public CoffeeTable createCoffeeTable() {
        return new VCoffeeTable();
    }
}
