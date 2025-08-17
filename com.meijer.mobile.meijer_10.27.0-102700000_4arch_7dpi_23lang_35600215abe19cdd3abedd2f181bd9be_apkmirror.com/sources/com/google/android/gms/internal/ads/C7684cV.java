package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* renamed from: com.google.android.gms.internal.ads.cV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7684cV implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f73188a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7648c60 f73189b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Z50 f73190c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f73191d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ L90 f73192e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C8608l60 f73193f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7897eV f73194g;

    C7684cV(C7897eV c7897eV, long j10, C7648c60 c7648c60, Z50 z50, String str, L90 l90, C8608l60 c8608l60) {
        this.f73188a = j10;
        this.f73189b = c7648c60;
        this.f73190c = z50;
        this.f73191d = str;
        this.f73192e = l90;
        this.f73193f = c8608l60;
        this.f73194g = c7897eV;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7684cV.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zzb(Object obj) {
        long j10;
        long jC = this.f73194g.f73876a.c() - this.f73188a;
        synchronized (this.f73194g) {
            try {
                C7897eV c7897eV = this.f73194g;
                if (c7897eV.f73880e) {
                    j10 = jC;
                    c7897eV.f73877b.a(this.f73189b, this.f73190c, 0, null, j10);
                } else {
                    j10 = jC;
                }
                C7897eV c7897eV2 = this.f73194g;
                if (c7897eV2.f73882g) {
                    return;
                }
                if (c7897eV2.q(this.f73190c)) {
                    ((C7791dV) this.f73194g.f73879d.get(this.f73190c)).f73419d = j10;
                } else {
                    LinkedHashMap linkedHashMap = this.f73194g.f73879d;
                    Z50 z50 = this.f73190c;
                    long j11 = j10;
                    j10 = j11;
                    linkedHashMap.put(z50, new C7791dV(this.f73191d, z50.f72032f0, 0, j11, null));
                }
                this.f73194g.f73881f.g(this.f73190c, j10, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
