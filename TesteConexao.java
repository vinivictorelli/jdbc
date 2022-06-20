import java.sql.Connection;
import java.sql.DriverManager;
public class TesteConexao {
    public static void main(String[] args) {
        try {
            Connection minhaConexao = DriverManager.getConnection(
            url:"jdbc:mysql://localhost:3306/usjt_psc_sexta",
            user:"root",
            password:"usjt@2019");
            System.out.println("Conexão OK");
            minhaConexao.close();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
            System.out.println("Conexão OK");
        }
    }
}