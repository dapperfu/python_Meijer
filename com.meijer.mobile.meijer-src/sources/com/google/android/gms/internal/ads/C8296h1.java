package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8296h1 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f75410a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8615k1 f75411b;

    public C8296h1(C8615k1 c8615k1, long j10) {
        this.f75411b = c8615k1;
        this.f75410a = j10;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f75410a;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        O0 o0A = this.f75411b.f76401i[0].a(j10);
        int i10 = 1;
        while (true) {
            C8615k1 c8615k1 = this.f75411b;
            if (i10 >= c8615k1.f76401i.length) {
                return o0A;
            }
            O0 o0A2 = c8615k1.f76401i[i10].a(j10);
            if (o0A2.f69826a.f70548b < o0A.f69826a.f70548b) {
                o0A = o0A2;
            }
            i10++;
        }
    }
}
