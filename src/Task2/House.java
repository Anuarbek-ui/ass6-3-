package Task2;

public class House {
    private String streetAddress;
    private int volume;
    private int quantityOfRooms;
    private int quantityOfRestroom;
    private double price;

    public String getStreetAddress() {
        return streetAddress;
    }

    public int getVolume() {
        return volume;
    }

    public int getQuantityOfRooms() {
        return quantityOfRooms;
    }

    public int getQuantityOfRestroom() {
        return quantityOfRestroom;
    }

    public double getPrice() {
        return price;
    }
    public class HouseBuilder implements VoidHouse{



        public HouseBuilder setAddress(String add) {
            streetAddress = add;
            return this;
        }


        public HouseBuilder setVolume(int vol) {
            volume = vol;
            return this;
        }


        public HouseBuilder setQuantityOfRooms(int b) {
            quantityOfRooms = b;
            return this;
        }

        public HouseBuilder setQuantityOfRestrooms(int b) {
            quantityOfRestroom = b;
            return this;
        }

        public HouseBuilder setPrice(int q) {
            price = q;
            return this;        }

        public House build() {
            return House.this;
        }
    }



}
