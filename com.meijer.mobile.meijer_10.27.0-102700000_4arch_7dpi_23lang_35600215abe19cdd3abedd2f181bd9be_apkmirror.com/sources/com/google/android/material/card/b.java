package com.google.android.material.card;

import ae.C5597b;
import ae.f;
import ae.k;
import ae.l;
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
import be.C6230a;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d2.C13462a;
import ie.C14718a;
import ne.i;
import oe.C16026c;
import pe.C16292b;
import re.C16756d;
import re.C16757e;
import re.C16760h;
import re.C16764l;
import re.C16765m;

/* loaded from: classes4.dex */
class b {

    /* renamed from: A, reason: collision with root package name */
    private static final Drawable f86553A;

    /* renamed from: z, reason: collision with root package name */
    private static final double f86554z = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a, reason: collision with root package name */
    private final MaterialCardView f86555a;

    /* renamed from: c, reason: collision with root package name */
    private final C16760h f86557c;

    /* renamed from: d, reason: collision with root package name */
    private final C16760h f86558d;

    /* renamed from: e, reason: collision with root package name */
    private int f86559e;

    /* renamed from: f, reason: collision with root package name */
    private int f86560f;

    /* renamed from: g, reason: collision with root package name */
    private int f86561g;

    /* renamed from: h, reason: collision with root package name */
    private int f86562h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f86563i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f86564j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f86565k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f86566l;

    /* renamed from: m, reason: collision with root package name */
    private C16765m f86567m;

    /* renamed from: n, reason: collision with root package name */
    private ColorStateList f86568n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f86569o;

    /* renamed from: p, reason: collision with root package name */
    private LayerDrawable f86570p;

    /* renamed from: q, reason: collision with root package name */
    private C16760h f86571q;

    /* renamed from: r, reason: collision with root package name */
    private C16760h f86572r;

    /* renamed from: t, reason: collision with root package name */
    private boolean f86574t;

    /* renamed from: u, reason: collision with root package name */
    private ValueAnimator f86575u;

    /* renamed from: v, reason: collision with root package name */
    private final TimeInterpolator f86576v;

    /* renamed from: w, reason: collision with root package name */
    private final int f86577w;

    /* renamed from: x, reason: collision with root package name */
    private final int f86578x;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f86556b = new Rect();

    /* renamed from: s, reason: collision with root package name */
    private boolean f86573s = false;

