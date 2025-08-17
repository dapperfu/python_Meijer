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
    public static com.google.android.gms.internal.measurement.InterfaceC10498q a(java.lang.String r25, com.google.android.gms.internal.measurement.C10399f r26, com.google.android.gms.internal.measurement.U1 r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 2028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D.a(java.lang.String, com.google.android.gms.internal.measurement.f, com.google.android.gms.internal.measurement.U1, java.util.List):com.google.android.gms.internal.measurement.q");
    }

    private static InterfaceC10498q b(C10399f c10399f, U1 u12, List list, boolean z10) {
        InterfaceC10498q interfaceC10498qB;
        C10545v2.b("reduce", 1, list);
        C10545v2.c("reduce", 2, list);
        InterfaceC10498q interfaceC10498qA = u12.a((InterfaceC10498q) list.get(0));
        if (!(interfaceC10498qA instanceof AbstractC10444k)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC10498qB = u12.a((InterfaceC10498q) list.get(1));
            if (interfaceC10498qB instanceof C10417h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c10399f.m() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC10498qB = null;
        }
        AbstractC10444k abstractC10444k = (AbstractC10444k) interfaceC10498qA;
        int iM = c10399f.m();
        int i10 = z10 ? 0 : iM - 1;
        int i11 = z10 ? iM - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (interfaceC10498qB == null) {
            interfaceC10498qB = c10399f.o(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (c10399f.q(i10)) {
                interfaceC10498qB = abstractC10444k.b(u12, Arrays.asList(interfaceC10498qB, c10399f.o(i10), new C10435j(Double.valueOf(i10)), c10399f));
                if (interfaceC10498qB instanceof C10417h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return interfaceC10498qB;
    }

    private static C10399f c(C10399f c10399f, U1 u12, AbstractC10444k abstractC10444k, Boolean bool, Boolean bool2) {
        C10399f c10399f2 = new C10399f();
        Iterator itL = c10399f.l();
        while (itL.hasNext()) {
            int iIntValue = ((Integer) itL.next()).intValue();
            if (c10399f.q(iIntValue)) {
                InterfaceC10498q interfaceC10498qB = abstractC10444k.b(u12, Arrays.asList(c10399f.o(iIntValue), new C10435j(Double.valueOf(iIntValue)), c10399f));
                if (interfaceC10498qB.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || interfaceC10498qB.zze().equals(bool2)) {
                    c10399f2.p(iIntValue, interfaceC10498qB);
                }
            }
        }
        return c10399f2;
    }
}
