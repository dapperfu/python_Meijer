package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes6.dex */
public final class Kl0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f68996a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f68997b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f68998c = null;

    /* renamed from: d, reason: collision with root package name */
    private Ll0 f68999d = Ll0.f69262d;

    /* synthetic */ Kl0(Ml0 ml0) {
    }

    public final Kl0 d(Ll0 ll0) {
        this.f68999d = ll0;
        return this;
    }

    public final Kl0 a(int i10) throws GeneralSecurityException {
        this.f68997b = 12;
        return this;
    }

    public final Kl0 b(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f68996a = Integer.valueOf(i10);
        return this;
    }

    public final Kl0 c(int i10) throws GeneralSecurityException {
        this.f68998c = 16;
        return this;
    }

    public final Nl0 e() throws GeneralSecurityException {
        Integer num = this.f68996a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f68999d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f68997b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f68998c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.f68997b.getClass();
        this.f68998c.getClass();
        return new Nl0(iIntValue, 12, 16, this.f68999d, null);
    }
}
