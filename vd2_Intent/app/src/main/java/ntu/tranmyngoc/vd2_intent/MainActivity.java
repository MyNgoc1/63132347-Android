package ntu.tranmyngoc.vd2_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
    //ham dap ung su kien Onclick len nut "mo man hinh nhap lieu"
    public void NhapLieu(View v){
        //tao 1 Intent
        Intent iNhap =new Intent(this,NhapLieuActivity.class);
        //Chuyen sang man hinh nhap lieu
        //nhung co do ket qua tra ve, ma cua yeu cau nay ta dat la 8000 chang han
        //noinspection deprecation
        startActivityForResult(iNhap,8000);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode==8000)
            if(resultCode==RESULT_OK){
                //lay dl gui ve
                //o day ta chu y dl dc gui ve teo cap
                //ta boc dl ra theo key
                String hotenNhanDuoc = data.getStringExtra("HT"); //HT la key ta dat o nhaplieu
                int namsinhNhanDuoc= data.getIntExtra("NS",2020);
                //dua len dieu khien ta muon hien ket qua nhan duoc
                TextView tvHT = (TextView)findViewById(R.id.tvHoTen);
                TextView tvNS = (TextView)findViewById(R.id.tvNamSinh);
                tvHT.setText(hotenNhanDuoc);
                tvNS.setText(String.valueOf(namsinhNhanDuoc));
            }
        else
                Toast.makeText(this,"Tra ve that bai",Toast.LENGTH_SHORT);
        else
            super.onActivityResult(requestCode, resultCode, data);
    }
}