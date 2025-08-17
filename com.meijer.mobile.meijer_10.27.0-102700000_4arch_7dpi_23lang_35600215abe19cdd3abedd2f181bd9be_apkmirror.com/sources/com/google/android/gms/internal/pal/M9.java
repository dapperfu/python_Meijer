package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class M9 implements B9 {

    /* renamed from: a, reason: collision with root package name */
    private final C10620bf f82768a;

    /* renamed from: b, reason: collision with root package name */
    private final C10620bf f82769b;

    static M9 a(byte[] bArr) throws GeneralSecurityException {
        return new M9(bArr, Ze.c(bArr));
    }

    private M9(byte[] bArr, byte[] bArr2) {
        this.f82768a = C10620bf.b(bArr);
        this.f82769b = C10620bf.b(bArr2);
    }
}
