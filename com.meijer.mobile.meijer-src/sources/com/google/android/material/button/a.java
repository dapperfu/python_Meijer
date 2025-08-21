package com.google.android.material.button;

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
import ce.C6503b;
import ce.l;
import com.fullstory.FS;
import com.google.android.material.internal.x;
import d2.C13595a;
import ke.C15121a;
import qe.C16634c;
import re.C16895a;
import re.C16896b;
import te.C17234h;
import te.C17239m;
import te.InterfaceC17242p;

/* loaded from: classes4.dex */
class a {

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f87361u = true;

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f87362v = false;

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f87363a;

    /* renamed from: b, reason: collision with root package name */
    private C17239m f87364b;

    /* renamed from: c, reason: collision with root package name */
    private int f87365c;

    /* renamed from: d, reason: collision with root package name */
    private int f87366d;

    /* renamed from: e, reason: collision with root package name */
    private int f87367e;

    /* renamed from: f, reason: collision with root package name */
    private int f87368f;

    /* renamed from: g, reason: collision with root package name */
    private int f87369g;

    /* renamed from: h, reason: collision with root package name */
    private int f87370h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f87371i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f87372j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f87373k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f87374l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f87375m;

    /* renamed from: q, reason: collision with root package name */
    private boolean f87379q;

    /* renamed from: s, reason: collision with root package name */
    private LayerDrawable f87381s;

    /* renamed from: t, reason: collision with root package name */
    private int f87382t;

    /* renamed from: n, reason: collision with root package name */
    private boolean f87376n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f87377o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f87378p = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f87380r = true;

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b(LayerDrawable layerDrawable, int i10) {
        return layerDrawable instanceof Context ? FS.Resources_getDrawable((Context) layerDrawable, i10) : layerDrawable instanceof Resources ? FS.Resources_getDrawable((Resources) layerDrawable, i10) : layerDrawable.getDrawable(i10);
    }

    private C17234h n() {
        return g(true);
    }

    C17234h f() {
        return g(false);
    }

    void t() {
        this.f87377o = true;
        this.f87363a.setSupportBackgroundTintList(this.f87372j);
        this.f87363a.setSupportBackgroundTintMode(this.f87371i);
    }

    private void G(int i10, int i11) {
        int iE = ViewCompat.E(this.f87363a);
        int paddingTop = this.f87363a.getPaddingTop();
        int iD = ViewCompat.D(this.f87363a);
        int paddingBottom = this.f87363a.getPaddingBottom();
        int i12 = this.f87367e;
        int i13 = this.f87368f;
        this.f87368f = i11;
        this.f87367e = i10;
        if (!this.f87377o) {
            H();
        }
        ViewCompat.B0(this.f87363a, iE, (paddingTop + i10) - i12, iD, (paddingBottom + i11) - i13);
    }

    private void H() {
        this.f87363a.setInternalBackground(a());
        C17234h c17234hF = f();
        if (c17234hF != null) {
            c17234hF.a0(this.f87382t);
            c17234hF.setState(this.f87363a.getDrawableState());
        }
    }

