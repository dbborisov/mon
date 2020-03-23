package monitoring.application.service.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import monitoring.application.entity.data.BaseEntity;
import monitoring.application.entity.data.SqlScript;
import monitoring.application.entity.data.User;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class SucardInstanceServiceModel {

    private Long id;

    private String name;

    private String connectionConfiguration;


    private List<SqlScriptServiceModel> sqlScriptList;


    private long user;





}
