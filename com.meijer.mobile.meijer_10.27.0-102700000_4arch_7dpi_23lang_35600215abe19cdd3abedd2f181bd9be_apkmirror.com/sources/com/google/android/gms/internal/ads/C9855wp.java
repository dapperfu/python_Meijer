package com.google.android.gms.internal.ads;

import Mc.C4115f1;
import Mc.C4169y;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.wp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9855wp extends Zc.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f79542a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7719cp f79543b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f79544c;

    /* renamed from: e, reason: collision with root package name */
    private final long f79546e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final BinderC9641up f79545d = new BinderC9641up();

    @Override // Zc.a
    public final Ec.p a() {
        Mc.U0 u0Zzc = null;
        try {
            InterfaceC7719cp interfaceC7719cp = this.f79543b;
            if (interfaceC7719cp != null) {
                u0Zzc = interfaceC7719cp.zzc();
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
        return Ec.p.e(u0Zzc);
    }

    @Override // Zc.a
    public final void c(Activity activity, Ec.k kVar) {
        this.f79545d.B9(kVar);
        try {
            InterfaceC7719cp interfaceC7719cp = this.f79543b;
            if (interfaceC7719cp != null) {
                interfaceC7719cp.b7(this.f79545d);
                this.f79543b.zzm(com.google.android.gms.dynamic.d.F2(activity));
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void d(C4115f1 c4115f1, Zc.b bVar) {
        try {
            if (this.f79543b != null) {
                c4115f1.o(this.f79546e);
                this.f79543b.Y7(Mc.c2.f19212a.a(this.f79544c, c4115f1), new BinderC9748vp(bVar, this));
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public C9855wp(Context context, String str) {
        this.f79542a = str;
        this.f79544c = context.getApplicationContext();
        this.f79543b = C4169y.a().n(context, str, new BinderC10061yl());
    }
}
