//fun retiro(cantidad: Int){
//    var cjr = dineroCajero()
//    var ctd = cantidad
//    if ( cjr >= ctd){
//        if (ctd.mod(20) == 0 || ctd.mod(50) == 0 ){
//            var listQ = listBQuinientos.size
//            println("ctd.div(500) ${ctd.div(500)}")
//            if (ctd.div(500) > 0 && listQ > 0 ){
//                if (listQ >= ctd.div(500) && ctd.mod(500) == 0){
//                    ctd -= ctd.div(500) * 500
//                    cjr -= ctd.div(500) * 500
//                    println("Primer if")
//                }
//                else if (listQ >= ctd.div(500) && (ctd.mod(500).mod(20) == 0 || ctd.mod(500).mod(50) == 0)){
//                    ctd -= ctd.div(500) * 500
//                    cjr -= ctd.div(500) * 500
//                    println("Segundo if")
//                }
//                else if (listQ < ctd.div(500)){
//                    var seguir: Boolean = true
//                    var cantBll: Int = listQ
//                    var cant: Int = ctd
//                    println("Tercer else If")
//                    do {
//                        seguir = false
//                        println((cant - (cantBll * 500)).mod(50))
//                        println((cant - (cantBll * 500)).mod(20))
//                        if ((cant - (cantBll * 500)).mod(50) != 0 && (cant - (cantBll * 500)).mod(20) != 0){
//                            cantBll -= 1
//                            seguir = true
//                            continue
//                        }
//                        ctd -= cantBll * 500
//                        cant -= cantBll * 500
//                        cjr -= cantBll * 500
//                        println("cant lQ $cant")
//                    }while (seguir)
//                }
//                println("ctd 500 $ctd")
//            }
//            //SOBRANTE
//            var listD = listBDoscientos.size
//            if (ctd.div(200) > 0 && listD > 0){
//                if (listD >= ctd.div(200) && ctd.mod(200) == 0){
//                    ctd -= ctd.div(200) * 200
//                    cjr -= ctd.div(200) * 200
//                    println("Primer if")
//                }
//                else if (listD >= ctd.div(200) && (ctd.mod(200).mod(20) == 0 || ctd.mod(200).mod(50) == 0)){
//                    ctd -= ctd.div(200) * 200
//                    cjr -= ctd.div(200) * 200
//                    println("Segundo if")
//                    println("ctd D $ctd")
//                }
//                else if (listD < ctd.div(200)) {
//                    var cantBll = listD
//                    var seguir : Boolean = false
//                    var cant = ctd
//                    println("Tercer else If")
//                    do {
//                        seguir = false
//                        println((cant - (cantBll * 200)).mod(50))
//                        println((cant - (cantBll * 200)).mod(20))
//                        if ((cant - (cantBll * 200)).mod(50) != 0 && (cant - (cantBll * 200)).mod(20) != 0) {
//                            cantBll -= 1
//                            seguir = true
//                            continue
//                        }
//                        ctd -= cantBll * 200
//                        cant -= cantBll * 200
//                        cjr -= cantBll * 200
//                        println("cant $cant")
//                    } while (seguir)
//                }
//                println("ctd 200 $ctd")
//            }
//
//            var listCn = listBCien.size
//            if (ctd.div(100) > 0 && listCn > 0) {
//                if (listCn >= ctd.div(100) && ctd.mod(100) == 0) {
//                    ctd -= ctd.div(100) * 100
//                    cjr -= ctd.div(100) * 100
//                    println("Primer if")
//                } else if (listCn >= ctd.div(100) && (ctd.mod(100).mod(20) == 0 || ctd.mod(100).mod(50) == 0)
//                ) {
//                    ctd -= ctd.div(100) * 100
//                    cjr -= ctd.div(100) * 100
//                    println("Segundo if")
//                } else if (listCn < ctd.div(100)) {
//                    var cantBll = listCn
//                    var seguir : Boolean = false
//                    var cant = ctd
//                    println("Tercer else If")
//                    do {
//                        seguir = false
//                        println((cant - (cantBll * 100)).mod(50))
//                        println((cant - (cantBll * 100)).mod(20))
//                        if ((cant - (cantBll * 100)).mod(50) != 0 && (cant - (cantBll * 100)).mod(20) != 0) {
//                            cantBll -= 1
//                            seguir = true
//                            continue
//                        }
//                        ctd -= cantBll * 100
//                        cant -= cantBll * 100
//                        cjr -= cantBll * 100
//                        println("cant $cant")
//                    } while (seguir)
//                }
//                println("ctd 100 $ctd")
//            }
//
//            var listCt = listBCincuenta.size
//            if (ctd.div(50) > 0 && listCt > 0) {
//                if (listCt >= ctd.div(50) && ctd.mod(50) == 0) {
//                    ctd -= ctd.div(50) * 50
//                    cjr -= ctd.div(50) * 50
//                    println("Primer if")
//                } else if (listCt >= ctd.div(50) && (ctd.mod(50).mod(20) == 0)
//                ) {
//                    ctd -= ctd.div(50) * 50
//                    cjr -= ctd.div(50) * 50
//                    println("Segundo if")
//                } else if (listCt < ctd.div(50)) {
//                    var cantBll = listCt
//                    var seguir : Boolean = false
//                    var cant = ctd
//                    println("Tercer else If")
//                    do {
//                        seguir = false
//                        println((cant - (cantBll * 50)).mod(20))
//                        if ((cant - (cantBll * 50)).mod(20) != 0) {
//                            cantBll -= 1
//                            seguir = true
//                            continue
//                        }
//                        ctd -= cantBll * 50
//                        cant -= cantBll * 50
//                        cjr -= cantBll * 50
//                        println("cant $cant")
//                    } while (seguir)
//                }
//                println("ctd 50 $ctd")
//            }
//
//            var listV = listBVeinte.size
//            if (ctd.div(20) > 0 && listV > 0) {
//                if (listV >= ctd.div(20) && ctd.mod(20) == 0) {
//                    ctd -= ctd.div(20) * 20
//                    cjr -= ctd.div(20) * 20
//                    println("Primer if")
//                }  else if (listV < ctd.div(20)) {
//                    var cantBll = listV
//                    var seguir : Boolean = false
//                    var cant = ctd
//                    println("Segundo else If")
//                    do {
//                        seguir = false
//                        println((cant - (cantBll * 20)).mod(20))
//                        if ((cant - (cantBll * 20)).mod(20) != 0) {
//                            cantBll -= 1
//                            seguir = true
//                            continue
//                        }
//                        ctd -= cantBll * 50
//                        cant -= cantBll * 20
//                        cjr -= cantBll * 20
//                        println("cant $cant")
//                    } while (seguir)
//                }
//                println("ctd 20 $ctd")
//            }
//        }
//        else {
//            println("Por favor ingresa un monto múltiplo de 20 o 50🙁")
//        }
//    }
//}




