package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes6.dex */
public final class D9 implements G9 {

    /* renamed from: r, reason: collision with root package name */
    private static D9 f66160r;

    /* renamed from: a, reason: collision with root package name */
    private final Context f66161a;

    /* renamed from: b, reason: collision with root package name */
    private final C7126Rc0 f66162b;

    /* renamed from: c, reason: collision with root package name */
    private final C7360Yc0 f66163c;

    /* renamed from: d, reason: collision with root package name */
    private final C7393Zc0 f66164d;

    /* renamed from: e, reason: collision with root package name */
    private final C8116ga f66165e;

    /* renamed from: f, reason: collision with root package name */
    private final C7694cc0 f66166f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f66167g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC7327Xc0 f66168h;

    /* renamed from: j, reason: collision with root package name */
    private final C9825wa f66170j;

    /* renamed from: k, reason: collision with root package name */
    private final C8970oa f66171k;

    /* renamed from: l, reason: collision with root package name */
    private final C7902ea f66172l;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f66175o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f66176p;

    /* renamed from: q, reason: collision with root package name */
    private final int f66177q;

    /* renamed from: m, reason: collision with root package name */
    volatile long f66173m = 0;

    /* renamed from: n, reason: collision with root package name */
    private final Object f66174n = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final CountDownLatch f66169i = new CountDownLatch(1);

