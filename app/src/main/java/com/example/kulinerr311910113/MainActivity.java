package com.example.kulinerr311910113;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnvMenuBawah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnvMenuBawah = findViewById(R.id.bnv_menu);
        getSupportFragmentManager().beginTransaction().replace(R.id.
                body_container, new HomeFragment()).commit();
        bnvMenuBawah.setSelectedItemId(R.id.menu_home);
        getSupportActionBar();setTitle("Home");
        bnvMenuBawah.setOnItemSelectedListener(new
                                                       NavigationBarView.OnItemSelectedListener() {
                                                           @Override
                                                           public boolean onNavigationItemSelected(@NonNull MenuItem item)
                                                           {
                                                               Fragment FR = null;
                                                               switch (item.getItemId()){
                                                                   case R.id.menu_home:
                                                                       FR = new HomeFragment();
                                                                       getSupportActionBar();setTitle("Home");
                                                                       break;
                                                                   case R.id.menu_web:
                                                                       FR = new WebFragment();
                                                                       getSupportActionBar();setTitle("Web");
                                                                       break;
                                                                   case R.id.menu_about:
                                                                       FR = new AboutFragment();
                                                                       getSupportActionBar();setTitle("About");
                                                                       break;
                                                               }

                                                               getSupportFragmentManager().beginTransaction().replace(R.id.
                                                                       body_container, FR).commit();
                                                               return true;
                                                           }
                                                       });
    }
}
