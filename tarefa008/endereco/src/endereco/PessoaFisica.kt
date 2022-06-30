package endereco

class PessoaFisica : Endereco() {
    override lateinit var nome : String
    private lateinit var sexo : String
    private lateinit var dataNascimento : String
}