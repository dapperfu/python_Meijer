package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final EH0 f77886a = new EH0();

    /* renamed from: b, reason: collision with root package name */
    private final C9022p f77887b;

    /* renamed from: c, reason: collision with root package name */
    private final ChoreographerFrameCallbackC9129q f77888c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f77889d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f77890e;

    /* renamed from: f, reason: collision with root package name */
    private float f77891f;

    /* renamed from: g, reason: collision with root package name */
    private float f77892g;

    /* renamed from: h, reason: collision with root package name */
    private float f77893h;

    /* renamed from: i, reason: collision with root package name */
    private float f77894i;

    /* renamed from: j, reason: collision with root package name */
    private int f77895j;

    /* renamed from: k, reason: collision with root package name */
    private long f77896k;

    /* renamed from: l, reason: collision with root package name */
    private long f77897l;

    /* renamed from: m, reason: collision with root package name */
    private long f77898m;

    /* renamed from: n, reason: collision with root package name */
    private long f77899n;

    /* renamed from: o, reason: collision with root package name */
    private long f77900o;

    /* renamed from: p, reason: collision with root package name */
    private long f77901p;

    /* renamed from: q, reason: collision with root package name */
    private long f77902q;

    private final void l() {
        this.f77898m = 0L;
        this.f77901p = -1L;
        this.f77899n = -1L;
    }

    public final void g() {
        this.f77889d = true;
        l();
        if (this.f77887b != null) {
            ChoreographerFrameCallbackC9129q choreographerFrameCallbackC9129q = this.f77888c;
            choreographerFrameCallbackC9129q.getClass();
            choreographerFrameCallbackC9129q.b();
            this.f77887b.a();
        }
        n(false);
    }

    public final void h() {
        this.f77889d = false;
        C9022p c9022p = this.f77887b;
        if (c9022p != null) {
            c9022p.b();
            ChoreographerFrameCallbackC9129q choreographerFrameCallbackC9129q = this.f77888c;
            choreographerFrameCallbackC9129q.getClass();
            choreographerFrameCallbackC9129q.c();
        }
        k();
    }

    static /* bridge */ /* synthetic */ void b(r rVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            rVar.f77896k = refreshRate;
            rVar.f77897l = (refreshRate * 80) / 100;
        } else {
            C9917xL.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            rVar.f77896k = -9223372036854775807L;
            rVar.f77897l = -9223372036854775807L;
        }
    }

    private final void k() {
        Surface surface;
        if (OV.f69091a < 30 || (surface = this.f77890e) == null || this.f77895j == Integer.MIN_VALUE || this.f77893h == 0.0f) {
            return;
        }
        this.f77893h = 0.0f;
        C8915o.a(surface, 0.0f);
    }

    private final void m() {
        if (OV.f69091a < 30 || this.f77890e == null) {
            return;
        }
        float fA = this.f77886a.g() ? this.f77886a.a() : this.f77891f;
        float f10 = this.f77892g;
        if (fA != f10) {
            if (fA != -1.0f && f10 != -1.0f) {
                float f11 = 1.0f;
                if (this.f77886a.g() && this.f77886a.d() >= 5000000000L) {
                    f11 = 0.02f;
                }
                if (Math.abs(fA - this.f77892g) < f11) {
                    return;
                }
            } else if (fA == -1.0f && this.f77886a.b() < 30) {
                return;
            }
            this.f77892g = fA;
            n(false);
        }
    }

    private final void n(boolean z10) {
        Surface surface;
        if (OV.f69091a < 30 || (surface = this.f77890e) == null || this.f77895j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f77889d) {
            float f11 = this.f77892g;
            if (f11 != -1.0f) {
                f10 = this.f77894i * f11;
            }
        }
        if (z10 || this.f77893h != f10) {
            this.f77893h = f10;
            C8915o.a(surface, f10);
        }
    }

    public final long a(long j10) {
        long j11;
        if (this.f77901p != -1 && this.f77886a.g()) {
            long jC = this.f77886a.c();
            long j12 = this.f77902q + ((long) ((jC * (this.f77898m - this.f77901p)) / this.f77894i));
            if (Math.abs(j10 - j12) > 20000000) {
                l();
            } else {
                j10 = j12;
            }
        }
        this.f77899n = this.f77898m;
        this.f77900o = j10;
        ChoreographerFrameCallbackC9129q choreographerFrameCallbackC9129q = this.f77888c;
        if (choreographerFrameCallbackC9129q != null && this.f77896k != -9223372036854775807L) {
            long j13 = choreographerFrameCallbackC9129q.f77683a;
            if (j13 != -9223372036854775807L) {
                long j14 = this.f77896k;
                long j15 = j13 + (((j10 - j13) / j14) * j14);
                if (j10 <= j15) {
                    j11 = j15 - j14;
                } else {
                    long j16 = j14 + j15;
                    j11 = j15;
                    j15 = j16;
                }
                long j17 = this.f77897l;
                if (j15 - j10 >= j10 - j11) {
                    j15 = j11;
                }
                return j15 - j17;
            }
        }
        return j10;
    }

    public final void c(float f10) {
        this.f77891f = f10;
        this.f77886a.f();
        m();
    }

    public final void d(long j10) {
        long j11 = this.f77899n;
        if (j11 != -1) {
            this.f77901p = j11;
            this.f77902q = this.f77900o;
        }
        this.f77898m++;
        this.f77886a.e(j10 * 1000);
        m();
    }

    public final void e(float f10) {
        this.f77894i = f10;
        l();
        n(false);
    }

    public final void i(Surface surface) {
        if (this.f77890e == surface) {
            return;
        }
        k();
        this.f77890e = surface;
        n(true);
    }

    public final void j(int i10) {
        if (this.f77895j == i10) {
            return;
        }
        this.f77895j = i10;
        n(true);
    }

    public r(Context context) {
        DisplayManager displayManager;
        C9022p c9022p;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            c9022p = null;
        } else {
            c9022p = new C9022p(this, displayManager);
        }
        this.f77887b = c9022p;
        this.f77888c = c9022p != null ? ChoreographerFrameCallbackC9129q.a() : null;
        this.f77896k = -9223372036854775807L;
        this.f77897l = -9223372036854775807L;
        this.f77891f = -1.0f;
        this.f77894i = 1.0f;
        this.f77895j = 0;
    }

    public final void f() {
        l();
    }
}
