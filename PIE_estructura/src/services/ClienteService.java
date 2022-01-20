package services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import daos.ClienteDao;
import domains.Cliente;

public class ClienteService {
	ClienteDao clienteDao;
	
	public List<Cliente> selectCliente() throws ClassNotFoundException, SQLException{
		List<Cliente> clienteList = new ArrayList<>();
		clienteDao = new ClienteDao();
		
		clienteList = clienteDao.selectClienteBD();
		return clienteList;
	}
	
	public boolean addCliente (Cliente cliente) throws ClassNotFoundException, SQLException{
		clienteDao = new ClienteDao();
		return clienteDao.addClienteBD(cliente);
	}
	
	public boolean deleteCliente (Cliente cliente) throws ClassNotFoundException, SQLException{
		clienteDao = new ClienteDao();
		return clienteDao.deleteClienteBD(cliente);
	}
	
	public boolean updateCliente(Cliente cliente) throws ClassNotFoundException, SQLException{
		clienteDao = new ClienteDao();
		return clienteDao.updateClienteBD(cliente);
	}
}
