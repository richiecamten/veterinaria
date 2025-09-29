package com.prueba.ricardo.vererinaria;

import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.prueba.ricardo.vererinaria.dto.GenerarCitaDto;
import com.prueba.ricardo.vererinaria.dto.MascotaDto;
import com.prueba.ricardo.vererinaria.dto.PropietarioDto;
import com.prueba.ricardo.vererinaria.dto.VeterinarioDto;
import com.prueba.ricardo.vererinaria.service.VertinariaService;

@SpringBootTest
class VererinariaApplicationTests {

/*
	@Autowired
	private VertinariaService vertinariaService;   

	@Test
	@DisplayName(" * Test Veterinario *")
	void  generateNewCita_AndValid_Status() {

		String cedulaGenerada = vertinariaService.newVeterinario( new VeterinarioDto()
		 	.celula("XD")
			.nombre("Ricardo")
			.apeM(" Camacho")).getId();
 		
		Assert.hasText(cedulaGenerada,"XD");


		GenerarCitaDto citaDto = new GenerarCitaDto();

		citaDto.setCedulaVeterianrio(cedulaGenerada);
		citaDto.setFecha(new Date());
		MascotaDto mascotaDto = new MascotaDto();
		mascotaDto.setFechaNacimiento(new Date());
		mascotaDto.setTelefono("5520147557");
		mascotaDto.setTipoPaciente( " PErro");
		PropietarioDto propietarioDto = new PropietarioDto();
		propietarioDto.setNombre("Ricks");
		propietarioDto.setApellidoMaterno(" CamTen");
		propietarioDto.setApellidoPaterno(" Rcaa");
		mascotaDto.setPropiertario(propietarioDto);
		citaDto.setDto(mascotaDto);

		String result =  vertinariaService.processCita( citaDto);


		Assert.hasText(result,"OK");


	}

*/

}
