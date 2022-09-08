package com.esengulcinel.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qulifierCdi")
@ApplicationScoped

public class Calisan {

    @Inject
    private PatronInterface patronInterface;

//    //parametresiz cons
//    Calisan() {
//
//      //  patronInterface = new Patron();
//    }

    public String getData(String data) {

        return patronInterface.surum(data);
    }
}
