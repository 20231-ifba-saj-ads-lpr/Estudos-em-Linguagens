# Getters e Setters em Java: Um Guia Completo

Getters e setters são métodos especiais em Java que permitem o acesso e a modificação dos atributos de uma classe de forma controlada. Eles são fundamentais para o conceito de encapsulamento, que é um dos pilares da programação orientada a objetos.
Por que usar getters e setters?

    Encapsulamento: Ao tornar os atributos de uma classe privados e fornecer métodos públicos para acessá-los e modificá-los, você protege os dados internos da classe de alterações indesejadas e garante a integridade dos objetos.
    Validação: Os métodos setters podem ser usados para implementar lógica de validação, garantindo que apenas valores válidos sejam atribuídos aos atributos.
    Flexibilidade: Getters e setters permitem que você altere a implementação interna de uma classe sem afetar o código que a utiliza, pois o acesso aos atributos sempre se dá através desses métodos.

# Como funcionam?

    Getter: Um método getter retorna o valor de um atributo privado. Seu nome geralmente começa com "get" seguido do nome do atributo.
    Setter: Um método setter atribui um novo valor a um atributo privado. Seu nome geralmente começa com "set" seguido do nome do atributo.