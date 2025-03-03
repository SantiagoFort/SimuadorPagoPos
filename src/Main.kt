import kotlin.random.Random
fun main() {
    println("Bienvenido al Simulador de Pago POS By: Santiago Fort")

    // Solicitar monto
    print("Ingrese el monto a pagar: ")
    val monto = readLine()?.toDoubleOrNull()

    if (monto == null || monto <= 0) {
        println("Monto inválido. Intente nuevamente.")
        return
    }

    // Selección del método de pago
    println("Seleccione el método de pago:")
    println("1 - Débito")
    println("2 - Crédito")
    print("Opción: ")

    val opcion = readLine()

    val metodoPago = when (opcion) {
        "1" -> "Débito"
        "2" -> "Crédito"
        else -> {
            println("Opción inválida. Intente nuevamente.")
            return
        }
    }

    println("Método de pago seleccionado: $metodoPago")
    println("Monto ingresado: $$monto")

    // Simulacion de aprobacion
    println("Procesando pago...")

    val pagoAprobado = Random.nextBoolean() // Genera aleatoriamente true o flase

    if (pagoAprobado) {
        println("Pago aproado. Gracias por su compra!")
    } else {
        println("Pago rechazado. Intente nuevamente con otro metodo de pagog")
    }
}
