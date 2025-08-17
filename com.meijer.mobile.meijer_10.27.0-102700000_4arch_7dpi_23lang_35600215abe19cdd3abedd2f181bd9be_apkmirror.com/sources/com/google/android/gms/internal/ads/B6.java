package com.google.android.gms.internal.ads;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* loaded from: classes6.dex */
final class B6 extends C6 {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f65453b;

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f65453b;
    }

    public B6(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f65453b = bArr;
    }
}
