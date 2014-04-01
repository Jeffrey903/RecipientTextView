package cm.confide.ex.chips;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by jeff on 4/1/14.
 */
public class ActionModeCallbackCompat {
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static ActionModeCallback getCallback() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
            return null;
        }

        return new ActionModeCallback();
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static class ActionModeCallback implements android.view.ActionMode.Callback {
        public boolean onActionItemClicked(android.view.ActionMode mode, MenuItem item) {
            return false;
        }

        public void onDestroyActionMode(android.view.ActionMode mode) {
        }

        public boolean onPrepareActionMode(android.view.ActionMode mode, Menu menu) {
            return false;
        }

        /**
         * No chips are selectable.
         */
        public boolean onCreateActionMode(android.view.ActionMode mode, Menu menu) {
            return false;
        }
    }
}
