package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.w1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9773w1 extends C7529b0 {
    public C9773w1(final B0 b02, int i10, long j10, long j11) {
        long j12;
        Objects.requireNonNull(b02);
        Y y10 = new Y() { // from class: com.google.android.gms.internal.ads.t1
            @Override // com.google.android.gms.internal.ads.Y
            public final long zza(long j13) {
                return b02.b(j13);
            }
        };
        C9559u1 c9559u1 = new C9559u1(b02, i10, null);
        long jA = b02.a();
        long j13 = b02.f65398j;
        int i11 = b02.f65392d;
        if (i11 > 0) {
            j12 = ((i11 + b02.f65391c) / 2) + 1;
        } else {
            int i12 = b02.f65389a;
            long j14 = 4096;
            if (i12 == b02.f65390b && i12 > 0) {
                j14 = i12;
            }
            j12 = 64 + (((j14 * b02.f65395g) * b02.f65396h) / 8);
        }
        super(y10, c9559u1, jA, 0L, j13, j10, j11, j12, Math.max(6, b02.f65391c));
    }
}
