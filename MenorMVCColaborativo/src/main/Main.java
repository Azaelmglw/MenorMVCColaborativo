
package main;
import views. ViewMenorColaborativo;
import models. ModelMenorColaborativo;
import controllers. ControllerMenorColaborativo;

public class Main {

    public static void main(String[] args) {
        ModelMenorColaborativo model_menor_colaborativo = new ModelMenorColaborativo();
        ViewMenorColaborativo view_menor_colaborativo = new ViewMenorColaborativo();
        ControllerMenorColaborativo controller_menor_colaborativo = new ControllerMenorColaborativo(view_menor_colaborativo, model_menor_colaborativo);
}
}
