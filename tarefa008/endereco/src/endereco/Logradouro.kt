package endereco

enum class TipoLogradouro {
    ALAMEDA,
    AVENIDA,
    MARGINAL,
    RUA,
    RODOVIA,
    VIA,
    VIELA,
    TRAVESSA
}

open interface Logradouro {
    abstract var nome : String
}

