package monitoring.application.entity.data;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sql_script")
@Getter
@Setter
@NoArgsConstructor
public class SqlScript extends BaseEntity {
    @Column(name = "viewName",nullable = false, unique = true,updatable = false)
    private String viewName;

    @Column(name = "script", unique = true)
    private String script;


}