//fun retiro(cantidad: Int){
//    var cjr = dineroCajero()
//    var ctd = cantidad
//    var listV = listBVeinte.size
//    var listCt = listBCincuenta.size
//    var listCn = listBCien.size
//    var listD = listBDoscientos.size
//    var listQ = listBQuinientos.size
//
//    if ( cjr >= ctd){
//        if (ctd.mod(20) == 0  || ctd.mod(50) == 0  || ctd.mod(50).mod(20)  == 0){
//            println("500 if 1")
////                var listQ = listBQuinientos.size
//            println("ctd.div(500) ${ctd.div(500)}")
//            if (ctd.div(500) > 0 && listQ > 0 ){
//                println("500 if 2")
//                if (listQ >= ctd.div(500) && ctd.mod(500) == 0){
//                    println("500 if 3")
//                    ctd -= ctd.div(500) * 500
//                    cjr -= ctd.div(500) * 500
//                }
//                else if (listQ >= ctd.div(500) && (ctd.mod(500).mod(20) == 0 || ctd.mod(500).mod(50) == 0)){
//                    println("500 else if 4")
//                    ctd -= ctd.div(500) * 500
//                    cjr -= ctd.div(500) * 500
//                }
//                else if (listQ < ctd.div(500)){
//                    println("500 else if 5")
//                    var seguir: Boolean = true
//                    var cantBll: Int = listQ
//                    var cant: Int = ctd
//                    do {
//                        println("500 do")
//                        seguir = false
//                        println((cant - (cantBll * 500)).mod(50))
//                        println((cant - (cantBll * 500)).mod(20))
//                        if ((cant - (cantBll * 500)).mod(50) != 0 && (cant - (cantBll * 500)).mod(20) != 0){
//                            cantBll -= 1
//                            seguir = true
//                            continue
//                        }
//                        ctd -= cantBll * 500
//                        cant -= cantBll * 500
//                        cjr -= cantBll * 500
//                        println("cant lQ $cant")
//                    }while (seguir)
//                }
//                println("ctd 500 $ctd")
//            }
//            //SOBRANTE
//            var listD = listBDoscientos.size
//            if (ctd.div(200) > 0 && listD > 0){
//                println("200 if 1")
//                if (listD >= ctd.div(200) && ctd.mod(200) == 0){
//                    println("200 if 2")
//                    ctd -= ctd.div(200) * 200
//                    cjr -= ctd.div(200) * 200
//                }
//                else if (listD >= ctd.div(200) && (ctd.mod(200).mod(20) == 0 || ctd.mod(200).mod(50) == 0)){
//                    println("200 else if 3")
//                    ctd -= ctd.div(200) * 200
//                    cjr -= ctd.div(200) * 200
//                    println("ctd D $ctd")
//                }
//                else if (listD < ctd.div(200)) {
//                    println("200 else if 4")
//                    var cantBll = listD
//                    var seguir : Boolean = false
//                    var cant = ctd
//                    do {
//                        println("200 do")
//                        seguir = false
//                        println((cant - (cantBll * 200)).mod(50))
//                        println((cant - (cantBll * 200)).mod(20))
//                        if ((cant - (cantBll * 200)).mod(50) != 0 && (cant - (cantBll * 200)).mod(20) != 0) {
//                            cantBll -= 1
//                            seguir = true
//                            continue
//                        }
//                        ctd -= cantBll * 200
//                        cant -= cantBll * 200
//                        cjr -= cantBll * 200
//                        println("cant $cant")
//                    } while (seguir)
//                }
//                println("ctd 200 $ctd")
//            }
//
//            var listCn = listBCien.size
//            if (ctd.div(100) > 0 && listCn > 0) {
//                println("100 if 1")
//                if (listCn >= ctd.div(100) && ctd.mod(100) == 0) {
//                    println("100 if 2")
//                    ctd -= ctd.div(100) * 100
//                    cjr -= ctd.div(100) * 100
//                } else if (listCn >= ctd.div(100) && (ctd.mod(100).mod(20) == 0 || ctd.mod(100).mod(50) == 0)
//                ) {
//                    println("100 else if 3")
//                    ctd -= ctd.div(100) * 100
//                    cjr -= ctd.div(100) * 100
//                    println("Segundo if")
//                } else if (listCn < ctd.div(100)) {
//                    println("100 else if 4")
//                    var cantBll = listCn
//                    var seguir : Boolean = false
//                    var cant = ctd
//                    do {
//                        println("100 do")
//                        seguir = false
//                        println((cant - (cantBll * 100)).mod(50))
//                        println((cant - (cantBll * 100)).mod(20))
//                        if ((cant - (cantBll * 100)).mod(50) != 0 && (cant - (cantBll * 100)).mod(20) != 0) {
//                            cantBll -= 1
//                            seguir = true
//                            continue
//                        }
//                        ctd -= cantBll * 100
//                        cant -= cantBll * 100
//                        cjr -= cantBll * 100
//                        println("cant $cant")
//                    } while (seguir)
//                }
//                println("ctd 100 $ctd")
//            }
//
//            var listCt = listBCincuenta.size
//            if (ctd.div(50) > 0 && listCt > 0) {
//                println("50 if 1")
//                if (listCt >= ctd.div(50) && ctd.mod(50) == 0) {
//                    println("50 if 2")
//                    ctd -= ctd.div(50) * 50
//                    cjr -= ctd.div(50) * 50
//                } else if (listCt >= ctd.div(50) && (ctd.mod(50).mod(20) == 0)
//                ) {
//                    println("50 else if 3")
//                    ctd -= ctd.div(50) * 50
//                    cjr -= ctd.div(50) * 50
//                } else if (listCt < ctd.div(50)) {
//                    println("50 else if 4")
//                    var cantBll = listCt
//                    var seguir : Boolean = false
//                    var cant = ctd
//                    println("Tercer else If")
//                    do {
//                        println("100 do")
//                        seguir = false
//                        println((cant - (cantBll * 50)).mod(20))
//                        if ((cant - (cantBll * 50)).mod(20) != 0) {
//                            cantBll -= 1
//                            seguir = true
//                            continue
//                        }
//                        ctd -= cantBll * 50
//                        cant -= cantBll * 50
//                        cjr -= cantBll * 50
//                        println("cant $cant")
//                    } while (seguir)
//                }
//                println("ctd 50 $ctd")
//            }
//
//            var listV = listBVeinte.size
//            if (ctd.div(20) > 0 && listV > 0) {
//                println("20 if 1")
//                if (listV >= ctd.div(20) && ctd.mod(20) == 0) {
//                    ctd -= ctd.div(20) * 20
//                    cjr -= ctd.div(20) * 20
//                }  else if (listV < ctd.div(20)) {
//                    println("20 else if 2")
//                    var cantBll = listV
//                    var seguir : Boolean = false
//                    var cant = ctd
//                    do {
//                        println("20 do")
//                        seguir = false
//                        println((cant - (cantBll * 20)).mod(20))
//                        if ((cant - (cantBll * 20)).mod(20) != 0) {
//                            cantBll -= 1
//                            seguir = true
//                            continue
//                        }
//                        ctd -= cantBll * 50
//                        cant -= cantBll * 20
//                        cjr -= cantBll * 20
//                        println("cant $cant")
//                    } while (seguir)
//                }
//                println("ctd 20 $ctd")
//            }
//        }
//        else {
//            println("Por favor ingresa un monto válido🙁")
//            println("${this.nombre} cuenta con billetes de:${if (listBQuinientos.size > 0) " $500" else ""} ${if (listBDoscientos.size > 0) " $200" else ""} ${if (listBCien.size > 0) " $100" else ""} ${if (listBCincuenta.size > 0) " $50" else ""} ${if (listBVeinte.size > 0) " $20" else ""} ")
//        }
//    }
//}



