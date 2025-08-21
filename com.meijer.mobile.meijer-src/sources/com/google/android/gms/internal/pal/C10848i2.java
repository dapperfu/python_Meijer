package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.i2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10848i2 {
    public static long a(long j10, int i10) {
        long j11 = i10;
        long j12 = j10 * j11;
        if (j12 / j11 == j10) {
            return j12;
        }
        StringBuilder sb2 = new StringBuilder(67);
        sb2.append("Multiplication overflows a long: ");
        sb2.append(j10);
        sb2.append(" * ");
        sb2.append(i10);
        throw new ArithmeticException(sb2.toString());
    }
}
