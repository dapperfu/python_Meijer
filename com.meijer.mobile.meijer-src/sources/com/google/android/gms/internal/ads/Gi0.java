package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Gi0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f68107a;

    /* renamed from: b, reason: collision with root package name */
    private final int f68108b;

    private Gi0(int[] iArr, int i10, int i11) {
        this.f68107a = iArr;
        this.f68108b = i11;
    }

    public static Gi0 b(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new Gi0(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Gi0)) {
            return false;
        }
        Gi0 gi0 = (Gi0) obj;
        if (this.f68108b != gi0.f68108b) {
            return false;
        }
        for (int i10 = 0; i10 < this.f68108b; i10++) {
            if (a(i10) != gi0.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f68108b; i11++) {
            i10 = (i10 * 31) + this.f68107a[i11];
        }
        return i10;
    }

    public final int a(int i10) {
        C6782Df0.a(i10, this.f68108b, "index");
        return this.f68107a[i10];
    }

    public final String toString() {
        int i10 = this.f68108b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        sb2.append(this.f68107a[0]);
        for (int i11 = 1; i11 < this.f68108b; i11++) {
            sb2.append(", ");
            sb2.append(this.f68107a[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
