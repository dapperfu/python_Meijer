package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p2.C16231q;
import q4.C16446b;

/* loaded from: classes4.dex */
public class l extends RecyclerView.o implements RecyclerView.r {

    /* renamed from: A, reason: collision with root package name */
    private f f58223A;

    /* renamed from: C, reason: collision with root package name */
    private Rect f58225C;

    /* renamed from: D, reason: collision with root package name */
    private long f58226D;

    /* renamed from: d, reason: collision with root package name */
    float f58230d;

    /* renamed from: e, reason: collision with root package name */
    float f58231e;

    /* renamed from: f, reason: collision with root package name */
    private float f58232f;

    /* renamed from: g, reason: collision with root package name */
    private float f58233g;

    /* renamed from: h, reason: collision with root package name */
    float f58234h;

    /* renamed from: i, reason: collision with root package name */
    float f58235i;

    /* renamed from: j, reason: collision with root package name */
    private float f58236j;

    /* renamed from: k, reason: collision with root package name */
    private float f58237k;

    /* renamed from: m, reason: collision with root package name */
    e f58239m;

    /* renamed from: o, reason: collision with root package name */
    int f58241o;

    /* renamed from: q, reason: collision with root package name */
    private int f58243q;

    /* renamed from: r, reason: collision with root package name */
    RecyclerView f58244r;

    /* renamed from: t, reason: collision with root package name */
    VelocityTracker f58246t;

    /* renamed from: u, reason: collision with root package name */
    private List<RecyclerView.F> f58247u;

    /* renamed from: v, reason: collision with root package name */
    private List<Integer> f58248v;

    /* renamed from: z, reason: collision with root package name */
    C16231q f58252z;

    /* renamed from: a, reason: collision with root package name */
    final List<View> f58227a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final float[] f58228b = new float[2];

    /* renamed from: c, reason: collision with root package name */
    RecyclerView.F f58229c = null;

    /* renamed from: l, reason: collision with root package name */
    int f58238l = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f58240n = 0;

    /* renamed from: p, reason: collision with root package name */
    List<g> f58242p = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    final Runnable f58245s = new a();

    /* renamed from: w, reason: collision with root package name */
    private RecyclerView.k f58249w = null;

    /* renamed from: x, reason: collision with root package name */
    View f58250x = null;

    /* renamed from: y, reason: collision with root package name */
    int f58251y = -1;

