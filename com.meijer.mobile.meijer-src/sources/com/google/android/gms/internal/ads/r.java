package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final EH0 f78726a = new EH0();

    /* renamed from: b, reason: collision with root package name */
    private final C9147p f78727b;

    /* renamed from: c, reason: collision with root package name */
    private final ChoreographerFrameCallbackC9254q f78728c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f78729d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f78730e;

    /* renamed from: f, reason: collision with root package name */
    private float f78731f;

    /* renamed from: g, reason: collision with root package name */
    private float f78732g;

    /* renamed from: h, reason: collision with root package name */
    private float f78733h;

    /* renamed from: i, reason: collision with root package name */
    private float f78734i;

    /* renamed from: j, reason: collision with root package name */
    private int f78735j;

    /* renamed from: k, reason: collision with root package name */
    private long f78736k;

    /* renamed from: l, reason: collision with root package name */
    private long f78737l;

    /* renamed from: m, reason: collision with root package name */
    private long f78738m;

    /* renamed from: n, reason: collision with root package name */
    private long f78739n;

    /* renamed from: o, reason: collision with root package name */
    private long f78740o;

    /* renamed from: p, reason: collision with root package name */
    private long f78741p;

    /* renamed from: q, reason: collision with root package name */
    private long f78742q;

    private final void l() {
        this.f78738m = 0L;
        this.f78741p = -1L;
        this.f78739n = -1L;
    }

    public final void g() {
        this.f78729d = true;
        l();
        if (this.f78727b != null) {
            ChoreographerFrameCallbackC9254q choreographerFrameCallbackC9254q = this.f78728c;
            choreographerFrameCallbackC9254q.getClass();
            choreographerFrameCallbackC9254q.b();
            this.f78727b.a();
        }
        n(false);
    }

    public final void h() {
        this.f78729d = false;
        C9147p c9147p = this.f78727b;
        if (c9147p != null) {
            c9147p.b();
            ChoreographerFrameCallbackC9254q choreographerFrameCallbackC9254q = this.f78728c;
            choreographerFrameCallbackC9254q.getClass();
            choreographerFrameCallbackC9254q.c();
        }
        k();
    }

    static /* bridge */ /* synthetic */ void b(r rVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            rVar.f78736k = refreshRate;
            rVar.f78737l = (refreshRate * 80) / 100;
        } else {
            C10042xL.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            rVar.f78736k = -9223372036854775807L;
            rVar.f78737l = -9223372036854775807L;
        }
    }

    private final void k() {
        Surface surface;
        if (OV.f69931a < 30 || (surface = this.f78730e) == null || this.f78735j == Integer.MIN_VALUE || this.f78733h == 0.0f) {
            return;
        }
        this.f78733h = 0.0f;
        C9040o.a(surface, 0.0f);
    }

    private final void m() {
        if (OV.f69931a < 30 || this.f78730e == null) {
            return;
        }
        float fA = this.f78726a.g() ? this.f78726a.a() : this.f78731f;
        float f10 = this.f78732g;
        if (fA != f10) {
            if (fA != -1.0f && f10 != -1.0f) {
                float f11 = 1.0f;
                if (this.f78726a.g() && this.f78726a.d() >= 5000000000L) {
                    f11 = 0.02f;
                }
                if (Math.abs(fA - this.f78732g) < f11) {
                    return;
                }
            } else if (fA == -1.0f && this.f78726a.b() < 30) {
                return;
            }
            this.f78732g = fA;
            n(false);
        }
    }

    private final void n(boolean z10) {
        Surface surface;
        if (OV.f69931a < 30 || (surface = this.f78730e) == null || this.f78735j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f78729d) {
            float f11 = this.f78732g;
            if (f11 != -1.0f) {
                f10 = this.f78734i * f11;
            }
        }
        if (z10 || this.f78733h != f10) {
            this.f78733h = f10;
            C9040o.a(surface, f10);
        }
    }

    public final long a(long j10) {
        long j11;
        if (this.f78741p != -1 && this.f78726a.g()) {
            long jC = this.f78726a.c();
            long j12 = this.f78742q + ((long) ((jC * (this.f78738m - this.f78741p)) / this.f78734i));
            if (Math.abs(j10 - j12) > 20000000) {
                l();
            } else {
                j10 = j12;
            }
        }
        this.f78739n = this.f78738m;
        this.f78740o = j10;
        ChoreographerFrameCallbackC9254q choreographerFrameCallbackC9254q = this.f78728c;
        if (choreographerFrameCallbackC9254q != null && this.f78736k != -9223372036854775807L) {
            long j13 = choreographerFrameCallbackC9254q.f78523a;
            if (j13 != -9223372036854775807L) {
                long j14 = this.f78736k;
                long j15 = j13 + (((j10 - j13) / j14) * j14);
                if (j10 <= j15) {
                    j11 = j15 - j14;
                } else {
                    long j16 = j14 + j15;
                    j11 = j15;
                    j15 = j16;
                }
                long j17 = this.f78737l;
                if (j15 - j10 >= j10 - j11) {
                    j15 = j11;
                }
                return j15 - j17;
            }
        }
        return j10;
    }

    public final void c(float f10) {
        this.f78731f = f10;
        this.f78726a.f();
        m();
    }

    public final void d(long j10) {
        long j11 = this.f78739n;
        if (j11 != -1) {
            this.f78741p = j11;
            this.f78742q = this.f78740o;
        }
        this.f78738m++;
        this.f78726a.e(j10 * 1000);
        m();
    }

    public final void e(float f10) {
        this.f78734i = f10;
        l();
        n(false);
    }

    public final void i(Surface surface) {
        if (this.f78730e == surface) {
            return;
        }
        k();
        this.f78730e = surface;
        n(true);
    }

    public final void j(int i10) {
        if (this.f78735j == i10) {
            return;
        }
        this.f78735j = i10;
        n(true);
    }

    public r(Context context) {
        DisplayManager displayManager;
        C9147p c9147p;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            c9147p = null;
        } else {
            c9147p = new C9147p(this, displayManager);
        }
        this.f78727b = c9147p;
        this.f78728c = c9147p != null ? ChoreographerFrameCallbackC9254q.a() : null;
        this.f78736k = -9223372036854775807L;
        this.f78737l = -9223372036854775807L;
        this.f78731f = -1.0f;
        this.f78734i = 1.0f;
        this.f78735j = 0;
    }

    public final void f() {
        l();
    }
}
