package Mg;

import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    static final char[] f19554a = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};

    private static final class b {

        /* renamed from: g, reason: collision with root package name */
        private static final int[] f19557g = {3, 5, 8, 10, 12, 16, 18, 22, 30, 32, 36, 44, 49, 62, 86, 114, 144, 174, HttpResponseStatus.SUCCESS_NO_CONTENT, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};

        /* renamed from: h, reason: collision with root package name */
        private static final int[] f19558h = {3, 5, 8, 12, 18, 22, 30, 36, 44, 62, 86, 114, 144, 174, HttpResponseStatus.SUCCESS_NO_CONTENT, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};

        /* renamed from: i, reason: collision with root package name */
        private static final int[] f19559i = {5, 10, 16, 33, 32, 49};

        /* renamed from: a, reason: collision with root package name */
        private final c f19560a;

        /* renamed from: b, reason: collision with root package name */
        private final d f19561b;

        /* renamed from: c, reason: collision with root package name */
        private final int f19562c;

        /* renamed from: d, reason: collision with root package name */
        private final int f19563d;

        /* renamed from: e, reason: collision with root package name */
        private final b f19564e;

        /* renamed from: f, reason: collision with root package name */
        private final int f19565f;

        /* synthetic */ b(c cVar, d dVar, int i10, int i11, b bVar, a aVar) {
            this(cVar, dVar, i10, i11, bVar);
        }

        static byte[] h(int i10) {
            return new byte[]{(byte) i10};
        }

        static byte[] i(int i10, int i11) {
            return new byte[]{(byte) i10, (byte) i11};
        }

        int g() {
            int i10 = 0;
            for (b bVar = this; bVar != null && bVar.f19561b == d.B256 && i10 <= 250; bVar = bVar.f19564e) {
                i10++;
            }
            return i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0073 A[PHI: r10
          0x0073: PHI (r10v12 int) = (r10v8 int), (r10v8 int), (r10v8 int), (r10v15 int), (r10v15 int), (r10v15 int) binds: [B:55:0x0093, B:57:0x0097, B:59:0x009b, B:38:0x006b, B:40:0x006f, B:41:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0076 A[PHI: r10
          0x0076: PHI (r10v10 int) = (r10v5 int), (r10v5 int), (r10v5 int), (r10v8 int), (r10v15 int), (r10v15 int) binds: [B:69:0x00bb, B:71:0x00bf, B:73:0x00c3, B:52:0x008e, B:32:0x0060, B:34:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private b(Mg.k.c r6, Mg.k.d r7, int r8, int r9, Mg.k.b r10) {
            /*
                Method dump skipped, instructions count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Mg.k.b.<init>(Mg.k$c, Mg.k$d, int, int, Mg.k$b):void");
        }

        private static int j(boolean z10, int i10, char c10, int i11) {
            if (c10 == i11) {
                return 27;
            }
            if (z10) {
                if (c10 <= 31) {
                    return c10;
                }
                if (c10 == ' ') {
                    return 3;
                }
                return c10 <= '/' ? c10 - '!' : c10 <= '9' ? c10 - ',' : c10 <= '@' ? c10 - '+' : c10 <= 'Z' ? c10 - '3' : c10 <= '_' ? c10 - 'E' : c10 <= 127 ? c10 - '`' : c10;
            }
            if (c10 == 0) {
                return 0;
            }
            if (i10 == 0 && c10 <= 3) {
                return c10 - 1;
            }
            if (i10 == 1 && c10 <= 31) {
                return c10;
            }
            if (c10 == ' ') {
                return 3;
            }
            if (c10 >= '!' && c10 <= '/') {
                return c10 - '!';
            }
            if (c10 >= '0' && c10 <= '9') {
                return c10 - ',';
            }
            if (c10 >= ':' && c10 <= '@') {
                return c10 - '+';
            }
            if (c10 >= 'A' && c10 <= 'Z') {
                return c10 - '@';
            }
            if (c10 >= '[' && c10 <= '_') {
                return c10 - 'E';
            }
            if (c10 == '`') {
                return 0;
            }
            return (c10 < 'a' || c10 > 'z') ? (c10 < '{' || c10 > 127) ? c10 : c10 - '`' : c10 - 'S';
        }

        static int v(char c10, boolean z10, int i10) {
            if (z10 && k.l(c10)) {
                return 0;
            }
            if (!z10 && k.n(c10)) {
                return 0;
            }
            if (z10 && k.m(c10, i10)) {
                return 1;
            }
            return (z10 || !k.o(c10, i10)) ? 2 : 1;
        }

        private static int w(char c10) {
            if (c10 == '\r') {
                return 0;
            }
            if (c10 == '*') {
                return 1;
            }
            if (c10 == '>') {
                return 2;
            }
            if (c10 == ' ') {
                return 3;
            }
            return (c10 < '0' || c10 > '9') ? (c10 < 'A' || c10 > 'Z') ? c10 : c10 - '3' : c10 - ',';
        }

        static void y(byte[] bArr, int i10, int i11, int i12, int i13) {
            int i14 = ((i11 & l3.f92484c) * 1600) + ((i12 & l3.f92484c) * 40) + (i13 & l3.f92484c) + 1;
            bArr[i10] = (byte) (i14 / 256);
            bArr[i10 + 1] = (byte) (i14 % 256);
        }

        byte[] k(boolean z10, int i10) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < this.f19563d; i11++) {
                char cCharAt = this.f19560a.charAt(this.f19562c + i11);
                if ((z10 && j.h(cCharAt)) || (!z10 && j.j(cCharAt))) {
                    arrayList.add(Byte.valueOf((byte) j(z10, 0, cCharAt, i10)));
                } else if (k.k(cCharAt, i10)) {
                    char c10 = (char) ((cCharAt & 255) - 128);
                    if (!(z10 && j.h(c10)) && (z10 || !j.j(c10))) {
                        arrayList.add((byte) 1);
                        arrayList.add((byte) 30);
                        int iV = v(c10, z10, i10);
                        arrayList.add(Byte.valueOf((byte) iV));
                        arrayList.add(Byte.valueOf((byte) j(z10, iV, c10, i10)));
                    } else {
                        arrayList.add((byte) 1);
                        arrayList.add((byte) 30);
                        arrayList.add(Byte.valueOf((byte) j(z10, 0, c10, i10)));
                    }
                } else {
                    int iV2 = v(cCharAt, z10, i10);
                    arrayList.add(Byte.valueOf((byte) iV2));
                    arrayList.add(Byte.valueOf((byte) j(z10, iV2, cCharAt, i10)));
                }
            }
            if (arrayList.size() % 3 != 0) {
                arrayList.add((byte) 0);
            }
            byte[] bArr = new byte[(arrayList.size() / 3) * 2];
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13 += 3) {
                y(bArr, i12, ((Byte) arrayList.get(i13)).byteValue() & 255, ((Byte) arrayList.get(i13 + 1)).byteValue() & 255, ((Byte) arrayList.get(i13 + 2)).byteValue() & 255);
                i12 += 2;
            }
            return bArr;
        }

        byte[] m() {
            switch (a.f19555a[this.f19561b.ordinal()]) {
                case 1:
                    return this.f19560a.a(this.f19562c) ? i(241, this.f19560a.b(this.f19562c) + 1) : k.k(this.f19560a.charAt(this.f19562c), this.f19560a.f()) ? i(235, this.f19560a.charAt(this.f19562c) - 127) : this.f19563d == 2 ? h(((this.f19560a.charAt(this.f19562c) - '0') * 10) + this.f19560a.charAt(this.f19562c + 1) + 82) : this.f19560a.h(this.f19562c) ? h(232) : h(this.f19560a.charAt(this.f19562c) + 1);
                case 2:
                    return h(this.f19560a.charAt(this.f19562c));
                case 3:
                    return k(true, this.f19560a.f());
                case 4:
                    return k(false, this.f19560a.f());
                case 5:
                    return x();
                case 6:
                    return n();
                default:
                    return new byte[0];
            }
        }

        byte[] n() {
            int iCeil = (int) Math.ceil(this.f19563d / 4.0d);
            byte[] bArr = new byte[iCeil * 3];
            int i10 = this.f19562c;
            int iMin = Math.min((this.f19563d + i10) - 1, this.f19560a.length() - 1);
            for (int i11 = 0; i11 < iCeil; i11 += 3) {
                int[] iArr = new int[4];
                for (int i12 = 0; i12 < 4; i12++) {
                    if (i10 <= iMin) {
                        iArr[i12] = this.f19560a.charAt(i10) & '?';
                        i10++;
                    } else {
                        iArr[i12] = i10 == iMin + 1 ? 31 : 0;
                    }
                }
                int i13 = (iArr[0] << 18) | (iArr[1] << 12) | (iArr[2] << 6) | iArr[3];
                bArr[i11] = (byte) ((i13 >> 16) & l3.f92484c);
                bArr[i11 + 1] = (byte) ((i13 >> 8) & l3.f92484c);
                bArr[i11 + 2] = (byte) (i13 & l3.f92484c);
            }
            return bArr;
        }

        d o() {
            if (this.f19561b == d.EDF) {
                if (this.f19563d < 4) {
                    return d.ASCII;
                }
                int iP = p();
                if (iP > 0 && l(this.f19565f + iP) <= 2 - iP) {
                    return d.ASCII;
                }
            }
            d dVar = this.f19561b;
            if (dVar == d.C40 || dVar == d.TEXT || dVar == d.X12) {
                if (this.f19562c + this.f19563d >= this.f19560a.length() && l(this.f19565f) == 0) {
                    return d.ASCII;
                }
                if (p() == 1 && l(this.f19565f + 1) == 0) {
                    return d.ASCII;
                }
            }
            return this.f19561b;
        }

        int p() {
            int length = this.f19560a.length();
            int i10 = this.f19562c + this.f19563d;
            int i11 = length - i10;
            if (i11 <= 4 && i10 < length) {
                if (i11 == 1) {
                    return k.k(this.f19560a.charAt(i10), this.f19560a.f()) ? 0 : 1;
                }
                if (i11 == 2) {
                    if (!k.k(this.f19560a.charAt(i10), this.f19560a.f())) {
                        int i12 = i10 + 1;
                        if (!k.k(this.f19560a.charAt(i12), this.f19560a.f())) {
                            return (j.f(this.f19560a.charAt(i10)) && j.f(this.f19560a.charAt(i12))) ? 1 : 2;
                        }
                    }
                    return 0;
                }
                if (i11 == 3) {
                    if (j.f(this.f19560a.charAt(i10)) && j.f(this.f19560a.charAt(i10 + 1)) && !k.k(this.f19560a.charAt(i10 + 2), this.f19560a.f())) {
                        return 2;
                    }
                    return (j.f(this.f19560a.charAt(i10 + 1)) && j.f(this.f19560a.charAt(i10 + 2)) && !k.k(this.f19560a.charAt(i10), this.f19560a.f())) ? 2 : 0;
                }
                if (j.f(this.f19560a.charAt(i10)) && j.f(this.f19560a.charAt(i10 + 1)) && j.f(this.f19560a.charAt(i10 + 2)) && j.f(this.f19560a.charAt(i10 + 3))) {
                    return 2;
                }
            }
            return 0;
        }

        byte[] q() {
            int[] iArr = a.f19555a;
            switch (iArr[t().ordinal()]) {
                case 1:
                case 2:
                    int i10 = iArr[this.f19561b.ordinal()];
                    if (i10 == 2) {
                        return h(231);
                    }
                    if (i10 == 3) {
                        return h(230);
                    }
                    if (i10 == 4) {
                        return h(239);
                    }
                    if (i10 == 5) {
                        return h(238);
                    }
                    if (i10 == 6) {
                        return h(240);
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    if (this.f19561b != t()) {
                        switch (iArr[this.f19561b.ordinal()]) {
                            case 1:
                                return h(254);
                            case 2:
                                return i(254, 231);
                            case 3:
                                return i(254, 230);
                            case 4:
                                return i(254, 239);
                            case 5:
                                return i(254, 238);
                            case 6:
                                return i(254, 240);
                        }
                    }
                    break;
            }
            return new byte[0];
        }

        int r(int i10) {
            int i11 = a.f19556b[this.f19560a.l().ordinal()];
            if (i11 == 1) {
                for (int i12 : f19558h) {
                    if (i12 >= i10) {
                        return i12;
                    }
                }
            } else if (i11 == 2) {
                for (int i13 : f19559i) {
                    if (i13 >= i10) {
                        return i13;
                    }
                }
            }
            for (int i14 : f19557g) {
                if (i14 >= i10) {
                    return i14;
                }
            }
            int[] iArr = f19557g;
            return iArr[iArr.length - 1];
        }

        d s() {
            return this.f19561b;
        }

        d t() {
            b bVar = this.f19564e;
            return bVar == null ? d.ASCII : bVar.o();
        }

        d u() {
            b bVar = this.f19564e;
            return bVar == null ? d.ASCII : bVar.f19561b;
        }

        byte[] x() {
            int i10 = (this.f19563d / 3) * 2;
            byte[] bArr = new byte[i10];
            for (int i11 = 0; i11 < i10; i11 += 2) {
                int i12 = (i11 / 2) * 3;
                y(bArr, i11, w(this.f19560a.charAt(this.f19562c + i12)), w(this.f19560a.charAt(this.f19562c + i12 + 1)), w(this.f19560a.charAt(this.f19562c + i12 + 2)));
            }
            return bArr;
        }

        int l(int i10) {
            return r(i10) - i10;
        }
    }

    private static final class c extends Gg.n {

        /* renamed from: c, reason: collision with root package name */
        private final m f19566c;

        /* renamed from: d, reason: collision with root package name */
        private final int f19567d;

        /* synthetic */ c(String str, Charset charset, int i10, m mVar, int i11, a aVar) {
            this(str, charset, i10, mVar, i11);
        }

        private c(String str, Charset charset, int i10, m mVar, int i11) {
            super(str, charset, i10);
            this.f19566c = mVar;
            this.f19567d = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int k() {
            return this.f19567d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public m l() {
            return this.f19566c;
        }
    }

    enum d {
        ASCII,
        C40,
        TEXT,
        X12,
        EDF,
        B256
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f19575a;

        static void a(List<Byte> list, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = i10 + i12;
                int iByteValue = (list.get(i13).byteValue() & 255) + (((i13 + 1) * 149) % l3.f92484c) + 1;
                if (iByteValue > 255) {
                    iByteValue -= 256;
                }
                list.set(i13, Byte.valueOf((byte) iByteValue));
            }
        }

        static int c(byte[] bArr, List<Byte> list) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                list.add(0, Byte.valueOf(bArr[length]));
            }
            return bArr.length;
        }

        private static int d(int i10) {
            int i11 = (i10 * 149) % 253;
            int i12 = i11 + 130;
            return i12 <= 254 ? i12 : i11 - 124;
        }

        public byte[] b() {
            return this.f19575a;
        }

        e(b bVar) {
            int iC;
            int i10;
            c cVar = bVar.f19560a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i11 = 0;
            if ((bVar.f19561b == d.C40 || bVar.f19561b == d.TEXT || bVar.f19561b == d.X12) && bVar.o() != d.ASCII) {
                iC = c(b.h(254), arrayList);
            } else {
                iC = 0;
            }
            for (b bVar2 = bVar; bVar2 != null; bVar2 = bVar2.f19564e) {
                iC += c(bVar2.m(), arrayList);
                if (bVar2.f19564e == null || bVar2.u() != bVar2.s()) {
                    if (bVar2.s() == d.B256) {
                        if (iC <= 249) {
                            arrayList.add(0, Byte.valueOf((byte) iC));
                            i10 = iC + 1;
                        } else {
                            arrayList.add(0, Byte.valueOf((byte) (iC % 250)));
                            arrayList.add(0, Byte.valueOf((byte) ((iC / 250) + 249)));
                            i10 = iC + 2;
                        }
                        arrayList2.add(Integer.valueOf(arrayList.size()));
                        arrayList3.add(Integer.valueOf(i10));
                    }
                    c(bVar2.q(), arrayList);
                    iC = 0;
                }
            }
            if (cVar.k() == 5) {
                c(b.h(236), arrayList);
            } else if (cVar.k() == 6) {
                c(b.h(237), arrayList);
            }
            if (cVar.f() > 0) {
                c(b.h(232), arrayList);
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                a(arrayList, arrayList.size() - ((Integer) arrayList2.get(i12)).intValue(), ((Integer) arrayList3.get(i12)).intValue());
            }
            int iR = bVar.r(arrayList.size());
            if (arrayList.size() < iR) {
                arrayList.add((byte) -127);
            }
            while (arrayList.size() < iR) {
                arrayList.add(Byte.valueOf((byte) d(arrayList.size() + 1)));
            }
            this.f19575a = new byte[arrayList.size()];
            while (true) {
                byte[] bArr = this.f19575a;
                if (i11 < bArr.length) {
                    bArr[i11] = ((Byte) arrayList.get(i11)).byteValue();
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    static int j(c cVar, int i10, boolean z10, int[] iArr) {
        int i11 = 0;
        for (int i12 = i10; i12 < cVar.length(); i12++) {
            if (cVar.a(i12)) {
                iArr[0] = 0;
                return 0;
            }
            char cCharAt = cVar.charAt(i12);
            if ((z10 && j.h(cCharAt)) || (!z10 && j.j(cCharAt))) {
                i11++;
            } else if (k(cCharAt, cVar.f())) {
                int i13 = cCharAt & 255;
                i11 = (i13 < 128 || (!(z10 && j.h((char) (i13 + (-128)))) && (z10 || !j.j((char) (i13 + (-128)))))) ? i11 + 4 : i11 + 3;
            } else {
                i11 += 2;
            }
            if (i11 % 3 == 0 || ((i11 - 2) % 3 == 0 && i12 + 1 == cVar.length())) {
                iArr[0] = (i12 - i10) + 1;
                return (int) Math.ceil(i11 / 3.0d);
            }
        }
        iArr[0] = 0;
        return 0;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19555a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f19556b;

        static {
            int[] iArr = new int[m.values().length];
            f19556b = iArr;
            try {
                iArr[m.FORCE_SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19556b[m.FORCE_RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[d.values().length];
            f19555a = iArr2;
            try {
                iArr2[d.ASCII.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19555a[d.B256.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19555a[d.C40.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19555a[d.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19555a[d.X12.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19555a[d.EDF.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static byte[] g(String str, Charset charset, int i10, m mVar, int i11) {
        return i(new c(str, charset, i10, mVar, i11, null)).b();
    }

    public static String h(String str, Charset charset, int i10, m mVar) {
        int i11;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            str = str.substring(7, str.length() - 2);
            i11 = 5;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            str = str.substring(7, str.length() - 2);
            i11 = 6;
        } else {
            i11 = 0;
        }
        return new String(g(str, charset, i10, mVar, i11), StandardCharsets.ISO_8859_1);
    }

    static boolean k(char c10, int i10) {
        return c10 != i10 && c10 >= 128 && c10 <= 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(char c10) {
        return c10 <= 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(char c10, int i10) {
        for (char c11 : f19554a) {
            if (c11 == c10) {
                return true;
            }
        }
        return c10 == i10;
    }

    static void e(b[][] bVarArr, b bVar) {
        int i10 = bVar.f19562c + bVar.f19563d;
        if (bVarArr[i10][bVar.o().ordinal()] != null && bVarArr[i10][bVar.o().ordinal()].f19565f <= bVar.f19565f) {
            return;
        }
        bVarArr[i10][bVar.o().ordinal()] = bVar;
    }

    static void f(c cVar, b[][] bVarArr, int i10, b bVar) {
        boolean z10;
        if (cVar.a(i10)) {
            e(bVarArr, new b(cVar, d.ASCII, i10, 1, bVar, null));
            return;
        }
        char cCharAt = cVar.charAt(i10);
        int i11 = 0;
        if (bVar == null || bVar.o() != d.EDF) {
            if (j.f(cCharAt) && cVar.g(i10, 2) && j.f(cVar.charAt(i10 + 1))) {
                e(bVarArr, new b(cVar, d.ASCII, i10, 2, bVar, null));
            } else {
                e(bVarArr, new b(cVar, d.ASCII, i10, 1, bVar, null));
            }
            d[] dVarArr = {d.C40, d.TEXT};
            for (int i12 = 0; i12 < 2; i12++) {
                d dVar = dVarArr[i12];
                int[] iArr = new int[1];
                if (dVar == d.C40) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (j(cVar, i10, z10, iArr) > 0) {
                    e(bVarArr, new b(cVar, dVar, i10, iArr[0], bVar, null));
                }
            }
            if (cVar.g(i10, 3) && j.k(cVar.charAt(i10)) && j.k(cVar.charAt(i10 + 1)) && j.k(cVar.charAt(i10 + 2))) {
                e(bVarArr, new b(cVar, d.X12, i10, 3, bVar, null));
            }
            e(bVarArr, new b(cVar, d.B256, i10, 1, bVar, null));
        }
        while (i11 < 3) {
            int i13 = i10 + i11;
            if (!cVar.g(i13, 1) || !j.i(cVar.charAt(i13))) {
                break;
            }
            int i14 = i11 + 1;
            e(bVarArr, new b(cVar, d.EDF, i10, i14, bVar, null));
            i11 = i14;
        }
        if (i11 == 3 && cVar.g(i10, 4) && j.i(cVar.charAt(i10 + 3))) {
            e(bVarArr, new b(cVar, d.EDF, i10, 4, bVar, null));
        }
    }

    static e i(c cVar) {
        int i10;
        int length = cVar.length();
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, length + 1, 6);
        f(cVar, bVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < 6; i12++) {
                b bVar = bVarArr[i11][i12];
                if (bVar != null && i11 < length) {
                    f(cVar, bVarArr, i11, bVar);
                }
            }
            for (int i13 = 0; i13 < 6; i13++) {
                bVarArr[i11 - 1][i13] = null;
            }
        }
        int i14 = -1;
        int i15 = a.e.API_PRIORITY_OTHER;
        for (int i16 = 0; i16 < 6; i16++) {
            b bVar2 = bVarArr[length][i16];
            if (bVar2 != null) {
                if (i16 < 1 || i16 > 3) {
                    i10 = bVar2.f19565f;
                } else {
                    i10 = bVar2.f19565f + 1;
                }
                if (i10 < i15) {
                    i14 = i16;
                    i15 = i10;
                }
            }
        }
        if (i14 >= 0) {
            return new e(bVarArr[length][i14]);
        }
        throw new IllegalStateException("Failed to encode \"" + cVar + "\"");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(char c10) {
        return l(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean o(char c10, int i10) {
        return m(c10, i10);
    }
}
