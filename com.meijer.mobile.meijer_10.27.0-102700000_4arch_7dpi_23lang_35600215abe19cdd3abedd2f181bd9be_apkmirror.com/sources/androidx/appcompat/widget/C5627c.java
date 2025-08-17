package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.view.ViewCompat;
import d2.C13462a;
import i.C14584j;
import j.C14791a;

/* renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5627c {

    /* renamed from: a, reason: collision with root package name */
    private final CheckedTextView f46956a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f46957b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f46958c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f46959d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f46960e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f46961f;

    void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f46956a);
        if (drawableA != null) {
            if (this.f46959d || this.f46960e) {
                Drawable drawableMutate = C13462a.r(drawableA).mutate();
                if (this.f46959d) {
                    C13462a.o(drawableMutate, this.f46957b);
                }
                if (this.f46960e) {
                    C13462a.p(drawableMutate, this.f46958c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f46956a.getDrawableState());
                }
                this.f46956a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f46957b;
    }

    PorterDuff.Mode c() {
        return this.f46958c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        M mV = M.v(this.f46956a.getContext(), attributeSet, C14584j.f136756P0, i10, 0);
        CheckedTextView checkedTextView = this.f46956a;
        ViewCompat.k0(checkedTextView, checkedTextView.getContext(), C14584j.f136756P0, attributeSet, mV.r(), i10, 0);
        try {
            if (mV.s(C14584j.f136764R0) && (iN2 = mV.n(C14584j.f136764R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f46956a;
                    checkedTextView2.setCheckMarkDrawable(C14791a.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (mV.s(C14584j.f136760Q0) && (iN = mV.n(C14584j.f136760Q0, 0)) != 0) {
                CheckedTextView checkedTextView3 = this.f46956a;
                checkedTextView3.setCheckMarkDrawable(C14791a.b(checkedTextView3.getContext(), iN));
            }
            if (mV.s(C14584j.f136768S0)) {
                androidx.core.widget.b.b(this.f46956a, mV.c(C14584j.f136768S0));
            }
            if (mV.s(C14584j.f136772T0)) {
                androidx.core.widget.b.c(this.f46956a, C5648y.e(mV.k(C14584j.f136772T0, -1), null));
            }
            mV.x();
        } catch (Throwable th2) {
            mV.x();
            throw th2;
        }
    }

    void e() {
        if (this.f46961f) {
            this.f46961f = false;
        } else {
            this.f46961f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f46957b = colorStateList;
        this.f46959d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f46958c = mode;
        this.f46960e = true;
        a();
    }

    C5627c(CheckedTextView checkedTextView) {
        this.f46956a = checkedTextView;
    }
}
