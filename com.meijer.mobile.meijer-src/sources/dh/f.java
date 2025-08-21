package dh;

import Ig.h;
import bh.j;
import com.google.android.gms.common.api.a;
import com.google.zxing.WriterException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f128516a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f128517b;

    /* renamed from: c, reason: collision with root package name */
    private final h f128518c;

    /* renamed from: d, reason: collision with root package name */
    private final bh.f f128519d;

    private final class b {

        /* renamed from: a, reason: collision with root package name */
        private final bh.h f128522a;

        /* renamed from: b, reason: collision with root package name */
        private final int f128523b;

        /* renamed from: c, reason: collision with root package name */
        private final int f128524c;

        /* renamed from: d, reason: collision with root package name */
        private final int f128525d;

        /* renamed from: e, reason: collision with root package name */
        private final b f128526e;

        /* renamed from: f, reason: collision with root package name */
        private final int f128527f;

        /* synthetic */ b(f fVar, bh.h hVar, int i10, int i11, int i12, b bVar, j jVar, a aVar) {
            this(hVar, i10, i11, i12, bVar, jVar);
        }

        private b(bh.h hVar, int i10, int i11, int i12, b bVar, j jVar) {
            this.f128522a = hVar;
            this.f128523b = i10;
            bh.h hVar2 = bh.h.BYTE;
            int i13 = (hVar == hVar2 || bVar == null) ? i11 : bVar.f128524c;
            this.f128524c = i13;
            this.f128525d = i12;
            this.f128526e = bVar;
            boolean z10 = false;
            int iE = bVar != null ? bVar.f128527f : 0;
            if ((hVar == hVar2 && bVar == null && i13 != 0) || (bVar != null && i13 != bVar.f128524c)) {
                z10 = true;
            }
            iE = (bVar == null || hVar != bVar.f128522a || z10) ? iE + hVar.e(jVar) + 4 : iE;
            int i14 = a.f128521b[hVar.ordinal()];
            if (i14 == 1) {
                iE += 13;
            } else if (i14 == 2) {
                iE += i12 == 1 ? 6 : 11;
            } else if (i14 == 3) {
                iE += i12 != 1 ? i12 == 2 ? 7 : 10 : 4;
            } else if (i14 == 4) {
                iE += f.this.f128518c.c(f.this.f128516a.substring(i10, i12 + i10), i11).length * 8;
                if (z10) {
                    iE += 12;
                }
            }
            this.f128527f = iE;
        }
    }

    final class c {

        /* renamed from: a, reason: collision with root package name */
        private final List<a> f128529a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final j f128530b;

        final class a {

            /* renamed from: a, reason: collision with root package name */
            private final bh.h f128532a;

            /* renamed from: b, reason: collision with root package name */
            private final int f128533b;

            /* renamed from: c, reason: collision with root package name */
            private final int f128534c;

            /* renamed from: d, reason: collision with root package name */
            private final int f128535d;

            a(bh.h hVar, int i10, int i11, int i12) {
                this.f128532a = hVar;
                this.f128533b = i10;
                this.f128534c = i11;
                this.f128535d = i12;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void d(Ig.a aVar) throws WriterException {
                aVar.c(this.f128532a.b(), 4);
                if (this.f128535d > 0) {
                    aVar.c(e(), this.f128532a.e(c.this.f128530b));
                }
                if (this.f128532a == bh.h.ECI) {
                    aVar.c(f.this.f128518c.e(this.f128534c), 8);
                } else if (this.f128535d > 0) {
                    String str = f.this.f128516a;
                    int i10 = this.f128533b;
                    dh.c.c(str.substring(i10, this.f128535d + i10), this.f128532a, aVar, f.this.f128518c.d(this.f128534c));
                }
            }

            private int e() {
                if (this.f128532a != bh.h.BYTE) {
                    return this.f128535d;
                }
                h hVar = f.this.f128518c;
                String str = f.this.f128516a;
                int i10 = this.f128533b;
                return hVar.c(str.substring(i10, this.f128535d + i10), this.f128534c).length;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int f(j jVar) {
                int iE;
                int iE2 = this.f128532a.e(jVar);
                int i10 = iE2 + 4;
                int i11 = a.f128521b[this.f128532a.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        int i12 = this.f128535d;
                        return i10 + ((i12 / 2) * 11) + (i12 % 2 == 1 ? 6 : 0);
                    }
                    if (i11 == 3) {
                        int i13 = this.f128535d;
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
                    iE = this.f128535d * 13;
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
                sb2.append(this.f128532a);
                sb2.append('(');
                if (this.f128532a == bh.h.ECI) {
                    sb2.append(f.this.f128518c.d(this.f128534c).displayName());
                } else {
                    String str = f.this.f128516a;
                    int i10 = this.f128533b;
                    sb2.append(g(str.substring(i10, this.f128535d + i10)));
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
                int i15 = i13 + bVar2.f128525d;
                b bVar3 = bVar2.f128526e;
                boolean z10 = (bVar2.f128522a == bh.h.BYTE && bVar3 == null && bVar2.f128524c != 0) || !(bVar3 == null || bVar2.f128524c == bVar3.f128524c);
                i10 = z10 ? 1 : i14;
                if (bVar3 == null || bVar3.f128522a != bVar2.f128522a || z10) {
                    this.f128529a.add(0, new a(bVar2.f128522a, bVar2.f128523b, bVar2.f128524c, i15));
                    i12 = 0;
                } else {
                    i12 = i15;
                }
                if (z10) {
                    this.f128529a.add(0, new a(bh.h.ECI, bVar2.f128523b, bVar2.f128524c, 0));
                }
                i14 = i10;
                bVar2 = bVar3;
                i13 = i12;
            }
            if (f.this.f128517b) {
                a aVar = this.f128529a.get(0);
                if (aVar != null) {
                    bh.h hVar = aVar.f128532a;
                    int i16 = i14;
                    bh.h hVar2 = bh.h.ECI;
                    if (hVar != hVar2 && i16 != 0) {
                        this.f128529a.add(0, new a(hVar2, 0, 0, 0));
                    }
                }
                this.f128529a.add(this.f128529a.get(0).f128532a == bh.h.ECI ? 1 : 0, new a(bh.h.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int iJ = jVar.j();
            int i17 = a.f128520a[f.m(jVar).ordinal()];
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
            while (iJ < i11 && !dh.c.v(iD, j.i(iJ), f.this.f128519d)) {
                iJ++;
            }
            while (iJ > i10 && dh.c.v(iD, j.i(iJ - 1), f.this.f128519d)) {
                iJ--;
            }
            this.f128530b = j.i(iJ);
        }

        private int d(j jVar) {
            Iterator<a> it = this.f128529a.iterator();
            int iF = 0;
            while (it.hasNext()) {
                iF += it.next().f(jVar);
            }
            return iF;
        }

        void b(Ig.a aVar) throws WriterException {
            Iterator<a> it = this.f128529a.iterator();
            while (it.hasNext()) {
                it.next().d(aVar);
            }
        }

        int c() {
            return d(this.f128530b);
        }

        j e() {
            return this.f128530b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            a aVar = null;
            for (a aVar2 : this.f128529a) {
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
        private final String f128541a;

        @Override // java.lang.Enum
        public String toString() {
            return this.f128541a;
        }

        d(String str) {
            this.f128541a = str;
        }
    }

    static int k(bh.h hVar) {
        int i10;
        if (hVar == null || (i10 = a.f128521b[hVar.ordinal()]) == 1) {
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
        int iG = this.f128518c.g();
        int iF = this.f128518c.f();
        if (iF < 0 || !this.f128518c.a(this.f128516a.charAt(i10), iF)) {
            iF = 0;
        } else {
            iG = iF + 1;
        }
        int i12 = iG;
        for (int i13 = iF; i13 < i12; i13++) {
            if (this.f128518c.a(this.f128516a.charAt(i10), i13)) {
                e(bVarArr, i10, new b(this, bh.h.BYTE, i10, i13, 1, bVar, jVar, null));
            }
        }
        bh.h hVar = bh.h.KANJI;
        if (g(hVar, this.f128516a.charAt(i10))) {
            e(bVarArr, i10, new b(this, hVar, i10, 0, 1, bVar, jVar, null));
        }
        int length = this.f128516a.length();
        bh.h hVar2 = bh.h.ALPHANUMERIC;
        int i14 = 2;
        if (g(hVar2, this.f128516a.charAt(i10))) {
            int i15 = i10 + 1;
            e(bVarArr, i10, new b(this, hVar2, i10, 0, (i15 >= length || !g(hVar2, this.f128516a.charAt(i15))) ? 1 : 2, bVar, jVar, null));
        }
        bh.h hVar3 = bh.h.NUMERIC;
        if (g(hVar3, this.f128516a.charAt(i10))) {
            int i16 = i10 + 1;
            if (i16 >= length || !g(hVar3, this.f128516a.charAt(i16))) {
                i11 = 1;
            } else {
                int i17 = i10 + 2;
                if (i17 < length && g(hVar3, this.f128516a.charAt(i17))) {
                    i14 = 3;
                }
                i11 = i14;
            }
            e(bVarArr, i10, new b(this, hVar3, i10, 0, i11, bVar, jVar, null));
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128520a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f128521b;

        static {
            int[] iArr = new int[bh.h.values().length];
            f128521b = iArr;
            try {
                iArr[bh.h.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f128521b[bh.h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f128521b[bh.h.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f128521b[bh.h.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f128521b[bh.h.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[d.values().length];
            f128520a = iArr2;
            try {
                iArr2[d.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f128520a[d.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f128520a[d.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static c i(String str, j jVar, Charset charset, boolean z10, bh.f fVar) throws WriterException {
        return new f(str, charset, z10, fVar).h(jVar);
    }

    static j l(d dVar) {
        int i10 = a.f128520a[dVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? j.i(40) : j.i(26) : j.i(9);
    }

    static boolean p(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    boolean g(bh.h hVar, char c10) {
        int i10 = a.f128521b[hVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 == 4 : p(c10) : n(c10) : o(c10);
    }

    c h(j jVar) throws WriterException {
        if (jVar != null) {
            c cVarJ = j(jVar);
            if (dh.c.v(cVarJ.c(), l(m(cVarJ.e())), this.f128519d)) {
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
            if (dh.c.v(iC, jVarArr[i12], this.f128519d) && iC < i10) {
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
        int length = this.f128516a.length();
        b[][][] bVarArr = (b[][][]) Array.newInstance((Class<?>) b.class, length + 1, this.f128518c.g(), 4);
        f(jVar, bVarArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < this.f128518c.g(); i11++) {
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
        for (int i16 = 0; i16 < this.f128518c.g(); i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                b bVar2 = bVarArr[length][i16][i17];
                if (bVar2 != null && bVar2.f128527f < i14) {
                    i14 = bVar2.f128527f;
                    i13 = i16;
                    i15 = i17;
                }
            }
        }
        if (i13 >= 0) {
            return new c(jVar, bVarArr[length][i13][i15]);
        }
        throw new WriterException("Internal error: failed to encode \"" + this.f128516a + "\"");
    }

    f(String str, Charset charset, boolean z10, bh.f fVar) {
        this.f128516a = str;
        this.f128517b = z10;
        this.f128518c = new h(str, charset, -1);
        this.f128519d = fVar;
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
        if (dh.c.p(c10) != -1) {
            return true;
        }
        return false;
    }

    static boolean o(char c10) {
        return dh.c.s(String.valueOf(c10));
    }

    void e(b[][][] bVarArr, int i10, b bVar) {
        b[] bVarArr2 = bVarArr[i10 + bVar.f128525d][bVar.f128524c];
        int iK = k(bVar.f128522a);
        b bVar2 = bVarArr2[iK];
        if (bVar2 != null && bVar2.f128527f <= bVar.f128527f) {
            return;
        }
        bVarArr2[iK] = bVar;
    }
}
