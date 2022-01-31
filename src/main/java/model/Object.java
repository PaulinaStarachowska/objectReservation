package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Object {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String objectName;

    private BigDecimal price;

    private String description;

    public double getArea() {
        return 0;
    }

    @ManyToMany
    private List<Tenant> residentObject = new ArrayList<>();

    public void addResident(Tenant tenant, int count) {
        for (int i = 0; i < count; i++) {
            residentObject.add(tenant);
        }
    }
}


