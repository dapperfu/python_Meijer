package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.jG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8539jG0 extends C8753lG0 {
    protected C8539jG0(C9867vm c9867vm, int[] iArr, int i10, InterfaceC8008eH0 interfaceC8008eH0, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, HC hc2) {
        super(c9867vm, iArr, 0);
        AbstractC8042eh0.r(list);
    }

    private static void b(List list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            C7723bh0 c7723bh0 = (C7723bh0) list.get(i11);
            if (c7723bh0 != null) {
                c7723bh0.g(new C8327hG0(j10, jArr[i11]));
            }
        }
    }

    static /* bridge */ /* synthetic */ AbstractC8042eh0 a(OG0[] og0Arr) {
        int i10;
        int i11;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                break;
            }
            OG0 og0 = og0Arr[i13];
            if (og0 == null || og0.f69898b.length <= 1) {
                arrayList.add(null);
            } else {
                C7723bh0 c7723bh0 = new C7723bh0();
                c7723bh0.g(new C8327hG0(0L, 0L));
                arrayList.add(c7723bh0);
            }
            i13++;
        }
        long[][] jArr2 = new long[2][];
        for (int i14 = 0; i14 < 2; i14++) {
            OG0 og02 = og0Arr[i14];
            if (og02 == null) {
                jArr2[i14] = new long[0];
            } else {
                jArr2[i14] = new long[og02.f69898b.length];
                int i15 = 0;
                while (true) {
                    int[] iArr = og02.f69898b;
                    if (i15 >= iArr.length) {
                        break;
                    }
                    long j10 = og02.f69897a.b(iArr[i15]).f66499j;
                    long[] jArr3 = jArr2[i14];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr3[i15] = j10;
                    i15++;
                }
                Arrays.sort(jArr2[i14]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i16 = 0; i16 < 2; i16++) {
            long[] jArr5 = jArr2[i16];
            jArr4[i16] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        b(arrayList, jArr4);
        InterfaceC9217ph0 interfaceC9217ph0C = C7024Kh0.b(AbstractC7193Ph0.c()).b(2).c();
        int i17 = 0;
        while (i17 < 2) {
            int length = jArr2[i17].length;
            if (length <= i10) {
                i11 = i12;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i18 = i12;
                while (true) {
                    long[] jArr6 = jArr2[i17];
                    double dLog = 0.0d;
                    if (i18 >= jArr6.length) {
                        break;
                    }
                    int i19 = i12;
                    long[][] jArr7 = jArr2;
                    long j11 = jArr6[i18];
                    if (j11 != -1) {
                        dLog = Math.log(j11);
                    }
                    dArr[i18] = dLog;
                    i18++;
                    i12 = i19;
                    jArr2 = jArr7;
                }
                i11 = i12;
                jArr = jArr2;
                int i20 = length - 1;
                double d10 = dArr[i20] - dArr[i11];
                int i21 = i11;
                while (i21 < i20) {
                    double d11 = dArr[i21];
                    i21++;
                    interfaceC9217ph0C.a(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i21]) * 0.5d) - dArr[i11]) / d10), Integer.valueOf(i17));
                    i10 = i10;
                }
            }
            i17++;
            i12 = i11;
            jArr2 = jArr;
            i10 = i10;
        }
        int i22 = i12;
        long[][] jArr8 = jArr2;
        AbstractC8042eh0 abstractC8042eh0R = AbstractC8042eh0.r(interfaceC9217ph0C.zzr());
        for (int i23 = i22; i23 < abstractC8042eh0R.size(); i23++) {
            int iIntValue = ((Integer) abstractC8042eh0R.get(i23)).intValue();
            int i24 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i24;
            jArr4[iIntValue] = jArr8[iIntValue][i24];
            b(arrayList, jArr4);
        }
        for (int i25 = i22; i25 < 2; i25++) {
            if (arrayList.get(i25) != null) {
                long j12 = jArr4[i25];
                jArr4[i25] = j12 + j12;
            }
        }
        b(arrayList, jArr4);
        C7723bh0 c7723bh02 = new C7723bh0();
        while (i22 < arrayList.size()) {
            C7723bh0 c7723bh03 = (C7723bh0) arrayList.get(i22);
            c7723bh02.g(c7723bh03 == null ? AbstractC8042eh0.t() : c7723bh03.j());
            i22++;
        }
        return c7723bh02.j();
    }
}
