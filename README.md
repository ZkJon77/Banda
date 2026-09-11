# Exercicio POO - Banda Escolar

Nome: [Jonatan Viana]

## Estrutura

```
model/
  InstrumentoMusical.java   (classe abstrata)
  Violao.java
  Bateria.java
app/
  TesteBanda.java
```

## Como compilar e rodar

A partir da pasta raiz do projeto:

```
javac model/*.java app/*.java
java app.TesteBanda
```

## Respostas da Parte 2 (perguntas de extracao)

1. **Classes concretas:** duas -> Violao e Bateria.

2. **Atributos comuns a todos os instrumentos (vao para a classe abstrata):**
   nome, material e o estado afinado (boolean).

3. **Atributo exclusivo de cada instrumento:**
   - Violao: quantidade de cordas (int cordas = 6)
   - Bateria: quantidade de tambores (int tambores = 5)

4. **Comportamento diferente em cada um -> metodo abstrato:** tocar()
   (cada instrumento produz um som diferente).
   **Comportamento igual para todos -> metodo concreto na classe mae:**
   afinar() (o processo de afinar e o mesmo para qualquer instrumento).

5. **Recurso do Java que impede criar um "instrumento generico":**
   declarar a classe InstrumentoMusical como `abstract`. Uma classe
   abstrata nao pode ser instanciada diretamente com `new`.

6. **Tipo da List usada no teste:** `List<InstrumentoMusical>`, para
   percorrer todos os instrumentos no mesmo laco sem `instanceof` e sem
   cast, aproveitando o polimorfismo (cada objeto chama sua propria
   versao de tocar()).
