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

## Passagem de Multiplos parâmetros

```
 PedidosScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController,
                                it.arguments?.getString("cliente")
                            )
```

### PedidosScreen()
Chamando a função composable para a tela pedidos do app

### modifier 
Responsável por estilizar os elementos

###  navController, it.arguments?.getString("cliente")
Faz a navegação entre outra tela, no caso a tela cliente

### it.argurments
Passa os dados do cliente entre as telas ( Pedidos -> Cliente)

### Resumo 
Estilizando a tela pedidos e passando o tamanho que ela deve ter, criando a navegação entre telas com o parâmetro cliente 

```
 composable(
                                route = "perfil/{nome}/{idade}",
                                arguments = listOf(
                                    navArgument("nome") { type = NavType.StringType },
                                    navArgument("idade") { type = NavType.IntType }
                                )
                            ) {
```

### composable()
Usado para definir a rota entre as telas do app

###  route = "perfil/{nome}/{idade}
Definindo qual é a rota 

### arguments = listOf(
Definindo qual serão os parâmetros 

### navArgument("nome") { type = NavType.StringType }, navArgument("idade") { type = NavType.IntType }
Declarando os parâmetros e os tipos de dados 

### Resumo
Criando a tela perfil, definindo sua rota e a deixando capaz de receber dados de diferentes tipos (dinâmicos)


````
composable(route = "perfil/{nome}") {
                            val nome: String? = it.arguments?.getString("nome", "Usuário Genérico")
                                val idade: Int? = it.arguments?.getInt("idade", 0)
                            PerfilScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController,
                                nome!!
                                nome!!,
                                idade!!
                            )

````

###        val idade: Int? = it.arguments?.getInt("idade", 0)

Criando a variável para a idade e um valor default para se caso nada for passado

### nome!!, idade!!

Define que nome e idade nao podem ser nulos

````
onClick = { navController.navigate("perfil/Fulano de Tal/27") }
````

 Define os dados que serão mostrados quando o usuario clicar no botão

````
onClick = { navController.navigate("pedidos?cliente=Cliente XPTO") }
````
 Define os dados do cliente que tem um pedido

````
  text = "PERFIL - $nome tem $idade anos",
````

Insere no formato de texto os valores que foram recebidos por idade e nome para serem exibidos no perfil

## Inserindo valor ao parâmetro opcional na tela de Pedidos

````
 onClick = { navController.navigate("pedidos?cliente=Cliente XPT") },
````

Definindo que ao clicar no botão o usuário será direcionado para outra tela já com parâmetros opcionais definidos
