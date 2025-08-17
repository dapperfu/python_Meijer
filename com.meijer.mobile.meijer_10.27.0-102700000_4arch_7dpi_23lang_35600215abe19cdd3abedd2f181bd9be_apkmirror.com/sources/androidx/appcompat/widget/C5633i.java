package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import i.C14584j;
import j.C14791a;

/* renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5633i {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f46981a;

    /* renamed from: b, reason: collision with root package name */
    private K f46982b;

    /* renamed from: c, reason: collision with root package name */
    private K f46983c;

    /* renamed from: d, reason: collision with root package name */
    private K f46984d;

    /* renamed from: e, reason: collision with root package name */
    private int f46985e = 0;

    private boolean a(Drawable drawable) {
        if (this.f46984d == null) {
            this.f46984d = new K();
        }
        K k10 = this.f46984d;
        k10.a();
        ColorStateList colorStateListA = androidx.core.widget.g.a(this.f46981a);
        if (colorStateListA != null) {
            k10.f46685d = true;
            k10.f46682a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.g.b(this.f46981a);
        if (modeB != null) {
            k10.f46684c = true;
            k10.f46683b = modeB;
        }
        if (!k10.f46685d && !k10.f46684c) {
            return false;
        }
        C5629e.i(drawable, k10, this.f46981a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f46982b != null;
    }

    void b() {
        if (this.f46981a.getDrawable() != null) {
            this.f46981a.getDrawable().setLevel(this.f46985e);
        }
    }

    void c() {
        Drawable drawable = this.f46981a.getDrawable();
        if (drawable != null) {
            C5648y.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            K k10 = this.f46983c;
            if (k10 != null) {
                C5629e.i(drawable, k10, this.f46981a.getDrawableState());
                return;
            }
            K k11 = this.f46982b;
            if (k11 != null) {
                C5629e.i(drawable, k11, this.f46981a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        K k10 = this.f46983c;
        if (k10 != null) {
            return k10.f46682a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        K k10 = this.f46983c;
        if (k10 != null) {
            return k10.f46683b;
        }
        return null;
    }

    boolean f() {
        return !(this.f46981a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        M mV = M.v(this.f46981a.getContext(), attributeSet, C14584j.f136755P, i10, 0);
        ImageView imageView = this.f46981a;
        ViewCompat.k0(imageView, imageView.getContext(), C14584j.f136755P, attributeSet, mV.r(), i10, 0);
        try {
            Drawable drawable = this.f46981a.getDrawable();
            if (drawable == null && (iN = mV.n(C14584j.f136759Q, -1)) != -1 && (drawable = C14791a.b(this.f46981a.getContext(), iN)) != null) {
                this.f46981a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C5648y.b(drawable);
            }
            if (mV.s(C14584j.f136763R)) {
                androidx.core.widget.g.c(this.f46981a, mV.c(C14584j.f136763R));
            }
            if (mV.s(C14584j.f136767S)) {
                androidx.core.widget.g.d(this.f46981a, C5648y.e(mV.k(C14584j.f136767S, -1), null));
            }
            mV.x();
        } catch (Throwable th2) {
            mV.x();
            throw th2;
        }
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = C14791a.b(this.f46981a.getContext(), i10);
            if (drawableB != null) {
                C5648y.b(drawableB);
            }
            this.f46981a.setImageDrawable(drawableB);
        } else {
            this.f46981a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f46983c == null) {
            this.f46983c = new K();
        }
        K k10 = this.f46983c;
        k10.f46682a = colorStateList;
        k10.f46685d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f46983c == null) {
            this.f46983c = new K();
        }
        K k10 = this.f46983c;
        k10.f46683b = mode;
        k10.f46684c = true;
        c();
    }

    public C5633i(ImageView imageView) {
        this.f46981a = imageView;
    }

    void h(Drawable drawable) {
        this.f46985e = drawable.getLevel();
    }
}
