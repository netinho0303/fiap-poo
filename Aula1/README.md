# Projeto FIAP - Programação Orientada a Objetos (FiapRide)
 ##  Descrição do Objeto Modelado Este projeto contempla a modelagem orientada a objetos de uma **Garrafa de Água** em Java, evoluída na Aula 2 com comportamento dinâmico e regras de negócio. --
 Estrutura da Classe (`Garrafa.java`) 
 Atributos (Características) - `cor` (`String`): Cor da garrafa (ex: Azul, Vermelha). - `material` (`String`): Material de fabricação (ex: Plástico, Alumínio). - `quantidadeEmML` (`int`): Volume atual de água contido na garrafa em mililitros.

 ### Métodos e Regras de Negócio (Comportamentos)
 
1)**encherGarrafa(int quantidade)** - **Ação**: Incrementa a quantidade de água da garrafa. - **Regra de Negócio**: Impede reabastecimentos com valores menores ou iguais a zero (`quantidade <= 0`).
 2) **beberAgua(int quantidade)** - **Ação**: Reduz a quantidade de água disponível. - **Regra de Negócio**: Impede o consumo se o valor for inválido ou se a quantidade solicitada for maior do que o volume disponível na garrafa (`quantidadeEmML < quantidade`). —
