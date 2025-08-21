package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Tv0 {
    static String a(Zt0 zt0) {
        StringBuilder sb2 = new StringBuilder(zt0.k());
        for (int i10 = 0; i10 < zt0.k(); i10++) {
            byte bE = zt0.e(i10);
            if (bE == 34) {
                sb2.append("\\\"");
            } else if (bE == 39) {
                sb2.append("\\'");
            } else if (bE != 92) {
                switch (bE) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bE < 32 || bE > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bE >>> 6) & 3) + 48));
                            sb2.append((char) (((bE >>> 3) & 7) + 48));
                            sb2.append((char) ((bE & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bE);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
