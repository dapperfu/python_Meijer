package Mg;

import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes7.dex */
final class f implements g {
    private static void e(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z10 = true;
            if (length == 1) {
                hVar.p();
                int iA = hVar.g().a() - hVar.a();
                int iF = hVar.f();
                if (iF > iA) {
                    hVar.q(hVar.a() + 1);
                    iA = hVar.g().a() - hVar.a();
                }
                if (iF <= iA && iA <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i10 = length - 1;
            String strC = c(charSequence);
            if (hVar.i() || i10 > 2) {
                z10 = false;
            }
            if (i10 <= 2) {
                hVar.q(hVar.a() + i10);
                if (hVar.g().a() - hVar.a() >= 3) {
                    hVar.q(hVar.a() + strC.length());
                    z10 = false;
                }
            }
            if (z10) {
                hVar.k();
                hVar.f19546f -= i10;
            } else {
                hVar.s(strC);
            }
        } finally {
            hVar.o(0);
        }
    }

    public int d() {
        return 4;
    }

    private static void b(char c10, StringBuilder sb2) {
        if (c10 >= ' ' && c10 <= '?') {
            sb2.append(c10);
        } else if (c10 < '@' || c10 > '^') {
            j.e(c10);
        } else {
            sb2.append((char) (c10 - '@'));
        }
    }

    @Override // Mg.g
    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            b(hVar.c(), sb2);
            hVar.f19546f++;
            if (sb2.length() >= 4) {
                hVar.s(c(sb2));
                sb2.delete(0, 4);
                if (j.n(hVar.d(), hVar.f19546f, d()) != d()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        sb2.append((char) 31);
        e(hVar, sb2);
    }

    f() {
    }

    private static String c(CharSequence charSequence) {
        char cCharAt;
        char cCharAt2;
        int length = charSequence.length();
        if (length != 0) {
            char cCharAt3 = 0;
            char cCharAt4 = charSequence.charAt(0);
            if (length >= 2) {
                cCharAt = charSequence.charAt(1);
            } else {
                cCharAt = 0;
            }
            if (length >= 3) {
                cCharAt2 = charSequence.charAt(2);
            } else {
                cCharAt2 = 0;
            }
            if (length >= 4) {
                cCharAt3 = charSequence.charAt(3);
            }
            int i10 = (cCharAt4 << 18) + (cCharAt << '\f') + (cCharAt2 << 6) + cCharAt3;
            char c10 = (char) ((i10 >> 16) & l3.f92484c);
            char c11 = (char) ((i10 >> 8) & l3.f92484c);
            char c12 = (char) (i10 & l3.f92484c);
            StringBuilder sb2 = new StringBuilder(3);
            sb2.append(c10);
            if (length >= 2) {
                sb2.append(c11);
            }
            if (length >= 3) {
                sb2.append(c12);
            }
            return sb2.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }
}
