package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        findViewById(R.id.btn_run).setOnClickListener(this);
        findViewById(R.id.btn_basketball).setOnClickListener(this);
        findViewById(R.id.btn_football).setOnClickListener(this);
        findViewById(R.id.btn_volleyball).setOnClickListener(this);
        findViewById(R.id.btn_badminton).setOnClickListener(this);
        findViewById(R.id.btn_swim).setOnClickListener(this);
        findViewById(R.id.btn_gym).setOnClickListener(this);
        findViewById(R.id.btn_tabletennis).setOnClickListener(this);
        findViewById(R.id.btn_tennis).setOnClickListener(this);
        findViewById(R.id.btn_frisbee).setOnClickListener(this);
        findViewById(R.id.btn_td).setOnClickListener(this);
        findViewById(R.id.btn_more).setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, SportActivity.class);
        if (view.getId() == R.id.btn_run) {
            intent.putExtra("run", 0);

        } else if (view.getId() == R.id.btn_basketball) {
            intent.putExtra("basketball", 0);
        } else if (view.getId() == R.id.btn_football) {
            intent.putExtra("football",0);
        } else if (view.getId() == R.id.btn_volleyball) {
            intent.putExtra("volleyball",0);
        } else if (view.getId() == R.id.btn_badminton) {
            intent.putExtra("badminton",0);
        } else if (view.getId() == R.id.btn_swim) {
            intent.putExtra("swim",0);
        } else if (view.getId() == R.id.btn_gym) {
            intent.putExtra("gym",0);
        } else if (view.getId() == R.id.btn_tabletennis) {
            intent.putExtra("tabletennis",0);
        } else if (view.getId() == R.id.btn_tennis) {
            intent.putExtra("tennis",0);
        } else if (view.getId() == R.id.btn_frisbee) {
            intent.putExtra("frisbee",0);
        } else if (view.getId() == R.id.btn_td) {
            intent.putExtra("td",0);
        } else if (view.getId() == R.id.btn_more) {
            intent.putExtra("more",0);
        }
        startActivity(intent);
    }
}