package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.pO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9190pO implements YN {

    /* renamed from: a, reason: collision with root package name */
    private final long f78414a;

    /* renamed from: b, reason: collision with root package name */
    private final C8015eO f78415b;

    /* renamed from: c, reason: collision with root package name */
    private final Q50 f78416c;

    @Override // com.google.android.gms.internal.ads.YN
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void a(Oc.Y1 y12) {
        try {
            this.f78416c.j6(y12, new BinderC8976nO(this));
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void zzc() {
        try {
            this.f78416c.n7(new BinderC9083oO(this));
            this.f78416c.zzm(com.google.android.gms.dynamic.d.I2(null));
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    C9190pO(long j10, Context context, C8015eO c8015eO, AbstractC9135ou abstractC9135ou, String str) {
        this.f78414a = j10;
        this.f78415b = c8015eO;
        S50 s50C = abstractC9135ou.C();
        s50C.a(context);
        s50C.zza(str);
        this.f78416c = s50C.zzc().zza();
    }
}
