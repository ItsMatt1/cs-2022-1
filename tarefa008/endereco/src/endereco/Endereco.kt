package endereco

enum class TipoEndereco {
    COMERCIAL,
    RESIDENCIAL
}

open class Endereco : Bairro() {
    private var numero : Int = 0
    private lateinit var Complemento : String
    private var CEP : Int = 0

}

