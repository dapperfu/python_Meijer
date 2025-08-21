package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.o1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10446o1 {
    static String a(A a10) {
        String str;
        C10449p1 c10449p1 = new C10449p1(a10);
        StringBuilder sb2 = new StringBuilder(c10449p1.size());
        for (int i10 = 0; i10 < c10449p1.size(); i10++) {
            int iG0 = c10449p1.g0(i10);
            if (iG0 == 34) {
                str = "\\\"";
            } else if (iG0 == 39) {
                str = "\\'";
            } else if (iG0 != 92) {
                switch (iG0) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iG0 < 32 || iG0 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((iG0 >>> 6) & 3) + 48));
                            sb2.append((char) (((iG0 >>> 3) & 7) + 48));
                            iG0 = (iG0 & 7) + 48;
                        }
                        sb2.append((char) iG0);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
