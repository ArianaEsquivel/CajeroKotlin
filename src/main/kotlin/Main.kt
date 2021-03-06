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
        println("π π π π π π π π")
        println("BIENVENIDE A ${cajero.nombre}π€π¦")
//        println((100).div(20))
//        println((340).mod(20))
//        println((350).mod(50))
//        println(((340).mod(50)).mod(20))
//        println((350).div(50))
//        println((350).mod(50))
        println("ΒΏQuΓ© operaciΓ³n deseas realizar?π")
        println("ππΌ 1 β’ Ingresar dinero al cajero")
        println("ππΌ 2 β’ Retirar dinero")
        println("ππΌ 3 β’ Crear una cuenta")
        println("ππΌ 4 β’ Depositar dinero")
        println("ππΌ 5 β’ Estado de cuenta")
        println("ππΌ 6 β’ Saldo del cajero")
        println("ππΌ 7 β’ Salir")
        print("OperaciΓ³n ππΌ ")
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
                println("Hasta luego vuelve prontoπ€")
            }
            else -> {
                intentos += 1
                if (intentos <= 3){
                    println("Lo siento, tu respuesta no es vΓ‘lida, te quedan ${3 - intentos} intentos restantes.π€")
                    println("Presiona enter para continuar")
                    var tec = readLine()
                }
                else {
                    println("Alcanzaste el nΓΊmero mΓ‘ximo de intentos, adiΓ³s.π€§")
                    seguir = false
                }
            }
        }
    }while (seguir)
}