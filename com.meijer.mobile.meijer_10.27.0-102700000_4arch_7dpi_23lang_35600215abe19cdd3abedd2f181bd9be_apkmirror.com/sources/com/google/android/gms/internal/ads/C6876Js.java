package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Js, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6876Js implements InterfaceC9305rh0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9305rh0 f67984a;

    /* renamed from: b, reason: collision with root package name */
    private final long f67985b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9305rh0 f67986c;

    /* renamed from: d, reason: collision with root package name */
    private long f67987d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f67988e;

    C6876Js(InterfaceC9305rh0 interfaceC9305rh0, int i10, InterfaceC9305rh0 interfaceC9305rh02) {
        this.f67984a = interfaceC9305rh0;
        this.f67985b = i10;
        this.f67986c = interfaceC9305rh02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void d(Pu0 pu0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final Uri zzc() {
        return this.f67988e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0, com.google.android.gms.internal.ads.InterfaceC9007os0
    public final Map zze() {
        return AbstractC8238hh0.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final long a(C8030fk0 c8030fk0) throws IOException {
        C8030fk0 c8030fk02;
        this.f67988e = c8030fk0.f74151a;
        long j10 = c8030fk0.f74155e;
        long j11 = this.f67985b;
        C8030fk0 c8030fk03 = null;
        if (j10 >= j11) {
            c8030fk02 = null;
        } else {
            long j12 = c8030fk0.f74156f;
            long jMin = j11 - j10;
            if (j12 != -1) {
                jMin = Math.min(j12, jMin);
            }
            c8030fk02 = new C8030fk0(c8030fk0.f74151a, j10, jMin, null);
        }
        long j13 = c8030fk0.f74156f;
        if (j13 == -1 || c8030fk0.f74155e + j13 > this.f67985b) {
            long jMax = Math.max(this.f67985b, c8030fk0.f74155e);
            long j14 = c8030fk0.f74156f;
            c8030fk03 = new C8030fk0(c8030fk0.f74151a, jMax, j14 != -1 ? Math.min(j14, (c8030fk0.f74155e + j14) - this.f67985b) : -1L, null);
        }
        long jA = c8030fk02 != null ? this.f67984a.a(c8030fk02) : 0L;
        long jA2 = c8030fk03 != null ? this.f67986c.a(c8030fk03) : 0L;
        this.f67987d = c8030fk0.f74155e;
        if (jA == -1 || jA2 == -1) {
            return -1L;
        }
        return jA + jA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.f67987d;
        long j11 = this.f67985b;
        if (j10 < j11) {
            int iZza = this.f67984a.zza(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.f67987d + iZza;
            this.f67987d = j12;
            i12 = iZza;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < this.f67985b) {
            return i12;
        }
        int iZza2 = this.f67986c.zza(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + iZza2;
        this.f67987d += iZza2;
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void zzd() throws IOException {
        this.f67984a.zzd();
        this.f67986c.zzd();
    }
}
