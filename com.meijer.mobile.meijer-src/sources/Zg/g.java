package Zg;

import Ig.i;
import Ig.n;
import com.google.zxing.WriterException;
import fsimpl.C14170dq;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes8.dex */
final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f43827c;

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f43825a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, C14170dq.DARKEN, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f43826b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, C14170dq.DARKEN, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f43828d = new byte[128];

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f43829e = StandardCharsets.ISO_8859_1;

    private static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        String f43831a;

        /* synthetic */ b(String str, a aVar) {
            this(str);
        }

        @Override // Ig.i
        public boolean a(int i10) {
            return false;
        }

        @Override // Ig.i
        public int b(int i10) {
            return -1;
        }

        private b(String str) {
            this.f43831a = str;
        }

        @Override // Ig.i
        public char charAt(int i10) {
            return this.f43831a.charAt(i10);
        }

        @Override // Ig.i
        public int length() {
            return this.f43831a.length();
        }

        @Override // Ig.i
        public CharSequence subSequence(int i10, int i11) {
            return this.f43831a.subSequence(i10, i11);
        }

        public String toString() {
            return this.f43831a;
        }
    }

    private static void d(byte[] bArr, int i10, int i11, int i12, StringBuilder sb2) {
        int i13;
        if (i11 == 1 && i12 == 0) {
            sb2.append((char) 913);
        } else if (i11 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        if (i11 >= 6) {
            char[] cArr = new char[5];
            i13 = i10;
            while ((i10 + i11) - i13 >= 6) {
                long j10 = 0;
                for (int i14 = 0; i14 < 6; i14++) {
                    j10 = (j10 << 8) + (bArr[i13 + i14] & 255);
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    cArr[i15] = (char) (j10 % 900);
                    j10 /= 900;
                }
                for (int i16 = 4; i16 >= 0; i16--) {
                    sb2.append(cArr[i16]);
                }
                i13 += 6;
            }
        } else {
            i13 = i10;
        }
        while (i13 < i10 + i11) {
            sb2.append((char) (bArr[i13] & 255));
            i13++;
        }
    }

    private static void f(i iVar, int i10, int i11, int i12, StringBuilder sb2) throws WriterException {
        int iMin = Math.min(i11 + i10, iVar.length());
        int i13 = i10;
        while (true) {
            if (i13 >= iMin || !iVar.a(i13)) {
                int i14 = i13;
                while (i14 < iMin && !iVar.a(i14)) {
                    i14++;
                }
                int i15 = i14 - i13;
                if (i15 <= 0) {
                    return;
                }
                d(p(iVar, i13, i14), 0, i15, i13 == i10 ? i12 : 1, sb2);
                i13 = i14;
            } else {
                i(iVar.b(i13), sb2);
                i13++;
            }
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43830a;

        static {
            int[] iArr = new int[c.values().length];
            f43830a = iArr;
            try {
                iArr[c.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43830a[c.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43830a[c.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f43827c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f43825a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f43827c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f43828d, (byte) -1);
        while (true) {
            byte[] bArr3 = f43826b;
            if (i10 >= bArr3.length) {
                return;
            }
            byte b11 = bArr3[i10];
            if (b11 > 0) {
                f43828d[b11] = (byte) i10;
            }
            i10++;
        }
    }

    private static int a(i iVar, int i10, Charset charset) throws WriterException {
        CharsetEncoder charsetEncoderNewEncoder = charset == null ? null : charset.newEncoder();
        int length = iVar.length();
        int i11 = i10;
        while (i11 < length) {
            int i12 = 0;
            int i13 = i11;
            while (i12 < 13 && !iVar.a(i13) && l(iVar.charAt(i13)) && (i13 = i11 + (i12 = i12 + 1)) < length) {
            }
            if (i12 >= 13) {
                return i11 - i10;
            }
            if (charsetEncoderNewEncoder != null && !charsetEncoderNewEncoder.canEncode(iVar.charAt(i11))) {
                char cCharAt = iVar.charAt(i11);
                throw new WriterException("Non-encodable character detected: " + cCharAt + " (Unicode: " + ((int) cCharAt) + ')');
            }
            i11++;
        }
        return i11 - i10;
    }

    private static void g(i iVar, int i10, int i11, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i11 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i12 = 0;
        while (i12 < i11) {
            sb3.setLength(0);
            int iMin = Math.min(44, i11 - i12);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("1");
            int i13 = i10 + i12;
            sb4.append((Object) iVar.subSequence(i13, i13 + iMin));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i12 += iMin;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x000f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b A[EDGE_INSN: B:80:0x010b->B:60:0x010b BREAK  A[LOOP:0: B:3:0x000f->B:98:0x000f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int h(Ig.i r16, int r17, int r18, java.lang.StringBuilder r19, int r20) throws com.google.zxing.WriterException {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Zg.g.h(Ig.i, int, int, java.lang.StringBuilder, int):int");
    }

    private static void i(int i10, StringBuilder sb2) throws WriterException {
        if (i10 >= 0 && i10 < 900) {
            sb2.append((char) 927);
            sb2.append((char) i10);
            return;
        }
        if (i10 < 810900) {
            sb2.append((char) 926);
            sb2.append((char) ((i10 / 900) - 1));
            sb2.append((char) (i10 % 900));
        } else if (i10 < 811800) {
            sb2.append((char) 925);
            sb2.append((char) (810900 - i10));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was " + i10);
        }
    }

    private static boolean j(char c10) {
        if (c10 != ' ') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    private static boolean k(char c10) {
        if (c10 != ' ') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    private static boolean l(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    private static boolean m(char c10) {
        return f43827c[c10] != -1;
    }

    private static boolean n(char c10) {
        return f43828d[c10] != -1;
    }

    private static boolean o(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\r') {
            return true;
        }
        return c10 >= ' ' && c10 <= '~';
    }

    static byte[] p(i iVar, int i10, int i11) {
        byte[] bArr = new byte[i11 - i10];
        for (int i12 = i10; i12 < i11; i12++) {
            bArr[i12 - i10] = (byte) (iVar.charAt(i12) & 255);
        }
        return bArr;
    }

    private static int b(i iVar, int i10) {
        int length = iVar.length();
        int i11 = 0;
        if (i10 < length) {
            while (i10 < length && !iVar.a(i10) && l(iVar.charAt(i10))) {
                i11++;
                i10++;
            }
        }
        return i11;
    }

    private static int c(i iVar, int i10) {
        int length = iVar.length();
        int i11 = i10;
        while (i11 < length) {
            int i12 = 0;
            while (i12 < 13 && i11 < length && !iVar.a(i11) && l(iVar.charAt(i11))) {
                i12++;
                i11++;
            }
            if (i12 >= 13) {
                return (i11 - i10) - i12;
            }
            if (i12 <= 0) {
                if (iVar.a(i11) || !o(iVar.charAt(i11))) {
                    break;
                }
                i11++;
            }
        }
        return i11 - i10;
    }

    static String e(String str, c cVar, Charset charset, boolean z10) throws WriterException {
        i bVar;
        Ig.d dVarA;
        Charset charset2;
        byte[] bytes;
        if (!str.isEmpty()) {
            if (charset == null && !z10) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    if (str.charAt(i10) > 255) {
                        throw new WriterException("Non-encodable character detected: " + str.charAt(i10) + " (Unicode: " + ((int) str.charAt(i10)) + "). Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET.");
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder(str.length());
            a aVar = null;
            if (z10) {
                bVar = new n(str, charset, -1);
            } else {
                bVar = new b(str, aVar);
                if (charset == null) {
                    charset = f43829e;
                } else if (!f43829e.equals(charset) && (dVarA = Ig.d.a(charset)) != null) {
                    i(dVarA.m(), sb2);
                }
            }
            int length = bVar.length();
            int i11 = a.f43830a[cVar.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        int i12 = 0;
                        int iH = 0;
                        int i13 = 0;
                        while (i12 < length) {
                            while (i12 < length && bVar.a(i12)) {
                                i(bVar.b(i12), sb2);
                                i12++;
                            }
                            if (i12 >= length) {
                                break;
                            }
                            int iB = b(bVar, i12);
                            if (iB >= 13) {
                                sb2.append((char) 902);
                                g(bVar, i12, iB, sb2);
                                i12 += iB;
                                iH = 0;
                                i13 = 2;
                            } else {
                                int iC = c(bVar, i12);
                                if (iC < 5 && iB != length) {
                                    if (z10) {
                                        charset2 = null;
                                    } else {
                                        charset2 = charset;
                                    }
                                    int iA = a(bVar, i12, charset2);
                                    if (iA == 0) {
                                        iA = 1;
                                    }
                                    if (z10) {
                                        bytes = null;
                                    } else {
                                        bytes = bVar.subSequence(i12, i12 + iA).toString().getBytes(charset);
                                    }
                                    if (((bytes == null && iA == 1) || (bytes != null && bytes.length == 1)) && i13 == 0) {
                                        if (z10) {
                                            f(bVar, i12, 1, 0, sb2);
                                        } else {
                                            d(bytes, 0, 1, 0, sb2);
                                        }
                                    } else {
                                        if (z10) {
                                            f(bVar, i12, i12 + iA, i13, sb2);
                                        } else {
                                            d(bytes, 0, bytes.length, i13, sb2);
                                        }
                                        iH = 0;
                                        i13 = 1;
                                    }
                                    i12 += iA;
                                } else {
                                    if (i13 != 0) {
                                        sb2.append((char) 900);
                                        iH = 0;
                                        i13 = 0;
                                    }
                                    iH = h(bVar, i12, iC, sb2, iH);
                                    i12 += iC;
                                }
                            }
                        }
                    } else {
                        sb2.append((char) 902);
                        g(bVar, 0, length, sb2);
                    }
                } else if (z10) {
                    f(bVar, 0, bVar.length(), 0, sb2);
                } else {
                    byte[] bytes2 = bVar.toString().getBytes(charset);
                    d(bytes2, 0, bytes2.length, 1, sb2);
                }
            } else {
                h(bVar, 0, length, sb2, 0);
            }
            return sb2.toString();
        }
        throw new WriterException("Empty message not allowed");
    }
}
