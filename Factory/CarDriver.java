
// class CarDriver {
//   +createTransport() Transport
// }

class CarDriver extends Driver {

    public Transport createTransport() {
        return new Car();
    }
}