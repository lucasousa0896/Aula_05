package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.Pais;

public class PaisDAO 
{	
	public void Incluir(Pais pais)
	{
		String sqlQuery = String.format("INSERT INTO testeaulas.TB_Pais(NomePais, PopulacaoPais) VALUES('%s', %d);"
										 , pais.getNomePais(), pais.getPopulacaoPais());
	
		try
		{
			ExecutarComando(sqlQuery);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void Excluir(Pais pais)
	{
		String sqlQuery = String.format("DELETE FROM testeaulas.TB_Pais WHERE IdPais = %d;"
										 , pais.getIdPais());
		
		try
		{
			ExecutarComando(sqlQuery);
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void Atualizar(Pais pais)
	{
		String sqlQuery = String.format("UPDATE testeaulas.TB_Pais SET NomePais = '%s', PopulacaoPais = %d WHERE IdPais = %d;"
										 , pais.getNomePais(), pais.getPopulacaoPais(), pais.getIdPais());
		
		try
		{
			ExecutarComando(sqlQuery);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void Exibir(Pais pais)
	{
		String sqlQuery = String.format("SELECT NomePais, PopulacaoPais FROM testeaulas.TB_Pais WHERE IdPais = %d;"
										 , pais.getIdPais());
		
		try(Connection conn = ConnectionFactory.CriarConexao();
			PreparedStatement stm = conn.prepareStatement(sqlQuery);)
		{
			try(ResultSet rs = stm.executeQuery();)
			{
				if(rs.next())
				{
					pais.setNomePais(rs.getString("NomePais"));
					pais.setPopulacaoPais(rs.getString("PopulacaoPais"));
				}
				else
				{
					pais.setIdPais(-1);
					pais.setNomePais(null);
					pais.setPopulacaoPais(null);
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	private void ExecutarComando(String sqlQuery)
	{
		try(Connection conn = ConnectionFactory.CriarConexao();
			PreparedStatement stm = conn.prepareStatement(sqlQuery);)
		{
			stm.execute();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
