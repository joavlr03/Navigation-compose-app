# 📱 Navigation Compose App

Aplicativo Android desenvolvido com **Jetpack Compose** que demonstra, de forma prática, como implementar **navegação entre telas** utilizando o Navigation Compose.

---

## 🚀 Sobre o projeto

Este projeto tem como objetivo apresentar uma estrutura simples e funcional de navegação em aplicações Android modernas utilizando **Jetpack Compose**.

A navegação é feita de forma declarativa, utilizando um **NavController** e um **NavHost**, permitindo gerenciar múltiplas telas de forma organizada e escalável.

---

## 🧠 Como o projeto funciona

O app é baseado em três conceitos principais:

### 🔹 NavController
Responsável por controlar a navegação entre as telas.

### 🔹 NavHost
Define o container onde as telas serão exibidas.

### 🔹 Rotas (Screens)
Cada tela é representada como uma rota dentro do sistema de navegação.

### 🔄 Fluxo de navegação
Tela A → Tela B → Tela C

A navegação acontece por meio de ações do usuário (como cliques em botões), que chamam:

```kotlin
navController.navigate("rota")
```


##📱 Funcionalidades

### ✅ Navegação entre múltiplas telas
### ✅ Interface construída com Jetpack Compose
### ✅ Estrutura simples e organizada
### ✅ Uso de rotas para controle de navegação
### ✅ Exemplo prático para aprendizado

## 🛠️ Tecnologias utilizadas
### Kotlin
### Jetpack Compose
### Navigation Compose

Exemplo de dependência utilizada:
```
implementation("androidx.navigation:navigation-compose:2.x.x")
```

## Como executar o projeto
Clone o repositório:
```
git clone https://github.com/joavlr03/Navigation-compose-app.git
```
### 📸 Preview
<img width="251" height="542" alt="TelaLogin" src="https://github.com/user-attachments/assets/d0de1cd8-3351-46f5-95fd-24df013247bf" />

