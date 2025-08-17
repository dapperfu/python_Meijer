package bh;

import Gg.h;
import Zg.j;
import com.google.android.gms.common.api.a;
import com.google.zxing.WriterException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f60281a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f60282b;

    /* renamed from: c, reason: collision with root package name */
    private final h f60283c;

    /* renamed from: d, reason: collision with root package name */
    private final Zg.f f60284d;

    private final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Zg.h f60287a;

        /* renamed from: b, reason: collision with root package name */
        private final int f60288b;

        /* renamed from: c, reason: collision with root package name */
        private final int f60289c;

        /* renamed from: d, reason: collision with root package name */
        private final int f60290d;

        /* renamed from: e, reason: collision with root package name */
        private final b f60291e;

        /* renamed from: f, reason: collision with root package name */
        private final int f60292f;

        /* synthetic */ b(f fVar, Zg.h hVar, int i10, int i11, int i12, b bVar, j jVar, a aVar) {
            this(hVar, i10, i11, i12, bVar, jVar);
        }

        private b(Zg.h hVar, int i10, int i11, int i12, b bVar, j jVar) {
            this.f60287a = hVar;
            this.f60288b = i10;
            Zg.h hVar2 = Zg.h.BYTE;
            int i13 = (hVar == hVar2 || bVar == null) ? i11 : bVar.f60289c;
            this.f60289c = i13;
            this.f60290d = i12;
            this.f60291e = bVar;
            boolean z10 = false;
            int iE = bVar != null ? bVar.f60292f : 0;
            if ((hVar == hVar2 && bVar == null && i13 != 0) || (bVar != null && i13 != bVar.f60289c)) {
                z10 = true;
            }
            iE = (bVar == null || hVar != bVar.f60287a || z10) ? iE + hVar.e(jVar) + 4 : iE;
            int i14 = a.f60286b[hVar.ordinal()];
            if (i14 == 1) {
                iE += 13;
            } else if (i14 == 2) {
                iE += i12 == 1 ? 6 : 11;
            } else if (i14 == 3) {
                iE += i12 != 1 ? i12 == 2 ? 7 : 10 : 4;
            } else if (i14 == 4) {
                iE += f.this.f60283c.c(f.this.f60281a.substring(i10, i12 + i10), i11).length * 8;
                if (z10) {
                    iE += 12;
                }
            }
            this.f60292f = iE;
        }
    }

    final class c {

        /* renamed from: a, reason: collision with root package name */
        private final List<a> f60294a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final j f60295b;

        final class a {

            /* renamed from: a, reason: collision with root package name */
            private final Zg.h f60297a;

            /* renamed from: b, reason: collision with root package name */
            private final int f60298b;

            /* renamed from: c, reason: collision with root package name */
            private final int f60299c;

            /* renamed from: d, reason: collision with root package name */
            private final int f60300d;

            a(Zg.h hVar, int i10, int i11, int i12) {
                this.f60297a = hVar;
                this.f60298b = i10;
                this.f60299c = i11;
                this.f60300d = i12;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void d(Gg.a aVar) throws WriterException {
                aVar.c(this.f60297a.b(), 4);
                if (this.f60300d > 0) {
                    aVar.c(e(), this.f60297a.e(c.this.f60295b));
                }
                if (this.f60297a == Zg.h.ECI) {
                    aVar.c(f.this.f60283c.e(this.f60299c), 8);
                } else if (this.f60300d > 0) {
                    String str = f.this.f60281a;
                    int i10 = this.f60298b;
                    C6252c.c(str.substring(i10, this.f60300d + i10), this.f60297a, aVar, f.this.f60283c.d(this.f60299c));
                }
            }

            private int e() {
                if (this.f60297a != Zg.h.BYTE) {
                    return this.f60300d;
                }
                h hVar = f.this.f60283c;
                String str = f.this.f60281a;
                int i10 = this.f60298b;
                return hVar.c(str.substring(i10, this.f60300d + i10), this.f60299c).length;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int f(j jVar) {
                int iE;
                int iE2 = this.f60297a.e(jVar);
                int i10 = iE2 + 4;
                int i11 = a.f60286b[this.f60297a.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        int i12 = this.f60300d;
                        return i10 + ((i12 / 2) * 11) + (i12 % 2 == 1 ? 6 : 0);
                    }
                    if (i11 == 3) {
                        int i13 = this.f60300d;
                        int i14 = i10 + ((i13 / 3) * 10);
                        int i15 = i13 % 3;
                        if (i15 == 1) {
                            i = 4;
                        } else if (i15 == 2) {
                            i = 7;
                        }
                        return i14 + i;
                    }
                    if (i11 != 4) {
                        return i11 != 5 ? i10 : iE2 + 12;
                    }
                    iE = e() * 8;
                } else {
                    iE = this.f60300d * 13;
                }
                return i10 + iE;
            }

            private String g(String str) {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < str.length(); i10++) {
                    if (str.charAt(i10) < ' ' || str.charAt(i10) > '~') {
                        sb2.append('.');
                    } else {
                        sb2.append(str.charAt(i10));
                    }
                }
                return sb2.toString();
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f60297a);
                sb2.append('(');
                if (this.f60297a == Zg.h.ECI) {
                    sb2.append(f.this.f60283c.d(this.f60299c).displayName());
                } else {
                    String str = f.this.f60281a;
                    int i10 = this.f60298b;
                    sb2.append(g(str.substring(i10, this.f60300d + i10)));
                }
                sb2.append(')');
                return sb2.toString();
            }
        }

        c(j jVar, b bVar) {
            int i10;
            int i11;
            int i12;
            b bVar2 = bVar;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (bVar2 == null) {
                    break;
                }
                int i15 = i13 + bVar2.f60290d;
                b bVar3 = bVar2.f60291e;
                boolean z10 = (bVar2.f60287a == Zg.h.BYTE && bVar3 == null && bVar2.f60289c != 0) || !(bVar3 == null || bVar2.f60289c == bVar3.f60289c);
                i10 = z10 ? 1 : i14;
                if (bVar3 == null || bVar3.f60287a != bVar2.f60287a || z10) {
                    this.f60294a.add(0, new a(bVar2.f60287a, bVar2.f60288b, bVar2.f60289c, i15));
                    i12 = 0;
                } else {
                    i12 = i15;
                }
                if (z10) {
                    this.f60294a.add(0, new a(Zg.h.ECI, bVar2.f60288b, bVar2.f60289c, 0));
                }
                i14 = i10;
                bVar2 = bVar3;
                i13 = i12;
            }
            if (f.this.f60282b) {
                a aVar = this.f60294a.get(0);
                if (aVar != null) {
                    Zg.h hVar = aVar.f60297a;
                    int i16 = i14;
                    Zg.h hVar2 = Zg.h.ECI;
                    if (hVar != hVar2 && i16 != 0) {
                        this.f60294a.add(0, new a(hVar2, 0, 0, 0));
                    }
                }
                this.f60294a.add(this.f60294a.get(0).f60297a == Zg.h.ECI ? 1 : 0, new a(Zg.h.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int iJ = jVar.j();
            int i17 = a.f60285a[f.m(jVar).ordinal()];
            if (i17 == 1) {
                i11 = 9;
            } else if (i17 != 2) {
                i10 = 27;
                i11 = 40;
            } else {
                i10 = 10;
                i11 = 26;
            }
            int iD = d(jVar);
            while (iJ < i11 && !C6252c.v(iD, j.i(iJ), f.this.f60284d)) {
                iJ++;
            }
            while (iJ > i10 && C6252c.v(iD, j.i(iJ - 1), f.this.f60284d)) {
                iJ--;
            }
            this.f60295b = j.i(iJ);
        }

        private int d(j jVar) {
            Iterator<a> it = this.f60294a.iterator();
            int iF = 0;
            while (it.hasNext()) {
                iF += it.next().f(jVar);
            }
            return iF;
        }

        void b(Gg.a aVar) throws WriterException {
            Iterator<a> it = this.f60294a.iterator();
            while (it.hasNext()) {
                it.next().d(aVar);
            }
        }

        int c() {
            return d(this.f60295b);
        }

        j e() {
            return this.f60295b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            a aVar = null;
            for (a aVar2 : this.f60294a) {
                if (aVar != null) {
                    sb2.append(",");
                }
                sb2.append(aVar2.toString());
                aVar = aVar2;
            }
            return sb2.toString();
        }
    }

    private enum d {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");


        /* renamed from: a, reason: collision with root package name */
        private final String f60306a;

        @Override // java.lang.Enum
        public String toString() {
            return this.f60306a;
        }

        d(String str) {
            this.f60306a = str;
        }
    }

    static int k(Zg.h hVar) {
        int i10;
        if (hVar == null || (i10 = a.f60286b[hVar.ordinal()]) == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new IllegalStateException("Illegal mode " + hVar);
    }

    void f(j jVar, b[][][] bVarArr, int i10, b bVar) {
        int i11;
        int iG = this.f60283c.g();
        int iF = this.f60283c.f();
        if (iF < 0 || !this.f60283c.a(this.f60281a.charAt(i10), iF)) {
            iF = 0;
        } else {
            iG = iF + 1;
        }
        int i12 = iG;
        for (int i13 = iF; i13 < i12; i13++) {
            if (this.f60283c.a(this.f60281a.charAt(i10), i13)) {
                e(bVarArr, i10, new b(this, Zg.h.BYTE, i10, i13, 1, bVar, jVar, null));
            }
        }
        Zg.h hVar = Zg.h.KANJI;
        if (g(hVar, this.f60281a.charAt(i10))) {
            e(bVarArr, i10, new b(this, hVar, i10, 0, 1, bVar, jVar, null));
        }
        int length = this.f60281a.length();
        Zg.h hVar2 = Zg.h.ALPHANUMERIC;
        int i14 = 2;
        if (g(hVar2, this.f60281a.charAt(i10))) {
            int i15 = i10 + 1;
            e(bVarArr, i10, new b(this, hVar2, i10, 0, (i15 >= length || !g(hVar2, this.f60281a.charAt(i15))) ? 1 : 2, bVar, jVar, null));
        }
        Zg.h hVar3 = Zg.h.NUMERIC;
        if (g(hVar3, this.f60281a.charAt(i10))) {
            int i16 = i10 + 1;
            if (i16 >= length || !g(hVar3, this.f60281a.charAt(i16))) {
                i11 = 1;
            } else {
                int i17 = i10 + 2;
                if (i17 < length && g(hVar3, this.f60281a.charAt(i17))) {
                    i14 = 3;
                }
                i11 = i14;
            }
            e(bVarArr, i10, new b(this, hVar3, i10, 0, i11, bVar, jVar, null));
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60285a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f60286b;

        static {
            int[] iArr = new int[Zg.h.values().length];
            f60286b = iArr;
            try {
                iArr[Zg.h.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60286b[Zg.h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60286b[Zg.h.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60286b[Zg.h.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60286b[Zg.h.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[d.values().length];
            f60285a = iArr2;
            try {
                iArr2[d.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60285a[d.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60285a[d.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static c i(String str, j jVar, Charset charset, boolean z10, Zg.f fVar) throws WriterException {
        return new f(str, charset, z10, fVar).h(jVar);
    }

    static j l(d dVar) {
        int i10 = a.f60285a[dVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? j.i(40) : j.i(26) : j.i(9);
    }

    static boolean p(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    boolean g(Zg.h hVar, char c10) {
        int i10 = a.f60286b[hVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 == 4 : p(c10) : n(c10) : o(c10);
    }

    c h(j jVar) throws WriterException {
        if (jVar != null) {
            c cVarJ = j(jVar);
            if (C6252c.v(cVarJ.c(), l(m(cVarJ.e())), this.f60284d)) {
                return cVarJ;
            }
            throw new WriterException("Data too big for version" + jVar);
        }
        j[] jVarArr = {l(d.SMALL), l(d.MEDIUM), l(d.LARGE)};
        c[] cVarArr = {j(jVarArr[0]), j(jVarArr[1]), j(jVarArr[2])};
        int i10 = a.e.API_PRIORITY_OTHER;
        int i11 = -1;
        for (int i12 = 0; i12 < 3; i12++) {
            int iC = cVarArr[i12].c();
            if (C6252c.v(iC, jVarArr[i12], this.f60284d) && iC < i10) {
                i11 = i12;
                i10 = iC;
            }
        }
        if (i11 >= 0) {
            return cVarArr[i11];
        }
        throw new WriterException("Data too big for any version");
    }

    c j(j jVar) throws WriterException {
        int length = this.f60281a.length();
        b[][][] bVarArr = (b[][][]) Array.newInstance((Class<?>) b.class, length + 1, this.f60283c.g(), 4);
        f(jVar, bVarArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < this.f60283c.g(); i11++) {
                for (int i12 = 0; i12 < 4; i12++) {
                    b bVar = bVarArr[i10][i11][i12];
                    if (bVar != null && i10 < length) {
                        f(jVar, bVarArr, i10, bVar);
                    }
                }
            }
        }
        int i13 = -1;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        for (int i16 = 0; i16 < this.f60283c.g(); i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                b bVar2 = bVarArr[length][i16][i17];
                if (bVar2 != null && bVar2.f60292f < i14) {
                    i14 = bVar2.f60292f;
                    i13 = i16;
                    i15 = i17;
                }
            }
        }
        if (i13 >= 0) {
            return new c(jVar, bVarArr[length][i13][i15]);
        }
        throw new WriterException("Internal error: failed to encode \"" + this.f60281a + "\"");
    }

    f(String str, Charset charset, boolean z10, Zg.f fVar) {
        this.f60281a = str;
        this.f60282b = z10;
        this.f60283c = new h(str, charset, -1);
        this.f60284d = fVar;
    }

    static d m(j jVar) {
        if (jVar.j() <= 9) {
            return d.SMALL;
        }
        if (jVar.j() <= 26) {
            return d.MEDIUM;
        }
        return d.LARGE;
    }

    static boolean n(char c10) {
        if (C6252c.p(c10) != -1) {
            return true;
        }
        return false;
    }

    static boolean o(char c10) {
        return C6252c.s(String.valueOf(c10));
    }

    void e(b[][][] bVarArr, int i10, b bVar) {
        b[] bVarArr2 = bVarArr[i10 + bVar.f60290d][bVar.f60289c];
        int iK = k(bVar.f60287a);
        b bVar2 = bVarArr2[iK];
        if (bVar2 != null && bVar2.f60292f <= bVar.f60292f) {
            return;
        }
        bVarArr2[iK] = bVar;
    }
}
