package com.example.proyectoa;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface API {

    @GET("Total")
    Call<Value> getTotal();

    //Tipos de bebida
    @GET("Tipo/Gaseosa")
    Call<Value> getTipoGaseosa();

    @GET("Tipo/Fria")
    Call<Value> getTipoFria();

    @GET("Tipo/Caliente")
    Call<Value> getTipoCaliente();

    //Size del vaso
    @GET("Size/Pequeña")
    Call<Value> getSizeSmall();

    @GET("Size/Mediana")
    Call<Value> getSizeMediano();

    @GET("Size/Grande")
    Call<Value> getSizeGrande();


    @POST("/Insert")
    Call<Drink> PostData(@Body Drink drink);


}