    /* renamed from: y, reason: collision with root package name */
    private float f86579y = 0.0f;

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
        if (this.f86555a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(f());
            iCeil = (int) Math.ceil(e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    private boolean G() {
        return (this.f86561g & 80) == 80;
    }

    private boolean H() {
        return (this.f86561g & 8388613) == 8388613;
    }

    private float c() {
        return Math.max(Math.max(d(this.f86567m.q(), this.f86557c.J()), d(this.f86567m.s(), this.f86557c.K())), Math.max(d(this.f86567m.k(), this.f86557c.t()), d(this.f86567m.i(), this.f86557c.s())));
    }

    private boolean c0() {
        return this.f86555a.getPreventCornerOverlap() && !g();
    }

    private float d(C16756d c16756d, float f10) {
        if (c16756d instanceof C16764l) {
            return (float) ((1.0d - f86554z) * f10);
        }
        if (c16756d instanceof C16757e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    private boolean d0() {
        return this.f86555a.getPreventCornerOverlap() && g() && this.f86555a.getUseCompatPadding();
    }

    private float e() {
        return this.f86555a.getMaxCardElevation() + (d0() ? c() : 0.0f);
    }

    private boolean e0() {
        if (this.f86555a.isClickable()) {
            return true;
        }
        View view = this.f86555a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    private float f() {
        return (this.f86555a.getMaxCardElevation() * 1.5f) + (d0() ? c() : 0.0f);
    }

    private boolean g() {
        return this.f86557c.T();
    }

    private Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C16760h c16760hJ = j();
        this.f86571q = c16760hJ;
        c16760hJ.b0(this.f86565k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f86571q);
        return stateListDrawable;
    }

    private Drawable i() {
        if (!C16292b.f155717a) {
            return h();
        }
        this.f86572r = j();
        return new RippleDrawable(this.f86565k, null, this.f86572r);
    }

    private void i0(Drawable drawable) {
        if (this.f86555a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f86555a.getForeground()).setDrawable(drawable);
        } else {
            this.f86555a.setForeground(D(drawable));
        }
    }

    private C16760h j() {
        return new C16760h(this.f86567m);
    }

    private void k0() {
        Drawable drawable;
        if (C16292b.f155717a && (drawable = this.f86569o) != null) {
            ((RippleDrawable) drawable).setColor(this.f86565k);
            return;
        }
        C16760h c16760h = this.f86571q;
        if (c16760h != null) {
            c16760h.b0(this.f86565k);
        }
    }

    private Drawable t() {
        if (this.f86569o == null) {
            this.f86569o = i();
        }
        if (this.f86570p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f86569o, this.f86558d, this.f86564j});
            this.f86570p = layerDrawable;
            layerDrawable.setId(2, f.f44661G);
        }
        return this.f86570p;
    }

    private float v() {
        if (this.f86555a.getPreventCornerOverlap() && this.f86555a.getUseCompatPadding()) {
            return (float) ((1.0d - f86554z) * this.f86555a.getCardViewRadius());
        }
        return 0.0f;
    }

    ColorStateList A() {
        return this.f86568n;
    }

    int B() {
        return this.f86562h;
    }

    Rect C() {
        return this.f86556b;
    }

    boolean E() {
        return this.f86573s;
    }

    boolean F() {
        return this.f86574t;
    }

    void I(TypedArray typedArray) {
        ColorStateList colorStateListA = C16026c.a(this.f86555a.getContext(), typedArray, l.f44888G4);
        this.f86568n = colorStateListA;
        if (colorStateListA == null) {
            this.f86568n = ColorStateList.valueOf(-1);
        }
        this.f86562h = typedArray.getDimensionPixelSize(l.f44900H4, 0);
        boolean z10 = typedArray.getBoolean(l.f45404y4, false);
        this.f86574t = z10;
        this.f86555a.setLongClickable(z10);
        this.f86566l = C16026c.a(this.f86555a.getContext(), typedArray, l.f44864E4);
        Q(C16026c.d(this.f86555a.getContext(), typedArray, l.f44816A4));
        T(typedArray.getDimensionPixelSize(l.f44852D4, 0));
        S(typedArray.getDimensionPixelSize(l.f44840C4, 0));
        this.f86561g = typedArray.getInteger(l.f44828B4, 8388661);
        ColorStateList colorStateListA2 = C16026c.a(this.f86555a.getContext(), typedArray, l.f44876F4);
        this.f86565k = colorStateListA2;
        if (colorStateListA2 == null) {
            this.f86565k = ColorStateList.valueOf(C14718a.d(this.f86555a, C5597b.f44527l));
        }
        M(C16026c.a(this.f86555a.getContext(), typedArray, l.f45416z4));
        k0();
        h0();
        l0();
        this.f86555a.setBackgroundInternal(D(this.f86557c));
        Drawable drawableT = e0() ? t() : this.f86558d;
        this.f86563i = drawableT;
        this.f86555a.setForeground(D(drawableT));
    }

    void J(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f86570p != null) {
            if (this.f86555a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(f() * 2.0f);
                iCeil2 = (int) Math.ceil(e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = H() ? ((i10 - this.f86559e) - this.f86560f) - iCeil2 : this.f86559e;
            int i15 = G() ? this.f86559e : ((i11 - this.f86559e) - this.f86560f) - iCeil;
            int i16 = H() ? this.f86559e : ((i10 - this.f86559e) - this.f86560f) - iCeil2;
            int i17 = G() ? ((i11 - this.f86559e) - this.f86560f) - iCeil : this.f86559e;
            if (ViewCompat.z(this.f86555a) == 1) {
                i13 = i16;
                i12 = i14;
            } else {
                i12 = i16;
                i13 = i14;
            }
            this.f86570p.setLayerInset(2, i13, i17, i12, i15);
        }
    }

    void K(boolean z10) {
        this.f86573s = z10;
    }

    void L(ColorStateList colorStateList) {
        this.f86557c.b0(colorStateList);
    }

    void M(ColorStateList colorStateList) {
        C16760h c16760h = this.f86558d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c16760h.b0(colorStateList);
    }

    void N(boolean z10) {
        this.f86574t = z10;
    }

    public void P(boolean z10, boolean z11) {
        Drawable drawable = this.f86564j;
        if (drawable != null) {
            if (z11) {
                b(z10);
            } else {
                drawable.setAlpha(z10 ? l3.f92484c : 0);
                this.f86579y = z10 ? 1.0f : 0.0f;
            }
        }
    }

    void Q(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = C13462a.r(drawable).mutate();
            this.f86564j = drawableMutate;
            C13462a.o(drawableMutate, this.f86566l);
            O(this.f86555a.isChecked());
        } else {
            this.f86564j = f86553A;
        }
        LayerDrawable layerDrawable = this.f86570p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(f.f44661G, this.f86564j);
        }
    }

    void R(int i10) {
        this.f86561g = i10;
        J(this.f86555a.getMeasuredWidth(), this.f86555a.getMeasuredHeight());
    }

    void S(int i10) {
        this.f86559e = i10;
    }

    void T(int i10) {
        this.f86560f = i10;
    }

    void U(ColorStateList colorStateList) {
        this.f86566l = colorStateList;
        Drawable drawable = this.f86564j;
        if (drawable != null) {
            C13462a.o(drawable, colorStateList);
        }
    }

    void V(float f10) {
        Y(this.f86567m.w(f10));
        this.f86563i.invalidateSelf();
        if (d0() || c0()) {
            g0();
        }
        if (d0()) {
            j0();
        }
    }