//fun retiro(cantidad: Int) : Boolean {
//    var ctd = cantidad
//    var listV = listBVeinte.size
//    var listCt = listBCincuenta.size
//    var listCn = listBCien.size
//    var listD = listBDoscientos.size
//    var listQ = listBQuinientos.size
//    var seguir : Boolean = false
//    var valido : Boolean = true
//    var cant: Int
////        ctd.mod(20) == 0  || ctd.mod(50) == 0  || ctd.mod(50).mod(20)  == 0
//    if (ctd.mod(10) == 0  && ctd != 10 &&  ctd != 30 ){
//        println("500 if 1")
//        if (ctd.div(500) > 0 && listQ > 0 ){
//            println("500 if 2")
////                listQ >= ctd.div(500) && (ctd.mod(500).mod(20) == 0 || ctd.mod(500).mod(50) == 0)
//            if (listQ >= ctd.div(500)){
//                println("500 if 3")
//                listQ = ctd.div(500)
//                ctd -= ctd.div(500) * 500
//            }
//            else if (listQ < ctd.div(500)){
//                println("500 else if 4")
//                cant = ctd
//                do {
//                    println("500 do")
//                    seguir = false
////                        if ((cant - (listQ * 500)).mod(50) != 0 && (cant - (listQ * 500)).mod(20) != 0){
////                            listQ -= 1
////                            seguir = true
////                            continue
////                        }
//                    ctd -= listQ * 500
//                    cant -= listQ * 500
//                    println("cant lQ $cant")
//                }while (seguir)
//            }
//            println("ctd 500 $ctd")
//        }
//        else listQ = 0
//        if (ctd == 0 ){
//            listD = 0
//            listCn = 0
//            listCt = 0
//            listV = 0
//        }
//        //200
//        if (ctd.div(200) > 0 && listD > 0){
//            println("200 if 1")
////                listD >= ctd.div(200) && (ctd.mod(200).mod(20) == 0 || ctd.mod(200).mod(50) == 0)
//            if (listD >= ctd.div(200)){
//                println("200 if 2")
//                listD = ctd.div(200)
//                ctd -= ctd.div(200) * 200
//            }
//            else if (listD < ctd.div(200)) {
//                println("200 else if 3")
//                cant = ctd
//                do {
//                    println("200 do")
//                    seguir = false
////                        println((cant - (listD * 200)).mod(50))
////                        println((cant - (listD * 200)).mod(20))
////                        if ((cant - (listD * 200)).mod(50) != 0 && (cant - (listD * 200)).mod(20) != 0) {
////                            listD -= 1
////                            seguir = true
////                            continue
////                        }
//                    ctd -= listD * 200
//                    cant -= listD * 200
//                    println("cant lD $cant")
//                } while (seguir)
//            }
//            println("ctd 200 $ctd")
//        }
//        else listD = 0
//        if (ctd == 0){
//            listCn = 0
//            listCt = 0
//            listV = 0
//        }
//        //100
//        if (ctd.div(100) > 0 && listCn > 0) {
//            println("100 if 1")
////                listCn >= ctd.div(100) && (ctd.mod(100).mod(20) == 0 || ctd.mod(100).mod(50) == 0)
//            if (listCn >= ctd.div(100) && (ctd.mod(100).mod(20) == 0 || ctd.mod(100).mod(50) == 0)) {
//                println("100 if 2")
//                listCn = ctd.div(100)
//                ctd -= ctd.div(100) * 100
//            }
//            else if (listCn < ctd.div(100)) {
//                println("100 else if 3")
//                cant = ctd
//                do {
//                    println("100 do")
//                    seguir = false
//                    println((cant - (listCn * 100)).mod(50))
//                    println((cant - (listCn * 100)).mod(20))
////                        if ((cant - (listCn * 100)).mod(50) != 0 && (cant - (listCn * 100)).mod(20) != 0) {
////                            listCn -= 1
////                            seguir = true
////                            continue
////                        }
//                    ctd -= listCn * 100
//                    cant -= listCn * 100
//                    println("cant lCn $cant")
//                } while (seguir)
//            }
//            else listCn = 0
////                println("ctd 100 $ctd")
//        }
//        else listCn = 0
//        if (ctd == 0){
//            listCt = 0
//            listV = 0
//        }
//        //50
//        if (ctd.div(50) > 0 && listCt > 0) {
//            println("50 if 1")
//            if (listCt >= ctd.div(50) && (ctd.mod(50) == 0 || ctd.mod(50).mod(20) == 0)) {
//                println("50 if 2")
//                listCt = ctd.div(50)
//                ctd -= ctd.div(50) * 50
//            }
////                listCt < ctd.div(50)
//            else if (listCt < ctd.div(50) || (ctd.mod(50) != 0 || ctd.mod(50).mod(20) != 0)) {
//                println("50 else if 3")
//                cant = ctd
//                do {
//                    println("50 do")
//                    seguir = false
//                    println((cant - (listCt * 50)).mod(20))
//                    println((cant - (listCt * 50)))
//                    println((cant - (listCt * 50)).mod(50))
//                    println((cant - (listCt * 50)).mod(40))
//                    println("listCt $listCt")
//                    (cant - (listCt * 50)).mod(20) != 0
//                    if ( ((cant - (listCt * 50)).mod(20) != 0) || (cant - (listCt * 50) < 0 ) ) {
//                        listCt -= 1
//                        seguir = true
//                        continue
//                    }
//                    ctd -= listCt * 50
//                    cant -= listCt * 50
//                    println("cant lCt $cant")
//                } while (seguir)
//            }
//            println("ctd 50 $ctd")
//        }
//        else listCt = 0
//        if (ctd == 0){
//            listV = 0
//        }
//        //20
//        if (ctd.div(20) > 0 && listV > 0) {
//            println("20 if 1")
//            println("ctd $ctd")
//
//            if (listV >= ctd.div(20) && ctd.mod(20) == 0) {
//                println("20 else if 2")
//                println("ctd ${ctd.div(20)}")
//                listV = ctd.div(20)
//                ctd -= ctd.div(20) * 20
//            }  else if (listV < ctd.div(20)) {
//                println("20 else if 3")
//                cant = ctd
//                do {
//                    println("20 do")
//                    seguir = false
//                    println((cant - (listV * 20)))
//                    println((listV * 20))
//                    println((listV * 20).mod(20))
//                    println((listV * 20).mod(50))
//                    if ((cant - (listV * 20)).mod(50) != 0 ) {
//                        listV -= 1
//                        seguir = true
//                        continue
//                    }
//                    ctd -= listV * 20
//                    cant -= listV * 20
//                    println("cant lV $cant")
//                } while (seguir)
//                ctd = if ((((listBVeinte.size - listV ) * 20) - cant + 30) < 0) (((listBVeinte.size - listV ) * 20) - cant + 50) else (((listBVeinte.size - listV ) * 20) - cant + 30)
//            }
////                println("ctd 20 $ctd")
//        }
//        else listV  = 0
//    }
//    else {
//        valido = false
//        println("Por favor ingresa un monto válido🙁")
//        println("${this.nombre} cuenta con billetes de:${if (listQ > 0) " $500" else ""}${if (listD > 0) " $200" else ""}${if (listCn > 0) " $100" else ""}${if (listCt > 0) " $50" else ""}${if (listV > 0) " $20" else ""} ")
//    }
//
//    if (ctd == 0){
////            println("Llegó al ctd == 0")
////            println(listV)
////            println(listCt)
////            println(listCn)
////            println(listD)
////            println(listQ)
//        println("Recibes $$cantidad💵")
//        quitarCajero(listV, 20)
//        quitarCajero(listCt, 50)
//        quitarCajero(listCn, 100)
//        quitarCajero(listD, 200)
//        quitarCajero(listQ, 500)
//        return true
//    }
//    else {
//        if ((cantidad - ctd) != 0) {
//            println("Lo sentimos, no podemos darte esa cantidad, intenta con $${cantidad - ctd}🤓")
//            println("${this.nombre} cuenta con billetes de:${if (listBQuinientos.size > 0) " $500" else ""}${if (listBDoscientos.size > 0) " $200" else ""}${if (listBCien.size > 0) " $100" else ""}${if (listBCincuenta.size > 0) " $50" else ""}${if (listBVeinte.size > 0) " $20" else ""} ")
//        }
//        else {
//            if (valido){
//                println("Lo sentimos, no podemos darte esa cantidad 😕")
//                println("${this.nombre} cuenta con billetes de:${if (listBQuinientos.size > 0) " $500" else ""}${if (listBDoscientos.size > 0) " $200" else ""}${if (listBCien.size > 0) " $100" else ""}${if (listBCincuenta.size > 0) " $50" else ""}${if (listBVeinte.size > 0) " $20" else ""} ")
//            }
//        }
//
//        return false
//    }
//}
