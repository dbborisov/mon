package monitoring.application.service.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import monitoring.application.entity.data.BaseEntity;
import monitoring.application.entity.data.SucardInstance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
public class SqlScriptServiceModel  {


    private Long id;

    private String viewName;

    private String script;


    long sucardInstance;


}
