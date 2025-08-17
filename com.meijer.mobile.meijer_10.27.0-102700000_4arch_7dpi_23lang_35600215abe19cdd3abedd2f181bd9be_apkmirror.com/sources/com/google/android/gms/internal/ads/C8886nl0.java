package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.nl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8886nl0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f77131a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f77132b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f77133c = null;

    /* renamed from: d, reason: collision with root package name */
    private Integer f77134d = null;

    /* renamed from: e, reason: collision with root package name */
    private C8993ol0 f77135e = null;

    /* renamed from: f, reason: collision with root package name */
    private C9100pl0 f77136f = C9100pl0.f77638d;

    /* synthetic */ C8886nl0(C9207ql0 c9207ql0) {
    }

    public final C8886nl0 b(C8993ol0 c8993ol0) {
        this.f77135e = c8993ol0;
        return this;
    }

    public final C8886nl0 f(C9100pl0 c9100pl0) {
        this.f77136f = c9100pl0;
        return this;
    }

    public final C8886nl0 a(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f77131a = Integer.valueOf(i10);
        return this;
    }

    public final C8886nl0 c(int i10) throws GeneralSecurityException {
        if (i10 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
        }
        this.f77132b = Integer.valueOf(i10);
        return this;
    }

    public final C8886nl0 d(int i10) throws GeneralSecurityException {
        if (i10 < 12 || i10 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
        }
        this.f77133c = Integer.valueOf(i10);
        return this;
    }

    public final C8886nl0 e(int i10) throws GeneralSecurityException {
        if (i10 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
        }
        this.f77134d = Integer.valueOf(i10);
        return this;
    }

    public final C9313rl0 g() throws GeneralSecurityException {
        if (this.f77131a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.f77132b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.f77133c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.f77134d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f77135e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f77136f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        C8993ol0 c8993ol0 = this.f77135e;
        if (c8993ol0 == C8993ol0.f77419b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (c8993ol0 == C8993ol0.f77420c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (c8993ol0 == C8993ol0.f77421d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (c8993ol0 == C8993ol0.f77422e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (c8993ol0 != C8993ol0.f77423f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new C9313rl0(this.f77131a.intValue(), this.f77132b.intValue(), this.f77133c.intValue(), this.f77134d.intValue(), this.f77136f, this.f77135e, null);
    }
}
