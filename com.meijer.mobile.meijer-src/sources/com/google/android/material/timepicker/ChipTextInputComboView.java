package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import ce.f;
import ce.h;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.r;
import com.google.android.material.internal.x;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes4.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    private final Chip f88755a;

    /* renamed from: b, reason: collision with root package name */
    private final TextInputLayout f88756b;

    /* renamed from: c, reason: collision with root package name */
    private final EditText f88757c;

    /* renamed from: d, reason: collision with root package name */
    private TextWatcher f88758d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f88759e;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private class b extends r {
        private b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!TextUtils.isEmpty(editable)) {
                String strC = ChipTextInputComboView.this.c(editable);
                Chip chip = ChipTextInputComboView.this.f88755a;
                if (TextUtils.isEmpty(strC)) {
                    strC = ChipTextInputComboView.this.c("00");
                }
                chip.setText(strC);
                return;
            }
            ChipTextInputComboView.this.f88755a.setText(ChipTextInputComboView.this.c("00"));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(h.f61746q, (ViewGroup) this, false);
        this.f88755a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(h.f61747r, (ViewGroup) this, false);
        this.f88756b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f88757c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f88758d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f88759e = (TextView) findViewById(f.f61714r);
        editText.setId(ViewCompat.l());
        ViewCompat.z0(this.f88759e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f88755a.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f88755a.setChecked(z10);
        this.f88757c.setVisibility(z10 ? 0 : 4);
        this.f88755a.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            x.p(this.f88757c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f88755a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f88755a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f88755a.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return d.a(getResources(), charSequence);
    }

    private void d() {
        this.f88757c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }
}
