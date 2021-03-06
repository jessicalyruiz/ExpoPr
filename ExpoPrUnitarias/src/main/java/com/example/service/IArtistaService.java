package com.example.service;

import java.util.List;

import com.example.modelo.Artista;



public interface IArtistaService {
	void guardarArtista(Artista artista);
	void modificarArtista(Artista artista);
	void borrar(Integer id);
	Artista buscar(Integer id);
	Artista buscarPorApellido(String apellido);
	Artista buscarPorApellidoTyped(String apellido);
	Artista buscarPorApellidoNamed(String apellido);
	Artista buscarPorApellidoNativeQuery(String apellido);
	List<Artista> buscarPorApellidoCriteriaApi(String apellido);
}
