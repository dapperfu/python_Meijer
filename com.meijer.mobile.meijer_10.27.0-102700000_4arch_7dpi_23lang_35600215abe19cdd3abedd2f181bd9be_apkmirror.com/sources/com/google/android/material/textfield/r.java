package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import q2.C16441c;

/* loaded from: classes4.dex */
abstract class r {

    /* renamed from: a, reason: collision with root package name */
    final TextInputLayout f87873a;

    /* renamed from: b, reason: collision with root package name */
    final EndCompoundLayout f87874b;

    /* renamed from: c, reason: collision with root package name */
    final Context f87875c;

    /* renamed from: d, reason: collision with root package name */
    final CheckableImageButton f87876d;

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int i10, int i11, int i12) {
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    C16441c.a h() {
        return null;
    }

    boolean i(int i10) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(EditText editText) {
    }

    void o(View view, q2.y yVar) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean z10) {
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }

    final void r() {
        this.f87874b.L(false);
    }

    r(EndCompoundLayout endCompoundLayout) {
        this.f87873a = endCompoundLayout.f87691a;
        this.f87874b = endCompoundLayout;
        this.f87875c = endCompoundLayout.getContext();
        this.f87876d = endCompoundLayout.r();
    }
}
