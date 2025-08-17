package com.meijer.mobile.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.meijer.mobile.meijer.O;
import rr.C16830a;

/* loaded from: classes11.dex */
public class MeijerEditText extends TextInputEditText implements TextView.OnEditorActionListener, View.OnFocusChangeListener {

    public interface a {
    }

    public MeijerEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, O.f98645a);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
    }

    public MeijerEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f();
    }

    private void f() {
        addTextChangedListener(new C16830a(this));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        return super.onKeyPreIme(i10, keyEvent);
    }

    public void setListener(a aVar) {
        setOnEditorActionListener(this);
        setOnFocusChangeListener(this);
    }
}