    /* renamed from: B, reason: collision with root package name */
    private final RecyclerView.t f58224B = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            if (lVar.f58229c == null || !lVar.y()) {
                return;
            }
            l lVar2 = l.this;
            RecyclerView.F f10 = lVar2.f58229c;
            if (f10 != null) {
                lVar2.t(f10);
            }
            l lVar3 = l.this;
            lVar3.f58244r.removeCallbacks(lVar3.f58245s);
            ViewCompat.e0(l.this.f58244r, this);
        }
    }

    class b implements RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            l.this.f58252z.a(motionEvent);
            VelocityTracker velocityTracker = l.this.f58246t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (l.this.f58238l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(l.this.f58238l);
            if (iFindPointerIndex >= 0) {
                l.this.i(actionMasked, motionEvent, iFindPointerIndex);
            }
            l lVar = l.this;
            RecyclerView.F f10 = lVar.f58229c;
            if (f10 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        lVar.E(motionEvent, lVar.f58241o, iFindPointerIndex);
                        l.this.t(f10);
                        l lVar2 = l.this;
                        lVar2.f58244r.removeCallbacks(lVar2.f58245s);
                        l.this.f58245s.run();
                        l.this.f58244r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    l lVar3 = l.this;
                    if (pointerId == lVar3.f58238l) {
                        lVar3.f58238l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        l lVar4 = l.this;
                        lVar4.E(motionEvent, lVar4.f58241o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = lVar.f58246t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            l.this.z(null, 0);
            l.this.f58238l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            g gVarM;
            l.this.f58252z.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                l.this.f58238l = motionEvent.getPointerId(0);
                l.this.f58230d = motionEvent.getX();
                l.this.f58231e = motionEvent.getY();
                l.this.u();
                l lVar = l.this;
                if (lVar.f58229c == null && (gVarM = lVar.m(motionEvent)) != null) {
                    l lVar2 = l.this;
                    lVar2.f58230d -= gVarM.f58275j;
                    lVar2.f58231e -= gVarM.f58276k;
                    lVar2.l(gVarM.f58270e, true);
                    if (l.this.f58227a.remove(gVarM.f58270e.itemView)) {
                        l lVar3 = l.this;
                        lVar3.f58239m.c(lVar3.f58244r, gVarM.f58270e);
                    }
                    l.this.z(gVarM.f58270e, gVarM.f58271f);
                    l lVar4 = l.this;
                    lVar4.E(motionEvent, lVar4.f58241o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                l lVar5 = l.this;
                lVar5.f58238l = -1;
                lVar5.z(null, 0);
            } else {
                int i10 = l.this.f58238l;
                if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    l.this.i(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = l.this.f58246t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return l.this.f58229c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z10) {
            if (z10) {
                l.this.z(null, 0);
            }
        }
    }

    class c extends g {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f58255o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f58256p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.F f10, int i10, int i11, float f11, float f12, float f13, float f14, int i12, RecyclerView.F f15) {
            super(f10, i10, i11, f11, f12, f13, f14);
            this.f58255o = i12;
            this.f58256p = f15;
        }

        @Override // androidx.recyclerview.widget.l.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f58277l) {
                if (this.f58255o <= 0) {
                    l lVar = l.this;
                    lVar.f58239m.c(lVar.f58244r, this.f58256p);
                } else {
                    l.this.f58227a.add(this.f58256p.itemView);
                    this.f58274i = true;
                    int i10 = this.f58255o;
                    if (i10 > 0) {
                        l.this.v(this, i10);
                    }
                }
                l lVar2 = l.this;
                View view = lVar2.f58250x;
                View view2 = this.f58256p.itemView;
                if (view == view2) {
                    lVar2.x(view2);
                }
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f58258a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58259b;

        d(g gVar, int i10) {
            this.f58258a = gVar;
            this.f58259b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = l.this.f58244r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            g gVar = this.f58258a;
            if (gVar.f58277l || gVar.f58270e.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.m itemAnimator = l.this.f58244r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !l.this.r()) {
                l.this.f58239m.B(this.f58258a.f58270e, this.f58259b);
            } else {
                l.this.f58244r.post(this);
            }
        }
    }

    public static abstract class e {

        /* renamed from: b, reason: collision with root package name */
        private static final Interpolator f58261b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final Interpolator f58262c = new b();

        /* renamed from: a, reason: collision with root package name */
        private int f58263a = -1;

        public static int e(int i10, int i11) {
            int i12;
            int i13 = i10 & 789516;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= (-789517) & i15;
                i12 = (i15 & 789516) << 2;
            }
            return i14 | i12;
        }

        public static int s(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public static int t(int i10, int i11) {
            return s(2, i10) | s(1, i11) | s(0, i11 | i10);
        }

        public abstract void B(RecyclerView.F f10, int i10);

        public boolean a(RecyclerView recyclerView, RecyclerView.F f10, RecyclerView.F f11) {
            return true;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13 = i10 & 3158064;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= (-3158065) & i15;
                i12 = (i15 & 3158064) >> 2;
            }
            return i14 | i12;
        }

        public int h() {
            return 0;
        }

        public float j(RecyclerView.F f10) {
            return 0.5f;
        }

        public abstract int k(RecyclerView recyclerView, RecyclerView.F f10);

        public float l(float f10) {
            return f10;
        }

        public float m(RecyclerView.F f10) {
            return 0.5f;
        }

        public float n(float f10) {
            return f10;
        }

        public boolean q() {
            return true;
        }

        public boolean r() {
            return true;
        }

        public abstract boolean y(RecyclerView recyclerView, RecyclerView.F f10, RecyclerView.F f11);

        class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }

            a() {
            }
        }

        class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }

            b() {
            }
        }

        private int i(RecyclerView recyclerView) {
            if (this.f58263a == -1) {
                this.f58263a = recyclerView.getResources().getDimensionPixelSize(C16446b.f156762d);
            }
            return this.f58263a;
        }

        public void A(RecyclerView.F f10, int i10) {
            if (f10 != null) {
                n.f58281a.b(f10.itemView);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.F b(RecyclerView.F f10, List<RecyclerView.F> list, int i10, int i11) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = f10.itemView.getWidth() + i10;
            int height = i11 + f10.itemView.getHeight();
            int left2 = i10 - f10.itemView.getLeft();
            int top2 = i11 - f10.itemView.getTop();
            int size = list.size();
            RecyclerView.F f11 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.F f12 = list.get(i13);
                if (left2 > 0 && (right = f12.itemView.getRight() - width) < 0 && f12.itemView.getRight() > f10.itemView.getRight() && (iAbs4 = Math.abs(right)) > i12) {
                    f11 = f12;
                    i12 = iAbs4;
                }
                if (left2 < 0 && (left = f12.itemView.getLeft() - i10) > 0 && f12.itemView.getLeft() < f10.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i12) {
                    f11 = f12;
                    i12 = iAbs3;
                }
                if (top2 < 0 && (top = f12.itemView.getTop() - i11) > 0 && f12.itemView.getTop() < f10.itemView.getTop() && (iAbs2 = Math.abs(top)) > i12) {
                    f11 = f12;
                    i12 = iAbs2;
                }
                if (top2 > 0 && (bottom = f12.itemView.getBottom() - height) < 0 && f12.itemView.getBottom() > f10.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i12) {
                    f11 = f12;
                    i12 = iAbs;
                }
            }
            return f11;
        }

        public void c(RecyclerView recyclerView, RecyclerView.F f10) {
            n.f58281a.a(f10.itemView);
        }

        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f10, float f11, float f12, int i10, boolean z10) {
            n.f58281a.c(canvas, recyclerView, f10.itemView, f11, f12, i10, z10);
        }

        public void v(Canvas canvas, RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.F f10, float f11, float f12, int i10, boolean z10) {
            n.f58281a.d(canvas, recyclerView, f10.itemView, f11, f12, i10, z10);
        }

        void x(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f10, List<g> list, int i10, float f11, float f12) {
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list.get(i11);
                int iSave = canvas.save();
                v(canvas, recyclerView, gVar.f58270e, gVar.f58275j, gVar.f58276k, gVar.f58271f, false);
                canvas.restoreToCount(iSave);
            }
            if (f10 != null) {
                int iSave2 = canvas.save();
                v(canvas, recyclerView, f10, f11, f12, i10, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                g gVar2 = list.get(i12);
                boolean z11 = gVar2.f58278m;
                if (z11 && !gVar2.f58274i) {
                    list.remove(i12);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }

        final int f(RecyclerView recyclerView, RecyclerView.F f10) {
            return d(k(recyclerView, f10), ViewCompat.z(recyclerView));
        }

        public long g(RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i10 == 8) {
                    return 200L;
                }
                return 250L;
            }
            if (i10 == 8) {
                return itemAnimator.getMoveDuration();
            }
            return itemAnimator.getRemoveDuration();
        }

        boolean o(RecyclerView recyclerView, RecyclerView.F f10) {
            if ((f(recyclerView, f10) & 16711680) != 0) {
                return true;
            }
            return false;
        }

        public int p(RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            int i13 = i(recyclerView);
            float f10 = 1.0f;
            int iSignum = (int) (((int) Math.signum(i11)) * i13 * f58262c.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)));
            if (j10 <= 2000) {
                f10 = j10 / 2000.0f;
            }
            int interpolation = (int) (iSignum * f58261b.getInterpolation(f10));
            if (interpolation == 0) {
                if (i11 > 0) {
                    return 1;
                }
                return -1;
            }
            return interpolation;
        }

        void w(Canvas canvas, RecyclerView recyclerView, RecyclerView.F f10, List<g> list, int i10, float f11, float f12) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list.get(i11);
                gVar.e();
                int iSave = canvas.save();
                u(canvas, recyclerView, gVar.f58270e, gVar.f58275j, gVar.f58276k, gVar.f58271f, false);
                canvas.restoreToCount(iSave);
            }
            if (f10 != null) {
                int iSave2 = canvas.save();
                u(canvas, recyclerView, f10, f11, f12, i10, true);
                canvas.restoreToCount(iSave2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void z(RecyclerView recyclerView, RecyclerView.F f10, int i10, RecyclerView.F f11, int i11, int i12, int i13) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).h(f10.itemView, f11.itemView, i12, i13);
                return;
            }
            if (layoutManager.B()) {
                if (layoutManager.i0(f11.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i11);
                }
                if (layoutManager.l0(f11.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i11);
                }
            }
            if (layoutManager.C()) {
                if (layoutManager.m0(f11.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i11);
                }
                if (layoutManager.g0(f11.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i11);
                }
            }
        }
    }

    private class f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f58264a = true;

        void a() {
            this.f58264a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        f() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewN;
            RecyclerView.F childViewHolder;
            if (!this.f58264a || (viewN = l.this.n(motionEvent)) == null || (childViewHolder = l.this.f58244r.getChildViewHolder(viewN)) == null) {
                return;
            }
            l lVar = l.this;
            if (lVar.f58239m.o(lVar.f58244r, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = l.this.f58238l;
                if (pointerId == i10) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(iFindPointerIndex);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    l lVar2 = l.this;
                    lVar2.f58230d = x10;
                    lVar2.f58231e = y10;
                    lVar2.f58235i = 0.0f;
                    lVar2.f58234h = 0.0f;
                    if (lVar2.f58239m.r()) {
                        l.this.z(childViewHolder, 2);
                    }
                }
            }
        }
    }

    static class g implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final float f58266a;

        /* renamed from: b, reason: collision with root package name */
        final float f58267b;

        /* renamed from: c, reason: collision with root package name */
        final float f58268c;

        /* renamed from: d, reason: collision with root package name */
        final float f58269d;

        /* renamed from: e, reason: collision with root package name */
        final RecyclerView.F f58270e;

        /* renamed from: f, reason: collision with root package name */
        final int f58271f;

        /* renamed from: g, reason: collision with root package name */
        final ValueAnimator f58272g;

        /* renamed from: h, reason: collision with root package name */
        final int f58273h;

        /* renamed from: i, reason: collision with root package name */
        boolean f58274i;

        /* renamed from: j, reason: collision with root package name */
        float f58275j;

        /* renamed from: k, reason: collision with root package name */
        float f58276k;

        /* renamed from: l, reason: collision with root package name */
        boolean f58277l = false;

        /* renamed from: m, reason: collision with root package name */
        boolean f58278m = false;

        /* renamed from: n, reason: collision with root package name */
        private float f58279n;

        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public void a() {
            this.f58272g.cancel();
        }

        public void b(long j10) {
            this.f58272g.setDuration(j10);
        }

        public void c(float f10) {
            this.f58279n = f10;
        }

        public void d() {
            this.f58270e.setIsRecyclable(false);
            this.f58272g.start();
        }

        public void e() {
            float f10 = this.f58266a;
            float f11 = this.f58268c;
            if (f10 == f11) {
                this.f58275j = this.f58270e.itemView.getTranslationX();
            } else {
                this.f58275j = f10 + (this.f58279n * (f11 - f10));
            }
            float f12 = this.f58267b;
            float f13 = this.f58269d;
            if (f12 == f13) {
                this.f58276k = this.f58270e.itemView.getTranslationY();
            } else {
                this.f58276k = f12 + (this.f58279n * (f13 - f12));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f58278m) {
                this.f58270e.setIsRecyclable(true);
            }
            this.f58278m = true;
        }

        g(RecyclerView.F f10, int i10, int i11, float f11, float f12, float f13, float f14) {
            this.f58271f = i11;
            this.f58273h = i10;
            this.f58270e = f10;
            this.f58266a = f11;
            this.f58267b = f12;
            this.f58268c = f13;
            this.f58269d = f14;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f58272g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.setTarget(f10.itemView);
            valueAnimatorOfFloat.addListener(this);
            c(0.0f);
        }
    }

    public interface h {
        void h(View view, View view2, int i10, int i11);
    }

    private void f() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        float f10;
        float f11;
        this.f58251y = -1;
        if (this.f58229c != null) {
            q(this.f58228b);
            float[] fArr = this.f58228b;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f58239m.w(canvas, recyclerView, this.f58229c, this.f58242p, this.f58240n, f10, f11);
    }

    private void A() {
        this.f58243q = ViewConfiguration.get(this.f58244r.getContext()).getScaledTouchSlop();
        this.f58244r.addItemDecoration(this);
        this.f58244r.addOnItemTouchListener(this.f58224B);
        this.f58244r.addOnChildAttachStateChangeListener(this);
        B();
    }

    private void B() {
        this.f58223A = new f();
        this.f58252z = new C16231q(this.f58244r.getContext(), this.f58223A);
    }

    private void C() {
        f fVar = this.f58223A;
        if (fVar != null) {
            fVar.a();
            this.f58223A = null;
        }
        if (this.f58252z != null) {
            this.f58252z = null;
        }
    }

    private int D(RecyclerView.F f10) {
        if (this.f58240n == 2) {
            return 0;
        }
        int iK = this.f58239m.k(this.f58244r, f10);
        int iD = (this.f58239m.d(iK, ViewCompat.z(this.f58244r)) & 65280) >> 8;
        if (iD == 0) {
            return 0;
        }
        int i10 = (iK & 65280) >> 8;
        if (Math.abs(this.f58234h) > Math.abs(this.f58235i)) {
            int iH = h(f10, iD);
            if (iH > 0) {
                return (i10 & iH) == 0 ? e.e(iH, ViewCompat.z(this.f58244r)) : iH;
            }
            int iJ = j(f10, iD);
            if (iJ > 0) {
                return iJ;
            }
        } else {
            int iJ2 = j(f10, iD);
            if (iJ2 > 0) {
                return iJ2;
            }
            int iH2 = h(f10, iD);
            if (iH2 > 0) {
                return (i10 & iH2) == 0 ? e.e(iH2, ViewCompat.z(this.f58244r)) : iH2;
            }
        }
        return 0;
    }

    private int h(RecyclerView.F f10, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.f58234h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f58246t;
        if (velocityTracker != null && this.f58238l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f58239m.n(this.f58233g));
            float xVelocity = this.f58246t.getXVelocity(this.f58238l);
            float yVelocity = this.f58246t.getYVelocity(this.f58238l);
            int i12 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && fAbs >= this.f58239m.l(this.f58232f) && fAbs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float width = this.f58244r.getWidth() * this.f58239m.m(f10);
        if ((i10 & i11) == 0 || Math.abs(this.f58234h) <= width) {
            return 0;
        }
        return i11;
    }

    private int j(RecyclerView.F f10, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.f58235i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f58246t;
        if (velocityTracker != null && this.f58238l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f58239m.n(this.f58233g));
            float xVelocity = this.f58246t.getXVelocity(this.f58238l);
            float yVelocity = this.f58246t.getYVelocity(this.f58238l);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && fAbs >= this.f58239m.l(this.f58232f) && fAbs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float height = this.f58244r.getHeight() * this.f58239m.m(f10);
        if ((i10 & i11) == 0 || Math.abs(this.f58235i) <= height) {
            return 0;
        }
        return i11;
    }

    private void k() {
        this.f58244r.removeItemDecoration(this);
        this.f58244r.removeOnItemTouchListener(this.f58224B);
        this.f58244r.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f58242p.size() - 1; size >= 0; size--) {
            g gVar = this.f58242p.get(0);
            gVar.a();
            this.f58239m.c(this.f58244r, gVar.f58270e);
        }
        this.f58242p.clear();
        this.f58250x = null;
        this.f58251y = -1;
        w();
        C();
    }

    private List<RecyclerView.F> o(RecyclerView.F f10) {
        RecyclerView.F f11 = f10;
        List<RecyclerView.F> list = this.f58247u;
        if (list == null) {
            this.f58247u = new ArrayList();
            this.f58248v = new ArrayList();
        } else {
            list.clear();
            this.f58248v.clear();
        }
        int iH = this.f58239m.h();
        int iRound = Math.round(this.f58236j + this.f58234h) - iH;
        int iRound2 = Math.round(this.f58237k + this.f58235i) - iH;
        int i10 = iH * 2;
        int width = f11.itemView.getWidth() + iRound + i10;
        int height = f11.itemView.getHeight() + iRound2 + i10;
        int i11 = (iRound + width) / 2;
        int i12 = (iRound2 + height) / 2;
        RecyclerView.p layoutManager = this.f58244r.getLayoutManager();
        int iB0 = layoutManager.b0();
        int i13 = 0;
        while (i13 < iB0) {
            View viewA0 = layoutManager.a0(i13);
            if (viewA0 != f11.itemView && viewA0.getBottom() >= iRound2 && viewA0.getTop() <= height && viewA0.getRight() >= iRound && viewA0.getLeft() <= width) {
                RecyclerView.F childViewHolder = this.f58244r.getChildViewHolder(viewA0);
                if (this.f58239m.a(this.f58244r, this.f58229c, childViewHolder)) {
                    int iAbs = Math.abs(i11 - ((viewA0.getLeft() + viewA0.getRight()) / 2));
                    int iAbs2 = Math.abs(i12 - ((viewA0.getTop() + viewA0.getBottom()) / 2));
                    int i14 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.f58247u.size();
                    int i15 = 0;
                    for (int i16 = 0; i16 < size && i14 > this.f58248v.get(i16).intValue(); i16++) {
                        i15++;
                    }
                    this.f58247u.add(i15, childViewHolder);
                    this.f58248v.add(i15, Integer.valueOf(i14));
                }
            }
            i13++;
            f11 = f10;
        }
        return this.f58247u;
    }

    private RecyclerView.F p(MotionEvent motionEvent) {
        View viewN;
        RecyclerView.p layoutManager = this.f58244r.getLayoutManager();
        int i10 = this.f58238l;
        if (i10 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        float x10 = motionEvent.getX(iFindPointerIndex) - this.f58230d;
        float y10 = motionEvent.getY(iFindPointerIndex) - this.f58231e;
        float fAbs = Math.abs(x10);
        float fAbs2 = Math.abs(y10);
        int i11 = this.f58243q;
        if (fAbs < i11 && fAbs2 < i11) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.B()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.C()) && (viewN = n(motionEvent)) != null) {
            return this.f58244r.getChildViewHolder(viewN);
        }
        return null;
    }

    private void q(float[] fArr) {
        if ((this.f58241o & 12) != 0) {
            fArr[0] = (this.f58236j + this.f58234h) - this.f58229c.itemView.getLeft();
        } else {
            fArr[0] = this.f58229c.itemView.getTranslationX();
        }
        if ((this.f58241o & 3) != 0) {
            fArr[1] = (this.f58237k + this.f58235i) - this.f58229c.itemView.getTop();
        } else {
            fArr[1] = this.f58229c.itemView.getTranslationY();
        }
    }

    private static boolean s(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    private void w() {
        VelocityTracker velocityTracker = this.f58246t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f58246t = null;
        }
    }

    public void g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f58244r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            k();
        }
        this.f58244r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f58232f = resources.getDimension(C16446b.f156764f);
            this.f58233g = resources.getDimension(C16446b.f156763e);
            A();
        }
    }

    void i(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.F fP;
        int iF;
        if (this.f58229c != null || i10 != 2 || this.f58240n == 2 || !this.f58239m.q() || this.f58244r.getScrollState() == 1 || (fP = p(motionEvent)) == null || (iF = (this.f58239m.f(this.f58244r, fP) & 65280) >> 8) == 0) {
            return;
        }
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f58230d;
        float f11 = y10 - this.f58231e;
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        int i12 = this.f58243q;
        if (fAbs >= i12 || fAbs2 >= i12) {
            if (fAbs > fAbs2) {
                if (f10 < 0.0f && (iF & 4) == 0) {
                    return;
                }
                if (f10 > 0.0f && (iF & 8) == 0) {
                    return;
                }
            } else {
                if (f11 < 0.0f && (iF & 1) == 0) {
                    return;
                }
                if (f11 > 0.0f && (iF & 2) == 0) {
                    return;
                }
            }
            this.f58235i = 0.0f;
            this.f58234h = 0.0f;
            this.f58238l = motionEvent.getPointerId(0);
            z(fP, 1);
        }
    }

    void l(RecyclerView.F f10, boolean z10) {
        for (int size = this.f58242p.size() - 1; size >= 0; size--) {
            g gVar = this.f58242p.get(size);
            if (gVar.f58270e == f10) {
                gVar.f58277l |= z10;
                if (!gVar.f58278m) {
                    gVar.a();
                }
                this.f58242p.remove(size);
                return;
            }
        }
    }

    g m(MotionEvent motionEvent) {
        if (this.f58242p.isEmpty()) {
            return null;
        }
        View viewN = n(motionEvent);
        for (int size = this.f58242p.size() - 1; size >= 0; size--) {
            g gVar = this.f58242p.get(size);
            if (gVar.f58270e.itemView == viewN) {
                return gVar;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        float f10;
        float f11;
        if (this.f58229c != null) {
            q(this.f58228b);
            float[] fArr = this.f58228b;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f58239m.x(canvas, recyclerView, this.f58229c, this.f58242p, this.f58240n, f10, f11);
    }

    boolean r() {
        int size = this.f58242p.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f58242p.get(i10).f58278m) {
                return true;
            }
        }
        return false;
    }

    void t(RecyclerView.F f10) {
        if (!this.f58244r.isLayoutRequested() && this.f58240n == 2) {
            float fJ = this.f58239m.j(f10);
            int i10 = (int) (this.f58236j + this.f58234h);
            int i11 = (int) (this.f58237k + this.f58235i);
            if (Math.abs(i11 - f10.itemView.getTop()) >= f10.itemView.getHeight() * fJ || Math.abs(i10 - f10.itemView.getLeft()) >= f10.itemView.getWidth() * fJ) {
                List<RecyclerView.F> listO = o(f10);
                if (listO.size() == 0) {
                    return;
                }
                RecyclerView.F fB = this.f58239m.b(f10, listO, i10, i11);
                if (fB == null) {
                    this.f58247u.clear();
                    this.f58248v.clear();
                    return;
                }
                int absoluteAdapterPosition = fB.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = f10.getAbsoluteAdapterPosition();
                if (this.f58239m.y(this.f58244r, f10, fB)) {
                    this.f58239m.z(this.f58244r, f10, absoluteAdapterPosition2, fB, absoluteAdapterPosition, i10, i11);
                }
            }
        }
    }

    void u() {
        VelocityTracker velocityTracker = this.f58246t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f58246t = VelocityTracker.obtain();
    }

    void v(g gVar, int i10) {
        this.f58244r.post(new d(gVar, i10));
    }

    void x(View view) {
        if (view == this.f58250x) {
            this.f58250x = null;
            if (this.f58249w != null) {
                this.f58244r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean y() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.y():boolean");
    }

    void z(RecyclerView.F f10, int i10) {
        boolean z10;
        float fSignum;
        float fSignum2;
        if (f10 == this.f58229c && i10 == this.f58240n) {
            return;
        }
        this.f58226D = Long.MIN_VALUE;
        int i11 = this.f58240n;
        l(f10, true);
        this.f58240n = i10;
        if (i10 == 2) {
            if (f10 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f58250x = f10.itemView;
            f();
        }
        int i12 = (1 << ((i10 * 8) + 8)) - 1;
        RecyclerView.F f11 = this.f58229c;
        boolean z11 = false;
        if (f11 != null) {
            if (f11.itemView.getParent() != null) {
                int iD = i11 == 2 ? 0 : D(f11);
                w();
                int i13 = 4;
                if (iD == 1 || iD == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f58235i) * this.f58244r.getHeight();
                } else if (iD == 4 || iD == 8 || iD == 16 || iD == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f58234h) * this.f58244r.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i11 == 2) {
                    i13 = 8;
                } else if (iD > 0) {
                    i13 = 2;
                }
                q(this.f58228b);
                float[] fArr = this.f58228b;
                float f12 = fArr[0];
                float f13 = fArr[1];
                z10 = false;
                c cVar = new c(f11, i13, i11, f12, f13, fSignum, fSignum2, iD, f11);
                cVar.b(this.f58239m.g(this.f58244r, i13, fSignum - f12, fSignum2 - f13));
                this.f58242p.add(cVar);
                cVar.d();
                z11 = true;
            } else {
                z10 = false;
                x(f11.itemView);
                this.f58239m.c(this.f58244r, f11);
                z11 = false;
            }
            this.f58229c = null;
        } else {
            z10 = false;
        }
        if (f10 != null) {
            this.f58241o = (this.f58239m.f(this.f58244r, f10) & i12) >> (this.f58240n * 8);
            this.f58236j = f10.itemView.getLeft();
            this.f58237k = f10.itemView.getTop();
            this.f58229c = f10;
            if (i10 == 2) {
                f10.itemView.performHapticFeedback(z10 ? 1 : 0);
            }
        }
        ViewParent parent = this.f58244r.getParent();
        if (parent != null) {
            if (this.f58229c != null) {
                z10 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        if (!z11) {
            this.f58244r.getLayoutManager().L1();
        }
        this.f58239m.A(this.f58229c, this.f58240n);
        this.f58244r.invalidate();
    }

    public l(e eVar) {
        this.f58239m = eVar;
    }

    void E(MotionEvent motionEvent, int i10, int i11) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f58230d;
        this.f58234h = f10;
        this.f58235i = y10 - this.f58231e;
        if ((i10 & 4) == 0) {
            this.f58234h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f58234h = Math.min(0.0f, this.f58234h);
        }
        if ((i10 & 1) == 0) {
            this.f58235i = Math.max(0.0f, this.f58235i);
        }
        if ((i10 & 2) == 0) {
            this.f58235i = Math.min(0.0f, this.f58235i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(View view) {
        x(view);
        RecyclerView.F childViewHolder = this.f58244r.getChildViewHolder(view);
        if (childViewHolder != null) {
            RecyclerView.F f10 = this.f58229c;
            if (f10 != null && childViewHolder == f10) {
                z(null, 0);
                return;
            }
            l(childViewHolder, false);
            if (this.f58227a.remove(childViewHolder.itemView)) {
                this.f58239m.c(this.f58244r, childViewHolder);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b10) {
        rect.setEmpty();
    }

    View n(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.F f10 = this.f58229c;
        if (f10 != null) {
            View view = f10.itemView;
            if (s(view, x10, y10, this.f58236j + this.f58234h, this.f58237k + this.f58235i)) {
                return view;
            }
        }
        for (int size = this.f58242p.size() - 1; size >= 0; size--) {
            g gVar = this.f58242p.get(size);
            View view2 = gVar.f58270e.itemView;
            if (s(view2, x10, y10, gVar.f58275j, gVar.f58276k)) {
                return view2;
            }
        }
        return this.f58244r.findChildViewUnder(x10, y10);
    }
}
