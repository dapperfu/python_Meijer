package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ads.gc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8120gc {
    static long a(long j10, int i10) {
        if (i10 == 1) {
            return j10;
        }
        int i11 = i10 >> 1;
        long j11 = (j10 * j10) % 1073807359;
        return ((i10 & 1) == 0 ? a(j11, i11) : j10 * (a(j11, i11) % 1073807359)) % 1073807359;
    }

    static String b(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            Qc.p.d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i13 = i12 - 1;
            if (i10 >= i13) {
                sb2.append(strArr[i13]);
                return sb2.toString();
            }
            sb2.append(strArr[i10]);
            sb2.append(' ');
            i10++;
        }
    }

    private static long e(String[] strArr, int i10, int i11) {
        long jA = (C7693cc.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            jA = (((jA * 16785407) % 1073807359) + ((C7693cc.a(strArr[i12]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jA;
    }

    public static void c(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) throws UnsupportedEncodingException {
        int length = strArr.length;
        if (length < 6) {
            d(i10, e(strArr, 0, length), b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jE = e(strArr, 0, 6);
        d(i10, jE, b(strArr, 0, 6), 6, priorityQueue);
        int i12 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i12 >= length2 - 5) {
                return;
            }
            long jA = C7693cc.a(strArr[i12 - 1]);
            long jA2 = C7693cc.a(strArr[i12 + 5]);
            String strB = b(strArr, i12, 6);
            jE = ((((((jE + 1073807359) - ((a(16785407L, 5) * ((jA + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jA2 + 2147483647L) % 1073807359)) % 1073807359;
            d(i10, jE, strB, length2, priorityQueue);
            i12++;
        }
    }

    static void d(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        C8013fc c8013fc = new C8013fc(j10, str, i11);
        if ((priorityQueue.size() != i10 || (((C8013fc) priorityQueue.peek()).f74129c <= c8013fc.f74129c && ((C8013fc) priorityQueue.peek()).f74127a <= c8013fc.f74127a)) && !priorityQueue.contains(c8013fc)) {
            priorityQueue.add(c8013fc);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }
}
