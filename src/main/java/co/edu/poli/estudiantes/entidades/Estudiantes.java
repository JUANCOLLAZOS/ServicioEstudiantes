package co.edu.poli.estudiantes.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estudiantes {
	@Id	
	private long IDENTIFICACION;
	private String NOMBRES;
	private String APELLIDOS;
	private String CORREO;
	
	public Estudiantes() {
		
		
	}

	public long getIDENTIFICACION() {
		return IDENTIFICACION;
	}

	public void setIDENTIFICACION(long iDENTIFICACION) {
		IDENTIFICACION = iDENTIFICACION;
	}

	public String getNOMBRES() {
		return NOMBRES;
	}

	public void setNOMBRES(String nOMBRES) {
		NOMBRES = nOMBRES;
	}

	public String getAPELLIDOS() {
		return APELLIDOS;
	}

	public void setAPELLIDOS(String aPELLIDOS) {
		APELLIDOS = aPELLIDOS;
	}

	public String getCORREO() {
		return CORREO;
	}

	public void setCORREO(String cORREO) {
		CORREO = cORREO;
	}
}
