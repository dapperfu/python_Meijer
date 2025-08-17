package com.google.android.material.appbar;

import ae.C5597b;
import ae.k;
import ae.l;
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
import be.C6230a;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.p;
import com.google.android.material.internal.s;
import d2.C13462a;
import h2.C14329a;
import i.C14583i;
import ie.C14718a;
import ke.C15140a;
import ne.i;
import oe.C16026c;
import p2.G;
import ue.C17250a;

/* loaded from: classes4.dex */
public class CollapsingToolbarLayout extends FrameLayout implements FSDraw, FSDispatchDraw {

    /* renamed from: F, reason: collision with root package name */
    private static final int f86215F = k.f44796l;

    /* renamed from: A, reason: collision with root package name */
    j f86216A;

    /* renamed from: B, reason: collision with root package name */
    private int f86217B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f86218C;

    /* renamed from: D, reason: collision with root package name */
    private int f86219D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f86220E;

    /* renamed from: a, reason: collision with root package name */
    private boolean f86221a;

    /* renamed from: b, reason: collision with root package name */
    private int f86222b;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f86223c;

    /* renamed from: d, reason: collision with root package name */
    private View f86224d;

    /* renamed from: e, reason: collision with root package name */
    private View f86225e;

    /* renamed from: f, reason: collision with root package name */
    private int f86226f;

    /* renamed from: g, reason: collision with root package name */
    private int f86227g;

    /* renamed from: h, reason: collision with root package name */
    private int f86228h;

    /* renamed from: i, reason: collision with root package name */
    private int f86229i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f86230j;

    /* renamed from: k, reason: collision with root package name */
    final com.google.android.material.internal.b f86231k;

    /* renamed from: l, reason: collision with root package name */
    final C15140a f86232l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f86233m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f86234n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f86235o;

    /* renamed from: p, reason: collision with root package name */
    Drawable f86236p;

    /* renamed from: q, reason: collision with root package name */
    private int f86237q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f86238r;

    /* renamed from: s, reason: collision with root package name */
    private ValueAnimator f86239s;

    /* renamed from: t, reason: collision with root package name */
    private long f86240t;

    /* renamed from: u, reason: collision with root package name */
    private final TimeInterpolator f86241u;

    /* renamed from: v, reason: collision with root package name */
    private final TimeInterpolator f86242v;

    /* renamed from: w, reason: collision with root package name */
    private int f86243w;

    /* renamed from: x, reason: collision with root package name */
    private AppBarLayout.g f86244x;

    /* renamed from: y, reason: collision with root package name */
    int f86245y;

    /* renamed from: z, reason: collision with root package name */
    private int f86246z;

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
        int f86249a;

