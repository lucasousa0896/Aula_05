package Service;

import javax.swing.JOptionPane;

import DAO.PaisDAO;
import Model.Pais;


public class PaisService 
{
	PaisDAO paisDao = new PaisDAO();
	
	public void Incluir(Pais pais)
	{
		paisDao.Incluir(pais);
		
		JOptionPane.showMessageDialog(null, "�tem inclu�do com sucesso!!");
	}
	
	public void Excluir(Pais pais)
	{
		paisDao.Excluir(pais);
		
		JOptionPane.showMessageDialog(null, "�tem exclu�do com sucesso!!");
	}
	
	public void Atualizar(Pais pais)
	{
		paisDao.Atualizar(pais);
		
		JOptionPane.showMessageDialog(null, "�tem alterado com sucesso!!");
	}
	
	public void Exibir(Pais pais)
	{
		paisDao.Exibir(pais);
	}
}
