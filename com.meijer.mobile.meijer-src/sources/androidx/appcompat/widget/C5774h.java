package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5774h {
    static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof Z) {
                    editorInfo.hintText = ((Z) parent).a();
                    return inputConnection;
                }
            }
        }
        return inputConnection;
    }
}
