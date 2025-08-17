package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
final class W4 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f71000c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f71001d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final GQ f71002a = new GQ();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f71003b = new StringBuilder();

    static void c(GQ gq2) {
        while (true) {
            for (boolean z10 = true; gq2.r() > 0 && z10; z10 = false) {
                char c10 = (char) gq2.n()[gq2.t()];
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    gq2.m(1);
                } else {
                    int iT = gq2.t();
                    int iU = gq2.u();
                    byte[] bArrN = gq2.n();
                    if (iT + 2 <= iU) {
                        int i10 = iT + 1;
                        if (bArrN[iT] == 47) {
                            int i11 = iT + 2;
                            if (bArrN[i10] == 42) {
                                while (true) {
                                    int i12 = i11 + 1;
                                    if (i12 >= iU) {
                                        break;
                                    }
                                    if (((char) bArrN[i11]) == '*' && ((char) bArrN[i12]) == '/') {
                                        iU = i11 + 2;
                                        i11 = iU;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                gq2.m(iU - gq2.t());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String d(GQ gq2, StringBuilder sb2) {
        boolean z10;
        char c10;
        sb2.setLength(0);
        int iT = gq2.t();
        int iU = gq2.u();
        loop0: while (true) {
            for (false; iT < iU && !z10; true) {
                c10 = (char) gq2.n()[iT];
                z10 = (c10 < 'A' || c10 > 'Z') && (c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_');
            }
            sb2.append(c10);
            iT++;
        }
        gq2.m(iT - gq2.t());
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0318, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(com.google.android.gms.internal.ads.GQ r18) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.W4.b(com.google.android.gms.internal.ads.GQ):java.util.List");
    }

    static String a(GQ gq2, StringBuilder sb2) {
        c(gq2);
        if (gq2.r() == 0) {
            return null;
        }
        String strD = d(gq2, sb2);
        if (!"".equals(strD)) {
            return strD;
        }
        char C10 = (char) gq2.C();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C10);
        return sb3.toString();
    }
}
