package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.nl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9011nl0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f77971a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f77972b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f77973c = null;

    /* renamed from: d, reason: collision with root package name */
    private Integer f77974d = null;

    /* renamed from: e, reason: collision with root package name */
    private C9118ol0 f77975e = null;

    /* renamed from: f, reason: collision with root package name */
    private C9225pl0 f77976f = C9225pl0.f78478d;

    /* synthetic */ C9011nl0(C9332ql0 c9332ql0) {
    }

    public final C9011nl0 b(C9118ol0 c9118ol0) {
        this.f77975e = c9118ol0;
        return this;
    }

    public final C9011nl0 f(C9225pl0 c9225pl0) {
        this.f77976f = c9225pl0;
        return this;
    }

    public final C9011nl0 a(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f77971a = Integer.valueOf(i10);
        return this;
    }

    public final C9011nl0 c(int i10) throws GeneralSecurityException {
        if (i10 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
        }
        this.f77972b = Integer.valueOf(i10);
        return this;
    }

    public final C9011nl0 d(int i10) throws GeneralSecurityException {
        if (i10 < 12 || i10 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
        }
        this.f77973c = Integer.valueOf(i10);
        return this;
    }

    public final C9011nl0 e(int i10) throws GeneralSecurityException {
        if (i10 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
        }
        this.f77974d = Integer.valueOf(i10);
        return this;
    }

    public final C9438rl0 g() throws GeneralSecurityException {
        if (this.f77971a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.f77972b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.f77973c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.f77974d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f77975e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f77976f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        C9118ol0 c9118ol0 = this.f77975e;
        if (c9118ol0 == C9118ol0.f78259b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (c9118ol0 == C9118ol0.f78260c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (c9118ol0 == C9118ol0.f78261d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (c9118ol0 == C9118ol0.f78262e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (c9118ol0 != C9118ol0.f78263f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new C9438rl0(this.f77971a.intValue(), this.f77972b.intValue(), this.f77973c.intValue(), this.f77974d.intValue(), this.f77976f, this.f77975e, null);
    }
}