    void W(float f10) {
        this.f86557c.c0(f10);
        C16760h c16760h = this.f86558d;
        if (c16760h != null) {
            c16760h.c0(f10);
        }
        C16760h c16760h2 = this.f86572r;
        if (c16760h2 != null) {
            c16760h2.c0(f10);
        }
    }

    void X(ColorStateList colorStateList) {
        this.f86565k = colorStateList;
        k0();
    }

    void Y(C16765m c16765m) {
        this.f86567m = c16765m;
        this.f86557c.setShapeAppearanceModel(c16765m);
        this.f86557c.f0(!r0.T());
        C16760h c16760h = this.f86558d;
        if (c16760h != null) {
            c16760h.setShapeAppearanceModel(c16765m);
        }
        C16760h c16760h2 = this.f86572r;
        if (c16760h2 != null) {
            c16760h2.setShapeAppearanceModel(c16765m);
        }
        C16760h c16760h3 = this.f86571q;
        if (c16760h3 != null) {
            c16760h3.setShapeAppearanceModel(c16765m);
        }
    }

    void Z(ColorStateList colorStateList) {
        if (this.f86568n == colorStateList) {
            return;
        }
        this.f86568n = colorStateList;
        l0();
    }

    void a0(int i10) {
        if (i10 == this.f86562h) {
            return;
        }
        this.f86562h = i10;
        l0();
    }

    public void b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f86579y : this.f86579y;
        ValueAnimator valueAnimator = this.f86575u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f86575u = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f86579y, f10);
        this.f86575u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.a(this.f86552a, valueAnimator2);
            }
        });
        this.f86575u.setInterpolator(this.f86576v);
        this.f86575u.setDuration((long) ((z10 ? this.f86577w : this.f86578x) * f11));
        this.f86575u.start();
    }

    void b0(int i10, int i11, int i12, int i13) {
        this.f86556b.set(i10, i11, i12, i13);
        g0();
    }

    void f0() {
        Drawable drawable = this.f86563i;
        Drawable drawableT = e0() ? t() : this.f86558d;
        this.f86563i = drawableT;
        if (drawable != drawableT) {
            i0(drawableT);
        }
    }

    void h0() {
        this.f86557c.a0(this.f86555a.getCardElevation());
    }

    void k() {
        Drawable drawable = this.f86569o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f86569o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f86569o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    C16760h l() {
        return this.f86557c;
    }

    void l0() {
        this.f86558d.j0(this.f86562h, this.f86568n);
    }

    ColorStateList m() {
        return this.f86557c.x();
    }

    ColorStateList n() {
        return this.f86558d.x();
    }

    Drawable o() {
        return this.f86564j;
    }

    int p() {
        return this.f86561g;
    }

    int q() {
        return this.f86559e;
    }

    int r() {
        return this.f86560f;
    }

    ColorStateList s() {
        return this.f86566l;
    }

    float u() {
        return this.f86557c.J();
    }

    float w() {
        return this.f86557c.y();
    }

    ColorStateList x() {
        return this.f86565k;
    }

    C16765m y() {
        return this.f86567m;
    }

    int z() {
        ColorStateList colorStateList = this.f86568n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public b(MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f86555a = materialCardView;
        C16760h c16760h = new C16760h(materialCardView.getContext(), attributeSet, i10, i11);
        this.f86557c = c16760h;
        c16760h.Q(materialCardView.getContext());
        c16760h.g0(-12303292);
        C16765m.b bVarV = c16760h.E().v();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, l.f44932K0, i10, k.f44785a);
        if (typedArrayObtainStyledAttributes.hasValue(l.f44944L0)) {
            bVarV.o(typedArrayObtainStyledAttributes.getDimension(l.f44944L0, 0.0f));
        }
        this.f86558d = new C16760h();
        Y(bVarV.m());
        this.f86576v = i.g(materialCardView.getContext(), C5597b.f44498T, C6230a.f60115a);
        this.f86577w = i.f(materialCardView.getContext(), C5597b.f44492N, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
        this.f86578x = i.f(materialCardView.getContext(), C5597b.f44491M, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.f86564j.setAlpha((int) (255.0f * fFloatValue));
        bVar.f86579y = fFloatValue;
    }

    void g0() {
        float fC;
        if (!c0() && !d0()) {
            fC = 0.0f;
        } else {
            fC = c();
        }
        int iV = (int) (fC - v());
        MaterialCardView materialCardView = this.f86555a;
        Rect rect = this.f86556b;
        materialCardView.j(rect.left + iV, rect.top + iV, rect.right + iV, rect.bottom + iV);
    }

    void j0() {
        if (!E()) {
            this.f86555a.setBackgroundInternal(D(this.f86557c));
        }
        this.f86555a.setForeground(D(this.f86563i));
    }

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f86553A = colorDrawable;
    }
}
