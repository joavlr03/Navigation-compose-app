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

### nome !!

Força o valor a nao ser nulo

## Resumo
Aqui nós definimos uma rota com parâmetros e passamos ele para a tela perfil


## Passagem de parametros opcionais na tela Pedidos

```
composable(
                            route = "pedidos?cliente={cliente}",
                            arguments = listOf(navArgument("cliente") {
                                defaultValue = "Cliente Genérico"
                            })
                        ) {
                            PedidosScreen(modifier = Modifier.padding(innerPadding), navController, it.arguments?.getString("cliente"))
```

### route = "pedidos?cliente={cliente}"

indicando que a rota pode receber um parâmetro ciente, mas ele é opcional.

### arguments = listOf(  navArgument("cliente") {     defaultValue = "Cliente Genérico"   })

Definindo os valores do parâmetro e seu valor default

### it.arguments?.getString("cliente")

Recebe valor do cliente e retorna string mesmo se for nulo 

### PedidosScreen(    modifier = Modifier.padding(innerPadding),   navController,    it.arguments?.getString("cliente"))

Passando o cliente para ser exibido na tela 

### Resumo 

Definimos rotas, parâmetros opcionais e valores padrões e tambem chamamos os valores para serem exibidos na tela  

### Passagem de parametros opcionais na tela Pedidos

```

 composable(
                            route = "pedidos?cliente={cliente}",
                            arguments = listOf(navArgument("cliente") {
                                defaultValue = "Cliente Genérico"
                            })
                        ) {
                            PedidosScreen(modifier = Modifier.padding(innerPadding), navController, it.arguments?.getString("cliente"))

```

### route = "pedidos?cliente={cliente}"

criando uma rota com parâmetro opcional

### navArgument("cliente") {defaultValue = "Cliente Genérico"}

Definindo valor padrão para o parâmetro


###  PedidosScreen(modifier = Modifier.padding(innerPadding), navController, it.arguments?.getString("cliente"))

Passando os valores para a tela

```
fun PedidosScreen(modifier: Modifier = Modifier, navController: NavController, cliente: String?)
```

### fun PedidosScreen(modifier: Modifier = Modifier, navController: NavController, cliente: String?) 

Definindo a tela PedidosScreen e os parâmetros que ela recebe

```
 text = "PEDIDOS  - $cliente\""
```
chamando a variavel cliente para ser exibida no texto da classe PedidoScreen

### Resumo 

Criação da rota pedidos, parâmetros opcionais, valor padrão e chamando para ser exibido na tela




