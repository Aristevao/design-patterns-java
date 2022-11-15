package creational.factory.examples.button;

class ButtonExample {
    public static void main(String[] args) {
        // A aplicação seleciona um tipo de criador dependendo da
        // configuração atual ou definições de ambiente.
        Initialize init = new Initialize();

        // O código cliente trabalha com uma instância de um criador
        // concreto, ainda que com sua interface base. Desde que o
        // cliente continue trabalhando com a criadora através da
        // interface base, você pode passar qualquer subclasse da
        // criadora.
        Dialog dialog = init.initialize();
        dialog.render();
    }
}

class Initialize {

    Dialog dialog;

    public Dialog initialize() {
        ConfigFile config = new ConfigFile();

        try {
            if (config.OS() == "Windows")
                dialog = new WindowsDialog();
            else if (config.OS() == "Web")
                dialog = new WebDialog();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dialog;
    }
}

// A classe criadora declara o método fábrica que deve retornar
// um objeto de uma classe produto. As subclasses da criadora
// geralmente fornecem a implementação desse método.
abstract class Dialog {
    // A criadora também pode fornecer alguma implementação
    // padrão do Factory Method.
    abstract Button createButton();

    // Observe que, apesar do seu nome, a principal
    // responsabilidade da criadora não é criar produtos. Ela
    // geralmente contém alguma lógica de negócio central que
    // depende dos objetos produto retornados pelo método
    // fábrica. As subclasses pode mudar indiretamente essa
    // lógica de negócio ao sobrescreverem o método fábrica e
    // retornarem um tipo diferente de produto dele.
    void render() {
        // Chame o método fábrica para criar um objeto produto.
        Button okButton = createButton();
        // Agora use o produto.
        okButton.onClick("closeDialog");
        okButton.render("paramA", "paramB");
    }
}

class ConfigFile {

    private final String OS = "Windows";

    public String OS() {
        return this.OS;
    }
}

// Criadores concretos sobrescrevem o método fábrica para mudar
// o tipo de produto resultante.
class WindowsDialog extends Dialog {
    Button createButton() {
        return new WindowsButton();
    }
}

class WebDialog extends Dialog {
    Button createButton() {
        return new HTMLButton();
    }
}

// A interface do produto declara as operações que todos os
// produtos concretos devem implementar.
interface Button {
    void render(String a, String b);
    void onClick(String f);
}

// Produtos concretos fornecem várias implementações da
// interface do produto.
class WindowsButton implements Button {

    @Override
    public void render(String a, String b) {
        System.out.println("Renderiza um botão no estilo Windows.");
    }

    @Override
    public void onClick(String f) {
        System.out.println("Vincula um evento de clique do SO nativo.");
    }
}

// Vincula um evento de clique do SO nativo.
class HTMLButton implements Button {

    @Override
    public void render(String a, String b) {
        System.out.println("Retorna uma representação HTML de um botão.");

    }

    @Override
    public void onClick(String f) {
        System.out.println("Vincula um evento de clique no navegador web.");
    }
}
