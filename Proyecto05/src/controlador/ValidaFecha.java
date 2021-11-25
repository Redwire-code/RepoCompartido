package controlador;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ValidaFecha {
    
    public static GregorianCalendar setFechaAlta(String fecha, int auxNum) {

        String dia = "", mes = "", anio = "";
        int bandera = 0, diaAux, mesAux, anioAux;
        char c;

        //Primero tenemos que extraer de la cadena el dia el mes y el año
        for (int i = 0; i < fecha.length(); i++) {

            c = fecha.charAt(i);

            if (c != '-') {

                if (bandera == 0) {

                    dia += c;

                }

                if (bandera == 1) {

                    mes += c;

                }

                if (bandera == 2) {

                    anio += c;

                }

            } else {

                bandera++;

            }

        }

        //Realizamos el casting de string a int
        diaAux = Integer.parseInt(dia);
        mesAux = Integer.parseInt(mes) - 1;
        anioAux = Integer.parseInt(anio);

        //Validamos la fecha
        int res = validar(diaAux, mesAux, anioAux);

        if (res == 0) {

            GregorianCalendar fechaAux = new GregorianCalendar(anioAux, mesAux, diaAux);
            return fechaAux;

        } else {

            if(auxNum == 1){
                System.out.print("Se ha establecido la fecha de hoy, ya que la introducida es incorrecta.");
            }
            
            //Establecemos la fecha de hoy
            GregorianCalendar aux = new GregorianCalendar();
            int d = aux.get(Calendar.DAY_OF_MONTH);
            int m = aux.get(Calendar.MONTH);
            int a = aux.get(Calendar.YEAR);

            GregorianCalendar fechaAux = new GregorianCalendar(a, m, d);
            return fechaAux;
        }

    }

    public static int validar(int dia, int mes, int anio) {

        int bandera = 0;

        if (dia <= 0) {
            bandera++;
        }

        if (mes < 0 || mes > 11) {
            bandera++;
        }

        if (anio <= 0) {
            bandera++;
        }

        switch (mes) {

            //Meses 28 dias
            case 1:
                if (dia > 28) {
                    bandera++;
                }
                ;
                break;
            //Meses 30 dias
            case 3:
                if (dia > 30) {
                    bandera++;
                }
                ;
                break;
            case 5:
                if (dia > 30) {
                    bandera++;
                }
                ;
                break;
            case 8:
                if (dia > 30) {
                    bandera++;
                }
                ;
                break;
            case 10:
                if (dia > 30) {
                    bandera++;
                }
                ;
                break;
            //Meses 31 dias
            case 0:
                if (dia > 31) {
                    bandera++;
                }
                ;
                break;
            case 2:
                if (dia > 31) {
                    bandera++;
                }
                ;
                break;
            case 4:
                if (dia > 31) {
                    bandera++;
                }
                ;
                break;
            case 6:
                if (dia > 31) {
                    bandera++;
                }
                ;
                break;
            case 7:
                if (dia > 31) {
                    bandera++;
                }
                ;
                break;
            case 9:
                if (dia > 31) {
                    bandera++;
                }
                ;
                break;
            case 11:
                if (dia > 31) {
                    bandera++;
                }
                ;
                break;

        }

        return bandera;

    }
    
}
