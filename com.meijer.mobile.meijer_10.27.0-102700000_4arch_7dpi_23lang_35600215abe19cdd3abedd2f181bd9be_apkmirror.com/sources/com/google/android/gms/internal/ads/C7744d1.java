package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.d1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7744d1 {
    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static C7424a1 c(GQ gq2, boolean z10, boolean z11) throws zzbc {
        if (z10) {
            d(3, gq2, false);
        }
        String strB = gq2.b((int) gq2.I(), StandardCharsets.UTF_8);
        int length = strB.length();
        long jI = gq2.I();
        String[] strArr = new String[(int) jI];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jI; i10++) {
            String strB2 = gq2.b((int) gq2.I(), StandardCharsets.UTF_8);
            strArr[i10] = strB2;
            length2 = length2 + 4 + strB2.length();
        }
        if (z11 && (gq2.C() & 1) == 0) {
            throw zzbc.a("framing bit expected to be set", null);
        }
        return new C7424a1(strB, strArr, length2 + 1);
    }

    public static C8651lb b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = OV.f69091a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                C9917xL.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(S1.a(new GQ(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    C9917xL.g("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new L2(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C8651lb(arrayList);
    }

    public static boolean d(int i10, GQ gq2, boolean z10) throws zzbc {
        if (gq2.r() < 7) {
            if (z10) {
                return false;
            }
            throw zzbc.a("too short header: " + gq2.r(), null);
        }
        if (gq2.C() != i10) {
            if (z10) {
                return false;
            }
            throw zzbc.a("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        }
        if (gq2.C() == 118 && gq2.C() == 111 && gq2.C() == 114 && gq2.C() == 98 && gq2.C() == 105 && gq2.C() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw zzbc.a("expected characters 'vorbis'", null);
    }
}
