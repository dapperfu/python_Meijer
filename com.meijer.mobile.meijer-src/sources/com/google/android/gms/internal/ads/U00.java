package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class U00 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f71354a;

    /* renamed from: b, reason: collision with root package name */
    private final C9695u60 f71355b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageInfo f71356c;

    /* renamed from: d, reason: collision with root package name */
    private final Rc.r0 f71357d;

    public static /* synthetic */ V00 a(U00 u00) {
        return new V00(u00.f71355b, u00.f71356c, u00.f71357d);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f71354a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.T00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return U00.a(this.f71057a);
            }
        });
    }

    public U00(Xj0 xj0, C9695u60 c9695u60, PackageInfo packageInfo, Rc.r0 r0Var) {
        this.f71354a = xj0;
        this.f71355b = c9695u60;
        this.f71356c = packageInfo;
        this.f71357d = r0Var;
    }
}
