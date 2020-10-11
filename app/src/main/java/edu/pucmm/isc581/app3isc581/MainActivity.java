package edu.pucmm.isc581.app3isc581;

import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] distroArray = {"Arch Linux", "Parabola", "GNU GUIX", "Ubuntu", "Linux Mint", "Gentoo", "Hannah Montana Linux"};
        ListView listView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,distroArray);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("DISTRO", adapterView.getAdapter().getItem(i).toString());
                startActivity(intent);
            }
        });
    }

}