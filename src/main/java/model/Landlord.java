package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Landlord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "landlord_tenant",
            joinColumns = @JoinColumn(name = "landlord_id"),
            inverseJoinColumns = @JoinColumn(name = "tenant_id"))
    private List<Landlord> tenant;
}
