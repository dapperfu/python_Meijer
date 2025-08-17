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
import d3.C13466a;
import d3.P;
import h4.C14349D;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public class DefaultTimeBar extends View implements D {

    /* renamed from: A, reason: collision with root package name */
    private int f57332A;

    /* renamed from: B, reason: collision with root package name */
    private long f57333B;

    /* renamed from: C, reason: collision with root package name */
    private int f57334C;

    /* renamed from: D, reason: collision with root package name */
    private Rect f57335D;

    /* renamed from: E, reason: collision with root package name */
    private ValueAnimator f57336E;

    /* renamed from: F, reason: collision with root package name */
    private float f57337F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f57338G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f57339H;

    /* renamed from: I, reason: collision with root package name */
    private long f57340I;

    /* renamed from: J, reason: collision with root package name */
    private long f57341J;

    /* renamed from: K, reason: collision with root package name */
    private long f57342K;

    /* renamed from: L, reason: collision with root package name */
    private long f57343L;

    /* renamed from: M, reason: collision with root package name */
    private int f57344M;

    /* renamed from: N, reason: collision with root package name */
    private long[] f57345N;

    /* renamed from: O, reason: collision with root package name */
    private boolean[] f57346O;

    /* renamed from: a, reason: collision with root package name */
    private final Rect f57347a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f57348b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f57349c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f57350d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f57351e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f57352f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f57353g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f57354h;

    /* renamed from: i, reason: collision with root package name */
    private final Paint f57355i;

    /* renamed from: j, reason: collision with root package name */
    private final Paint f57356j;

    /* renamed from: k, reason: collision with root package name */
    private final Drawable f57357k;

    /* renamed from: l, reason: collision with root package name */
    private final int f57358l;

    /* renamed from: m, reason: collision with root package name */
    private final int f57359m;

    /* renamed from: n, reason: collision with root package name */
    private final int f57360n;

    /* renamed from: o, reason: collision with root package name */
    private final int f57361o;

    /* renamed from: p, reason: collision with root package name */
    private final int f57362p;

    /* renamed from: q, reason: collision with root package name */
    private final int f57363q;

    /* renamed from: r, reason: collision with root package name */
    private final int f57364r;

    /* renamed from: s, reason: collision with root package name */
    private final int f57365s;

    /* renamed from: t, reason: collision with root package name */
    private final int f57366t;

    /* renamed from: u, reason: collision with root package name */
    private final StringBuilder f57367u;

    /* renamed from: v, reason: collision with root package name */
    private final Formatter f57368v;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f57369w;

    /* renamed from: x, reason: collision with root package name */
    private final CopyOnWriteArraySet<D.a> f57370x;

    /* renamed from: y, reason: collision with root package name */
    private final Point f57371y;

    /* renamed from: z, reason: collision with root package name */
    private final float f57372z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f57347a = new Rect();
        this.f57348b = new Rect();
        this.f57349c = new Rect();
        this.f57350d = new Rect();
        Paint paint = new Paint();
        this.f57351e = paint;
        Paint paint2 = new Paint();
        this.f57352f = paint2;
        Paint paint3 = new Paint();
        this.f57353g = paint3;
        Paint paint4 = new Paint();
        this.f57354h = paint4;
        Paint paint5 = new Paint();
        this.f57355i = paint5;
        Paint paint6 = new Paint();
        this.f57356j = paint6;
        paint6.setAntiAlias(true);
        this.f57370x = new CopyOnWriteArraySet<>();
        this.f57371y = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f57372z = f10;
        this.f57366t = e(f10, -50);
        int iE = e(f10, 4);
        int iE2 = e(f10, 26);
        int iE3 = e(f10, 4);
        int iE4 = e(f10, 12);
        int iE5 = e(f10, 0);
        int iE6 = e(f10, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C14349D.f134314e, i10, i11);
            try {
                Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, C14349D.f134336p);
                this.f57357k = drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160;
                if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 != null) {
                    o(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160);
                    iE2 = Math.max(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160.getMinimumHeight(), iE2);
                }
                this.f57358l = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14349D.f134322i, iE);
                this.f57359m = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14349D.f134340r, iE2);
                this.f57360n = typedArrayObtainStyledAttributes.getInt(C14349D.f134320h, 0);
                this.f57361o = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14349D.f134318g, iE3);
                this.f57362p = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14349D.f134338q, iE4);
                this.f57363q = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14349D.f134332n, iE5);
                this.f57364r = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14349D.f134334o, iE6);
                int i12 = typedArrayObtainStyledAttributes.getInt(C14349D.f134328l, -1);
                int i13 = typedArrayObtainStyledAttributes.getInt(C14349D.f134330m, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(C14349D.f134324j, -855638017);
                int i15 = typedArrayObtainStyledAttributes.getInt(C14349D.f134342s, 872415231);
                int i16 = typedArrayObtainStyledAttributes.getInt(C14349D.f134316f, -1291845888);
                int i17 = typedArrayObtainStyledAttributes.getInt(C14349D.f134326k, 872414976);
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
            this.f57358l = iE;
            this.f57359m = iE2;
            this.f57360n = 0;
            this.f57361o = iE3;
            this.f57362p = iE4;
            this.f57363q = iE5;
            this.f57364r = iE6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f57357k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f57367u = sb2;
        this.f57368v = new Formatter(sb2, Locale.getDefault());
        this.f57369w = new Runnable() { // from class: h4.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f134357a.u(false);
            }
        };
        Drawable drawable = this.f57357k;
        if (drawable != null) {
            this.f57365s = (drawable.getMinimumWidth() + 1) / 2;
        } else {
            this.f57365s = (Math.max(this.f57363q, Math.max(this.f57362p, this.f57364r)) + 1) / 2;
        }
        this.f57337F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f57336E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: h4.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.c(this.f134358a, valueAnimator2);
            }
        });
        this.f57341J = -9223372036854775807L;
        this.f57333B = -9223372036854775807L;
        this.f57332A = 20;
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
        int i16 = this.f57338G ? 0 : this.f57365s;
        if (this.f57360n == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - this.f57359m;
            int paddingBottom2 = i15 - getPaddingBottom();
            int i17 = this.f57358l;
            iMax = (paddingBottom2 - i17) - Math.max(i16 - (i17 / 2), 0);
        } else {
            paddingBottom = (i15 - this.f57359m) / 2;
            iMax = (i15 - this.f57358l) / 2;
        }
        this.f57347a.set(paddingLeft, paddingBottom, paddingRight, this.f57359m + paddingBottom);
        Rect rect = this.f57348b;
        Rect rect2 = this.f57347a;
        rect.set(rect2.left + i16, iMax, rect2.right - i16, this.f57358l + iMax);
        if (P.f127086a >= 29) {
            q(i14, i15);
        }
        v();
    }

    private void f(Canvas canvas) {
        if (this.f57341J <= 0) {
            return;
        }
        Rect rect = this.f57350d;
        int iO = P.o(rect.right, rect.left, this.f57348b.right);
        int iCenterY = this.f57350d.centerY();
        if (this.f57357k == null) {
            canvas.drawCircle(iO, iCenterY, (int) ((((this.f57339H || isFocused()) ? this.f57364r : isEnabled() ? this.f57362p : this.f57363q) * this.f57337F) / 2.0f), this.f57356j);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.f57337F)) / 2;
        int intrinsicHeight = ((int) (this.f57357k.getIntrinsicHeight() * this.f57337F)) / 2;
        this.f57357k.setBounds(iO - intrinsicWidth, iCenterY - intrinsicHeight, iO + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f57357k.draw(canvas);
    }

    private void g(Canvas canvas) {
        int iHeight = this.f57348b.height();
        int iCenterY = this.f57348b.centerY() - (iHeight / 2);
        int i10 = iHeight + iCenterY;
        if (this.f57341J <= 0) {
            Rect rect = this.f57348b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i10, this.f57353g);
            return;
        }
        Rect rect2 = this.f57349c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int iMax = Math.max(Math.max(this.f57348b.left, i12), this.f57350d.right);
        int i13 = this.f57348b.right;
        if (iMax < i13) {
            canvas.drawRect(iMax, iCenterY, i13, i10, this.f57353g);
        }
        int iMax2 = Math.max(i11, this.f57350d.right);
        if (i12 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i12, i10, this.f57352f);
        }
        if (this.f57350d.width() > 0) {
            Rect rect3 = this.f57350d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i10, this.f57351e);
        }
        if (this.f57344M == 0) {
            return;
        }
        long[] jArr = (long[]) C13466a.e(this.f57345N);
        boolean[] zArr = (boolean[]) C13466a.e(this.f57346O);
        int i14 = this.f57361o / 2;
        for (int i15 = 0; i15 < this.f57344M; i15++) {
            int iWidth = ((int) ((this.f57348b.width() * P.p(jArr[i15], 0L, this.f57341J)) / this.f57341J)) - i14;
            Rect rect4 = this.f57348b;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f57361o, Math.max(0, iWidth)), iCenterY, r10 + this.f57361o, i10, zArr[i15] ? this.f57355i : this.f57354h);
        }
    }

    private long getPositionIncrement() {
        long j10 = this.f57333B;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.f57341J;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        return j11 / this.f57332A;
    }

    private String getProgressText() {
        return P.k0(this.f57367u, this.f57368v, this.f57342K);
    }

    private long getScrubberPosition() {
        if (this.f57348b.width() <= 0 || this.f57341J == -9223372036854775807L) {
            return 0L;
        }
        return (this.f57350d.width() * this.f57341J) / this.f57348b.width();
    }

    private boolean j(float f10, float f11) {
        return this.f57347a.contains((int) f10, (int) f11);
    }

    private void k(float f10) {
        Rect rect = this.f57350d;
        Rect rect2 = this.f57348b;
        rect.right = P.o((int) f10, rect2.left, rect2.right);
    }

    private Point m(MotionEvent motionEvent) {
        this.f57371y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f57371y;
    }

    private boolean n(long j10) {
        long j11 = this.f57341J;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.f57339H ? this.f57340I : this.f57342K;
        long jP = P.p(j12 + j10, 0L, j11);
        if (jP == j12) {
            return false;
        }
        if (this.f57339H) {
            x(jP);
        } else {
            t(jP);
        }
        v();
        return true;
    }

    private boolean o(Drawable drawable) {
        return P.f127086a >= 23 && p(drawable, getLayoutDirection());
    }

    private static boolean p(Drawable drawable, int i10) {
        return P.f127086a >= 23 && drawable.setLayoutDirection(i10);
    }

    private void q(int i10, int i11) {
        Rect rect = this.f57335D;
        if (rect != null && rect.width() == i10 && this.f57335D.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.f57335D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void t(long j10) {
        this.f57340I = j10;
        this.f57339H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<D.a> it = this.f57370x.iterator();
        while (it.hasNext()) {
            it.next().B(this, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(boolean z10) {
        removeCallbacks(this.f57369w);
        this.f57339H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<D.a> it = this.f57370x.iterator();
        while (it.hasNext()) {
            it.next().G(this, this.f57340I, z10);
        }
    }

    private void v() {
        this.f57349c.set(this.f57348b);
        this.f57350d.set(this.f57348b);
        long j10 = this.f57339H ? this.f57340I : this.f57342K;
        if (this.f57341J > 0) {
            int iWidth = (int) ((this.f57348b.width() * this.f57343L) / this.f57341J);
            Rect rect = this.f57349c;
            Rect rect2 = this.f57348b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((this.f57348b.width() * j10) / this.f57341J);
            Rect rect3 = this.f57350d;
            Rect rect4 = this.f57348b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f57349c;
            int i10 = this.f57348b.left;
            rect5.right = i10;
            this.f57350d.right = i10;
        }
        invalidate(this.f57347a);
    }

    private void w() {
        Drawable drawable = this.f57357k;
        if (drawable != null && drawable.isStateful() && this.f57357k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void x(long j10) {
        if (this.f57340I == j10) {
            return;
        }
        this.f57340I = j10;
        Iterator<D.a> it = this.f57370x.iterator();
        while (it.hasNext()) {
            it.next().E(this, j10);
        }
    }

    @Override // androidx.media3.ui.D
    public void b(long[] jArr, boolean[] zArr, int i10) {
        C13466a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.f57344M = i10;
        this.f57345N = jArr;
        this.f57346O = zArr;
        v();
    }

    @Override // androidx.media3.ui.D
    public long getPreferredUpdateDelay() {
        int iL = l(this.f57372z, this.f57348b.width());
        if (iL == 0) {
            return Long.MAX_VALUE;
        }
        long j10 = this.f57341J;
        if (j10 == 0 || j10 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j10 / iL;
    }

    public void h(long j10) {
        if (this.f57336E.isStarted()) {
            this.f57336E.cancel();
        }
        this.f57336E.setFloatValues(this.f57337F, 0.0f);
        this.f57336E.setDuration(j10);
        this.f57336E.start();
    }

    public void i(boolean z10) {
        if (this.f57336E.isStarted()) {
            this.f57336E.cancel();
        }
        this.f57338G = z10;
        this.f57337F = 0.0f;
        invalidate(this.f57347a);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f57357k;
        if (drawable == null || !p(drawable, i10)) {
            return;
        }
        invalidate();
    }

    public void r() {
        if (this.f57336E.isStarted()) {
            this.f57336E.cancel();
        }
        this.f57338G = false;
        this.f57337F = 1.0f;
        invalidate(this.f57347a);
    }

    public void s(long j10) {
        if (this.f57336E.isStarted()) {
            this.f57336E.cancel();
        }
        this.f57338G = false;
        this.f57336E.setFloatValues(this.f57337F, 1.0f);
        this.f57336E.setDuration(j10);
        this.f57336E.start();
    }

    public void setAdMarkerColor(int i10) {
        this.f57354h.setColor(i10);
        invalidate(this.f57347a);
    }

    public void setBufferedColor(int i10) {
        this.f57352f.setColor(i10);
        invalidate(this.f57347a);
    }

    @Override // androidx.media3.ui.D
    public void setBufferedPosition(long j10) {
        if (this.f57343L == j10) {
            return;
        }
        this.f57343L = j10;
        v();
    }

    @Override // androidx.media3.ui.D
    public void setDuration(long j10) {
        if (this.f57341J == j10) {
            return;
        }
        this.f57341J = j10;
        if (this.f57339H && j10 == -9223372036854775807L) {
            u(true);
        }
        v();
    }

    public void setKeyCountIncrement(int i10) {
        C13466a.a(i10 > 0);
        this.f57332A = i10;
        this.f57333B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        C13466a.a(j10 > 0);
        this.f57332A = -1;
        this.f57333B = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f57355i.setColor(i10);
        invalidate(this.f57347a);
    }

    public void setPlayedColor(int i10) {
        this.f57351e.setColor(i10);
        invalidate(this.f57347a);
    }

    @Override // androidx.media3.ui.D
    public void setPosition(long j10) {
        if (this.f57342K == j10) {
            return;
        }
        this.f57342K = j10;
        setContentDescription(getProgressText());
        v();
    }

    public void setScrubberColor(int i10) {
        this.f57356j.setColor(i10);
        invalidate(this.f57347a);
    }

    public void setUnplayedColor(int i10) {
        this.f57353g.setColor(i10);
        invalidate(this.f57347a);
    }

    public static /* synthetic */ void c(DefaultTimeBar defaultTimeBar, ValueAnimator valueAnimator) {
        defaultTimeBar.getClass();
        defaultTimeBar.f57337F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        defaultTimeBar.invalidate(defaultTimeBar.f57347a);
    }

    @Override // androidx.media3.ui.D
    public void a(D.a aVar) {
        C13466a.e(aVar);
        this.f57370x.add(aVar);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        w();
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f57357k;
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
        if (this.f57339H && !z10) {
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
        if (this.f57341J <= 0) {
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
            java.lang.Runnable r5 = r4.f57369w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f57369w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.f57339H
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
            size = this.f57359m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f57359m, size);
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
            long r2 = r7.f57341J
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
            boolean r8 = r7.f57339H
            if (r8 == 0) goto L76
            int r8 = r7.f57366t
            if (r0 >= r8) goto L3a
            int r8 = r7.f57334C
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.k(r8)
            goto L40
        L3a:
            r7.f57334C = r2
            float r8 = (float) r2
            r7.k(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.x(r0)
            r7.v()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.f57339H
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
        if (this.f57341J <= 0) {
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
        if (this.f57339H && !z10) {
            u(true);
        }
    }
}
