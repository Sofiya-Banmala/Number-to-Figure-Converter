package com.sofia.numbertofigureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etxt;
    private Integer num;
    private String[] ones=
            {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
                    "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen",
                    "Nineteen"};
    private String[] tens=
            {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxt=findViewById(R.id.edtxt);
        tv=findViewById(R.id.txtv);
        btn=findViewById(R.id.butn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=Integer.parseInt(etxt.getText().toString());
                if (num<20){
                    tv.setText(ones[num]);
                    Toast.makeText(MainActivity.this, ones[num], Toast.LENGTH_SHORT).show();
                }
                else if (num<100){
                    int num1=num/10;
                    int num2=num%10;
                    if (num2==0){
                        tv.setText(tens[num1]);
                        Toast.makeText(MainActivity.this, tens[num1], Toast.LENGTH_SHORT).show();
                    }
                    else{
                        tv.setText(tens[num1]+ " " +ones[num2]);
                        Toast.makeText(MainActivity.this, tens[num1]+ " " +ones[num2],
                                Toast.LENGTH_SHORT).show();
                    }
                }
                else if (num<1000){
                    int num5=num/100;
                    int num6=num%100;
                    int num1=num6/10;
                    int num2=num6%10;
                    if (num6==0){
                        tv.setText(ones[num5]+ " Hundred " + tens[num1]);
                        Toast.makeText(MainActivity.this,ones[num5]+ " Hundred " + tens[num1],
                                Toast.LENGTH_SHORT).show();
                    }
                    else{
                        if (num2==0){
                            tv.setText(ones[num5]+ " Hundred " + tens[num1]);
                            Toast.makeText(MainActivity.this, ones[num5]+ " Hundred " + tens[num1],
                                    Toast.LENGTH_SHORT).show();
                        }
                        else{
                            tv.setText(ones[num5]+ " Hundred " + tens[num1] + " " +ones[num2]);
                            Toast.makeText(MainActivity.this, ones[num5]+ " Hundred " + tens[num1] + " " +ones[num2],
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
    }
}
