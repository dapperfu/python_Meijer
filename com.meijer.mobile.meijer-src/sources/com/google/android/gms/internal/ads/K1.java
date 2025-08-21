package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class K1 extends E0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q0 f68854b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ L1 f68855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K1(L1 l12, Q0 q02, Q0 q03) {
        super(q02);
        this.f68854b = q03;
        this.f68855c = l12;
    }

    @Override // com.google.android.gms.internal.ads.E0, com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        O0 o0Zzg = this.f68854b.zzg(j10);
        R0 r02 = o0Zzg.f69826a;
        R0 r03 = new R0(r02.f70547a, r02.f70548b + this.f68855c.f69084a);
        R0 r04 = o0Zzg.f69827b;
        return new O0(r03, new R0(r04.f70547a, r04.f70548b + this.f68855c.f69084a));
    }
}
