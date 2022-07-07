//interface Billete {
//    open var personaje: String
//    open var cantidad: Int
//    open var color: String
//}
//class Veinte: Billete {
//    override var personaje: String = "Benito Juarez"
//    override var cantidad: Int = 20
//    override var color: String = "Azul"
//}
//
//class Cincuenta: Billete {
//    override var personaje: String = "José María Morelos y Pavón"
//    override var cantidad: Int = 50
//    override var color: String = "Rosa"
//}
//
//class Cien: Billete {
//    override var personaje: String = "Señor bigoton"
//    override var cantidad: Int = 100
//    override var color: String = "Naranja"
//}
//
//class Doscientos: Billete {
//    override var personaje: String = "Señora monja"
//    override var cantidad: Int = 200
//    override var color: String = "Verde"
//}
//
//class Quinientos: Billete {
//    override var personaje: String = "Señor gordo"
//    override var cantidad: Int = 500
//    override var color: String = "Café"
//}


open class Billete {
    open var personaje: String = ""
    open var cantidad: String = ""
    open var valor: Int = 0
    open var color: String = ""
}
class Veinte: Billete() {
    override var personaje: String = "Benito Juarez"
    override var cantidad: String = "Veinte"
    override var valor: Int = 20
    override var color: String = "Azul"
}

class Cincuenta: Billete() {
    override var personaje: String = "José María Morelos y Pavón"
    override var cantidad: String = "Cincuenta"
    override var valor: Int = 50
    override var color: String = "Rosa"
}

class Cien: Billete() {
    override var personaje: String = "Señor bigoton"
    override var cantidad: String = "Cien"
    override var valor: Int = 100
    override var color: String = "Naranja"
}

class Doscientos: Billete() {
    override var personaje: String = "Señora monja"
    override var cantidad: String = "Doscientos"
    override var valor: Int = 200
    override var color: String = "Verde"
}

class Quinientos: Billete() {
    override var personaje: String = "Señor gordo"
    override var cantidad: String = "Quinientos"
    override var valor: Int = 500
    override var color: String = "Café"
}
