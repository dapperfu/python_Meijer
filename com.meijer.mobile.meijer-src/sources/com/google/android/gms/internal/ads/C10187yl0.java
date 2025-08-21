package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.yl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10187yl0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f81107a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f81108b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f81109c = null;

    /* renamed from: d, reason: collision with root package name */
    private C10294zl0 f81110d = C10294zl0.f81309d;

    /* synthetic */ C10187yl0(Al0 al0) {
    }

    public final C10187yl0 d(C10294zl0 c10294zl0) {
        this.f81110d = c10294zl0;
        return this;
    }

    public final C10187yl0 a(int i10) throws GeneralSecurityException {
        if (i10 != 12 && i10 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
        }
        this.f81108b = Integer.valueOf(i10);
        return this;
    }

    public final C10187yl0 b(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f81107a = Integer.valueOf(i10);
        return this;
    }

    public final C10187yl0 c(int i10) throws GeneralSecurityException {
        this.f81109c = 16;
        return this;
    }

    public final Bl0 e() throws GeneralSecurityException {
        Integer num = this.f81107a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f81108b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f81110d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f81109c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.f81108b.intValue();
        this.f81109c.getClass();
        return new Bl0(iIntValue, iIntValue2, 16, this.f81110d, null);
    }
}
