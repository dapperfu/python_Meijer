package com.google.android.material.card;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import ce.C6503b;
import ce.f;
import ce.k;
import ce.l;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d2.C13595a;
import de.C13661a;
import ke.C15121a;
import pe.i;
import qe.C16634c;
import re.C16896b;
import te.C17230d;
import te.C17231e;
import te.C17234h;
import te.C17238l;
import te.C17239m;

/* loaded from: classes4.dex */
class b {

    /* renamed from: A, reason: collision with root package name */
    private static final Drawable f87393A;

    /* renamed from: z, reason: collision with root package name */
    private static final double f87394z = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a, reason: collision with root package name */
    private final MaterialCardView f87395a;

    /* renamed from: c, reason: collision with root package name */
    private final C17234h f87397c;

    /* renamed from: d, reason: collision with root package name */
    private final C17234h f87398d;

    /* renamed from: e, reason: collision with root package name */
    private int f87399e;

    /* renamed from: f, reason: collision with root package name */
    private int f87400f;

    /* renamed from: g, reason: collision with root package name */
    private int f87401g;

    /* renamed from: h, reason: collision with root package name */
    private int f87402h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f87403i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f87404j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f87405k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f87406l;

    /* renamed from: m, reason: collision with root package name */
    private C17239m f87407m;

    /* renamed from: n, reason: collision with root package name */
    private ColorStateList f87408n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f87409o;

    /* renamed from: p, reason: collision with root package name */
    private LayerDrawable f87410p;

    /* renamed from: q, reason: collision with root package name */
    private C17234h f87411q;

    /* renamed from: r, reason: collision with root package name */
    private C17234h f87412r;

    /* renamed from: t, reason: collision with root package name */
    private boolean f87414t;

    /* renamed from: u, reason: collision with root package name */
    private ValueAnimator f87415u;

    /* renamed from: v, reason: collision with root package name */
    private final TimeInterpolator f87416v;

    /* renamed from: w, reason: collision with root package name */
    private final int f87417w;

    /* renamed from: x, reason: collision with root package name */
    private final int f87418x;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f87396b = new Rect();

    /* renamed from: s, reason: collision with root package name */
    private boolean f87413s = false;

    /* renamed from: y, reason: collision with root package name */
    private float f87419y = 0.0f;

    class a extends InsetDrawable {
        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }

