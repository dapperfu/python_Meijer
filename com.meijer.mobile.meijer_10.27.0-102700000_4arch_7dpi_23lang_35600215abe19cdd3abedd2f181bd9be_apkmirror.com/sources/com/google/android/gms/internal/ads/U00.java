package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class U00 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f70514a;

    /* renamed from: b, reason: collision with root package name */
    private final C9570u60 f70515b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageInfo f70516c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.r0 f70517d;

    public static /* synthetic */ V00 a(U00 u00) {
        return new V00(u00.f70515b, u00.f70516c, u00.f70517d);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f70514a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.T00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return U00.a(this.f70217a);
            }
        });
    }

    public U00(Xj0 xj0, C9570u60 c9570u60, PackageInfo packageInfo, Pc.r0 r0Var) {
        this.f70514a = xj0;
        this.f70515b = c9570u60;
        this.f70516c = packageInfo;
        this.f70517d = r0Var;
    }
}
