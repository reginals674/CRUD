import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CTransaccion {
    String fechaHora;
    String operacion;
    String objetoAfectado;
    
    public CTransaccion(String operacion, String objetoAfectado) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm:ss");
        this.fechaHora = LocalDateTime.now().format(formatter);
        this.operacion = operacion;
        this.objetoAfectado = objetoAfectado;
    }
    
    @Override
    public String toString() {
        return fechaHora + " " + operacion + " " + objetoAfectado;
    }
}
