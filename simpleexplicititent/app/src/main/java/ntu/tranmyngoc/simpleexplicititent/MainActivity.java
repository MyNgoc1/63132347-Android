package ntu.tranmyngoc.simpleexplicititent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //ham dap ung su kien nhan len nut"sang man hinh"
    //xu li chuyen man hinh
    public void  ChuyenManHinh(View v){
        //Tao 1 doi tuong Internet
        //Tham so thu 2 cua ham tao nay,la ten Activity ( man hinh) ta muon chuyen sang
        Intent iManHinhKhac = new Intent(this,SubActivityOne.class);
        startActivity(iManHinhKhac);
    }
}