package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzba;

/* renamed from: com.google.android.gms.internal.ads.vQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9833vQ implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f79894a;

    C9833vQ(Context context) {
        this.f79894a = context;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        if (((Boolean) C8039eg.f74761h.e()).booleanValue() && (th2 instanceof zzba)) {
            C7356Ue.e(this.f79894a);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) C8039eg.f74763j.e()).booleanValue()) {
            C7356Ue.e(this.f79894a);
        }
    }
}
