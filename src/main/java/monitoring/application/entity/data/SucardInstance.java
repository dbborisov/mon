package monitoring.application.entity.data;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sucard_instance")
@Getter
@Setter
@NoArgsConstructor
public class SucardInstance  extends BaseEntity{

    @Column(name = "name",nullable = false, unique = true,updatable = false)
    private String name;
    @Column(name = "connection_Configuration",nullable = false, unique = true,updatable = false)
    private String connectionConfiguration;

    @OneToMany(mappedBy = "id", targetEntity = SqlScript.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SqlScript> sqlScriptList;





}
