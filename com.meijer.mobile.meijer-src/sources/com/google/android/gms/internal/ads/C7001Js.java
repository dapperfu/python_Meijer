package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Js, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7001Js implements InterfaceC9430rh0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9430rh0 f68824a;

    /* renamed from: b, reason: collision with root package name */
    private final long f68825b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9430rh0 f68826c;

    /* renamed from: d, reason: collision with root package name */
    private long f68827d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f68828e;

    C7001Js(InterfaceC9430rh0 interfaceC9430rh0, int i10, InterfaceC9430rh0 interfaceC9430rh02) {
        this.f68824a = interfaceC9430rh0;
        this.f68825b = i10;
        this.f68826c = interfaceC9430rh02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void d(Pu0 pu0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        return this.f68828e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0, com.google.android.gms.internal.ads.InterfaceC9132os0
    public final Map zze() {
        return AbstractC8363hh0.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final long a(C8155fk0 c8155fk0) throws IOException {
        C8155fk0 c8155fk02;
        this.f68828e = c8155fk0.f74991a;
        long j10 = c8155fk0.f74995e;
        long j11 = this.f68825b;
        C8155fk0 c8155fk03 = null;
        if (j10 >= j11) {
            c8155fk02 = null;
        } else {
            long j12 = c8155fk0.f74996f;
            long jMin = j11 - j10;
            if (j12 != -1) {
                jMin = Math.min(j12, jMin);
            }
            c8155fk02 = new C8155fk0(c8155fk0.f74991a, j10, jMin, null);
        }
        long j13 = c8155fk0.f74996f;
        if (j13 == -1 || c8155fk0.f74995e + j13 > this.f68825b) {
            long jMax = Math.max(this.f68825b, c8155fk0.f74995e);
            long j14 = c8155fk0.f74996f;
            c8155fk03 = new C8155fk0(c8155fk0.f74991a, jMax, j14 != -1 ? Math.min(j14, (c8155fk0.f74995e + j14) - this.f68825b) : -1L, null);
        }
        long jA = c8155fk02 != null ? this.f68824a.a(c8155fk02) : 0L;
        long jA2 = c8155fk03 != null ? this.f68826c.a(c8155fk03) : 0L;
        this.f68827d = c8155fk0.f74995e;
        if (jA == -1 || jA2 == -1) {
            return -1L;
        }
        return jA + jA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.f68827d;
        long j11 = this.f68825b;
        if (j10 < j11) {
            int iZza = this.f68824a.zza(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.f68827d + iZza;
            this.f68827d = j12;
            i12 = iZza;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < this.f68825b) {
            return i12;
        }
        int iZza2 = this.f68826c.zza(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + iZza2;
        this.f68827d += iZza2;
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() throws IOException {
        this.f68824a.zzd();
        this.f68826c.zzd();
    }
}
