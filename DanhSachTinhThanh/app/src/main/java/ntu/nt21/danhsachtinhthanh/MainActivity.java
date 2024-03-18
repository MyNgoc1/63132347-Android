package ntu.nt21.danhsachtinhthanh;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hien thi dl listview
        //B1+: can co dl
        //tu co so dl(sql,nosql, XML,...)
        //hard-code dl truc tiep
        //can bien phu hop chua dl
        ArrayList<String> dsTenTinhThanhVN; //khai bao
        dsTenTinhThanhVN = new ArrayList<String>(); //xin moi
        //them dl (dung ra phai doc dl tu 1 nguon)
        //nhung ta hard-code(cho san de demo)
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");
        //b2. Tao adapter
        ArrayAdapter<string> adapterTinhThanh;
        adapterTinhThanh =new ArrayAdapter<string>(context: this, android.R.layout.simple_list_item_1,dsTenTinhThanhVN)
        //B3:Gan vao dieu khien hien thi listview
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        lvTenTinhThanh.setAdapter(adapterTinhThanh);

    }



}