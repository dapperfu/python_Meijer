package fsimpl;

import android.view.View;

/* loaded from: classes15.dex */
public class ge {
    public static String a(View view) {
        try {
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                return contentDescription.toString();
            }
            return null;
        } catch (Throwable th2) {
            return null;
        }
    }
}
