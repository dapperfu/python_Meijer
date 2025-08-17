package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes6.dex */
public final class Vl0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f70914a = null;

    /* renamed from: b, reason: collision with root package name */
    private Wl0 f70915b = Wl0.f71158d;

    /* synthetic */ Vl0(Xl0 xl0) {
    }

    public final Vl0 b(Wl0 wl0) {
        this.f70915b = wl0;
        return this;
    }

    public final Vl0 a(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f70914a = Integer.valueOf(i10);
        return this;
    }

    public final Yl0 c() throws GeneralSecurityException {
        Integer num = this.f70914a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f70915b != null) {
            return new Yl0(num.intValue(), this.f70915b, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }
}
