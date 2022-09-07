package com.esengulcinel.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

public class _02_Produces {
    //bir sınıf diğerini tanımadan gevşek bir yapı ile alışveriş

    @Named(value = "producetuto ")
    @ApplicationScoped

    @Produces  //bunu üretebilmesi için
                //Bunu ürettiğimizi bir başkası tüketicek


    public List<String > getList(){
        List<String > liste=new ArrayList<>();
        liste.add("html5");
        liste.add("css3");
        liste.add("js");
        liste.add("react");
        liste.add("angular");
        return liste;
    }
}
