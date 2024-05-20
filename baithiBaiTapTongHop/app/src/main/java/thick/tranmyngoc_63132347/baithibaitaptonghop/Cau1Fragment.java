package thick.tranmyngoc_63132347.baithibaitaptonghop;

import static thick.tranmyngoc_63132347.baithibaitaptonghop.R.id.editSoMet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cau1Fragment extends Fragment {
    EditText editText_MET;
    EditText editText_KiLoMet;
    Button btnChuyen;


    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewCau1 = inflater.inflate(R.layout.fragment_cau1, container, false);
        //tim dieu khien trong nay
        editText_MET = viewCau1.findViewById(R.id.editSoMet);
        editText_KiLoMet = viewCau1.findViewById(R.id.editsokilo);
        btnChuyen = viewCau1.findViewById(R.id.btnDoi);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duLieuMet= editText_MET.getText().toString();
                String duLieuKilomet= editText_KiLoMet.getText().toString();
                if(duLieuMet.isEmpty()){
                    Toast.makeText(viewCau1.getContext(),"m->km", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(viewCau1.getContext(),"km->m", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return viewCau1;
    }
}