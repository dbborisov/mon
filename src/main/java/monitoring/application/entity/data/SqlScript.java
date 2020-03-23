package monitoring.application.entity.data;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "sql_script")
@Getter
@Setter
@NoArgsConstructor
public class SqlScript extends BaseEntity {
    @Column(name = "viewName")
    private String viewName;

    @Column(name = "script")
    private String script;

    @ManyToOne
    SucardInstance sucardInstance;


}
