package br.com.vizi.mapper;

import javax.validation.constraints.NotNull;

import javassist.NotFoundException;

public interface Mapper<Source, Target> {

	default Target from(@NotNull Source source) throws NotFoundException {
		throw new NotFoundException("Metodo não implementado");
	}
}
