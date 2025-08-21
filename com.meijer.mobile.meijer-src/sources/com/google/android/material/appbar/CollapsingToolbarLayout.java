package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import ce.C6503b;
import ce.k;
import ce.l;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.p;
import com.google.android.material.internal.s;
import d2.C13595a;
import de.C13661a;
import h2.C14442a;
import i.C14586i;
import ke.C15121a;
import me.C15711a;
import p2.G;
import pe.i;
import qe.C16634c;
import we.C17867a;

/* loaded from: classes4.dex */
public class CollapsingToolbarLayout extends FrameLayout implements FSDraw, FSDispatchDraw {

    /* renamed from: F, reason: collision with root package name */
    private static final int f87055F = k.f61811l;

    /* renamed from: A, reason: collision with root package name */
    j f87056A;

    /* renamed from: B, reason: collision with root package name */
    private int f87057B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f87058C;

    /* renamed from: D, reason: collision with root package name */
    private int f87059D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f87060E;

    /* renamed from: a, reason: collision with root package name */
    private boolean f87061a;

    /* renamed from: b, reason: collision with root package name */
    private int f87062b;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f87063c;

    /* renamed from: d, reason: collision with root package name */
    private View f87064d;

    /* renamed from: e, reason: collision with root package name */
    private View f87065e;

    /* renamed from: f, reason: collision with root package name */
    private int f87066f;

    /* renamed from: g, reason: collision with root package name */
    private int f87067g;

    /* renamed from: h, reason: collision with root package name */
    private int f87068h;

    /* renamed from: i, reason: collision with root package name */
    private int f87069i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f87070j;

    /* renamed from: k, reason: collision with root package name */
    final com.google.android.material.internal.b f87071k;

    /* renamed from: l, reason: collision with root package name */
    final C15711a f87072l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f87073m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f87074n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f87075o;

    /* renamed from: p, reason: collision with root package name */
    Drawable f87076p;

    /* renamed from: q, reason: collision with root package name */
    private int f87077q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f87078r;

    /* renamed from: s, reason: collision with root package name */
    private ValueAnimator f87079s;

    /* renamed from: t, reason: collision with root package name */
    private long f87080t;

    /* renamed from: u, reason: collision with root package name */
    private final TimeInterpolator f87081u;

    /* renamed from: v, reason: collision with root package name */
    private final TimeInterpolator f87082v;

    /* renamed from: w, reason: collision with root package name */
    private int f87083w;

    /* renamed from: x, reason: collision with root package name */
    private AppBarLayout.g f87084x;

    /* renamed from: y, reason: collision with root package name */
    int f87085y;

    /* renamed from: z, reason: collision with root package name */
    private int f87086z;

    class a implements G {
        a() {
        }

