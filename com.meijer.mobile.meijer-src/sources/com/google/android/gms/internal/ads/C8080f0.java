package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8080f0 implements InterfaceC9361r0 {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9810vA0 f74826b;

    /* renamed from: c, reason: collision with root package name */
    private final long f74827c;

    /* renamed from: d, reason: collision with root package name */
    private long f74828d;

    /* renamed from: f, reason: collision with root package name */
    private int f74830f;

    /* renamed from: g, reason: collision with root package name */
    private int f74831g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f74829e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f74825a = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];

    public C8080f0(InterfaceC9810vA0 interfaceC9810vA0, long j10, long j11) {
        this.f74826b = interfaceC9810vA0;
        this.f74828d = j10;
        this.f74827c = j11;
    }

    private final void m(int i10) {
        if (i10 != -1) {
            this.f74828d += i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final void e(int i10) throws IOException {
        i(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final void g(byte[] bArr, int i10, int i11) throws IOException {
        c(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final int zzc(int i10) throws IOException {
        int iL = l(1);
        if (iL == 0) {
            iL = k(this.f74825a, 0, Math.min(1, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT), 0, true);
        }
        m(iL);
        return iL;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final long zzd() {
        return this.f74827c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final long zze() {
        return this.f74828d + this.f74830f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final long zzf() {
        return this.f74828d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final void zzg(int i10) throws IOException {
        h(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final void zzi(byte[] bArr, int i10, int i11) throws IOException {
        b(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final void zzj() {
        this.f74830f = 0;
    }

    static {
        C8417i8.b("media3.extractor");
    }

    private final int j(byte[] bArr, int i10, int i11) {
        int i12 = this.f74831g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f74829e, 0, bArr, i10, iMin);
        o(iMin);
        return iMin;
    }

    private final int l(int i10) {
        int iMin = Math.min(this.f74831g, i10);
        o(iMin);
        return iMin;
    }

    private final void n(int i10) {
        int i11 = this.f74830f + i10;
        int length = this.f74829e.length;
        if (i11 > length) {
            this.f74829e = Arrays.copyOf(this.f74829e, Math.max(65536 + i11, Math.min(length + length, i11 + 524288)));
        }
    }

    private final void o(int i10) {
        int i11 = this.f74831g - i10;
        this.f74831g = i11;
        this.f74830f = 0;
        byte[] bArr = this.f74829e;
        byte[] bArr2 = i11 < bArr.length + (-524288) ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f74829e = bArr2;
    }

    private final int k(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int iZza = this.f74826b.zza(bArr, i10 + i12, i11 - i12);
            if (iZza == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + iZza;
        }
        throw new InterruptedIOException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iJ = j(bArr, i10, i11);
        while (iJ < i11 && iJ != -1) {
            iJ = k(bArr, i10, i11, iJ, z10);
        }
        m(iJ);
        if (iJ != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!h(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f74829e, this.f74830f - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final int f(byte[] bArr, int i10, int i11) throws IOException {
        C8080f0 c8080f0;
        int iMin;
        n(i11);
        int i12 = this.f74831g;
        int i13 = this.f74830f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            c8080f0 = this;
            iMin = c8080f0.k(this.f74829e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c8080f0.f74831g += iMin;
        } else {
            c8080f0 = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(c8080f0.f74829e, c8080f0.f74830f, bArr, i10, iMin);
        c8080f0.f74830f += iMin;
        return iMin;
    }

    public final boolean h(int i10, boolean z10) throws IOException {
        n(i10);
        int iK = this.f74831g - this.f74830f;
        while (iK < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iK = k(this.f74829e, this.f74830f, i11, iK, z11);
            if (iK == -1) {
                return false;
            }
            this.f74831g = this.f74830f + iK;
            i10 = i11;
            z10 = z11;
        }
        this.f74830f += i10;
        return true;
    }

    public final boolean i(int i10, boolean z10) throws IOException {
        int iL = l(i10);
        while (iL < i10 && iL != -1) {
            iL = k(this.f74825a, -iL, Math.min(i10, iL + RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT), iL, false);
        }
        m(iL);
        if (iL != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0, com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int iJ = j(bArr, i10, i11);
        if (iJ == 0) {
            iJ = k(bArr, i10, i11, 0, true);
        }
        m(iJ);
        return iJ;
    }
}
