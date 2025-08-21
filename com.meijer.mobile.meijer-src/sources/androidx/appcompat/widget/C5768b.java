package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import i.C14587j;

/* renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5768b {

    /* renamed from: a, reason: collision with root package name */
    private final View f47174a;

    /* renamed from: d, reason: collision with root package name */
    private K f47177d;

    /* renamed from: e, reason: collision with root package name */
    private K f47178e;

    /* renamed from: f, reason: collision with root package name */
    private K f47179f;

    /* renamed from: c, reason: collision with root package name */
    private int f47176c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final C5771e f47175b = C5771e.b();

    void f(Drawable drawable) {
        this.f47176c = -1;
        h(null);
        b();
    }

    private boolean a(Drawable drawable) {
        if (this.f47179f == null) {
            this.f47179f = new K();
        }
        K k10 = this.f47179f;
        k10.a();
        ColorStateList colorStateListR = ViewCompat.r(this.f47174a);
        if (colorStateListR != null) {
            k10.f46909d = true;
            k10.f46906a = colorStateListR;
        }
        PorterDuff.Mode modeS = ViewCompat.s(this.f47174a);
        if (modeS != null) {
            k10.f46908c = true;
            k10.f46907b = modeS;
        }
        if (!k10.f46909d && !k10.f46908c) {
            return false;
        }
        C5771e.i(drawable, k10, this.f47174a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f47177d != null;
    }

    void b() {
        Drawable background = this.f47174a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            K k10 = this.f47178e;
            if (k10 != null) {
                C5771e.i(background, k10, this.f47174a.getDrawableState());
                return;
            }
            K k11 = this.f47177d;
            if (k11 != null) {
                C5771e.i(background, k11, this.f47174a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        K k10 = this.f47178e;
        if (k10 != null) {
            return k10.f46906a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        K k10 = this.f47178e;
        if (k10 != null) {
            return k10.f46907b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        M mV = M.v(this.f47174a.getContext(), attributeSet, C14587j.f136452B3, i10, 0);
        View view = this.f47174a;
        ViewCompat.k0(view, view.getContext(), C14587j.f136452B3, attributeSet, mV.r(), i10, 0);
        try {
            if (mV.s(C14587j.f136457C3)) {
                this.f47176c = mV.n(C14587j.f136457C3, -1);
                ColorStateList colorStateListF = this.f47175b.f(this.f47174a.getContext(), this.f47176c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (mV.s(C14587j.f136462D3)) {
                ViewCompat.r0(this.f47174a, mV.c(C14587j.f136462D3));
            }
            if (mV.s(C14587j.f136467E3)) {
                ViewCompat.s0(this.f47174a, C5790y.e(mV.k(C14587j.f136467E3, -1), null));
            }
            mV.x();
        } catch (Throwable th2) {
            mV.x();
            throw th2;
        }
    }

    void g(int i10) {
        this.f47176c = i10;
        C5771e c5771e = this.f47175b;
        h(c5771e != null ? c5771e.f(this.f47174a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f47177d == null) {
                this.f47177d = new K();
            }
            K k10 = this.f47177d;
            k10.f46906a = colorStateList;
            k10.f46909d = true;
        } else {
            this.f47177d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f47178e == null) {
            this.f47178e = new K();
        }
        K k10 = this.f47178e;
        k10.f46906a = colorStateList;
        k10.f46909d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f47178e == null) {
            this.f47178e = new K();
        }
        K k10 = this.f47178e;
        k10.f46907b = mode;
        k10.f46908c = true;
        b();
    }

    C5768b(View view) {
        this.f47174a = view;
    }
}
