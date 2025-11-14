# ⛽ Combustível Ideal

O **Combustível Ideal** é um aplicativo Android simples e intuitivo desenvolvido para ajudar motoristas a economizar na hora de abastecer.  
Com base nos preços informados de **Gasolina** e **Etanol**, o app calcula automaticamente qual opção é mais vantajosa.

---

## Funcionalidades

- Entrada do preço da **Gasolina**
- Entrada do preço do **Etanol**
- Cálculo automático baseado na fórmula:

- Botão **Calcular**
- Botão **Limpar campos**
- Interface simples, organizada e responsiva

---
```java
double resultado = precoEtanol / precoGasolina;

if (resultado < 0.7) {
    txtResultado.setText("Melhor usar: Etanol!");
} else {
    txtResultado.setText("Melhor usar: Gasolina!");
}
```
## Interface

A tela principal contém:

- Uma área de resultado exibindo qual combustível compensa mais  
- Dois campos de entrada para os preços  
- Um ícone central ilustrando o posto de combustível  
- Botões de **Calcular** e **Limpar**

---

## 🛠️ Tecnologias Utilizadas

<div style="display: flex; gap: 20px; align-items: center;">
<div style="display: flex; gap: 20px; align-items: center;"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-plain.svg" width="50" title="Java" /> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/android/android-plain.svg" width="50" title="Android" /> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/androidstudio/androidstudio-plain.svg" width="50" title="Android Studio" /> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/xml/xml-plain.svg" width="50" title="XML" /> </div>
</div>

##  Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/CombustivelIdeal
