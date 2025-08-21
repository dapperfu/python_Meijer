package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import id.C14724g;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class Z80 implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f72916j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private static final Object f72917k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private static final Object f72918l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static Boolean f72919m;

    /* renamed from: a, reason: collision with root package name */
    private final Context f72920a;

    /* renamed from: b, reason: collision with root package name */
    private final Sc.a f72921b;

    /* renamed from: e, reason: collision with root package name */
    private int f72924e;

    /* renamed from: f, reason: collision with root package name */
    private final C8334hM f72925f;

    /* renamed from: g, reason: collision with root package name */
    private final List f72926g;

    /* renamed from: i, reason: collision with root package name */
    private final C6827Eo f72928i;

    /* renamed from: c, reason: collision with root package name */
    private final C7992e90 f72922c = C8420i90.c0();

    /* renamed from: d, reason: collision with root package name */
    private String f72923d = "";

    /* renamed from: h, reason: collision with root package name */
    private boolean f72927h = false;

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (f72916j) {
            try {
                if (f72919m == null) {
                    if (((Boolean) C8146fg.f74975b.e()).booleanValue()) {
                        f72919m = Boolean.valueOf(Math.random() < ((Double) C8146fg.f74974a.e()).doubleValue());
                    } else {
                        f72919m = Boolean.FALSE;
                    }
                }
                zBooleanValue = f72919m.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public final void b(final P80 p80) {
        C7033Kq.f69014a.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.Y80
            @Override // java.lang.Runnable
            public final void run() {
                this.f72336a.c(p80);
            }
        });
    }

    final /* synthetic */ void c(P80 p80) {
        synchronized (f72918l) {
            try {
                if (!this.f72927h) {
                    this.f72927h = true;
                    if (a()) {
                        try {
                            Nc.v.t();
                            this.f72923d = Rc.D0.V(this.f72920a);
                        } catch (RemoteException | RuntimeException e10) {
                            Nc.v.s().x(e10, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.f72924e = C14724g.f().a(this.f72920a);
                        int iIntValue = ((Integer) Oc.A.c().a(C8784lf.f76805F8)).intValue();
                        if (((Boolean) Oc.A.c().a(C8784lf.f76892Lb)).booleanValue()) {
                            long j10 = iIntValue;
                            C7033Kq.f69017d.scheduleWithFixedDelay(this, j10, j10, TimeUnit.MILLISECONDS);
                        } else {
                            long j11 = iIntValue;
                            C7033Kq.f69017d.scheduleAtFixedRate(this, j11, j11, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (a() && p80 != null) {
            synchronized (f72917k) {
                try {
                    if (this.f72922c.u() >= ((Integer) Oc.A.c().a(C8784lf.f76819G8)).intValue()) {
                        return;
                    }
                    C7566a90 c7566a90B0 = C7886d90.b0();
                    c7566a90B0.R(p80.m());
                    c7566a90B0.N(p80.l());
                    c7566a90B0.D(p80.b());
                    c7566a90B0.U(3);
                    c7566a90B0.K(this.f72921b.f34479a);
                    c7566a90B0.v(this.f72923d);
                    c7566a90B0.H(Build.VERSION.RELEASE);
                    c7566a90B0.O(Build.VERSION.SDK_INT);
                    c7566a90B0.S(p80.o());
                    c7566a90B0.G(p80.a());
                    c7566a90B0.y(this.f72924e);
                    c7566a90B0.Q(p80.n());
                    c7566a90B0.w(p80.e());
                    c7566a90B0.z(p80.g());
                    c7566a90B0.E(p80.h());
                    c7566a90B0.F(this.f72925f.b(p80.h()));
                    c7566a90B0.I(p80.i());
                    c7566a90B0.J(p80.d());
                    c7566a90B0.x(p80.f());
                    c7566a90B0.P(p80.k());
                    c7566a90B0.L(p80.j());
                    c7566a90B0.M(p80.c());
                    if (((Boolean) Oc.A.c().a(C8784lf.f76875K8)).booleanValue()) {
                        c7566a90B0.u(this.f72926g);
                    }
                    C7992e90 c7992e90 = this.f72922c;
                    C8099f90 c8099f90B0 = C8206g90.b0();
                    c8099f90B0.u(c7566a90B0);
                    c7992e90.v(c8099f90B0);
                } finally {
                }
            }
        }
    }

    public Z80(Context context, Sc.a aVar, C8334hM c8334hM, C10048xR c10048xR, C6827Eo c6827Eo) {
        this.f72920a = context;
        this.f72921b = aVar;
        this.f72925f = c8334hM;
        this.f72928i = c6827Eo;
        if (((Boolean) Oc.A.c().a(C8784lf.f76875K8)).booleanValue()) {
            this.f72926g = Rc.D0.I();
        } else {
            this.f72926g = AbstractC8042eh0.t();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrJ;
        if (a()) {
            Object obj = f72917k;
            synchronized (obj) {
                try {
                    if (this.f72922c.u() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            bArrJ = ((C8420i90) this.f72922c.p()).j();
                            this.f72922c.w();
                        }
                        new C9941wR(this.f72920a, this.f72921b.f34479a, this.f72928i, Binder.getCallingUid()).zza(new C9727uR((String) Oc.A.c().a(C8784lf.f76791E8), 60000, new HashMap(), bArrJ, "application/x-protobuf", false));
                    } catch (Exception e10) {
                        if ((e10 instanceof zzdvy) && ((zzdvy) e10).a() == 3) {
                            return;
                        }
                        Nc.v.s().w(e10, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
