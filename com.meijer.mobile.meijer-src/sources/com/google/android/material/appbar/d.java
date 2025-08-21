package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.api.a;
import h2.C14442a;

/* loaded from: classes4.dex */
abstract class d<V extends View> extends f<V> {

    /* renamed from: d, reason: collision with root package name */
    private Runnable f87106d;

    /* renamed from: e, reason: collision with root package name */
    OverScroller f87107e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f87108f;

    /* renamed from: g, reason: collision with root package name */
    private int f87109g;

    /* renamed from: h, reason: collision with root package name */
    private int f87110h;

    /* renamed from: i, reason: collision with root package name */
    private int f87111i;

    /* renamed from: j, reason: collision with root package name */
    private VelocityTracker f87112j;

    private class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f87113a;

        /* renamed from: b, reason: collision with root package name */
        private final V f87114b;

        a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f87113a = coordinatorLayout;
            this.f87114b = v10;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f87114b == null || (overScroller = d.this.f87107e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                d.this.R(this.f87113a, this.f87114b);
                return;
            }
            d dVar = d.this;
            dVar.T(this.f87113a, this.f87114b, dVar.f87107e.getCurrY());
            ViewCompat.e0(this.f87114b, this);
        }
    }

    public d() {
        this.f87109g = -1;
        this.f87111i = -1;
    }

    boolean L(V v10) {
        return false;
    }

    void R(CoordinatorLayout coordinatorLayout, V v10) {
    }

    private void M() {
        if (this.f87112j == null) {
            this.f87112j = VelocityTracker.obtain();
        }
    }

    final boolean N(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, float f10) {
        Runnable runnable = this.f87106d;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f87106d = null;
        }
        if (this.f87107e == null) {
            this.f87107e = new OverScroller(v10.getContext());
        }
        this.f87107e.fling(0, I(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f87107e.computeScrollOffset()) {
            R(coordinatorLayout, v10);
            return false;
        }
        a aVar = new a(coordinatorLayout, v10);
        this.f87106d = aVar;
        ViewCompat.e0(v10, aVar);
        return true;
    }

    int T(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return U(coordinatorLayout, v10, i10, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f87111i < 0) {
            this.f87111i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f87108f) {
            int i10 = this.f87109g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f87110h) > this.f87111i) {
                this.f87110h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f87109g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = L(v10) && coordinatorLayout.C(v10, x10, y11);
            this.f87108f = z10;
            if (z10) {
                this.f87110h = y11;
                this.f87109g = motionEvent.getPointerId(0);
                M();
                OverScroller overScroller = this.f87107e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f87107e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f87112j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean H(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            int r1 = r12.getActionMasked()
            r6 = -1
            r7 = 0
            r8 = 1
            if (r1 == r8) goto L4d
            r3 = 2
            if (r1 == r3) goto L2d
            r2 = 3
            if (r1 == r2) goto L71
            r2 = 6
            if (r1 == r2) goto L13
            goto L4b
        L13:
            int r1 = r12.getActionIndex()
            if (r1 != 0) goto L1b
            r1 = r8
            goto L1c
        L1b:
            r1 = r7
        L1c:
            int r2 = r12.getPointerId(r1)
            r9.f87109g = r2
            float r1 = r12.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.f87110h = r1
            goto L4b
        L2d:
            int r1 = r9.f87109g
            int r1 = r12.findPointerIndex(r1)
            if (r1 != r6) goto L36
            return r7
        L36:
            float r1 = r12.getY(r1)
            int r1 = (int) r1
            int r3 = r9.f87110h
            int r3 = r3 - r1
            r9.f87110h = r1
            int r4 = r9.O(r11)
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.S(r1, r2, r3, r4, r5)
        L4b:
            r1 = r7
            goto L80
        L4d:
            android.view.VelocityTracker r1 = r9.f87112j
            if (r1 == 0) goto L71
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r9.f87112j
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            android.view.VelocityTracker r1 = r9.f87112j
            int r3 = r9.f87109g
            float r5 = r1.getYVelocity(r3)
            int r1 = r9.P(r11)
            int r3 = -r1
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.N(r1, r2, r3, r4, r5)
            r1 = r8
            goto L72
        L71:
            r1 = r7
        L72:
            r9.f87108f = r7
            r9.f87109g = r6
            android.view.VelocityTracker r2 = r9.f87112j
            if (r2 == 0) goto L80
            r2.recycle()
            r2 = 0
            r9.f87112j = r2
        L80:
            android.view.VelocityTracker r2 = r9.f87112j
            if (r2 == 0) goto L87
            r2.addMovement(r12)
        L87:
            boolean r2 = r9.f87108f
            if (r2 != 0) goto L8f
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            return r7
        L8f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.d.H(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    int O(V v10) {
        return -v10.getHeight();
    }

    int P(V v10) {
        return v10.getHeight();
    }

    int Q() {
        return I();
    }

    final int S(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return U(coordinatorLayout, v10, Q() - i10, i11, i12);
    }

    int U(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int iB;
        int I10 = I();
        if (i11 != 0 && I10 >= i11 && I10 <= i12 && I10 != (iB = C14442a.b(i10, i11, i12))) {
            K(iB);
            return I10 - iB;
        }
        return 0;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f87109g = -1;
        this.f87111i = -1;
    }
}
