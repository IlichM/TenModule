package ProductComparable;
import java.time.LocalDateTime;
import  java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Product implements Comparable<Product> {
    private final String brand;
    private final String name;
    private final long serialNumber;
    private final LocalDateTime creatDate;

    public Product(String brand, String name, long serialNumber, LocalDateTime creatDate) {
        if(brand == null || name == null || serialNumber == 0 || creatDate == null) {
            throw new IllegalArgumentException();
        }
        this.brand = brand;
        this.name = name;
        this.serialNumber = serialNumber;
        this.creatDate = creatDate;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public LocalDateTime getCreatDate() {
        return creatDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return serialNumber == product.serialNumber && brand.equals(product.brand) && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, name, serialNumber);
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                ", creatDate=" + creatDate +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return brand.compareTo(o.brand);
    }

    public static void main(String[] args) {

        Set<Product> set = new TreeSet<>();
        set.add(new Product("СуперБренд", "Колбаса", 3435425245L, LocalDateTime.now()));
        set.add(new Product("ЛучшийБренд", "Сыр", 434323434L, LocalDateTime.now()));
        set.add(new Product("ХорошийБренд", "Сыр", 4343111111L, LocalDateTime.now()));
        for (Product product : set) {
            System.out.println(product.getBrand());
        }
    }
}

