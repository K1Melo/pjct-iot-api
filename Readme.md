# Seja Bem Vindo a `SMART TERRARIUM API`

#### ` Java | Spring | Spring Boot | Docker | Maven | Internet das Coisas | Sistemas embarcados | PostgreSQL `

Bem-vindo ao projeto do Terrário Inteligente! Este projeto tem como objetivo criar um sistema automatizado de monitoramento e controle das condições de um terrário, utilizando um microcontrolador ESP32 para conexão à internet e um aplicativo móvel para exibir os dados em tempo real.

## Requisitos

- <a href="https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html" target="_blank">JDK 17</a>
- <a href="https://www.docker.com/products/docker-desktop/" target="_blank">Docker</a>

## Executando Aplicativo Local

`````shell

# Start docker-compose
docker-compose up -d iot-api

`````

## Descrição do Projeto

O Terrário Inteligente monitora e controla as condições de ambiente, como temperatura, umidade e luminosidade. Utilizando sensores conectados ao ESP32, os dados são coletados e enviados para a nuvem, de onde o aplicativo mobile pode acessá-los e exibi-los em tempo real. O sistema permite ainda o controle de dispositivos dentro do terrário, como lâmpadas e ventiladores, de acordo com os parâmetros configurados.

## Funcionalidades

- **Monitoramento em tempo real**: Acompanhe as condições de temperatura, umidade e luminosidade do terrário.
- **Controle automático**: O sistema aciona dispositivos com base nos parâmetros configurados (ex: ligar/desligar lâmpada de aquecimento).
- **Interface mobile**: Aplicativo móvel para visualizar dados e controlar o terrário à distância.
- **Conectividade via ESP32**: Comunicação com a internet para sincronização de dados.
  
## Tecnologias Utilizadas

### Sistema
- **ESP32**: Microcontrolador utilizado para coletar dados e controlar o terrário.
- **Sensores**: Sensores de temperatura, umidade e luminosidade para coleta de dados ambientais.

### Aplicativo
- **React Native**: Framework para desenvolvimento do aplicativo mobile.

### Protótipo (Sistema)
- **Wokwi**: Plataforma de simulação de hardware utilizada para testar o código.

## Pitch

Caso queira visualizar nosso pitch, assista o vídeo no link abaixo:

[Assista no YouTube](https://www.youtube.com/watch?v=BoO9Pax7lPo)
