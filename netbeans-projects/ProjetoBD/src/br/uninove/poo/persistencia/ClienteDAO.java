package br.uninove.poo.persistencia;
 
import java.sql.*;
import java.util.ArrayList;
import br.uninove.poo.persistencia.Cliente;
 
public class ClienteDAO {
 
    //Não esqueça de atualizar para os dados de SEU BANCO DE DADOS:
    String url = "jdbc:mysql://localhost:3306/uninove";
    String usuario = "uninove";
    String senha = "Senha123";
 
    Connection con;
    PreparedStatement st;
    private ResultSet rs;
 
    public int conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
            return 1;
        } catch (ClassNotFoundException ex) {
            return 2;
        } catch (SQLException ex) {
            return 3;
        }
    }
 
    public int desconectar() {
        try {
            con.close();
            return 1;
        } catch (SQLException ex) {
 
            return 0;
        }
    }
 
    public int salvar(Cliente cli) {
        try {
            st = con.prepareStatement("insert into cliente "
                    + "(id, nome, telefone, sexo, renda) "
                    + "values (?, ?, ?, ?, ?)");
            st.setInt(1, cli.getId());
            st.setString(2, cli.getNome());
            st.setString(3, cli.getTelefone());
            st.setString(4, cli.getSexo());
            st.setDouble(5, cli.getRenda());
            int retorno = st.executeUpdate();
            return retorno;
        } catch (SQLException ex) {
            int c = ex.getErrorCode();
            if (c == 1062) {
                return 2;
            } else {
                return 3;
            }
        }
    }
 
    //Método para consultar apenas um cliente cujo id foi informado
    public Cliente buscar(int id) {
        try {
            st = con.prepareStatement("select * from cliente where id = ? ");
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("id"));
                cli.setNome(rs.getString("nome"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setSexo(rs.getString("sexo"));
                cli.setRenda(rs.getDouble("renda"));
                return cli;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
 
    //Método para buscar todos os registros cadastrados
    public ArrayList buscarTudo() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        try {
            st = con.prepareStatement("select * from cliente");
            rs = st.executeQuery();
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("id"));
                cli.setNome(rs.getString("nome"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setSexo(rs.getString("sexo"));
                cli.setRenda(rs.getDouble("renda"));
                listaClientes.add(cli);
            }
            return listaClientes;
        } catch (SQLException ex) {
            return null;
        }
    }
 
    //Método para excluir um registro cujo id foi informado
    public int excluir(int id) {
        try {
            st = con.prepareStatement("delete from cliente where id = ? ");
            st.setInt(1, id);
            int r = st.executeUpdate();
            return r;
        } catch (SQLException ex) {
            return 0;
        }
    }
 
    // Método para alterar o registro cujo id foi informado
    public int salvarAlteracao(Cliente cli) {
        try {
            st = con.prepareStatement("update cliente set nome=?, telefone=?, sexo=?, renda=? where id=?");
            st.setString(1, cli.getNome());
            st.setString(2, cli.getTelefone());
            st.setString(3, cli.getSexo());
            st.setDouble(4, cli.getRenda());
            st.setInt(5, cli.getId());
            int r = st.executeUpdate();
            return r;
        } catch (SQLException ex) {
            return 0;
        }
    }
}