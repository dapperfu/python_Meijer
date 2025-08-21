package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f71807a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f71808b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71809c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71810d;

    public W0(int i10, byte[] bArr, int i11, int i12) {
        this.f71807a = i10;
        this.f71808b = bArr;
        this.f71809c = i11;
        this.f71810d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && W0.class == obj.getClass()) {
            W0 w02 = (W0) obj;
            if (this.f71807a == w02.f71807a && this.f71809c == w02.f71809c && this.f71810d == w02.f71810d && Arrays.equals(this.f71808b, w02.f71808b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f71807a * 31) + Arrays.hashCode(this.f71808b)) * 31) + this.f71809c) * 31) + this.f71810d;
    }
}
