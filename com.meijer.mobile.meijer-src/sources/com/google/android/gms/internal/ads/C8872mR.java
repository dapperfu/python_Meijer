package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8872mR implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8162fo f77627a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9230po f77628b;

    C8872mR(BinderC9513sR binderC9513sR, C9230po c9230po, C8162fo c8162fo) {
        this.f77628b = c9230po;
        this.f77627a = c8162fo;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        try {
            this.f77628b.E4(Rc.C.T(th2));
        } catch (RemoteException e10) {
            Rc.p0.l("Service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f77628b.Z3((String) obj, this.f77627a);
        } catch (RemoteException e10) {
            Rc.p0.l("Service can't call client", e10);
        }
    }
}
