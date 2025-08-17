package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class T4 implements InterfaceC8496k4 {

    /* renamed from: a, reason: collision with root package name */
    private final M4 f70284a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f70285b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f70286c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f70287d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f70288e;

    @Override // com.google.android.gms.internal.ads.InterfaceC8496k4
    public final int zza() {
        return this.f70285b.length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8496k4
    public final long zzb(int i10) {
        return this.f70285b[i10];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8496k4
    public final List zzc(long j10) {
        return this.f70284a.e(j10, this.f70286c, this.f70287d, this.f70288e);
    }

    public T4(M4 m42, Map map, Map map2, Map map3) {
        this.f70284a = m42;
        this.f70287d = map2;
        this.f70288e = map3;
        this.f70286c = Collections.unmodifiableMap(map);
        this.f70285b = m42.h();
    }
}
