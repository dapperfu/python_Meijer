package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f70967a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f70968b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70969c;

    /* renamed from: d, reason: collision with root package name */
    public final int f70970d;

    public W0(int i10, byte[] bArr, int i11, int i12) {
        this.f70967a = i10;
        this.f70968b = bArr;
        this.f70969c = i11;
        this.f70970d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && W0.class == obj.getClass()) {
            W0 w02 = (W0) obj;
            if (this.f70967a == w02.f70967a && this.f70969c == w02.f70969c && this.f70970d == w02.f70970d && Arrays.equals(this.f70968b, w02.f70968b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f70967a * 31) + Arrays.hashCode(this.f70968b)) * 31) + this.f70969c) * 31) + this.f70970d;
    }
}
