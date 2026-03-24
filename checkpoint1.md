# Documentação das implementações feitas durante o cp1

Fizemos Algumas implementações para melhorar a experiência e interatividade do usuário dentro do app.


## Passagem de parametros obrigatórios dentro da tela 


```
 composable(route = "perfil/{nome}") {
                            val nome: String? = it.arguments?.getString("nome", "Usuário Genérico")
                            PerfilScreen(modifier = Modifier.padding(innerPadding), navController, nome!!)
                        }
```

### composable(route = "perfil/{nome}")

Criando a rota de navegação, a rota {nome} é dinamica e pode mudar conforme o nome.

### val nome: String? = it.arguments?.getString("nome", "Usuário Genérico")

it contem as informaçõs de navegação atual, arguments contem os paramentros que serão utilizados ("nome" com o valor default sendo "Usuário Genérico")

### PerfilScreen(modifier = Modifier.padding(innerPadding), navController, nome!!)

Chamando a tela PerfilScreen e passando as informações que serão utilizadas.

### nome !!! 

Força o valor a nao ser nulo 
