package com.google.android.gms.internal.ads;

import Mc.C4115f1;
import Mc.C4169y;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8029fk extends Fc.b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f74143a;

    /* renamed from: b, reason: collision with root package name */
    private final Mc.c2 f74144b;

    /* renamed from: c, reason: collision with root package name */
    private final Mc.V f74145c;

    /* renamed from: d, reason: collision with root package name */
    private final String f74146d;

    /* renamed from: e, reason: collision with root package name */
    private final BinderC10061yl f74147e;

    /* renamed from: f, reason: collision with root package name */
    private final long f74148f;

    /* renamed from: g, reason: collision with root package name */
    private Ec.g f74149g;

    @Override // Rc.a
    public final Ec.p a() {
        Mc.U0 u0Zzk = null;
        try {
            Mc.V v10 = this.f74145c;
            if (v10 != null) {
                u0Zzk = v10.zzk();
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
        return Ec.p.e(u0Zzk);
    }

    @Override // Rc.a
    public final void c(Ec.g gVar) {
        try {
            this.f74149g = gVar;
            Mc.V v10 = this.f74145c;
            if (v10 != null) {
                v10.R4(new Mc.B(gVar));
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Rc.a
    public final void d(boolean z10) {
        try {
            Mc.V v10 = this.f74145c;
            if (v10 != null) {
                v10.E8(z10);
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // Rc.a
    public final void e(Activity activity) {
        if (activity == null) {
            Qc.p.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            Mc.V v10 = this.f74145c;
            if (v10 != null) {
                v10.u6(com.google.android.gms.dynamic.d.F2(activity));
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void f(C4115f1 c4115f1, Ec.d dVar) {
        try {
            if (this.f74145c != null) {
                c4115f1.o(this.f74148f);
                this.f74145c.Y8(this.f74144b.a(this.f74143a, c4115f1), new Mc.T1(dVar, this));
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
            dVar.a(new Ec.h(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }

    public C8029fk(Context context, String str) {
        BinderC10061yl binderC10061yl = new BinderC10061yl();
        this.f74147e = binderC10061yl;
        this.f74148f = System.currentTimeMillis();
        this.f74143a = context;
        this.f74146d = str;
        this.f74144b = Mc.c2.f19212a;
        this.f74145c = C4169y.a().e(context, new Mc.d2(), str, binderC10061yl);
    }
}
