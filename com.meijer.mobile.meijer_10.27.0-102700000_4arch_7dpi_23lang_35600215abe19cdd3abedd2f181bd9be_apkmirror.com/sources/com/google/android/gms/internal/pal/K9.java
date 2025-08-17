package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class K9 implements B9 {

    /* renamed from: a, reason: collision with root package name */
    private final C10620bf f82729a;

    /* renamed from: b, reason: collision with root package name */
    private final C10620bf f82730b;

    private K9(byte[] bArr, byte[] bArr2) {
        this.f82729a = C10620bf.b(bArr);
        this.f82730b = C10620bf.b(bArr2);
    }

    static K9 a(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        Ce.e(Ce.j(Ce.k(i10), 1, bArr2), Ce.h(i10, bArr));
        return new K9(bArr, bArr2);
    }
}
