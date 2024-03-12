package ntu.edu.appcong;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // gan layout tuong ung voi file nay
        setContentView(R.layout.activity_main);
    }
    //bo lang nghe va xu li nut click tinh tong
    public  void XuLyCong(View view){
        //tim tham chieu den du khien tren xml
        View editTextsoA =          findViewById(R.id.edtA);
        View editTextsoB =          findViewById(R.id.edtB);
        View editTextsoketqua =          findViewById(R.id.edtkq);
        //lay du lieu ve o dieu khien so a
        string strA= editTextsoA.gettext().toString();
        //lay du lieu ve o dieu khien so b
        string strB= editTextsoB.gettext().toString();

        // chuyen du lieu sang dang sô
           int so_A=    Integer.parseInt(strA);
           int so_B=    Integer.parseInt(strB);
        //tinh toan theo yeu cau
            int tong =  so_A + so_B;
            String strtong = String.valueOf(tong);
        //Hien ra man hinh
        editTextketqua.setText(strtong);

    }
}