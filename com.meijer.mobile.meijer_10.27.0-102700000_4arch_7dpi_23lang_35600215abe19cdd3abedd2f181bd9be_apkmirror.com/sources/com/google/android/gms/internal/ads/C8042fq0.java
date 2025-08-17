package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.fq0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8042fq0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f74179a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f74180b = null;

    /* renamed from: c, reason: collision with root package name */
    private C8149gq0 f74181c = null;

    /* renamed from: d, reason: collision with root package name */
    private C8256hq0 f74182d = C8256hq0.f74792e;

    /* synthetic */ C8042fq0(C8362iq0 c8362iq0) {
    }

    public final C8042fq0 a(C8149gq0 c8149gq0) {
        this.f74181c = c8149gq0;
        return this;
    }

    public final C8042fq0 d(C8256hq0 c8256hq0) {
        this.f74182d = c8256hq0;
        return this;
    }

    public final C8468jq0 e() throws GeneralSecurityException {
        Integer num = this.f74179a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f74180b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f74181c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f74182d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f74179a));
        }
        Integer num2 = this.f74180b;
        int iIntValue = num2.intValue();
        C8149gq0 c8149gq0 = this.f74181c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (c8149gq0 == C8149gq0.f74404b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (c8149gq0 == C8149gq0.f74405c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (c8149gq0 == C8149gq0.f74406d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (c8149gq0 == C8149gq0.f74407e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (c8149gq0 != C8149gq0.f74408f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new C8468jq0(this.f74179a.intValue(), this.f74180b.intValue(), this.f74182d, this.f74181c, null);
    }

    public final C8042fq0 b(int i10) throws GeneralSecurityException {
        this.f74179a = Integer.valueOf(i10);
        return this;
    }

    public final C8042fq0 c(int i10) throws GeneralSecurityException {
        this.f74180b = Integer.valueOf(i10);
        return this;
    }
}
