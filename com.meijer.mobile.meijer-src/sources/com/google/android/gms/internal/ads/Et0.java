package com.google.android.gms.internal.ads;

import fsimpl.C14170dq;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Et0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f67390a;

    public final int a() {
        return this.f67390a.length;
    }

    public static Et0 b(byte[] bArr) {
        if (bArr != null) {
            return new Et0(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final byte[] c() {
        byte[] bArr = this.f67390a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Et0) {
            return Arrays.equals(((Et0) obj).f67390a, this.f67390a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f67390a);
    }

    public final String toString() {
        byte[] bArr = this.f67390a;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            sb2.append("0123456789abcdef".charAt((b10 & 255) >> 4));
            sb2.append("0123456789abcdef".charAt(b10 & C14170dq.MULTIPLY));
        }
        return "Bytes(" + sb2.toString() + ")";
    }

    private Et0(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f67390a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }
}