        a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }
    }

    public void O(boolean z10) {
        P(z10, false);
    }

    private Drawable D(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f87395a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(f());
            iCeil = (int) Math.ceil(e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    private boolean G() {
        return (this.f87401g & 80) == 80;
    }

    private boolean H() {
        return (this.f87401g & 8388613) == 8388613;
    }

    private float c() {
        return Math.max(Math.max(d(this.f87407m.q(), this.f87397c.J()), d(this.f87407m.s(), this.f87397c.K())), Math.max(d(this.f87407m.k(), this.f87397c.t()), d(this.f87407m.i(), this.f87397c.s())));
    }

    private boolean c0() {
        return this.f87395a.getPreventCornerOverlap() && !g();
    }

    private float d(C17230d c17230d, float f10) {
        if (c17230d instanceof C17238l) {
            return (float) ((1.0d - f87394z) * f10);
        }
        if (c17230d instanceof C17231e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    private boolean d0() {
        return this.f87395a.getPreventCornerOverlap() && g() && this.f87395a.getUseCompatPadding();
    }

    private float e() {
        return this.f87395a.getMaxCardElevation() + (d0() ? c() : 0.0f);
    }

    private boolean e0() {
        if (this.f87395a.isClickable()) {
            return true;
        }
        View view = this.f87395a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    private float f() {
        return (this.f87395a.getMaxCardElevation() * 1.5f) + (d0() ? c() : 0.0f);
    }

    private boolean g() {
        return this.f87397c.T();
    }

    private Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C17234h c17234hJ = j();
        this.f87411q = c17234hJ;
        c17234hJ.b0(this.f87405k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f87411q);
        return stateListDrawable;
    }

    private Drawable i() {
        if (!C16896b.f159474a) {
            return h();
        }
        this.f87412r = j();
        return new RippleDrawable(this.f87405k, null, this.f87412r);
    }

    private void i0(Drawable drawable) {
        if (this.f87395a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f87395a.getForeground()).setDrawable(drawable);
        } else {
            this.f87395a.setForeground(D(drawable));
        }
    }

    private C17234h j() {
        return new C17234h(this.f87407m);
    }

    private void k0() {
        Drawable drawable;
        if (C16896b.f159474a && (drawable = this.f87409o) != null) {
            ((RippleDrawable) drawable).setColor(this.f87405k);
            return;
        }
        C17234h c17234h = this.f87411q;
        if (c17234h != null) {
            c17234h.b0(this.f87405k);
        }
    }

    private Drawable t() {
        if (this.f87409o == null) {
            this.f87409o = i();
        }
        if (this.f87410p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f87409o, this.f87398d, this.f87404j});
            this.f87410p = layerDrawable;
            layerDrawable.setId(2, f.f61676G);
        }
        return this.f87410p;
    }

    private float v() {
        if (this.f87395a.getPreventCornerOverlap() && this.f87395a.getUseCompatPadding()) {
            return (float) ((1.0d - f87394z) * this.f87395a.getCardViewRadius());
        }
        return 0.0f;
    }

    ColorStateList A() {
        return this.f87408n;
    }

    int B() {
        return this.f87402h;
    }

    Rect C() {
        return this.f87396b;
    }

    boolean E() {
        return this.f87413s;
    }

    boolean F() {
        return this.f87414t;
    }

    void I(TypedArray typedArray) {
        ColorStateList colorStateListA = C16634c.a(this.f87395a.getContext(), typedArray, l.f61903G4);
        this.f87408n = colorStateListA;
        if (colorStateListA == null) {
            this.f87408n = ColorStateList.valueOf(-1);
        }
        this.f87402h = typedArray.getDimensionPixelSize(l.f61915H4, 0);
        boolean z10 = typedArray.getBoolean(l.f62419y4, false);
        this.f87414t = z10;
        this.f87395a.setLongClickable(z10);
        this.f87406l = C16634c.a(this.f87395a.getContext(), typedArray, l.f61879E4);
        Q(C16634c.d(this.f87395a.getContext(), typedArray, l.f61831A4));
        T(typedArray.getDimensionPixelSize(l.f61867D4, 0));
        S(typedArray.getDimensionPixelSize(l.f61855C4, 0));
        this.f87401g = typedArray.getInteger(l.f61843B4, 8388661);
        ColorStateList colorStateListA2 = C16634c.a(this.f87395a.getContext(), typedArray, l.f61891F4);
        this.f87405k = colorStateListA2;
        if (colorStateListA2 == null) {
            this.f87405k = ColorStateList.valueOf(C15121a.d(this.f87395a, C6503b.f61542l));
        }
        M(C16634c.a(this.f87395a.getContext(), typedArray, l.f62431z4));
        k0();
        h0();
        l0();
        this.f87395a.setBackgroundInternal(D(this.f87397c));
        Drawable drawableT = e0() ? t() : this.f87398d;
        this.f87403i = drawableT;
        this.f87395a.setForeground(D(drawableT));
    }

    void J(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f87410p != null) {
            if (this.f87395a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(f() * 2.0f);
                iCeil2 = (int) Math.ceil(e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = H() ? ((i10 - this.f87399e) - this.f87400f) - iCeil2 : this.f87399e;
            int i15 = G() ? this.f87399e : ((i11 - this.f87399e) - this.f87400f) - iCeil;
            int i16 = H() ? this.f87399e : ((i10 - this.f87399e) - this.f87400f) - iCeil2;
            int i17 = G() ? ((i11 - this.f87399e) - this.f87400f) - iCeil : this.f87399e;
            if (ViewCompat.z(this.f87395a) == 1) {
                i13 = i16;
                i12 = i14;
            } else {
                i12 = i16;
                i13 = i14;
            }
            this.f87410p.setLayerInset(2, i13, i17, i12, i15);
        }
    }

    void K(boolean z10) {
        this.f87413s = z10;
    }

    void L(ColorStateList colorStateList) {
        this.f87397c.b0(colorStateList);
    }

    void M(ColorStateList colorStateList) {
        C17234h c17234h = this.f87398d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c17234h.b0(colorStateList);
    }

    void N(boolean z10) {
        this.f87414t = z10;
    }

    public void P(boolean z10, boolean z11) {
        Drawable drawable = this.f87404j;
        if (drawable != null) {
            if (z11) {
                b(z10);
            } else {
                drawable.setAlpha(z10 ? l3.f93323c : 0);
                this.f87419y = z10 ? 1.0f : 0.0f;
            }
        }
    }

    void Q(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = C13595a.r(drawable).mutate();
            this.f87404j = drawableMutate;
            C13595a.o(drawableMutate, this.f87406l);
            O(this.f87395a.isChecked());
        } else {
            this.f87404j = f87393A;
        }
        LayerDrawable layerDrawable = this.f87410p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(f.f61676G, this.f87404j);
        }
    }

    void R(int i10) {
        this.f87401g = i10;
        J(this.f87395a.getMeasuredWidth(), this.f87395a.getMeasuredHeight());
    }

    void S(int i10) {
        this.f87399e = i10;
    }

    void T(int i10) {
        this.f87400f = i10;
    }

    void U(ColorStateList colorStateList) {
        this.f87406l = colorStateList;
        Drawable drawable = this.f87404j;
        if (drawable != null) {
            C13595a.o(drawable, colorStateList);
        }
    }

    void V(float f10) {
        Y(this.f87407m.w(f10));
        this.f87403i.invalidateSelf();
        if (d0() || c0()) {
            g0();
        }
        if (d0()) {
            j0();
        }
    }

    void W(float f10) {
        this.f87397c.c0(f10);
        C17234h c17234h = this.f87398d;
        if (c17234h != null) {
            c17234h.c0(f10);
        }
        C17234h c17234h2 = this.f87412r;
        if (c17234h2 != null) {
            c17234h2.c0(f10);
        }
    }

    void X(ColorStateList colorStateList) {
        this.f87405k = colorStateList;
        k0();
    }

    void Y(C17239m c17239m) {
        this.f87407m = c17239m;
        this.f87397c.setShapeAppearanceModel(c17239m);
        this.f87397c.f0(!r0.T());
        C17234h c17234h = this.f87398d;
        if (c17234h != null) {
            c17234h.setShapeAppearanceModel(c17239m);
        }
        C17234h c17234h2 = this.f87412r;
        if (c17234h2 != null) {
            c17234h2.setShapeAppearanceModel(c17239m);
        }
        C17234h c17234h3 = this.f87411q;
        if (c17234h3 != null) {
            c17234h3.setShapeAppearanceModel(c17239m);
        }
    }

    void Z(ColorStateList colorStateList) {
        if (this.f87408n == colorStateList) {
            return;
        }
        this.f87408n = colorStateList;
        l0();
    }

    void a0(int i10) {
        if (i10 == this.f87402h) {
            return;
        }
        this.f87402h = i10;
        l0();
    }

    public void b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f87419y : this.f87419y;
        ValueAnimator valueAnimator = this.f87415u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f87415u = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f87419y, f10);
        this.f87415u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.a(this.f87392a, valueAnimator2);
            }
        });
        this.f87415u.setInterpolator(this.f87416v);
        this.f87415u.setDuration((long) ((z10 ? this.f87417w : this.f87418x) * f11));
        this.f87415u.start();
    }

    void b0(int i10, int i11, int i12, int i13) {
        this.f87396b.set(i10, i11, i12, i13);
        g0();
    }

    void f0() {
        Drawable drawable = this.f87403i;
        Drawable drawableT = e0() ? t() : this.f87398d;
        this.f87403i = drawableT;
        if (drawable != drawableT) {
            i0(drawableT);
        }
    }

    void h0() {
        this.f87397c.a0(this.f87395a.getCardElevation());
    }

    void k() {
        Drawable drawable = this.f87409o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f87409o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f87409o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    C17234h l() {
        return this.f87397c;
    }

    void l0() {
        this.f87398d.j0(this.f87402h, this.f87408n);
    }

    ColorStateList m() {
        return this.f87397c.x();
    }

    ColorStateList n() {
        return this.f87398d.x();
    }

    Drawable o() {
        return this.f87404j;
    }

    int p() {
        return this.f87401g;
    }

    int q() {
        return this.f87399e;
    }

    int r() {
        return this.f87400f;
    }

    ColorStateList s() {
        return this.f87406l;
    }

    float u() {
        return this.f87397c.J();
    }

    float w() {
        return this.f87397c.y();
    }

    ColorStateList x() {
        return this.f87405k;
    }

    C17239m y() {
        return this.f87407m;
    }

    int z() {
        ColorStateList colorStateList = this.f87408n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public b(MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f87395a = materialCardView;
        C17234h c17234h = new C17234h(materialCardView.getContext(), attributeSet, i10, i11);
        this.f87397c = c17234h;
        c17234h.Q(materialCardView.getContext());
        c17234h.g0(-12303292);
        C17239m.b bVarV = c17234h.E().v();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, l.f61947K0, i10, k.f61800a);
        if (typedArrayObtainStyledAttributes.hasValue(l.f61959L0)) {
            bVarV.o(typedArrayObtainStyledAttributes.getDimension(l.f61959L0, 0.0f));
        }
        this.f87398d = new C17234h();
        Y(bVarV.m());
        this.f87416v = i.g(materialCardView.getContext(), C6503b.f61513T, C13661a.f128350a);
        this.f87417w = i.f(materialCardView.getContext(), C6503b.f61507N, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
        this.f87418x = i.f(materialCardView.getContext(), C6503b.f61506M, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.f87404j.setAlpha((int) (255.0f * fFloatValue));
        bVar.f87419y = fFloatValue;
    }

    void g0() {
        float fC;
        if (!c0() && !d0()) {
            fC = 0.0f;
        } else {
            fC = c();
        }
        int iV = (int) (fC - v());
        MaterialCardView materialCardView = this.f87395a;
        Rect rect = this.f87396b;
        materialCardView.j(rect.left + iV, rect.top + iV, rect.right + iV, rect.bottom + iV);
    }

    void j0() {
        if (!E()) {
            this.f87395a.setBackgroundInternal(D(this.f87397c));
        }
        this.f87395a.setForeground(D(this.f87403i));
    }

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f87393A = colorDrawable;
    }
}
