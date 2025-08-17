package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7955f0 implements InterfaceC9236r0 {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9685vA0 f73986b;

    /* renamed from: c, reason: collision with root package name */
    private final long f73987c;

    /* renamed from: d, reason: collision with root package name */
    private long f73988d;

    /* renamed from: f, reason: collision with root package name */
    private int f73990f;

    /* renamed from: g, reason: collision with root package name */
    private int f73991g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f73989e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f73985a = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];

    public C7955f0(InterfaceC9685vA0 interfaceC9685vA0, long j10, long j11) {
        this.f73986b = interfaceC9685vA0;
        this.f73988d = j10;
        this.f73987c = j11;
    }

    private final void m(int i10) {
        if (i10 != -1) {
            this.f73988d += i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final void e(int i10) throws IOException {
        i(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final void g(byte[] bArr, int i10, int i11) throws IOException {
        c(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final int zzc(int i10) throws IOException {
        int iL = l(1);
        if (iL == 0) {
            iL = k(this.f73985a, 0, Math.min(1, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT), 0, true);
        }
        m(iL);
        return iL;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final long zzd() {
        return this.f73987c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final long zze() {
        return this.f73988d + this.f73990f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final long zzf() {
        return this.f73988d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final void zzg(int i10) throws IOException {
        h(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final void zzi(byte[] bArr, int i10, int i11) throws IOException {
        b(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final void zzj() {
        this.f73990f = 0;
    }

    static {
        C8292i8.b("media3.extractor");
    }

    private final int j(byte[] bArr, int i10, int i11) {
        int i12 = this.f73991g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f73989e, 0, bArr, i10, iMin);
        o(iMin);
        return iMin;
    }

    private final int l(int i10) {
        int iMin = Math.min(this.f73991g, i10);
        o(iMin);
        return iMin;
    }

    private final void n(int i10) {
        int i11 = this.f73990f + i10;
        int length = this.f73989e.length;
        if (i11 > length) {
            this.f73989e = Arrays.copyOf(this.f73989e, Math.max(65536 + i11, Math.min(length + length, i11 + 524288)));
        }
    }

    private final void o(int i10) {
        int i11 = this.f73991g - i10;
        this.f73991g = i11;
        this.f73990f = 0;
        byte[] bArr = this.f73989e;
        byte[] bArr2 = i11 < bArr.length + (-524288) ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f73989e = bArr2;
    }

    private final int k(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int iZza = this.f73986b.zza(bArr, i10 + i12, i11 - i12);
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

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
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

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!h(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f73989e, this.f73990f - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final int f(byte[] bArr, int i10, int i11) throws IOException {
        C7955f0 c7955f0;
        int iMin;
        n(i11);
        int i12 = this.f73991g;
        int i13 = this.f73990f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            c7955f0 = this;
            iMin = c7955f0.k(this.f73989e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c7955f0.f73991g += iMin;
        } else {
            c7955f0 = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(c7955f0.f73989e, c7955f0.f73990f, bArr, i10, iMin);
        c7955f0.f73990f += iMin;
        return iMin;
    }

    public final boolean h(int i10, boolean z10) throws IOException {
        n(i10);
        int iK = this.f73991g - this.f73990f;
        while (iK < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iK = k(this.f73989e, this.f73990f, i11, iK, z11);
            if (iK == -1) {
                return false;
            }
            this.f73991g = this.f73990f + iK;
            i10 = i11;
            z10 = z11;
        }
        this.f73990f += i10;
        return true;
    }

    public final boolean i(int i10, boolean z10) throws IOException {
        int iL = l(i10);
        while (iL < i10 && iL != -1) {
            iL = k(this.f73985a, -iL, Math.min(i10, iL + RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT), iL, false);
        }
        m(iL);
        if (iL != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0, com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int iJ = j(bArr, i10, i11);
        if (iJ == 0) {
            iJ = k(bArr, i10, i11, 0, true);
        }
        m(iJ);
        return iJ;
    }
}
