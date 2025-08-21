package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import q2.InterfaceC16593B;
import q2.y;
import x2.C18060c;

/* loaded from: classes4.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    C18060c f87144a;

    /* renamed from: b, reason: collision with root package name */
    c f87145b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f87146c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f87147d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f87149f;

    /* renamed from: e, reason: collision with root package name */
    private float f87148e = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    int f87150g = 2;

    /* renamed from: h, reason: collision with root package name */
    float f87151h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    float f87152i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    float f87153j = 0.5f;

    /* renamed from: k, reason: collision with root package name */
    private final C18060c.d f87154k = new a();

    class a extends C18060c.d {

        /* renamed from: a, reason: collision with root package name */
        private int f87155a;

        /* renamed from: b, reason: collision with root package name */
        private int f87156b = -1;

        private boolean n(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f87155a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f87151h);
            }
            boolean z10 = ViewCompat.z(view) == 1;
            int i10 = SwipeDismissBehavior.this.f87150g;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                return z10 ? f10 < 0.0f : f10 > 0.0f;
            }
            if (i10 == 1) {
                if (z10) {
                    return f10 > 0.0f;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // x2.C18060c.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f87156b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.n(r3, r4)
                if (r0 == 0) goto L23
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1d
                int r4 = r3.getLeft()
                int r0 = r2.f87155a
                if (r4 >= r0) goto L1b
                goto L1d
            L1b:
                int r0 = r0 + r5
                goto L21
            L1d:
                int r4 = r2.f87155a
                int r0 = r4 - r5
            L21:
                r4 = 1
                goto L26
            L23:
                int r0 = r2.f87155a
                r4 = 0
            L26:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                x2.c r5 = r5.f87144a
                int r1 = r3.getTop()
                boolean r5 = r5.Q(r0, r1)
                if (r5 == 0) goto L3f
                com.google.android.material.behavior.SwipeDismissBehavior$d r5 = new com.google.android.material.behavior.SwipeDismissBehavior$d
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                androidx.core.view.ViewCompat.e0(r3, r5)
                return
            L3f:
                if (r4 == 0) goto L4a
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$c r4 = r4.f87145b
                if (r4 == 0) goto L4a
                r4.a(r3)
            L4a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.l(android.view.View, float, float):void");
        }

        a() {
        }

        @Override // x2.C18060c.d
        public void i(View view, int i10) {
            this.f87156b = i10;
            this.f87155a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f87147d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f87147d = false;
            }
        }

        @Override // x2.C18060c.d
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f87145b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // x2.C18060c.d
        public boolean m(View view, int i10) {
            int i11 = this.f87156b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.J(view);
        }

        @Override // x2.C18060c.d
        public int a(View view, int i10, int i11) {
            boolean z10;
            int width;
            int width2;
            int width3;
            if (ViewCompat.z(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = SwipeDismissBehavior.this.f87150g;
            if (i12 == 0) {
                if (z10) {
                    width = this.f87155a - view.getWidth();
                    width2 = this.f87155a;
                } else {
                    width = this.f87155a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 == 1) {
                if (z10) {
                    width = this.f87155a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.f87155a - view.getWidth();
                    width2 = this.f87155a;
                }
            } else {
                width = this.f87155a - view.getWidth();
                width2 = view.getWidth() + this.f87155a;
            }
            return SwipeDismissBehavior.L(width, i10, width2);
        }

        @Override // x2.C18060c.d
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // x2.C18060c.d
        public int d(View view) {
            return view.getWidth();
        }

        @Override // x2.C18060c.d
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f87152i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f87153j;
            float fAbs = Math.abs(i10 - this.f87155a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.K(0.0f, 1.0f - SwipeDismissBehavior.N(width, width2, fAbs), 1.0f));
            }
        }
    }

    class b implements InterfaceC16593B {
        b() {
        }

        @Override // q2.InterfaceC16593B
        public boolean a(View view, InterfaceC16593B.a aVar) {
            if (!SwipeDismissBehavior.this.J(view)) {
                return false;
            }
            boolean z10 = ViewCompat.z(view) == 1;
            int i10 = SwipeDismissBehavior.this.f87150g;
            ViewCompat.X(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f87145b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    private class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final View f87159a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f87160b;

        d(View view, boolean z10) {
            this.f87159a = view;
            this.f87160b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            C18060c c18060c = SwipeDismissBehavior.this.f87144a;
            if (c18060c != null && c18060c.n(true)) {
                ViewCompat.e0(this.f87159a, this);
            } else {
                if (!this.f87160b || (cVar = SwipeDismissBehavior.this.f87145b) == null) {
                    return;
                }
                cVar.a(this.f87159a);
            }
        }
    }

    static float N(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    public boolean J(View view) {
        return true;
    }

    public void O(float f10) {
        this.f87153j = K(0.0f, f10, 1.0f);
    }

    public void Q(float f10) {
        this.f87152i = K(0.0f, f10, 1.0f);
    }

    private void M(ViewGroup viewGroup) {
        if (this.f87144a == null) {
            this.f87144a = this.f87149f ? C18060c.o(viewGroup, this.f87148e, this.f87154k) : C18060c.p(viewGroup, this.f87154k);
        }
    }

    private void S(View view) {
        ViewCompat.g0(view, 1048576);
        if (J(view)) {
            ViewCompat.i0(view, y.a.f157857y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f87144a == null) {
            return false;
        }
        if (this.f87147d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f87144a.G(motionEvent);
        return true;
    }

    public void P(c cVar) {
        this.f87145b = cVar;
    }

    public void R(int i10) {
        this.f87150g = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean zC = this.f87146c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zC = coordinatorLayout.C(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f87146c = zC;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f87146c = false;
        }
        if (zC) {
            M(coordinatorLayout);
            if (!this.f87147d && this.f87144a.R(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    static float K(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int L(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        boolean zP = super.p(coordinatorLayout, v10, i10);
        if (ViewCompat.x(v10) == 0) {
            ViewCompat.w0(v10, 1);
            S(v10);
        }
        return zP;
    }
}
