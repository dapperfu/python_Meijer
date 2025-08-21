package com.google.android.material.navigation;

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
import androidx.view.C5756b;
import ce.C6503b;
import ce.k;
import ce.l;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.j;
import com.google.android.material.internal.s;
import com.google.android.material.internal.y;
import de.C13661a;
import ge.C14353a;
import i.C14578a;
import j.C14879a;
import java.util.Objects;
import p2.r;
import pe.InterfaceC16420b;
import pe.h;
import qe.C16634c;
import re.C16896b;
import te.AbstractC17243q;
import te.C17234h;
import te.C17235i;
import te.C17239m;
import w2.AbstractC17821a;
import we.C17867a;

/* loaded from: classes4.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements InterfaceC16420b, FSDispatchDraw {

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f88121x = {R.attr.state_checked};

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f88122y = {-16842910};

    /* renamed from: z, reason: collision with root package name */
    private static final int f88123z = k.f61813n;

    /* renamed from: h, reason: collision with root package name */
    private final j f88124h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.android.material.internal.k f88125i;

    /* renamed from: j, reason: collision with root package name */
    d f88126j;

    /* renamed from: k, reason: collision with root package name */
    private final int f88127k;

    /* renamed from: l, reason: collision with root package name */
    private final int[] f88128l;

    /* renamed from: m, reason: collision with root package name */
    private MenuInflater f88129m;

    /* renamed from: n, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f88130n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f88131o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f88132p;

    /* renamed from: q, reason: collision with root package name */
    private int f88133q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f88134r;

    /* renamed from: s, reason: collision with root package name */
    private final int f88135s;

    /* renamed from: t, reason: collision with root package name */
    private final AbstractC17243q f88136t;

    /* renamed from: u, reason: collision with root package name */
    private final h f88137u;

    /* renamed from: v, reason: collision with root package name */
    private final pe.c f88138v;

    /* renamed from: w, reason: collision with root package name */
    private final DrawerLayout.d f88139w;

    class a extends DrawerLayout.g {
        a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void a(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                final pe.c cVar = navigationView.f88138v;
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
                navigationView.f88138v.f();
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
            d dVar = NavigationView.this.f88126j;
            return dVar != null && dVar.d(menuItem);
        }
    }

    class c implements ViewTreeObserver.OnGlobalLayoutListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f88128l);
            boolean z10 = true;
            boolean z11 = NavigationView.this.f88128l[1] == 0;
            NavigationView.this.f88125i.E(z11);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z11 && navigationView2.s());
            NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.f88128l[0] == 0 || NavigationView.this.f88128l[0] + NavigationView.this.getWidth() == 0);
            Activity activityA = com.google.android.material.internal.c.a(NavigationView.this.getContext());
            if (activityA != null) {
                Rect rectA = y.a(activityA);
                boolean z12 = rectA.height() - NavigationView.this.getHeight() == NavigationView.this.f88128l[1];
                boolean z13 = Color.alpha(activityA.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawBottomInsetForeground(z12 && z13 && navigationView3.r());
                if (rectA.width() != NavigationView.this.f88128l[0] && rectA.width() - NavigationView.this.getWidth() != NavigationView.this.f88128l[0]) {
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
        this(context, attributeSet, C6503b.f61516W);
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
        MenuItem menuItemFindItem = this.f88124h.findItem(i10);
        if (menuItemFindItem != null) {
            this.f88125i.F((androidx.appcompat.view.menu.h) menuItemFindItem);
        }
    }

    public static class e extends AbstractC17821a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public Bundle f88143c;

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
            this.f88143c = parcel.readBundle(classLoader);
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // w2.AbstractC17821a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f88143c);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        int i12;
        int i13 = f88123z;
        super(C17867a.c(context, attributeSet, i10, i13), attributeSet, i10);
        com.google.android.material.internal.k kVar = new com.google.android.material.internal.k();
        this.f88125i = kVar;
        this.f88128l = new int[2];
        this.f88131o = true;
        this.f88132p = true;
        this.f88133q = 0;
        this.f88136t = AbstractC17243q.a(this);
        this.f88137u = new h(this);
        this.f88138v = new pe.c(this);
        this.f88139w = new a();
        Context context2 = getContext();
        j jVar = new j(context2);
        this.f88124h = jVar;
        M mJ = s.j(context2, attributeSet, l.f61868D5, i10, i13, new int[0]);
        if (mJ.s(l.f61880E5)) {
            ViewCompat.q0(this, mJ.g(l.f61880E5));
        }
        int iF = mJ.f(l.f61952K5, 0);
        this.f88133q = iF;
        this.f88134r = iF == 0;
        this.f88135s = getResources().getDimensionPixelSize(ce.d.f61656z);
        Drawable background = getBackground();
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(background);
        if (background == null || colorStateListF != null) {
            C17234h c17234h = new C17234h(C17239m.e(context2, attributeSet, i10, i13).m());
            if (colorStateListF != null) {
                c17234h.b0(colorStateListF);
            }
            c17234h.Q(context2);
            ViewCompat.q0(this, c17234h);
        }
        if (mJ.s(l.f61964L5)) {
            setElevation(mJ.f(l.f61964L5, 0));
        }
        setFitsSystemWindows(mJ.a(l.f61892F5, false));
        this.f88127k = mJ.f(l.f61904G5, 0);
        ColorStateList colorStateListC = mJ.s(l.f62205g6) ? mJ.c(l.f62205g6) : null;
        int iN = mJ.s(l.f62241j6) ? mJ.n(l.f62241j6, 0) : 0;
        if (iN == 0 && colorStateListC == null) {
            colorStateListC = k(R.attr.textColorSecondary);
        }
        ColorStateList colorStateListC2 = mJ.s(l.f62033R5) ? mJ.c(l.f62033R5) : k(R.attr.textColorSecondary);
        int iN2 = mJ.s(l.f62145b6) ? mJ.n(l.f62145b6, 0) : 0;
        boolean zA = mJ.a(l.f62157c6, true);
        if (mJ.s(l.f62022Q5)) {
            setItemIconSize(mJ.f(l.f62022Q5, 0));
        }
        ColorStateList colorStateListC3 = mJ.s(l.f62169d6) ? mJ.c(l.f62169d6) : null;
        if (iN2 == 0 && colorStateListC3 == null) {
            colorStateListC3 = k(R.attr.textColorPrimary);
        }
        Drawable drawableG = mJ.g(l.f61988N5);
        if (drawableG == null && o(mJ)) {
            drawableG = l(mJ);
            ColorStateList colorStateListB = C16634c.b(context2, mJ, l.f62055T5);
            if (colorStateListB != null) {
                kVar.K(new RippleDrawable(C16896b.d(colorStateListB), null, m(mJ, null)));
            }
        }
        if (mJ.s(l.f62000O5)) {
            i11 = 0;
            setItemHorizontalPadding(mJ.f(l.f62000O5, 0));
        } else {
            i11 = 0;
        }
        if (mJ.s(l.f62181e6)) {
            setItemVerticalPadding(mJ.f(l.f62181e6, i11));
        }
        setDividerInsetStart(mJ.f(l.f61940J5, i11));
        setDividerInsetEnd(mJ.f(l.f61928I5, i11));
        setSubheaderInsetStart(mJ.f(l.f62229i6, i11));
        setSubheaderInsetEnd(mJ.f(l.f62217h6, i11));
        setTopInsetScrimEnabled(mJ.a(l.f62253k6, this.f88131o));
        setBottomInsetScrimEnabled(mJ.a(l.f61916H5, this.f88132p));
        int iF2 = mJ.f(l.f62011P5, i11);
        setItemMaxLines(mJ.k(l.f62044S5, 1));
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
        if (mJ.s(l.f62193f6)) {
            i12 = 0;
            q(mJ.n(l.f62193f6, 0));
        } else {
            i12 = 0;
        }
        if (mJ.s(l.f61976M5)) {
            p(mJ.n(l.f61976M5, i12));
        }
        mJ.x();
        w();
    }

    private MenuInflater getMenuInflater() {
        if (this.f88129m == null) {
            this.f88129m = new g(getContext());
        }
        return this.f88129m;
    }

    private ColorStateList k(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = C14879a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C14578a.f136303y, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = f88122y;
        return new ColorStateList(new int[][]{iArr, f88121x, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    private Drawable m(M m10, ColorStateList colorStateList) {
        C17234h c17234h = new C17234h(C17239m.b(getContext(), m10.n(l.f62066U5, 0), m10.n(l.f62077V5, 0)).m());
        c17234h.b0(colorStateList);
        return new InsetDrawable((Drawable) c17234h, m10.f(l.f62121Z5, 0), m10.f(l.f62133a6, 0), m10.f(l.f62110Y5, 0), m10.f(l.f62099X5, 0));
    }

    private boolean o(M m10) {
        return m10.s(l.f62066U5) || m10.s(l.f62077V5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!this.f88134r || this.f88133q == 0) {
            return;
        }
        this.f88133q = 0;
        u(getWidth(), getHeight());
    }

    private void w() {
        this.f88130n = new c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f88130n);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.f88136t.d(canvas, new C14353a.InterfaceC2121a() { // from class: com.google.android.material.navigation.c
            @Override // ge.C14353a.InterfaceC2121a
            public final void a(Canvas canvas2) {
                this.f88148a.fsSuperDispatchDraw_42fd91b34223a4d68a6273e63c63faf1(canvas2);
            }
        });
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    protected void e(androidx.core.view.j jVar) {
        this.f88125i.m(jVar);
    }

    h getBackHelper() {
        return this.f88137u;
    }

    public MenuItem getCheckedItem() {
        return this.f88125i.n();
    }

    public int getDividerInsetEnd() {
        return this.f88125i.o();
    }

    public int getDividerInsetStart() {
        return this.f88125i.p();
    }

    public int getHeaderCount() {
        return this.f88125i.q();
    }

    public Drawable getItemBackground() {
        return this.f88125i.s();
    }

    public int getItemHorizontalPadding() {
        return this.f88125i.t();
    }

    public int getItemIconPadding() {
        return this.f88125i.u();
    }

    public ColorStateList getItemIconTintList() {
        return this.f88125i.x();
    }

    public int getItemMaxLines() {
        return this.f88125i.v();
    }

    public ColorStateList getItemTextColor() {
        return this.f88125i.w();
    }

    public int getItemVerticalPadding() {
        return this.f88125i.y();
    }

    public Menu getMenu() {
        return this.f88124h;
    }

    public int getSubheaderInsetEnd() {
        return this.f88125i.A();
    }

    public int getSubheaderInsetStart() {
        return this.f88125i.B();
    }

    public View n(int i10) {
        return this.f88125i.r(i10);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        this.f88124h.T(eVar.f88143c);
    }

    public View p(int i10) {
        return this.f88125i.D(i10);
    }

    public void q(int i10) {
        this.f88125i.Z(true);
        getMenuInflater().inflate(i10, this.f88124h);
        this.f88125i.Z(false);
        this.f88125i.i(false);
    }

    public boolean r() {
        return this.f88132p;
    }

    public boolean s() {
        return this.f88131o;
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f88132p = z10;
    }

    public void setDividerInsetEnd(int i10) {
        this.f88125i.G(i10);
    }

    public void setDividerInsetStart(int i10) {
        this.f88125i.H(i10);
    }

    public void setForceCompatClippingEnabled(boolean z10) {
        this.f88136t.g(this, z10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f88125i.J(drawable);
    }

    public void setItemHorizontalPadding(int i10) {
        this.f88125i.L(i10);
    }

    public void setItemHorizontalPaddingResource(int i10) {
        this.f88125i.L(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconPadding(int i10) {
        this.f88125i.M(i10);
    }

    public void setItemIconPaddingResource(int i10) {
        this.f88125i.M(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(int i10) {
        this.f88125i.N(i10);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f88125i.O(colorStateList);
    }

    public void setItemMaxLines(int i10) {
        this.f88125i.P(i10);
    }

    public void setItemTextAppearance(int i10) {
        this.f88125i.Q(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f88125i.R(z10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f88125i.S(colorStateList);
    }

    public void setItemVerticalPadding(int i10) {
        this.f88125i.T(i10);
    }

    public void setItemVerticalPaddingResource(int i10) {
        this.f88125i.T(getResources().getDimensionPixelSize(i10));
    }

    public void setNavigationItemSelectedListener(d dVar) {
        this.f88126j = dVar;
    }

    public void setSubheaderInsetEnd(int i10) {
        this.f88125i.W(i10);
    }

    public void setSubheaderInsetStart(int i10) {
        this.f88125i.X(i10);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f88131o = z10;
    }

    private Drawable l(M m10) {
        return m(m10, C16634c.b(getContext(), m10, l.f62088W5));
    }

    private void u(int i10, int i11) {
        boolean z10;
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.e)) {
            if ((this.f88133q > 0 || this.f88134r) && (getBackground() instanceof C17234h)) {
                if (r.b(((DrawerLayout.e) getLayoutParams()).f54771a, ViewCompat.z(this)) == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C17234h c17234h = (C17234h) getBackground();
                C17239m.b bVarO = c17234h.E().v().o(this.f88133q);
                if (z10) {
                    bVarO.D(0.0f);
                    bVarO.v(0.0f);
                } else {
                    bVarO.H(0.0f);
                    bVarO.z(0.0f);
                }
                C17239m c17239mM = bVarO.m();
                c17234h.setShapeAppearanceModel(c17239mM);
                this.f88136t.f(this, c17239mM);
                this.f88136t.e(this, new RectF(0.0f, 0.0f, i10, i11));
                this.f88136t.h(this, true);
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

    @Override // pe.InterfaceC16420b
    public void a() {
        v();
        this.f88137u.f();
        t();
    }

    @Override // pe.InterfaceC16420b
    public void b(C5756b c5756b) {
        v();
        this.f88137u.j(c5756b);
    }

    @Override // pe.InterfaceC16420b
    public void c(C5756b c5756b) {
        this.f88137u.l(c5756b, ((DrawerLayout.e) v().second).f54771a);
        if (this.f88134r) {
            this.f88133q = C13661a.c(0, this.f88135s, this.f88137u.a(c5756b.getProgress()));
            u(getWidth(), getHeight());
        }
    }

    @Override // pe.InterfaceC16420b
    public void d() {
        Pair<DrawerLayout, DrawerLayout.e> pairV = v();
        DrawerLayout drawerLayout = (DrawerLayout) pairV.first;
        C5756b c5756bC = this.f88137u.c();
        if (c5756bC != null && Build.VERSION.SDK_INT >= 34) {
            this.f88137u.h(c5756bC, ((DrawerLayout.e) pairV.second).f54771a, com.google.android.material.navigation.b.b(drawerLayout, this), com.google.android.material.navigation.b.c(drawerLayout));
            return;
        }
        drawerLayout.h(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C17235i.e(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.f88138v.b()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.Q(this.f88139w);
            drawerLayout.c(this.f88139w);
            if (drawerLayout.F(this)) {
                this.f88138v.e();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f88130n);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).Q(this.f88139w);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i10 = View.MeasureSpec.makeMeasureSpec(this.f88127k, 1073741824);
            }
        } else {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f88127k), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        eVar.f88143c = bundle;
        this.f88124h.V(bundle);
        return eVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        u(i10, i11);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f88124h.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f88125i.F((androidx.appcompat.view.menu.h) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C17235i.d(this, f10);
    }

    public void setItemBackgroundResource(int i10) {
        setItemBackground(Z1.b.e(getContext(), i10));
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        com.google.android.material.internal.k kVar = this.f88125i;
        if (kVar != null) {
            kVar.U(i10);
        }
    }
}
