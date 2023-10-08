package com.example.equationseconddegre;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.equationseconddegre.databinding.ActivityMainBinding;

public class MyEquation extends BaseObservable {

    String a;
    String b;
    String c;

    ActivityMainBinding activityMainBinding;

    public MyEquation(ActivityMainBinding activityMainBinding) {
        this.activityMainBinding = activityMainBinding;
    }
    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public MyEquation() {
    }


    public void deltaValue(View view){
        int a = Integer.parseInt(getA());
        int b = Integer.parseInt(getB());
        int c = Integer.parseInt(getC());

        int d = a*a - (4*a*c);
        double x1,x2;

        if (d>0){
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);

            activityMainBinding.textViewSolution.setText("X1= "+x1+ "X2= "+x2);
        } else if (d<0) {
            activityMainBinding.textViewSolution.setText("No real solutions");
        }else {
            x1 = -b / (2 * a);
            activityMainBinding.textViewSolution.setText("X1= "+x1);
        }
    }
}
