package v3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import d3.C13599a;
import d3.P;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final C17628a f165481a = new C17628a();

    /* renamed from: b, reason: collision with root package name */
    private final b f165482b;

    /* renamed from: c, reason: collision with root package name */
    private final c f165483c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f165484d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f165485e;

    /* renamed from: f, reason: collision with root package name */
    private float f165486f;

    /* renamed from: g, reason: collision with root package name */
    private float f165487g;

    /* renamed from: h, reason: collision with root package name */
    private float f165488h;

    /* renamed from: i, reason: collision with root package name */
    private float f165489i;

    /* renamed from: j, reason: collision with root package name */
    private int f165490j;

    /* renamed from: k, reason: collision with root package name */
    private long f165491k;

    /* renamed from: l, reason: collision with root package name */
    private long f165492l;

    /* renamed from: m, reason: collision with root package name */
    private long f165493m;

    /* renamed from: n, reason: collision with root package name */
    private long f165494n;

    /* renamed from: o, reason: collision with root package name */
    private long f165495o;

    /* renamed from: p, reason: collision with root package name */
    private long f165496p;

    /* renamed from: q, reason: collision with root package name */
    private long f165497q;

    private static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                d3.r.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    private final class b implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayManager f165498a;

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }

        public b(DisplayManager displayManager) {
            this.f165498a = displayManager;
        }

        private Display a() {
            return this.f165498a.getDisplay(0);
        }

        public void b() {
            this.f165498a.registerDisplayListener(this, P.z());
            j.this.p(a());
        }

        public void c() {
            this.f165498a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                j.this.p(a());
            }
        }
    }

    private static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f, reason: collision with root package name */
        private static final c f165500f = new c();

        /* renamed from: a, reason: collision with root package name */
        public volatile long f165501a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f165502b;

        /* renamed from: c, reason: collision with root package name */
        private final HandlerThread f165503c;

        /* renamed from: d, reason: collision with root package name */
        private Choreographer f165504d;

        /* renamed from: e, reason: collision with root package name */
        private int f165505e;

        private void b() {
            Choreographer choreographer = this.f165504d;
            if (choreographer != null) {
                int i10 = this.f165505e + 1;
                this.f165505e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        public static c d() {
            return f165500f;
        }

        private void f() {
            Choreographer choreographer = this.f165504d;
            if (choreographer != null) {
                int i10 = this.f165505e - 1;
                this.f165505e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f165501a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f165502b.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f165501a = j10;
            ((Choreographer) C13599a.e(this.f165504d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f165502b.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                c();
                return true;
            }
            if (i10 == 2) {
                b();
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            f();
            return true;
        }

        private c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f165503c = handlerThread;
            handlerThread.start();
            Handler handlerY = P.y(handlerThread.getLooper(), this);
            this.f165502b = handlerY;
            handlerY.sendEmptyMessage(1);
        }

        private void c() {
            try {
                this.f165504d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                d3.r.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    public void k() {
        this.f165484d = true;
        n();
        if (this.f165482b != null) {
            ((c) C13599a.e(this.f165483c)).a();
            this.f165482b.b();
        }
        r(false);
    }

    public void l() {
        this.f165484d = false;
        b bVar = this.f165482b;
        if (bVar != null) {
            bVar.c();
            ((c) C13599a.e(this.f165483c)).e();
        }
        d();
    }

    private void d() {
        Surface surface;
        if (P.f127888a < 30 || (surface = this.f165485e) == null || this.f165490j == Integer.MIN_VALUE || this.f165488h == 0.0f) {
            return;
        }
        this.f165488h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j12 + j14;
            j13 = j14;
            j14 = j15;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private void n() {
        this.f165493m = 0L;
        this.f165496p = -1L;
        this.f165494n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f165491k = refreshRate;
            this.f165492l = (refreshRate * 80) / 100;
        } else {
            d3.r.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f165491k = -9223372036854775807L;
            this.f165492l = -9223372036854775807L;
        }
    }

    private void q() {
        if (P.f127888a < 30 || this.f165485e == null) {
            return;
        }
        float fB = this.f165481a.e() ? this.f165481a.b() : this.f165486f;
        float f10 = this.f165487g;
        if (fB == f10) {
            return;
        }
        if (fB != -1.0f && f10 != -1.0f) {
            if (Math.abs(fB - this.f165487g) < ((!this.f165481a.e() || this.f165481a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f165481a.c() < 30) {
            return;
        }
        this.f165487g = fB;
        r(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r(boolean r4) {
        /*
            r3 = this;
            int r0 = d3.P.f127888a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f165485e
            if (r0 == 0) goto L30
            int r1 = r3.f165490j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f165484d
            if (r1 == 0) goto L21
            float r1 = r3.f165487g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f165489i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f165488h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            goto L30
        L2b:
            r3.f165488h = r1
            v3.j.a.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.j.r(boolean):void");
    }

    public long b(long j10) {
        long j11;
        if (this.f165496p == -1 || !this.f165481a.e()) {
            j11 = j10;
        } else {
            long jA = this.f165497q + ((long) ((this.f165481a.a() * (this.f165493m - this.f165496p)) / this.f165489i));
            if (c(j10, jA)) {
                j11 = jA;
            } else {
                n();
                j11 = j10;
            }
        }
        this.f165494n = this.f165493m;
        this.f165495o = j11;
        c cVar = this.f165483c;
        if (cVar != null && this.f165491k != -9223372036854775807L) {
            long j12 = cVar.f165501a;
            if (j12 != -9223372036854775807L) {
                return e(j11, j12, this.f165491k) - this.f165492l;
            }
        }
        return j11;
    }

    public void g(float f10) {
        this.f165486f = f10;
        this.f165481a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f165494n;
        if (j11 != -1) {
            this.f165496p = j11;
            this.f165497q = this.f165495o;
        }
        this.f165493m++;
        this.f165481a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f165489i = f10;
        n();
        r(false);
    }

    public void m(Surface surface) {
        if (this.f165485e == surface) {
            return;
        }
        d();
        this.f165485e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f165490j == i10) {
            return;
        }
        this.f165490j = i10;
        r(true);
    }

    public j(Context context) {
        c cVarD;
        b bVarF = f(context);
        this.f165482b = bVarF;
        if (bVarF != null) {
            cVarD = c.d();
        } else {
            cVarD = null;
        }
        this.f165483c = cVarD;
        this.f165491k = -9223372036854775807L;
        this.f165492l = -9223372036854775807L;
        this.f165486f = -1.0f;
        this.f165489i = 1.0f;
        this.f165490j = 0;
    }

    public void j() {
        n();
    }
}
