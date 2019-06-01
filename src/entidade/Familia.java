package entidade;

import java.util.List;

public class Familia{
	
	private List<Usuario> membros;
	private Usuario admin;
	
	public List<Usuario> getMembros() {
		return membros;
	}
	public void setMembros(List<Usuario> membros) {
		this.membros = membros;
	}
	public Usuario getAdmin() {
		return admin;
	}
	public void setAdmin(Usuario admin) {
		this.admin = admin;
	}
	
	public Familia(Usuario admin) {
		this.admin = admin;
	}
}
