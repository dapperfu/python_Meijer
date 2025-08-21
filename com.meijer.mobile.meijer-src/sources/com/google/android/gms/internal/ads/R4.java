package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes6.dex */
final class R4 {
    public static S4 a(S4 s42, String[] strArr, Map map) {
        int length;
        int i10 = 0;
        if (s42 == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (S4) map.get(strArr[0]);
            }
            if (length2 > 1) {
                S4 s43 = new S4();
                while (i10 < length2) {
                    s43.v((S4) map.get(strArr[i10]));
                    i10++;
                }
                return s43;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                s42.v((S4) map.get(strArr[0]));
                return s42;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i10 < length) {
                    s42.v((S4) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return s42;
    }
}
