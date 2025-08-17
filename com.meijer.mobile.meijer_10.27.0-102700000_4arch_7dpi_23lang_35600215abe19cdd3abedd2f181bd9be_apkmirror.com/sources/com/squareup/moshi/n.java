package com.squareup.moshi;

import com.google.maps.android.BuildConfig;
import java.io.IOException;
import kw.InterfaceC15329f;

/* loaded from: classes11.dex */
final class n extends q {

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f126378m = new String[128];

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC15329f f126379j;

    /* renamed from: k, reason: collision with root package name */
    private String f126380k = ":";

    /* renamed from: l, reason: collision with root package name */
    private String f126381l;

    @Override // com.squareup.moshi.q
    public q d() throws IOException {
        return e0(1, 2, ']');
    }

    @Override // com.squareup.moshi.q
    public q g() throws IOException {
        this.f126396h = false;
        return e0(3, 5, '}');
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f126378m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f126378m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    private void h0() throws IOException {
        if (this.f126393e == null) {
            return;
        }
        this.f126379j.writeByte(10);
        int i10 = this.f126389a;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f126379j.I0(this.f126393e);
        }
    }

    private q i0(int i10, int i11, char c10) throws IOException {
        int i12 = this.f126389a;
        int i13 = this.f126397i;
        if (i12 == i13) {
            int[] iArr = this.f126390b;
            if (iArr[i12 - 1] == i10 || iArr[i12 - 1] == i11) {
                this.f126397i = ~i13;
                return this;
            }
        }
        c0();
        c();
        z(i10);
        this.f126392d[this.f126389a - 1] = 0;
        this.f126379j.writeByte(c10);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void j0(kw.InterfaceC15329f r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.squareup.moshi.n.f126378m
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.Q0(r8, r4, r3)
        L2e:
            r7.I0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.Q0(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.n.j0(kw.f, java.lang.String):void");
    }

    private void l0() throws IOException {
        if (this.f126381l != null) {
            Z();
            j0(this.f126379j, this.f126381l);
            this.f126381l = null;
        }
    }

    @Override // com.squareup.moshi.q
    public q J(double d10) throws IOException {
        if (!this.f126394f && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f126396h) {
            this.f126396h = false;
            return l(Double.toString(d10));
        }
        l0();
        c0();
        this.f126379j.I0(Double.toString(d10));
        int[] iArr = this.f126392d;
        int i10 = this.f126389a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q K(long j10) throws IOException {
        if (this.f126396h) {
            this.f126396h = false;
            return l(Long.toString(j10));
        }
        l0();
        c0();
        this.f126379j.I0(Long.toString(j10));
        int[] iArr = this.f126392d;
        int i10 = this.f126389a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q O(Number number) throws IOException {
        if (number == null) {
            return m();
        }
        String string = number.toString();
        if (!this.f126394f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f126396h) {
            this.f126396h = false;
            return l(string);
        }
        l0();
        c0();
        this.f126379j.I0(string);
        int[] iArr = this.f126392d;
        int i10 = this.f126389a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q R(String str) throws IOException {
        if (str == null) {
            return m();
        }
        if (this.f126396h) {
            this.f126396h = false;
            return l(str);
        }
        l0();
        c0();
        j0(this.f126379j, str);
        int[] iArr = this.f126392d;
        int i10 = this.f126389a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q T(boolean z10) throws IOException {
        if (this.f126396h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        l0();
        c0();
        this.f126379j.I0(z10 ? "true" : "false");
        int[] iArr = this.f126392d;
        int i10 = this.f126389a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q a() throws IOException {
        if (!this.f126396h) {
            l0();
            return i0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.q
    public q b() throws IOException {
        if (!this.f126396h) {
            l0();
            return i0(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f126379j.close();
        int i10 = this.f126389a;
        if (i10 > 1 || (i10 == 1 && this.f126390b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f126389a = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f126389a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f126379j.flush();
    }

    @Override // com.squareup.moshi.q
    public q l(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f126389a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iU = u();
        if ((iU != 3 && iU != 5) || this.f126381l != null || this.f126396h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f126381l = str;
        this.f126391c[this.f126389a - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q m() throws IOException {
        if (this.f126396h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        if (this.f126381l != null) {
            if (!this.f126395g) {
                this.f126381l = null;
                return this;
            }
            l0();
        }
        c0();
        this.f126379j.I0(BuildConfig.TRAVIS);
        int[] iArr = this.f126392d;
        int i10 = this.f126389a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    n(InterfaceC15329f interfaceC15329f) {
        if (interfaceC15329f != null) {
            this.f126379j = interfaceC15329f;
            z(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    private void Z() throws IOException {
        int iU = u();
        if (iU == 5) {
            this.f126379j.writeByte(44);
        } else if (iU != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        h0();
        A(4);
    }

    private void c0() throws IOException {
        int iU = u();
        int i10 = 2;
        if (iU != 1) {
            if (iU != 2) {
                if (iU != 4) {
                    if (iU != 9) {
                        i10 = 7;
                        if (iU != 6) {
                            if (iU == 7) {
                                if (!this.f126394f) {
                                    throw new IllegalStateException("JSON must have only one top-level value.");
                                }
                            } else {
                                throw new IllegalStateException("Nesting problem.");
                            }
                        }
                    } else {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                } else {
                    this.f126379j.I0(this.f126380k);
                    i10 = 5;
                }
            } else {
                this.f126379j.writeByte(44);
                h0();
            }
        } else {
            h0();
        }
        A(i10);
    }

    private q e0(int i10, int i11, char c10) throws IOException {
        int iU = u();
        if (iU != i11 && iU != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f126381l == null) {
            int i12 = this.f126389a;
            int i13 = this.f126397i;
            if (i12 == (~i13)) {
                this.f126397i = ~i13;
                return this;
            }
            int i14 = i12 - 1;
            this.f126389a = i14;
            this.f126391c[i14] = null;
            int[] iArr = this.f126392d;
            int i15 = i12 - 2;
            iArr[i15] = iArr[i15] + 1;
            if (iU == i11) {
                h0();
            }
            this.f126379j.writeByte(c10);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f126381l);
    }

    @Override // com.squareup.moshi.q
    public void B(String str) {
        String str2;
        super.B(str);
        if (!str.isEmpty()) {
            str2 = ": ";
        } else {
            str2 = ":";
        }
        this.f126380k = str2;
    }
}
