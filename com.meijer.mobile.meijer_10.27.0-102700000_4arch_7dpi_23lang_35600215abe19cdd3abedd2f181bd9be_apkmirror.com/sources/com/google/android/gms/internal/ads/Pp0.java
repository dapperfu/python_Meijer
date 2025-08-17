package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes6.dex */
public final class Pp0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f69426a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f69427b = null;

    /* renamed from: c, reason: collision with root package name */
    private Qp0 f69428c = Qp0.f69662e;

    /* synthetic */ Pp0(Rp0 rp0) {
    }

    public final Pp0 c(Qp0 qp0) {
        this.f69428c = qp0;
        return this;
    }

    public final Pp0 a(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.f69426a = Integer.valueOf(i10);
        return this;
    }

    public final Pp0 b(int i10) throws GeneralSecurityException {
        if (i10 >= 10 && i10 <= 16) {
            this.f69427b = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
    }

    public final Sp0 d() throws GeneralSecurityException {
        Integer num = this.f69426a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.f69427b == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.f69428c != null) {
            return new Sp0(num.intValue(), this.f69427b.intValue(), this.f69428c, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
