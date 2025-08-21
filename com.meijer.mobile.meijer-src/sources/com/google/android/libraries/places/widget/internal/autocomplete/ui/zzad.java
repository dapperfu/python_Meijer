package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import Z1.b;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.places.internal.zzmr;

/* loaded from: classes6.dex */
final class zzad implements View.OnFocusChangeListener {
    private zzad() {
        throw null;
    }

    /* synthetic */ zzad(byte[] bArr) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) throws Throwable {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) b.j(view.getContext(), InputMethodManager.class);
            if (inputMethodManager == null) {
                return;
            }
            if (z10) {
                inputMethodManager.showSoftInput(view, 1);
            } else {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Error e10) {
            e = e10;
            zzmr.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzmr.zzb(e);
            throw e;
        }
    }
}
