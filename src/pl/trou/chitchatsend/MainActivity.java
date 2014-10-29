package pl.trou.chitchatsend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	public static final String CUSTOM_INTENT = "pl.trou.chitchatsend.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void send(View view) {
		EditText edit = (EditText) findViewById(R.id.editText1);
		Intent i = new Intent(CUSTOM_INTENT);
		SpannableString message = new SpannableString(edit.getText());
		i.putExtra("msg", message.toString());
		i.setAction(CUSTOM_INTENT);
		this.sendBroadcast(i);
		edit.setText("");
	}
}
