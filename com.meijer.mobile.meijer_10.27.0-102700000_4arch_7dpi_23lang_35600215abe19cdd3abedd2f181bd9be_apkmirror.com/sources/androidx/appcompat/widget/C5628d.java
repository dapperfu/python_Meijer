package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.ViewCompat;
import d2.C13462a;
import i.C14584j;
import j.C14791a;

/* renamed from: androidx.appcompat.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5628d {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f46962a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f46963b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f46964c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f46965d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f46966e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f46967f;

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f46962a);
        if (drawableA != null) {
            if (this.f46965d || this.f46966e) {
                Drawable drawableMutate = C13462a.r(drawableA).mutate();
                if (this.f46965d) {
                    C13462a.o(drawableMutate, this.f46963b);
                }
                if (this.f46966e) {
                    C13462a.p(drawableMutate, this.f46964c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f46962a.getDrawableState());
                }
                this.f46962a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f46963b;
    }

    PorterDuff.Mode c() {
        return this.f46964c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        M mV = M.v(this.f46962a.getContext(), attributeSet, C14584j.f136776U0, i10, 0);
        CompoundButton compoundButton = this.f46962a;
        ViewCompat.k0(compoundButton, compoundButton.getContext(), C14584j.f136776U0, attributeSet, mV.r(), i10, 0);
        try {
            if (mV.s(C14584j.f136784W0) && (iN2 = mV.n(C14584j.f136784W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f46962a;
                    compoundButton2.setButtonDrawable(C14791a.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (mV.s(C14584j.f136780V0) && (iN = mV.n(C14584j.f136780V0, 0)) != 0) {
                CompoundButton compoundButton3 = this.f46962a;
                compoundButton3.setButtonDrawable(C14791a.b(compoundButton3.getContext(), iN));
            }
            if (mV.s(C14584j.f136788X0)) {
                androidx.core.widget.c.d(this.f46962a, mV.c(C14584j.f136788X0));
            }
            if (mV.s(C14584j.f136792Y0)) {
                androidx.core.widget.c.e(this.f46962a, C5648y.e(mV.k(C14584j.f136792Y0, -1), null));
            }
            mV.x();
        } catch (Throwable th2) {
            mV.x();
            throw th2;
        }
    }

    void e() {
        if (this.f46967f) {
            this.f46967f = false;
        } else {
            this.f46967f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f46963b = colorStateList;
        this.f46965d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f46964c = mode;
        this.f46966e = true;
        a();
    }

    C5628d(CompoundButton compoundButton) {
        this.f46962a = compoundButton;
    }
}
