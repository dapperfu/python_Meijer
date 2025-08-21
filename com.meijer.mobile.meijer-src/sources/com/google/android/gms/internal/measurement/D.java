package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class D {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.InterfaceC10623q a(java.lang.String r25, com.google.android.gms.internal.measurement.C10524f r26, com.google.android.gms.internal.measurement.U1 r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 2028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D.a(java.lang.String, com.google.android.gms.internal.measurement.f, com.google.android.gms.internal.measurement.U1, java.util.List):com.google.android.gms.internal.measurement.q");
    }

    private static InterfaceC10623q b(C10524f c10524f, U1 u12, List list, boolean z10) {
        InterfaceC10623q interfaceC10623qB;
        C10670v2.b("reduce", 1, list);
        C10670v2.c("reduce", 2, list);
        InterfaceC10623q interfaceC10623qA = u12.a((InterfaceC10623q) list.get(0));
        if (!(interfaceC10623qA instanceof AbstractC10569k)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC10623qB = u12.a((InterfaceC10623q) list.get(1));
            if (interfaceC10623qB instanceof C10542h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c10524f.m() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC10623qB = null;
        }
        AbstractC10569k abstractC10569k = (AbstractC10569k) interfaceC10623qA;
        int iM = c10524f.m();
        int i10 = z10 ? 0 : iM - 1;
        int i11 = z10 ? iM - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (interfaceC10623qB == null) {
            interfaceC10623qB = c10524f.o(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (c10524f.q(i10)) {
                interfaceC10623qB = abstractC10569k.b(u12, Arrays.asList(interfaceC10623qB, c10524f.o(i10), new C10560j(Double.valueOf(i10)), c10524f));
                if (interfaceC10623qB instanceof C10542h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return interfaceC10623qB;
    }

    private static C10524f c(C10524f c10524f, U1 u12, AbstractC10569k abstractC10569k, Boolean bool, Boolean bool2) {
        C10524f c10524f2 = new C10524f();
        Iterator itL = c10524f.l();
        while (itL.hasNext()) {
            int iIntValue = ((Integer) itL.next()).intValue();
            if (c10524f.q(iIntValue)) {
                InterfaceC10623q interfaceC10623qB = abstractC10569k.b(u12, Arrays.asList(c10524f.o(iIntValue), new C10560j(Double.valueOf(iIntValue)), c10524f));
                if (interfaceC10623qB.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || interfaceC10623qB.zze().equals(bool2)) {
                    c10524f2.p(iIntValue, interfaceC10623qB);
                }
            }
        }
        return c10524f2;
    }
}
