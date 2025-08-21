package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes6.dex */
final class KR implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC7990e80 f68929a;

    KR(MR mr2, InterfaceC7990e80 interfaceC7990e80) {
        this.f68929a = interfaceC7990e80;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f68929a.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            Sc.p.d("Error executing function on offline signal database: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Sc.p.d("Failed to get offline signal database: ".concat(String.valueOf(th2.getMessage())));
    }
}
