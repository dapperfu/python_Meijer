package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* loaded from: classes6.dex */
final class Q7 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f83686a;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Q7 q72 = (Q7) obj;
        int length = this.f83686a.length;
        int length2 = q72.f83686a.length;
        if (length != length2) {
            return length - length2;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f83686a;
            if (i10 >= bArr.length) {
                return 0;
            }
            byte b10 = bArr[i10];
            byte b11 = q72.f83686a[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Q7) {
            return Arrays.equals(this.f83686a, ((Q7) obj).f83686a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f83686a);
    }

    public final String toString() {
        return Pe.a(this.f83686a);
    }
}
