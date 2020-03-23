package monitoring.application.service.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserServiceModel {

    private Long id;

    private String username;

    private String password;

    private List<SucardInstanceServiceModel> instances;
}
