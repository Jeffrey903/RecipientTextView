package cm.confide.recipienttextview.app;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

/**
 * Created by jeff on 3/31/14.
 */
public class RecipientTextView extends MultiAutoCompleteTextView {
    public RecipientTextView(Context context) {
        super(context);
        init();
    }

    public RecipientTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RecipientTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        String[] items = new String[]{
                "jeff",
                "rich",
                "jon",
                "dan",
                "howard",
                "david",
                "margie",
                "matty",
        };

        setAdapter(new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, items));
        setTokenizer(new CommaTokenizer());
    }
}
