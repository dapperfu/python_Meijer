package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import com.medallia.digital.mobilesdk.e3;
import com.medallia.digital.mobilesdk.j1;

/* loaded from: classes7.dex */
final class j4 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: o, reason: collision with root package name */
    private static final long f92311o = 300;

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f92312a;

    /* renamed from: b, reason: collision with root package name */
    private final j1 f92313b;

    /* renamed from: c, reason: collision with root package name */
    private final m4 f92314c;

    /* renamed from: d, reason: collision with root package name */
    private final i1 f92315d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f92316e;

    /* renamed from: f, reason: collision with root package name */
    private long f92317f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f92318g;

    /* renamed from: h, reason: collision with root package name */
    private Activity f92319h;

    /* renamed from: i, reason: collision with root package name */
    private ViewGroup f92320i = null;

    /* renamed from: j, reason: collision with root package name */
    private Animation f92321j;

    /* renamed from: k, reason: collision with root package name */
    private Animation f92322k;

    /* renamed from: l, reason: collision with root package name */
    private x f92323l;

    /* renamed from: m, reason: collision with root package name */
    private Handler f92324m;

    /* renamed from: n, reason: collision with root package name */
    private y f92325n;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92326a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f92327b;

        static {
            int[] iArr = new int[l.values().length];
            f92327b = iArr;
            try {
                iArr[l.DISPLAY_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92327b[l.ADD_BANNER_TO_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92327b[l.REMOVE_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[k.values().length];
            f92326a = iArr2;
            try {
                iArr2[k.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f92326a[k.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f92326a[k.DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f92326a[k.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    class b extends v4 {
        b() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (j4.this.r() != null && j4.this.r().getParent() != null) {
                ((ViewGroup) j4.this.r().getParent()).removeView(j4.this.r());
            }
            j4.this.A();
        }
    }

    class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f92329a;

        c(x xVar) {
            this.f92329a = xVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j4 j4Var = j4.this;
            j4Var.a(this.f92329a, new e3(j4Var.p(), e3.a.buttonClicked, j4.this.r().b()));
        }
    }

    class d implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f92331a;

        d(x xVar) {
            this.f92331a = xVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j4.this.a(this.f92331a);
        }
    }

    class e extends y {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ x f92333q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j1 j1Var, boolean z10, m4 m4Var, x xVar) {
            super(j1Var, z10, m4Var);
            this.f92333q = xVar;
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void c() {
            j4.this.a(this.f92333q);
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void d() {
            j4.this.f92316e = true;
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void e() {
            if (j4.this.j().f92270b == j1.c.BOTTOM) {
                x xVar = this.f92333q;
                if (xVar != null) {
                    xVar.a(new e3(j4.this.p(), e3.a.swipeDown, j4.this.r().b()));
                }
                j4.this.a(k.DOWN);
            }
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void f() {
            x xVar = this.f92333q;
            if (xVar != null) {
                xVar.a(new e3(j4.this.p(), e3.a.swipeLeft, j4.this.r().b()));
            }
            j4.this.a(k.LEFT);
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void g() {
            x xVar = this.f92333q;
            if (xVar != null) {
                xVar.a(new e3(j4.this.p(), e3.a.swipeRight, j4.this.r().b()));
            }
            j4.this.a(k.RIGHT);
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void h() {
            if (j4.this.j().f92270b == j1.c.TOP) {
                x xVar = this.f92333q;
                if (xVar != null) {
                    xVar.a(new e3(j4.this.p(), e3.a.swipeUp, j4.this.r().b()));
                }
                j4.this.a(k.UP);
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j4.this.f92316e) {
                return;
            }
            j4.this.a(l.REMOVE_BANNER);
        }
    }

    class g extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f92336a;

        g(View view) {
            this.f92336a = view;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f92336a.performAccessibilityAction(64, null);
        }
    }

    class h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f92338a;

        h(View view) {
            this.f92338a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            long duration;
            this.f92338a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (j4.this.k() != null) {
                long jCurrentTimeMillis = 0;
                if (j4.this.f92317f == 0) {
                    this.f92338a.startAnimation(j4.this.k());
                    duration = j4.this.k().getDuration();
                } else {
                    duration = 0;
                }
                if (-1 != j4.this.j().f92269a) {
                    if (j4.this.f92317f == 0) {
                        j4.this.f92317f = System.currentTimeMillis();
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis() - j4.this.f92317f;
                    }
                    if (j4.this.r().c()) {
                        return;
                    }
                    j4 j4Var = j4.this;
                    j4Var.a((j4Var.j().f92269a - jCurrentTimeMillis) + duration);
                }
            }
        }
    }

    class i implements p2.G {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f92340a;

        i(View view) {
            this.f92340a = view;
        }

        @Override // p2.G
        public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) {
            j4.this.a(this.f92340a, jVar, false);
            return androidx.core.view.j.f53969b;
        }
    }

    class j implements p2.G {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f92342a;

        j(View view) {
            this.f92342a = view;
        }

        @Override // p2.G
        public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) {
            j4.this.a(this.f92342a, jVar, true);
            return ViewCompat.Z(view, jVar);
        }
    }

    enum k {
        UP,
        LEFT,
        RIGHT,
        DOWN;

        protected Animation a(j4 j4Var) {
            int i10 = a.f92326a[ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? j4Var.o() : j4Var.l() : j4Var.n() : j4Var.m();
        }
    }

    enum l {
        DISPLAY_BANNER,
        ADD_BANNER_TO_VIEW,
        REMOVE_BANNER
    }

    private j4(long j10, boolean z10, Activity activity, m4 m4Var, j1 j1Var, x xVar) {
        this.f92317f = j10;
        this.f92316e = z10;
        this.f92319h = activity;
        this.f92314c = m4Var;
        if (m4Var != null) {
            this.f92318g = m4Var.b();
        }
        this.f92313b = j1Var == null ? j1.f92268f : j1Var;
        this.f92312a = null;
        this.f92323l = xVar;
        this.f92315d = new i1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        ViewGroup viewGroup;
        if (!x() || (viewGroup = (ViewGroup) r().getParent()) == null) {
            return;
        }
        viewGroup.removeView(r());
    }

    private Activity g() {
        return this.f92319h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j1 j() {
        return this.f92313b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation k() {
        if (this.f92321j == null && this.f92319h != null) {
            z();
            this.f92321j = this.f92313b.f92270b == j1.c.BOTTOM ? this.f92315d.d(r()) : this.f92315d.c(r());
        }
        return this.f92321j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation l() {
        if (this.f92322k == null && this.f92319h != null) {
            this.f92322k = this.f92315d.e(r());
        }
        return this.f92322k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation m() {
        if (this.f92319h != null) {
            this.f92322k = this.f92315d.f(r());
        }
        return this.f92322k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation n() {
        if (this.f92319h != null) {
            this.f92322k = this.f92315d.g(r());
        }
        return this.f92322k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation o() {
        if (this.f92322k == null && this.f92319h != null) {
            this.f92322k = this.f92315d.h(r());
        }
        return this.f92322k;
    }

    private boolean v() {
        m4 m4Var = this.f92314c;
        return (m4Var == null || m4Var.getParent() == null) ? false : true;
    }

    private void z() {
        m4 m4VarR = r();
        View decorView = this.f92320i;
        if (decorView == null) {
            decorView = this.f92319h.getWindow().getDecorView();
        }
        m4VarR.measure(View.MeasureSpec.makeMeasureSpec(decorView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    void B() {
        f();
    }

    long i() {
        return this.f92317f;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
    }

    e3.c p() {
        if (r() == null) {
            return null;
        }
        if (r().c()) {
            return e3.c.StickyByConfiguration;
        }
        if (w()) {
            return e3.c.StickyByGesture;
        }
        if (r().c()) {
            return null;
        }
        return e3.c.No;
    }

    CharSequence q() {
        return this.f92312a;
    }

    m4 r() {
        return this.f92314c;
    }

    ViewGroup s() {
        return this.f92320i;
    }

    void t() {
        a(j().f92270b == j1.c.BOTTOM ? k.DOWN : k.UP);
    }

    public String toString() {
        return "Banner{text=" + ((Object) this.f92312a) + ", configuration=" + this.f92313b + ", customView=" + this.f92314c + ", activity=" + this.f92319h + ", viewGroup=" + this.f92320i + ", inAnimation=" + this.f92321j + ", outAnimation=" + this.f92322k + ", bannerCallbacks=" + this.f92323l + '}';
    }

    boolean u() {
        return this.f92318g;
    }

    boolean w() {
        return this.f92316e;
    }

    boolean x() {
        return this.f92319h != null && v();
    }

    boolean y() {
        if (r() == null) {
            return false;
        }
        r().d();
        return false;
    }

    private void c() {
        this.f92319h = null;
    }

    private void d() {
        this.f92323l = null;
    }

    private void e() {
        this.f92320i = null;
    }

    private void f() {
        if (g() == null || r() == null || x()) {
            return;
        }
        x xVarH = h();
        if (r().b() && r().e() != null) {
            r().e().setOnClickListener(new c(xVarH));
        }
        if (r().b() && r().f() != null) {
            r().f().setOnClickListener(new d(xVarH));
        }
        this.f92325n = new e(j(), !r().b(), this.f92314c, xVarH);
        r().setOnTouchListener(this.f92325n);
        a(l.ADD_BANNER_TO_VIEW);
        if (h() != null) {
            h().a();
        }
    }

    private x h() {
        return this.f92323l;
    }

    protected void b() {
        try {
            Activity activityG = g();
            if (activityG == null) {
                activityG = (Activity) i4.c().d().getBaseContext();
            }
            activityG.runOnUiThread(new b());
            Handler handler = this.f92324m;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f92324m = null;
            }
            this.f92323l = null;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    static j4 a(long j10, boolean z10, Activity activity, m4 m4Var, j1 j1Var, x xVar) {
        return new j4(j10, z10, activity, m4Var, j1Var, xVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() {
        /*
            r7 = this;
            boolean r0 = r7.x()
            if (r0 == 0) goto L8
            goto L82
        L8:
            com.medallia.digital.mobilesdk.m4 r0 = r7.r()
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L71
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            if (r1 != 0) goto L21
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
        L21:
            android.app.Activity r2 = r7.g()
            if (r2 == 0) goto L82
            boolean r3 = r2.isFinishing()
            if (r3 == 0) goto L2e
            goto L82
        L2e:
            com.medallia.digital.mobilesdk.j1 r3 = r7.j()
            com.medallia.digital.mobilesdk.j1$c r3 = r3.f92270b
            com.medallia.digital.mobilesdk.j1$c r4 = com.medallia.digital.mobilesdk.j1.c.TOP
            if (r3 != r4) goto L3d
            r3 = 48
        L3a:
            r1.gravity = r3
            goto L4a
        L3d:
            com.medallia.digital.mobilesdk.j1 r3 = r7.j()
            com.medallia.digital.mobilesdk.j1$c r3 = r3.f92270b
            com.medallia.digital.mobilesdk.j1$c r4 = com.medallia.digital.mobilesdk.j1.c.BOTTOM
            if (r3 != r4) goto L4a
            r3 = 80
            goto L3a
        L4a:
            android.view.Window r3 = r2.getWindow()
            if (r3 == 0) goto L71
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            com.medallia.digital.mobilesdk.j4$g r4 = new com.medallia.digital.mobilesdk.j4$g
            r4.<init>(r0)
            r5 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r4, r5)
            android.view.Window r3 = r2.getWindow()
            r7.a(r3, r0)
            android.view.Window r2 = r2.getWindow()
            r2.addContentView(r0, r1)
        L71:
            r0.requestLayout()
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L82
            com.medallia.digital.mobilesdk.j4$h r2 = new com.medallia.digital.mobilesdk.j4$h
            r2.<init>(r0)
            r1.addOnGlobalLayoutListener(r2)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.j4.a():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        Handler handler = new Handler();
        this.f92324m = handler;
        handler.postDelayed(new f(), j10);
    }

    protected static void a(Activity activity, m4 m4Var, j1 j1Var, x xVar) {
        a(0L, false, activity, m4Var, j1Var, xVar).B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, androidx.core.view.j jVar, boolean z10) {
        String str;
        try {
            Rect rect = new Rect(0, 0, 0, 0);
            c2.d dVarF = jVar.f(j.n.i());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (z10) {
                Activity activity = this.f92319h;
                if (activity != null && activity.getWindow() != null) {
                    if (v6.b(this.f92319h.getWindow())) {
                        rect.top = dVarF.f61363b;
                        a4.b("insetsMarginState updated with top margin API < 30");
                    }
                    if (v6.a(this.f92319h.getWindow())) {
                        rect.bottom = dVarF.f61365d;
                        rect.left = dVarF.f61362a;
                        rect.right = dVarF.f61364c;
                        str = "insetsMarginState updated with bottom, right, left margins API < 30";
                    }
                }
                marginLayoutParams.topMargin = rect.top;
                marginLayoutParams.bottomMargin = rect.bottom;
                marginLayoutParams.leftMargin = rect.left;
                marginLayoutParams.rightMargin = rect.right;
                view.setLayoutParams(marginLayoutParams);
                a4.b("banner view marginParams was updated");
                this.f92325n.a(rect);
            }
            rect.top = dVarF.f61363b;
            rect.bottom = dVarF.f61365d;
            rect.left = dVarF.f61362a;
            rect.right = dVarF.f61364c;
            str = "insetsMarginState updated with margins API >= 30";
            a4.b(str);
            marginLayoutParams.topMargin = rect.top;
            marginLayoutParams.bottomMargin = rect.bottom;
            marginLayoutParams.leftMargin = rect.left;
            marginLayoutParams.rightMargin = rect.right;
            view.setLayoutParams(marginLayoutParams);
            a4.b("banner view marginParams was updated");
            this.f92325n.a(rect);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    private void a(Window window, View view) {
        String str;
        if (Build.VERSION.SDK_INT >= 30) {
            ViewCompat.A0(view, new i(view));
            str = "Adding insets listener to API >= 30";
        } else {
            ViewCompat.A0(window.getDecorView(), new j(view));
            str = "Adding insets listener to API < 30";
        }
        a4.b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k kVar) {
        m4 m4VarR = r();
        if (m4VarR == null) {
            return;
        }
        m4VarR.startAnimation(kVar.a(this));
        ViewGroup viewGroup = (ViewGroup) m4VarR.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(m4VarR);
        }
        c();
        e();
        d();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l lVar) {
        int i10 = a.f92327b[lVar.ordinal()];
        if (i10 == 1) {
            f();
            return;
        }
        if (i10 == 2) {
            a();
        } else {
            if (i10 != 3) {
                return;
            }
            if (h() != null) {
                h().b(new e3(p(), e3.b.timeoutPassed, r().b()));
            }
            a(j().f92270b == j1.c.BOTTOM ? k.DOWN : k.UP);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x xVar) {
        if (xVar != null) {
            xVar.c(new e3(p(), r().b()));
        }
        a(j().f92270b == j1.c.BOTTOM ? k.DOWN : k.UP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x xVar, e3 e3Var) {
        if (xVar != null) {
            xVar.a(e3Var);
        }
        a(j().f92270b == j1.c.BOTTOM ? k.DOWN : k.UP);
    }
}
