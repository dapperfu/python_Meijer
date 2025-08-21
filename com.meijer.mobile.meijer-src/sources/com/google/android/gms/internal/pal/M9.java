package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class M9 implements B9 {

    /* renamed from: a, reason: collision with root package name */
    private final C10745bf f83608a;

    /* renamed from: b, reason: collision with root package name */
    private final C10745bf f83609b;

    static M9 a(byte[] bArr) throws GeneralSecurityException {
        return new M9(bArr, Ze.c(bArr));
    }

    private M9(byte[] bArr, byte[] bArr2) {
        this.f83608a = C10745bf.b(bArr);
        this.f83609b = C10745bf.b(bArr2);
    }
}
