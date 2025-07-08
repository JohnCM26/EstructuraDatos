package ProyectoG5;
import javax.swing.JOptionPane;

public class Modulo2A{

    public static void mostrarMenuCienciaRobotica() {
        int opcion = 0;
        String textoMenu = "1. Catálogo de Proyectos\n"
                + "2. Catálogo de Estudiantes\n"
                + "3. Catálogo de Mentores\n"
                + "4. Catálogo de Mentorías\n"
                + "5. Salir";
        while (opcion != 5) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(textoMenu));
            switch (opcion) {
                case 1 -> {
                    int opcion1 = 0;
                    String textoSubMenu1 = "1. Consultar proyectos\n"
                            + "2. Agregar proyecto\n"
                            + "3. Salir";
                    while (opcion1 != 3) {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(textoSubMenu1));
                        switch (opcion) {
                            case 1 -> {
                            }
                            case 2 -> {
                            }
                            case 3 -> {
                            }
                            default ->
                                JOptionPane.showMessageDialog(null, "Opción inválida");
                        }
                    }
                }
                case 2 -> {
                    int opcion2 = 0;
                    String textoSubMenu2 = "1. Consultar estudiantes\n"
                            + "2. Agregar estudiante\n"
                            + "3. Salir";
                    while (opcion2 != 3) {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(textoSubMenu2));
                        switch (opcion) {
                            case 1 -> {
                            }
                            case 2 -> {
                            }
                            case 3 -> {
                            }
                            default ->
                                JOptionPane.showMessageDialog(null, "Opción inválida");
                        }
                    }
                }
                case 3 -> {
                    int opcion3 = 0;
                    String textoSubMenu3 = "1. Consultar mentores\n"
                            + "2. Agregar mentor\n"
                            + "3. Salir";
                    while (opcion3 != 3) {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(textoSubMenu3));
                        switch (opcion) {
                            case 1 -> {
                            }
                            case 2 -> {
                            }
                            case 3 -> {
                            }
                            default ->
                                JOptionPane.showMessageDialog(null, "Opción inválida");
                        }
                    }
                }
                case 4 -> {
                    int opcion4 = 0;
                    String textoSubMenu4 = "1. Consultar mentorías\n"
                            + "2. Agregar mentoría\n"
                            + "3. Salir";
                    while (opcion4 != 3) {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(textoSubMenu4));
                        switch (opcion) {
                            case 1 -> {
                            }
                            case 2 -> {
                            }
                            case 3 -> {
                            }
                            default ->
                                JOptionPane.showMessageDialog(null, "Opción inválida");
                        }
                    }
                }
                case 5 -> {
                }
                default ->
                    JOptionPane.showMessageDialog(null, "Sub opción inválida");
            }
        }
    }
}
