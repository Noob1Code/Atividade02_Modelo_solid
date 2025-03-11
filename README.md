## Pontos Positivos do Código

1. **Modularidade e Baixo Acoplamento:**
   - O código está bem dividido em módulos (interfaces e classes) que são responsáveis por funcionalidades específicas.
   - O uso de interfaces (`PedidoFactoryInterface`, `ProcessadorDePedidosInterface`, `DescontoStrategy`, etc.) permite que as dependências sejam injetadas, reduzindo o acoplamento entre as classes.

2. **Extensibilidade:**
   - O código está aberto para extensão, mas fechado para modificação. Por exemplo, novos tipos de notificadores (como `WhatsAppNotificador`) podem ser adicionados sem alterar o código existente.
   - Novas estratégias de desconto ou repositórios de pedidos podem ser implementados sem afetar o funcionamento do sistema.

3. **Facilidade de Teste:**
   - Como as dependências são injetadas via construtores, é fácil criar mocks ou stubs para testar as classes de forma isolada.
   - Por exemplo, `ProcessadorDePedidos` pode ser testado com um `Notificador` mockado, sem depender de uma implementação real.

4. **Clareza e Organização:**
   - O código está bem organizado, com interfaces claras e implementações específicas.
   - A separação entre criação (`PedidoFactory`), processamento (`ProcessadorDePedidos`) e estratégias (`DescontoStrategy`) facilita a compreensão do fluxo do sistema.

5. **Reutilização de Código:**
   - As interfaces e classes podem ser reutilizadas em diferentes partes do sistema ou em outros projetos.
   - Por exemplo, `Notificador` pode ser usado em outros contextos além do processamento de pedidos.

---

## Princípios SOLID Aplicados

### 1. **Single Responsibility Principle (SRP)**
- **O que foi aplicado:**
  - Cada classe tem uma única responsabilidade.
  - Exemplos:
    - `PedidoFactory` é responsável apenas por criar processadores de pedidos.
    - `ProcessadorDePedidos` é responsável apenas por processar pedidos.
    - `DescontoClienteComum` e `DescontoClienteVip` são responsáveis apenas por calcular descontos.

- **Benefício:**
  - Facilita a manutenção e o entendimento do código, pois cada classe tem um propósito claro.

---

### 2. **Open/Closed Principle (OCP)**
- **O que foi aplicado:**
  - O código está aberto para extensão, mas fechado para modificação.
  - Exemplos:
    - Novos notificadores (como `WhatsAppNotificador`) podem ser adicionados sem alterar o código existente.
    - Novas estratégias de desconto podem ser implementadas sem modificar o `ProcessadorDePedidos`.

- **Benefício:**
  - Permite adicionar novas funcionalidades sem riscos de introduzir bugs em partes já funcionais do sistema.

---

### 3. **Liskov Substitution Principle (LSP)**
- **O que foi aplicado:**
  - As subclasses podem substituir suas classes base sem alterar o comportamento do programa.
  - Exemplos:
    - `DescontoClienteComum` e `DescontoClienteVip` podem ser usados no lugar de `DescontoStrategy`.
    - `EmailNotificador`, `SmsNotificador` e `WhatsAppNotificador` podem ser usados no lugar de `Notificador`.

- **Benefício:**
  - Garante que as implementações derivadas sejam consistentes com o comportamento esperado da interface base.

---

### 4. **Interface Segregation Principle (ISP)**
- **O que foi aplicado:**
  - As interfaces são específicas e coesas, contendo apenas métodos relevantes.
  - Exemplos:
    - `Notificador` tem apenas o método `notificar`.
    - `DescontoStrategy` tem apenas o método `calcularDesconto`.

- **Benefício:**
  - Evita que as classes implementem métodos desnecessários, mantendo as interfaces simples e focadas.

---

### 5. **Dependency Inversion Principle (DIP)**
- **O que foi aplicado:**
  - Módulos de alto nível dependem de abstrações, e não de implementações concretas.
  - Exemplos:
    - `PedidoFactory` e `ProcessadorDePedidos` dependem de interfaces como `Notificador`, `PedidoRepository` e `DescontoStrategy`.
    - As dependências são injetadas via construtores, permitindo flexibilidade e facilidade de teste.

- **Benefício:**
  - Reduz o acoplamento entre classes e facilita a substituição de implementações concretas.
