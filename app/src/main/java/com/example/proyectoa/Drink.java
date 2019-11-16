package com.example.proyectoa;

import com.google.gson.annotations.SerializedName;

public class Drink {
    //@SerializedName("Tipo")
    private String tipo;

    //@SerializedName("Size")
    private String size;

    //@SerializedName("Status")
    private int status;

    public Drink (String tipo, String size, int status) {
        this.tipo = tipo;
        this.size = size;
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSize() {
        return size;
    }

    public int getStatus() {
        return status;
    }
}
