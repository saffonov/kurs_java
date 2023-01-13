import java.util.HashSet;
import java.util.Objects;

public class Notebooks {
    private String firma; // фирма производитель
    private String model; // модель ноутбука
    private Integer years; // год производства
    private String processor; // тип процессора
    private Integer ram; // обем озув ГБайт
    private Integer weight; // вес Кг
    private String color; //цвет
    private Integer cost; // цена руб
    private Integer warranty; // гарантия год

    public Notebooks (String firma,  String model, Integer years, String processor, Integer ram, Integer weight,
                      String color, Integer cost, Integer warranty) {
        this.firma = firma;             // фирма производитель
        this.model = model;             // модель ноутбука
        this.years = years;             // год производства
        this.processor = processor;     // тип процессора
        this.ram = ram;                 // обем озув ГБайт
        this.weight = weight;           // вес Кг
        this.color = color;            //цвет
        this.cost = cost;               // цена руб
        this.warranty = warranty;       // гарантия год
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, processor, ram, cost, color);
    }

    @Override
    public String toString() {
        return "Notebook {" +
                "firma= " + firma +
                ", model= " + model +
                ", years= " + years +
                ", processor= " + processor +
                ", ram= " + ram +
                ", weight= " + weight +
                ", color= " + color +
                ", warranty= " + warranty +
                ", cost = " + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebooks notebook = (Notebooks) o;

        boolean similarNotebook = (notebook.firma == firma || notebook.firma == "") &&
                        (notebook.model == model || notebook.model == "") &&
                        (notebook.years <= years || notebook.years == 0) &&
                        (notebook.processor == processor || notebook.processor == "") &&
                        (notebook.ram <= ram || notebook.ram == 0) &&
                        (notebook.weight >= weight || notebook.weight == 0) &&
                        (notebook.color == color ||notebook.processor == "") &&
                        (notebook.cost >= cost || notebook.cost == 0) &&
                        (notebook.warranty <= warranty || notebook.warranty == 0);
//        System.out.println(notebook.firma);
        return similarNotebook;
    }
    public String getFirma() {
        return firma;
    }

    public String getModel() {
        return model;
    }

    public Integer getYears() {
        return years;
    }

    public String getProcessor() {
        return processor;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getWarranty() {
        return warranty;
    }
}
