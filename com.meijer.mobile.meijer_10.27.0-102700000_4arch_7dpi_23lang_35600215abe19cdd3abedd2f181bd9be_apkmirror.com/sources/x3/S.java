package x3;

import android.util.Base64;
import androidx.media3.common.ParserException;
import com.medallia.digital.mobilesdk.l3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class S {
    public static int[] a(int i10) {
        if (i10 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i10 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i10 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i10 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i10 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long c(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    private static void f(Q q10) throws ParserException {
        int iD = q10.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            int iD2 = q10.d(16);
            if (iD2 == 0) {
                q10.e(8);
                q10.e(16);
                q10.e(16);
                q10.e(6);
                q10.e(8);
                int iD3 = q10.d(4) + 1;
                for (int i11 = 0; i11 < iD3; i11++) {
                    q10.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw ParserException.a("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = q10.d(5);
                int[] iArr = new int[iD4];
                int i12 = -1;
                for (int i13 = 0; i13 < iD4; i13++) {
                    int iD5 = q10.d(4);
                    iArr[i13] = iD5;
                    if (iD5 > i12) {
                        i12 = iD5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = q10.d(3) + 1;
                    int iD6 = q10.d(2);
                    if (iD6 > 0) {
                        q10.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << iD6); i16++) {
                        q10.e(8);
                    }
                }
                q10.e(2);
                int iD7 = q10.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iD4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        q10.e(iD7);
                        i18++;
                    }
                }
            }
        }
    }

    private static void g(int i10, Q q10) throws ParserException {
        int iD = q10.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            int iD2 = q10.d(16);
            if (iD2 != 0) {
                d3.r.d("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = q10.c() ? q10.d(4) + 1 : 1;
                if (q10.c()) {
                    int iD4 = q10.d(8) + 1;
                    for (int i12 = 0; i12 < iD4; i12++) {
                        int i13 = i10 - 1;
                        q10.e(b(i13));
                        q10.e(b(i13));
                    }
                }
                if (q10.d(2) != 0) {
                    throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        q10.e(4);
                    }
                }
                for (int i15 = 0; i15 < iD3; i15++) {
                    q10.e(8);
                    q10.e(8);
                    q10.e(8);
                }
            }
        }
    }

    private static b[] h(Q q10) {
        int iD = q10.d(6) + 1;
        b[] bVarArr = new b[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            bVarArr[i10] = new b(q10.c(), q10.d(16), q10.d(16), q10.d(8));
        }
        return bVarArr;
    }

    private static void i(Q q10) throws ParserException {
        int iD = q10.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            if (q10.d(16) > 2) {
                throw ParserException.a("residueType greater than 2 is not decodable", null);
            }
            q10.e(24);
            q10.e(24);
            q10.e(24);
            int iD2 = q10.d(6) + 1;
            q10.e(8);
            int[] iArr = new int[iD2];
            for (int i11 = 0; i11 < iD2; i11++) {
                iArr[i11] = ((q10.c() ? q10.d(5) : 0) * 8) + q10.d(3);
            }
            for (int i12 = 0; i12 < iD2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        q10.e(8);
                    }
                }
            }
        }
    }

    public static a j(d3.D d10) throws ParserException {
        return k(d10, true, true);
    }

    public static a k(d3.D d10, boolean z10, boolean z11) throws ParserException {
        if (z10) {
            o(3, d10, false);
        }
        String strE = d10.E((int) d10.x());
        int length = strE.length();
        long jX = d10.x();
        String[] strArr = new String[(int) jX];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jX; i10++) {
            String strE2 = d10.E((int) d10.x());
            strArr[i10] = strE2;
            length2 = length2 + 4 + strE2.length();
        }
        if (z11 && (d10.H() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new a(strE, strArr, length2 + 1);
    }

    public static c l(d3.D d10) throws ParserException {
        o(1, d10, false);
        int iY = d10.y();
        int iH = d10.H();
        int iY2 = d10.y();
        int iU = d10.u();
        if (iU <= 0) {
            iU = -1;
        }
        int iU2 = d10.u();
        if (iU2 <= 0) {
            iU2 = -1;
        }
        int iU3 = d10.u();
        if (iU3 <= 0) {
            iU3 = -1;
        }
        int iH2 = d10.H();
        return new c(iY, iH, iY2, iU, iU2, iU3, (int) Math.pow(2.0d, iH2 & 15), (int) Math.pow(2.0d, (iH2 & 240) >> 4), (d10.H() & 1) > 0, Arrays.copyOf(d10.e(), d10.g()));
    }

    public static b[] m(d3.D d10, int i10) throws ParserException {
        o(5, d10, false);
        int iH = d10.H() + 1;
        Q q10 = new Q(d10.e());
        q10.e(d10.f() * 8);
        for (int i11 = 0; i11 < iH; i11++) {
            n(q10);
        }
        int iD = q10.d(6) + 1;
        for (int i12 = 0; i12 < iD; i12++) {
            if (q10.d(16) != 0) {
                throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(q10);
        i(q10);
        g(i10, q10);
        b[] bVarArrH = h(q10);
        if (q10.c()) {
            return bVarArrH;
        }
        throw ParserException.a("framing bit after modes not set as expected", null);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f169109a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f169110b;

        /* renamed from: c, reason: collision with root package name */
        public final int f169111c;

        public a(String str, String[] strArr, int i10) {
            this.f169109a = str;
            this.f169110b = strArr;
            this.f169111c = i10;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f169112a;

        /* renamed from: b, reason: collision with root package name */
        public final int f169113b;

        /* renamed from: c, reason: collision with root package name */
        public final int f169114c;

        /* renamed from: d, reason: collision with root package name */
        public final int f169115d;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f169112a = z10;
            this.f169113b = i10;
            this.f169114c = i11;
            this.f169115d = i12;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f169116a;

        /* renamed from: b, reason: collision with root package name */
        public final int f169117b;

        /* renamed from: c, reason: collision with root package name */
        public final int f169118c;

        /* renamed from: d, reason: collision with root package name */
        public final int f169119d;

        /* renamed from: e, reason: collision with root package name */
        public final int f169120e;

        /* renamed from: f, reason: collision with root package name */
        public final int f169121f;

        /* renamed from: g, reason: collision with root package name */
        public final int f169122g;

        /* renamed from: h, reason: collision with root package name */
        public final int f169123h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f169124i;

        /* renamed from: j, reason: collision with root package name */
        public final byte[] f169125j;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f169116a = i10;
            this.f169117b = i11;
            this.f169118c = i12;
            this.f169119d = i13;
            this.f169120e = i14;
            this.f169121f = i15;
            this.f169122g = i16;
            this.f169123h = i17;
            this.f169124i = z10;
            this.f169125j = bArr;
        }
    }

    public static a3.y d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrD1 = d3.P.d1(str, "=");
            if (strArrD1.length != 2) {
                d3.r.i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrD1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(J3.a.d(new d3.D(Base64.decode(strArrD1[1], 0))));
                } catch (RuntimeException e10) {
                    d3.r.j("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new O3.a(strArrD1[0], strArrD1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new a3.y(arrayList);
    }

    public static Ce.L<byte[]> e(byte[] bArr) {
        d3.D d10 = new d3.D(bArr);
        d10.X(1);
        int i10 = 0;
        while (d10.a() > 0 && d10.j() == 255) {
            i10 += l3.f92484c;
            d10.X(1);
        }
        int iH = i10 + d10.H();
        int i11 = 0;
        while (d10.a() > 0 && d10.j() == 255) {
            i11 += l3.f92484c;
            d10.X(1);
        }
        int iH2 = i11 + d10.H();
        byte[] bArr2 = new byte[iH];
        int iF = d10.f();
        System.arraycopy(bArr, iF, bArr2, 0, iH);
        int i12 = iF + iH + iH2;
        int length = bArr.length - i12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i12, bArr3, 0, length);
        return Ce.L.z(bArr2, bArr3);
    }

    private static void n(Q q10) throws ParserException {
        if (q10.d(24) != 5653314) {
            throw ParserException.a("expected code book to start with [0x56, 0x43, 0x42] at " + q10.b(), null);
        }
        int iD = q10.d(16);
        int iD2 = q10.d(24);
        int iD3 = 0;
        if (q10.c()) {
            q10.e(5);
            while (iD3 < iD2) {
                iD3 += q10.d(b(iD2 - iD3));
            }
        } else {
            boolean zC = q10.c();
            while (iD3 < iD2) {
                if (!zC) {
                    q10.e(5);
                } else if (q10.c()) {
                    q10.e(5);
                }
                iD3++;
            }
        }
        int iD4 = q10.d(4);
        if (iD4 > 2) {
            throw ParserException.a("lookup type greater than 2 not decodable: " + iD4, null);
        }
        if (iD4 == 1 || iD4 == 2) {
            q10.e(32);
            q10.e(32);
            int iD5 = q10.d(4) + 1;
            q10.e(1);
            q10.e((int) ((iD4 == 1 ? iD != 0 ? c(iD2, iD) : 0L : iD * iD2) * iD5));
        }
    }

    public static boolean o(int i10, d3.D d10, boolean z10) throws ParserException {
        if (d10.a() < 7) {
            if (z10) {
                return false;
            }
            throw ParserException.a("too short header: " + d10.a(), null);
        }
        if (d10.H() != i10) {
            if (z10) {
                return false;
            }
            throw ParserException.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (d10.H() == 118 && d10.H() == 111 && d10.H() == 114 && d10.H() == 98 && d10.H() == 105 && d10.H() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ParserException.a("expected characters 'vorbis'", null);
    }
}
