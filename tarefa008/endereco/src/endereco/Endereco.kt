package endereco

public open class Endereco : Bairro(), TipoEndereco(), Logradouro() {
    private var numero : Int = 0
    private lateinit var Complemento : String
    private var CEP : Int = 0

//    constructor(numero: Int, Complemento: String, CEP: String) {
//        this.numero = numero
//        this.Complemento = Complemento
//        this.CEP = CEP
//    }



}