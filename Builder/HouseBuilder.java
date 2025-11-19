
// class HouseBuilder {
//     -House house
//     +setSize(int size) HousingBuilder
//     +setPrice(int price) HousingBuilder
//     +setRooms(int rooms) HousingBuilder
//     +setName(String name) HousingBuilder
//     +build() Housing
// }

class HouseBuilder implements HousingBuilder {

    private House house = new House();

    public House build() {
        return this.house;
    }

    @Override
    public HouseBuilder setSize(int size) {
        this.house.setSize(size);
        return this;
    }

    @Override
    public HouseBuilder setName(String name) {
        this.house.setName(name);
        return this;
    }

    @Override
    public HouseBuilder setPrice(int price) {
        this.house.setPrice(price);
        return this;
    }

    @Override
    public HouseBuilder setRooms(int rooms) {
        this.house.setRooms(rooms);
        return this;
    }

}