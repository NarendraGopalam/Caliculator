package ca.narendragopalam.caliculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /* a and b are first and second values that are used for caliculations
    * arithmetic contains +,-/,*,% etc
    * result is the final output */
    private String a="";
    private String b="";
    private String arithmetic="";
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(TextView) findViewById(R.id.result);
        /*button zero adds zero to a if the arthmetic is null or empty */
        Button zero = (Button) findViewById(R.id.button_0);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==arithmetic||"".equals(arithmetic)) {
                 a=a+"0";
                    result.setText(a);
                }
                else {
                    b=b+"0";
                    result.setText(a + arithmetic + b );
                }
            }
        });

        Button one = (Button) findViewById(R.id.button_1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==arithmetic||"".equals(arithmetic)){
                    a=a+"1";
                    result.setText(a);
                }
                else {
                    b = b + "1";
                    result.setText(a + arithmetic + b );
                }
            }
        });

        Button two = (Button) findViewById(R.id.button_2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==arithmetic||"".equals(arithmetic)){
                    a=a+"2";
                    result.setText(a);
                }
                else {
                    b = b + "2";
                    result.setText(a + arithmetic + b );
                }
            }
        });
        Button three = (Button) findViewById(R.id.button_3);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==arithmetic||"".equals(arithmetic)){
                    a=a+"3";
                    result.setText(a);
                }
                else {
                    b = b + "3";
                    result.setText(a + arithmetic + b );
                }
            }
        });
        Button four = (Button) findViewById(R.id.button_4);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==arithmetic||"".equals(arithmetic)){
                    a=a+"4";
                    result.setText(a);
                }
                else {
                    b = b + "4";
                    result.setText(a + arithmetic + b );
                }
            }
        });
        Button five = (Button) findViewById(R.id.button_5);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==arithmetic||"".equals(arithmetic)){
                    a=a+"5";
                    result.setText(a);
                }
                else {
                    b = b + "5";
                    result.setText(a + arithmetic + b );
                }
            }
        });
        Button six = (Button) findViewById(R.id.button_6);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==arithmetic||"".equals(arithmetic)){
                    a=a+"6";
                    result.setText(a);
                }
                else {
                    b = b + "6";
                    result.setText(a + arithmetic + b );
                }
            }
        });
        Button seven = (Button) findViewById(R.id.button_7);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==arithmetic||"".equals(arithmetic)) {
                    a = a + "7";
                    result.setText(a);
                }
                else{
                        b = b + "7";
                    result.setText(a + arithmetic + b );
                    }
            }
        });
        Button eight = (Button) findViewById(R.id.button_8);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==arithmetic||"".equals(arithmetic)) {
                    a = a + "8";
                    result.setText(a);
                }
                else{
                        b = b + "8";
                    result.setText(a + arithmetic + b );
                    }
            }
        });
        Button nine = (Button) findViewById(R.id.button_9);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==arithmetic||"".equals(arithmetic)) {
                    a = a + "9";
                    result.setText(a);
                }
                else {
                    b = b + "9";
                    result.setText(a + arithmetic + b );
                }
            }
        });
/* dot is added only once for a or b as it will represent the decimal*/
        Button dot = (Button) findViewById(R.id.button_dot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(null==arithmetic||"".equals(arithmetic)) {
                    if(!a.contains("."))
                    a = a + ".";
                    result.setText(a);
                }
                else {
                    if(!b.contains("."))
                    b = b + ".";
                    result.setText(a + arithmetic + b );
                }
            }
        });
/*clear will clear all the values of a.b.arthmatic and sets result to zero*/
        Button clear = (Button) findViewById(R.id.button_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arithmetic="";
                a="";
                b="";
                result.setText("0");
            }
        });
/*addition ,subtraction multiplicain and division will update the value of arthmetic */
        Button addition = (Button) findViewById(R.id.button_add);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arithmetic="+";

                if(null!=b&&!"".equals(b))
                    ;
                else
                    result.setText(a+"+");
            }
        });

        Button subtraction = (Button) findViewById(R.id.button_subtraction);
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arithmetic="-";
                if(null!=b&&!"".equals(b))
                    ;
                else
                result.setText(a+"-");
            }
        });

        Button multiplication = (Button) findViewById(R.id.button_multiplication);
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arithmetic="*";
                if(null!=b&&!"".equals(b))
                    ;
                else
                result.setText(a+"*");
            }
        });

        Button division = (Button) findViewById(R.id.button_divide);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arithmetic="/";
                if(null!=b&&!"".equals(b))
                    ;
                else
                result.setText(a+"/");
            }
        });

        Button reminder = (Button) findViewById(R.id.button_reminder);
        reminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arithmetic="%";
                if(null!=b&&!"".equals(b))
                    ;
                else
                result.setText(a+"%");
            }
        });
/*button enter is the final button for our output here we caliculate the final result*/
        Button enter = (Button) findViewById(R.id.button_enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result_val=0;
                /*checking whether arthmatic is updated or not*/
                if(null!=arithmetic&&!"".equals(arithmetic))
                {
                    if(null!=b&&!"".equals(b))
                    {

                        double a_val= Double.parseDouble(a);
                        double b_val= Double.parseDouble(b);
                        /*caliculations are done here*/
                        if(arithmetic.equals("+"))
                            result_val=a_val +b_val;
                        if(arithmetic.equals("-"))
                            result_val=a_val-b_val;
                        if(arithmetic.equals("*"))
                            result_val=a_val*b_val;
                        if(arithmetic.equals("/"))
                            result_val=a_val/b_val;
                        if(arithmetic.equals("%"))
                            result_val=a_val%b_val;

                        String final_result=""+ result_val;
                        if(final_result.equals(""))
                            result.setText("0");
                        else
                            result.setText(final_result);
                    }
                    else
                        result.setText(a);
                }
                else {
                    if(null!=a&&!"".equals(a))
                    result.setText(a);
                    else
                        result.setText("0");
                }

            }
        });

    }


}