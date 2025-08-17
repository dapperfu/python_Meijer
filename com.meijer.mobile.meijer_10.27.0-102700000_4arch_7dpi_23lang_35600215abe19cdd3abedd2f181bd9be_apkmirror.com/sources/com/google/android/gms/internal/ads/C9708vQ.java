package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzba;

/* renamed from: com.google.android.gms.internal.ads.vQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9708vQ implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f79054a;

    C9708vQ(Context context) {
        this.f79054a = context;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        if (((Boolean) C7914eg.f73921h.e()).booleanValue() && (th2 instanceof zzba)) {
            C7231Ue.e(this.f79054a);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) C7914eg.f73923j.e()).booleanValue()) {
            C7231Ue.e(this.f79054a);
        }
    }
}
