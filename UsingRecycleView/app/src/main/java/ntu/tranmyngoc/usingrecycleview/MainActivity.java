package ntu.tranmyngoc.usingrecycleview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    landScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recylerViewData;
    RecyclerView recyclerViewLandscape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //3
        recylerViewData= getDataForRecyclerView();
        //4
        recyclerViewLandscape = findViewById(R.id.recyclerland);
        //5
        //RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        //recyclerViewLandscape.setLayoutManager(layoutLinear);
        //RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        //recyclerViewLandscape.setLayoutManager(layoutLinearHorizonal);
        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 2);
        recyclerViewLandscape.setLayoutManager(layoutGrid);

        //6
        landScapeAdapter = new landScapeAdapter(this,recylerViewData);
        //7
        recyclerViewLandscape.setAdapter(landScapeAdapter);
    }


    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("CotcoHaNoi","Cot co HN");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("eiffel","Thap Eiffel"));
        dsDuLieu.add(new LandScape("c1","anh meo"));
        return dsDuLieu;
    }
}