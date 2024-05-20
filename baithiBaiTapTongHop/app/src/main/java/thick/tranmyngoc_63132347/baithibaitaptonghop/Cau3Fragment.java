package thick.tranmyngoc_63132347.baithibaitaptonghop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Cau3Fragment extends Fragment {

    //khai bao
    landScapeAdapter adapter;
    ArrayList<LandScape> list;

    RecyclerView recyclerViewLandScape;


    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //chuan bi dl
        list.add(new LandScape("CotcoHaNoi","Cot co HN"));
        list.add(new LandScape("Thap Eiffel","Eiffel"));
        list.add(new LandScape("cungdienBookingham","bookingham"));
        list.add(new LandScape("Tuong nu than tu do","Nuthantudo"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewCau3 =inflater.inflate(R.layout.fragment_cau3, container, false);
        recyclerViewLandScape= viewCau3.findViewById(R.id.ryCau3);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        adapter = new landScapeAdapter(viewCau3.getContext(),list);

        recyclerViewLandScape.setAdapter(adapter);

        return viewCau3;
    }
}