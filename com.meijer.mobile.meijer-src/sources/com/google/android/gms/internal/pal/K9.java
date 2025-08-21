package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class K9 implements B9 {

    /* renamed from: a, reason: collision with root package name */
    private final C10745bf f83569a;

    /* renamed from: b, reason: collision with root package name */
    private final C10745bf f83570b;

    private K9(byte[] bArr, byte[] bArr2) {
        this.f83569a = C10745bf.b(bArr);
        this.f83570b = C10745bf.b(bArr2);
    }

    static K9 a(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        Ce.e(Ce.j(Ce.k(i10), 1, bArr2), Ce.h(i10, bArr));
        return new K9(bArr, bArr2);
    }
}
