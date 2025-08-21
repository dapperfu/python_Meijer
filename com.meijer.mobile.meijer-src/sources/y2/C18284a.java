package y2;

import android.text.Spanned;
import android.widget.TextView;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18284a {
    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return true;
            }
        }
        return false;
    }

    public static void b(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence != null || text.length() != 0) {
                if (charSequence instanceof Spanned) {
                    if (charSequence.equals(text)) {
                        return;
                    }
                } else if (!a(charSequence, text)) {
                    return;
                }
                textView.setText(charSequence);
            }
        }
    }
}
