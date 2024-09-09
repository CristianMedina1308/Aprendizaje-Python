import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;

            while (continuar) {
                // Mostrar las opciones de operación
                System.out.println("Elige una operación:");
                System.out.println("1. Suma (+)");
                System.out.println("2. Resta (-)");
                System.out.println("3. Multiplicación (*)");
                System.out.println("4. División (/)");
                System.out.println("5. Módulo (%)");
                System.out.println("6. Potencia (^)");
                System.out.println("7. Salir");

                // Leer la opción del usuario
                int opcion = scanner.nextInt();

                if (opcion == 7) {
                    continuar = false;
                    System.out.println("Gracias por usar la calculadora. ¡Adiós!");
                    break;
                }

                System.out.print("Introduce el primer número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Introduce el segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado;
                boolean usarMismosValores = true;

                while (usarMismosValores) {
                    // Realizar la operación seleccionada
                    switch (opcion) {
                        case 1 -> {
                            resultado = num1 + num2;
                            System.out.println("El resultado de la suma es: " + resultado);
                        }
                        case 2 -> {
                            resultado = num1 - num2;
                            System.out.println("El resultado de la resta es: " + resultado);
                        }
                        case 3 -> {
                            resultado = num1 * num2;
                            System.out.println("El resultado de la multiplicación es: " + resultado);
                        }
                        case 4 -> {
                            if (num2 != 0) {
                                resultado = num1 / num2;
                                System.out.println("El resultado de la división es: " + resultado);
                            } else {
                                System.out.println("Error: No se puede dividir por cero.");
                            }
                        }
                        case 5 -> {
                            resultado = num1 % num2;
                            System.out.println("El resultado del módulo es: " + resultado);
                        }
                        case 6 -> {
                            resultado = Math.pow(num1, num2);
                            System.out.println("El resultado de la potencia es: " + resultado);
                        }
                        default -> System.out.println("Opción no válida. Por favor, elige una opción del 1 al 7.");
                    }

                    // Preguntar si desea usar los mismos valores o ingresar otros
                    System.out.println("¿Deseas realizar otra operación con los mismos valores? (si/no)");
                    char respuesta = scanner.next().charAt(0);

                    if (respuesta == 'n' || respuesta == 'N') {
                        usarMismosValores = false;
                    } else {
                        // Pedir al usuario que elija otra operación con los mismos valores
                        System.out.println("Elige una operación:");
                        System.out.println("1. Suma (+)");
                        System.out.println("2. Resta (-)");
                        System.out.println("3. Multiplicación (*)");
                        System.out.println("4. División (/)");
                        System.out.println("5. Módulo (%)");
                        System.out.println("6. Potencia (^)");
                        System.out.println("7. Salir");

                        opcion = scanner.nextInt();

                        if (opcion == 7) {
                            usarMismosValores = false;
                            continuar = false;
                            System.out.println("Gracias por usar la calculadora creada por Cristian Medina ¡Adiós!");
                        }
                    }
                }

                // Preguntar si desea continuar con nuevos valores
                System.out.println("¿Deseas continuar con nuevos valores? (si/no)");
                char continuarRespuesta = scanner.next().charAt(0);

                if (continuarRespuesta == 'n' || continuarRespuesta == 'N') {
                    continuar = false;
                    System.out.println("Gracias por usar la calculadora creada por Cristian Medina ¡Adiós!");
                }

                // Línea separadora para claridad
                System.out.println("-----------------------------------");
            }
        }
    }
}
