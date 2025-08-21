package com.google.android.gms.internal.ads;

import Oc.C4393f1;
import Oc.C4447y;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8154fk extends Hc.b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f74983a;

    /* renamed from: b, reason: collision with root package name */
    private final Oc.c2 f74984b;

    /* renamed from: c, reason: collision with root package name */
    private final Oc.V f74985c;

    /* renamed from: d, reason: collision with root package name */
    private final String f74986d;

    /* renamed from: e, reason: collision with root package name */
    private final BinderC10186yl f74987e;

    /* renamed from: f, reason: collision with root package name */
    private final long f74988f;

    /* renamed from: g, reason: collision with root package name */
    private Gc.g f74989g;

    @Override // Tc.a
    public final Gc.p a() {
        Oc.U0 u0Zzk = null;
        try {
            Oc.V v10 = this.f74985c;
            if (v10 != null) {
                u0Zzk = v10.zzk();
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
        return Gc.p.e(u0Zzk);
    }

    @Override // Tc.a
    public final void c(Gc.g gVar) {
        try {
            this.f74989g = gVar;
            Oc.V v10 = this.f74985c;
            if (v10 != null) {
                v10.d4(new Oc.B(gVar));
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Tc.a
    public final void d(boolean z10) {
        try {
            Oc.V v10 = this.f74985c;
            if (v10 != null) {
                v10.y8(z10);
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Tc.a
    public final void e(Activity activity) {
        if (activity == null) {
            Sc.p.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            Oc.V v10 = this.f74985c;
            if (v10 != null) {
                v10.J6(com.google.android.gms.dynamic.d.I2(activity));
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void f(C4393f1 c4393f1, Gc.d dVar) {
        try {
            if (this.f74985c != null) {
                c4393f1.o(this.f74988f);
                this.f74985c.A6(this.f74984b.a(this.f74983a, c4393f1), new Oc.T1(dVar, this));
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
            dVar.a(new Gc.h(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }

    public C8154fk(Context context, String str) {
        BinderC10186yl binderC10186yl = new BinderC10186yl();
        this.f74987e = binderC10186yl;
        this.f74988f = System.currentTimeMillis();
        this.f74983a = context;
        this.f74986d = str;
        this.f74984b = Oc.c2.f23399a;
        this.f74985c = C4447y.a().e(context, new Oc.d2(), str, binderC10186yl);
    }
}
