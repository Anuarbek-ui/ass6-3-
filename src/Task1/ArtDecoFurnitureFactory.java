package Task1;

public class ArtDecoFurnitureFactory implements IFunitureFactory{
public Chair createChair() {
    return new ArtDecoChair();
}


    public ArtDecoSofa createSofa() {
        return new ArtDecoSofa();
    }


    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
