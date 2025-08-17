package rr;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* renamed from: rr.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C16830a implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    protected final TextView f159783a;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        TextView textView = this.f159783a;
        if (textView == null || textView.getError() == null) {
            return;
        }
        this.f159783a.setError(null);
    }

    public C16830a(TextView textView) {
        this.f159783a = textView;
    }
}
