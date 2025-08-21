package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import i.C14587j;
import j.C14879a;

/* renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5775i {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f47205a;

    /* renamed from: b, reason: collision with root package name */
    private K f47206b;

    /* renamed from: c, reason: collision with root package name */
    private K f47207c;

    /* renamed from: d, reason: collision with root package name */
    private K f47208d;

    /* renamed from: e, reason: collision with root package name */
    private int f47209e = 0;

    private boolean a(Drawable drawable) {
        if (this.f47208d == null) {
            this.f47208d = new K();
        }
        K k10 = this.f47208d;
        k10.a();
        ColorStateList colorStateListA = androidx.core.widget.g.a(this.f47205a);
        if (colorStateListA != null) {
            k10.f46909d = true;
            k10.f46906a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.g.b(this.f47205a);
        if (modeB != null) {
            k10.f46908c = true;
            k10.f46907b = modeB;
        }
        if (!k10.f46909d && !k10.f46908c) {
            return false;
        }
        C5771e.i(drawable, k10, this.f47205a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f47206b != null;
    }

    void b() {
        if (this.f47205a.getDrawable() != null) {
            this.f47205a.getDrawable().setLevel(this.f47209e);
        }
    }

    void c() {
        Drawable drawable = this.f47205a.getDrawable();
        if (drawable != null) {
            C5790y.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            K k10 = this.f47207c;
            if (k10 != null) {
                C5771e.i(drawable, k10, this.f47205a.getDrawableState());
                return;
            }
            K k11 = this.f47206b;
            if (k11 != null) {
                C5771e.i(drawable, k11, this.f47205a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        K k10 = this.f47207c;
        if (k10 != null) {
            return k10.f46906a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        K k10 = this.f47207c;
        if (k10 != null) {
            return k10.f46907b;
        }
        return null;
    }

    boolean f() {
        return !(this.f47205a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        M mV = M.v(this.f47205a.getContext(), attributeSet, C14587j.f136512P, i10, 0);
        ImageView imageView = this.f47205a;
        ViewCompat.k0(imageView, imageView.getContext(), C14587j.f136512P, attributeSet, mV.r(), i10, 0);
        try {
            Drawable drawable = this.f47205a.getDrawable();
            if (drawable == null && (iN = mV.n(C14587j.f136516Q, -1)) != -1 && (drawable = C14879a.b(this.f47205a.getContext(), iN)) != null) {
                this.f47205a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C5790y.b(drawable);
            }
            if (mV.s(C14587j.f136520R)) {
                androidx.core.widget.g.c(this.f47205a, mV.c(C14587j.f136520R));
            }
            if (mV.s(C14587j.f136524S)) {
                androidx.core.widget.g.d(this.f47205a, C5790y.e(mV.k(C14587j.f136524S, -1), null));
            }
            mV.x();
        } catch (Throwable th2) {
            mV.x();
            throw th2;
        }
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = C14879a.b(this.f47205a.getContext(), i10);
            if (drawableB != null) {
                C5790y.b(drawableB);
            }
            this.f47205a.setImageDrawable(drawableB);
        } else {
            this.f47205a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f47207c == null) {
            this.f47207c = new K();
        }
        K k10 = this.f47207c;
        k10.f46906a = colorStateList;
        k10.f46909d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f47207c == null) {
            this.f47207c = new K();
        }
        K k10 = this.f47207c;
        k10.f46907b = mode;
        k10.f46908c = true;
        c();
    }

    public C5775i(ImageView imageView) {
        this.f47205a = imageView;
    }

    void h(Drawable drawable) {
        this.f47209e = drawable.getLevel();
    }
}
