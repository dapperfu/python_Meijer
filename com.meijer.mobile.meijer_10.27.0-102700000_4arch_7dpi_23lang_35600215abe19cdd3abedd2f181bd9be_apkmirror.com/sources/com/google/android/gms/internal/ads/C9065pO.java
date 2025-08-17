package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.pO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9065pO implements YN {

    /* renamed from: a, reason: collision with root package name */
    private final long f77574a;

    /* renamed from: b, reason: collision with root package name */
    private final C7890eO f77575b;

    /* renamed from: c, reason: collision with root package name */
    private final Q50 f77576c;

    @Override // com.google.android.gms.internal.ads.YN
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void a(Mc.Y1 y12) {
        try {
            this.f77576c.x9(y12, new BinderC8851nO(this));
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.YN
    public final void zzc() {
        try {
            this.f77576c.b7(new BinderC8958oO(this));
            this.f77576c.zzm(com.google.android.gms.dynamic.d.F2(null));
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    C9065pO(long j10, Context context, C7890eO c7890eO, AbstractC9010ou abstractC9010ou, String str) {
        this.f77574a = j10;
        this.f77575b = c7890eO;
        S50 s50C = abstractC9010ou.C();
        s50C.a(context);
        s50C.zza(str);
        this.f77576c = s50C.zzc().zza();
    }
}
