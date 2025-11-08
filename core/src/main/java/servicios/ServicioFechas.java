package festivosdepais.core.servicios;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ServicioFechas {

    /**
     * Calcula el domingo de Pascua usando el algoritmo clásico
     */
    public static LocalDate getDomingoPascua(int anio) {
        int a = anio % 19;
        int b = anio / 100;
        int c = anio % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int mes = (h + l - 7 * m + 114) / 31; // 3=marzo, 4=abril
        int dia = ((h + l - 7 * m + 114) % 31) + 1;

        return LocalDate.of(anio, mes, dia);
    }

    /**
     * Devuelve el lunes siguiente a la fecha dada (si ya es lunes, devuelve la misma)
     */
    public static LocalDate siguienteLunes(LocalDate fecha) {
        DayOfWeek dow = fecha.getDayOfWeek();
        if (dow == DayOfWeek.MONDAY) {
            return fecha;
        }
        int diasParaLunes = DayOfWeek.MONDAY.getValue() - dow.getValue();
        if (diasParaLunes < 0) {
            diasParaLunes += 7;
        }
        return fecha.plusDays(diasParaLunes);
    }
}
