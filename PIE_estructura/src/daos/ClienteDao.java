package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domains.Cliente;
import domains.Vuelo;

public class ClienteDao {

	public List<Cliente> selectClienteBD() throws ClassNotFoundException, SQLException {
		Connection conexion = ManageDB.connectToDB();
		
		Statement pst = conexion.createStatement();
        ResultSet rs = pst.executeQuery("SELECT c.id, c.nombre, v.idVuelo, v.nombreVuelo FROM cliente c, vuelo v");
        ArrayList<Cliente> resultado = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            Vuelo v = new Vuelo();
            int idV = rs.getInt("idVuelo");
            String nomV = rs.getString("nombreVuelo");
            v.setIdVuelo(idV);
            v.setNombreVuelo(nomV);
            Cliente c = new Cliente(id, nombre, v);
            resultado.add(c);
        }
		
		ManageDB.closeConnection(conexion);
		return resultado;
	}
	
	public boolean addClienteBD(Cliente cliente) throws ClassNotFoundException, SQLException {
		boolean anyadido = false;
		Connection conexion = ManageDB.connectToDB();

		Statement st = conexion.createStatement();
		int lineas = st.executeUpdate("INSERT INTO cliente (nombre, idVuelo) VALUES('" + cliente.getNombre() + "', " + cliente.getVuelo().getIdVuelo() + ")");
		if (lineas > 0) {
			anyadido = true;
		}

		ManageDB.closeConnection(conexion);
		return anyadido;
	}
	
	public boolean deleteClienteBD(Cliente cliente) throws ClassNotFoundException, SQLException {
		boolean borrado = false;
		Connection conexion = ManageDB.connectToDB();

		Statement st = conexion.createStatement();
		st.executeUpdate("DELETE FROM cliente WHERE id = " + cliente.getId());
		
		ManageDB.closeConnection(conexion);
		borrado = true;
		return borrado;
	}
	
	public boolean updateClienteBD(Cliente cliente) throws SQLException, ClassNotFoundException {
		boolean update = false;
		Connection conexion = ManageDB.connectToDB();
		
		Statement st = conexion.createStatement();
		st.executeUpdate("UPDATE cliente SET nombre = '" + cliente.getNombre() + "', idVuelo = " + cliente.getVuelo().getIdVuelo() + " WHERE id = " + cliente.getId());
		
		ManageDB.closeConnection(conexion);
		update = true;
		return update;
	}
	
}
