package com.cutonala.practica1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	
	double num1;
	double num2;
	double res;
	
	int bandera;
	
	Button btn_0;
	Button btn_1;
	Button btn_2;
	Button btn_3;
	Button btn_4;
	Button btn_5;
	Button btn_6;
	Button btn_7;
	Button btn_8;
	Button btn_9;
	
	Button clear;
	Button btnPunto;
	Button btnSuma;
	Button btnResta;
	Button btnMulti;
	Button btnDivision;
	Button btnIgual;
	
	EditText resultado;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn_0 = (Button) findViewById(R.id.btn_0);
		btn_1 = (Button) findViewById(R.id.btn_1);
		btn_2 = (Button) findViewById(R.id.btn_2);
		btn_3 = (Button) findViewById(R.id.btn_3);
		btn_4 = (Button) findViewById(R.id.btn_4);
		btn_5 = (Button) findViewById(R.id.btn_5);
		btn_6 = (Button) findViewById(R.id.btn_6);
		btn_7 = (Button) findViewById(R.id.btn_7);
		btn_8 = (Button) findViewById(R.id.btn_8);
		btn_9 = (Button) findViewById(R.id.btn_9);
		
		clear = (Button) findViewById(R.id.clear);
		btnPunto = (Button) findViewById(R.id.btnPunto);
		btnSuma = (Button) findViewById(R.id.btnSuma);
		btnResta = (Button) findViewById(R.id.btnResta);
		btnMulti = (Button) findViewById(R.id.btnMulti);
		btnDivision = (Button) findViewById(R.id.btnDivision);
		btnIgual = (Button) findViewById(R.id.btnIgual);
		
		btn_0.setOnClickListener(this);
		btn_1.setOnClickListener(this);
		btn_2.setOnClickListener(this);
		btn_3.setOnClickListener(this);
		btn_4.setOnClickListener(this);
		btn_5.setOnClickListener(this);
		btn_6.setOnClickListener(this);
		btn_7.setOnClickListener(this);
		btn_8.setOnClickListener(this);
		btn_9.setOnClickListener(this);
		btnPunto.setOnClickListener(this);
		
		btnSuma.setOnClickListener(this);
		btnResta.setOnClickListener(this);
		btnMulti.setOnClickListener(this);
		btnDivision.setOnClickListener(this);
		btnIgual.setOnClickListener(this);
		clear.setOnClickListener(this);
		
		resultado = (EditText) findViewById(R.id.resultado);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0==btnIgual){
			switch(bandera){
			case 1:
				res=num1+num2;
			break;
			case 2:
				res=num1-num2;
			break;
			case 3:
				res=num1*num2;
			break;
			case 4:
				res=num1/num2;
			break;
			}
		}
		
		
		if(arg0==btnSuma){
			num1=Double.parseDouble(resultado.getText().toString());
			bandera=1;
			resultado.setText("");
		}
		
		if(arg0==btnResta){
			num1=Double.parseDouble(resultado.getText().toString());
			bandera=2;
			resultado.setText("");
		}
		
		if(arg0==btnMulti){
			num1=Double.parseDouble(resultado.getText().toString());
			bandera=3;
			resultado.setText("");
		}
		
		if(arg0==btnDivision){
			num1=Double.parseDouble(resultado.getText().toString());
			bandera=4;
			resultado.setText("");
		}
		
		if(arg0==clear){
			resultado.setText("");
			num1=0;
			num2=0;
			res=0;
			bandera=0;
		}
		
		if(arg0==btn_0 || arg0==btn_1 || arg0==btn_2 || arg0==btn_3 || arg0==btn_4 || arg0==btn_5 || arg0==btn_6 || arg0==btn_7 || arg0==btn_8 || arg0==btn_9 || arg0==btnPunto);
		Button boton = (Button) arg0;
		String caption = boton.getText().toString();
		resultado.setText(resultado.getText() + caption);
	}
}
