package com.example.datos;

import java.util.ArrayList;
import java.util.Arrays;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DatosActivity extends Activity {
	private ListView lv;
	private ArrayAdapter<String> listAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_datos);
		
		// maperar la refereecia XML
		lv = (ListView) this.findViewById(R.id.lv);
		
		// Llenar un vector con planetas
		String[]  planetas = new String[] {"Mercurio", "Venus", "Marte", "Jupiter", "Saturno","Urano", "Neptuno", "Plutón"};
		
		ArrayList<String> listaPlaneta = new ArrayList<String>();
		listaPlaneta.addAll(Arrays.asList(planetas));
		
		String[] paises = this.getResources().getStringArray(R.array.paises);
		//Cargar adapter con datos
		listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
		
		//asignar listener a list view
		lv.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "hola", Toast.LENGTH_SHORT).show();
				
			}
			
		});
		
		
		//Asociar listView con adapter
		lv.setAdapter(listAdapter);
		
		
		
	}
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_datos, menu);
		return true;
	}

}
