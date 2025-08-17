package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes6.dex */
final class KR implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC7865e80 f68089a;

    KR(MR mr2, InterfaceC7865e80 interfaceC7865e80) {
        this.f68089a = interfaceC7865e80;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f68089a.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            Qc.p.d("Error executing function on offline signal database: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Qc.p.d("Failed to get offline signal database: ".concat(String.valueOf(th2.getMessage())));
    }
}
