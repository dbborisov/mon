package monitoring.application.app.web.model.get_model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@RequiredArgsConstructor
public class SucardInstanceViewModel {


    long id ;

    private String name;

    private String connectionConfiguration;
}
