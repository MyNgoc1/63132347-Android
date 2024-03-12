package ntu.NT21.vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ///khai bao
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextSokq;
    Button nutCong, nutTru, nutNhan, nutChia;

    void TimDieuKhien(){
        EditText editTextSo1=(EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2=(EditText)findViewById(R.id.edtSo2);
        EditText editTextkq=(EditText)findViewById(R.id.edtkq);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        View.OnClickListener bolangnghecong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //xu ly cong o day
                String sothu1 = editTextSo1.getText().toString();
                String sothu2 = editTextSo1.getText().toString();
                float soA = Float.parseFloat(sothu1);
                float soB = Float.parseFloat(sothu2);

                float Cong= soA - soB;
                string chuoikq = String.valueOf(Cong);
                editTextkq.setText(chuoikq);
            }
        };
        nutCong.setOnClickListener(bolangnghecong);
        nutTru.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //xu ly o day
                String sothu1 = editTextSo1.getText().toString();
                String sothu2 = editTextSo1.getText().toString();
                float soA = Float.parseFloat(sothu1);
                float soB = Float.parseFloat(sothu2);

                float Tru= soA - soB;
                string chuoikq = String.valueOf(Tru);
                editTextkq.setText(chuoikq);
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //xu ly o day
                String sothu1 = editTextSo1.getText().toString();
                String sothu2 = editTextSo1.getText().toString();
                float soA = Float.parseFloat(sothu1);
                float soB = Float.parseFloat(sothu2);

                float Nhan= soA * soB;
                string chuoikq = String.valueOf(Nhan);
                editTextkq.setText(chuoikq);
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //xu ly o day
                String sothu1 = editTextSo1.getText().toString();
                String sothu2 = editTextSo1.getText().toString();
                float soA = Float.parseFloat(sothu1);
                float soB = Float.parseFloat(sothu2);

                float Chia= soA / soB;
                string chuoikq = String.valueOf(Chia);
                editTextkq.setText(chuoikq);
            }
        });
}