    private void I(C17239m c17239m) {
        if (f87362v && !this.f87377o) {
            int iE = ViewCompat.E(this.f87363a);
            int paddingTop = this.f87363a.getPaddingTop();
            int iD = ViewCompat.D(this.f87363a);
            int paddingBottom = this.f87363a.getPaddingBottom();
            H();
            ViewCompat.B0(this.f87363a, iE, paddingTop, iD, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(c17239m);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(c17239m);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(c17239m);
        }
    }

    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f87365c, this.f87367e, this.f87366d, this.f87368f);
    }

    private Drawable a() {
        C17234h c17234h = new C17234h(this.f87364b);
        c17234h.Q(this.f87363a.getContext());
        C13595a.o(c17234h, this.f87372j);
        PorterDuff.Mode mode = this.f87371i;
        if (mode != null) {
            C13595a.p(c17234h, mode);
        }
        c17234h.j0(this.f87370h, this.f87373k);
        C17234h c17234h2 = new C17234h(this.f87364b);
        c17234h2.setTint(0);
        c17234h2.i0(this.f87370h, this.f87376n ? C15121a.d(this.f87363a, C6503b.f61556s) : 0);
        if (f87361u) {
            C17234h c17234h3 = new C17234h(this.f87364b);
            this.f87375m = c17234h3;
            C13595a.n(c17234h3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C16896b.d(this.f87374l), K(new LayerDrawable(new Drawable[]{c17234h2, c17234h})), this.f87375m);
            this.f87381s = rippleDrawable;
            return rippleDrawable;
        }
        C16895a c16895a = new C16895a(this.f87364b);
        this.f87375m = c16895a;
        C13595a.o(c16895a, C16896b.d(this.f87374l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c17234h2, c17234h, this.f87375m});
        this.f87381s = layerDrawable;
        return K(layerDrawable);
    }

    private C17234h g(boolean z10) {
        LayerDrawable layerDrawable = this.f87381s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f87361u ? (C17234h) __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b((LayerDrawable) ((InsetDrawable) __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b(this.f87381s, 0)).getDrawable(), !z10 ? 1 : 0) : (C17234h) __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b(this.f87381s, !z10 ? 1 : 0);
    }

    void A(boolean z10) {
        this.f87376n = z10;
        J();
    }

    void B(ColorStateList colorStateList) {
        if (this.f87373k != colorStateList) {
            this.f87373k = colorStateList;
            J();
        }
    }

    void C(int i10) {
        if (this.f87370h != i10) {
            this.f87370h = i10;
            J();
        }
    }

    void D(ColorStateList colorStateList) {
        if (this.f87372j != colorStateList) {
            this.f87372j = colorStateList;
            if (f() != null) {
                C13595a.o(f(), this.f87372j);
            }
        }
    }

    void E(PorterDuff.Mode mode) {
        if (this.f87371i != mode) {
            this.f87371i = mode;
            if (f() == null || this.f87371i == null) {
                return;
            }
            C13595a.p(f(), this.f87371i);
        }
    }

    void F(boolean z10) {
        this.f87380r = z10;
    }

    int b() {
        return this.f87369g;
    }

    public int c() {
        return this.f87368f;
    }

    public int d() {
        return this.f87367e;
    }

    public InterfaceC17242p e() {
        LayerDrawable layerDrawable = this.f87381s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f87381s.getNumberOfLayers() > 2 ? (InterfaceC17242p) __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b(this.f87381s, 2) : (InterfaceC17242p) __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b(this.f87381s, 1);
    }

    ColorStateList h() {
        return this.f87374l;
    }

    C17239m i() {
        return this.f87364b;
    }

    ColorStateList j() {
        return this.f87373k;
    }

    int k() {
        return this.f87370h;
    }

    ColorStateList l() {
        return this.f87372j;
    }

    PorterDuff.Mode m() {
        return this.f87371i;
    }

    boolean o() {
        return this.f87377o;
    }

    boolean p() {
        return this.f87379q;
    }

    boolean q() {
        return this.f87380r;
    }

    void r(TypedArray typedArray) {
        this.f87365c = typedArray.getDimensionPixelOffset(l.f61878E3, 0);
        this.f87366d = typedArray.getDimensionPixelOffset(l.f61890F3, 0);
        this.f87367e = typedArray.getDimensionPixelOffset(l.f61902G3, 0);
        this.f87368f = typedArray.getDimensionPixelOffset(l.f61914H3, 0);
        if (typedArray.hasValue(l.f61962L3)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(l.f61962L3, -1);
            this.f87369g = dimensionPixelSize;
            z(this.f87364b.w(dimensionPixelSize));
            this.f87378p = true;
        }
        this.f87370h = typedArray.getDimensionPixelSize(l.f62075V3, 0);
        this.f87371i = x.l(typedArray.getInt(l.f61950K3, -1), PorterDuff.Mode.SRC_IN);
        this.f87372j = C16634c.a(this.f87363a.getContext(), typedArray, l.f61938J3);
        this.f87373k = C16634c.a(this.f87363a.getContext(), typedArray, l.f62064U3);
        this.f87374l = C16634c.a(this.f87363a.getContext(), typedArray, l.f62053T3);
        this.f87379q = typedArray.getBoolean(l.f61926I3, false);
        this.f87382t = typedArray.getDimensionPixelSize(l.f61974M3, 0);
        this.f87380r = typedArray.getBoolean(l.f62086W3, true);
        int iE = ViewCompat.E(this.f87363a);
        int paddingTop = this.f87363a.getPaddingTop();
        int iD = ViewCompat.D(this.f87363a);
        int paddingBottom = this.f87363a.getPaddingBottom();
        if (typedArray.hasValue(l.f61866D3)) {
            t();
        } else {
            H();
        }
        ViewCompat.B0(this.f87363a, iE + this.f87365c, paddingTop + this.f87367e, iD + this.f87366d, paddingBottom + this.f87368f);
    }

    void u(boolean z10) {
        this.f87379q = z10;
    }

    void v(int i10) {
        if (this.f87378p && this.f87369g == i10) {
            return;
        }
        this.f87369g = i10;
        this.f87378p = true;
        z(this.f87364b.w(i10));
    }

    public void w(int i10) {
        G(this.f87367e, i10);
    }

    public void x(int i10) {
        G(i10, this.f87368f);
    }

    void y(ColorStateList colorStateList) {
        if (this.f87374l != colorStateList) {
            this.f87374l = colorStateList;
            boolean z10 = f87361u;
            if (z10 && (this.f87363a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f87363a.getBackground()).setColor(C16896b.d(colorStateList));
            } else {
                if (z10 || !(this.f87363a.getBackground() instanceof C16895a)) {
                    return;
                }
                ((C16895a) this.f87363a.getBackground()).setTintList(C16896b.d(colorStateList));
            }
        }
    }

    void z(C17239m c17239m) {
        this.f87364b = c17239m;
        I(c17239m);
    }

    a(MaterialButton materialButton, C17239m c17239m) {
        this.f87363a = materialButton;
        this.f87364b = c17239m;
    }

    private void J() {
        int iD;
        C17234h c17234hF = f();
        C17234h c17234hN = n();
        if (c17234hF != null) {
            c17234hF.j0(this.f87370h, this.f87373k);
            if (c17234hN != null) {
                float f10 = this.f87370h;
                if (this.f87376n) {
                    iD = C15121a.d(this.f87363a, C6503b.f61556s);
                } else {
                    iD = 0;
                }
                c17234hN.i0(f10, iD);
            }
        }
    }

    void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }
}
