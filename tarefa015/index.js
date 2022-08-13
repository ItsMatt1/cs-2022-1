const regexLogin = login => {
    (/([a-zA-Z0-9$&+,:;=?@#|'<>.^*()%!-]{5,30})\w+/.test(login)) ?
        console.log("O LOGIN PASSOU NO TESTE!") : console.log("O LOGIN NAO PASSOU NO TESTE!")
}

regexLogin("TarefaRegex")
regexLogin("¨¨tarefa0000regeXXl22222ut3")

const regexSenha = senha => {
    (!(/^(?=.*[a-z])(?=.*[A-Z])(?=.*[$&+,:;=?@#|'<>.^*()%!-])[0-9a-zA-Z$&+,:;=?@#|'<>.^*()%!-]{8,12}$/.test(senha))) ?
        console.log("A SENHA PASSOU NO TESTE!") : console.log("A SENHA NAO PASSOU NO TESTE!")
}

regexSenha("**¢¢coxinha")
regexSenha("Coxinha")

regexSenha("**cOxinha55")
