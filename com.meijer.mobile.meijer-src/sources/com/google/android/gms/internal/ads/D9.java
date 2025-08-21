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
    private static D9 f67000r;

    /* renamed from: a, reason: collision with root package name */
    private final Context f67001a;

    /* renamed from: b, reason: collision with root package name */
    private final C7251Rc0 f67002b;

    /* renamed from: c, reason: collision with root package name */
    private final C7485Yc0 f67003c;

    /* renamed from: d, reason: collision with root package name */
    private final C7518Zc0 f67004d;

    /* renamed from: e, reason: collision with root package name */
    private final C8241ga f67005e;

    /* renamed from: f, reason: collision with root package name */
    private final C7819cc0 f67006f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f67007g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC7452Xc0 f67008h;

    /* renamed from: j, reason: collision with root package name */
    private final C9950wa f67010j;

    /* renamed from: k, reason: collision with root package name */
    private final C9095oa f67011k;

    /* renamed from: l, reason: collision with root package name */
    private final C8027ea f67012l;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f67015o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f67016p;

    /* renamed from: q, reason: collision with root package name */
    private final int f67017q;

    /* renamed from: m, reason: collision with root package name */
    volatile long f67013m = 0;

    /* renamed from: n, reason: collision with root package name */
    private final Object f67014n = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final CountDownLatch f67009i = new CountDownLatch(1);

    D9(Context context, C7819cc0 c7819cc0, C7251Rc0 c7251Rc0, C7485Yc0 c7485Yc0, C7518Zc0 c7518Zc0, C8241ga c8241ga, Executor executor, C7450Xb0 c7450Xb0, int i10, C9950wa c9950wa, C9095oa c9095oa, C8027ea c8027ea) {
        this.f67016p = false;
        this.f67001a = context;
        this.f67006f = c7819cc0;
        this.f67002b = c7251Rc0;
        this.f67003c = c7485Yc0;
        this.f67004d = c7518Zc0;
        this.f67005e = c8241ga;
        this.f67007g = executor;
        this.f67017q = i10;
        this.f67010j = c9950wa;
        this.f67011k = c9095oa;
        this.f67012l = c8027ea;
        this.f67016p = false;
        this.f67008h = new B9(this, c7450Xb0);
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
        C7217Qc0 c7217Qc0P = p(1);
        if (c7217Qc0P == null) {
            this.f67006f.d(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f67004d.c(c7217Qc0P)) {
            this.f67016p = true;
            this.f67009i.countDown();
        }
    }

    public final synchronized boolean m() {
        return this.f67016p;
    }

    public static synchronized D9 e(Context context, O7 o72, boolean z10) {
        AbstractC7926dc0 abstractC7926dc0C;
        abstractC7926dc0C = AbstractC8032ec0.c();
        abstractC7926dc0C.a(o72.f0());
        abstractC7926dc0C.g(o72.i0());
        return n(context, Executors.newCachedThreadPool(), abstractC7926dc0C.h(), z10);
    }

    private static synchronized D9 n(Context context, Executor executor, AbstractC8032ec0 abstractC8032ec0, boolean z10) {
        try {
            if (f67000r == null) {
                C7819cc0 c7819cc0A = C7819cc0.a(context, executor, z10);
                R9 r9C = ((Boolean) Oc.A.c().a(C8784lf.f77401w3)).booleanValue() ? R9.c(context) : null;
                C9950wa c9950waD = ((Boolean) Oc.A.c().a(C8784lf.f77415x3)).booleanValue() ? C9950wa.d(context, executor) : null;
                C9095oa c9095oa = ((Boolean) Oc.A.c().a(C8784lf.f76897M2)).booleanValue() ? new C9095oa() : null;
                C8027ea c8027ea = ((Boolean) Oc.A.c().a(C8784lf.f76995T2)).booleanValue() ? new C8027ea() : null;
                C9955wc0 c9955wc0E = C9955wc0.e(context, executor, c7819cc0A, abstractC8032ec0);
                C8134fa c8134fa = new C8134fa(context);
                C8241ga c8241ga = new C8241ga(abstractC8032ec0, c9955wc0E, new ViewOnAttachStateChangeListenerC9736ua(context, c8134fa), c8134fa, r9C, c9950waD, c9095oa, c8027ea);
                int iB = C6844Fc0.b(context, c7819cc0A);
                C7450Xb0 c7450Xb0 = new C7450Xb0();
                D9 d92 = new D9(context, c7819cc0A, new C7251Rc0(context, iB), new C7485Yc0(context, iB, new A9(c7819cc0A), ((Boolean) Oc.A.c().a(C8784lf.f77400w2)).booleanValue()), new C7518Zc0(context, c8241ga, c7819cc0A, c7450Xb0), c8241ga, executor, c7450Xb0, iB, c9950waD, c9095oa, c8027ea);
                f67000r = d92;
                d92.j();
                f67000r.k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f67000r;
    }

    private final void o() {
        C9950wa c9950wa = this.f67010j;
        if (c9950wa != null) {
            c9950wa.h();
        }
    }

    private final C7217Qc0 p(int i10) {
        if (C6844Fc0.a(this.f67017q)) {
            return ((Boolean) Oc.A.c().a(C8784lf.f77372u2)).booleanValue() ? this.f67003c.c(1) : this.f67002b.c(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void a(View view) {
        this.f67005e.a(view);
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void c(StackTraceElement[] stackTraceElementArr) {
        C8027ea c8027ea = this.f67012l;
        if (c8027ea != null) {
            c8027ea.b(Arrays.asList(stackTraceElementArr));
        }
    }

    public final void k() {
        if (this.f67015o) {
            return;
        }
        synchronized (this.f67014n) {
            try {
                if (!this.f67015o) {
                    if ((System.currentTimeMillis() / 1000) - this.f67013m < 3600) {
                        return;
                    }
                    C7217Qc0 c7217Qc0B = this.f67004d.b();
                    if ((c7217Qc0B == null || c7217Qc0B.d(3600L)) && C6844Fc0.a(this.f67017q)) {
                        this.f67007g.execute(new C9(this));
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
        if (((Boolean) Oc.A.c().a(C8784lf.f76897M2)).booleanValue()) {
            this.f67011k.i();
        }
        k();
        InterfaceC8139fc0 interfaceC8139fc0A = this.f67004d.a();
        if (interfaceC8139fc0A == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = interfaceC8139fc0A.zza(context, null, str, view, activity);
        this.f67006f.f(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void zzk(MotionEvent motionEvent) {
        InterfaceC8139fc0 interfaceC8139fc0A = this.f67004d.a();
        if (interfaceC8139fc0A != null) {
            try {
                interfaceC8139fc0A.zzd(null, motionEvent);
            } catch (zzfpf e10) {
                this.f67006f.c(e10.a(), -1L, e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void zzl(int i10, int i11, int i12) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) Oc.A.c().a(C8784lf.f76962Qb)).booleanValue() || (displayMetrics = this.f67001a.getResources().getDisplayMetrics()) == null) {
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
        if (((Boolean) Oc.A.c().a(C8784lf.f76897M2)).booleanValue()) {
            this.f67011k.j();
        }
        k();
        InterfaceC8139fc0 interfaceC8139fc0A = this.f67004d.a();
        if (interfaceC8139fc0A != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzc = interfaceC8139fc0A.zzc(context, null);
            this.f67006f.f(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
            return strZzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String zzh(Context context, View view, Activity activity) {
        o();
        if (((Boolean) Oc.A.c().a(C8784lf.f76897M2)).booleanValue()) {
            this.f67011k.k(context, view);
        }
        k();
        InterfaceC8139fc0 interfaceC8139fc0A = this.f67004d.a();
        if (interfaceC8139fc0A != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzb = interfaceC8139fc0A.zzb(context, null, view, activity);
            this.f67006f.f(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
            return strZzb;
        }
        return "";
    }
}
