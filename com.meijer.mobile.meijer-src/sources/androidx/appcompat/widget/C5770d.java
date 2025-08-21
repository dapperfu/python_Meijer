package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.ViewCompat;
import d2.C13595a;
import i.C14587j;
import j.C14879a;

/* renamed from: androidx.appcompat.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5770d {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f47186a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f47187b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f47188c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f47189d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f47190e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f47191f;

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f47186a);
        if (drawableA != null) {
            if (this.f47189d || this.f47190e) {
                Drawable drawableMutate = C13595a.r(drawableA).mutate();
                if (this.f47189d) {
                    C13595a.o(drawableMutate, this.f47187b);
                }
                if (this.f47190e) {
                    C13595a.p(drawableMutate, this.f47188c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f47186a.getDrawableState());
                }
                this.f47186a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f47187b;
    }

    PorterDuff.Mode c() {
        return this.f47188c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        M mV = M.v(this.f47186a.getContext(), attributeSet, C14587j.f136533U0, i10, 0);
        CompoundButton compoundButton = this.f47186a;
        ViewCompat.k0(compoundButton, compoundButton.getContext(), C14587j.f136533U0, attributeSet, mV.r(), i10, 0);
        try {
            if (mV.s(C14587j.f136541W0) && (iN2 = mV.n(C14587j.f136541W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f47186a;
                    compoundButton2.setButtonDrawable(C14879a.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (mV.s(C14587j.f136537V0) && (iN = mV.n(C14587j.f136537V0, 0)) != 0) {
                CompoundButton compoundButton3 = this.f47186a;
                compoundButton3.setButtonDrawable(C14879a.b(compoundButton3.getContext(), iN));
            }
            if (mV.s(C14587j.f136545X0)) {
                androidx.core.widget.c.d(this.f47186a, mV.c(C14587j.f136545X0));
            }
            if (mV.s(C14587j.f136549Y0)) {
                androidx.core.widget.c.e(this.f47186a, C5790y.e(mV.k(C14587j.f136549Y0, -1), null));
            }
            mV.x();
        } catch (Throwable th2) {
            mV.x();
            throw th2;
        }
    }

    void e() {
        if (this.f47191f) {
            this.f47191f = false;
        } else {
            this.f47191f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f47187b = colorStateList;
        this.f47189d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f47188c = mode;
        this.f47190e = true;
        a();
    }

    C5770d(CompoundButton compoundButton) {
        this.f47186a = compoundButton;
    }
}
