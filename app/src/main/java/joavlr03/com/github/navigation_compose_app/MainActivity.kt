package joavlr03.com.github.navigation_compose_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import joavlr03.com.github.navigation_compose_app.screens.LoginScreen
import joavlr03.com.github.navigation_compose_app.screens.MenuScreen
import joavlr03.com.github.navigation_compose_app.screens.PedidosScreen
import joavlr03.com.github.navigation_compose_app.screens.PerfilScreen
import joavlr03.com.github.navigation_compose_app.ui.theme.NavigationcomposeappTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationcomposeappTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "login",
                    ) {
                        composable(route = "login") {
                            LoginScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "menu") {
                            MenuScreen(modifier = Modifier.padding(innerPadding), navController)
                        }

                        composable(
                            route = "pedidos?cliente={cliente}",
                            arguments = listOf(navArgument("cliente") {
                                defaultValue = "Cliente Genérico"
                            })
                        ) {

                            PedidosScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController,
                                it.arguments?.getString("cliente")
                            )
                        }
                            composable(
                                route = "perfil/{nome}/{idade}",
                                arguments = listOf(
                                    navArgument("nome") { type = NavType.StringType },
                                    navArgument("idade") { type = NavType.IntType }
                                )
                            ) {

                            val nome: String? = it.arguments?.getString("nome", "Usuário Genérico")
                                val idade: Int? = it.arguments?.getInt("idade", 0)
                            PerfilScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController,
                                nome!!,
                                idade!!
                            )
                        }
                    }
                }
            }
        }
    }

}





