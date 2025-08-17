package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import gd.C14248g;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class Z80 implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f72076j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private static final Object f72077k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private static final Object f72078l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static Boolean f72079m;

    /* renamed from: a, reason: collision with root package name */
    private final Context f72080a;

    /* renamed from: b, reason: collision with root package name */
    private final Qc.a f72081b;

    /* renamed from: e, reason: collision with root package name */
    private int f72084e;

    /* renamed from: f, reason: collision with root package name */
    private final C8209hM f72085f;

    /* renamed from: g, reason: collision with root package name */
    private final List f72086g;

    /* renamed from: i, reason: collision with root package name */
    private final C6702Eo f72088i;

    /* renamed from: c, reason: collision with root package name */
    private final C7867e90 f72082c = C8295i90.c0();

    /* renamed from: d, reason: collision with root package name */
    private String f72083d = "";

    /* renamed from: h, reason: collision with root package name */
    private boolean f72087h = false;

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (f72076j) {
            try {
                if (f72079m == null) {
                    if (((Boolean) C8021fg.f74135b.e()).booleanValue()) {
                        f72079m = Boolean.valueOf(Math.random() < ((Double) C8021fg.f74134a.e()).doubleValue());
                    } else {
                        f72079m = Boolean.FALSE;
                    }
                }
                zBooleanValue = f72079m.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public final void b(final P80 p80) {
        C6908Kq.f68174a.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.Y80
            @Override // java.lang.Runnable
            public final void run() {
                this.f71496a.c(p80);
            }
        });
    }

    final /* synthetic */ void c(P80 p80) {
        synchronized (f72078l) {
            try {
                if (!this.f72087h) {
                    this.f72087h = true;
                    if (a()) {
                        try {
                            Lc.v.t();
                            this.f72083d = Pc.D0.V(this.f72080a);
                        } catch (RemoteException | RuntimeException e10) {
                            Lc.v.s().x(e10, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.f72084e = C14248g.f().a(this.f72080a);
                        int iIntValue = ((Integer) Mc.A.c().a(C8659lf.f75965F8)).intValue();
                        if (((Boolean) Mc.A.c().a(C8659lf.f76052Lb)).booleanValue()) {
                            long j10 = iIntValue;
                            C6908Kq.f68177d.scheduleWithFixedDelay(this, j10, j10, TimeUnit.MILLISECONDS);
                        } else {
                            long j11 = iIntValue;
                            C6908Kq.f68177d.scheduleAtFixedRate(this, j11, j11, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (a() && p80 != null) {
            synchronized (f72077k) {
                try {
                    if (this.f72082c.u() >= ((Integer) Mc.A.c().a(C8659lf.f75979G8)).intValue()) {
                        return;
                    }
                    C7441a90 c7441a90B0 = C7761d90.b0();
                    c7441a90B0.R(p80.m());
                    c7441a90B0.N(p80.l());
                    c7441a90B0.D(p80.b());
                    c7441a90B0.U(3);
                    c7441a90B0.K(this.f72081b.f29929a);
                    c7441a90B0.v(this.f72083d);
                    c7441a90B0.H(Build.VERSION.RELEASE);
                    c7441a90B0.O(Build.VERSION.SDK_INT);
                    c7441a90B0.S(p80.o());
                    c7441a90B0.G(p80.a());
                    c7441a90B0.y(this.f72084e);
                    c7441a90B0.Q(p80.n());
                    c7441a90B0.w(p80.e());
                    c7441a90B0.z(p80.g());
                    c7441a90B0.E(p80.h());
                    c7441a90B0.F(this.f72085f.b(p80.h()));
                    c7441a90B0.I(p80.i());
                    c7441a90B0.J(p80.d());
                    c7441a90B0.x(p80.f());
                    c7441a90B0.P(p80.k());
                    c7441a90B0.L(p80.j());
                    c7441a90B0.M(p80.c());
                    if (((Boolean) Mc.A.c().a(C8659lf.f76035K8)).booleanValue()) {
                        c7441a90B0.u(this.f72086g);
                    }
                    C7867e90 c7867e90 = this.f72082c;
                    C7974f90 c7974f90B0 = C8081g90.b0();
                    c7974f90B0.u(c7441a90B0);
                    c7867e90.v(c7974f90B0);
                } finally {
                }
            }
        }
    }

    public Z80(Context context, Qc.a aVar, C8209hM c8209hM, C9923xR c9923xR, C6702Eo c6702Eo) {
        this.f72080a = context;
        this.f72081b = aVar;
        this.f72085f = c8209hM;
        this.f72088i = c6702Eo;
        if (((Boolean) Mc.A.c().a(C8659lf.f76035K8)).booleanValue()) {
            this.f72086g = Pc.D0.I();
        } else {
            this.f72086g = AbstractC7917eh0.t();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrJ;
        if (a()) {
            Object obj = f72077k;
            synchronized (obj) {
                try {
                    if (this.f72082c.u() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            bArrJ = ((C8295i90) this.f72082c.p()).j();
                            this.f72082c.w();
                        }
                        new C9816wR(this.f72080a, this.f72081b.f29929a, this.f72088i, Binder.getCallingUid()).zza(new C9602uR((String) Mc.A.c().a(C8659lf.f75951E8), 60000, new HashMap(), bArrJ, "application/x-protobuf", false));
                    } catch (Exception e10) {
                        if ((e10 instanceof zzdvy) && ((zzdvy) e10).a() == 3) {
                            return;
                        }
                        Lc.v.s().w(e10, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
