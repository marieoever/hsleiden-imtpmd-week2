package hsl.imtpmd.browserapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements ...
{
	private WebView browser;
	private EditText adresInput;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		browser = (WebView) findViewById( ... );
		
		//navigatie binnen de pagina dient plaats te vinden binnen dezelfde webview
		//stel daarom een nieuwe webclient in om de standaard webclient (meestal de android browser) te overschrijven
		browser ...

		//stel via de websettings in dat javascript uitgevoerd kan worden
		WebSettings settings = ...;
		settings. ...
		
		adresInput = (EditText) findViewById( R.id.adresinput );
		
		Button navigeerKnop = (Button) findViewById( R.id.navigeerknop );
		navigeerKnop.setOnClickListener( ... );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	@Override
	public void onClick( View view )
	{
		//gebruik de adres inputveld (adresInput) om de opgegeven pagina te laden
		browser.loadUrl( ... );
	}

}
