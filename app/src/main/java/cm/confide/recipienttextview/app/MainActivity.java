package cm.confide.recipienttextview.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import java.util.ArrayList;

import cm.confide.ex.chips.RecipientEditTextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecipientEditTextView emailRetv =
                (RecipientEditTextView) findViewById(R.id.email_retv);
//        emailRetv.setTokenizer(new Rfc822Tokenizer());
//        emailRetv.setAdapter(new BaseRecipientAdapter(this) { });

        final RecipientEditTextView phoneRetv =
                (RecipientEditTextView) findViewById(R.id.phone_retv);
        phoneRetv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
//        phoneRetv.setAdapter(new BaseRecipientAdapter(BaseRecipientAdapter.QUERY_TYPE_PHONE, this) { });



        final ArrayList<String> items = new ArrayList<String>();
        items.add("jeff");
        items.add("rich");
        items.add("jon");
        items.add("dan");
        items.add("howard");
        items.add("david");
        items.add("margie");
        items.add("matty");

        phoneRetv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
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

}
