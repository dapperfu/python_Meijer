package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class OK implements InterfaceC6930Lg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f69064a = "_videoMediaView";

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PK f69065b;

    OK(PK pk2, String str) {
        this.f69065b = pk2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6930Lg
    public final void a(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6930Lg
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6930Lg
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6930Lg
    public final void zzc() {
        PK pk2 = this.f69065b;
        if (pk2.f69311d != null) {
            pk2.f69311d.n(this.f69064a);
        }
    }
}