        @Override // p2.G
        public j onApplyWindowInsets(View view, j jVar) {
            return CollapsingToolbarLayout.this.o(jVar);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static class c extends FrameLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        int f87089a;

        /* renamed from: b, reason: collision with root package name */
        float f87090b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f87089a = 0;
            this.f87090b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f62357t2);
            this.f87089a = typedArrayObtainStyledAttributes.getInt(l.f62369u2, 0);
            a(typedArrayObtainStyledAttributes.getFloat(l.f62381v2, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(float f10) {
            this.f87090b = f10;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f87089a = 0;
            this.f87090b = 0.5f;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f87089a = 0;
            this.f87090b = 0.5f;
        }
    }

    private class d implements AppBarLayout.g {
        d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f87085y = i10;
            j jVar = collapsingToolbarLayout.f87056A;
            int iM = jVar != null ? jVar.m() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i11);
                c cVar = (c) childAt.getLayoutParams();
                g gVarK = CollapsingToolbarLayout.k(childAt);
                int i12 = cVar.f87089a;
                if (i12 == 1) {
                    gVarK.f(C14442a.b(-i10, 0, CollapsingToolbarLayout.this.i(childAt)));
                } else if (i12 == 2) {
                    gVarK.f(Math.round((-i10) * cVar.f87090b));
                }
            }
            CollapsingToolbarLayout.this.v();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f87076p != null && iM > 0) {
                ViewCompat.d0(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - ViewCompat.A(CollapsingToolbarLayout.this)) - iM;
            float f10 = height;
            CollapsingToolbarLayout.this.f87071k.A0(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f10));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f87071k.n0(collapsingToolbarLayout3.f87085y + height);
            CollapsingToolbarLayout.this.f87071k.y0(Math.abs(i10) / f10);
        }
    }

    public interface e extends p {
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6503b.f61538j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fsSuperDispatchDraw_a4f747f8c6522885e06164c6aff676b4(canvas);
    }

    public void fsSuperDispatchDraw_a4f747f8c6522885e06164c6aff676b4(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_a4f747f8c6522885e06164c6aff676b4(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void fsSuperDraw_a4f747f8c6522885e06164c6aff676b4(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    public void setCollapsedTitleTextColor(int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f87055F;
        super(C17867a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f87061a = true;
        this.f87070j = new Rect();
        this.f87083w = -1;
        this.f87057B = 0;
        this.f87059D = 0;
        Context context2 = getContext();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f87071k = bVar;
        bVar.L0(C13661a.f128354e);
        bVar.H0(false);
        this.f87072l = new C15711a(context2);
        TypedArray typedArrayI = s.i(context2, attributeSet, l.f62062U1, i10, i11, new int[0]);
        bVar.u0(typedArrayI.getInt(l.f62117Z1, 8388691));
        bVar.j0(typedArrayI.getInt(l.f62073V1, 8388627));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(l.f62129a2, 0);
        this.f87069i = dimensionPixelSize;
        this.f87068h = dimensionPixelSize;
        this.f87067g = dimensionPixelSize;
        this.f87066f = dimensionPixelSize;
        if (typedArrayI.hasValue(l.f62165d2)) {
            this.f87066f = typedArrayI.getDimensionPixelSize(l.f62165d2, 0);
        }
        if (typedArrayI.hasValue(l.f62153c2)) {
            this.f87068h = typedArrayI.getDimensionPixelSize(l.f62153c2, 0);
        }
        if (typedArrayI.hasValue(l.f62177e2)) {
            this.f87067g = typedArrayI.getDimensionPixelSize(l.f62177e2, 0);
        }
        if (typedArrayI.hasValue(l.f62141b2)) {
            this.f87069i = typedArrayI.getDimensionPixelSize(l.f62141b2, 0);
        }
        this.f87073m = typedArrayI.getBoolean(l.f62309p2, true);
        setTitle(typedArrayI.getText(l.f62285n2));
        bVar.r0(k.f61804e);
        bVar.g0(C14586i.f136439d);
        if (typedArrayI.hasValue(l.f62189f2)) {
            bVar.r0(typedArrayI.getResourceId(l.f62189f2, 0));
        }
        if (typedArrayI.hasValue(l.f62084W1)) {
            bVar.g0(typedArrayI.getResourceId(l.f62084W1, 0));
        }
        if (typedArrayI.hasValue(l.f62333r2)) {
            setTitleEllipsize(b(typedArrayI.getInt(l.f62333r2, -1)));
        }
        if (typedArrayI.hasValue(l.f62201g2)) {
            bVar.t0(C16634c.a(context2, typedArrayI, l.f62201g2));
        }
        if (typedArrayI.hasValue(l.f62095X1)) {
            bVar.i0(C16634c.a(context2, typedArrayI, l.f62095X1));
        }
        this.f87083w = typedArrayI.getDimensionPixelSize(l.f62261l2, -1);
        if (typedArrayI.hasValue(l.f62237j2)) {
            bVar.F0(typedArrayI.getInt(l.f62237j2, 1));
        }
        if (typedArrayI.hasValue(l.f62321q2)) {
            bVar.G0(AnimationUtils.loadInterpolator(context2, typedArrayI.getResourceId(l.f62321q2, 0)));
        }
        this.f87080t = typedArrayI.getInt(l.f62249k2, 600);
        this.f87081u = i.g(context2, C6503b.f61515V, C13661a.f128352c);
        this.f87082v = i.g(context2, C6503b.f61515V, C13661a.f128353d);
        setContentScrim(__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayI, l.f62106Y1));
        setStatusBarScrim(__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayI, l.f62273m2));
        setTitleCollapseMode(typedArrayI.getInt(l.f62297o2, 0));
        this.f87062b = typedArrayI.getResourceId(l.f62345s2, -1);
        this.f87058C = typedArrayI.getBoolean(l.f62225i2, false);
        this.f87060E = typedArrayI.getBoolean(l.f62213h2, false);
        typedArrayI.recycle();
        setWillNotDraw(false);
        ViewCompat.A0(this, new a());
    }

    private TextUtils.TruncateAt b(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    private void d() {
        if (this.f87061a) {
            ViewGroup viewGroup = null;
            this.f87063c = null;
            this.f87064d = null;
            int i10 = this.f87062b;
            if (i10 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
                this.f87063c = viewGroup2;
                if (viewGroup2 != null) {
                    this.f87064d = e(viewGroup2);
                }
            }
            if (this.f87063c == null) {
                int childCount = getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i11);
                    if (m(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i11++;
                }
                this.f87063c = viewGroup;
            }
            u();
            this.f87061a = false;
        }
    }

    private static CharSequence j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    static g k(View view) {
        g gVar = (g) view.getTag(ce.f.f61697a0);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(view);
        view.setTag(ce.f.f61697a0, gVar2);
        return gVar2;
    }

    private boolean l() {
        return this.f87086z == 1;
    }

    private static boolean m(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean n(View view) {
        View view2 = this.f87064d;
        return (view2 == null || view2 == this) ? view == this.f87063c : view == view2;
    }

    private void q(boolean z10) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.f87064d;
        if (view == null) {
            view = this.f87063c;
        }
        int i10 = i(view);
        com.google.android.material.internal.d.a(this, this.f87065e, this.f87070j);
        ViewGroup viewGroup = this.f87063c;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        com.google.android.material.internal.b bVar = this.f87071k;
        Rect rect = this.f87070j;
        int i11 = rect.left + (z10 ? titleMarginEnd : titleMarginStart);
        int i12 = rect.top + i10 + titleMarginTop;
        int i13 = rect.right;
        if (!z10) {
            titleMarginStart = titleMarginEnd;
        }
        bVar.e0(i11, i12, i13 - titleMarginStart, (rect.bottom + i10) - titleMarginBottom);
    }

    private void s(Drawable drawable, int i10, int i11) {
        t(drawable, this.f87063c, i10, i11);
    }

    private void u() {
        View view;
        if (!this.f87073m && (view = this.f87065e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f87065e);
            }
        }
        if (!this.f87073m || this.f87063c == null) {
            return;
        }
        if (this.f87065e == null) {
            this.f87065e = new View(getContext());
        }
        if (this.f87065e.getParent() == null) {
            this.f87063c.addView(this.f87065e, -1, -1);
        }
    }

    private void w(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        if (!this.f87073m || (view = this.f87065e) == null) {
            return;
        }
        boolean z11 = ViewCompat.R(view) && this.f87065e.getVisibility() == 0;
        this.f87074n = z11;
        if (z11 || z10) {
            boolean z12 = ViewCompat.z(this) == 1;
            q(z12);
            this.f87071k.o0(z12 ? this.f87068h : this.f87066f, this.f87070j.top + this.f87067g, (i12 - i10) - (z12 ? this.f87066f : this.f87068h), (i13 - i11) - this.f87069i);
            this.f87071k.b0(z10);
        }
    }

    private void x() {
        if (this.f87063c != null && this.f87073m && TextUtils.isEmpty(this.f87071k.O())) {
            setTitle(j(this.f87063c));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (this.f87075o == null || this.f87077q <= 0 || !n(view)) {
            z10 = false;
        } else {
            t(this.f87075o, view, getWidth(), getHeight());
            this.f87075o.mutate().setAlpha(this.f87077q);
            this.f87075o.draw(canvas);
            z10 = true;
        }
        return fsSuperDrawChild_a4f747f8c6522885e06164c6aff676b4(canvas, view, j10) || z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f87071k.q();
    }

    public float getCollapsedTitleTextSize() {
        return this.f87071k.u();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f87071k.v();
    }

    public Drawable getContentScrim() {
        return this.f87075o;
    }

    public int getExpandedTitleGravity() {
        return this.f87071k.B();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f87069i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f87068h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f87066f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f87067g;
    }

    public float getExpandedTitleTextSize() {
        return this.f87071k.D();
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f87071k.E();
    }

    public int getHyphenationFrequency() {
        return this.f87071k.H();
    }

    public int getLineCount() {
        return this.f87071k.I();
    }

    public float getLineSpacingAdd() {
        return this.f87071k.J();
    }

    public float getLineSpacingMultiplier() {
        return this.f87071k.K();
    }

    public int getMaxLines() {
        return this.f87071k.L();
    }

    int getScrimAlpha() {
        return this.f87077q;
    }

    public long getScrimAnimationDuration() {
        return this.f87080t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.f87083w;
        if (i10 >= 0) {
            return i10 + this.f87057B + this.f87059D;
        }
        j jVar = this.f87056A;
        int iM = jVar != null ? jVar.m() : 0;
        int iA = ViewCompat.A(this);
        return iA > 0 ? Math.min((iA * 2) + iM, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f87076p;
    }

    public CharSequence getTitle() {
        if (this.f87073m) {
            return this.f87071k.O();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f87086z;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f87071k.N();
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f87071k.R();
    }

    public void p(boolean z10, boolean z11) {
        if (this.f87078r != z10) {
            if (z11) {
                a(z10 ? 255 : 0);
            } else {
                setScrimAlpha(z10 ? 255 : 0);
            }
            this.f87078r = z10;
        }
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f87071k.j0(i10);
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        this.f87071k.g0(i10);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f87071k.i0(colorStateList);
    }

    public void setCollapsedTitleTextSize(float f10) {
        this.f87071k.k0(f10);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f87071k.l0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f87075o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f87075o = drawableMutate;
            if (drawableMutate != null) {
                s(drawableMutate, getWidth(), getHeight());
                this.f87075o.setCallback(this);
                this.f87075o.setAlpha(this.f87077q);
            }
            ViewCompat.d0(this);
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        this.f87071k.u0(i10);
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f87069i = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f87068h = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f87066f = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f87067g = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        this.f87071k.r0(i10);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f87071k.t0(colorStateList);
    }

    public void setExpandedTitleTextSize(float f10) {
        this.f87071k.v0(f10);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f87071k.w0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.f87060E = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.f87058C = z10;
    }

    public void setHyphenationFrequency(int i10) {
        this.f87071k.B0(i10);
    }

    public void setLineSpacingAdd(float f10) {
        this.f87071k.D0(f10);
    }

    public void setLineSpacingMultiplier(float f10) {
        this.f87071k.E0(f10);
    }

    public void setMaxLines(int i10) {
        this.f87071k.F0(i10);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f87071k.H0(z10);
    }

    void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f87077q) {
            if (this.f87075o != null && (viewGroup = this.f87063c) != null) {
                ViewCompat.d0(viewGroup);
            }
            this.f87077q = i10;
            ViewCompat.d0(this);
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.f87080t = j10;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.f87083w != i10) {
            this.f87083w = i10;
            v();
        }
    }

    public void setStaticLayoutBuilderConfigurer(e eVar) {
        this.f87071k.J0(eVar);
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f87076p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f87076p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f87076p.setState(getDrawableState());
                }
                C13595a.m(this.f87076p, ViewCompat.z(this));
                this.f87076p.setVisible(getVisibility() == 0, false);
                this.f87076p.setCallback(this);
                this.f87076p.setAlpha(this.f87077q);
            }
            ViewCompat.d0(this);
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setTitle(CharSequence charSequence) {
        this.f87071k.K0(charSequence);
        r();
    }

    public void setTitleCollapseMode(int i10) {
        this.f87086z = i10;
        boolean zL = l();
        this.f87071k.z0(zL);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            c((AppBarLayout) parent);
        }
        if (zL && this.f87075o == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f87071k.M0(truncateAt);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f87073m) {
            this.f87073m = z10;
            r();
            u();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f87071k.G0(timeInterpolator);
    }

    final void v() {
        if (this.f87075o == null && this.f87076p == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f87085y < getScrimVisibleHeightTrigger());
    }

    private void a(int i10) {
        TimeInterpolator timeInterpolator;
        d();
        ValueAnimator valueAnimator = this.f87079s;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f87079s = valueAnimator2;
            if (i10 > this.f87077q) {
                timeInterpolator = this.f87081u;
            } else {
                timeInterpolator = this.f87082v;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.f87079s.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.f87079s.cancel();
        }
        this.f87079s.setDuration(this.f87080t);
        this.f87079s.setIntValues(this.f87077q, i10);
        this.f87079s.start();
    }

    private void c(AppBarLayout appBarLayout) {
        if (l()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private View e(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() throws Resources.NotFoundException {
        ColorStateList colorStateListG = C15121a.g(getContext(), C6503b.f61558t);
        if (colorStateListG != null) {
            return colorStateListG.getDefaultColor();
        }
        return this.f87072l.d(getResources().getDimension(ce.d.f61606a));
    }

    private static int h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    private void r() {
        setContentDescription(getTitle());
    }

    private void t(Drawable drawable, View view, int i10, int i11) {
        if (l() && view != null && this.f87073m) {
            i11 = view.getBottom();
        }
        drawable.setBounds(0, 0, i10, i11);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iM;
        Drawable drawable;
        fsSuperDraw_a4f747f8c6522885e06164c6aff676b4(canvas);
        d();
        if (this.f87063c == null && (drawable = this.f87075o) != null && this.f87077q > 0) {
            drawable.mutate().setAlpha(this.f87077q);
            this.f87075o.draw(canvas);
        }
        if (this.f87073m && this.f87074n) {
            if (this.f87063c != null && this.f87075o != null && this.f87077q > 0 && l() && this.f87071k.F() < this.f87071k.G()) {
                int iSave = canvas.save();
                canvas.clipRect(this.f87075o.getBounds(), Region.Op.DIFFERENCE);
                this.f87071k.l(canvas);
                canvas.restoreToCount(iSave);
            } else {
                this.f87071k.l(canvas);
            }
        }
        if (this.f87076p != null && this.f87077q > 0) {
            j jVar = this.f87056A;
            if (jVar != null) {
                iM = jVar.m();
            } else {
                iM = 0;
            }
            if (iM > 0) {
                this.f87076p.setBounds(0, -this.f87085y, getWidth(), iM - this.f87085y);
                this.f87076p.mutate().setAlpha(this.f87077q);
                this.f87076p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean zI0;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f87076p;
        if (drawable != null && drawable.isStateful()) {
            zI0 = drawable.setState(drawableState);
        } else {
            zI0 = false;
        }
        Drawable drawable2 = this.f87075o;
        if (drawable2 != null && drawable2.isStateful()) {
            zI0 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.b bVar = this.f87071k;
        if (bVar != null) {
            zI0 |= bVar.I0(drawableState);
        }
        if (zI0) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    final int i(View view) {
        return ((getHeight() - k(view).b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    j o(j jVar) {
        j jVar2;
        if (ViewCompat.w(this)) {
            jVar2 = jVar;
        } else {
            jVar2 = null;
        }
        if (!o2.c.a(this.f87056A, jVar2)) {
            this.f87056A = jVar2;
            requestLayout();
        }
        return jVar.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            c(appBarLayout);
            ViewCompat.v0(this, ViewCompat.w(appBarLayout));
            if (this.f87084x == null) {
                this.f87084x = new d();
            }
            appBarLayout.d(this.f87084x);
            ViewCompat.j0(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f87071k.Y(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.g gVar = this.f87084x;
        if (gVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).v(gVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j jVar = this.f87056A;
        if (jVar != null) {
            int iM = jVar.m();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (!ViewCompat.w(childAt) && childAt.getTop() < iM) {
                    ViewCompat.Y(childAt, iM);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            k(getChildAt(i15)).d();
        }
        w(i10, i11, i12, i13, false);
        x();
        v();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            k(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iM;
        CollapsingToolbarLayout collapsingToolbarLayout;
        d();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        j jVar = this.f87056A;
        if (jVar != null) {
            iM = jVar.m();
        } else {
            iM = 0;
        }
        if ((mode == 0 || this.f87058C) && iM > 0) {
            this.f87057B = iM;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iM, 1073741824));
        }
        if (this.f87060E && this.f87071k.L() > 1) {
            x();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.w(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int iZ = collapsingToolbarLayout.f87071k.z();
            if (iZ > 1) {
                collapsingToolbarLayout.f87059D = Math.round(collapsingToolbarLayout.f87071k.A()) * (iZ - 1);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + collapsingToolbarLayout.f87059D, 1073741824));
            }
        } else {
            collapsingToolbarLayout = this;
        }
        ViewGroup viewGroup = collapsingToolbarLayout.f87063c;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.f87064d;
            if (view != null && view != collapsingToolbarLayout) {
                setMinimumHeight(h(view));
            } else {
                setMinimumHeight(h(viewGroup));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f87075o;
        if (drawable != null) {
            s(drawable, i10, i11);
        }
    }

    public void setContentScrimResource(int i10) {
        setContentScrim(Z1.b.e(getContext(), i10));
    }

    public void setExpandedTitleColor(int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setScrimsShown(boolean z10) {
        boolean z11;
        if (ViewCompat.S(this) && !isInEditMode()) {
            z11 = true;
        } else {
            z11 = false;
        }
        p(z10, z11);
    }

    public void setStatusBarScrimResource(int i10) {
        setStatusBarScrim(Z1.b.e(getContext(), i10));
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f87076p;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f87076p.setVisible(z10, false);
        }
        Drawable drawable2 = this.f87075o;
        if (drawable2 != null && drawable2.isVisible() != z10) {
            this.f87075o.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f87075o && drawable != this.f87076p) {
            return false;
        }
        return true;
    }
}
