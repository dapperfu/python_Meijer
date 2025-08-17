package com.google.android.material.button;

import ae.C5597b;
import ae.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import com.google.android.material.internal.x;
import d2.C13462a;
import ie.C14718a;
import oe.C16026c;
import pe.C16291a;
import pe.C16292b;
import re.C16760h;
import re.C16765m;
import re.InterfaceC16768p;

/* loaded from: classes4.dex */
class a {

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f86521u = true;

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f86522v = false;

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f86523a;

    /* renamed from: b, reason: collision with root package name */
    private C16765m f86524b;

    /* renamed from: c, reason: collision with root package name */
    private int f86525c;

    /* renamed from: d, reason: collision with root package name */
    private int f86526d;

    /* renamed from: e, reason: collision with root package name */
    private int f86527e;

    /* renamed from: f, reason: collision with root package name */
    private int f86528f;

    /* renamed from: g, reason: collision with root package name */
    private int f86529g;

    /* renamed from: h, reason: collision with root package name */
    private int f86530h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f86531i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f86532j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f86533k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f86534l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f86535m;

    /* renamed from: q, reason: collision with root package name */
    private boolean f86539q;

    /* renamed from: s, reason: collision with root package name */
    private LayerDrawable f86541s;

    /* renamed from: t, reason: collision with root package name */
    private int f86542t;

    /* renamed from: n, reason: collision with root package name */
    private boolean f86536n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f86537o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f86538p = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f86540r = true;

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b(LayerDrawable layerDrawable, int i10) {
        return layerDrawable instanceof Context ? FS.Resources_getDrawable((Context) layerDrawable, i10) : layerDrawable instanceof Resources ? FS.Resources_getDrawable((Resources) layerDrawable, i10) : layerDrawable.getDrawable(i10);
    }

    private C16760h n() {
        return g(true);
    }

    C16760h f() {
        return g(false);
    }

    void t() {
        this.f86537o = true;
        this.f86523a.setSupportBackgroundTintList(this.f86532j);
        this.f86523a.setSupportBackgroundTintMode(this.f86531i);
    }

    private void G(int i10, int i11) {
        int iE = ViewCompat.E(this.f86523a);
        int paddingTop = this.f86523a.getPaddingTop();
        int iD = ViewCompat.D(this.f86523a);
        int paddingBottom = this.f86523a.getPaddingBottom();
        int i12 = this.f86527e;
        int i13 = this.f86528f;
        this.f86528f = i11;
        this.f86527e = i10;
        if (!this.f86537o) {
            H();
        }
        ViewCompat.B0(this.f86523a, iE, (paddingTop + i10) - i12, iD, (paddingBottom + i11) - i13);
    }

    private void H() {
        this.f86523a.setInternalBackground(a());
        C16760h c16760hF = f();
        if (c16760hF != null) {
            c16760hF.a0(this.f86542t);
            c16760hF.setState(this.f86523a.getDrawableState());
        }
    }

