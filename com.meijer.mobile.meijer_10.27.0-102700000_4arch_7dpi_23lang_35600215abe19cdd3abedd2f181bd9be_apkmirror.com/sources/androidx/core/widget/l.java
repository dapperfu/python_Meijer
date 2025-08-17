package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.fullstory.FS;
import p2.C16203c;
import p2.H;

/* loaded from: classes.dex */
public final class l implements H {
    @Override // p2.H
    public C16203c a(View view, C16203c c16203c) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            FS.log_d("ReceiveContent", "onReceive: " + c16203c);
        }
        if (c16203c.d() == 2) {
            return c16203c;
        }
        ClipData clipDataB = c16203c.b();
        int iC = c16203c.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z10 = false;
        for (int i10 = 0; i10 < clipDataB.getItemCount(); i10++) {
            CharSequence charSequenceB = b(context, clipDataB.getItemAt(i10), iC);
            if (charSequenceB != null) {
                if (z10) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceB);
                } else {
                    c(editable, charSequenceB);
                    z10 = true;
                }
            }
        }
        return null;
    }

    private static CharSequence b(Context context, ClipData.Item item, int i10) {
        if ((i10 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    private static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }
}
