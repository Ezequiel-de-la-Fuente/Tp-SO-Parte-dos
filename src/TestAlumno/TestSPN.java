package TestAlumno;

import Model.Prioridad;
import Model.admProcesamiento;
import Model.admTablaProcesos;

public class TestSPN {
	public static void main(String[] args) {
		admProcesamiento admP1 = new admProcesamiento(20, 80);

		admP1.agregarProceso("P1", 1, 6, 5, 9, Prioridad.Alta);
		admP1.agregarProceso("P2", 1, 6, 3, 5, Prioridad.Baja);
		admP1.agregarProceso("P3", 2, 4, 6, 2, Prioridad.Media);
		admP1.agregarProceso("P4", 3, 5, 4, 8, Prioridad.Baja);
		admP1.agregarProceso("P5", 3, 6, 2, 4, Prioridad.Alta);
		admP1.agregarProceso("P6", 4, 2, 1, 5, Prioridad.Media);

		System.out.println("----------- Planificador SPN -----------");
		System.out.println(admP1.mostrarPlanificador(admP1.planificarSPN()));
		System.out.println(admP1.mostrarProcesos() + "\n-> hay 1 procesador" + "\n-> E/S Se realiza en paralelo\n");
		
		System.out.println("----------- Resultados SPN -----------");
		admTablaProcesos admTP1 = new admTablaProcesos(admP1);
		System.out.println(admTP1.mostrarResultados(admP1.planificarSPN()));
	}
}
