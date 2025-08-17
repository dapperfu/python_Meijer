package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.oY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8968oY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f77386a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f77387b;

    C8968oY(Xj0 xj0, Context context) {
        this.f77387b = xj0;
        this.f77386a = context;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76039Kc)).booleanValue()) {
            return Mj0.h(new C9075pY(null, false));
        }
        final ContentResolver contentResolver = this.f77386a.getContentResolver();
        return contentResolver == null ? Mj0.h(new C9075pY(null, false)) : this.f77387b.i0(new Callable() { // from class: com.google.android.gms.internal.ads.nY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new C9075pY(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }
}
