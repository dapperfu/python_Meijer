package x2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import java.util.Arrays;

/* renamed from: x2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17994c {

    /* renamed from: y, reason: collision with root package name */
    private static final Interpolator f169013y = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f169014a;

    /* renamed from: b, reason: collision with root package name */
    private int f169015b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f169017d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f169018e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f169019f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f169020g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f169021h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f169022i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f169023j;

    /* renamed from: k, reason: collision with root package name */
    private int f169024k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f169025l;

    /* renamed from: m, reason: collision with root package name */
    private final float f169026m;

    /* renamed from: n, reason: collision with root package name */
    private float f169027n;

    /* renamed from: o, reason: collision with root package name */
    private int f169028o;

    /* renamed from: p, reason: collision with root package name */
    private final int f169029p;

    /* renamed from: q, reason: collision with root package name */
    private int f169030q;

    /* renamed from: r, reason: collision with root package name */
    private final OverScroller f169031r;

    /* renamed from: s, reason: collision with root package name */
    private final d f169032s;

    /* renamed from: t, reason: collision with root package name */
    private View f169033t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f169034u;

    /* renamed from: v, reason: collision with root package name */
    private final ViewGroup f169035v;

    /* renamed from: w, reason: collision with root package name */
    private Interpolator f169036w;

    /* renamed from: c, reason: collision with root package name */
    private int f169016c = -1;

    /* renamed from: x, reason: collision with root package name */
    private final Runnable f169037x = new b();

    /* renamed from: x2.c$a */
    class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }

        a() {
        }
    }

    /* renamed from: x2.c$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C17994c.this.M(0);
        }
    }

    /* renamed from: x2.c$c, reason: collision with other inner class name */
    class InterpolatorC2705c implements Interpolator {
        InterpolatorC2705c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return C17994c.this.f169036w.getInterpolation(f10);
        }
    }

    /* renamed from: x2.c$d */
    public static abstract class d {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [x2.c$d] */
    private void I(float f10, float f11, int i10) {
        boolean zD = d(f10, f11, i10, 1);
        boolean z10 = zD;
        if (d(f11, f10, i10, 4)) {
            z10 = (zD ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (d(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        ?? r02 = z11;
        if (d(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f169022i;
            iArr[i10] = iArr[i10] | r02;
            this.f169032s.f(r02, i10);
        }
    }

    private boolean g(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f169032s.d(view) > 0;
        boolean z11 = this.f169032s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f169015b) : z11 && Math.abs(f11) > ((float) this.f169015b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i10 = this.f169015b;
        return f12 > ((float) (i10 * i10));
    }

    private void q(float f10, float f11) {
        this.f169034u = true;
        this.f169032s.l(this.f169033t, f10, f11);
        this.f169034u = false;
        if (this.f169014a == 1) {
            M(0);
        }
    }

    public boolean F(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void b() {
        this.f169016c = -1;
        j();
        VelocityTracker velocityTracker = this.f169025l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f169025l = null;
        }
    }

    private void H() {
        this.f169025l.computeCurrentVelocity(1000, this.f169026m);
        q(h(this.f169025l.getXVelocity(this.f169016c), this.f169027n, this.f169026m), h(this.f169025l.getYVelocity(this.f169016c), this.f169027n, this.f169026m));
    }

    private static <T> T J(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    private void j() {
        float[] fArr = this.f169017d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f169018e, 0.0f);
        Arrays.fill(this.f169019f, 0.0f);
        Arrays.fill(this.f169020g, 0.0f);
        Arrays.fill(this.f169021h, 0);
        Arrays.fill(this.f169022i, 0);
        Arrays.fill(this.f169023j, 0);
        this.f169024k = 0;
    }

    private void k(int i10) {
        if (this.f169017d == null || !D(i10)) {
            return;
        }
        this.f169017d[i10] = 0.0f;
        this.f169018e[i10] = 0.0f;
        this.f169019f[i10] = 0.0f;
        this.f169020g[i10] = 0.0f;
        this.f169021h[i10] = 0;
        this.f169022i[i10] = 0;
        this.f169023j[i10] = 0;
        this.f169024k = (~(1 << i10)) & this.f169024k;
    }

    private int l(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f169035v.getWidth();
        float f10 = width / 2;
        float fR = f10 + (r(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fR / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    private int m(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i14 = i(i12, (int) this.f169027n, (int) this.f169026m);
        int i15 = i(i13, (int) this.f169027n, (int) this.f169026m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int i16 = iAbs3 + iAbs4;
        int i17 = iAbs + iAbs2;
        if (i14 != 0) {
            f10 = iAbs3;
            f11 = i16;
        } else {
            f10 = iAbs;
            f11 = i17;
        }
        float f14 = f10 / f11;
        if (i15 != 0) {
            f12 = iAbs4;
            f13 = i16;
        } else {
            f12 = iAbs2;
            f13 = i17;
        }
        return (int) ((l(i10, i14, this.f169032s.d(view)) * f14) + (l(i11, i15, this.f169032s.e(view)) * (f12 / f13)));
    }

    public static C17994c p(ViewGroup viewGroup, d dVar) {
        return new C17994c(viewGroup.getContext(), viewGroup, dVar);
    }

    private float r(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void s(int i10, int i11, int i12, int i13) {
        int left = this.f169033t.getLeft();
        int top = this.f169033t.getTop();
        if (i12 != 0) {
            i10 = this.f169032s.a(this.f169033t, i10, i12);
            ViewCompat.X(this.f169033t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f169032s.b(this.f169033t, i11, i13);
            ViewCompat.Y(this.f169033t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f169032s.k(this.f169033t, i14, i15, i14 - left, i15 - top);
    }

    private void t(int i10) {
        float[] fArr = this.f169017d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f169018e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f169019f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f169020g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f169021h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f169022i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f169023j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f169017d = fArr2;
            this.f169018e = fArr3;
            this.f169019f = fArr4;
            this.f169020g = fArr5;
            this.f169021h = iArr;
            this.f169022i = iArr2;
            this.f169023j = iArr3;
        }
    }

    private boolean v(int i10, int i11, int i12, int i13) {
        int left = this.f169033t.getLeft();
        int top = this.f169033t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f169031r.abortAnimation();
            M(0);
            return false;
        }
        int iM = m(this.f169033t, i14, i15, i12, i13);
        this.f169036w = f169013y;
        this.f169031r.startScroll(left, top, i14, i15, iM);
        M(2);
        return true;
    }

    private int z(int i10, int i11) {
        int i12 = i10 < this.f169035v.getLeft() + this.f169028o ? 1 : 0;
        if (i11 < this.f169035v.getTop() + this.f169028o) {
            i12 |= 4;
        }
        if (i10 > this.f169035v.getRight() - this.f169028o) {
            i12 |= 2;
        }
        return i11 > this.f169035v.getBottom() - this.f169028o ? i12 | 8 : i12;
    }

    public int A() {
        return this.f169015b;
    }

    public int B() {
        return this.f169014a;
    }

    public boolean C(int i10, int i11) {
        return F(this.f169033t, i10, i11);
    }

    public boolean D(int i10) {
        return ((1 << i10) & this.f169024k) != 0;
    }

    void M(int i10) {
        this.f169035v.removeCallbacks(this.f169037x);
        if (this.f169014a != i10) {
            this.f169014a = i10;
            this.f169032s.j(i10);
            if (this.f169014a == 0) {
                this.f169033t = null;
            }
        }
    }

    public void N(int i10) {
        this.f169028o = i10;
    }

    public void O(int i10) {
        this.f169030q = i10;
    }

    public void P(float f10) {
        this.f169027n = f10;
    }

    public boolean Q(int i10, int i11) {
        if (this.f169034u) {
            return v(i10, i11, (int) this.f169025l.getXVelocity(this.f169016c), (int) this.f169025l.getYVelocity(this.f169016c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean R(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C17994c.R(android.view.MotionEvent):boolean");
    }

    public boolean S(View view, int i10, int i11) {
        this.f169033t = view;
        this.f169016c = -1;
        boolean zV = v(i10, i11, 0, 0);
        if (!zV && this.f169014a == 0 && this.f169033t != null) {
            this.f169033t = null;
        }
        return zV;
    }

    boolean T(View view, int i10) {
        if (view == this.f169033t && this.f169016c == i10) {
            return true;
        }
        if (view == null || !this.f169032s.m(view, i10)) {
            return false;
        }
        this.f169016c = i10;
        c(view, i10);
        return true;
    }

    public boolean e(int i10) {
        float[] fArr = this.f169017d;
        if (fArr == null) {
            return false;
        }
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (f(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean n(boolean z10) {
        if (this.f169014a == 2) {
            boolean zComputeScrollOffset = this.f169031r.computeScrollOffset();
            int currX = this.f169031r.getCurrX();
            int currY = this.f169031r.getCurrY();
            int left = currX - this.f169033t.getLeft();
            int top = currY - this.f169033t.getTop();
            if (left != 0) {
                ViewCompat.X(this.f169033t, left);
            }
            if (top != 0) {
                ViewCompat.Y(this.f169033t, top);
            }
            if (left != 0 || top != 0) {
                this.f169032s.k(this.f169033t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f169031r.getFinalX() && currY == this.f169031r.getFinalY()) {
                this.f169031r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f169035v.post(this.f169037x);
                } else {
                    M(0);
                }
            }
        }
        return this.f169014a == 2;
    }

    public View u(int i10, int i11) {
        for (int childCount = this.f169035v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f169035v.getChildAt(this.f169032s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View w() {
        return this.f169033t;
    }

    public int x() {
        return this.f169029p;
    }

    public int y() {
        return this.f169028o;
    }

    private C17994c(Context context, ViewGroup viewGroup, d dVar) {
        J(viewGroup, "Parent view may not be null");
        J(dVar, "Callback may not be null");
        this.f169035v = viewGroup;
        this.f169032s = dVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f169029p = i10;
        this.f169028o = i10;
        this.f169015b = viewConfiguration.getScaledTouchSlop();
        this.f169026m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f169027n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f169036w = f169013y;
        this.f169031r = new OverScroller(context, new InterpolatorC2705c());
    }

    private boolean E(int i10) {
        if (!D(i10)) {
            return false;
        }
        return true;
    }

    private void K(float f10, float f11, int i10) {
        t(i10);
        float[] fArr = this.f169017d;
        this.f169019f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f169018e;
        this.f169020g[i10] = f11;
        fArr2[i10] = f11;
        this.f169021h[i10] = z((int) f10, (int) f11);
        this.f169024k |= 1 << i10;
    }

    private void L(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (E(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f169019f[pointerId] = x10;
                this.f169020g[pointerId] = y10;
            }
        }
    }

    private boolean d(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f169021h[i10] & i11) == i11 && (this.f169030q & i11) != 0 && (this.f169023j[i10] & i11) != i11 && (this.f169022i[i10] & i11) != i11) {
            int i12 = this.f169015b;
            if (fAbs > i12 || fAbs2 > i12) {
                if (fAbs < fAbs2 * 0.5f && this.f169032s.g(i11)) {
                    int[] iArr = this.f169023j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f169022i[i10] & i11) == 0 && fAbs > this.f169015b) {
                    return true;
                }
            }
        }
        return false;
    }

    private float h(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        if (fAbs > f12) {
            if (f10 > 0.0f) {
                return f12;
            }
            return -f12;
        }
        return f10;
    }

    private int i(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        if (iAbs > i12) {
            if (i10 > 0) {
                return i12;
            }
            return -i12;
        }
        return i10;
    }

    public static C17994c o(ViewGroup viewGroup, float f10, d dVar) {
        C17994c c17994cP = p(viewGroup, dVar);
        c17994cP.f169015b = (int) (c17994cP.f169015b * (1.0f / f10));
        return c17994cP;
    }

    public void G(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f169025l == null) {
            this.f169025l = VelocityTracker.obtain();
        }
        this.f169025l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f169014a == 1 && pointerId == this.f169016c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i11 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i11);
                                            if (pointerId2 != this.f169016c) {
                                                View viewU = u((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                                View view = this.f169033t;
                                                if (viewU == view && T(view, pointerId2)) {
                                                    i10 = this.f169016c;
                                                    break;
                                                }
                                            }
                                            i11++;
                                        } else {
                                            i10 = -1;
                                            break;
                                        }
                                    }
                                    if (i10 == -1) {
                                        H();
                                    }
                                }
                                k(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x10 = motionEvent.getX(actionIndex);
                        float y10 = motionEvent.getY(actionIndex);
                        K(x10, y10, pointerId3);
                        if (this.f169014a == 0) {
                            T(u((int) x10, (int) y10), pointerId3);
                            int i12 = this.f169021h[pointerId3];
                            int i13 = this.f169030q;
                            if ((i12 & i13) != 0) {
                                this.f169032s.h(i12 & i13, pointerId3);
                                return;
                            }
                            return;
                        }
                        if (C((int) x10, (int) y10)) {
                            T(this.f169033t, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.f169014a == 1) {
                        q(0.0f, 0.0f);
                    }
                    b();
                    return;
                }
                if (this.f169014a == 1) {
                    if (E(this.f169016c) && (iFindPointerIndex = motionEvent.findPointerIndex(this.f169016c)) != -1) {
                        float x11 = motionEvent.getX(iFindPointerIndex);
                        float y11 = motionEvent.getY(iFindPointerIndex);
                        float[] fArr = this.f169019f;
                        int i14 = this.f169016c;
                        int i15 = (int) (x11 - fArr[i14]);
                        int i16 = (int) (y11 - this.f169020g[i14]);
                        s(this.f169033t.getLeft() + i15, this.f169033t.getTop() + i16, i15, i16);
                    } else {
                        return;
                    }
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i11 < pointerCount2) {
                        int pointerId4 = motionEvent.getPointerId(i11);
                        if (E(pointerId4)) {
                            float x12 = motionEvent.getX(i11);
                            float y12 = motionEvent.getY(i11);
                            float f10 = x12 - this.f169017d[pointerId4];
                            float f11 = y12 - this.f169018e[pointerId4];
                            I(f10, f11, pointerId4);
                            if (this.f169014a != 1) {
                                View viewU2 = u((int) x12, (int) y12);
                                if (g(viewU2, f10, f11) && T(viewU2, pointerId4)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i11++;
                    }
                }
                L(motionEvent);
                return;
            }
            if (this.f169014a == 1) {
                H();
            }
            b();
            return;
        }
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View viewU3 = u((int) x13, (int) y13);
        K(x13, y13, pointerId5);
        T(viewU3, pointerId5);
        int i17 = this.f169021h[pointerId5];
        int i18 = this.f169030q;
        if ((i17 & i18) != 0) {
            this.f169032s.h(i17 & i18, pointerId5);
        }
    }

    public void c(View view, int i10) {
        if (view.getParent() == this.f169035v) {
            this.f169033t = view;
            this.f169016c = i10;
            this.f169032s.i(view, i10);
            M(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f169035v + ")");
    }

    public boolean f(int i10, int i11) {
        boolean z10;
        boolean z11;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        if (!D(i11)) {
            return false;
        }
        if ((i10 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 2) == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        float[] fArr4 = this.f169017d;
        if (fArr4 != null && (fArr = this.f169018e) != null && (fArr2 = this.f169019f) != null && (fArr3 = this.f169020g) != null) {
            float f10 = fArr2[i11] - fArr4[i11];
            float f11 = fArr3[i11] - fArr[i11];
            if (z10 && z11) {
                float f12 = (f10 * f10) + (f11 * f11);
                int i12 = this.f169015b;
                if (f12 <= i12 * i12) {
                    return false;
                }
                return true;
            }
            if (z10) {
                if (Math.abs(f10) <= this.f169015b) {
                    return false;
                }
                return true;
            }
            if (!z11 || Math.abs(f11) <= this.f169015b) {
                return false;
            }
            return true;
        }
        FS.log_w("ViewDragHelper", "Inconsistent pointer event stream: pointer is down, but there is no initial motion recorded. Is something intercepting or modifying events?");
        return false;
    }
}
