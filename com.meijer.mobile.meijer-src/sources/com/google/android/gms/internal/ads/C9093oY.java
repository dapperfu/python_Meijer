package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.oY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9093oY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f78226a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f78227b;

    C9093oY(Xj0 xj0, Context context) {
        this.f78227b = xj0;
        this.f78226a = context;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        if (!((Boolean) Oc.A.c().a(C8784lf.f76879Kc)).booleanValue()) {
            return Mj0.h(new C9200pY(null, false));
        }
        final ContentResolver contentResolver = this.f78226a.getContentResolver();
        return contentResolver == null ? Mj0.h(new C9200pY(null, false)) : this.f78227b.k0(new Callable() { // from class: com.google.android.gms.internal.ads.nY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new C9200pY(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }
}
