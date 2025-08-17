package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import i.C14584j;

/* renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5626b {

    /* renamed from: a, reason: collision with root package name */
    private final View f46950a;

    /* renamed from: d, reason: collision with root package name */
    private K f46953d;

    /* renamed from: e, reason: collision with root package name */
    private K f46954e;

    /* renamed from: f, reason: collision with root package name */
    private K f46955f;

    /* renamed from: c, reason: collision with root package name */
    private int f46952c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final C5629e f46951b = C5629e.b();

    void f(Drawable drawable) {
        this.f46952c = -1;
        h(null);
        b();
    }

    private boolean a(Drawable drawable) {
        if (this.f46955f == null) {
            this.f46955f = new K();
        }
        K k10 = this.f46955f;
        k10.a();
        ColorStateList colorStateListR = ViewCompat.r(this.f46950a);
        if (colorStateListR != null) {
            k10.f46685d = true;
            k10.f46682a = colorStateListR;
        }
        PorterDuff.Mode modeS = ViewCompat.s(this.f46950a);
        if (modeS != null) {
            k10.f46684c = true;
            k10.f46683b = modeS;
        }
        if (!k10.f46685d && !k10.f46684c) {
            return false;
        }
        C5629e.i(drawable, k10, this.f46950a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f46953d != null;
    }

    void b() {
        Drawable background = this.f46950a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            K k10 = this.f46954e;
            if (k10 != null) {
                C5629e.i(background, k10, this.f46950a.getDrawableState());
                return;
            }
            K k11 = this.f46953d;
            if (k11 != null) {
                C5629e.i(background, k11, this.f46950a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        K k10 = this.f46954e;
        if (k10 != null) {
            return k10.f46682a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        K k10 = this.f46954e;
        if (k10 != null) {
            return k10.f46683b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        M mV = M.v(this.f46950a.getContext(), attributeSet, C14584j.f136695B3, i10, 0);
        View view = this.f46950a;
        ViewCompat.k0(view, view.getContext(), C14584j.f136695B3, attributeSet, mV.r(), i10, 0);
        try {
            if (mV.s(C14584j.f136700C3)) {
                this.f46952c = mV.n(C14584j.f136700C3, -1);
                ColorStateList colorStateListF = this.f46951b.f(this.f46950a.getContext(), this.f46952c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (mV.s(C14584j.f136705D3)) {
                ViewCompat.r0(this.f46950a, mV.c(C14584j.f136705D3));
            }
            if (mV.s(C14584j.f136710E3)) {
                ViewCompat.s0(this.f46950a, C5648y.e(mV.k(C14584j.f136710E3, -1), null));
            }
            mV.x();
        } catch (Throwable th2) {
            mV.x();
            throw th2;
        }
    }

    void g(int i10) {
        this.f46952c = i10;
        C5629e c5629e = this.f46951b;
        h(c5629e != null ? c5629e.f(this.f46950a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f46953d == null) {
                this.f46953d = new K();
            }
            K k10 = this.f46953d;
            k10.f46682a = colorStateList;
            k10.f46685d = true;
        } else {
            this.f46953d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f46954e == null) {
            this.f46954e = new K();
        }
        K k10 = this.f46954e;
        k10.f46682a = colorStateList;
        k10.f46685d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f46954e == null) {
            this.f46954e = new K();
        }
        K k10 = this.f46954e;
        k10.f46683b = mode;
        k10.f46684c = true;
        b();
    }

    C5626b(View view) {
        this.f46950a = view;
    }
}
