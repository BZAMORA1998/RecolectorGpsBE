package com.sistema.dto;

import lombok.Data;

@Data
public class EnviarEmailDTO {
	private String email; 
	private String asunto; 
	private String contenido;
}
