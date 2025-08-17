package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class J20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    final Xj0 f67755a;

    public J20(C6989Nc c6989Nc, Xj0 xj0, Context context) {
        this.f67755a = xj0;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f67755a.i0(new Callable(this) { // from class: com.google.android.gms.internal.ads.I20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new K20(new JSONObject());
            }
        });
    }
}
