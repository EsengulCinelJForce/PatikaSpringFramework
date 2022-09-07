package com.esengulcinel.cdi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Data                   //getter setter yerine
@AllArgsConstructor     //parametreli bileşen
@NoArgsConstructor      //parametresiz bileşen
@Builder
//---üsttekilerin hepsi lombok ile gelenler
//--- bunun bir cdi yapısı olması için ..;

// cdi ==>bean yapısı
@Named(value = "namedtuto")
@ApplicationScoped      //uygulama boyunca açık anlamadında

public class _01_Named {
    private Long namedId;
    private String nameData="merhabalar named cdi bean";

}
