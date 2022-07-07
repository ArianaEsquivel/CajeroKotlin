open class Cajero {
    var nombre : String = ""
    var listBVeinte = mutableListOf<Veinte>()
    var listBCincuenta = mutableListOf<Cincuenta>()
    var listBCien = mutableListOf<Cien>()
    var listBDoscientos = mutableListOf<Doscientos>()
    var listBQuinientos = mutableListOf<Quinientos>()
    var listCuentas = mutableListOf<Cuenta>()

    fun ingresarDinero() {
        println("⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛ ☸ ⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️")
        var seguir: Boolean = true
        do {
            print("🧑🏻‍🔧 Clave de administrador 👉🏼")
            var admin = readLine()
            if (admin == "SALIR"){
                println("Adiós🙋🏻")
                seguir = false
                continue
            }
            if (admin != "ADMIN" && admin != "SALIR"){
                println("La clave no es válida, para salir escriba ⇢SALIR⇠")
                seguir = true
                continue
            }
            seguir = false

            println("Ingresa la cantidad de billetes de cada una de las siguientes denominaciones💵")
            var dineroIngresado : Int = 0
            dineroIngresado += ingreso(Veinte())
            dineroIngresado += ingreso(Cincuenta())
            dineroIngresado += ingreso(Cien())
            dineroIngresado += ingreso(Doscientos())
            dineroIngresado += ingreso(Quinientos())
            println("Cantidad de dinero ingresada 👉🏼$$dineroIngresado💵👈🏼")

        } while (seguir)
        println("⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛ ☸ ⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️")
        readLine()
    }

    private fun ingreso(billete : Billete): Int {
        var dinero : Int
        print("${billete.valor} ⇢${billete.cantidad}⇠ 👉🏼 ")
        val cantidad = readLine()
        val cantidadI = if (cantidad.isNullOrBlank()) 0 else if (cantidad.filter { c -> c.isDigit() } .isNullOrBlank()) 0 else cantidad.toString().filter { c -> c.isDigit() }.toInt()
        when(billete){
            is Veinte -> repeat(cantidadI) { this.listBVeinte.add(Veinte()) }
            is Cincuenta -> repeat(cantidadI){ this.listBCincuenta.add(Cincuenta()) }
            is Cien -> repeat(cantidadI) { this.listBCien.add(Cien()) }
            is Doscientos -> repeat(cantidadI) { this.listBDoscientos.add(Doscientos()) }
            is Quinientos -> repeat(cantidadI) { this.listBQuinientos.add(Quinientos()) }
        }
        dinero = cantidadI * billete.valor
        val s : String = if (cantidadI == 1) "" else "s"
        println("$cantidadI billete${s} de $${billete.valor} fue${(if (cantidadI == 1) "" else "ron")} ingresado${s}")
        return dinero
    }

    fun dineroDisponible() {
        var seguir: Boolean = true
        do {
            print("🧑🏻‍🔧 Clave de administrador 👉🏼")
            var admin = readLine()
            if (admin == "SALIR"){
                println("Adiós🙋🏻")
                seguir = false
                continue
            }
            if (admin != "ADMIN" && admin != "SALIR"){
                println("La clave no es válida, para salir escriba ⇢SALIR⇠")
                seguir = true
                continue
            }
            seguir = false
            var total : Int = 0;
            total += listBVeinte.size * 20
            total += listBCincuenta.size * 50
            total += listBCien.size * 100
            total += listBDoscientos.size * 200
            total += listBQuinientos.size * 500

            println("⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛ ☸ ⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️")
            println("El cajero ${nombre}🤍 tiene 👉🏼 $${total}💵")
            println("Cuenta con la siguiente cantidad de billetes🤑")
            println("💵20 👉🏼 ${listBVeinte.size} billete${(if (listBVeinte.size == 1) "" else "s")}" )
            println("💵50 👉🏼 ${listBCincuenta.size} billete${(if (listBCincuenta.size == 1) "" else "s")}" )
            println("💵100 👉🏼 ${listBCien.size} billete${(if (listBCien.size == 1) "" else "s")}" )
            println("💵200 👉🏼 ${listBDoscientos.size} billete${(if (listBDoscientos.size == 1) "" else "s")}" )
            println("💵500 👉🏼 ${listBQuinientos.size} billete${(if (listBQuinientos.size == 1) "" else "s")}" )
            println("⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛ ☸ ⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️")
        } while (seguir)
    }
    private fun dineroCajero() : Int {
        var total : Int = 0;
        total += listBVeinte.size * 20
        total += listBCincuenta.size * 50
        total += listBCien.size * 100
        total += listBDoscientos.size * 200
        total += listBQuinientos.size * 500
        return total
    }

    fun crearCuenta() {
        println("⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛ ☸ ⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️")
        println("Gracias por elegirnos🌼")
        println("Por favor ingresa tus datos correctamente🤭")
        print("Nombre 👉🏼")
        var nombre = readLine()
        print("Apellido paterno 👉🏼")
        var apellidoP = readLine()
        print("Apellido materno 👉🏼")
        var apellidoM = readLine()
        var seguir : Boolean = true
        var pinI : Int
        var usuarioS : String
        do {
            seguir = false
            print("👤 Usuario 👉🏼")
            var usuario = readLine()
            usuarioS = usuario.toString()
            var existe = this.listCuentas.find { c -> c.usuario == usuario }
            if (existe != null) {
                println("Lo sentimos el nombre de usuario ⇢${existe.usuario}⇠ ya existe, intenta con otro usuario😪")
                seguir = true
            }
        } while( seguir)
        do {
            seguir = true
            print("🔒 PIN (4 dígitos) 👉🏼")
            var pin = readLine()
            var pinS = pin.toString().filter { c -> c.isDigit() }
            pinI = if (pinS.isBlank()) 0 else if (pinS.isBlank()) 0 else if (pinS.length >= 4) pinS.substring(0, 4).toInt() else 0
            if (pinI != 0) {
                println("Tu PIN será 👉🏼${pinI}👈🏼")
                print("Si quieres cambiar el PIN escribe 👉🏼CAMBIAR👈🏼, de lo contrario da enter 👉🏼")
                var cambiar = readLine()
                if (cambiar != "CAMBIAR") seguir = false
            }
            else {
                println("Lo siento, parece que tu PIN no tiene la estructura correcta, intenta de nuevo😋")
            }
        } while( seguir)
        val nuevaC : Cuenta = Cuenta()
        nuevaC.nombre = nombre.toString()
        nuevaC.apellidoP = apellidoP.toString()
        nuevaC.apellidoM = apellidoM.toString()
        nuevaC.usuario = usuarioS
        nuevaC.pin = pinI
        this.listCuentas.add(nuevaC)
        println("🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍")
        println("Bienvenide ${nuevaC.nombre}🤍")
        println("Guarda bien tus datos porque los necesitarás🥳")
        println("🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍 🤍")
        println("⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛ ☸ ⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️")
        readLine()
    }

    fun depositarDinero(){
        println("⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛ ☸ ⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️")
        println("Primero identifícate🥸")
        var intentos : Int = 0
        var seguir : Boolean = false
        lateinit var cUsuario : Cuenta
        var pinI : Int
        do {
            seguir = false
            print("👤 Usuario 👉🏼")
            var usuario = readLine()
            var existe = this.listCuentas.find { c -> c.usuario == usuario }
            if (existe == null) {
                intentos += 1
                println("Intento $intentos de 3")
                println("Lo sentimos la cuenta ⇢${usuario}⇠ no existe😪")
                seguir = true
            }
            else {
                cUsuario = existe
            }
            if (intentos == 3) {
                println("Lo siento, has ingresado los datos incorrectos demasiadas veces, por tu seguridad se cancelará la operación.")
                seguir = false
            }
            if (intentos == 3 || seguir == true) continue
            intentos = 0
            do {
                seguir = false
                print("🔒 PIN (4 dígitos) 👉🏼")
                var pin = readLine()
                var pinS = pin.toString().filter { c -> c.isDigit() }
                pinI = if (pinS.isBlank()) 0 else if (pinS.isBlank()) 0 else if (pinS.length >= 4) pinS.substring(0, 4).toInt() else 0
                if (pinI != 0) {
                    if (cUsuario.pin == pinI){
                        println("Ingresa la cantidad de billetes cada una de las siguientes denominaciones💵")
                        var dineroDepositado : Int = 0
                        dineroDepositado += ingreso(Veinte())
                        dineroDepositado += ingreso(Cincuenta())
                        dineroDepositado += ingreso(Cien())
                        dineroDepositado += ingreso(Doscientos())
                        dineroDepositado += ingreso(Quinientos())
                        cUsuario.saldo += dineroDepositado
                        println("Cantidad de dinero depositado 👉🏼$$dineroDepositado💵👈🏼")
                        println("Saldo disponible 👉🏼$${cUsuario.saldo}💵👈🏼")
                    }
                    else {
                        intentos += 1
                        println("Intento $intentos de 3")
                        println("Parece que tu PIN no coincide con tu cuenta🧐")
                        seguir = true
                    }
                }
                else {
                    println("Lo siento, parece que tu PIN no tiene la estructura correcta, intenta de nuevo😋")
                    seguir = true
                }
                if (intentos == 3) {
                    println("Lo siento, has ingresado los datos incorrectos demasiadas veces, por tu seguridad se cancelará la acción.")
                    seguir = false
                }
            } while( seguir)

        } while(seguir)

        println("⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛ ☸ ⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️")
    }

    fun estadoDeCuenta(){
        println("⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛ ☸ ⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️")
        println("Primero identifícate🥸")
        var intentos : Int = 0
        var seguir : Boolean = false
        lateinit var cUsuario : Cuenta
        var pinI : Int
        do {
            seguir = false
            print("👤 Usuario 👉🏼")
            var usuario = readLine()
            var existe = this.listCuentas.find { c -> c.usuario == usuario }
            if (existe == null) {
                intentos += 1
                println("Intento $intentos de 3")
                println("Lo sentimos la cuenta ⇢${usuario}⇠ no existe😪")
                seguir = true
            }
            else {
                cUsuario = existe
            }
            if (intentos == 3) {
                println("Lo siento, has ingresado los datos incorrectos demasiadas veces, por tu seguridad se cancelará la operación.")
                seguir = false
            }
            if (intentos == 3 || seguir == true) continue
            intentos = 0
            do {
                seguir = false
                print("🔒 PIN (4 dígitos) 👉🏼")
                var pin = readLine()
                var pinS = pin.toString().filter { c -> c.isDigit() }
                pinI = if (pinS.isBlank()) 0 else if (pinS.isBlank()) 0 else if (pinS.length >= 4) pinS.substring(0, 4).toInt() else 0
                if (pinI != 0) {
                    if (cUsuario.pin == pinI){
                        println("Bienvenide ${cUsuario.nombre}🤍")
                        println("Tu saldo actual es de 👉🏼$${cUsuario.saldo}💵👈🏼")
                    }
                    else {
                        intentos += 1
                        println("Intento $intentos de 3")
                        println("Parece que tu PIN no coincide con tu cuenta🧐")
                        seguir = true
                    }
                }
                else {
                    println("Lo siento, parece que tu PIN no tiene la estructura correcta, intenta de nuevo😋")
                    seguir = true
                }
                if (intentos == 3) {
                    println("Lo siento, has ingresado los datos incorrectos demasiadas veces, por tu seguridad se cancelará la acción.")
                    seguir = false
                }
            } while( seguir)

        } while(seguir)
    }

    fun retirarDinero(){
        println("⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛ ☸ ⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️")
        println("Primero identifícate🥸")
        var intentos : Int = 0
        var seguir : Boolean = false
        lateinit var cUsuario : Cuenta
        var pinI : Int
        do {
            seguir = false
            print("👤 Usuario 👉🏼")
            var usuario = readLine()
            var existe = this.listCuentas.find { c -> c.usuario == usuario }
            if (existe == null) {
                intentos += 1
                println("Intento $intentos de 3")
                println("Lo sentimos la cuenta ⇢${usuario}⇠ no existe😪")
                seguir = true
            }
            else {
                cUsuario = existe
            }
            if (intentos == 3) {
                println("Lo siento, has ingresado los datos incorrectos demasiadas veces, por tu seguridad se cancelará la operación.")
                seguir = false
            }
            if (intentos == 3 || seguir == true) continue
            intentos = 0
            do {
                seguir = false
                print("🔒 PIN (4 dígitos) 👉🏼")
                var pin = readLine()
                var pinS = pin.toString().filter { c -> c.isDigit() }
                pinI = if (pinS.isBlank()) 0 else if (pinS.isBlank()) 0 else if (pinS.length >= 4) pinS.substring(0, 4).toInt() else 0
                if (pinI != 0) {
                    if (cUsuario.pin == pinI){
                        obtenerCantidad(cUsuario)
                    }
                    else {
                        intentos += 1
                        println("Intento $intentos de 3")
                        println("Parece que tu PIN no coincide con tu cuenta🧐")
                        seguir = true
                    }
                }
                else {
                    println("Lo siento, parece que tu PIN no tiene la estructura correcta, intenta de nuevo😋")
                    seguir = true
                }
                if (intentos == 3) {
                    println("Lo siento, has ingresado los datos incorrectos demasiadas veces, por tu seguridad se cancelará la acción.")
                    seguir = false
                }
            } while( seguir)

        } while(seguir)
        println("⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛ ☸ ⏳ ☸ ︎⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️ ☸ ⏳ ☸ ⌛️")
    }

//    private fun retirar(cuenta: Cuenta){
//        var seguir: Boolean = true
//        do {
//            println("Ingresa la cantidad a retirar 👉🏼 $")
//            var cantidad = readLine()
//            var cantidadS = cantidad.toString().filter { c -> c.isDigit() }
//            var cantidadI = if (cantidadS.isBlank()) 0 else cantidadS.toInt()
//            if (cantidadI != 0) {
//                if (cuenta.saldo >= cantidadI){
//
//                }
//                else {
//                    println("No cuentas con suficiente")
//                }
//            }
//
//            if (admin != "ADMIN" && admin != "SALIR"){
//                println("La clave no es válida, para salir escriba ⇢SALIR⇠")
//                seguir = true
//                continue
//            }
//
////            seguir = false
//
//        } while (seguir)
//    }

    private fun obtenerCantidad(cuenta: Cuenta){
        var seguir: Boolean = true
        do {
            if (cuenta.saldo == 0.0f){
                println("Uy ${cuenta.nombre}😲 parece que cuentas con $${cuenta.saldo}💸")
                seguir = false
                continue
            }
            println("Saldo actual 👉🏼$${cuenta.saldo}💵👈🏼")
            println("Si deseas salir escribe 👉🏼SALIR👈🏼")
            print("Ingresa la cantidad a retirar 👉🏼 $")
            var cantidad = readLine()
            if (cantidad == "SALIR"){
                println("La clave no es válida, para salir escriba ⇢SALIR⇠")
                seguir = false
                continue
            }
            var cantidadS = cantidad.toString().filter { c -> c.isDigit() }
            if (cantidadS.length >= 10){
                println("No mames wey ni Obama tiene esa cantidad")
                continue
            }
            var cantidadI = if (cantidadS.isBlank()) 0 else cantidadS.toInt()
            if (cantidadI != 0) {
                if (cuenta.saldo >= cantidadI){
                    if (dineroCajero() >= cantidadI){
                        seguir = !retiro(cantidadI)
                        if (!seguir) cuenta.saldo -= cantidadI.toFloat()
                    }
                    else {
                        println("Lo sentimos, ${this.nombre} no cuenta con el dinero suficiente para retirar esa cantidad😓")
                    }
                }
                else {
                    println("No cuentas con suficiente dinero para retirar esa cantidad☹️")
                }
            }

        } while (seguir)
    }


    fun retiroo(cantidad: Int) : Boolean {
        var ctd = cantidad
        var listV = listBVeinte.size
        var listCt = listBCincuenta.size
        var listCn = listBCien.size
        var listD = listBDoscientos.size
        var listQ = listBQuinientos.size
        var seguir : Boolean = false
        var valido : Boolean = true
        var cant: Int
//        ctd.mod(20) == 0  || ctd.mod(50) == 0  || ctd.mod(50).mod(20)  == 0
        if (ctd.mod(10) == 0  && ctd != 10 &&  ctd != 30 ){
            println("500 if 1")
            if (ctd.div(500) > 0 && listQ > 0 ){
                println("500 if 2")
//                listQ >= ctd.div(500) && (ctd.mod(500).mod(20) == 0 || ctd.mod(500).mod(50) == 0)
                if (listQ >= ctd.div(500) && (ctd.mod(500).mod(20) == 0 || ctd.mod(500).mod(50) == 0)){
                    println("500 if 3")
                    listQ = ctd.div(500)
                    ctd -= ctd.div(500) * 500
                }
                else if (listQ < ctd.div(500) || (ctd.mod(500).mod(20) == 0 || ctd.mod(500).mod(50) == 0)){
                    println("500 else if 4")
                    cant = ctd
                    do {
                        println("500 do")
                        seguir = false
                        if ((cant - (listQ * 500)).mod(50) != 0 && (cant - (listQ * 500)).mod(20) != 0 || (cant - (listQ * 500) < 0 )){
                            listQ -= 1
                            seguir = true
                            continue
                        }
                        ctd -= listQ * 500
                        cant -= listQ * 500
                        println("cant lQ $cant")
                    }while (seguir)
                }
                println("ctd 500 $ctd")
            }
            else listQ = 0
            if (ctd == 0 ){
                listD = 0
                listCn = 0
                listCt = 0
                listV = 0
            }
            //200
            if (ctd.div(200) > 0 && listD > 0){
                println("200 if 1")
//                listD >= ctd.div(200) && (ctd.mod(200).mod(20) == 0 || ctd.mod(200).mod(50) == 0)
                if (listD >= ctd.div(200) && (ctd.mod(200).mod(20) == 0 || ctd.mod(200).mod(50) == 0)){
                    println("200 if 2")
                    listD = ctd.div(200)
                    ctd -= ctd.div(200) * 200
                }
                else if (listD < ctd.div(200) || (ctd.mod(200).mod(20) == 0 || ctd.mod(200).mod(50) == 0)) {
                    println("200 else if 3")
                    cant = ctd
                    do {
                        println("200 do")
                        seguir = false
//                        println((cant - (listD * 200)).mod(50))
//                        println((cant - (listD * 200)).mod(20))
                        if ((cant - (listD * 200)).mod(50) != 0 && (cant - (listD * 200)).mod(20) != 0 || (cant - (listD * 200) < 0 )) {
                            listD -= 1
                            seguir = true
                            continue
                        }
                        ctd -= listD * 200
                        cant -= listD * 200
                        println("cant lD $cant")
                    } while (seguir)
                }
                println("ctd 200 $ctd")
            }
            else listD = 0
            if (ctd == 0){
                listCn = 0
                listCt = 0
                listV = 0
            }
            //100
            if (ctd.div(100) > 0 && listCn > 0) {
                println("100 if 1")
//                listCn >= ctd.div(100) && (ctd.mod(100).mod(20) == 0 || ctd.mod(100).mod(50) == 0)
                println(ctd.div(100))
//                listCn >= ctd.div(100) && (ctd.mod(100).mod(20) == 0 || ctd.mod(100).mod(50) == 0)
                if (listCn >= ctd.div(100) && (ctd.mod(100).mod(20) == 0 || ctd.mod(100).mod(50) == 0)) {
                    println("100 if 2")
                    listCn = ctd.div(100)
                    ctd -= ctd.div(100) * 100
                }
                else if (listCn < ctd.div(100) || (ctd.mod(100).mod(20) == 0 || ctd.mod(100).mod(50) == 0)) {
                    println("100 else if 3")
                    cant = ctd
                    do {
                        println("100 do")
                        seguir = false
                        println((cant - (listCn * 100)).mod(50))
                        println((cant - (listCn * 100)).mod(20))
                        if ((cant - (listCn * 100)).mod(50) != 0 && (cant - (listCn * 100)).mod(20) != 0 || (cant - (listCn * 100) < 0 )) {
                            listCn -= 1
                            seguir = true
                            continue
                        }
                        ctd -= listCn * 100
                        cant -= listCn * 100
                        println("cant lCn $cant")
                    } while (seguir)
                }
                else listCn = 0
//                println("ctd 100 $ctd")
            }
            else listCn = 0
            if (ctd == 0){
                listCt = 0
                listV = 0
            }
            //50
            println("50 jeje")
            println(ctd)
            if (ctd.div(50) > 0 && listCt > 0) {
                println("50 if 1")
                if (listCt >= ctd.div(50) && (ctd.mod(50) == 0 || ctd.mod(50).mod(20) == 0)) {
                    println("50 if 2")
                    listCt = ctd.div(50)
                    ctd -= ctd.div(50) * 50
                }
//                listCt < ctd.div(50)
                else if (listCt < ctd.div(50) || (ctd.mod(50) != 0 || ctd.mod(50).mod(20) != 0)) {
                    println("50 else if 3")
                    cant = ctd
                    do {
                        println("50 do")
                        seguir = false
                        println((cant - (listCt * 50)).mod(20))
                        println((cant - (listCt * 50)))
                        println((cant - (listCt * 50)).mod(50))
                        println((cant - (listCt * 50)).mod(40))
                        println("listCt $listCt")
                        (cant - (listCt * 50)).mod(20) != 0
                        if ( ((cant - (listCt * 50)).mod(20) != 0) || (cant - (listCt * 50) < 0 ) ) {
                            listCt -= 1
                            seguir = true
                            continue
                        }
                        ctd -= listCt * 50
                        cant -= listCt * 50
                        println("cant lCt $cant")
                    } while (seguir)
                }
                println("ctd 50 $ctd")
            }
            else listCt = 0
            if (ctd == 0){
                listV = 0
            }
            //20
            println("20 jeje")
            println(ctd)
            if (ctd.div(20) > 0 && listV > 0) {
                println("20 if 1")
                println("ctd $ctd")

                if (listV >= ctd.div(20) && ctd.mod(20) == 0) {
                    println("20 else if 2")
                    println("ctd ${ctd.div(20)}")
                    listV = ctd.div(20)
                    ctd -= ctd.div(20) * 20
                }  else if (listV < ctd.div(20)) {
                    println("20 else if 3")
                    cant = ctd
                    do {
                        println("20 do")
                        seguir = false
                        println((cant - (listV * 20)))
                        println((listV * 20))
                        println((listV * 20).mod(20))
                        println((listV * 20).mod(50))
                        if ((cant - (listV * 20)).mod(50) != 0 ) {
                            listV -= 1
                            seguir = true
                            continue
                        }
                        ctd -= listV * 20
                        cant -= listV * 20
                        println("cant lV $cant")
                    } while (seguir)
                    ctd = if ((((listBVeinte.size - listV ) * 20) - cant + 30) < 0) (((listBVeinte.size - listV ) * 20) - cant + 50) else (((listBVeinte.size - listV ) * 20) - cant + 30)
                }
//                println("ctd 20 $ctd")
            }
            else listV  = 0
        }
        else {
            valido = false
            println("Por favor ingresa un monto válido🙁")
            println("${this.nombre} cuenta con billetes de:${if (listQ > 0) " $500" else ""}${if (listD > 0) " $200" else ""}${if (listCn > 0) " $100" else ""}${if (listCt > 0) " $50" else ""}${if (listV > 0) " $20" else ""} ")
        }

        if (ctd == 0){
//            println("Llegó al ctd == 0")
//            println(listV)
//            println(listCt)
//            println(listCn)
//            println(listD)
//            println(listQ)
            println("Recibes $$cantidad💵")
            quitarCajero(listV, 20)
            quitarCajero(listCt, 50)
            quitarCajero(listCn, 100)
            quitarCajero(listD, 200)
            quitarCajero(listQ, 500)
            return true
        }
        else {
            if ((cantidad - ctd) != 0) {
                println("Lo sentimos, no podemos darte esa cantidad, intenta con $${cantidad - ctd}🤓")
                println("${this.nombre} cuenta con billetes de:${if (listBQuinientos.size > 0) " $500" else ""}${if (listBDoscientos.size > 0) " $200" else ""}${if (listBCien.size > 0) " $100" else ""}${if (listBCincuenta.size > 0) " $50" else ""}${if (listBVeinte.size > 0) " $20" else ""} ")
            }
            else {
                if (valido){
                    println("Lo sentimos, no podemos darte esa cantidad 😕")
                    println("${this.nombre} cuenta con billetes de:${if (listBQuinientos.size > 0) " $500" else ""}${if (listBDoscientos.size > 0) " $200" else ""}${if (listBCien.size > 0) " $100" else ""}${if (listBCincuenta.size > 0) " $50" else ""}${if (listBVeinte.size > 0) " $20" else ""} ")
                }
            }

            return false
        }
    }

    fun quitarCajero(cantidad: Int, billete : Int){
        if (cantidad > 0){
            println("$cantidad billete${if (cantidad == 1) "" else "s"} de $$billete💵")
        }
        when(billete){
            20 -> repeat(cantidad) { this.listBVeinte.removeFirst()}
            50 -> repeat(cantidad){ this.listBCincuenta.removeFirst() }
            100 -> repeat(cantidad) { this.listBCien.removeFirst() }
            200 -> repeat(cantidad) { this.listBDoscientos.removeFirst() }
            500 -> repeat(cantidad) { this.listBQuinientos.removeFirst() }
        }
    }

    fun retiro(cantidad: Int) : Boolean {
    var ctd = cantidad
    var listV = listBVeinte.size
    var listCt = listBCincuenta.size
    var listCn = listBCien.size
    var listD = listBDoscientos.size
    var listQ = listBQuinientos.size
    var seguir : Boolean = false
    var valido : Boolean = true
    var cant: Int
//        ctd.mod(20) == 0  || ctd.mod(50) == 0  || ctd.mod(50).mod(20)  == 0
    if (ctd.mod(10) == 0  && ctd != 10 &&  ctd != 30 ){
        println("500 if 1")
        if (ctd.div(500) > 0 && listQ > 0 ){
            println("500 if 2")
//                listQ >= ctd.div(500) && (ctd.mod(500).mod(20) == 0 || ctd.mod(500).mod(50) == 0)
            if (listQ >= ctd.div(500)){
                println("500 if 3")
                listQ = ctd.div(500)
                ctd -= ctd.div(500) * 500
            }
            else if (listQ < ctd.div(500)){
                println("500 else if 4")
                cant = ctd
                do {
                    println("500 do")
                    seguir = false
//                        if ((cant - (listQ * 500)).mod(50) != 0 && (cant - (listQ * 500)).mod(20) != 0){
//                            listQ -= 1
//                            seguir = true
//                            continue
//                        }
                    ctd -= listQ * 500
                    cant -= listQ * 500
                    println("cant lQ $cant")
                }while (seguir)
            }
            println("ctd 500 $ctd")
        }
        else listQ = 0
        if (ctd == 0 ){
            listD = 0
            listCn = 0
            listCt = 0
            listV = 0
        }
        //200
        if (ctd.div(200) > 0 && listD > 0){
            println("200 if 1")
//                listD >= ctd.div(200) && (ctd.mod(200).mod(20) == 0 || ctd.mod(200).mod(50) == 0)
            if (listD >= ctd.div(200)){
                println("200 if 2")
                listD = ctd.div(200)
                ctd -= ctd.div(200) * 200
            }
            else if (listD < ctd.div(200)) {
                println("200 else if 3")
                cant = ctd
                do {
                    println("200 do")
                    seguir = false
//                        println((cant - (listD * 200)).mod(50))
//                        println((cant - (listD * 200)).mod(20))
//                        if ((cant - (listD * 200)).mod(50) != 0 && (cant - (listD * 200)).mod(20) != 0) {
//                            listD -= 1
//                            seguir = true
//                            continue
//                        }
                    ctd -= listD * 200
                    cant -= listD * 200
                    println("cant lD $cant")
                } while (seguir)
            }
            println("ctd 200 $ctd")
        }
        else listD = 0
        if (ctd == 0){
            listCn = 0
            listCt = 0
            listV = 0
        }
        //100
        if (ctd.div(100) > 0 && listCn > 0) {
            println("100 if 1")
//                listCn >= ctd.div(100) && (ctd.mod(100).mod(20) == 0 || ctd.mod(100).mod(50) == 0)
            if (listCn >= ctd.div(100) && (ctd.mod(100).mod(20) == 0 || ctd.mod(100).mod(50) == 0)) {
                println("100 if 2")
                listCn = ctd.div(100)
                ctd -= ctd.div(100) * 100
            }
            else if (listCn < ctd.div(100)) {
                println("100 else if 3")
                cant = ctd
                do {
                    println("100 do")
                    seguir = false
                    println((cant - (listCn * 100)).mod(50))
                    println((cant - (listCn * 100)).mod(20))
//                        if ((cant - (listCn * 100)).mod(50) != 0 && (cant - (listCn * 100)).mod(20) != 0) {
//                            listCn -= 1
//                            seguir = true
//                            continue
//                        }
                    ctd -= listCn * 100
                    cant -= listCn * 100
                    println("cant lCn $cant")
                } while (seguir)
            }
            else listCn = 0
//                println("ctd 100 $ctd")
        }
        else listCn = 0
        if (ctd == 0){
            listCt = 0
            listV = 0
        }
        //50
        if (ctd.div(50) > 0 && listCt > 0) {
            println("50 if 1")
            if (listCt >= ctd.div(50) && (ctd.mod(50) == 0 || ctd.mod(50).mod(20) == 0)) {
                println("50 if 2")
                listCt = ctd.div(50)
                ctd -= ctd.div(50) * 50
            }
//                listCt < ctd.div(50)
            else if (listCt < ctd.div(50) || (ctd.mod(50) != 0 || ctd.mod(50).mod(20) != 0)) {
                println("50 else if 3")
                cant = ctd
                do {
                    println("50 do")
                    seguir = false
                    println((cant - (listCt * 50)).mod(20))
                    println((cant - (listCt * 50)))
                    println((cant - (listCt * 50)).mod(50))
                    println((cant - (listCt * 50)).mod(40))
                    println("listCt $listCt")
                    (cant - (listCt * 50)).mod(20) != 0
                    if ( ((cant - (listCt * 50)).mod(20) != 0) || (cant - (listCt * 50) < 0 ) ) {
                        listCt -= 1
                        seguir = true
                        continue
                    }
                    ctd -= listCt * 50
                    cant -= listCt * 50
                    println("cant lCt $cant")
                } while (seguir)
            }
            println("ctd 50 $ctd")
        }
        else listCt = 0
        if (ctd == 0){
            listV = 0
        }
        //20
        if (ctd.div(20) > 0 && listV > 0) {
            println("20 if 1")
            println("ctd $ctd")

            if (listV >= ctd.div(20) && ctd.mod(20) == 0) {
                println("20 else if 2")
                println("ctd ${ctd.div(20)}")
                listV = ctd.div(20)
                ctd -= ctd.div(20) * 20
            }  else if (listV < ctd.div(20)) {
                println("20 else if 3")
                cant = ctd
                do {
                    println("20 do")
                    seguir = false
                    println((cant - (listV * 20)))
                    println((listV * 20))
                    println((listV * 20).mod(20))
                    println((listV * 20).mod(50))
                    if ((cant - (listV * 20)).mod(50) != 0 ) {
                        listV -= 1
                        seguir = true
                        continue
                    }
                    ctd -= listV * 20
                    cant -= listV * 20
                    println("cant lV $cant")
                } while (seguir)
                ctd = if ((((listBVeinte.size - listV ) * 20) - cant + 30) < 0) (((listBVeinte.size - listV ) * 20) - cant + 50) else (((listBVeinte.size - listV ) * 20) - cant + 30)
            }
//                println("ctd 20 $ctd")
        }
        else listV  = 0
    }
    else {
        valido = false
        println("Por favor ingresa un monto válido🙁")
        println("${this.nombre} cuenta con billetes de:${if (listQ > 0) " $500" else ""}${if (listD > 0) " $200" else ""}${if (listCn > 0) " $100" else ""}${if (listCt > 0) " $50" else ""}${if (listV > 0) " $20" else ""} ")
    }

    if (ctd == 0){
//            println("Llegó al ctd == 0")
//            println(listV)
//            println(listCt)
//            println(listCn)
//            println(listD)
//            println(listQ)
        println("Recibes $$cantidad💵")
        quitarCajero(listV, 20)
        quitarCajero(listCt, 50)
        quitarCajero(listCn, 100)
        quitarCajero(listD, 200)
        quitarCajero(listQ, 500)
        return true
    }
    else {
        if ((cantidad - ctd) != 0) {
            println("Lo sentimos, no podemos darte esa cantidad, intenta con $${cantidad - ctd}🤓")
            println("${this.nombre} cuenta con billetes de:${if (listBQuinientos.size > 0) " $500" else ""}${if (listBDoscientos.size > 0) " $200" else ""}${if (listBCien.size > 0) " $100" else ""}${if (listBCincuenta.size > 0) " $50" else ""}${if (listBVeinte.size > 0) " $20" else ""} ")
        }
        else {
            if (valido){
                println("Lo sentimos, no podemos darte esa cantidad 😕")
                println("${this.nombre} cuenta con billetes de:${if (listBQuinientos.size > 0) " $500" else ""}${if (listBDoscientos.size > 0) " $200" else ""}${if (listBCien.size > 0) " $100" else ""}${if (listBCincuenta.size > 0) " $50" else ""}${if (listBVeinte.size > 0) " $20" else ""} ")
            }
        }

        return false
    }
}

}