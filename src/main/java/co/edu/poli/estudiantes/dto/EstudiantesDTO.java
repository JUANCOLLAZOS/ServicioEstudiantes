package co.edu.poli.estudiantes.dto;

public class EstudiantesDTO {
	private Long IDENTIFICACION;
	private String NOMBRES;
	private String APELLIDOS;
	private String CORREO;
	
	public EstudiantesDTO() {
		
	}

	public Long getIDENTIFICACION() {
		return IDENTIFICACION;
	}

	public void setIDENTIFICACION(Long iDENTIFICACION) {
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
