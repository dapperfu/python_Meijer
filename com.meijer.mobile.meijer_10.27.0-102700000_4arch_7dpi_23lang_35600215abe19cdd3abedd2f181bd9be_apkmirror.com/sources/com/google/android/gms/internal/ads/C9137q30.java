package com.google.android.gms.internal.ads;

import Pc.C4581m0;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.q30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9137q30 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f77701a;

    public C9137q30(Xj0 xj0) {
        this.f77701a = xj0;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f77701a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.p30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                String str = (String) Mc.A.c().a(C8659lf.f76194W);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) Mc.A.c().a(C8659lf.f76208X)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, C4581m0.a(str2));
                        }
                    }
                }
                return new C9243r30(map);
            }
        });
    }
}
