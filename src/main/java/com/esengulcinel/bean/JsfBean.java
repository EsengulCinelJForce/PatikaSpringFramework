package com.esengulcinel.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;



@Named(value = "cdiBean")
@RequestScoped
@Getter @Setter

public class JsfBean {
    private String patika;

    public JsfBean() {
       patika="Spring Boot egitimine hg";
    }

}
