



// class ApartmentBuilder {
//     -Apartment apartment
//     +setSize(int size) HousingBuilder
//     +setPrice(int price) HousingBuilder
//     +setRooms(int rooms) HousingBuilder
//     +setName(String name) HousingBuilder
//     +build() Housing
// }




public class ApartmentBuilder implements HousingBuilder {

    private Apartment apartment = new Apartment();

    public Apartment build() {
        return this.apartment;
    }

    @Override
    public ApartmentBuilder setSize(int size) {
        this.apartment.setSize(size);
        return this;
    }

    @Override
    public ApartmentBuilder setName(String name) {
        this.apartment.setName(name);
        return this;
    }

    @Override
    public ApartmentBuilder setPrice(int price) {
        this.apartment.setPrice(price);
        return this;
    }

    @Override
    public ApartmentBuilder setRooms(int rooms) {
        this.apartment.setRooms(rooms);
        return this;
    }

}