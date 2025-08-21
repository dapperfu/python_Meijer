package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* renamed from: com.google.android.gms.internal.ads.cV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7809cV implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f74028a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7773c60 f74029b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Z50 f74030c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f74031d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ L90 f74032e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C8733l60 f74033f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C8022eV f74034g;

    C7809cV(C8022eV c8022eV, long j10, C7773c60 c7773c60, Z50 z50, String str, L90 l90, C8733l60 c8733l60) {
        this.f74028a = j10;
        this.f74029b = c7773c60;
        this.f74030c = z50;
        this.f74031d = str;
        this.f74032e = l90;
        this.f74033f = c8733l60;
        this.f74034g = c8022eV;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7809cV.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zzb(Object obj) {
        long j10;
        long jC = this.f74034g.f74716a.c() - this.f74028a;
        synchronized (this.f74034g) {
            try {
                C8022eV c8022eV = this.f74034g;
                if (c8022eV.f74720e) {
                    j10 = jC;
                    c8022eV.f74717b.a(this.f74029b, this.f74030c, 0, null, j10);
                } else {
                    j10 = jC;
                }
                C8022eV c8022eV2 = this.f74034g;
                if (c8022eV2.f74722g) {
                    return;
                }
                if (c8022eV2.q(this.f74030c)) {
                    ((C7916dV) this.f74034g.f74719d.get(this.f74030c)).f74259d = j10;
                } else {
                    LinkedHashMap linkedHashMap = this.f74034g.f74719d;
                    Z50 z50 = this.f74030c;
                    long j11 = j10;
                    j10 = j11;
                    linkedHashMap.put(z50, new C7916dV(this.f74031d, z50.f72872f0, 0, j11, null));
                }
                this.f74034g.f74721f.g(this.f74030c, j10, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
