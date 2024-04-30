package tugas1;


public class Main {
    public static void main(String[] args) {
        // Membuat stasiun cuaca
        WeatherStation weatherStation = new WeatherStation();

        // Membuat pelanggan
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        Customer customer3 = new Customer("Charlie");

        // Menambahkan pelanggan ke stasiun cuaca
        weatherStation.addObserver(customer1);
        weatherStation.addObserver(customer2);
        weatherStation.addObserver(customer3);

        // Mengupdate cuaca
        weatherStation.setWeather("Cerah");

        // Menghapus satu pelanggan
        weatherStation.removeObserver(customer2);

        // Mengupdate cuaca lagi setelah satu pelanggan dihapus
        weatherStation.setWeather("Berawan");
    }
}