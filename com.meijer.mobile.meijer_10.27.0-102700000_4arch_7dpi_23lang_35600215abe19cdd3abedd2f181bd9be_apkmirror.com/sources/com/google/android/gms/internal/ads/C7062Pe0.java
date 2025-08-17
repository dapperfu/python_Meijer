package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Pe0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7062Pe0 extends AbstractC6992Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private Uri f69394e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f69395f;

    /* renamed from: g, reason: collision with root package name */
    private int f69396g;

    /* renamed from: h, reason: collision with root package name */
    private int f69397h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f69398i;

    /* renamed from: j, reason: collision with root package name */
    private final C8979oe0 f69399j;

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final Uri zzc() {
        return this.f69394e;
    }

    public C7062Pe0(byte[] bArr) {
        C8979oe0 c8979oe0 = new C8979oe0(bArr);
        super(false);
        this.f69399j = c8979oe0;
        C8086gC.d(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f69397h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f69395f;
        C8086gC.b(bArr2);
        System.arraycopy(bArr2, this.f69396g, bArr, i10, iMin);
        this.f69396g += iMin;
        this.f69397h -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void zzd() {
        if (this.f69398i) {
            this.f69398i = false;
            h();
        }
        this.f69394e = null;
        this.f69395f = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final long a(C8030fk0 c8030fk0) throws IOException {
        i(c8030fk0);
        this.f69394e = c8030fk0.f74151a;
        byte[] bArr = this.f69399j.f77409a;
        this.f69395f = bArr;
        long j10 = c8030fk0.f74155e;
        int length = bArr.length;
        if (j10 <= length) {
            int i10 = (int) j10;
            this.f69396g = i10;
            int i11 = length - i10;
            this.f69397h = i11;
            long j11 = c8030fk0.f74156f;
            if (j11 != -1) {
                this.f69397h = (int) Math.min(i11, j11);
            }
            this.f69398i = true;
            j(c8030fk0);
            long j12 = c8030fk0.f74156f;
            if (j12 != -1) {
                return j12;
            }
            return this.f69397h;
        }
        throw new zzfz(2008);
    }
}
