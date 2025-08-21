package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes6.dex */
final class IE0 implements VF0 {

    /* renamed from: a, reason: collision with root package name */
    private final VF0 f68420a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8042eh0 f68421b;

    public final AbstractC8042eh0 a() {
        return this.f68421b;
    }

    @Override // com.google.android.gms.internal.ads.VF0
    public final void b(long j10) {
        this.f68420a.b(j10);
    }

    @Override // com.google.android.gms.internal.ads.VF0
    public final boolean c(C7994eA0 c7994eA0) {
        return this.f68420a.c(c7994eA0);
    }

    @Override // com.google.android.gms.internal.ads.VF0
    public final long zzb() {
        return this.f68420a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.VF0
    public final long zzc() {
        return this.f68420a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.VF0
    public final boolean zzp() {
        return this.f68420a.zzp();
    }

    public IE0(VF0 vf0, List list) {
        this.f68420a = vf0;
        this.f68421b = AbstractC8042eh0.r(list);
    }
}
