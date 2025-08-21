package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class T4 implements InterfaceC8621k4 {

    /* renamed from: a, reason: collision with root package name */
    private final M4 f71124a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f71125b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f71126c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f71127d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f71128e;

    @Override // com.google.android.gms.internal.ads.InterfaceC8621k4
    public final int zza() {
        return this.f71125b.length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8621k4
    public final long zzb(int i10) {
        return this.f71125b[i10];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8621k4
    public final List zzc(long j10) {
        return this.f71124a.e(j10, this.f71126c, this.f71127d, this.f71128e);
    }

    public T4(M4 m42, Map map, Map map2, Map map3) {
        this.f71124a = m42;
        this.f71127d = map2;
        this.f71128e = map3;
        this.f71126c = Collections.unmodifiableMap(map);
        this.f71125b = m42.h();
    }
}