    private void I(C16765m c16765m) {
        if (f86522v && !this.f86537o) {
            int iE = ViewCompat.E(this.f86523a);
            int paddingTop = this.f86523a.getPaddingTop();
            int iD = ViewCompat.D(this.f86523a);
            int paddingBottom = this.f86523a.getPaddingBottom();
            H();
            ViewCompat.B0(this.f86523a, iE, paddingTop, iD, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(c16765m);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(c16765m);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(c16765m);
        }
    }

    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f86525c, this.f86527e, this.f86526d, this.f86528f);
    }

    private Drawable a() {
        C16760h c16760h = new C16760h(this.f86524b);
        c16760h.Q(this.f86523a.getContext());
        C13462a.o(c16760h, this.f86532j);
        PorterDuff.Mode mode = this.f86531i;
        if (mode != null) {
            C13462a.p(c16760h, mode);
        }
        c16760h.j0(this.f86530h, this.f86533k);
        C16760h c16760h2 = new C16760h(this.f86524b);
        c16760h2.setTint(0);
        c16760h2.i0(this.f86530h, this.f86536n ? C14718a.d(this.f86523a, C5597b.f44541s) : 0);
        if (f86521u) {
            C16760h c16760h3 = new C16760h(this.f86524b);
            this.f86535m = c16760h3;
            C13462a.n(c16760h3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C16292b.d(this.f86534l), K(new LayerDrawable(new Drawable[]{c16760h2, c16760h})), this.f86535m);
            this.f86541s = rippleDrawable;
            return rippleDrawable;
        }
        C16291a c16291a = new C16291a(this.f86524b);
        this.f86535m = c16291a;
        C13462a.o(c16291a, C16292b.d(this.f86534l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c16760h2, c16760h, this.f86535m});
        this.f86541s = layerDrawable;
        return K(layerDrawable);
    }

    private C16760h g(boolean z10) {
        LayerDrawable layerDrawable = this.f86541s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f86521u ? (C16760h) __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b((LayerDrawable) ((InsetDrawable) __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b(this.f86541s, 0)).getDrawable(), !z10 ? 1 : 0) : (C16760h) __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b(this.f86541s, !z10 ? 1 : 0);
    }

    void A(boolean z10) {
        this.f86536n = z10;
        J();
    }

    void B(ColorStateList colorStateList) {
        if (this.f86533k != colorStateList) {
            this.f86533k = colorStateList;
            J();
        }
    }

    void C(int i10) {
        if (this.f86530h != i10) {
            this.f86530h = i10;
            J();
        }
    }

    void D(ColorStateList colorStateList) {
        if (this.f86532j != colorStateList) {
            this.f86532j = colorStateList;
            if (f() != null) {
                C13462a.o(f(), this.f86532j);
            }
        }
    }

    void E(PorterDuff.Mode mode) {
        if (this.f86531i != mode) {
            this.f86531i = mode;
            if (f() == null || this.f86531i == null) {
                return;
            }
            C13462a.p(f(), this.f86531i);
        }
    }

    void F(boolean z10) {
        this.f86540r = z10;
    }

    int b() {
        return this.f86529g;
    }

    public int c() {
        return this.f86528f;
    }

    public int d() {
        return this.f86527e;
    }

    public InterfaceC16768p e() {
        LayerDrawable layerDrawable = this.f86541s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f86541s.getNumberOfLayers() > 2 ? (InterfaceC16768p) __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b(this.f86541s, 2) : (InterfaceC16768p) __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b(this.f86541s, 1);
    }

    ColorStateList h() {
        return this.f86534l;
    }

    C16765m i() {
        return this.f86524b;
    }

    ColorStateList j() {
        return this.f86533k;
    }

    int k() {
        return this.f86530h;
    }

    ColorStateList l() {
        return this.f86532j;
    }

    PorterDuff.Mode m() {
        return this.f86531i;
    }

    boolean o() {
        return this.f86537o;
    }

    boolean p() {
        return this.f86539q;
    }

    boolean q() {
        return this.f86540r;
    }

    void r(TypedArray typedArray) {
        this.f86525c = typedArray.getDimensionPixelOffset(l.f44863E3, 0);
        this.f86526d = typedArray.getDimensionPixelOffset(l.f44875F3, 0);
        this.f86527e = typedArray.getDimensionPixelOffset(l.f44887G3, 0);
        this.f86528f = typedArray.getDimensionPixelOffset(l.f44899H3, 0);
        if (typedArray.hasValue(l.f44947L3)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(l.f44947L3, -1);
            this.f86529g = dimensionPixelSize;
            z(this.f86524b.w(dimensionPixelSize));
            this.f86538p = true;
        }
        this.f86530h = typedArray.getDimensionPixelSize(l.f45060V3, 0);
        this.f86531i = x.l(typedArray.getInt(l.f44935K3, -1), PorterDuff.Mode.SRC_IN);
        this.f86532j = C16026c.a(this.f86523a.getContext(), typedArray, l.f44923J3);
        this.f86533k = C16026c.a(this.f86523a.getContext(), typedArray, l.f45049U3);
        this.f86534l = C16026c.a(this.f86523a.getContext(), typedArray, l.f45038T3);
        this.f86539q = typedArray.getBoolean(l.f44911I3, false);
        this.f86542t = typedArray.getDimensionPixelSize(l.f44959M3, 0);
        this.f86540r = typedArray.getBoolean(l.f45071W3, true);
        int iE = ViewCompat.E(this.f86523a);
        int paddingTop = this.f86523a.getPaddingTop();
        int iD = ViewCompat.D(this.f86523a);
        int paddingBottom = this.f86523a.getPaddingBottom();
        if (typedArray.hasValue(l.f44851D3)) {
            t();
        } else {
            H();
        }
        ViewCompat.B0(this.f86523a, iE + this.f86525c, paddingTop + this.f86527e, iD + this.f86526d, paddingBottom + this.f86528f);
    }

    void u(boolean z10) {
        this.f86539q = z10;
    }

    void v(int i10) {
        if (this.f86538p && this.f86529g == i10) {
            return;
        }
        this.f86529g = i10;
        this.f86538p = true;
        z(this.f86524b.w(i10));
    }

    public void w(int i10) {
        G(this.f86527e, i10);
    }

    public void x(int i10) {
        G(i10, this.f86528f);
    }

    void y(ColorStateList colorStateList) {
        if (this.f86534l != colorStateList) {
            this.f86534l = colorStateList;
            boolean z10 = f86521u;
            if (z10 && (this.f86523a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f86523a.getBackground()).setColor(C16292b.d(colorStateList));
            } else {
                if (z10 || !(this.f86523a.getBackground() instanceof C16291a)) {
                    return;
                }
                ((C16291a) this.f86523a.getBackground()).setTintList(C16292b.d(colorStateList));
            }
        }
    }

    void z(C16765m c16765m) {
        this.f86524b = c16765m;
        I(c16765m);
    }

    a(MaterialButton materialButton, C16765m c16765m) {
        this.f86523a = materialButton;
        this.f86524b = c16765m;
    }

    private void J() {
        int iD;
        C16760h c16760hF = f();
        C16760h c16760hN = n();
        if (c16760hF != null) {
            c16760hF.j0(this.f86530h, this.f86533k);
            if (c16760hN != null) {
                float f10 = this.f86530h;
                if (this.f86536n) {
                    iD = C14718a.d(this.f86523a, C5597b.f44541s);
                } else {
                    iD = 0;
                }
                c16760hN.i0(f10, iD);
            }
        }
    }

    void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }
}
