package ru.kuznetsovka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String numberOne = "";
    String numberTwo = "";
    String operand = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inputNumber (View view) {
TextView result = findViewById(R.id.tv_result_label);

if (operand.isEmpty()) {

    String text = ((Button) view).getText().toString();
    numberOne += text;
    result.setText(numberOne);

}else {
    String text = ((Button) view).getText().toString();
    numberTwo += text;
    result.setText(numberTwo);

}

    }

    public void clearAction (View view) {
TextView result = findViewById(R.id.tv_result_label);
numberOne = "";
numberTwo = "";
operand = "";
result.setText("0");
    }

    public void inputOperand (View view) {
        if (operand.isEmpty()) {
            String text = ((Button) view).getText().toString();
            operand = text;
            TextView resultlabel = findViewById(R.id.tv_result);

        }

    }

    public void resultAction (View view) {
        Double result = null;
        TextView resultlabel = findViewById(R.id.tv_result);
        switch (operand) {
            case "/":
                Double resDel = Double.parseDouble(number_one) / Double.parseDouble(number_two);
                result = resDel;
                break;
            case "*":
                Double resUmn = Double.parseDouble(number_one) * Double.parseDouble(number_two);
                result = resUmn;
                break;
            case "/":
                Double resSum = Double.parseDouble(number_one) + Double.parseDouble(number_two);
                result = resSum;
                break;
            case "-":
                Double resMin = Double.parseDouble(number_one) - Double.parseDouble(number_two);
                result = resMin;
                break;
            default:
                break;
        }
        resultlabel.setText(result.toString());
    }
}