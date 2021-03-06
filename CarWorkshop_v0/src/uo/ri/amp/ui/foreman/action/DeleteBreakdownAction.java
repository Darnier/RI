package uo.ri.amp.ui.foreman.action;

import alb.util.menu.Action;
import uo.ri.amp.conf.ServiceFactory;
import uo.ri.amp.model.Averia;
import uo.ri.amp.model.Vehiculo;
import java.util.Date;

import static alb.util.console.Console.println;
import static uo.ri.amp.util.Lector.*;

/**
 * Created by Jorge.
 */
public class DeleteBreakdownAction implements Action {

    @Override
    public void execute() throws Exception {

        // Pedir datos
        String matricula = leerCadena("Matricula del coche");
        Date fecha = leerFecha("Fecha de entrada (dd/mm/yyyy)");

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMacricula(matricula);


        Averia averia = new Averia();
        averia.setVehiculo(vehiculo);
        averia.setFecha(fecha);

        //Procesar
        ServiceFactory.getForemanService().removeBreakdown(averia);

        //Mostrar resultado
        println("Se ha eliminado la avería correctamente.");
    }
}