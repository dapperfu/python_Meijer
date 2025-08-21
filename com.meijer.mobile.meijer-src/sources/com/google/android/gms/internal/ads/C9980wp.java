package com.google.android.gms.internal.ads;

import Oc.C4393f1;
import Oc.C4447y;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import bd.AbstractC6355a;
import bd.AbstractC6356b;

/* renamed from: com.google.android.gms.internal.ads.wp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9980wp extends AbstractC6355a {

    /* renamed from: a, reason: collision with root package name */
    private final String f80382a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7844cp f80383b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f80384c;

    /* renamed from: e, reason: collision with root package name */
    private final long f80386e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final BinderC9766up f80385d = new BinderC9766up();

    @Override // bd.AbstractC6355a
    public final Gc.p a() {
        Oc.U0 u0Zzc = null;
        try {
            InterfaceC7844cp interfaceC7844cp = this.f80383b;
            if (interfaceC7844cp != null) {
                u0Zzc = interfaceC7844cp.zzc();
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
        return Gc.p.e(u0Zzc);
    }

    @Override // bd.AbstractC6355a
    public final void c(Activity activity, Gc.k kVar) {
        this.f80385d.B9(kVar);
        try {
            InterfaceC7844cp interfaceC7844cp = this.f80383b;
            if (interfaceC7844cp != null) {
                interfaceC7844cp.n7(this.f80385d);
                this.f80383b.zzm(com.google.android.gms.dynamic.d.I2(activity));
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void d(C4393f1 c4393f1, AbstractC6356b abstractC6356b) {
        try {
            if (this.f80383b != null) {
                c4393f1.o(this.f80386e);
                this.f80383b.R6(Oc.c2.f23399a.a(this.f80384c, c4393f1), new BinderC9873vp(abstractC6356b, this));
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public C9980wp(Context context, String str) {
        this.f80382a = str;
        this.f80384c = context.getApplicationContext();
        this.f80383b = C4447y.a().n(context, str, new BinderC10186yl());
    }
}
