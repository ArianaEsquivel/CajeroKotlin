import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var seguir : Boolean = true
    var intentos : Int = 0
    var cajero = Cajero()
    cajero.listCuentas.add(Cuenta("Ariana", "Esquivel", "Ruiz", "ARI", 1234, 2880f))
    cajero.nombre = "ARIBANK";
    for (i in 1..3) {
//        cajero.listBVeinte.add(Veinte())
//        cajero.listBVeinte.add(Veinte())
//        cajero.listBVeinte.add(Veinte())
//        cajero.listBCincuenta.add(Cincuenta())
        cajero.listBCincuenta.add(Cincuenta())
        cajero.listBCien.add(Cien())
        cajero.listBDoscientos.add(Doscientos())
        cajero.listBDoscientos.add(Doscientos())
        cajero.listBDoscientos.add(Doscientos())
        cajero.listBQuinientos.add(Quinientos())
        cajero.listBQuinientos.add(Quinientos())
    }
    do {
        println("📍 📍 📍 📍 📍 📍 📍 📍")
        println("BIENVENIDE A ${cajero.nombre}🤍🏦")
//        println((100).div(20))
//        println((340).mod(20))
//        println((350).mod(50))
//        println(((340).mod(50)).mod(20))
//        println((350).div(50))
//        println((350).mod(50))
        println("¿Qué operación deseas realizar?😊")
        println("👉🏼 1 ⇢ Ingresar dinero al cajero")
        println("👉🏼 2 ⇢ Retirar dinero")
        println("👉🏼 3 ⇢ Crear una cuenta")
        println("👉🏼 4 ⇢ Depositar dinero")
        println("👉🏼 5 ⇢ Estado de cuenta")
        println("👉🏼 6 ⇢ Saldo del cajero")
        println("👉🏼 7 ⇢ Salir")
        print("Operación 👉🏼 ")
        val opcion = readLine()
        var opcionS = opcion.toString().filter { c -> c.isDigit() }
        var opcionI =  if (opcionS.isBlank()) 0 else opcionS.toInt()
        when (opcionI) {
            1 -> {
                cajero.ingresarDinero()
                var tec = readLine()
            }
            2 -> {
                cajero.retirarDinero()
                var tec = readLine()
            }
            3 -> {
                cajero.crearCuenta()
                var tec = readLine()
            }
            4 -> {
                cajero.depositarDinero()
                var tec = readLine()
            }
            5 -> {
                cajero.estadoDeCuenta()
                var tec = readLine()
            }
            6 -> {
                cajero.dineroDisponible()
                var tec = readLine()
            }
            7 -> {
                seguir = false
                println("Hasta luego vuelve pronto🤍")
            }
            else -> {
                intentos += 1
                if (intentos <= 3){
                    println("Lo siento, tu respuesta no es válida, te quedan ${3 - intentos} intentos restantes.🤕")
                    println("Presiona enter para continuar")
                    var tec = readLine()
                }
                else {
                    println("Alcanzaste el número máximo de intentos, adiós.🤧")
                    seguir = false
                }
            }
        }
    }while (seguir)
}