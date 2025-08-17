package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.ads.jK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8419jK implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7145Rq f75431a;

    C8419jK(C8526kK c8526kK, C7145Rq c7145Rq) {
        this.f75431a = c7145Rq;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Qc.p.d("Failed to load media data due to video view load failure.");
        this.f75431a.c(th2);
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        if (interfaceC9008ot == null) {
            this.f75431a.c(new zzegu(1, "Missing webview from video view future."));
            return;
        }
        final C7145Rq c7145Rq = this.f75431a;
        interfaceC9008ot.h0("/video", new C8045fs(new Consumer() { // from class: com.google.android.gms.internal.ads.iK
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", (String) obj2);
                c7145Rq.b(bundle);
            }
        }));
        interfaceC9008ot.R();
    }
}
