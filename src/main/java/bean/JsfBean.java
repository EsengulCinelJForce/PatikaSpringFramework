package bean;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;


@Named(value = "cdiBean")
@RequestScoped
//normalde constructor sınıfının get set metotlarını alt insert ile tanımlıyorduk
//ama burda lombok kütüphanesini pom.xml e eklediğimiz için böyle bir kolaylık sağlıyor.
@Setter
@Getter

public class JsfBean {
    private String patika;

    public JsfBean() {
       patika="Spring Boot egitimine hg";
    }

}
