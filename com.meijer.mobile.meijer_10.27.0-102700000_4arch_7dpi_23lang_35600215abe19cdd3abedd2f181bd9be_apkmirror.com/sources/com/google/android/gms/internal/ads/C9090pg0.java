package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import j$.net.URLDecoder;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* renamed from: com.google.android.gms.internal.ads.pg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9090pg0 extends AbstractC6992Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private C8030fk0 f77623e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f77624f;

    /* renamed from: g, reason: collision with root package name */
    private int f77625g;

    /* renamed from: h, reason: collision with root package name */
    private int f77626h;

    public C9090pg0() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final Uri zzc() {
        C8030fk0 c8030fk0 = this.f77623e;
        if (c8030fk0 != null) {
            return c8030fk0.f74151a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f77626h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f77624f;
        int i13 = OV.f69091a;
        System.arraycopy(bArr2, this.f77625g, bArr, i10, iMin);
        this.f77625g += iMin;
        this.f77626h -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void zzd() {
        if (this.f77624f != null) {
            this.f77624f = null;
            h();
        }
        this.f77623e = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final long a(C8030fk0 c8030fk0) throws IOException {
        i(c8030fk0);
        this.f77623e = c8030fk0;
        Uri uriNormalizeScheme = c8030fk0.f74151a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        C8086gC.e("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i10 = OV.f69091a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length == 2) {
            String str = strArrSplit[1];
            if (strArrSplit[0].contains(";base64")) {
                try {
                    this.f77624f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw zzbc.b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e10);
                }
            } else {
                this.f77624f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j10 = c8030fk0.f74155e;
            int length = this.f77624f.length;
            if (j10 <= length) {
                int i11 = (int) j10;
                this.f77625g = i11;
                int i12 = length - i11;
                this.f77626h = i12;
                long j11 = c8030fk0.f74156f;
                if (j11 != -1) {
                    this.f77626h = (int) Math.min(i12, j11);
                }
                j(c8030fk0);
                long j12 = c8030fk0.f74156f;
                if (j12 != -1) {
                    return j12;
                }
                return this.f77626h;
            }
            this.f77624f = null;
            throw new zzfz(2008);
        }
        throw zzbc.b("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
    }
}
