package com.google.android.material.timepicker;

import ae.f;
import ae.h;
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
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.r;
import com.google.android.material.internal.x;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes4.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    private final Chip f87915a;

    /* renamed from: b, reason: collision with root package name */
    private final TextInputLayout f87916b;

    /* renamed from: c, reason: collision with root package name */
    private final EditText f87917c;

    /* renamed from: d, reason: collision with root package name */
    private TextWatcher f87918d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f87919e;

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
                Chip chip = ChipTextInputComboView.this.f87915a;
                if (TextUtils.isEmpty(strC)) {
                    strC = ChipTextInputComboView.this.c("00");
                }
                chip.setText(strC);
                return;
            }
            ChipTextInputComboView.this.f87915a.setText(ChipTextInputComboView.this.c("00"));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(h.f44731q, (ViewGroup) this, false);
        this.f87915a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(h.f44732r, (ViewGroup) this, false);
        this.f87916b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f87917c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f87918d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f87919e = (TextView) findViewById(f.f44699r);
        editText.setId(ViewCompat.l());
        ViewCompat.z0(this.f87919e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f87915a.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f87915a.setChecked(z10);
        this.f87917c.setVisibility(z10 ? 0 : 4);
        this.f87915a.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            x.p(this.f87917c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f87915a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f87915a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f87915a.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return d.a(getResources(), charSequence);
    }

    private void d() {
        this.f87917c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }
}
