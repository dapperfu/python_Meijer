package Bg;

import Gg.e;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.medallia.digital.mobilesdk.q2;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f2248b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f2249c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f2250d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f2251e = {"FLG(n)", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", q2.f92724c, ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f2252f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: g, reason: collision with root package name */
    private static final Charset f2253g = StandardCharsets.ISO_8859_1;

    /* renamed from: a, reason: collision with root package name */
    private Ag.a f2254a;

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean[] f2256a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2257b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2258c;

        b(boolean[] zArr, int i10, int i11) {
            this.f2256a = zArr;
            this.f2257b = i10;
            this.f2258c = i11;
        }
    }

    private enum c {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = h(zArr, i10 * 8);
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String f(boolean[] r14) throws com.google.zxing.FormatException {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bg.a.f(boolean[]):java.lang.String");
    }

    private static byte h(boolean[] zArr, int i10) {
        int length = zArr.length - i10;
        return (byte) (length >= 8 ? i(zArr, i10, 8) : i(zArr, i10, length) << (8 - length));
    }

    private static int i(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    /* renamed from: Bg.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0048a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2255a;

        static {
            int[] iArr = new int[c.values().length];
            f2255a = iArr;
            try {
                iArr[c.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2255a[c.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2255a[c.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2255a[c.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2255a[c.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private b b(boolean[] zArr) throws FormatException {
        int i10;
        Ig.a aVar;
        if (this.f2254a.e() <= 2) {
            aVar = Ig.a.f13871j;
            i10 = 6;
        } else {
            i10 = 8;
            if (this.f2254a.e() <= 8) {
                aVar = Ig.a.f13875n;
            } else if (this.f2254a.e() <= 22) {
                aVar = Ig.a.f13870i;
                i10 = 10;
            } else {
                aVar = Ig.a.f13869h;
                i10 = 12;
            }
        }
        int iD = this.f2254a.d();
        int length = zArr.length / i10;
        if (length < iD) {
            throw FormatException.a();
        }
        int length2 = zArr.length % i10;
        int[] iArr = new int[length];
        int i11 = 0;
        while (i11 < length) {
            iArr[i11] = i(zArr, length2, i10);
            i11++;
            length2 += i10;
        }
        try {
            Ig.c cVar = new Ig.c(aVar);
            int i12 = length - iD;
            int iA = cVar.a(iArr, i12);
            int i13 = 1 << i10;
            int i14 = i13 - 1;
            int i15 = 0;
            for (int i16 = 0; i16 < iD; i16++) {
                int i17 = iArr[i16];
                if (i17 == 0 || i17 == i14) {
                    throw FormatException.a();
                }
                if (i17 == 1 || i17 == i13 - 2) {
                    i15++;
                }
            }
            boolean[] zArr2 = new boolean[(iD * i10) - i15];
            int i18 = 0;
            for (int i19 = 0; i19 < iD; i19++) {
                int i20 = iArr[i19];
                if (i20 == 1 || i20 == i13 - 2) {
                    Arrays.fill(zArr2, i18, (i18 + i10) - 1, i20 > 1);
                    i18 += i10 - 1;
                } else {
                    int i21 = i10 - 1;
                    while (i21 >= 0) {
                        int i22 = i18 + 1;
                        zArr2[i18] = (i20 & (1 << i21)) != 0;
                        i21--;
                        i18 = i22;
                    }
                }
            }
            return new b(zArr2, iA, (i12 * 100) / length);
        } catch (ReedSolomonException e10) {
            throw FormatException.b(e10);
        }
    }

    private boolean[] d(Gg.b bVar) {
        boolean zF = this.f2254a.f();
        int iE = this.f2254a.e();
        int i10 = (zF ? 11 : 14) + (iE * 4);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[j(iE, zF)];
        int i11 = 2;
        if (zF) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
        } else {
            int i13 = i10 / 2;
            int i14 = ((i10 + 1) + (((i13 - 1) / 15) * 2)) / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                iArr[(i13 - i15) - 1] = (i14 - r12) - 1;
                iArr[i13 + i15] = (i15 / 15) + i15 + i14 + 1;
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < iE) {
            int i18 = ((iE - i16) * 4) + (zF ? 9 : 12);
            int i19 = i16 * 2;
            int i20 = (i10 - 1) - i19;
            int i21 = 0;
            while (i21 < i18) {
                int i22 = i21 * 2;
                int i23 = 0;
                while (i23 < i11) {
                    int i24 = i19 + i23;
                    int i25 = i19 + i21;
                    zArr[i17 + i22 + i23] = bVar.f(iArr[i24], iArr[i25]);
                    int i26 = i20 - i23;
                    zArr[(i18 * 2) + i17 + i22 + i23] = bVar.f(iArr[i25], iArr[i26]);
                    int i27 = iArr[i26];
                    int i28 = i20 - i21;
                    zArr[(i18 * 4) + i17 + i22 + i23] = bVar.f(i27, iArr[i28]);
                    zArr[(i18 * 6) + i17 + i22 + i23] = bVar.f(iArr[i28], iArr[i24]);
                    i23++;
                    i11 = 2;
                }
                i21++;
                i11 = 2;
            }
            i17 += i18 * 8;
            i16++;
            i11 = 2;
        }
        return zArr;
    }

    private static String e(c cVar, int i10) {
        int i11 = C0048a.f2255a[cVar.ordinal()];
        if (i11 == 1) {
            return f2248b[i10];
        }
        if (i11 == 2) {
            return f2249c[i10];
        }
        if (i11 == 3) {
            return f2250d[i10];
        }
        if (i11 == 4) {
            return f2251e[i10];
        }
        if (i11 == 5) {
            return f2252f[i10];
        }
        throw new IllegalStateException("Bad table");
    }

    private static c g(char c10) {
        return c10 != 'B' ? c10 != 'D' ? c10 != 'P' ? c10 != 'L' ? c10 != 'M' ? c.UPPER : c.MIXED : c.LOWER : c.PUNCT : c.DIGIT : c.BINARY;
    }

    private static int j(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 * 16)) * i10;
    }

    public e c(Ag.a aVar) throws FormatException {
        this.f2254a = aVar;
        b bVarB = b(d(aVar.a()));
        e eVar = new e(a(bVarB.f2256a), f(bVarB.f2256a), null, String.format("%d%%", Integer.valueOf(bVarB.f2258c)));
        eVar.o(bVarB.f2256a.length);
        eVar.n(Integer.valueOf(bVarB.f2257b));
        return eVar;
    }
}
