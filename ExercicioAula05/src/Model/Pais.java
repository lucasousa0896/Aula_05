package Model;

public class Pais 
{
	int idPais;
	String nomePais;
	String populacaoPais;
	
	public Pais()
	{}
	
	public Pais(int idPais, String nomePais, String populacaoPais)
	{
		this.idPais = idPais;
		this.nomePais = nomePais;
		this.populacaoPais = populacaoPais;
	}
	

	public int getIdPais() 
	{
		return idPais;
	}

	public void setIdPais(int idPais) 
	{
		this.idPais = idPais;
	}

	public String getNomePais() 
	{
		return nomePais;
	}

	public void setNomePais(String nomePais) 
	{
		this.nomePais = nomePais;
	}

	public String getPopulacaoPais() 
	{
		return populacaoPais;
	}

	public void setPopulacaoPais(String populacaoPais) 
	{
		this.populacaoPais = populacaoPais;
	}
	
	
	public String Exibir()
	{
		return "Nome do País: " + nomePais + "\n" +
				"Populacao do País: " + populacaoPais;
	}
}
