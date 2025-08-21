package com.google.android.gms.internal.ads;

import Rc.C5202m0;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.q30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9262q30 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f78541a;

    public C9262q30(Xj0 xj0) {
        this.f78541a = xj0;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f78541a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.p30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                String str = (String) Oc.A.c().a(C8784lf.f77034W);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) Oc.A.c().a(C8784lf.f77048X)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, C5202m0.a(str2));
                        }
                    }
                }
                return new C9368r30(map);
            }
        });
    }
}
