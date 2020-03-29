package com.example.kancaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.bottomNavigationView);

        NavController navController = Navigation.findNavController(this, R.id.nav_fragment);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.home, R.id.history, R.id.profile)
                .build();

        NavigationUI.setupWithNavController(navView, navController);
    }
}
