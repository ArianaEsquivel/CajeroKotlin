class Cuenta {
    var nombre : String = ""
    var apellidoP : String = ""
    var apellidoM : String = ""
    var usuario : String = ""
    var pin : Int = 1234
    var saldo : Float = 0f

    constructor()
    constructor(nombre: String?, apP: String?, apM: String?, usuario: String?, pin: Int?, saldo: Float? ){
        this.nombre = nombre!!
        this.apellidoP = apP!!
        this.apellidoM = apM!!
        this.usuario = usuario!!
        this.pin = pin!!
        this.saldo = saldo!!
    }


//    fun ingresarDinero(billete : Billete, cantidad: Int){
////        print("${billete.valor} ⇢${billete.cantidad}⇠ 👉🏼 ")
////        val cantidad = readLine()
////        val cantidadI = if (cantidad.isNullOrBlank()) 0 else if (cantidad.filter { c -> c.isDigit() } .isNullOrBlank()) 0 else cantidad.toString().filter { c -> c.isDigit() }.toInt()
//        when(billete){
//            is Veinte -> repeat(cantidad) { this.listBVeinte.add(Veinte()) }
//            is Cincuenta -> repeat(cantidad){ this.listBCincuenta.add(Cincuenta()) }
//            is Cien -> repeat(cantidad) { this.listBCien.add(Cien()) }
//            is Doscientos -> repeat(cantidad) { this.listBDoscientos.add(Doscientos()) }
//            is Quinientos -> repeat(cantidad) { this.listBQuinientos.add(Quinientos()) }
//        }
//        val s : String = if (cantidad == 1) "" else "s"
//        println("$cantidad billete${s} de $${billete.valor} fue${(if (cantidad == 1) "" else "ron")} ingresado${s}")
//    }

//    fun estadoDeCuenta() {
//        var total : Int = 0;
//        total += listBVeinte.size * 20
//        total += listBCincuenta.size * 50
//        total += listBCien.size * 100
//        total += listBDoscientos.size * 200
//        total += listBQuinientos.size * 500
//
//        println("⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛ ☸ ⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️")
//        println("Hola ${nombre}🤍 tienes disponibles 👉🏼 $${total}💵")
//        println("Cuentas con la siguiente cantidad de billetes🤑")
//        println("💵20 👉🏼 ${listBVeinte.size} billete${(if (listBVeinte.size == 1) "" else "s")}" )
//        println("💵50 👉🏼 ${listBCincuenta.size} billete${(if (listBCincuenta.size == 1) "" else "s")}" )
//        println("💵100 👉🏼 ${listBCien.size} billete${(if (listBCien.size == 1) "" else "s")}" )
//        println("💵200 👉🏼 ${listBDoscientos.size} billete${(if (listBDoscientos.size == 1) "" else "s")}" )
//        println("💵500 👉🏼 ${listBQuinientos.size} billete${(if (listBQuinientos.size == 1) "" else "s")}" )
//        println("⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛ ☸ ⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️")
//        readLine()
//    }
}