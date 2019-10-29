import java.sql.*;


public class Ejemplo {

public static void main(String[]args) {
try {
Class.forName("org.sqlite.JDBC");


Connection conn = DriverManager.getConnection("jdbc:sqlite:data/ejemplo.db");
Statement stmt = conn.createStatement();
// conexion abierta
// statement creado
ResultSet rs = stmt.executeQuery("SELECT Nombre, Apellidos FROM usuarios");

while(rs.next()) {
String nombre = rs.getString("nombre");
String apellido = rs.getString("apellido");


System.out.println("Nombre:" +nombre+ "apellido" +apellido );
}

//ya no queremos usarla mas

stmt.close();
conn.close();

}catch(ClassNotFoundException e) {
System.out.println("No se ha podido cargar el driver");
}catch(SQLException e) {
System.out.println("No se ha podido cargar la BD");
}


}
}

