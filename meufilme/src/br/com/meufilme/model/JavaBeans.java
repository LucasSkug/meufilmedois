package br.com.meufilme.model;

public class JavaBeans {
	private String id;
	private String titulo;
	private String genero;
	private String topfilmes;
	
	
	public JavaBeans() {
		super();	
	}
	

	public JavaBeans(String id, String titulo, String genero, String topfilmes) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.topfilmes = topfilmes;
	}


	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public String getGenero() {
		return genero;
	}
	
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	public String getTopfilmes() {
		return topfilmes;
	}
	
	
	public void setTopfilmes(String topfilmes) {
		this.topfilmes = topfilmes;
	}
	
	

}
