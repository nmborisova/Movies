package bg.smg.model;

import lombok.Data;
@Data
public class Studio {
    private String name;
    private String address;
    private int presc;

    @Override
    public String toString() {
        return "Studio{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", presc=" + presc +
                '}';
    }
}
