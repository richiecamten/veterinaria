package com.prueba.ricardo.vererinaria.dto;

import lombok.Data;

@Data
public class VeterinarioResponseDto {
    
    public VeterinarioResponseDto(){
        
    }
    
    private String id;
    private String message;
    public VeterinarioResponseDto(String id,String message) {
        this.id = id;
        this.message = message;
    }

    

}
