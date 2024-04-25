package ntu.tranmyngoc.simpleexplicititent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class SubActivityOne extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }
    //ham dap ung su kien nhan len nut quay ve trang chu
    //Xu ly chuyen ve man hinh trang chu
    public void QuayVe(View v){
        //tao 1 doi tuong Intent
        //Tham so thu 2 cua ham tao nay, la ten Activity ( man hinh) ta muon chuyen sang
        Intent iManHinhChinh = new Intent(this,MainActivity.class);
        //thuc hien chuyen
        startActivity(iManHinhChinh);
    }
}
