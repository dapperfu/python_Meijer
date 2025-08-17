package L3;

import Be.C2957c;
import Ce.L;
import a3.y;
import a3.z;
import d3.C;
import d3.D;
import d3.P;
import d3.r;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class h extends G3.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17849b = new a() { // from class: L3.g
        @Override // L3.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return h.c(i10, i11, i12, i13, i14);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final a f17850a;

    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f17851a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f17852b;

        /* renamed from: c, reason: collision with root package name */
        private final int f17853c;

        public b(int i10, boolean z10, int i11) {
            this.f17851a = i10;
            this.f17852b = z10;
            this.f17853c = i11;
        }
    }

    public h() {
        this(null);
    }

    public static /* synthetic */ boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static e j(D d10, int i10) {
        if (i10 < 4) {
            return null;
        }
        int iH = d10.H();
        Charset charsetW = w(iH);
        byte[] bArr = new byte[3];
        d10.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        d10.l(bArr2, 0, i11);
        int iY = y(bArr2, 0, iH);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iH);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iH), charsetW));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0240  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [L3.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [d3.D] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static L3.i k(int r19, d3.D r20, boolean r21, int r22, L3.h.a r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.h.k(int, d3.D, boolean, int, L3.h$a):L3.i");
    }

    private static n q(D d10, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int iH = d10.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        d10.l(bArr, 0, i11);
        return new n(str, null, r(bArr, iH, 0));
    }

    private static L<String> r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return L.y("");
        }
        L.a aVarP = L.p();
        int iY = y(bArr, i11, i10);
        while (i11 < iY) {
            aVarP.a(new String(bArr, i11, iY - i11, w(i10)));
            i11 = v(i10) + iY;
            iY = y(bArr, i11, i10);
        }
        L<String> lK = aVarP.k();
        return lK.isEmpty() ? L.y("") : lK;
    }

    private static n s(D d10, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iH = d10.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        d10.l(bArr, 0, i11);
        int iY = y(bArr, 0, iH);
        return new n("TXXX", new String(bArr, 0, iY, w(iH)), r(bArr, iH, iY + v(iH)));
    }

    private static o u(D d10, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iH = d10.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        d10.l(bArr, 0, i11);
        int iY = y(bArr, 0, iH);
        String str = new String(bArr, 0, iY, w(iH));
        int iV = iY + v(iH);
        return new o("WXXX", str, p(bArr, iV, z(bArr, iV), StandardCharsets.ISO_8859_1));
    }

    private static Charset w(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    private static String x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public h(a aVar) {
        this.f17850a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean B(d3.D r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f()
        L8:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r1.q()     // Catch: java.lang.Throwable -> L22
            long r8 = r1.J()     // Catch: java.lang.Throwable -> L22
            int r10 = r1.P()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r1.K()     // Catch: java.lang.Throwable -> L22
            int r8 = r1.K()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.W(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.W(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7e
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L7c
            goto L8e
        L7c:
            r4 = r6
            goto L8e
        L7e:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L86
            r3 = r4
            goto L87
        L86:
            r3 = r6
        L87:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7c
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.W(r2)
            return r6
        L9b:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.W(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.X(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.W(r2)
            return r4
        Lb2:
            r1.W(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.h.B(d3.D, int, int, boolean):boolean");
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? P.f127091f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static L3.b g(D d10, int i10, String str) {
        byte[] bArr = new byte[i10];
        d10.l(bArr, 0, i10);
        return new L3.b(str, bArr);
    }

    private static d i(D d10, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int iF = d10.f();
        int iZ = z(d10.e(), iF);
        String str = new String(d10.e(), iF, iZ - iF, StandardCharsets.ISO_8859_1);
        d10.W(iZ + 1);
        int iH = d10.H();
        boolean z11 = (iH & 2) != 0;
        boolean z12 = (iH & 1) != 0;
        int iH2 = d10.H();
        String[] strArr = new String[iH2];
        for (int i13 = 0; i13 < iH2; i13++) {
            int iF2 = d10.f();
            int iZ2 = z(d10.e(), iF2);
            strArr[i13] = new String(d10.e(), iF2, iZ2 - iF2, StandardCharsets.ISO_8859_1);
            d10.W(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iF + i10;
        while (d10.f() < i14) {
            i iVarK = k(i11, d10, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static m o(D d10, int i10) {
        byte[] bArr = new byte[i10];
        d10.l(bArr, 0, i10);
        int iZ = z(bArr, 0);
        return new m(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1), d(bArr, iZ + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static o t(D d10, int i10, String str) {
        byte[] bArr = new byte[i10];
        d10.l(bArr, 0, i10);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static int v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public y e(byte[] bArr, int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        D d10 = new D(bArr, i10);
        b bVarM = m(d10);
        if (bVarM == null) {
            return null;
        }
        int iF = d10.f();
        int i11 = bVarM.f17851a == 2 ? 6 : 10;
        int iA = bVarM.f17853c;
        if (bVarM.f17852b) {
            iA = A(d10, bVarM.f17853c);
        }
        d10.V(iF + iA);
        boolean z10 = false;
        if (!B(d10, bVarM.f17851a, i11, false)) {
            if (bVarM.f17851a != 4 || !B(d10, 4, i11, true)) {
                r.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarM.f17851a);
                return null;
            }
            z10 = true;
        }
        while (d10.a() >= i11) {
            i iVarK = k(bVarM.f17851a, d10, z10, i11, this.f17850a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new y(arrayList);
    }

    private static int A(D d10, int i10) {
        byte[] bArrE = d10.e();
        int iF = d10.f();
        int i11 = iF;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < iF + i10) {
                if ((bArrE[i11] & 255) == 255 && bArrE[i12] == 0) {
                    System.arraycopy(bArrE, i11 + 2, bArrE, i12, (i10 - (i11 - iF)) - 2);
                    i10--;
                }
                i11 = i12;
            } else {
                return i10;
            }
        }
    }

    private static L3.a f(D d10, int i10, int i11) {
        int iZ;
        String str;
        int iH = d10.H();
        Charset charsetW = w(iH);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        d10.l(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + C2957c.e(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iZ = 2;
        } else {
            iZ = z(bArr, 0);
            String strE = C2957c.e(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
            if (strE.indexOf(47) == -1) {
                str = "image/" + strE;
            } else {
                str = strE;
            }
        }
        int i13 = bArr[iZ + 1] & 255;
        int i14 = iZ + 2;
        int iY = y(bArr, i14, iH);
        return new L3.a(str, new String(bArr, i14, iY - i14, charsetW), i13, d(bArr, iY + v(iH), i12));
    }

    private static c h(D d10, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        long j10;
        int iF = d10.f();
        int iZ = z(d10.e(), iF);
        String str = new String(d10.e(), iF, iZ - iF, StandardCharsets.ISO_8859_1);
        d10.W(iZ + 1);
        int iQ = d10.q();
        int iQ2 = d10.q();
        long J10 = d10.J();
        if (J10 == 4294967295L) {
            J10 = -1;
        }
        long J11 = d10.J();
        if (J11 == 4294967295L) {
            j10 = -1;
        } else {
            j10 = J11;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = iF + i10;
        while (d10.f() < i13) {
            i iVarK = k(i11, d10, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iQ, iQ2, J10, j10, (i[]) arrayList.toArray(new i[0]));
    }

    private static f l(D d10, int i10) {
        int iH = d10.H();
        Charset charsetW = w(iH);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        d10.l(bArr, 0, i11);
        int iZ = z(bArr, 0);
        String strR = z.r(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
        int i12 = iZ + 1;
        int iY = y(bArr, i12, iH);
        String strP = p(bArr, i12, iY, charsetW);
        int iV = iY + v(iH);
        int iY2 = y(bArr, iV, iH);
        return new f(strR, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iH), i11));
    }

    private static b m(D d10) {
        if (d10.a() < 10) {
            r.i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iK = d10.K();
        if (iK != 4801587) {
            r.i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iK)));
            return null;
        }
        int iH = d10.H();
        boolean z10 = true;
        d10.X(1);
        int iH2 = d10.H();
        int iG = d10.G();
        if (iH == 2) {
            if ((iH2 & 64) != 0) {
                r.i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iH == 3) {
            if ((iH2 & 64) != 0) {
                int iQ = d10.q();
                d10.X(iQ);
                iG -= iQ + 4;
            }
        } else if (iH == 4) {
            if ((iH2 & 64) != 0) {
                int iG2 = d10.G();
                d10.X(iG2 - 4);
                iG -= iG2;
            }
            if ((iH2 & 16) != 0) {
                iG -= 10;
            }
        } else {
            r.i("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iH);
            return null;
        }
        if (iH >= 4 || (iH2 & 128) == 0) {
            z10 = false;
        }
        return new b(iH, z10, iG);
    }

    private static l n(D d10, int i10) {
        int iP = d10.P();
        int iK = d10.K();
        int iK2 = d10.K();
        int iH = d10.H();
        int iH2 = d10.H();
        C c10 = new C();
        c10.m(d10);
        int i11 = ((i10 - 10) * 8) / (iH + iH2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH3 = c10.h(iH);
            int iH4 = c10.h(iH2);
            iArr[i12] = iH3;
            iArr2[i12] = iH4;
        }
        return new l(iP, iK, iK2, iArr, iArr2);
    }

    private static int y(byte[] bArr, int i10, int i11) {
        int iZ = z(bArr, i10);
        if (i11 != 0 && i11 != 3) {
            while (iZ < bArr.length - 1) {
                if ((iZ - i10) % 2 == 0 && bArr[iZ + 1] == 0) {
                    return iZ;
                }
                iZ = z(bArr, iZ + 1);
            }
            return bArr.length;
        }
        return iZ;
    }

    @Override // G3.c
    protected y b(G3.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }
}
