package controllers;

import views.*;
import models.*;
/**
 *
 * @author Azael_Mendoza
 */
public class ControllerMenorColaborativo {
    ViewMenorColaborativo view_menor_colaborativo;
    ModelMenorColaborativo model_menor_colaborativo;
    
    public ControllerMenorColaborativo(ViewMenorColaborativo view_menor_colaborativo, ModelMenorColaborativo model_menor_colaborativo){
    this.view_menor_colaborativo = view_menor_colaborativo;
    this.model_menor_colaborativo = model_menor_colaborativo;
    initView();
}
    
    public void initView(){
        view_menor_colaborativo.setTitle("Menor MVC Colaborativo");
        view_menor_colaborativo.jbtn_calcular.addActionListener(e -> jbtn_calcularMouseClicked());
        view_menor_colaborativo.jtf_numero_1.setText( "" + model_menor_colaborativo.getNumero_1());
        view_menor_colaborativo.jtf_numero_2.setText( "" + model_menor_colaborativo.getNumero_2());
        view_menor_colaborativo.jtf_numero_3.setText( "" + model_menor_colaborativo.getNumero_3());
        view_menor_colaborativo.jtf_menor.setText( "" + model_menor_colaborativo.getNumero_Menor());
        view_menor_colaborativo.setLocationRelativeTo(null);
        view_menor_colaborativo.setVisible(true);
    }
    
    public void jbtn_calcularMouseClicked(){
        model_menor_colaborativo.setNumero_1(Integer.parseInt(view_menor_colaborativo.jtf_numero_1.getText()));
        model_menor_colaborativo.setNumero_2(Integer.parseInt(view_menor_colaborativo.jtf_numero_2.getText()));
        model_menor_colaborativo.setNumero_3(Integer.parseInt(view_menor_colaborativo.jtf_numero_3.getText()));
        model_menor_colaborativo.CalcularMenor();
        view_menor_colaborativo.jtf_menor.setText("" + model_menor_colaborativo.getNumero_Menor());
    }
}
