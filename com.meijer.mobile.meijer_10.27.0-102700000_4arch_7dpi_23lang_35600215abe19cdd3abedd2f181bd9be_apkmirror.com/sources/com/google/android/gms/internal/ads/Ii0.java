package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class Ii0 extends Ji0 {
    public static int b(long j10) {
        int i10 = (int) j10;
        C6657Df0.h(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int c(int i10, int i11, int i12) {
        C6657Df0.j(true, "min (%s) must be less than or equal to max (%s)", i11, 1073741823);
        int[] iArr = {i10, i11};
        int i13 = iArr[0];
        for (char c10 = 1; c10 < 2; c10 = 2) {
            int i14 = iArr[1];
            if (i14 > i13) {
                i13 = i14;
            }
        }
        int[] iArr2 = {i13, 1073741823};
        int i15 = iArr2[0];
        for (char c11 = 1; c11 < 2; c11 = 2) {
            int i16 = iArr2[1];
            if (i16 < i15) {
                i15 = i16;
            }
        }
        return i15;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        C6657Df0.j(length >= 4, "array too small: %s < %s", length, 4);
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int e(long j10) {
        if (j10 > 2147483647L) {
            return a.e.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static List g(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new Hi0(iArr, 0, length);
    }

    static /* bridge */ /* synthetic */ int a(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer f(java.lang.String r11, int r12) {
        /*
            r11.getClass()
            boolean r12 = r11.isEmpty()
            r0 = 0
            if (r12 == 0) goto Ld
        La:
            r11 = r0
            goto L6f
        Ld:
            r12 = 0
            char r1 = r11.charAt(r12)
            r2 = 45
            if (r1 != r2) goto L17
            r12 = 1
        L17:
            int r3 = r11.length()
            if (r12 != r3) goto L1e
            goto La
        L1e:
            int r3 = r12 + 1
            char r12 = r11.charAt(r12)
            int r12 = com.google.android.gms.internal.ads.Ki0.a(r12)
            if (r12 < 0) goto La
            r4 = 10
            if (r12 < r4) goto L2f
            goto La
        L2f:
            int r12 = -r12
            long r5 = (long) r12
        L31:
            int r12 = r11.length()
            r7 = -9223372036854775808
            if (r3 >= r12) goto L5e
            int r12 = r3 + 1
            char r3 = r11.charAt(r3)
            int r3 = com.google.android.gms.internal.ads.Ki0.a(r3)
            if (r3 < 0) goto La
            if (r3 >= r4) goto La
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 >= 0) goto L51
            goto La
        L51:
            r9 = 10
            long r5 = r5 * r9
            long r9 = (long) r3
            long r7 = r7 + r9
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L5b
            goto La
        L5b:
            long r5 = r5 - r9
            r3 = r12
            goto L31
        L5e:
            if (r1 != r2) goto L65
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            goto L6f
        L65:
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L6a
            goto La
        L6a:
            long r11 = -r5
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
        L6f:
            if (r11 == 0) goto L88
            long r1 = r11.longValue()
            int r12 = r11.intValue()
            long r3 = (long) r12
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 == 0) goto L7f
            goto L88
        L7f:
            int r11 = r11.intValue()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            return r11
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Ii0.f(java.lang.String, int):java.lang.Integer");
    }

    public static int[] h(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
