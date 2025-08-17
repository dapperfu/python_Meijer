package com.google.ads.interactivemedia.v3.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* loaded from: classes4.dex */
final class zzg extends zzh {
    private final byte[] zza;

    @Override // com.google.ads.interactivemedia.v3.internal.zzh, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.zza;
    }

    public zzg(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }
}
