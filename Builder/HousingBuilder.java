
// class HousingBuilder {
//     <<interface>>
//     +setSize(int size)* HousingBuilder
//     +setPrice(int price)* HousingBuilder
//     +setRooms(int rooms)* HousingBuilder
//     +setName(String name)* HousingBuilder
//     +build()* Housing
// }



interface HousingBuilder {

    public HousingBuilder setSize(int size);

    public HousingBuilder setPrice(int price);

    public HousingBuilder setRooms(int rooms);

    public HousingBuilder setName(String name);

    public Housing build();

}