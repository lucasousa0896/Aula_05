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
		
		JOptionPane.showMessageDialog(null, "Ítem incluído com sucesso!!");
	}
	
	public void Excluir(Pais pais)
	{
		paisDao.Excluir(pais);
		
		JOptionPane.showMessageDialog(null, "Ítem excluído com sucesso!!");
	}
	
	public void Atualizar(Pais pais)
	{
		paisDao.Atualizar(pais);
		
		JOptionPane.showMessageDialog(null, "Ítem alterado com sucesso!!");
	}
	
	public void Exibir(Pais pais)
	{
		paisDao.Exibir(pais);
	}
}
