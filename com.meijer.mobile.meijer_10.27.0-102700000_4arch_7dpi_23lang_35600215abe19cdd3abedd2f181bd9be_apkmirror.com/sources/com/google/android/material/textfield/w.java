package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes4.dex */
class w extends r {

    /* renamed from: e, reason: collision with root package name */
    private int f87912e;

    /* renamed from: f, reason: collision with root package name */
    private EditText f87913f;

    /* renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f87914g;

    @Override // com.google.android.material.textfield.r
    boolean l() {
        return true;
    }

    public static /* synthetic */ void v(w wVar, View view) {
        EditText editText = wVar.f87913f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (wVar.w()) {
            wVar.f87913f.setTransformationMethod(null);
        } else {
            wVar.f87913f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            wVar.f87913f.setSelection(selectionEnd);
        }
        wVar.r();
    }

    private boolean w() {
        EditText editText = this.f87913f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.r
    int c() {
        return ae.j.f44745D;
    }

    @Override // com.google.android.material.textfield.r
    int d() {
        return this.f87912e;
    }

    @Override // com.google.android.material.textfield.r
    View.OnClickListener f() {
        return this.f87914g;
    }

    @Override // com.google.android.material.textfield.r
    void n(EditText editText) {
        this.f87913f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.r
    void s() {
        if (x(this.f87913f)) {
            this.f87913f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.r
    void u() {
        EditText editText = this.f87913f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    w(EndCompoundLayout endCompoundLayout, int i10) {
        super(endCompoundLayout);
        this.f87912e = ae.e.f44643a;
        this.f87914g = new View.OnClickListener() { // from class: com.google.android.material.textfield.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.v(this.f87911a, view);
            }
        };
        if (i10 != 0) {
            this.f87912e = i10;
        }
    }

    @Override // com.google.android.material.textfield.r
    void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // com.google.android.material.textfield.r
    boolean m() {
        return !w();
    }
}
