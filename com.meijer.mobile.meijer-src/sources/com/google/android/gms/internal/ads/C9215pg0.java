package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import j$.net.URLDecoder;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* renamed from: com.google.android.gms.internal.ads.pg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9215pg0 extends AbstractC7117Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private C8155fk0 f78463e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f78464f;

    /* renamed from: g, reason: collision with root package name */
    private int f78465g;

    /* renamed from: h, reason: collision with root package name */
    private int f78466h;

    public C9215pg0() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        C8155fk0 c8155fk0 = this.f78463e;
        if (c8155fk0 != null) {
            return c8155fk0.f74991a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f78466h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f78464f;
        int i13 = OV.f69931a;
        System.arraycopy(bArr2, this.f78465g, bArr, i10, iMin);
        this.f78465g += iMin;
        this.f78466h -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() {
        if (this.f78464f != null) {
            this.f78464f = null;
            h();
        }
        this.f78463e = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final long a(C8155fk0 c8155fk0) throws IOException {
        i(c8155fk0);
        this.f78463e = c8155fk0;
        Uri uriNormalizeScheme = c8155fk0.f74991a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        C8211gC.e("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i10 = OV.f69931a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length == 2) {
            String str = strArrSplit[1];
            if (strArrSplit[0].contains(";base64")) {
                try {
                    this.f78464f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw zzbc.b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e10);
                }
            } else {
                this.f78464f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j10 = c8155fk0.f74995e;
            int length = this.f78464f.length;
            if (j10 <= length) {
                int i11 = (int) j10;
                this.f78465g = i11;
                int i12 = length - i11;
                this.f78466h = i12;
                long j11 = c8155fk0.f74996f;
                if (j11 != -1) {
                    this.f78466h = (int) Math.min(i12, j11);
                }
                j(c8155fk0);
                long j12 = c8155fk0.f74996f;
                if (j12 != -1) {
                    return j12;
                }
                return this.f78466h;
            }
            this.f78464f = null;
            throw new zzfz(2008);
        }
        throw zzbc.b("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
    }
}
