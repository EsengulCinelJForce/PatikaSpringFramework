package com.esengulcinel.qualifier;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "Default data : " + data;
    }
}
