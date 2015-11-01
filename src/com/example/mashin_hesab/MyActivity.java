package com.example.mashin_hesab;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */


    private String am="";
    private Float n1;
    private Float n2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        final EditText txt=(EditText) findViewById(R.id.etxt);
        final TextView view=(TextView)findViewById(R.id.txtv);

        Button btn0=(Button) findViewById(R.id.btn0);
        Button btn1=(Button) findViewById(R.id.btn1);
        Button btn2=(Button) findViewById(R.id.btn2);
        Button btn3=(Button) findViewById(R.id.btn3);
        Button btn4=(Button) findViewById(R.id.btn4);
        Button btn5=(Button) findViewById(R.id.btn5);
        Button btn6=(Button) findViewById(R.id.btn6);
        Button btn7=(Button) findViewById(R.id.btn7);
        Button btn8=(Button) findViewById(R.id.btn8);
        Button btn9=(Button) findViewById(R.id.btn9);
        Button btnc=(Button) findViewById(R.id.btnc);
        Button btnt=(Button) findViewById(R.id.btnt);
        Button btnz=(Button) findViewById(R.id.btnz);
        Button btnj=(Button) findViewById(R.id.btnj);
        Button btnm=(Button) findViewById(R.id.btnm);
        Button btnmm=(Button) findViewById(R.id.btnmm);
        final Button btnsum=(Button) findViewById(R.id.btnsum);



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "0");

            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "3");
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "4");
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "6");
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "7");
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "8");
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + "9");
            }
        });

        btnmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txt.getText().toString();
                txt.setText(s + ".");
            }
        });





        btnz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(n1 == null) {
                    n1 = Float.parseFloat(txt.getText().toString());
                    am = "*";
                    view.setText(n1.toString() + "*");
                    txt.setText("");
                    }
                else
                {
                    float n3 = 0;
                    if(am!="")
                        if(am=="+") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 += n3;
                            txt.setText("");
                        }
                        else
                        if(am=="-") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 -= n3;
                            txt.setText("");
                        }
                        else
                        if(am=="*") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 *= n3;
                            txt.setText("");
                        }
                        else
                        if(am=="/") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 /= n3;
                            txt.setText("");
                        }
                    am = "*";
                    view.setText(view.getText().toString()+ n3 + "*");
                    txt.setText("");
                }
            }
        });


        btnj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(n1 == null) {
                    n1 = Float.parseFloat(txt.getText().toString());
                    am = "+";
                    view.setText(n1.toString() + "+");
                    txt.setText("");
                }
                else{
                    float n3=0;
                    if(am!="")
                        if(am=="+") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 += n3;
                            txt.setText("");
                        }
                        else
                        if(am=="-") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 -= n3;
                            txt.setText("");
                        }
                        else
                        if(am=="*") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 *= n3;
                            txt.setText("");
                        }
                        else
                        if(am=="/") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 /= n3;
                            txt.setText("");
                        }
                    am = "+";
                    view.setText(view.getText().toString()+n3+ "+");
                    txt.setText("");
                }
            }
        });


        btnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1 == null) {
                    n1 = Float.parseFloat(txt.getText().toString());
                    am = "/";
                    view.setText(n1.toString() + "/");
                    txt.setText("");
                }
                else {
                    float n3=0;
                    if(am!="")
                        if(am=="+") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 += n3;
                            txt.setText("");
                        }
                        else
                        if(am=="-") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 -= n3;
                            txt.setText("");
                        }
                        else
                        if(am=="*") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 *= n3;
                            txt.setText("");
                        }
                        else
                        if(am=="/") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 /= n3;
                            txt.setText("");
                        }
                    am = "/";
                    view.setText(view.getText().toString()+n3+ "/");
                    txt.setText("");
                }
            }
        });


        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1 == null) {
                    n1 = Float.parseFloat(txt.getText().toString());
                    am = "-";
                    view.setText(n1.toString() + "-");
                    txt.setText("");
                }else{
                    float n3=0;
                    if(am!="")
                        if(am=="+") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 += n3;
                            txt.setText("");
                        }
                        else
                        if(am=="-") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 -= n3;
                            txt.setText("");
                        }
                        else
                        if(am=="*") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 *= n3;
                            txt.setText("");
                        }
                        else
                        if(am=="/") {
                            n3 = Float.parseFloat(txt.getText().toString());
                            n1 /= n3;
                            txt.setText("");
                        }
                    am = "-";
                    view.setText(view.getText().toString()+n3+ "-");
                    txt.setText("");
                }
            }
        });



        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
                view.setText("");
                am = "0";
                n1 = null;
                n2 = null;
            }
        });

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2 = Float.parseFloat(txt.getText().toString());
                Float result;

                switch (am)
                {
                    case "*":
                        if(n2 == null){
                            result = n1;
                        }
                        else {
                            result = n1 * n2;
                        }
                        String s4,t4;
                        s4 = view.getText().toString();
                        t4 = txt.getText().toString();
                        if(t4 == "")
                        {
                            txt.setText(s4 + "=" + result.toString());

                        }else {
                            txt.setText(s4 + n2 + "=" + result.toString());
                        }
                        view.setText("");
                        am = "0";
                        n1 = null;
                        n2 = null;
                        break;


                    case "/":
                        if(n2 == null){
                            result = n1;
                        }
                        else {
                            result = n1 / n2;
                        }
                        String s3,t3;
                        s3 = view.getText().toString();
                        t3 = txt.getText().toString();
                        if(t3 == "")
                        {
                            txt.setText(s3 + "=" + result.toString());

                        }else {
                            txt.setText(s3 + n2 + "=" + result.toString());
                        }
                        view.setText("");
                        am = "0";
                        n1 = null;
                        n2 = null;
                        break;


                    case "-":
                        if(n2 == null){
                            result = n1;
                        }
                        else {
                            result = n1 - n2;
                        }
                        String s2,t2;
                        s2 = view.getText().toString();
                        t2 = txt.getText().toString();
                        if(t2 == "")
                        {
                            txt.setText(s2 + "=" + result.toString());

                        }else {
                            txt.setText(s2 + n2 + "=" + result.toString());
                        }
                        view.setText("");
                        am = "0";
                        n1 = null;
                        n2 = null;
                        break;

                    case "0":
                        Toast.makeText(getApplication(), "error", Toast.LENGTH_LONG).show();
                        txt.setText("");
                        break;


                    case "+":
                        if(n2 == null){
                            result = n1;
                        }
                        else {
                            result = n1 + n2;
                        }
                        String s,t;
                        s = view.getText().toString();
                        t = txt.getText().toString();
                        if(t == "")
                        {
                            txt.setText(s + "=" + result.toString());

                        }else {
                            txt.setText(s + n2 + "=" + result.toString());
                        }
                        view.setText("");
                        s = "0";
                        n1 = null;
                        n2 = null;
                        break;


                    default:
                        break;
                }
            }
        });



    }
}
