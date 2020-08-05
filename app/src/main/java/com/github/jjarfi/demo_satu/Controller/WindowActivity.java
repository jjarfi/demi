package com.github.jjarfi.demo_satu.Controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.github.jjarfi.demo_satu.Fragment.FragmentAccount;
import com.github.jjarfi.demo_satu.Fragment.FragmentClothing;
import com.github.jjarfi.demo_satu.Fragment.FragmentDashboard;
import com.github.jjarfi.demo_satu.Fragment.FragmentNotification;
import com.github.jjarfi.demo_satu.Fragment.FragmentShopping;
import com.github.jjarfi.demo_satu.R;

public class WindowActivity extends AppCompatActivity {
    private final static int ID_SATU = 1;
    private final static int ID_DUA = 2;
    private final static int ID_TIGA = 3;
    private final static int ID_EMPAT = 4;
    private final static int ID_LIMA = 5;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window);
        meowButton();
    }

    private void meowButton(){
        try{
            MeowBottomNavigation bottomNavigation = findViewById(R.id.btncontoh);
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentDashboard()).commit();
            bottomNavigation.add(new MeowBottomNavigation.Model(ID_SATU, R.drawable.ic_baseline_account_balance_24));
            bottomNavigation.add(new MeowBottomNavigation.Model(ID_DUA, R.drawable.ic_baseline_accessibility_24));
            bottomNavigation.add(new MeowBottomNavigation.Model(ID_TIGA, R.drawable.ic_baseline_add_shopping_cart_24));
            bottomNavigation.add(new MeowBottomNavigation.Model(ID_EMPAT, R.drawable.ic_baseline_notifications_active_24));
            bottomNavigation.add(new MeowBottomNavigation.Model(ID_LIMA, R.drawable.ic_baseline_person_24));

            bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
                @Override
                public void onClickItem(MeowBottomNavigation.Model item) {
                }
            });

            bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
                @Override
                public void onShowItem(MeowBottomNavigation.Model item) {
                    Fragment selected_item = null;
                    switch (item.getId()) {
                        case ID_SATU:
                            selected_item = new FragmentDashboard();
                            break;
                        case ID_DUA:
                            selected_item = new FragmentClothing();
                            break;
                        case ID_TIGA:
                            selected_item = new FragmentShopping();
                            break;
                        case ID_EMPAT:
                            selected_item = new FragmentNotification();
                            break;
                        case ID_LIMA:
                            selected_item = new FragmentAccount();
                            break;
                        default:
                            id = "";
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selected_item).commit();
                }
            });
            bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
                @Override
                public void onReselectItem(MeowBottomNavigation.Model item) {

                }
            });
            bottomNavigation.show(ID_SATU, true);


        }catch (Exception e){

        }
    }
}