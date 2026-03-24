# 📄 CRUD de Usuários em Java (Arquivo `.txt`)

Projeto simples de CRUD (**Create, Read, Update, Delete**) em Java utilizando **arquivo `.txt` como armazenamento**.

Ideal para iniciantes que querem entender lógica de persistência sem banco de dados.

---

## 🚀 Sobre o projeto

Este projeto implementa um sistema de cadastro de usuários via terminal, salvando os dados em um arquivo chamado:

```
usuarios.txt
```

Cada usuário é armazenado em uma linha no formato:

```
nome;email;idade
```

---

## 🛠️ Tecnologias utilizadas

* Java (JDK 21)
* Manipulação de arquivos (`FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`)
* Programação orientada a objetos (POO)

---

## 📂 Estrutura do projeto

```
.
├── Main.java
├── Usuario.java
└── usuarios.txt (gerado automaticamente)
```

---

## ⚙️ Funcionalidades

O sistema possui um menu interativo no terminal:

```
1 - Cadastrar
2 - Listar
3 - Editar
4 - Excluir
0 - Sair
```

### ➕ Cadastrar

Adiciona um novo usuário ao arquivo.

### 📋 Listar

Exibe todos os usuários com índice.

### ✏️ Editar

Permite alterar os dados de um usuário existente.

### ❌ Excluir

Remove um usuário da lista.

---

## 💾 Como funciona o armazenamento

* Os dados são salvos no arquivo `usuarios.txt`
* Cada linha representa um usuário
* Separador utilizado: `;`

### Exemplo do arquivo:

```
João;joao@email.com;25
Maria;maria@email.com;30
```

---

## ▶️ Como executar

### 1. Compilar os arquivos

```bash
javac Main.java Usuario.java
```

### 2. Executar o programa

```bash
java Main
```

---

## 🧠 Conceitos aplicados

* Leitura e escrita em arquivos
* Listas (`ArrayList`)
* Tratamento de exceções
* Separação de responsabilidades (Main / Usuario)
* Serialização simples (String → Objeto)

---

## ⚠️ Limitações

* Não possui validação de dados
* Pode quebrar se o usuário digitar índice inválido
* Não possui interface gráfica
* Não usa banco de dados

---

## 📌 Melhorias futuras

* [ ] Validação de entrada de dados
* [ ] Tratamento de erros mais robusto
* [ ] Interface gráfica (Swing/JavaFX)
* [ ] Persistência com banco de dados (MySQL, PostgreSQL)
* [ ] Busca de usuários por nome ou email

---

## 🤝 Contribuição

Sinta-se à vontade para contribuir:

1. Fork o projeto
2. Crie uma branch (`feature/minha-feature`)
3. Commit suas alterações
4. Push para a branch
5. Abra um Pull Request

---

## 📄 Licença

Este projeto é livre para uso educacional.
