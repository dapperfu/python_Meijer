package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.ads.jK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8544jK implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7270Rq f76271a;

    C8544jK(C8651kK c8651kK, C7270Rq c7270Rq) {
        this.f76271a = c7270Rq;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Sc.p.d("Failed to load media data due to video view load failure.");
        this.f76271a.c(th2);
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        if (interfaceC9133ot == null) {
            this.f76271a.c(new zzegu(1, "Missing webview from video view future."));
            return;
        }
        final C7270Rq c7270Rq = this.f76271a;
        interfaceC9133ot.h0("/video", new C8170fs(new Consumer() { // from class: com.google.android.gms.internal.ads.iK
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", (String) obj2);
                c7270Rq.b(bundle);
            }
        }));
        interfaceC9133ot.R();
    }
}
