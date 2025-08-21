package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.view.ViewCompat;
import d2.C13595a;
import i.C14587j;
import j.C14879a;

/* renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5769c {

    /* renamed from: a, reason: collision with root package name */
    private final CheckedTextView f47180a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f47181b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f47182c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f47183d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f47184e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f47185f;

    void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f47180a);
        if (drawableA != null) {
            if (this.f47183d || this.f47184e) {
                Drawable drawableMutate = C13595a.r(drawableA).mutate();
                if (this.f47183d) {
                    C13595a.o(drawableMutate, this.f47181b);
                }
                if (this.f47184e) {
                    C13595a.p(drawableMutate, this.f47182c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f47180a.getDrawableState());
                }
                this.f47180a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f47181b;
    }

    PorterDuff.Mode c() {
        return this.f47182c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        M mV = M.v(this.f47180a.getContext(), attributeSet, C14587j.f136513P0, i10, 0);
        CheckedTextView checkedTextView = this.f47180a;
        ViewCompat.k0(checkedTextView, checkedTextView.getContext(), C14587j.f136513P0, attributeSet, mV.r(), i10, 0);
        try {
            if (mV.s(C14587j.f136521R0) && (iN2 = mV.n(C14587j.f136521R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f47180a;
                    checkedTextView2.setCheckMarkDrawable(C14879a.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (mV.s(C14587j.f136517Q0) && (iN = mV.n(C14587j.f136517Q0, 0)) != 0) {
                CheckedTextView checkedTextView3 = this.f47180a;
                checkedTextView3.setCheckMarkDrawable(C14879a.b(checkedTextView3.getContext(), iN));
            }
            if (mV.s(C14587j.f136525S0)) {
                androidx.core.widget.b.b(this.f47180a, mV.c(C14587j.f136525S0));
            }
            if (mV.s(C14587j.f136529T0)) {
                androidx.core.widget.b.c(this.f47180a, C5790y.e(mV.k(C14587j.f136529T0, -1), null));
            }
            mV.x();
        } catch (Throwable th2) {
            mV.x();
            throw th2;
        }
    }

    void e() {
        if (this.f47185f) {
            this.f47185f = false;
        } else {
            this.f47185f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f47181b = colorStateList;
        this.f47183d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f47182c = mode;
        this.f47184e = true;
        a();
    }

    C5769c(CheckedTextView checkedTextView) {
        this.f47180a = checkedTextView;
    }
}
