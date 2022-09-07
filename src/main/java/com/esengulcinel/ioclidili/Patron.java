package com.esengulcinel.ioclidili;

public class Patron implements IPatronInterface {
    @Override
    public String surum(String data) {
        return "surum" + data;
    }
}
