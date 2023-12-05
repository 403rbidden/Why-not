import java.time.LocalDate;

public class NocheDeNiebla {

    public static int obtenerDiaDelMes() {
        // Obtiene el día actual del mes utilizando la API java.time
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getDayOfMonth();
    }

    public static void main(String[] args) {
        // System.out.println("Total de dias trabajados en el mes: " + obtenerDiaDelMes());
        iniciarRutina();
    }

    /*
     * Vacaciones para estudiar ON
     * Si en algún momento tienes la intención
     * de volver a trabajar, descomentar
    */

    public static void iniciarRutina() {
        extenderMantita();
        estudiar();
        programar();
        recogerMantita();
    }

    public static void extenderMantita() {
        System.out.println("Extendiendo la mantita");
    }

    public static void estudiar() {
        System.out.println("TFM, seguridad ofensiva, examenes semestrales...");
    }

    public static void programar() {
        System.out.println("Programando");
    }

    public static void recogerMantita() {
        System.err.println("ZzZz...");
    }
}
