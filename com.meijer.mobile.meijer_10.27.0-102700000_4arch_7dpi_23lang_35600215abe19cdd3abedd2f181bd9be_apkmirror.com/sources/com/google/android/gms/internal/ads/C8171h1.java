package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8171h1 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f74570a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8490k1 f74571b;

    public C8171h1(C8490k1 c8490k1, long j10) {
        this.f74571b = c8490k1;
        this.f74570a = j10;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f74570a;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        O0 o0A = this.f74571b.f75561i[0].a(j10);
        int i10 = 1;
        while (true) {
            C8490k1 c8490k1 = this.f74571b;
            if (i10 >= c8490k1.f75561i.length) {
                return o0A;
            }
            O0 o0A2 = c8490k1.f75561i[i10].a(j10);
            if (o0A2.f68986a.f69708b < o0A.f68986a.f69708b) {
                o0A = o0A2;
            }
            i10++;
        }
    }
}