    D9(Context context, C7694cc0 c7694cc0, C7126Rc0 c7126Rc0, C7360Yc0 c7360Yc0, C7393Zc0 c7393Zc0, C8116ga c8116ga, Executor executor, C7325Xb0 c7325Xb0, int i10, C9825wa c9825wa, C8970oa c8970oa, C7902ea c7902ea) {
        this.f66176p = false;
        this.f66161a = context;
        this.f66166f = c7694cc0;
        this.f66162b = c7126Rc0;
        this.f66163c = c7360Yc0;
        this.f66164d = c7393Zc0;
        this.f66165e = c8116ga;
        this.f66167g = executor;
        this.f66177q = i10;
        this.f66170j = c9825wa;
        this.f66171k = c8970oa;
        this.f66172l = c7902ea;
        this.f66176p = false;
        this.f66168h = new B9(this, c7325Xb0);
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String b(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String d(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    final synchronized void j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C7092Qc0 c7092Qc0P = p(1);
        if (c7092Qc0P == null) {
            this.f66166f.d(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f66164d.c(c7092Qc0P)) {
            this.f66176p = true;
            this.f66169i.countDown();
        }
    }

    public final synchronized boolean m() {
        return this.f66176p;
    }

    public static synchronized D9 e(Context context, O7 o72, boolean z10) {
        AbstractC7801dc0 abstractC7801dc0C;
        abstractC7801dc0C = AbstractC7907ec0.c();
        abstractC7801dc0C.a(o72.f0());
        abstractC7801dc0C.g(o72.i0());
        return n(context, Executors.newCachedThreadPool(), abstractC7801dc0C.h(), z10);
    }

    private static synchronized D9 n(Context context, Executor executor, AbstractC7907ec0 abstractC7907ec0, boolean z10) {
        try {
            if (f66160r == null) {
                C7694cc0 c7694cc0A = C7694cc0.a(context, executor, z10);
                R9 r9C = ((Boolean) Mc.A.c().a(C8659lf.f76561w3)).booleanValue() ? R9.c(context) : null;
                C9825wa c9825waD = ((Boolean) Mc.A.c().a(C8659lf.f76575x3)).booleanValue() ? C9825wa.d(context, executor) : null;
                C8970oa c8970oa = ((Boolean) Mc.A.c().a(C8659lf.f76057M2)).booleanValue() ? new C8970oa() : null;
                C7902ea c7902ea = ((Boolean) Mc.A.c().a(C8659lf.f76155T2)).booleanValue() ? new C7902ea() : null;
                C9830wc0 c9830wc0E = C9830wc0.e(context, executor, c7694cc0A, abstractC7907ec0);
                C8009fa c8009fa = new C8009fa(context);
                C8116ga c8116ga = new C8116ga(abstractC7907ec0, c9830wc0E, new ViewOnAttachStateChangeListenerC9611ua(context, c8009fa), c8009fa, r9C, c9825waD, c8970oa, c7902ea);
                int iB = C6719Fc0.b(context, c7694cc0A);
                C7325Xb0 c7325Xb0 = new C7325Xb0();
                D9 d92 = new D9(context, c7694cc0A, new C7126Rc0(context, iB), new C7360Yc0(context, iB, new A9(c7694cc0A), ((Boolean) Mc.A.c().a(C8659lf.f76560w2)).booleanValue()), new C7393Zc0(context, c8116ga, c7694cc0A, c7325Xb0), c8116ga, executor, c7325Xb0, iB, c9825waD, c8970oa, c7902ea);
                f66160r = d92;
                d92.j();
                f66160r.k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f66160r;
    }

    private final void o() {
        C9825wa c9825wa = this.f66170j;
        if (c9825wa != null) {
            c9825wa.h();
        }
    }

    private final C7092Qc0 p(int i10) {
        if (C6719Fc0.a(this.f66177q)) {
            return ((Boolean) Mc.A.c().a(C8659lf.f76532u2)).booleanValue() ? this.f66163c.c(1) : this.f66162b.c(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void a(View view) {
        this.f66165e.a(view);
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void c(StackTraceElement[] stackTraceElementArr) {
        C7902ea c7902ea = this.f66172l;
        if (c7902ea != null) {
            c7902ea.b(Arrays.asList(stackTraceElementArr));
        }
    }

    public final void k() {
        if (this.f66175o) {
            return;
        }
        synchronized (this.f66174n) {
            try {
                if (!this.f66175o) {
                    if ((System.currentTimeMillis() / 1000) - this.f66173m < 3600) {
                        return;
                    }
                    C7092Qc0 c7092Qc0B = this.f66164d.b();
                    if ((c7092Qc0B == null || c7092Qc0B.d(3600L)) && C6719Fc0.a(this.f66177q)) {
                        this.f66167g.execute(new C9(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String zze(Context context, String str, View view, Activity activity) {
        o();
        if (((Boolean) Mc.A.c().a(C8659lf.f76057M2)).booleanValue()) {
            this.f66171k.i();
        }
        k();
        InterfaceC8014fc0 interfaceC8014fc0A = this.f66164d.a();
        if (interfaceC8014fc0A == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = interfaceC8014fc0A.zza(context, null, str, view, activity);
        this.f66166f.f(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void zzk(MotionEvent motionEvent) {
        InterfaceC8014fc0 interfaceC8014fc0A = this.f66164d.a();
        if (interfaceC8014fc0A != null) {
            try {
                interfaceC8014fc0A.zzd(null, motionEvent);
            } catch (zzfpf e10) {
                this.f66166f.c(e10.a(), -1L, e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void zzl(int i10, int i11, int i12) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) Mc.A.c().a(C8659lf.f76122Qb)).booleanValue() || (displayMetrics = this.f66161a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i10;
        float f11 = displayMetrics.density;
        float f12 = i11;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain);
        motionEventObtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain2);
        motionEventObtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i12, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[Catch: all -> 0x009d, zzgyg -> 0x00a0, TryCatch #0 {zzgyg -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:58:0x0021, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* bridge */ /* synthetic */ void i(com.google.android.gms.internal.ads.D9 r12) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.D9.i(com.google.android.gms.internal.ads.D9):void");
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String zzf(Context context) {
        o();
        if (((Boolean) Mc.A.c().a(C8659lf.f76057M2)).booleanValue()) {
            this.f66171k.j();
        }
        k();
        InterfaceC8014fc0 interfaceC8014fc0A = this.f66164d.a();
        if (interfaceC8014fc0A != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzc = interfaceC8014fc0A.zzc(context, null);
            this.f66166f.f(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
            return strZzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String zzh(Context context, View view, Activity activity) {
        o();
        if (((Boolean) Mc.A.c().a(C8659lf.f76057M2)).booleanValue()) {
            this.f66171k.k(context, view);
        }
        k();
        InterfaceC8014fc0 interfaceC8014fc0A = this.f66164d.a();
        if (interfaceC8014fc0A != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzb = interfaceC8014fc0A.zzb(context, null, view, activity);
            this.f66166f.f(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
            return strZzb;
        }
        return "";
    }
}
