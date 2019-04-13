package com.sofia.numbertofigureconverter;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class Number_Word {
    private EditText etxt;
    private Integer num;
    private String[] ones;
    private String[] tens;
    private Button btn;
    private TextView tv;

    public Number_Word(EditText etxt, Integer num, String[] ones, String[] tens, Button btn, TextView tv) {
        this.etxt = etxt;
        this.num = num;
        this.ones = ones;
        this.tens = tens;
        this.btn = btn;
        this.tv = tv;
    }

    public EditText getEtxt() {
        return etxt;
    }

    public void setEtxt(EditText etxt) {
        this.etxt = etxt;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String[] getOnes() {
        return ones;
    }

    public void setOnes(String[] ones) {
        this.ones = ones;
    }

    public String[] getTens() {
        return tens;
    }

    public void setTens(String[] tens) {
        this.tens = tens;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    public TextView getTv() {
        return tv;
    }

    public void setTv(TextView tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        return "Number_Word{" +
                "etxt=" + etxt +
                ", num=" + num +
                ", ones=" + Arrays.toString(ones) +
                ", tens=" + Arrays.toString(tens) +
                ", btn=" + btn +
                ", tv=" + tv +
                '}';
    }
}
