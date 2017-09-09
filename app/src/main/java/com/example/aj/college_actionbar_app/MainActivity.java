package com.example.aj.college_actionbar_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.calculator:
                calculator c=new calculator();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, c).commit();
                Toast.makeText(this, "Calculator", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.map:
                map m=new map();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, m).commit();
                Toast.makeText(this, "Location", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.settings:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        } }
}
