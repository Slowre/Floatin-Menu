package com.ke.project.floatingmenu;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txt1, txt2, txt3, txt4;

    FloatingActionButton fab, fab1, fab2, fab3, fab4;
    Boolean isFABOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialize floatingActionButtons
        fab = findViewById(R.id.floatingBtnMenuEvent);
        fab1 = findViewById(R.id.floatingBtnEditEvent);
        fab2 = findViewById(R.id.floatingBtnUpdateEvent);
        fab3 = findViewById(R.id.floatingBtnObservationEvent);
        fab4 = findViewById(R.id.floatingBtnFinishEvent);
        txt1 = findViewById(R.id.editOptionTxt);
        txt2 = findViewById(R.id.updateOptionTxt);
        txt3 = findViewById(R.id.observationOptionTxt);
        txt4 = findViewById(R.id.finishOptionTxt);
        //Set clickListener for all options a button menu
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Menu", Toast.LENGTH_SHORT).show();
                if (isFABOpen) {
                    closeFABMenu();
                } else {
                    showFABMenu();
                }
            }
        });
        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);
        fab3.setOnClickListener(this);
        fab4.setOnClickListener(this);
    }
    //Method to open and show all options using animate().translationY()
    private void showFABMenu() {
        isFABOpen = true;
        fab4.animate().translationY(-getResources().getDimension(R.dimen.standard_65));
        txt4.setVisibility(View.VISIBLE);
        txt4.animate().translationY(-getResources().getDimension(R.dimen.standard_65));
        fab3.animate().translationY(-getResources().getDimension(R.dimen.standard_115));
        txt3.setVisibility(View.VISIBLE);
        txt3.animate().translationY(-getResources().getDimension(R.dimen.standard_115));
        fab2.animate().translationY(-getResources().getDimension(R.dimen.standard_165));
        txt2.setVisibility(View.VISIBLE);
        txt2.animate().translationY(-getResources().getDimension(R.dimen.standard_165));
        fab1.animate().translationY(-getResources().getDimension(R.dimen.standard_215));
        txt1.setVisibility(View.VISIBLE);
        txt1.animate().translationY(-getResources().getDimension(R.dimen.standard_215));
    }
    //Method to close menu using animate().translationY()
    private void closeFABMenu() {
        isFABOpen = false;
        fab1.animate().translationY(0);
        txt1.animate().translationY(0);
        txt1.setVisibility(View.GONE);
        fab2.animate().translationY(0);
        txt2.animate().translationY(0);
        txt2.setVisibility(View.GONE);
        fab3.animate().translationY(0);
        txt3.animate().translationY(0);
        txt3.setVisibility(View.GONE);
        fab4.animate().translationY(0);
        txt4.animate().translationY(0);
        txt4.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.floatingBtnEditEvent:
                Toast.makeText(MainActivity.this, "Editar", Toast.LENGTH_SHORT).show();
                closeFABMenu();
                break;
            case R.id.floatingBtnUpdateEvent:
                Toast.makeText(MainActivity.this, "Posponer", Toast.LENGTH_SHORT).show();
                closeFABMenu();
                break;
            case R.id.floatingBtnObservationEvent:
                Toast.makeText(MainActivity.this, "Observacion", Toast.LENGTH_SHORT).show();
                closeFABMenu();
                break;
            case R.id.floatingBtnFinishEvent:
                Toast.makeText(MainActivity.this, "Terminar", Toast.LENGTH_SHORT).show();
                closeFABMenu();
                break;
            default:
                break;
        }
    }
}
