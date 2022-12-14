package com.esengulcinel.cdi;

import com.esengulcinel.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {

    //Bütün her şeyi burdan okusun
    //dto -->objeler arası veri taşıma işlemi

    @Produces
    //üretilen
    public String uretilenData(@New StudentDto studentDto){
        studentDto=StudentDto.builder().
                studentId(0L).
                studentName("BURADA BIR OGRENCI ISMI VAR !!").build();

        return studentDto.getStudentName();
    }
    @Getter
    @Inject
    private String tuketilenData;
}
