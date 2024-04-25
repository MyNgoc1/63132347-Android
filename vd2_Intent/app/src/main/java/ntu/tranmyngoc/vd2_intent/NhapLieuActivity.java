package ntu.tranmyngoc.vd2_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NhapLieuActivity extends AppCompatActivity {
    protected void onCreat(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinhnhaplieu);
    }
    public void Nhap_QuayVe(View v){
        EditText edHT = (EditText)findViewById(R.id.edHoten);
        EditText edNS = (EditText)findViewById(R.id.edNamSinh);
        //Lấy dữ liệu
        String hoten = edHT.getText().toString();
        int namsinh = Integer.parseInt(edNS.getText().toString());
        //Tạo mới Intent
        Intent iKQnhapLieu = new Intent();
        //đưa dữ liệu vào Intent để gửi về
        //Dữ liệu được dưa vaào ở dạng KEY
        iKQnhapLieu.putExtra("HT",hoten);
        iKQnhapLieu.putExtra("NS",namsinh);
        //Gửi kết quả ề cho Activity đã goị nó
        setResult(RESULT_OK, iKQnhapLieu);
        //đóng activity nhập dữ liệu
        finish();
    }
}

