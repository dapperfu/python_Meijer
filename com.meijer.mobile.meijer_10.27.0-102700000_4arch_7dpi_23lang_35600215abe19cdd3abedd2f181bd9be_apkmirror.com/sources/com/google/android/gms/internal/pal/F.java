package com.google.android.gms.internal.pal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class F implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Reader f82592a;

    /* renamed from: h, reason: collision with root package name */
    private long f82599h;

    /* renamed from: i, reason: collision with root package name */
    private int f82600i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f82601j;

    /* renamed from: l, reason: collision with root package name */
    private String[] f82603l;

    /* renamed from: m, reason: collision with root package name */
    private int[] f82604m;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f82593b = new char[1024];

    /* renamed from: c, reason: collision with root package name */
    private int f82594c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f82595d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f82596e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f82597f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f82598g = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f82602k = 1;

    static {
        nf.f83250a = new E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
    
        throw u("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String z() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r5.f82594c
            int r3 = r3 + r2
            int r4 = r5.f82595d
            if (r3 >= r4) goto L4f
            char[] r4 = r5.f82593b
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5b
            r4 = 10
            if (r3 == r4) goto L5b
            r4 = 12
            if (r3 == r4) goto L5b
            r4 = 13
            if (r3 == r4) goto L5b
            r4 = 32
            if (r3 == r4) goto L5b
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L5b
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5b
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5b
            r4 = 58
            if (r3 == r4) goto L5b
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L5b;
                case 92: goto L48;
                case 93: goto L5b;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r5.u(r0)
            throw r0
        L4f:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5d
            int r3 = r2 + 1
            boolean r3 = r5.B(r3)
            if (r3 != 0) goto L3
        L5b:
            r1 = r2
            goto L7d
        L5d:
            if (r0 != 0) goto L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6a:
            char[] r3 = r5.f82593b
            int r4 = r5.f82594c
            r0.append(r3, r4, r2)
            int r3 = r5.f82594c
            int r3 = r3 + r2
            r5.f82594c = r3
            r2 = 1
            boolean r2 = r5.B(r2)
            if (r2 != 0) goto L2
        L7d:
            if (r0 != 0) goto L89
            java.lang.String r0 = new java.lang.String
            char[] r2 = r5.f82593b
            int r3 = r5.f82594c
            r0.<init>(r2, r3, r1)
            goto L94
        L89:
            char[] r2 = r5.f82593b
            int r3 = r5.f82594c
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L94:
            int r2 = r5.f82594c
            int r2 = r2 + r1
            r5.f82594c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.F.z():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f82598g = 0;
        this.f82601j[0] = 8;
        this.f82602k = 1;
        this.f82592a.close();
    }

    private final void A(int i10) {
        int i11 = this.f82602k;
        int[] iArr = this.f82601j;
        if (i11 == iArr.length) {
            int i12 = i11 + i11;
            this.f82601j = Arrays.copyOf(iArr, i12);
            this.f82604m = Arrays.copyOf(this.f82604m, i12);
            this.f82603l = (String[]) Arrays.copyOf(this.f82603l, i12);
        }
        int[] iArr2 = this.f82601j;
        int i13 = this.f82602k;
        this.f82602k = i13 + 1;
        iArr2[i13] = i10;
    }

    private final boolean B(int i10) throws IOException {
        int i11;
        char[] cArr = this.f82593b;
        int i12 = this.f82597f;
        int i13 = this.f82594c;
        this.f82597f = i12 - i13;
        int i14 = this.f82595d;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f82595d = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f82595d = 0;
        }
        this.f82594c = 0;
        do {
            Reader reader = this.f82592a;
            int i16 = this.f82595d;
            int i17 = reader.read(cArr, i16, 1024 - i16);
            if (i17 == -1) {
                return false;
            }
            i11 = this.f82595d + i17;
            this.f82595d = i11;
            if (this.f82596e == 0 && this.f82597f == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f82594c++;
                this.f82597f = 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private final boolean D(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        throw u("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final int p(boolean z10) throws IOException {
        char[] cArr = this.f82593b;
        int i10 = this.f82594c;
        int i11 = this.f82595d;
        while (true) {
            if (i10 == i11) {
                this.f82594c = i10;
                if (!B(1)) {
                    if (z10) {
                        throw new EOFException("End of input".concat(b()));
                    }
                    return -1;
                }
                i10 = this.f82594c;
                i11 = this.f82595d;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f82596e++;
                this.f82597f = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 != '/') {
                    if (c10 != '#') {
                        this.f82594c = i12;
                        return c10;
                    }
                    this.f82594c = i12;
                    throw u("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                this.f82594c = i12;
                if (i12 == i11) {
                    this.f82594c = i10;
                    boolean zB = B(2);
                    this.f82594c++;
                    if (!zB) {
                        return 47;
                    }
                }
                throw u("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
            i10 = i12;
        }
    }

    private final IOException u(String str) throws IOException {
        throw new zzabf(str.concat(b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0119, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011b, code lost:
    
        r1 = r2 - r3;
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0128, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.f82594c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String w(char r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.F.w(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x01bb, code lost:
    
        if (D(r12) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01bf, code lost:
    
        if (r9 != 2) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01c1, code lost:
    
        if (r18 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c7, code lost:
    
        if (r6 != Long.MIN_VALUE) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c9, code lost:
    
        if (r19 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01cb, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01cd, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01cf, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01d3, code lost:
    
        if (r6 != 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01d5, code lost:
    
        if (r3 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d8, code lost:
    
        if (r3 == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01db, code lost:
    
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01dc, code lost:
    
        r24.f82599h = r6;
        r24.f82594c += r8;
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01e5, code lost:
    
        r24.f82598g = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01e8, code lost:
    
        if (r9 == 2) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01eb, code lost:
    
        if (r9 == 4) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01ee, code lost:
    
        if (r9 != 7) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01f0, code lost:
    
        r24.f82600i = r8;
        r6 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.F.a():int");
    }

    final String b() {
        int i10 = this.f82596e;
        int i11 = this.f82594c;
        int i12 = this.f82597f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" at line ");
        sb2.append(i10 + 1);
        sb2.append(" column ");
        sb2.append((i11 - i12) + 1);
        sb2.append(" path ");
        StringBuilder sb3 = new StringBuilder();
        sb3.append('$');
        for (int i13 = 0; i13 < this.f82602k; i13++) {
            int i14 = this.f82601j[i13];
            if (i14 == 1 || i14 == 2) {
                int i15 = this.f82604m[i13];
                sb3.append('[');
                sb3.append(i15);
                sb3.append(']');
            } else if (i14 == 3 || i14 == 4 || i14 == 5) {
                sb3.append('.');
                String str = this.f82603l[i13];
                if (str != null) {
                    sb3.append(str);
                }
            }
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public final String c() throws IOException {
        String strW;
        int iA = this.f82598g;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 14) {
            strW = z();
        } else if (iA == 12) {
            strW = w('\'');
        } else {
            if (iA != 13) {
                throw new IllegalStateException("Expected a name but was " + ((Object) G.a(m())) + b());
            }
            strW = w('\"');
        }
        this.f82598g = 0;
        this.f82603l[this.f82602k - 1] = strW;
        return strW;
    }

    public final void d() throws IOException {
        int iA = this.f82598g;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 1) {
            A(3);
            this.f82598g = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + ((Object) G.a(m())) + b());
        }
    }

    public final void g() throws IOException {
        int iA = this.f82598g;
        if (iA == 0) {
            iA = a();
        }
        if (iA != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + ((Object) G.a(m())) + b());
        }
        int i10 = this.f82602k;
        this.f82602k = i10 - 1;
        int[] iArr = this.f82604m;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f82598g = 0;
    }

    public final void h() throws IOException {
        int iA = this.f82598g;
        if (iA == 0) {
            iA = a();
        }
        if (iA != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + ((Object) G.a(m())) + b());
        }
        int i10 = this.f82602k;
        int i11 = i10 - 1;
        this.f82602k = i11;
        this.f82603l[i11] = null;
        int[] iArr = this.f82604m;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f82598g = 0;
    }

    public final void i() throws IOException {
        int iA = this.f82598g;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 7) {
            this.f82598g = 0;
            int[] iArr = this.f82604m;
            int i10 = this.f82602k - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + ((Object) G.a(m())) + b());
    }

    public final boolean j() throws IOException {
        int iA = this.f82598g;
        if (iA == 0) {
            iA = a();
        }
        return (iA == 2 || iA == 4 || iA == 17) ? false : true;
    }

    public final boolean l() throws IOException {
        int iA = this.f82598g;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 5) {
            this.f82598g = 0;
            int[] iArr = this.f82604m;
            int i10 = this.f82602k - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iA == 6) {
            this.f82598g = 0;
            int[] iArr2 = this.f82604m;
            int i11 = this.f82602k - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + ((Object) G.a(m())) + b());
    }

    public final int m() throws IOException {
        int iA = this.f82598g;
        if (iA == 0) {
            iA = a();
        }
        switch (iA) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return F.class.getSimpleName().concat(b());
    }

    public final String zzd() throws IOException {
        String str;
        int iA = this.f82598g;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 10) {
            str = z();
        } else if (iA == 8) {
            str = w('\'');
        } else if (iA == 9) {
            str = w('\"');
        } else if (iA == 11) {
            str = null;
        } else if (iA == 15) {
            str = Long.toString(this.f82599h);
        } else {
            if (iA != 16) {
                throw new IllegalStateException("Expected a string but was " + ((Object) G.a(m())) + b());
            }
            str = new String(this.f82593b, this.f82594c, this.f82600i);
            this.f82594c += this.f82600i;
        }
        this.f82598g = 0;
        int[] iArr = this.f82604m;
        int i10 = this.f82602k - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public final void zze() throws IOException {
        int iA = this.f82598g;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 3) {
            A(1);
            this.f82604m[this.f82602k - 1] = 0;
            this.f82598g = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + ((Object) G.a(m())) + b());
        }
    }

    public F(Reader reader) {
        int[] iArr = new int[32];
        this.f82601j = iArr;
        iArr[0] = 6;
        this.f82603l = new String[32];
        this.f82604m = new int[32];
        this.f82592a = reader;
    }
}
