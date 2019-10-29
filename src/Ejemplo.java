import java.sql.*;


public class Ejemplo {

public static void main(String[]args) {
try {
Class.forName("org.sqlite.JDBC");


Connection conn = DriverManager.getConnection("jdbc:sqlite:data/Hoteles.db");
Statement stmt = conn.createStatement();
// conexion abierta
// statement creado
ResultSet rs = stmt.executeQuery("SELECT Nombre, Ciudad, Precio, Estrellas FROM Hoteles");

while(rs.next()) {
String nombre = rs.getString("Nombre");
String ciudad = rs.getString("Ciudad");
int precio = rs.getInt("Precio");
int estrellas = rs.getInt("Estrellas");



System.out.println("Nombre:" +nombre+ "ciudad" +ciudad + "precio: " + precio +"estrellas" + estrellas );
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

