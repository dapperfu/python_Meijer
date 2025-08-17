package com.google.android.gms.internal.ads;

import Mc.C4115f1;
import Mc.C4169y;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.lp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8679lp extends Yc.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f76658a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7719cp f76659b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f76660c;

    /* renamed from: d, reason: collision with root package name */
    private final BinderC9641up f76661d;

    /* renamed from: e, reason: collision with root package name */
    private final long f76662e;

    public C8679lp(Context context, String str) {
        this(context.getApplicationContext(), str, C4169y.a().n(context, str, new BinderC10061yl()), new BinderC9641up());
    }

    @Override // Yc.c
    public final Ec.p a() {
        Mc.U0 u0Zzc = null;
        try {
            InterfaceC7719cp interfaceC7719cp = this.f76659b;
            if (interfaceC7719cp != null) {
                u0Zzc = interfaceC7719cp.zzc();
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
        return Ec.p.e(u0Zzc);
    }

    @Override // Yc.c
    public final void c(Activity activity, Ec.k kVar) {
        this.f76661d.B9(kVar);
        if (activity == null) {
            Qc.p.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            InterfaceC7719cp interfaceC7719cp = this.f76659b;
            if (interfaceC7719cp != null) {
                interfaceC7719cp.b7(this.f76661d);
                this.f76659b.zzm(com.google.android.gms.dynamic.d.F2(activity));
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void d(C4115f1 c4115f1, Yc.d dVar) {
        try {
            if (this.f76659b != null) {
                c4115f1.o(this.f76662e);
                this.f76659b.x9(Mc.c2.f19212a.a(this.f76660c, c4115f1), new BinderC9214qp(dVar, this));
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    protected C8679lp(Context context, String str, InterfaceC7719cp interfaceC7719cp, BinderC9641up binderC9641up) {
        this.f76662e = System.currentTimeMillis();
        this.f76660c = context.getApplicationContext();
        this.f76658a = str;
        this.f76659b = interfaceC7719cp;
        this.f76661d = binderC9641up;
    }
}
