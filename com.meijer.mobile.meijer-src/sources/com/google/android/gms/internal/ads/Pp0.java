package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes6.dex */
public final class Pp0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f70266a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f70267b = null;

    /* renamed from: c, reason: collision with root package name */
    private Qp0 f70268c = Qp0.f70502e;

    /* synthetic */ Pp0(Rp0 rp0) {
    }

    public final Pp0 c(Qp0 qp0) {
        this.f70268c = qp0;
        return this;
    }

    public final Pp0 a(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.f70266a = Integer.valueOf(i10);
        return this;
    }

    public final Pp0 b(int i10) throws GeneralSecurityException {
        if (i10 >= 10 && i10 <= 16) {
            this.f70267b = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
    }

    public final Sp0 d() throws GeneralSecurityException {
        Integer num = this.f70266a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.f70267b == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.f70268c != null) {
            return new Sp0(num.intValue(), this.f70267b.intValue(), this.f70268c, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
