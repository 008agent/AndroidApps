package ratnikov.nfchostcardemu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    public static Button buttonReader,buttonHistory;

    private void GetIDs() {
        buttonReader = (Button)findViewById(R.id.buttonReaderMode);
        buttonHistory = (Button)findViewById(R.id.buttonHistoryMode);
    }

    private void SetEvents() {
        buttonReader.setOnClickListener(this);
        buttonHistory.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetIDs();
        SetEvents();
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
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonReaderMode : {
                Toast.makeText(this,"Selected Reader mode",Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_reader);
                break;
            }
            case R.id.buttonHistoryMode : {
                Toast.makeText(this,"Selected History mode",Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}
