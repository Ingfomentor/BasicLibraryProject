package ec.edu.ucuenca.vazquez.suma;

import ec.edu.ucuenca.libreria.BasicMath;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author Angel Oswaldo Vázquez Patiño
 * @see http://www.nosinmiubuntu.com/2012/03/reutiliza-tu-codigo-android.html
 */
public class MainActivity extends Activity {

	EditText numero1, numero2;
	TextView resultado;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		numero1 = (EditText) findViewById(R.id.editText1);
		numero2 = (EditText) findViewById(R.id.editText2);
		resultado = (TextView) findViewById(R.id.textView1);
		
		//Log.i(AUDIO_SERVICE, String.valueOf(ejecutor.getSuma(1.2, 0.8)));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void mostrarSuma(View view){
		BasicMath ejecutor = new BasicMath();
		//Log.i(AUDIO_SERVICE, String.valueOf(ejecutor.getSuma(1.2, 0.8)));
		//resultado.setText("Resultado");
		resultado.setText(String.valueOf(ejecutor.getSuma(Double.valueOf(numero1.getText().toString()), Double.valueOf(numero2.getText().toString()))));
	}
	
	public void terminar(View view){
		this.finish();
	}
}
