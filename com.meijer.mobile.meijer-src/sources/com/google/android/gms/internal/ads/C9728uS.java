package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.uS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9728uS implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC7990e80 f79688a;

    C9728uS(C9835vS c9835vS, InterfaceC7990e80 interfaceC7990e80) {
        this.f79688a = interfaceC7990e80;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f79688a.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            Sc.p.d("Error executing function on offline buffered ping database: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Sc.p.d("Failed to get offline buffered ping database: ".concat(String.valueOf(th2.getMessage())));
    }
}
