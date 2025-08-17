package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class K1 extends E0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q0 f68014b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ L1 f68015c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K1(L1 l12, Q0 q02, Q0 q03) {
        super(q02);
        this.f68014b = q03;
        this.f68015c = l12;
    }

    @Override // com.google.android.gms.internal.ads.E0, com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        O0 o0Zzg = this.f68014b.zzg(j10);
        R0 r02 = o0Zzg.f68986a;
        R0 r03 = new R0(r02.f69707a, r02.f69708b + this.f68015c.f68244a);
        R0 r04 = o0Zzg.f68987b;
        return new O0(r03, new R0(r04.f69707a, r04.f69708b + this.f68015c.f68244a));
    }
}
