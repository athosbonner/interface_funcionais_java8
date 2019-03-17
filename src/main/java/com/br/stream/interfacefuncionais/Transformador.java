package com.br.stream.interfacefuncionais;

@FunctionalInterface
public interface Transformador<T> {
	
	String transforma(T t);
	
}
