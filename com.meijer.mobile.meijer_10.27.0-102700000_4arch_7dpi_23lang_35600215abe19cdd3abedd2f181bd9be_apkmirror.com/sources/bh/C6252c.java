package bh;

import Gg.p;
import Zg.h;
import Zg.j;
import com.google.android.gms.common.api.a;
import com.google.zxing.WriterException;
import com.medallia.digital.mobilesdk.l3;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: bh.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6252c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f60274a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    static final Charset f60275b = StandardCharsets.ISO_8859_1;

    private static j m(int i10, Zg.f fVar) throws WriterException {
        for (int i11 = 1; i11 <= 40; i11++) {
            j jVarI = j.i(i11);
            if (v(i10, jVarI, fVar)) {
                return jVarI;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static bh.g n(java.lang.String r6, Zg.f r7, java.util.Map<com.google.zxing.f, ?> r8) throws java.lang.NumberFormatException, com.google.zxing.WriterException {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.C6252c.n(java.lang.String, Zg.f, java.util.Map):bh.g");
    }

    static byte[] o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new Ig.d(Ig.a.f13873l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    private static j t(Zg.f fVar, h hVar, Gg.a aVar, Gg.a aVar2) throws WriterException {
        return m(i(hVar, aVar, aVar2, m(i(hVar, aVar, aVar2, j.i(1)), fVar)), fVar);
    }

    /* renamed from: bh.c$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60276a;

        static {
            int[] iArr = new int[h.values().length];
            f60276a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60276a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60276a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60276a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void c(String str, h hVar, Gg.a aVar, Charset charset) throws WriterException {
        int i10 = a.f60276a[hVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
            return;
        }
        if (i10 == 2) {
            b(str, aVar);
            return;
        }
        if (i10 == 3) {
            a(str, aVar, charset);
        } else {
            if (i10 == 4) {
                e(str, aVar);
                return;
            }
            throw new WriterException("Invalid mode: " + hVar);
        }
    }

    private static void d(Gg.d dVar, Gg.a aVar) {
        aVar.c(h.ECI.b(), 4);
        aVar.c(dVar.m(), 8);
    }

    static void e(String str, Gg.a aVar) throws WriterException {
        int i10;
        Charset charset = p.f11459b;
        if (charset == null) {
            throw new WriterException("SJIS Charset not supported on this platform");
        }
        byte[] bytes = str.getBytes(charset);
        if (bytes.length % 2 != 0) {
            throw new WriterException("Kanji byte size not even");
        }
        int length = bytes.length - 1;
        for (int i11 = 0; i11 < length; i11 += 2) {
            int i12 = ((bytes[i11] & 255) << 8) | (bytes[i11 + 1] & 255);
            int i13 = 33088;
            if (i12 >= 33088 && i12 <= 40956) {
                i10 = i12 - i13;
            } else if (i12 < 57408 || i12 > 60351) {
                i10 = -1;
            } else {
                i13 = 49472;
                i10 = i12 - i13;
            }
            if (i10 == -1) {
                throw new WriterException("Invalid byte sequence");
            }
            aVar.c(((i10 >> 8) * 192) + (i10 & l3.f92484c), 13);
        }
    }

    private static h l(String str, Charset charset) {
        Charset charset2 = p.f11459b;
        if (charset2 != null && charset2.equals(charset) && s(str)) {
            return h.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z11 = true;
            } else {
                if (p(cCharAt) == -1) {
                    return h.BYTE;
                }
                z10 = true;
            }
        }
        return z10 ? h.ALPHANUMERIC : z11 ? h.NUMERIC : h.BYTE;
    }

    static int p(int i10) {
        int[] iArr = f60274a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    static void q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) throws WriterException {
        if (i13 >= i12) {
            throw new WriterException("Block ID too large");
        }
        int i14 = i10 % i12;
        int i15 = i12 - i14;
        int i16 = i10 / i12;
        int i17 = i16 + 1;
        int i18 = i11 / i12;
        int i19 = i18 + 1;
        int i20 = i16 - i18;
        int i21 = i17 - i19;
        if (i20 != i21) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
        } else {
            iArr[0] = i19;
            iArr2[0] = i21;
        }
    }

    static boolean s(String str) {
        byte[] bytes = str.getBytes(p.f11459b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10 += 2) {
            int i11 = bytes[i10] & 255;
            if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                return false;
            }
        }
        return true;
    }

    static void u(int i10, Gg.a aVar) throws WriterException {
        int i11 = i10 * 8;
        if (aVar.l() > i11) {
            throw new WriterException("data bits cannot fit in the QR Code" + aVar.l() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && aVar.l() < i11; i12++) {
            aVar.a(false);
        }
        int iL = aVar.l() & 7;
        if (iL > 0) {
            while (iL < 8) {
                aVar.a(false);
                iL++;
            }
        }
        int iM = i10 - aVar.m();
        for (int i13 = 0; i13 < iM; i13++) {
            aVar.c((i13 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.l() != i11) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    static void a(String str, Gg.a aVar, Charset charset) {
        for (byte b10 : str.getBytes(charset)) {
            aVar.c(b10, 8);
        }
    }

    static void b(CharSequence charSequence, Gg.a aVar) throws WriterException {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iP = p(charSequence.charAt(i10));
            if (iP != -1) {
                int i11 = i10 + 1;
                if (i11 < length) {
                    int iP2 = p(charSequence.charAt(i11));
                    if (iP2 != -1) {
                        aVar.c((iP * 45) + iP2, 11);
                        i10 += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    aVar.c(iP, 6);
                    i10 = i11;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    static void f(int i10, j jVar, h hVar, Gg.a aVar) throws WriterException {
        int iE = hVar.e(jVar);
        int i11 = 1 << iE;
        if (i10 < i11) {
            aVar.c(i10, iE);
            return;
        }
        throw new WriterException(i10 + " is bigger than " + (i11 - 1));
    }

    static void g(h hVar, Gg.a aVar) {
        aVar.c(hVar.b(), 4);
    }

    static void h(CharSequence charSequence, Gg.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iCharAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.c((iCharAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.c((iCharAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.c(iCharAt, 4);
                }
            }
        }
    }

    private static int i(h hVar, Gg.a aVar, Gg.a aVar2, j jVar) {
        return aVar.l() + hVar.e(jVar) + aVar2.l();
    }

    private static int j(C6251b c6251b) {
        return C6253d.a(c6251b) + C6253d.c(c6251b) + C6253d.d(c6251b) + C6253d.e(c6251b);
    }

    private static int k(Gg.a aVar, Zg.f fVar, j jVar, C6251b c6251b) throws WriterException {
        int i10 = a.e.API_PRIORITY_OTHER;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            C6254e.a(aVar, fVar, jVar, i12, c6251b);
            int iJ = j(c6251b);
            if (iJ < i10) {
                i11 = i12;
                i10 = iJ;
            }
        }
        return i11;
    }

    static Gg.a r(Gg.a aVar, int i10, int i11, int i12) throws WriterException {
        if (aVar.m() == i11) {
            ArrayList arrayList = new ArrayList(i12);
            int i13 = 0;
            int i14 = 0;
            int iMax = 0;
            int iMax2 = 0;
            while (i13 < i12) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int i15 = i10;
                int i16 = i11;
                int i17 = i12;
                q(i15, i16, i17, i13, iArr, iArr2);
                int i18 = iArr[0];
                byte[] bArr = new byte[i18];
                aVar.s(i14 * 8, bArr, 0, i18);
                byte[] bArrO = o(bArr, iArr2[0]);
                arrayList.add(new C6250a(bArr, bArrO));
                iMax = Math.max(iMax, i18);
                iMax2 = Math.max(iMax2, bArrO.length);
                i14 += iArr[0];
                i13++;
                i10 = i15;
                i11 = i16;
                i12 = i17;
            }
            int i19 = i10;
            if (i11 == i14) {
                Gg.a aVar2 = new Gg.a();
                for (int i20 = 0; i20 < iMax; i20++) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        byte[] bArrA = ((C6250a) it.next()).a();
                        if (i20 < bArrA.length) {
                            aVar2.c(bArrA[i20], 8);
                        }
                    }
                }
                for (int i21 = 0; i21 < iMax2; i21++) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        byte[] bArrB = ((C6250a) it2.next()).b();
                        if (i21 < bArrB.length) {
                            aVar2.c(bArrB[i21], 8);
                        }
                    }
                }
                if (i19 == aVar2.m()) {
                    return aVar2;
                }
                throw new WriterException("Interleaving error: " + i19 + " and " + aVar2.m() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    static boolean v(int i10, j jVar, Zg.f fVar) {
        if (jVar.h() - jVar.f(fVar).d() >= (i10 + 7) / 8) {
            return true;
        }
        return false;
    }
}
