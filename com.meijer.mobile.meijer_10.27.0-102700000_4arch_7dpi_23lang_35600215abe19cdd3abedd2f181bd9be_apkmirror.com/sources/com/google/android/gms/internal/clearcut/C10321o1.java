package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.o1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10321o1 {
    static String a(A a10) {
        String str;
        C10324p1 c10324p1 = new C10324p1(a10);
        StringBuilder sb2 = new StringBuilder(c10324p1.size());
        for (int i10 = 0; i10 < c10324p1.size(); i10++) {
            int iE0 = c10324p1.e0(i10);
            if (iE0 == 34) {
                str = "\\\"";
            } else if (iE0 == 39) {
                str = "\\'";
            } else if (iE0 != 92) {
                switch (iE0) {
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
                        if (iE0 < 32 || iE0 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((iE0 >>> 6) & 3) + 48));
                            sb2.append((char) (((iE0 >>> 3) & 7) + 48));
                            iE0 = (iE0 & 7) + 48;
                        }
                        sb2.append((char) iE0);
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