        /* renamed from: b, reason: collision with root package name */
        float f86250b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f86249a = 0;
            this.f86250b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f45342t2);
            this.f86249a = typedArrayObtainStyledAttributes.getInt(l.f45354u2, 0);
            a(typedArrayObtainStyledAttributes.getFloat(l.f45366v2, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(float f10) {
            this.f86250b = f10;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f86249a = 0;
            this.f86250b = 0.5f;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f86249a = 0;
            this.f86250b = 0.5f;
        }
    }

    private class d implements AppBarLayout.g {
        d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f86245y = i10;
            j jVar = collapsingToolbarLayout.f86216A;
            int iM = jVar != null ? jVar.m() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i11);
                c cVar = (c) childAt.getLayoutParams();
                g gVarK = CollapsingToolbarLayout.k(childAt);
                int i12 = cVar.f86249a;
                if (i12 == 1) {
                    gVarK.f(C14329a.b(-i10, 0, CollapsingToolbarLayout.this.i(childAt)));
                } else if (i12 == 2) {
                    gVarK.f(Math.round((-i10) * cVar.f86250b));
                }
            }
            CollapsingToolbarLayout.this.v();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f86236p != null && iM > 0) {
                ViewCompat.d0(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - ViewCompat.A(CollapsingToolbarLayout.this)) - iM;
            float f10 = height;
            CollapsingToolbarLayout.this.f86231k.A0(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f10));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f86231k.n0(collapsingToolbarLayout3.f86245y + height);
            CollapsingToolbarLayout.this.f86231k.y0(Math.abs(i10) / f10);
        }
    }

    public interface e extends p {
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44523j);
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
        int i11 = f86215F;
        super(C17250a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f86221a = true;
        this.f86230j = new Rect();
        this.f86243w = -1;
        this.f86217B = 0;
        this.f86219D = 0;
        Context context2 = getContext();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f86231k = bVar;
        bVar.L0(C6230a.f60119e);
        bVar.H0(false);
        this.f86232l = new C15140a(context2);
        TypedArray typedArrayI = s.i(context2, attributeSet, l.f45047U1, i10, i11, new int[0]);
        bVar.u0(typedArrayI.getInt(l.f45102Z1, 8388691));
        bVar.j0(typedArrayI.getInt(l.f45058V1, 8388627));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(l.f45114a2, 0);
        this.f86229i = dimensionPixelSize;
        this.f86228h = dimensionPixelSize;
        this.f86227g = dimensionPixelSize;
        this.f86226f = dimensionPixelSize;
        if (typedArrayI.hasValue(l.f45150d2)) {
            this.f86226f = typedArrayI.getDimensionPixelSize(l.f45150d2, 0);
        }
        if (typedArrayI.hasValue(l.f45138c2)) {
            this.f86228h = typedArrayI.getDimensionPixelSize(l.f45138c2, 0);
        }
        if (typedArrayI.hasValue(l.f45162e2)) {
            this.f86227g = typedArrayI.getDimensionPixelSize(l.f45162e2, 0);
        }
        if (typedArrayI.hasValue(l.f45126b2)) {
            this.f86229i = typedArrayI.getDimensionPixelSize(l.f45126b2, 0);
        }
        this.f86233m = typedArrayI.getBoolean(l.f45294p2, true);
        setTitle(typedArrayI.getText(l.f45270n2));
        bVar.r0(k.f44789e);
        bVar.g0(C14583i.f136682d);
        if (typedArrayI.hasValue(l.f45174f2)) {
            bVar.r0(typedArrayI.getResourceId(l.f45174f2, 0));
        }
        if (typedArrayI.hasValue(l.f45069W1)) {
            bVar.g0(typedArrayI.getResourceId(l.f45069W1, 0));
        }
        if (typedArrayI.hasValue(l.f45318r2)) {
            setTitleEllipsize(b(typedArrayI.getInt(l.f45318r2, -1)));
        }
        if (typedArrayI.hasValue(l.f45186g2)) {
            bVar.t0(C16026c.a(context2, typedArrayI, l.f45186g2));
        }
        if (typedArrayI.hasValue(l.f45080X1)) {
            bVar.i0(C16026c.a(context2, typedArrayI, l.f45080X1));
        }
        this.f86243w = typedArrayI.getDimensionPixelSize(l.f45246l2, -1);
        if (typedArrayI.hasValue(l.f45222j2)) {
            bVar.F0(typedArrayI.getInt(l.f45222j2, 1));
        }
        if (typedArrayI.hasValue(l.f45306q2)) {
            bVar.G0(AnimationUtils.loadInterpolator(context2, typedArrayI.getResourceId(l.f45306q2, 0)));
        }
        this.f86240t = typedArrayI.getInt(l.f45234k2, 600);
        this.f86241u = i.g(context2, C5597b.f44500V, C6230a.f60117c);
        this.f86242v = i.g(context2, C5597b.f44500V, C6230a.f60118d);
        setContentScrim(__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayI, l.f45091Y1));
        setStatusBarScrim(__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayI, l.f45258m2));
        setTitleCollapseMode(typedArrayI.getInt(l.f45282o2, 0));
        this.f86222b = typedArrayI.getResourceId(l.f45330s2, -1);
        this.f86218C = typedArrayI.getBoolean(l.f45210i2, false);
        this.f86220E = typedArrayI.getBoolean(l.f45198h2, false);
        typedArrayI.recycle();
        setWillNotDraw(false);
        ViewCompat.A0(this, new a());
    }

    private TextUtils.TruncateAt b(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    private void d() {
        if (this.f86221a) {
            ViewGroup viewGroup = null;
            this.f86223c = null;
            this.f86224d = null;
            int i10 = this.f86222b;
            if (i10 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
                this.f86223c = viewGroup2;
                if (viewGroup2 != null) {
                    this.f86224d = e(viewGroup2);
                }
            }
            if (this.f86223c == null) {
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
                this.f86223c = viewGroup;
            }
            u();
            this.f86221a = false;
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
        g gVar = (g) view.getTag(ae.f.f44682a0);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(view);
        view.setTag(ae.f.f44682a0, gVar2);
        return gVar2;
    }

    private boolean l() {
        return this.f86246z == 1;
    }

    private static boolean m(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean n(View view) {
        View view2 = this.f86224d;
        return (view2 == null || view2 == this) ? view == this.f86223c : view == view2;
    }

    private void q(boolean z10) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.f86224d;
        if (view == null) {
            view = this.f86223c;
        }
        int i10 = i(view);
        com.google.android.material.internal.d.a(this, this.f86225e, this.f86230j);
        ViewGroup viewGroup = this.f86223c;
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
        com.google.android.material.internal.b bVar = this.f86231k;
        Rect rect = this.f86230j;
        int i11 = rect.left + (z10 ? titleMarginEnd : titleMarginStart);
        int i12 = rect.top + i10 + titleMarginTop;
        int i13 = rect.right;
        if (!z10) {
            titleMarginStart = titleMarginEnd;
        }
        bVar.e0(i11, i12, i13 - titleMarginStart, (rect.bottom + i10) - titleMarginBottom);
    }

    private void s(Drawable drawable, int i10, int i11) {
        t(drawable, this.f86223c, i10, i11);
    }

    private void u() {
        View view;
        if (!this.f86233m && (view = this.f86225e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f86225e);
            }
        }
        if (!this.f86233m || this.f86223c == null) {
            return;
        }
        if (this.f86225e == null) {
            this.f86225e = new View(getContext());
        }
        if (this.f86225e.getParent() == null) {
            this.f86223c.addView(this.f86225e, -1, -1);
        }
    }

    private void w(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        if (!this.f86233m || (view = this.f86225e) == null) {
            return;
        }
        boolean z11 = ViewCompat.R(view) && this.f86225e.getVisibility() == 0;
        this.f86234n = z11;
        if (z11 || z10) {
            boolean z12 = ViewCompat.z(this) == 1;
            q(z12);
            this.f86231k.o0(z12 ? this.f86228h : this.f86226f, this.f86230j.top + this.f86227g, (i12 - i10) - (z12 ? this.f86226f : this.f86228h), (i13 - i11) - this.f86229i);
            this.f86231k.b0(z10);
        }
    }

    private void x() {
        if (this.f86223c != null && this.f86233m && TextUtils.isEmpty(this.f86231k.O())) {
            setTitle(j(this.f86223c));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (this.f86235o == null || this.f86237q <= 0 || !n(view)) {
            z10 = false;
        } else {
            t(this.f86235o, view, getWidth(), getHeight());
            this.f86235o.mutate().setAlpha(this.f86237q);
            this.f86235o.draw(canvas);
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
        return this.f86231k.q();
    }

    public float getCollapsedTitleTextSize() {
        return this.f86231k.u();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f86231k.v();
    }

    public Drawable getContentScrim() {
        return this.f86235o;
    }

    public int getExpandedTitleGravity() {
        return this.f86231k.B();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f86229i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f86228h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f86226f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f86227g;
    }

    public float getExpandedTitleTextSize() {
        return this.f86231k.D();
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f86231k.E();
    }

    public int getHyphenationFrequency() {
        return this.f86231k.H();
    }

    public int getLineCount() {
        return this.f86231k.I();
    }

    public float getLineSpacingAdd() {
        return this.f86231k.J();
    }

    public float getLineSpacingMultiplier() {
        return this.f86231k.K();
    }

    public int getMaxLines() {
        return this.f86231k.L();
    }

    int getScrimAlpha() {
        return this.f86237q;
    }

    public long getScrimAnimationDuration() {
        return this.f86240t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.f86243w;
        if (i10 >= 0) {
            return i10 + this.f86217B + this.f86219D;
        }
        j jVar = this.f86216A;
        int iM = jVar != null ? jVar.m() : 0;
        int iA = ViewCompat.A(this);
        return iA > 0 ? Math.min((iA * 2) + iM, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f86236p;
    }

    public CharSequence getTitle() {
        if (this.f86233m) {
            return this.f86231k.O();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f86246z;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f86231k.N();
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f86231k.R();
    }

    public void p(boolean z10, boolean z11) {
        if (this.f86238r != z10) {
            if (z11) {
                a(z10 ? 255 : 0);
            } else {
                setScrimAlpha(z10 ? 255 : 0);
            }
            this.f86238r = z10;
        }
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f86231k.j0(i10);
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        this.f86231k.g0(i10);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f86231k.i0(colorStateList);
    }

    public void setCollapsedTitleTextSize(float f10) {
        this.f86231k.k0(f10);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f86231k.l0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f86235o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f86235o = drawableMutate;
            if (drawableMutate != null) {
                s(drawableMutate, getWidth(), getHeight());
                this.f86235o.setCallback(this);
                this.f86235o.setAlpha(this.f86237q);
            }
            ViewCompat.d0(this);
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        this.f86231k.u0(i10);
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f86229i = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f86228h = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f86226f = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f86227g = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        this.f86231k.r0(i10);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f86231k.t0(colorStateList);
    }

    public void setExpandedTitleTextSize(float f10) {
        this.f86231k.v0(f10);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f86231k.w0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.f86220E = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.f86218C = z10;
    }

    public void setHyphenationFrequency(int i10) {
        this.f86231k.B0(i10);
    }

    public void setLineSpacingAdd(float f10) {
        this.f86231k.D0(f10);
    }

    public void setLineSpacingMultiplier(float f10) {
        this.f86231k.E0(f10);
    }

    public void setMaxLines(int i10) {
        this.f86231k.F0(i10);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f86231k.H0(z10);
    }

    void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f86237q) {
            if (this.f86235o != null && (viewGroup = this.f86223c) != null) {
                ViewCompat.d0(viewGroup);
            }
            this.f86237q = i10;
            ViewCompat.d0(this);
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.f86240t = j10;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.f86243w != i10) {
            this.f86243w = i10;
            v();
        }
    }

    public void setStaticLayoutBuilderConfigurer(e eVar) {
        this.f86231k.J0(eVar);
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f86236p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f86236p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f86236p.setState(getDrawableState());
                }
                C13462a.m(this.f86236p, ViewCompat.z(this));
                this.f86236p.setVisible(getVisibility() == 0, false);
                this.f86236p.setCallback(this);
                this.f86236p.setAlpha(this.f86237q);
            }
            ViewCompat.d0(this);
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setTitle(CharSequence charSequence) {
        this.f86231k.K0(charSequence);
        r();
    }

    public void setTitleCollapseMode(int i10) {
        this.f86246z = i10;
        boolean zL = l();
        this.f86231k.z0(zL);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            c((AppBarLayout) parent);
        }
        if (zL && this.f86235o == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f86231k.M0(truncateAt);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f86233m) {
            this.f86233m = z10;
            r();
            u();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f86231k.G0(timeInterpolator);
    }

    final void v() {
        if (this.f86235o == null && this.f86236p == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f86245y < getScrimVisibleHeightTrigger());
    }

    private void a(int i10) {
        TimeInterpolator timeInterpolator;
        d();
        ValueAnimator valueAnimator = this.f86239s;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f86239s = valueAnimator2;
            if (i10 > this.f86237q) {
                timeInterpolator = this.f86241u;
            } else {
                timeInterpolator = this.f86242v;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.f86239s.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.f86239s.cancel();
        }
        this.f86239s.setDuration(this.f86240t);
        this.f86239s.setIntValues(this.f86237q, i10);
        this.f86239s.start();
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
        ColorStateList colorStateListG = C14718a.g(getContext(), C5597b.f44543t);
        if (colorStateListG != null) {
            return colorStateListG.getDefaultColor();
        }
        return this.f86232l.d(getResources().getDimension(ae.d.f44591a));
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
        if (l() && view != null && this.f86233m) {
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
        if (this.f86223c == null && (drawable = this.f86235o) != null && this.f86237q > 0) {
            drawable.mutate().setAlpha(this.f86237q);
            this.f86235o.draw(canvas);
        }
        if (this.f86233m && this.f86234n) {
            if (this.f86223c != null && this.f86235o != null && this.f86237q > 0 && l() && this.f86231k.F() < this.f86231k.G()) {
                int iSave = canvas.save();
                canvas.clipRect(this.f86235o.getBounds(), Region.Op.DIFFERENCE);
                this.f86231k.l(canvas);
                canvas.restoreToCount(iSave);
            } else {
                this.f86231k.l(canvas);
            }
        }
        if (this.f86236p != null && this.f86237q > 0) {
            j jVar = this.f86216A;
            if (jVar != null) {
                iM = jVar.m();
            } else {
                iM = 0;
            }
            if (iM > 0) {
                this.f86236p.setBounds(0, -this.f86245y, getWidth(), iM - this.f86245y);
                this.f86236p.mutate().setAlpha(this.f86237q);
                this.f86236p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean zI0;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f86236p;
        if (drawable != null && drawable.isStateful()) {
            zI0 = drawable.setState(drawableState);
        } else {
            zI0 = false;
        }
        Drawable drawable2 = this.f86235o;
        if (drawable2 != null && drawable2.isStateful()) {
            zI0 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.b bVar = this.f86231k;
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
        if (!o2.c.a(this.f86216A, jVar2)) {
            this.f86216A = jVar2;
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
            if (this.f86244x == null) {
                this.f86244x = new d();
            }
            appBarLayout.d(this.f86244x);
            ViewCompat.j0(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f86231k.Y(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.g gVar = this.f86244x;
        if (gVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).v(gVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j jVar = this.f86216A;
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
        j jVar = this.f86216A;
        if (jVar != null) {
            iM = jVar.m();
        } else {
            iM = 0;
        }
        if ((mode == 0 || this.f86218C) && iM > 0) {
            this.f86217B = iM;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iM, 1073741824));
        }
        if (this.f86220E && this.f86231k.L() > 1) {
            x();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.w(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int iZ = collapsingToolbarLayout.f86231k.z();
            if (iZ > 1) {
                collapsingToolbarLayout.f86219D = Math.round(collapsingToolbarLayout.f86231k.A()) * (iZ - 1);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + collapsingToolbarLayout.f86219D, 1073741824));
            }
        } else {
            collapsingToolbarLayout = this;
        }
        ViewGroup viewGroup = collapsingToolbarLayout.f86223c;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.f86224d;
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
        Drawable drawable = this.f86235o;
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
        Drawable drawable = this.f86236p;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f86236p.setVisible(z10, false);
        }
        Drawable drawable2 = this.f86235o;
        if (drawable2 != null && drawable2.isVisible() != z10) {
            this.f86235o.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f86235o && drawable != this.f86236p) {
            return false;
        }
        return true;
    }
}
