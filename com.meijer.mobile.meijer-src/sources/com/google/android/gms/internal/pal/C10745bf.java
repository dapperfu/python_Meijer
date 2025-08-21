package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.pal.bf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10745bf {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f83908a;

    public final int a() {
        return this.f83908a.length;
    }

    public static C10745bf b(byte[] bArr) {
        if (bArr != null) {
            return new C10745bf(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final byte[] c() {
        byte[] bArr = this.f83908a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10745bf) {
            return Arrays.equals(((C10745bf) obj).f83908a, this.f83908a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f83908a);
    }

    public final String toString() {
        return "Bytes(" + Pe.a(this.f83908a) + ")";
    }

    private C10745bf(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f83908a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }
}
