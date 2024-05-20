package thick.tranmyngoc_63132347.baithibaitaptonghop;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import thick.tranmyngoc_63132347.baithibaitaptonghop.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottonNav= findViewById(R.id.bottomNavigationView);
        bottonNav.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                Fragment selectecFragment = null;
                int itemId = menuItem.getItemId();
                if(itemId == R.id.navigation_welcome){
                    selectecFragment = new HomeFragment();
                } else if (itemId == R.id.navigation_cau1) {
                    selectecFragment = new Cau1Fragment();
                }
                else if (itemId == R.id.navigation_cau2) {
                    selectecFragment = new Cau2Fragment();
                }
                else if (itemId == R.id.navigation_cau3) {
                    selectecFragment = new Cau3Fragment();
                }
                else if (itemId == R.id.navigation_cau4) {
                    selectecFragment = new Cau4Fragment();
                }

                if(selectecFragment != null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSpace, selectecFragment);

                }
                return;
            }
        });
    }
}