package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Pe0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7187Pe0 extends AbstractC7117Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private Uri f70234e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f70235f;

    /* renamed from: g, reason: collision with root package name */
    private int f70236g;

    /* renamed from: h, reason: collision with root package name */
    private int f70237h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f70238i;

    /* renamed from: j, reason: collision with root package name */
    private final C9104oe0 f70239j;

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        return this.f70234e;
    }

    public C7187Pe0(byte[] bArr) {
        C9104oe0 c9104oe0 = new C9104oe0(bArr);
        super(false);
        this.f70239j = c9104oe0;
        C8211gC.d(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f70237h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f70235f;
        C8211gC.b(bArr2);
        System.arraycopy(bArr2, this.f70236g, bArr, i10, iMin);
        this.f70236g += iMin;
        this.f70237h -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() {
        if (this.f70238i) {
            this.f70238i = false;
            h();
        }
        this.f70234e = null;
        this.f70235f = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final long a(C8155fk0 c8155fk0) throws IOException {
        i(c8155fk0);
        this.f70234e = c8155fk0.f74991a;
        byte[] bArr = this.f70239j.f78249a;
        this.f70235f = bArr;
        long j10 = c8155fk0.f74995e;
        int length = bArr.length;
        if (j10 <= length) {
            int i10 = (int) j10;
            this.f70236g = i10;
            int i11 = length - i10;
            this.f70237h = i11;
            long j11 = c8155fk0.f74996f;
            if (j11 != -1) {
                this.f70237h = (int) Math.min(i11, j11);
            }
            this.f70238i = true;
            j(c8155fk0);
            long j12 = c8155fk0.f74996f;
            if (j12 != -1) {
                return j12;
            }
            return this.f70237h;
        }
        throw new zzfz(2008);
    }
}
