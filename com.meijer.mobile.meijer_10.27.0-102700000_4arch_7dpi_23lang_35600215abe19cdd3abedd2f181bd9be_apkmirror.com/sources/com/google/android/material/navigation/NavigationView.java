package com.google.android.material.navigation;

import ae.C5597b;
import ae.k;
import ae.l;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.g;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.M;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.view.C5614b;
import be.C6230a;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.j;
import com.google.android.material.internal.s;
import com.google.android.material.internal.y;
import ee.C13649a;
import i.C14575a;
import j.C14791a;
import java.util.Objects;
import ne.InterfaceC15792b;
import ne.h;
import oe.C16026c;
import p2.r;
import pe.C16292b;
import re.AbstractC16769q;
import re.C16760h;
import re.C16761i;
import re.C16765m;
import ue.C17250a;
import w2.AbstractC17751a;

/* loaded from: classes4.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements InterfaceC15792b, FSDispatchDraw {

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f87281x = {R.attr.state_checked};

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f87282y = {-16842910};

    /* renamed from: z, reason: collision with root package name */
    private static final int f87283z = k.f44798n;

    /* renamed from: h, reason: collision with root package name */
    private final j f87284h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.android.material.internal.k f87285i;

    /* renamed from: j, reason: collision with root package name */
    d f87286j;

    /* renamed from: k, reason: collision with root package name */
    private final int f87287k;

    /* renamed from: l, reason: collision with root package name */
    private final int[] f87288l;

    /* renamed from: m, reason: collision with root package name */
    private MenuInflater f87289m;

    /* renamed from: n, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f87290n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f87291o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f87292p;

    /* renamed from: q, reason: collision with root package name */
    private int f87293q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f87294r;

    /* renamed from: s, reason: collision with root package name */
    private final int f87295s;

    /* renamed from: t, reason: collision with root package name */
    private final AbstractC16769q f87296t;

    /* renamed from: u, reason: collision with root package name */
    private final h f87297u;

    /* renamed from: v, reason: collision with root package name */
    private final ne.c f87298v;

    /* renamed from: w, reason: collision with root package name */
    private final DrawerLayout.d f87299w;

    class a extends DrawerLayout.g {
        a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void a(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                final ne.c cVar = navigationView.f87298v;
                Objects.requireNonNull(cVar);
                view.post(new Runnable() { // from class: com.google.android.material.navigation.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.e();
                    }
                });
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void b(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.f87298v.f();
                NavigationView.this.t();
            }
        }
    }

    class b implements f.a {
        @Override // androidx.appcompat.view.menu.f.a
        public void b(f fVar) {
        }

        b() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public boolean a(f fVar, MenuItem menuItem) {
            d dVar = NavigationView.this.f87286j;
            return dVar != null && dVar.d(menuItem);
        }
    }

    class c implements ViewTreeObserver.OnGlobalLayoutListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f87288l);
            boolean z10 = true;
            boolean z11 = NavigationView.this.f87288l[1] == 0;
            NavigationView.this.f87285i.E(z11);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z11 && navigationView2.s());
            NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.f87288l[0] == 0 || NavigationView.this.f87288l[0] + NavigationView.this.getWidth() == 0);
            Activity activityA = com.google.android.material.internal.c.a(NavigationView.this.getContext());
            if (activityA != null) {
                Rect rectA = y.a(activityA);
                boolean z12 = rectA.height() - NavigationView.this.getHeight() == NavigationView.this.f87288l[1];
                boolean z13 = Color.alpha(activityA.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawBottomInsetForeground(z12 && z13 && navigationView3.r());
                if (rectA.width() != NavigationView.this.f87288l[0] && rectA.width() - NavigationView.this.getWidth() != NavigationView.this.f87288l[0]) {
                    z10 = false;
                }
                NavigationView.this.setDrawRightInsetForeground(z10);
            }
        }
    }

    public interface d {
        boolean d(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44501W);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_42fd91b34223a4d68a6273e63c63faf1(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_42fd91b34223a4d68a6273e63c63faf1(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_42fd91b34223a4d68a6273e63c63faf1(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void setCheckedItem(int i10) {
        MenuItem menuItemFindItem = this.f87284h.findItem(i10);
        if (menuItemFindItem != null) {
            this.f87285i.F((androidx.appcompat.view.menu.h) menuItemFindItem);
        }
    }

    public static class e extends AbstractC17751a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public Bundle f87303c;

        class a implements Parcelable.ClassLoaderCreator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }

            a() {
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f87303c = parcel.readBundle(classLoader);
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // w2.AbstractC17751a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f87303c);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        int i12;
        int i13 = f87283z;
        super(C17250a.c(context, attributeSet, i10, i13), attributeSet, i10);
        com.google.android.material.internal.k kVar = new com.google.android.material.internal.k();
        this.f87285i = kVar;
        this.f87288l = new int[2];
        this.f87291o = true;
        this.f87292p = true;
        this.f87293q = 0;
        this.f87296t = AbstractC16769q.a(this);
        this.f87297u = new h(this);
        this.f87298v = new ne.c(this);
        this.f87299w = new a();
        Context context2 = getContext();
        j jVar = new j(context2);
        this.f87284h = jVar;
        M mJ = s.j(context2, attributeSet, l.f44853D5, i10, i13, new int[0]);
        if (mJ.s(l.f44865E5)) {
            ViewCompat.q0(this, mJ.g(l.f44865E5));
        }
        int iF = mJ.f(l.f44937K5, 0);
        this.f87293q = iF;
        this.f87294r = iF == 0;
        this.f87295s = getResources().getDimensionPixelSize(ae.d.f44641z);
        Drawable background = getBackground();
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(background);
        if (background == null || colorStateListF != null) {
            C16760h c16760h = new C16760h(C16765m.e(context2, attributeSet, i10, i13).m());
            if (colorStateListF != null) {
                c16760h.b0(colorStateListF);
            }
            c16760h.Q(context2);
            ViewCompat.q0(this, c16760h);
        }
        if (mJ.s(l.f44949L5)) {
            setElevation(mJ.f(l.f44949L5, 0));
        }
        setFitsSystemWindows(mJ.a(l.f44877F5, false));
        this.f87287k = mJ.f(l.f44889G5, 0);
        ColorStateList colorStateListC = mJ.s(l.f45190g6) ? mJ.c(l.f45190g6) : null;
        int iN = mJ.s(l.f45226j6) ? mJ.n(l.f45226j6, 0) : 0;
        if (iN == 0 && colorStateListC == null) {
            colorStateListC = k(R.attr.textColorSecondary);
        }
        ColorStateList colorStateListC2 = mJ.s(l.f45018R5) ? mJ.c(l.f45018R5) : k(R.attr.textColorSecondary);
        int iN2 = mJ.s(l.f45130b6) ? mJ.n(l.f45130b6, 0) : 0;
        boolean zA = mJ.a(l.f45142c6, true);
        if (mJ.s(l.f45007Q5)) {
            setItemIconSize(mJ.f(l.f45007Q5, 0));
        }
        ColorStateList colorStateListC3 = mJ.s(l.f45154d6) ? mJ.c(l.f45154d6) : null;
        if (iN2 == 0 && colorStateListC3 == null) {
            colorStateListC3 = k(R.attr.textColorPrimary);
        }
        Drawable drawableG = mJ.g(l.f44973N5);
        if (drawableG == null && o(mJ)) {
            drawableG = l(mJ);
            ColorStateList colorStateListB = C16026c.b(context2, mJ, l.f45040T5);
            if (colorStateListB != null) {
                kVar.K(new RippleDrawable(C16292b.d(colorStateListB), null, m(mJ, null)));
            }
        }
        if (mJ.s(l.f44985O5)) {
            i11 = 0;
            setItemHorizontalPadding(mJ.f(l.f44985O5, 0));
        } else {
            i11 = 0;
        }
        if (mJ.s(l.f45166e6)) {
            setItemVerticalPadding(mJ.f(l.f45166e6, i11));
        }
        setDividerInsetStart(mJ.f(l.f44925J5, i11));
        setDividerInsetEnd(mJ.f(l.f44913I5, i11));
        setSubheaderInsetStart(mJ.f(l.f45214i6, i11));
        setSubheaderInsetEnd(mJ.f(l.f45202h6, i11));
        setTopInsetScrimEnabled(mJ.a(l.f45238k6, this.f87291o));
        setBottomInsetScrimEnabled(mJ.a(l.f44901H5, this.f87292p));
        int iF2 = mJ.f(l.f44996P5, i11);
        setItemMaxLines(mJ.k(l.f45029S5, 1));
        jVar.W(new b());
        kVar.I(1);
        kVar.l(context2, jVar);
        if (iN != 0) {
            kVar.Y(iN);
        }
        kVar.V(colorStateListC);
        kVar.O(colorStateListC2);
        kVar.U(getOverScrollMode());
        if (iN2 != 0) {
            kVar.Q(iN2);
        }
        kVar.R(zA);
        kVar.S(colorStateListC3);
        kVar.J(drawableG);
        kVar.M(iF2);
        jVar.b(kVar);
        addView((View) kVar.z(this));
        if (mJ.s(l.f45178f6)) {
            i12 = 0;
            q(mJ.n(l.f45178f6, 0));
        } else {
            i12 = 0;
        }
        if (mJ.s(l.f44961M5)) {
            p(mJ.n(l.f44961M5, i12));
        }
        mJ.x();
        w();
    }

    private MenuInflater getMenuInflater() {
        if (this.f87289m == null) {
            this.f87289m = new g(getContext());
        }
        return this.f87289m;
    }

    private ColorStateList k(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = C14791a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C14575a.f136546y, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = f87282y;
        return new ColorStateList(new int[][]{iArr, f87281x, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    private Drawable m(M m10, ColorStateList colorStateList) {
        C16760h c16760h = new C16760h(C16765m.b(getContext(), m10.n(l.f45051U5, 0), m10.n(l.f45062V5, 0)).m());
        c16760h.b0(colorStateList);
        return new InsetDrawable((Drawable) c16760h, m10.f(l.f45106Z5, 0), m10.f(l.f45118a6, 0), m10.f(l.f45095Y5, 0), m10.f(l.f45084X5, 0));
    }

    private boolean o(M m10) {
        return m10.s(l.f45051U5) || m10.s(l.f45062V5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!this.f87294r || this.f87293q == 0) {
            return;
        }
        this.f87293q = 0;
        u(getWidth(), getHeight());
    }

    private void w() {
        this.f87290n = new c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f87290n);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.f87296t.d(canvas, new C13649a.InterfaceC2023a() { // from class: com.google.android.material.navigation.c
            @Override // ee.C13649a.InterfaceC2023a
            public final void a(Canvas canvas2) {
                this.f87308a.fsSuperDispatchDraw_42fd91b34223a4d68a6273e63c63faf1(canvas2);
            }
        });
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    protected void e(androidx.core.view.j jVar) {
        this.f87285i.m(jVar);
    }

    h getBackHelper() {
        return this.f87297u;
    }

    public MenuItem getCheckedItem() {
        return this.f87285i.n();
    }

    public int getDividerInsetEnd() {
        return this.f87285i.o();
    }

    public int getDividerInsetStart() {
        return this.f87285i.p();
    }

    public int getHeaderCount() {
        return this.f87285i.q();
    }

    public Drawable getItemBackground() {
        return this.f87285i.s();
    }

    public int getItemHorizontalPadding() {
        return this.f87285i.t();
    }

    public int getItemIconPadding() {
        return this.f87285i.u();
    }

    public ColorStateList getItemIconTintList() {
        return this.f87285i.x();
    }

    public int getItemMaxLines() {
        return this.f87285i.v();
    }

    public ColorStateList getItemTextColor() {
        return this.f87285i.w();
    }

    public int getItemVerticalPadding() {
        return this.f87285i.y();
    }

    public Menu getMenu() {
        return this.f87284h;
    }

    public int getSubheaderInsetEnd() {
        return this.f87285i.A();
    }

    public int getSubheaderInsetStart() {
        return this.f87285i.B();
    }

    public View n(int i10) {
        return this.f87285i.r(i10);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        this.f87284h.T(eVar.f87303c);
    }

    public View p(int i10) {
        return this.f87285i.D(i10);
    }

    public void q(int i10) {
        this.f87285i.Z(true);
        getMenuInflater().inflate(i10, this.f87284h);
        this.f87285i.Z(false);
        this.f87285i.i(false);
    }

    public boolean r() {
        return this.f87292p;
    }

    public boolean s() {
        return this.f87291o;
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f87292p = z10;
    }

    public void setDividerInsetEnd(int i10) {
        this.f87285i.G(i10);
    }

    public void setDividerInsetStart(int i10) {
        this.f87285i.H(i10);
    }

    public void setForceCompatClippingEnabled(boolean z10) {
        this.f87296t.g(this, z10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f87285i.J(drawable);
    }

    public void setItemHorizontalPadding(int i10) {
        this.f87285i.L(i10);
    }

    public void setItemHorizontalPaddingResource(int i10) {
        this.f87285i.L(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconPadding(int i10) {
        this.f87285i.M(i10);
    }

    public void setItemIconPaddingResource(int i10) {
        this.f87285i.M(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(int i10) {
        this.f87285i.N(i10);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f87285i.O(colorStateList);
    }

    public void setItemMaxLines(int i10) {
        this.f87285i.P(i10);
    }

    public void setItemTextAppearance(int i10) {
        this.f87285i.Q(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f87285i.R(z10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f87285i.S(colorStateList);
    }

    public void setItemVerticalPadding(int i10) {
        this.f87285i.T(i10);
    }

    public void setItemVerticalPaddingResource(int i10) {
        this.f87285i.T(getResources().getDimensionPixelSize(i10));
    }

    public void setNavigationItemSelectedListener(d dVar) {
        this.f87286j = dVar;
    }

    public void setSubheaderInsetEnd(int i10) {
        this.f87285i.W(i10);
    }

    public void setSubheaderInsetStart(int i10) {
        this.f87285i.X(i10);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f87291o = z10;
    }

    private Drawable l(M m10) {
        return m(m10, C16026c.b(getContext(), m10, l.f45073W5));
    }

    private void u(int i10, int i11) {
        boolean z10;
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.e)) {
            if ((this.f87293q > 0 || this.f87294r) && (getBackground() instanceof C16760h)) {
                if (r.b(((DrawerLayout.e) getLayoutParams()).f54547a, ViewCompat.z(this)) == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C16760h c16760h = (C16760h) getBackground();
                C16765m.b bVarO = c16760h.E().v().o(this.f87293q);
                if (z10) {
                    bVarO.D(0.0f);
                    bVarO.v(0.0f);
                } else {
                    bVarO.H(0.0f);
                    bVarO.z(0.0f);
                }
                C16765m c16765mM = bVarO.m();
                c16760h.setShapeAppearanceModel(c16765mM);
                this.f87296t.f(this, c16765mM);
                this.f87296t.e(this, new RectF(0.0f, 0.0f, i10, i11));
                this.f87296t.h(this, true);
            }
        }
    }

    private Pair<DrawerLayout, DrawerLayout.e> v() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.e)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.e) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @Override // ne.InterfaceC15792b
    public void a() {
        v();
        this.f87297u.f();
        t();
    }

    @Override // ne.InterfaceC15792b
    public void b(C5614b c5614b) {
        v();
        this.f87297u.j(c5614b);
    }

    @Override // ne.InterfaceC15792b
    public void c(C5614b c5614b) {
        this.f87297u.l(c5614b, ((DrawerLayout.e) v().second).f54547a);
        if (this.f87294r) {
            this.f87293q = C6230a.c(0, this.f87295s, this.f87297u.a(c5614b.getProgress()));
            u(getWidth(), getHeight());
        }
    }

    @Override // ne.InterfaceC15792b
    public void d() {
        Pair<DrawerLayout, DrawerLayout.e> pairV = v();
        DrawerLayout drawerLayout = (DrawerLayout) pairV.first;
        C5614b c5614bC = this.f87297u.c();
        if (c5614bC != null && Build.VERSION.SDK_INT >= 34) {
            this.f87297u.h(c5614bC, ((DrawerLayout.e) pairV.second).f54547a, com.google.android.material.navigation.b.b(drawerLayout, this), com.google.android.material.navigation.b.c(drawerLayout));
            return;
        }
        drawerLayout.h(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C16761i.e(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.f87298v.b()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.Q(this.f87299w);
            drawerLayout.c(this.f87299w);
            if (drawerLayout.F(this)) {
                this.f87298v.e();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f87290n);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).Q(this.f87299w);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i10 = View.MeasureSpec.makeMeasureSpec(this.f87287k, 1073741824);
            }
        } else {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f87287k), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        eVar.f87303c = bundle;
        this.f87284h.V(bundle);
        return eVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        u(i10, i11);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f87284h.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f87285i.F((androidx.appcompat.view.menu.h) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C16761i.d(this, f10);
    }

    public void setItemBackgroundResource(int i10) {
        setItemBackground(Z1.b.e(getContext(), i10));
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        com.google.android.material.internal.k kVar = this.f87285i;
        if (kVar != null) {
            kVar.U(i10);
        }
    }
}
