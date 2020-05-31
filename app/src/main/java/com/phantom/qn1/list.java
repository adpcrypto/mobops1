package com.phantom.qn1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;





public class list extends AppCompatActivity  implements AdapterView.OnItemClickListener  {
    ListView listView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setContentView(R.layout.activity_list);
        listView = (ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adapter.add("Bread");
        adapter.add("Butter");
        adapter.add("Rice");
        adapter.add("Wheat");
        adapter.add("Dal");
        adapter.add("Beans");
        adapter.add("Soyabeans");
        adapter.add("Sugar");
        adapter.add("Salt");
        adapter.add("Jaggery");
        adapter.add("Milk Powder");
        adapter.add("Tea Leaves");
        adapter.add("Chilli Powder");
        adapter.add("Baking soda");
        adapter.add("Turmeric Powder");
        adapter.add("Vinegar");
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String item = adapter.getItem(position);
        Toast.makeText(this,"You clicked "+item,Toast.LENGTH_LONG).show();
    }
}
