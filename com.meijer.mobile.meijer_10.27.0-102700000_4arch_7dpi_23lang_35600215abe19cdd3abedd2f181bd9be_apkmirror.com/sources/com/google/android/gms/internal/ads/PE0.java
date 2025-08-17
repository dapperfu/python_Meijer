package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes6.dex */
final class PE0 implements InterfaceC9305rh0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9305rh0 f69297a;

    /* renamed from: b, reason: collision with root package name */
    private final int f69298b;

    /* renamed from: c, reason: collision with root package name */
    private final OE0 f69299c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f69300d;

    /* renamed from: e, reason: collision with root package name */
    private int f69301e;

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final long a(C8030fk0 c8030fk0) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f69301e;
        if (i12 == 0) {
            int i13 = 0;
            if (this.f69297a.zza(this.f69300d, 0, 1) != -1) {
                int i14 = (this.f69300d[0] & com.medallia.digital.mobilesdk.l3.f92484c) << 4;
                if (i14 != 0) {
                    byte[] bArr2 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int iZza = this.f69297a.zza(bArr2, i13, i15);
                        if (iZza != -1) {
                            i13 += iZza;
                            i15 -= iZza;
                        }
                    }
                    while (i14 > 0) {
                        int i16 = i14 - 1;
                        if (bArr2[i16] != 0) {
                            break;
                        }
                        i14 = i16;
                    }
                    if (i14 > 0) {
                        this.f69299c.a(new GQ(bArr2, i14));
                    }
                }
                i12 = this.f69298b;
                this.f69301e = i12;
            }
            return -1;
        }
        int iZza2 = this.f69297a.zza(bArr, i10, Math.min(i12, i11));
        if (iZza2 != -1) {
            this.f69301e -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final Uri zzc() {
        return this.f69297a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0, com.google.android.gms.internal.ads.InterfaceC9007os0
    public final Map zze() {
        return this.f69297a.zze();
    }

    public PE0(InterfaceC9305rh0 interfaceC9305rh0, int i10, OE0 oe0) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8086gC.d(z10);
        this.f69297a = interfaceC9305rh0;
        this.f69298b = i10;
        this.f69299c = oe0;
        this.f69300d = new byte[1];
        this.f69301e = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void d(Pu0 pu0) {
        pu0.getClass();
        this.f69297a.d(pu0);
    }
}
