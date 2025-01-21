# Desing patterns

## Criacionais

### Singleton:
    Ele é utilizado para garantir que uma classe tenha apenas uma única instância durante todo o ciclo de vida da aplicação e fornece um ponto global de acesso a essa instância. 

### Factory Method
    Ele é utilizado para definir uma interface ou classe abstrata que declara um método para criar objetos, permitindo que subclasses implementem a criação de objetos específicos, sem que a classe cliente precise conhecer os detalhes da implementação.

### Builder
    Ele é utilizado para facilitar a criação de objetos complexos, permitindo a configuração dos seus atributos de maneira fluida e legível. O padrão evita múltiplos construtores e torna o código mais limpo. Geralmente, é implementado através de uma classe interna estática com métodos encadeados para cada atributo.