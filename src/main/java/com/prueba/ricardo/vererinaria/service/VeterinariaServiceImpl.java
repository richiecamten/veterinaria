package com.prueba.ricardo.vererinaria.service;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.ricardo.vererinaria.dto.GenerarCitaDto;
import com.prueba.ricardo.vererinaria.dto.VeterinarioDto;
import com.prueba.ricardo.vererinaria.dto.VeterinarioResponseDto;
import com.prueba.ricardo.vererinaria.persistence.entity.CitaEnt;
import com.prueba.ricardo.vererinaria.persistence.entity.MascotaEnt;
import com.prueba.ricardo.vererinaria.persistence.entity.PropiertarioEnt;
import com.prueba.ricardo.vererinaria.persistence.entity.VeterinarioEnt;
import com.prueba.ricardo.vererinaria.persistence.repository.CitaEntRepository;
import com.prueba.ricardo.vererinaria.persistence.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Value;

@Service
public class VeterinariaServiceImpl  implements VertinariaService {


    @Autowired
    private  VeterinarioRepository veterinarioRepository;
    @Autowired
    private  CitaEntRepository citaEntRepository;

    @Value("${VETERINARIA_APP}")
    private String app;

    @Value("${VETERINARIA_KEY}")
    private String key;
    

    @Override
    public VeterinarioResponseDto newVeterinario(VeterinarioDto veterinarioDto) {
         
        try
        {      
            ModelMapper mapper = new ModelMapper();      
            return  new  VeterinarioResponseDto(this.veterinarioRepository.save( 
                    mapper.map(veterinarioDto, VeterinarioEnt.class) ).getCedula() , app + " * Message  * " + key );

        }
        catch (Exception e)
        {
            e.printStackTrace();
            return  new  VeterinarioResponseDto("ERROR","");
        }

    }

    @Override
    public String processCita(GenerarCitaDto citaDto) {
        
        try{


            
            ModelMapper mapper = new ModelMapper();
            CitaEnt citaEnt = new CitaEnt();

            citaEnt.setVeterinario( this.veterinarioRepository.findById(citaDto.getCedulaVeterianrio() ).get());
            citaEnt.setFechaCita( citaDto.getFecha() == null ?  new Date() : citaDto.getFecha()  );
            citaEnt.setMascota( mapper.map( citaDto, MascotaEnt.class )  );
            citaEnt.getMascota().setPropiertario(mapper.map( citaDto.getDto().getPropiertario(), PropiertarioEnt.class ));
            this.citaEntRepository.save(citaEnt);

            return "OK";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "ERROR";
        }


    }
    



    
}
