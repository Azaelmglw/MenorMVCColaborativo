/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views. ViewMenorColaborativo;
import models. ModelMenorColaborativo;
import controllers. ControllerMenorColaborativo;

public class Main {
    
/**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        ModelMenorColaborativo models_mayor = new ModelMenorColaborativo();
        ViewMenorColaborativo view_mayor = new ViewMenorColaborativo();
        ControllerMenorColaborativo ControllerMenorColaborativo = new ControllerMenorColaborativo(model_menor_colaborativo, View_Menor_Colaborativo  );
}
}
