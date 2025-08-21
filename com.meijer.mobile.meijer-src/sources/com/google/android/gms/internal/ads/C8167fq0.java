package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.fq0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8167fq0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f75019a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f75020b = null;

    /* renamed from: c, reason: collision with root package name */
    private C8274gq0 f75021c = null;

    /* renamed from: d, reason: collision with root package name */
    private C8381hq0 f75022d = C8381hq0.f75632e;

    /* synthetic */ C8167fq0(C8487iq0 c8487iq0) {
    }

    public final C8167fq0 a(C8274gq0 c8274gq0) {
        this.f75021c = c8274gq0;
        return this;
    }

    public final C8167fq0 d(C8381hq0 c8381hq0) {
        this.f75022d = c8381hq0;
        return this;
    }

    public final C8593jq0 e() throws GeneralSecurityException {
        Integer num = this.f75019a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f75020b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f75021c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f75022d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f75019a));
        }
        Integer num2 = this.f75020b;
        int iIntValue = num2.intValue();
        C8274gq0 c8274gq0 = this.f75021c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (c8274gq0 == C8274gq0.f75244b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (c8274gq0 == C8274gq0.f75245c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (c8274gq0 == C8274gq0.f75246d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (c8274gq0 == C8274gq0.f75247e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (c8274gq0 != C8274gq0.f75248f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new C8593jq0(this.f75019a.intValue(), this.f75020b.intValue(), this.f75022d, this.f75021c, null);
    }

    public final C8167fq0 b(int i10) throws GeneralSecurityException {
        this.f75019a = Integer.valueOf(i10);
        return this;
    }

    public final C8167fq0 c(int i10) throws GeneralSecurityException {
        this.f75020b = Integer.valueOf(i10);
        return this;
    }
}
