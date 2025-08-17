package com.google.android.gms.internal.pal;

import java.security.SecureRandom;

/* loaded from: classes6.dex */
public final class We {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f82938a = new Ve();

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f82938a.get()).nextBytes(bArr);
        return bArr;
    }
}
