package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.uS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9603uS implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC7865e80 f78848a;

    C9603uS(C9710vS c9710vS, InterfaceC7865e80 interfaceC7865e80) {
        this.f78848a = interfaceC7865e80;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f78848a.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            Qc.p.d("Error executing function on offline buffered ping database: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Qc.p.d("Failed to get offline buffered ping database: ".concat(String.valueOf(th2.getMessage())));
    }
}
