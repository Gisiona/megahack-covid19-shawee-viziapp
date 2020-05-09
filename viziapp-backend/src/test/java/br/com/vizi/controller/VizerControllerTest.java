package br.com.vizi.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import br.com.vizi.dto.response.VizerResponseDto;
import br.com.vizi.entity.Vizer;
import br.com.vizi.processor.IBinarioProcessor;
import br.com.vizi.processor.IClienteProcessor;
import br.com.vizi.processor.IVizerProcessor;
import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;

@WebMvcTest
class VizerControllerTest {
	
	@Autowired
	private VizerController vizerController;
	
	@MockBean
	private IBinarioProcessor binarioProcessor;
	
	@MockBean
	private IVizerProcessor vizerProcessor;
	
	@MockBean
	private IClienteProcessor clienteProcessor;
	
	@MockBean
	private br.com.vizi.processor.IEstabelecimentoProcessor IEstabelecimentoProcessor;
	
	@BeforeEach
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(this.vizerController);
	}
	
	@Test
	public void deverRetornarSucesso_QuandoConsultarTodos() throws Exception {

		List<VizerResponseDto> dtos = new ArrayList<VizerResponseDto>();
		dtos.add(new VizerResponseDto(new Vizer()));
		
		when(vizerProcessor.consultarTodos())
		.thenReturn(dtos);
		
		RestAssuredMockMvc
		.given()
			.accept(ContentType.JSON)
			.when()
			.get("/viziapp/v1/vizers/")
			.then()
			.statusCode(HttpStatus.OK.value());			
	}
	
	
	@Test
	public void deverRetornarRegistroNull_QuandoConsultarPorId() throws Exception
	{
		List<VizerResponseDto> dtos = new ArrayList<VizerResponseDto>();
		dtos.add(new VizerResponseDto(new Vizer()));
		
		OngoingStubbing<VizerResponseDto> thenReturn = when(vizerProcessor.consultarPorId(-1L))
		.thenReturn(null);
		
		RestAssuredMockMvc
		.given()
			.accept(ContentType.JSON)
			.when()
			.get("/viziapp/v1/vizers/{id}", -1L)
			.then()
			.statusCode(HttpStatus.OK.value());			
	}
	
}
