package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.D;
import androidx.media3.ui.DefaultTimeBar;
import com.fullstory.FS;
import d3.C13599a;
import d3.P;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public class DefaultTimeBar extends View implements D {

    /* renamed from: A, reason: collision with root package name */
    private int f57556A;

    /* renamed from: B, reason: collision with root package name */
    private long f57557B;

    /* renamed from: C, reason: collision with root package name */
    private int f57558C;

    /* renamed from: D, reason: collision with root package name */
    private Rect f57559D;

    /* renamed from: E, reason: collision with root package name */
    private ValueAnimator f57560E;

    /* renamed from: F, reason: collision with root package name */
    private float f57561F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f57562G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f57563H;

    /* renamed from: I, reason: collision with root package name */
    private long f57564I;

    /* renamed from: J, reason: collision with root package name */
    private long f57565J;

    /* renamed from: K, reason: collision with root package name */
    private long f57566K;

    /* renamed from: L, reason: collision with root package name */
    private long f57567L;

    /* renamed from: M, reason: collision with root package name */
    private int f57568M;

    /* renamed from: N, reason: collision with root package name */
    private long[] f57569N;

    /* renamed from: O, reason: collision with root package name */
    private boolean[] f57570O;

    /* renamed from: a, reason: collision with root package name */
    private final Rect f57571a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f57572b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f57573c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f57574d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f57575e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f57576f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f57577g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f57578h;

    /* renamed from: i, reason: collision with root package name */
    private final Paint f57579i;

    /* renamed from: j, reason: collision with root package name */
    private final Paint f57580j;

    /* renamed from: k, reason: collision with root package name */
    private final Drawable f57581k;

    /* renamed from: l, reason: collision with root package name */
    private final int f57582l;

    /* renamed from: m, reason: collision with root package name */
    private final int f57583m;

    /* renamed from: n, reason: collision with root package name */
    private final int f57584n;

    /* renamed from: o, reason: collision with root package name */
    private final int f57585o;

    /* renamed from: p, reason: collision with root package name */
    private final int f57586p;

    /* renamed from: q, reason: collision with root package name */
    private final int f57587q;

    /* renamed from: r, reason: collision with root package name */
    private final int f57588r;

    /* renamed from: s, reason: collision with root package name */
    private final int f57589s;

    /* renamed from: t, reason: collision with root package name */
    private final int f57590t;

    /* renamed from: u, reason: collision with root package name */
    private final StringBuilder f57591u;

    /* renamed from: v, reason: collision with root package name */
    private final Formatter f57592v;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f57593w;

    /* renamed from: x, reason: collision with root package name */
    private final CopyOnWriteArraySet<D.a> f57594x;

    /* renamed from: y, reason: collision with root package name */
    private final Point f57595y;

    /* renamed from: z, reason: collision with root package name */
    private final float f57596z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f57571a = new Rect();
        this.f57572b = new Rect();
        this.f57573c = new Rect();
        this.f57574d = new Rect();
        Paint paint = new Paint();
        this.f57575e = paint;
        Paint paint2 = new Paint();
        this.f57576f = paint2;
        Paint paint3 = new Paint();
        this.f57577g = paint3;
        Paint paint4 = new Paint();
        this.f57578h = paint4;
        Paint paint5 = new Paint();
        this.f57579i = paint5;
        Paint paint6 = new Paint();
        this.f57580j = paint6;
        paint6.setAntiAlias(true);
        this.f57594x = new CopyOnWriteArraySet<>();
        this.f57595y = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f57596z = f10;
        this.f57590t = e(f10, -50);
        int iE = e(f10, 4);
        int iE2 = e(f10, 26);
        int iE3 = e(f10, 4);
        int iE4 = e(f10, 12);
        int iE5 = e(f10, 0);
        int iE6 = e(f10, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, h4.D.f134785e, i10, i11);
            try {
                Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, h4.D.f134807p);
                this.f57581k = drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160;
                if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 != null) {
                    o(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160);
                    iE2 = Math.max(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160.getMinimumHeight(), iE2);
                }
                this.f57582l = typedArrayObtainStyledAttributes.getDimensionPixelSize(h4.D.f134793i, iE);
                this.f57583m = typedArrayObtainStyledAttributes.getDimensionPixelSize(h4.D.f134811r, iE2);
                this.f57584n = typedArrayObtainStyledAttributes.getInt(h4.D.f134791h, 0);
                this.f57585o = typedArrayObtainStyledAttributes.getDimensionPixelSize(h4.D.f134789g, iE3);
                this.f57586p = typedArrayObtainStyledAttributes.getDimensionPixelSize(h4.D.f134809q, iE4);
                this.f57587q = typedArrayObtainStyledAttributes.getDimensionPixelSize(h4.D.f134803n, iE5);
                this.f57588r = typedArrayObtainStyledAttributes.getDimensionPixelSize(h4.D.f134805o, iE6);
                int i12 = typedArrayObtainStyledAttributes.getInt(h4.D.f134799l, -1);
                int i13 = typedArrayObtainStyledAttributes.getInt(h4.D.f134801m, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(h4.D.f134795j, -855638017);
                int i15 = typedArrayObtainStyledAttributes.getInt(h4.D.f134813s, 872415231);
                int i16 = typedArrayObtainStyledAttributes.getInt(h4.D.f134787f, -1291845888);
                int i17 = typedArrayObtainStyledAttributes.getInt(h4.D.f134797k, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f57582l = iE;
            this.f57583m = iE2;
            this.f57584n = 0;
            this.f57585o = iE3;
            this.f57586p = iE4;
            this.f57587q = iE5;
            this.f57588r = iE6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f57581k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f57591u = sb2;
        this.f57592v = new Formatter(sb2, Locale.getDefault());
        this.f57593w = new Runnable() { // from class: h4.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f134828a.u(false);
            }
        };
        Drawable drawable = this.f57581k;
        if (drawable != null) {
            this.f57589s = (drawable.getMinimumWidth() + 1) / 2;
        } else {
            this.f57589s = (Math.max(this.f57587q, Math.max(this.f57586p, this.f57588r)) + 1) / 2;
        }
        this.f57561F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f57560E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: h4.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.c(this.f134829a, valueAnimator2);
            }
        });
        this.f57565J = -9223372036854775807L;
        this.f57557B = -9223372036854775807L;
        this.f57556A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    private static int e(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private static int l(float f10, int i10) {
        return (int) (i10 / f10);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int iMax;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.f57562G ? 0 : this.f57589s;
        if (this.f57584n == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - this.f57583m;
            int paddingBottom2 = i15 - getPaddingBottom();
            int i17 = this.f57582l;
            iMax = (paddingBottom2 - i17) - Math.max(i16 - (i17 / 2), 0);
        } else {
            paddingBottom = (i15 - this.f57583m) / 2;
            iMax = (i15 - this.f57582l) / 2;
        }
        this.f57571a.set(paddingLeft, paddingBottom, paddingRight, this.f57583m + paddingBottom);
        Rect rect = this.f57572b;
        Rect rect2 = this.f57571a;
        rect.set(rect2.left + i16, iMax, rect2.right - i16, this.f57582l + iMax);
        if (P.f127888a >= 29) {
            q(i14, i15);
        }
        v();
    }

    private void f(Canvas canvas) {
        if (this.f57565J <= 0) {
            return;
        }
        Rect rect = this.f57574d;
        int iO = P.o(rect.right, rect.left, this.f57572b.right);
        int iCenterY = this.f57574d.centerY();
        if (this.f57581k == null) {
            canvas.drawCircle(iO, iCenterY, (int) ((((this.f57563H || isFocused()) ? this.f57588r : isEnabled() ? this.f57586p : this.f57587q) * this.f57561F) / 2.0f), this.f57580j);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.f57561F)) / 2;
        int intrinsicHeight = ((int) (this.f57581k.getIntrinsicHeight() * this.f57561F)) / 2;
        this.f57581k.setBounds(iO - intrinsicWidth, iCenterY - intrinsicHeight, iO + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f57581k.draw(canvas);
    }

    private void g(Canvas canvas) {
        int iHeight = this.f57572b.height();
        int iCenterY = this.f57572b.centerY() - (iHeight / 2);
        int i10 = iHeight + iCenterY;
        if (this.f57565J <= 0) {
            Rect rect = this.f57572b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i10, this.f57577g);
            return;
        }
        Rect rect2 = this.f57573c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int iMax = Math.max(Math.max(this.f57572b.left, i12), this.f57574d.right);
        int i13 = this.f57572b.right;
        if (iMax < i13) {
            canvas.drawRect(iMax, iCenterY, i13, i10, this.f57577g);
        }
        int iMax2 = Math.max(i11, this.f57574d.right);
        if (i12 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i12, i10, this.f57576f);
        }
        if (this.f57574d.width() > 0) {
            Rect rect3 = this.f57574d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i10, this.f57575e);
        }
        if (this.f57568M == 0) {
            return;
        }
        long[] jArr = (long[]) C13599a.e(this.f57569N);
        boolean[] zArr = (boolean[]) C13599a.e(this.f57570O);
        int i14 = this.f57585o / 2;
        for (int i15 = 0; i15 < this.f57568M; i15++) {
            int iWidth = ((int) ((this.f57572b.width() * P.p(jArr[i15], 0L, this.f57565J)) / this.f57565J)) - i14;
            Rect rect4 = this.f57572b;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f57585o, Math.max(0, iWidth)), iCenterY, r10 + this.f57585o, i10, zArr[i15] ? this.f57579i : this.f57578h);
        }
    }

    private long getPositionIncrement() {
        long j10 = this.f57557B;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.f57565J;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        return j11 / this.f57556A;
    }

    private String getProgressText() {
        return P.k0(this.f57591u, this.f57592v, this.f57566K);
    }

    private long getScrubberPosition() {
        if (this.f57572b.width() <= 0 || this.f57565J == -9223372036854775807L) {
            return 0L;
        }
        return (this.f57574d.width() * this.f57565J) / this.f57572b.width();
    }

    private boolean j(float f10, float f11) {
        return this.f57571a.contains((int) f10, (int) f11);
    }

    private void k(float f10) {
        Rect rect = this.f57574d;
        Rect rect2 = this.f57572b;
        rect.right = P.o((int) f10, rect2.left, rect2.right);
    }

    private Point m(MotionEvent motionEvent) {
        this.f57595y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f57595y;
    }

    private boolean n(long j10) {
        long j11 = this.f57565J;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.f57563H ? this.f57564I : this.f57566K;
        long jP = P.p(j12 + j10, 0L, j11);
        if (jP == j12) {
            return false;
        }
        if (this.f57563H) {
            x(jP);
        } else {
            t(jP);
        }
        v();
        return true;
    }

    private boolean o(Drawable drawable) {
        return P.f127888a >= 23 && p(drawable, getLayoutDirection());
    }

    private static boolean p(Drawable drawable, int i10) {
        return P.f127888a >= 23 && drawable.setLayoutDirection(i10);
    }

    private void q(int i10, int i11) {
        Rect rect = this.f57559D;
        if (rect != null && rect.width() == i10 && this.f57559D.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.f57559D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void t(long j10) {
        this.f57564I = j10;
        this.f57563H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<D.a> it = this.f57594x.iterator();
        while (it.hasNext()) {
            it.next().B(this, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(boolean z10) {
        removeCallbacks(this.f57593w);
        this.f57563H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<D.a> it = this.f57594x.iterator();
        while (it.hasNext()) {
            it.next().G(this, this.f57564I, z10);
        }
    }

    private void v() {
        this.f57573c.set(this.f57572b);
        this.f57574d.set(this.f57572b);
        long j10 = this.f57563H ? this.f57564I : this.f57566K;
        if (this.f57565J > 0) {
            int iWidth = (int) ((this.f57572b.width() * this.f57567L) / this.f57565J);
            Rect rect = this.f57573c;
            Rect rect2 = this.f57572b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((this.f57572b.width() * j10) / this.f57565J);
            Rect rect3 = this.f57574d;
            Rect rect4 = this.f57572b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f57573c;
            int i10 = this.f57572b.left;
            rect5.right = i10;
            this.f57574d.right = i10;
        }
        invalidate(this.f57571a);
    }

    private void w() {
        Drawable drawable = this.f57581k;
        if (drawable != null && drawable.isStateful() && this.f57581k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void x(long j10) {
        if (this.f57564I == j10) {
            return;
        }
        this.f57564I = j10;
        Iterator<D.a> it = this.f57594x.iterator();
        while (it.hasNext()) {
            it.next().E(this, j10);
        }
    }

    @Override // androidx.media3.ui.D
    public void b(long[] jArr, boolean[] zArr, int i10) {
        C13599a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.f57568M = i10;
        this.f57569N = jArr;
        this.f57570O = zArr;
        v();
    }

    @Override // androidx.media3.ui.D
    public long getPreferredUpdateDelay() {
        int iL = l(this.f57596z, this.f57572b.width());
        if (iL == 0) {
            return Long.MAX_VALUE;
        }
        long j10 = this.f57565J;
        if (j10 == 0 || j10 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j10 / iL;
    }

    public void h(long j10) {
        if (this.f57560E.isStarted()) {
            this.f57560E.cancel();
        }
        this.f57560E.setFloatValues(this.f57561F, 0.0f);
        this.f57560E.setDuration(j10);
        this.f57560E.start();
    }

    public void i(boolean z10) {
        if (this.f57560E.isStarted()) {
            this.f57560E.cancel();
        }
        this.f57562G = z10;
        this.f57561F = 0.0f;
        invalidate(this.f57571a);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f57581k;
        if (drawable == null || !p(drawable, i10)) {
            return;
        }
        invalidate();
    }

    public void r() {
        if (this.f57560E.isStarted()) {
            this.f57560E.cancel();
        }
        this.f57562G = false;
        this.f57561F = 1.0f;
        invalidate(this.f57571a);
    }

    public void s(long j10) {
        if (this.f57560E.isStarted()) {
            this.f57560E.cancel();
        }
        this.f57562G = false;
        this.f57560E.setFloatValues(this.f57561F, 1.0f);
        this.f57560E.setDuration(j10);
        this.f57560E.start();
    }

    public void setAdMarkerColor(int i10) {
        this.f57578h.setColor(i10);
        invalidate(this.f57571a);
    }

    public void setBufferedColor(int i10) {
        this.f57576f.setColor(i10);
        invalidate(this.f57571a);
    }

    @Override // androidx.media3.ui.D
    public void setBufferedPosition(long j10) {
        if (this.f57567L == j10) {
            return;
        }
        this.f57567L = j10;
        v();
    }

    @Override // androidx.media3.ui.D
    public void setDuration(long j10) {
        if (this.f57565J == j10) {
            return;
        }
        this.f57565J = j10;
        if (this.f57563H && j10 == -9223372036854775807L) {
            u(true);
        }
        v();
    }

    public void setKeyCountIncrement(int i10) {
        C13599a.a(i10 > 0);
        this.f57556A = i10;
        this.f57557B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        C13599a.a(j10 > 0);
        this.f57556A = -1;
        this.f57557B = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f57579i.setColor(i10);
        invalidate(this.f57571a);
    }

    public void setPlayedColor(int i10) {
        this.f57575e.setColor(i10);
        invalidate(this.f57571a);
    }

    @Override // androidx.media3.ui.D
    public void setPosition(long j10) {
        if (this.f57566K == j10) {
            return;
        }
        this.f57566K = j10;
        setContentDescription(getProgressText());
        v();
    }

    public void setScrubberColor(int i10) {
        this.f57580j.setColor(i10);
        invalidate(this.f57571a);
    }

    public void setUnplayedColor(int i10) {
        this.f57577g.setColor(i10);
        invalidate(this.f57571a);
    }

    public static /* synthetic */ void c(DefaultTimeBar defaultTimeBar, ValueAnimator valueAnimator) {
        defaultTimeBar.getClass();
        defaultTimeBar.f57561F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        defaultTimeBar.invalidate(defaultTimeBar.f57571a);
    }

    @Override // androidx.media3.ui.D
    public void a(D.a aVar) {
        C13599a.e(aVar);
        this.f57594x.add(aVar);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        w();
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f57581k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f57563H && !z10) {
            u(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f57565J <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.n(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f57593w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f57593w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.f57563H
            if (r0 == 0) goto L30
            r5 = 0
            r4.u(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f57583m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f57583m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        w();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.f57565J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.m(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.f57563H
            if (r8 == 0) goto L76
            int r8 = r7.f57590t
            if (r0 >= r8) goto L3a
            int r8 = r7.f57558C
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.k(r8)
            goto L40
        L3a:
            r7.f57558C = r2
            float r8 = (float) r2
            r7.k(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.x(r0)
            r7.v()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.f57563H
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.u(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.j(r8, r0)
            if (r0 == 0) goto L76
            r7.k(r8)
            long r0 = r7.getScrubberPosition()
            r7.t(r0)
            r7.v()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f57565J <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (n(-getPositionIncrement())) {
                u(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (n(getPositionIncrement())) {
                u(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // android.view.View, androidx.media3.ui.D
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.f57563H && !z10) {
            u(true);
        }
    }
}
