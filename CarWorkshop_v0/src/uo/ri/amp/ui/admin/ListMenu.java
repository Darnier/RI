package uo.ri.amp.ui.admin;

import alb.util.menu.BaseMenu;
import uo.ri.amp.ui.admin.action.attendance.ListAttendanceBygradeAction;
import uo.ri.amp.ui.admin.action.grade.ListGradesAction;
import uo.ri.amp.ui.admin.action.list.ListHoursByMechanicAction;
import uo.ri.amp.ui.admin.action.list.ListHoursByTypeAction;
import uo.ri.amp.ui.foreman.action.ListBreakdownAction;


public class ListMenu extends BaseMenu {

    public ListMenu() {
        menuOptions = new Object[][] {
                { "Administrador > Listados", null },
                { "Listar cursos", 				                                    ListGradesAction.class },
                { "Listar asistencias a un curso", 	                                ListAttendanceBygradeAction.class },
                { "Horas de formación por mecánico", 				                ListHoursByMechanicAction.class },
                { "Mecánicos que han asisitdo a formación por tipo de vehículo", 	ListHoursByTypeAction.class },
                { "Ver historial de averías",                                       ListBreakdownAction.class },
        };
    }

    public static void main(String[] args) {
        new MainMenu().execute();
    }

}
