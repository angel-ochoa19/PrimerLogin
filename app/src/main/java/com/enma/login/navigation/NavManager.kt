package com.enma.login.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.enma.login.view.login.BlanckView
import com.enma.login.view.login.TabsView
import com.enma.login.view.notas.HomeView
import com.enma.login.viewmodel.LoginViewModel
import com.enma.login.viewmodel.NotesViewModel

@Composable
fun NavManager(loginViewModel: LoginViewModel,
               notesViewModel: NotesViewModel){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "black"){
        composable("black") {
            BlanckView(navController = navController)
        }
        composable("login") {
            TabsView(navController = navController, loginViewModel = loginViewModel)
        }
        composable("home") {
            HomeView(navController = navController, viewModel = notesViewModel)
        }
    }
}