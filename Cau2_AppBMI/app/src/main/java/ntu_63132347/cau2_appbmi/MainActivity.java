package ntu_63132347.cau2_appbmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText etChieuCao, etCanNang;
    RadioButton rbNam, rbNu;
    Button btnTinhBMI;
    TextView txtChiSo,txtNhanXet;
    double chiSo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etChieuCao= findViewById(R.id.et_chieucao);
        etCanNang= findViewById(R.id.et_cannang);
        rbNam= findViewById(R.id.rb_nam);
        rbNu= findViewById(R.id.rb_nữ);
        btnTinhBMI= findViewById(R.id.btn_tinh);
        txtChiSo= findViewById(R.id.txt_ketqua);
        txtNhanXet= findViewById(R.id.txt_nhanxet);
        btnTinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double chieuCao= Double.parseDouble(etChieuCao.getText().toString()) /100;
                double canNang= Double.parseDouble(etCanNang.getText().toString());
                chiSo= Math.round((canNang/Math.pow(chieuCao,2))*10.0)/10.0;
                if(rbNam.isChecked()) {
                    if (chiSo < 18.5) {
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");

                    } else if (chiSo >= 18.5 && chiSo <= 24.9) {
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Chỉ số BMI của bạn bình thường");

                    } else if (chiSo == 25) {
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn bị thừa cân");

                    } else if (chiSo > 25 && chiSo <= 29.9) {
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn sắp bị beo phì(béo phì mức thấp)");
                    } else if (chiSo >= 30 && chiSo <= 34.9) {
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang bị béo phì(béo phì giai đoạn 1)");

                    } else if (chiSo >= 35 && chiSo <= 39.9) {
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang bị béo phì(béo phì giai đoạn 2)");

                    } else if (chiSo == 40) {
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang bị béo phì(béo phì giai đoạn 3)");

                    }
                }
                else if (rbNu.isChecked()){
                    if(chiSo < 18.5){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm dinh dưỡng");

                    }
                    else if(chiSo >= 18.5 && chiSo <= 22.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Chỉ số BMI của bạn bình thường");

                    }
                    else if(chiSo == 23){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn bị thừa cân");

                    }
                    else if(chiSo > 23 && chiSo <=24.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn sap bị beo phì(béo phì mức thấp)");

                    }
                    else if(chiSo >=25 && chiSo <=29.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang bị béo phì(béo phì giai đoạn 1)");

                    }
                    else if(chiSo >=30 && chiSo<= 39.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang bị béo phì(béo phì giai đoạn 2)");

                    }
                    else if(chiSo == 40){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang bị béo phì(béo phì giai đoạn 3)");

                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "Hãy chọn giới tính của bạn",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}