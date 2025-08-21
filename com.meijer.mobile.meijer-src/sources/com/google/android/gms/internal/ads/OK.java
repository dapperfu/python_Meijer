package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class OK implements InterfaceC7055Lg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f69904a = "_videoMediaView";

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PK f69905b;

    OK(PK pk2, String str) {
        this.f69905b = pk2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7055Lg
    public final void a(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7055Lg
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7055Lg
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7055Lg
    public final void zzc() {
        PK pk2 = this.f69905b;
        if (pk2.f70151d != null) {
            pk2.f70151d.n(this.f69904a);
        }
    }
}
