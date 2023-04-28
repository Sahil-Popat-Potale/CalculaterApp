package sahil.popat.calculaterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText1, editText2;
    Button btn1, btn2, btn3, btn4, btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        allocate();
        sum();
        sub();
        mul();
        div();
        module();
    }
    private void allocate() {
        textView=findViewById(R.id.textView3);
        editText1=findViewById(R.id.input1);
        editText2=findViewById(R.id.input2);
        btn1=findViewById(R.id.b1);
        btn2=findViewById(R.id.b2);
        btn3=findViewById(R.id.b3);
        btn4=findViewById(R.id.b4);
        btn5=findViewById(R.id.b5);
    }
    private void sum() { btn1.setOnClickListener(v -> {
        int a=Integer.parseInt(editText1.getText().toString());
        int b=Integer.parseInt(editText2.getText().toString());
        int c=a+b;
        textView.setText("Addition  "+c);
    });}
    private void sub() { btn2.setOnClickListener(v -> {
        int a=Integer.parseInt(editText1.getText().toString());
        int b=Integer.parseInt(editText2.getText().toString());
        int c=a-b;
        textView.setText("Subtraction  "+c);
    });}
    private void mul() {btn3.setOnClickListener(v -> {
        int a=Integer.parseInt(editText1.getText().toString());
        int b=Integer.parseInt(editText2.getText().toString());
        int c=a*b;
        textView.setText("Multiplication  "+c);
    });}
    private void div() {btn4.setOnClickListener(v -> {
        float a=Integer.parseInt(editText1.getText().toString());
        float b=Integer.parseInt(editText2.getText().toString());
        float c=a/b;
        textView.setText("Division  "+c);
    });}
    private void module() {btn5.setOnClickListener(v -> {
        float a=Integer.parseInt(editText1.getText().toString());
        float b=Integer.parseInt(editText2.getText().toString());
        float c=a%b;
        textView.setText("Module  "+c);
    });
    }
}