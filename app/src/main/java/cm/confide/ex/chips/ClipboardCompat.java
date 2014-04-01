package cm.confide.ex.chips;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/**
 * Created by jeff on 4/1/14.
 */
public class ClipboardCompat {
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void setPrimaryClip(Context context, CharSequence text) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
            return;
        }

        android.content.ClipboardManager clipboard = (android.content.ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        if (clipboard != null) {
            clipboard.setPrimaryClip(android.content.ClipData.newPlainText("", text));
        }
    }

    public static void setText(Context context, CharSequence text) {
        android.text.ClipboardManager clipboard = (android.text.ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        if (clipboard != null) {
            clipboard.setText(text);
        }
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static android.content.ClipData getPrimaryClip(Context context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
            return null;
        }

        android.content.ClipboardManager clipboard = (android.content.ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        return clipboard != null ? clipboard.getPrimaryClip() : null;
    }

    public static CharSequence getText(Context context) {
        android.text.ClipboardManager clipboard = (android.text.ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        return clipboard != null ? clipboard.getText() : null;
    }
}
