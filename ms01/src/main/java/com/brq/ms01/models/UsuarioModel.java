package com.brq.ms01.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {

    private int id;
    private String nome;
    private String email;

//    public UsuarioModel(){
//
//    }
//    public UsuarioModel(int id, String nome, String email){
//
//    }
//    public void setId(int i){
//        id = i;
//    }
//
//    public int getId(){
//        return id;
//    }

}