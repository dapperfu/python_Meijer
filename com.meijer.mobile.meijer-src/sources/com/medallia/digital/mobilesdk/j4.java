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

/* loaded from: classes8.dex */
final class j4 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: o, reason: collision with root package name */
    private static final long f93150o = 300;

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f93151a;

    /* renamed from: b, reason: collision with root package name */
    private final j1 f93152b;

    /* renamed from: c, reason: collision with root package name */
    private final m4 f93153c;

    /* renamed from: d, reason: collision with root package name */
    private final i1 f93154d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f93155e;

    /* renamed from: f, reason: collision with root package name */
    private long f93156f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f93157g;

    /* renamed from: h, reason: collision with root package name */
    private Activity f93158h;

    /* renamed from: i, reason: collision with root package name */
    private ViewGroup f93159i = null;

    /* renamed from: j, reason: collision with root package name */
    private Animation f93160j;

    /* renamed from: k, reason: collision with root package name */
    private Animation f93161k;

    /* renamed from: l, reason: collision with root package name */
    private x f93162l;

    /* renamed from: m, reason: collision with root package name */
    private Handler f93163m;

    /* renamed from: n, reason: collision with root package name */
    private y f93164n;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f93165a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f93166b;

        static {
            int[] iArr = new int[l.values().length];
            f93166b = iArr;
            try {
                iArr[l.DISPLAY_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93166b[l.ADD_BANNER_TO_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93166b[l.REMOVE_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[k.values().length];
            f93165a = iArr2;
            try {
                iArr2[k.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93165a[k.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93165a[k.DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93165a[k.UP.ordinal()] = 4;
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
        final /* synthetic */ x f93168a;

        c(x xVar) {
            this.f93168a = xVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j4 j4Var = j4.this;
            j4Var.a(this.f93168a, new e3(j4Var.p(), e3.a.buttonClicked, j4.this.r().b()));
        }
    }

    class d implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f93170a;

        d(x xVar) {
            this.f93170a = xVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j4.this.a(this.f93170a);
        }
    }

    class e extends y {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ x f93172q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j1 j1Var, boolean z10, m4 m4Var, x xVar) {
            super(j1Var, z10, m4Var);
            this.f93172q = xVar;
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void c() {
            j4.this.a(this.f93172q);
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void d() {
            j4.this.f93155e = true;
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void e() {
            if (j4.this.j().f93109b == j1.c.BOTTOM) {
                x xVar = this.f93172q;
                if (xVar != null) {
                    xVar.a(new e3(j4.this.p(), e3.a.swipeDown, j4.this.r().b()));
                }
                j4.this.a(k.DOWN);
            }
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void f() {
            x xVar = this.f93172q;
            if (xVar != null) {
                xVar.a(new e3(j4.this.p(), e3.a.swipeLeft, j4.this.r().b()));
            }
            j4.this.a(k.LEFT);
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void g() {
            x xVar = this.f93172q;
            if (xVar != null) {
                xVar.a(new e3(j4.this.p(), e3.a.swipeRight, j4.this.r().b()));
            }
            j4.this.a(k.RIGHT);
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void h() {
            if (j4.this.j().f93109b == j1.c.TOP) {
                x xVar = this.f93172q;
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
            if (j4.this.f93155e) {
                return;
            }
            j4.this.a(l.REMOVE_BANNER);
        }
    }

    class g extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f93175a;

        g(View view) {
            this.f93175a = view;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f93175a.performAccessibilityAction(64, null);
        }
    }

    class h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f93177a;

        h(View view) {
            this.f93177a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            long duration;
            this.f93177a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (j4.this.k() != null) {
                long jCurrentTimeMillis = 0;
                if (j4.this.f93156f == 0) {
                    this.f93177a.startAnimation(j4.this.k());
                    duration = j4.this.k().getDuration();
                } else {
                    duration = 0;
                }
                if (-1 != j4.this.j().f93108a) {
                    if (j4.this.f93156f == 0) {
                        j4.this.f93156f = System.currentTimeMillis();
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis() - j4.this.f93156f;
                    }
                    if (j4.this.r().c()) {
                        return;
                    }
                    j4 j4Var = j4.this;
                    j4Var.a((j4Var.j().f93108a - jCurrentTimeMillis) + duration);
                }
            }
        }
    }

    class i implements p2.G {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f93179a;

        i(View view) {
            this.f93179a = view;
        }

        @Override // p2.G
        public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) {
            j4.this.a(this.f93179a, jVar, false);
            return androidx.core.view.j.f54193b;
        }
    }

    class j implements p2.G {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f93181a;

        j(View view) {
            this.f93181a = view;
        }

        @Override // p2.G
        public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) {
            j4.this.a(this.f93181a, jVar, true);
            return ViewCompat.Z(view, jVar);
        }
    }

    enum k {
        UP,
        LEFT,
        RIGHT,
        DOWN;

        protected Animation a(j4 j4Var) {
            int i10 = a.f93165a[ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? j4Var.o() : j4Var.l() : j4Var.n() : j4Var.m();
        }
    }

    enum l {
        DISPLAY_BANNER,
        ADD_BANNER_TO_VIEW,
        REMOVE_BANNER
    }

    private j4(long j10, boolean z10, Activity activity, m4 m4Var, j1 j1Var, x xVar) {
        this.f93156f = j10;
        this.f93155e = z10;
        this.f93158h = activity;
        this.f93153c = m4Var;
        if (m4Var != null) {
            this.f93157g = m4Var.b();
        }
        this.f93152b = j1Var == null ? j1.f93107f : j1Var;
        this.f93151a = null;
        this.f93162l = xVar;
        this.f93154d = new i1();
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
        return this.f93158h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j1 j() {
        return this.f93152b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation k() {
        if (this.f93160j == null && this.f93158h != null) {
            z();
            this.f93160j = this.f93152b.f93109b == j1.c.BOTTOM ? this.f93154d.d(r()) : this.f93154d.c(r());
        }
        return this.f93160j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation l() {
        if (this.f93161k == null && this.f93158h != null) {
            this.f93161k = this.f93154d.e(r());
        }
        return this.f93161k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation m() {
        if (this.f93158h != null) {
            this.f93161k = this.f93154d.f(r());
        }
        return this.f93161k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation n() {
        if (this.f93158h != null) {
            this.f93161k = this.f93154d.g(r());
        }
        return this.f93161k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation o() {
        if (this.f93161k == null && this.f93158h != null) {
            this.f93161k = this.f93154d.h(r());
        }
        return this.f93161k;
    }

    private boolean v() {
        m4 m4Var = this.f93153c;
        return (m4Var == null || m4Var.getParent() == null) ? false : true;
    }

    private void z() {
        m4 m4VarR = r();
        View decorView = this.f93159i;
        if (decorView == null) {
            decorView = this.f93158h.getWindow().getDecorView();
        }
        m4VarR.measure(View.MeasureSpec.makeMeasureSpec(decorView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    void B() {
        f();
    }

    long i() {
        return this.f93156f;
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
        return this.f93151a;
    }

    m4 r() {
        return this.f93153c;
    }

    ViewGroup s() {
        return this.f93159i;
    }

    void t() {
        a(j().f93109b == j1.c.BOTTOM ? k.DOWN : k.UP);
    }

    public String toString() {
        return "Banner{text=" + ((Object) this.f93151a) + ", configuration=" + this.f93152b + ", customView=" + this.f93153c + ", activity=" + this.f93158h + ", viewGroup=" + this.f93159i + ", inAnimation=" + this.f93160j + ", outAnimation=" + this.f93161k + ", bannerCallbacks=" + this.f93162l + '}';
    }

    boolean u() {
        return this.f93157g;
    }

    boolean w() {
        return this.f93155e;
    }

    boolean x() {
        return this.f93158h != null && v();
    }

    boolean y() {
        if (r() == null) {
            return false;
        }
        r().d();
        return false;
    }

    private void c() {
        this.f93158h = null;
    }

    private void d() {
        this.f93162l = null;
    }

    private void e() {
        this.f93159i = null;
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
        this.f93164n = new e(j(), !r().b(), this.f93153c, xVarH);
        r().setOnTouchListener(this.f93164n);
        a(l.ADD_BANNER_TO_VIEW);
        if (h() != null) {
            h().a();
        }
    }

    private x h() {
        return this.f93162l;
    }

    protected void b() {
        try {
            Activity activityG = g();
            if (activityG == null) {
                activityG = (Activity) i4.c().d().getBaseContext();
            }
            activityG.runOnUiThread(new b());
            Handler handler = this.f93163m;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f93163m = null;
            }
            this.f93162l = null;
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
            com.medallia.digital.mobilesdk.j1$c r3 = r3.f93109b
            com.medallia.digital.mobilesdk.j1$c r4 = com.medallia.digital.mobilesdk.j1.c.TOP
            if (r3 != r4) goto L3d
            r3 = 48
        L3a:
            r1.gravity = r3
            goto L4a
        L3d:
            com.medallia.digital.mobilesdk.j1 r3 = r7.j()
            com.medallia.digital.mobilesdk.j1$c r3 = r3.f93109b
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
        this.f93163m = handler;
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
                Activity activity = this.f93158h;
                if (activity != null && activity.getWindow() != null) {
                    if (v6.b(this.f93158h.getWindow())) {
                        rect.top = dVarF.f61162b;
                        a4.b("insetsMarginState updated with top margin API < 30");
                    }
                    if (v6.a(this.f93158h.getWindow())) {
                        rect.bottom = dVarF.f61164d;
                        rect.left = dVarF.f61161a;
                        rect.right = dVarF.f61163c;
                        str = "insetsMarginState updated with bottom, right, left margins API < 30";
                    }
                }
                marginLayoutParams.topMargin = rect.top;
                marginLayoutParams.bottomMargin = rect.bottom;
                marginLayoutParams.leftMargin = rect.left;
                marginLayoutParams.rightMargin = rect.right;
                view.setLayoutParams(marginLayoutParams);
                a4.b("banner view marginParams was updated");
                this.f93164n.a(rect);
            }
            rect.top = dVarF.f61162b;
            rect.bottom = dVarF.f61164d;
            rect.left = dVarF.f61161a;
            rect.right = dVarF.f61163c;
            str = "insetsMarginState updated with margins API >= 30";
            a4.b(str);
            marginLayoutParams.topMargin = rect.top;
            marginLayoutParams.bottomMargin = rect.bottom;
            marginLayoutParams.leftMargin = rect.left;
            marginLayoutParams.rightMargin = rect.right;
            view.setLayoutParams(marginLayoutParams);
            a4.b("banner view marginParams was updated");
            this.f93164n.a(rect);
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
        int i10 = a.f93166b[lVar.ordinal()];
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
            a(j().f93109b == j1.c.BOTTOM ? k.DOWN : k.UP);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x xVar) {
        if (xVar != null) {
            xVar.c(new e3(p(), r().b()));
        }
        a(j().f93109b == j1.c.BOTTOM ? k.DOWN : k.UP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x xVar, e3 e3Var) {
        if (xVar != null) {
            xVar.a(e3Var);
        }
        a(j().f93109b == j1.c.BOTTOM ? k.DOWN : k.UP);
    }
}
