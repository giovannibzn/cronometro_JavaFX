# ⏱️ Cronômetro em JavaFX 🚀

Bem-vindo ao **Cronômetro em JavaFX**! Este é um projeto de um cronômetro com interface gráfica moderna, desenvolvido em **JavaFX**. Ele exibe horas, minutos, segundos e milésimos, e oferece controles para iniciar, pausar, continuar e resetar o tempo. Ideal para quem está aprendendo JavaFX e manipulação de tempo em Java.

---

## 🎯 Funcionalidades

- **⏱️ Cronômetro preciso**: Exibe horas, minutos, segundos e milésimos.
- **🎨 Interface gráfica moderna**: Desenvolvida com JavaFX, é intuitiva e responsiva.
- **🕒 Controle completo**: Iniciar, pausar, continuar e resetar o cronômetro.
- **🚀 Fácil de usar**: Design limpo e focado na usabilidade.

---

## 🛠️ Como Executar

### Pré-requisitos
- **Java JDK 11 ou superior**: [Baixar JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- **JavaFX SDK**: [Baixar JavaFX SDK](https://gluonhq.com/products/javafx/)

### Passos para Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/cronometro-javafx.git
   ```

2. **Navegue até a pasta do projeto**:
   ```bash
   cd cronometro-javafx
   ```

3. **Configure o JavaFX**:
   - Adicione o JavaFX SDK ao classpath do seu projeto.
   - Se estiver usando uma IDE como IntelliJ ou Eclipse, configure o JavaFX nas configurações do projeto.

4. **Compile e execute**:
   - Via linha de comando (exemplo para Linux/Mac):
     ```bash
     javac --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml src/*.java
     java --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml Main
     ```
   - Em uma IDE, basta executar a classe `Main`.

5. **Pronto!** A interface gráfica do cronômetro será aberta.

---

## 🗂️ Estrutura do Projeto

Aqui está uma visão geral da estrutura do projeto:

```
cronometro-javafx/
├── src/
│   ├── HelloApplication.java            
│   ├── Cronometro.java     
│   ├── HelloController.java
│   └── resources/           
│       └── hello-view.fxml
        └── styles.css   
└── README.md               

```

---

## 💻 Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **JavaFX**: Framework para criação de interfaces gráficas modernas.
- **FXML**: Para definir a interface gráfica de forma declarativa.
- **CSS**: Para estilizar a interface gráfica.

---

## 🤝 Contribuição

Contribuições são bem-vindas! Se quiser melhorar o projeto, siga os passos:

1. Faça um **fork** do projeto.
2. Crie uma branch com sua feature:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça commit das suas alterações:
   ```bash
   git commit -m 'Adicionando nova feature'
   ```
4. Envie para o repositório remoto:
   ```bash
   git push origin minha-feature
   ```
5. Abra um **Pull Request** e aguarde a revisão.

---
