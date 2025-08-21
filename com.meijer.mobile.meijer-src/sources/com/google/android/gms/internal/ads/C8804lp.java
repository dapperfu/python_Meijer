package com.google.android.gms.internal.ads;

import Oc.C4393f1;
import Oc.C4447y;
import ad.AbstractC5683c;
import ad.AbstractC5684d;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.lp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8804lp extends AbstractC5683c {

    /* renamed from: a, reason: collision with root package name */
    private final String f77498a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7844cp f77499b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f77500c;

    /* renamed from: d, reason: collision with root package name */
    private final BinderC9766up f77501d;

    /* renamed from: e, reason: collision with root package name */
    private final long f77502e;

    public C8804lp(Context context, String str) {
        this(context.getApplicationContext(), str, C4447y.a().n(context, str, new BinderC10186yl()), new BinderC9766up());
    }

    @Override // ad.AbstractC5683c
    public final Gc.p a() {
        Oc.U0 u0Zzc = null;
        try {
            InterfaceC7844cp interfaceC7844cp = this.f77499b;
            if (interfaceC7844cp != null) {
                u0Zzc = interfaceC7844cp.zzc();
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
        return Gc.p.e(u0Zzc);
    }

    @Override // ad.AbstractC5683c
    public final void c(Activity activity, Gc.k kVar) {
        this.f77501d.B9(kVar);
        if (activity == null) {
            Sc.p.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            InterfaceC7844cp interfaceC7844cp = this.f77499b;
            if (interfaceC7844cp != null) {
                interfaceC7844cp.n7(this.f77501d);
                this.f77499b.zzm(com.google.android.gms.dynamic.d.I2(activity));
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void d(C4393f1 c4393f1, AbstractC5684d abstractC5684d) {
        try {
            if (this.f77499b != null) {
                c4393f1.o(this.f77502e);
                this.f77499b.j6(Oc.c2.f23399a.a(this.f77500c, c4393f1), new BinderC9339qp(abstractC5684d, this));
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    protected C8804lp(Context context, String str, InterfaceC7844cp interfaceC7844cp, BinderC9766up binderC9766up) {
        this.f77502e = System.currentTimeMillis();
        this.f77500c = context.getApplicationContext();
        this.f77498a = str;
        this.f77499b = interfaceC7844cp;
        this.f77501d = binderC9766up;
    }
}
