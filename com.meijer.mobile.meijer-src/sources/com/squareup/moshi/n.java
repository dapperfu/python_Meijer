package com.squareup.moshi;

import com.google.maps.android.BuildConfig;
import gw.InterfaceC14417f;
import java.io.IOException;

/* loaded from: classes12.dex */
final class n extends q {

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f127330m = new String[128];

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC14417f f127331j;

    /* renamed from: k, reason: collision with root package name */
    private String f127332k = ":";

    /* renamed from: l, reason: collision with root package name */
    private String f127333l;

    @Override // com.squareup.moshi.q
    public q d() throws IOException {
        return e0(1, 2, ']');
    }

    @Override // com.squareup.moshi.q
    public q g() throws IOException {
        this.f127348h = false;
        return e0(3, 5, '}');
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f127330m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f127330m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    private void h0() throws IOException {
        if (this.f127345e == null) {
            return;
        }
        this.f127331j.writeByte(10);
        int i10 = this.f127341a;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f127331j.G0(this.f127345e);
        }
    }

    private q j0(int i10, int i11, char c10) throws IOException {
        int i12 = this.f127341a;
        int i13 = this.f127349i;
        if (i12 == i13) {
            int[] iArr = this.f127342b;
            if (iArr[i12 - 1] == i10 || iArr[i12 - 1] == i11) {
                this.f127349i = ~i13;
                return this;
            }
        }
        b0();
        c();
        z(i10);
        this.f127344d[this.f127341a - 1] = 0;
        this.f127331j.writeByte(c10);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void k0(gw.InterfaceC14417f r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.squareup.moshi.n.f127330m
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
            r7.N0(r8, r4, r3)
        L2e:
            r7.G0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.N0(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.n.k0(gw.f, java.lang.String):void");
    }

    private void m0() throws IOException {
        if (this.f127333l != null) {
            Y();
            k0(this.f127331j, this.f127333l);
            this.f127333l = null;
        }
    }

    @Override // com.squareup.moshi.q
    public q J(double d10) throws IOException {
        if (!this.f127346f && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f127348h) {
            this.f127348h = false;
            return l(Double.toString(d10));
        }
        m0();
        b0();
        this.f127331j.G0(Double.toString(d10));
        int[] iArr = this.f127344d;
        int i10 = this.f127341a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q K(long j10) throws IOException {
        if (this.f127348h) {
            this.f127348h = false;
            return l(Long.toString(j10));
        }
        m0();
        b0();
        this.f127331j.G0(Long.toString(j10));
        int[] iArr = this.f127344d;
        int i10 = this.f127341a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q O(Number number) throws IOException {
        if (number == null) {
            return m();
        }
        String string = number.toString();
        if (!this.f127346f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f127348h) {
            this.f127348h = false;
            return l(string);
        }
        m0();
        b0();
        this.f127331j.G0(string);
        int[] iArr = this.f127344d;
        int i10 = this.f127341a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q R(String str) throws IOException {
        if (str == null) {
            return m();
        }
        if (this.f127348h) {
            this.f127348h = false;
            return l(str);
        }
        m0();
        b0();
        k0(this.f127331j, str);
        int[] iArr = this.f127344d;
        int i10 = this.f127341a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q T(boolean z10) throws IOException {
        if (this.f127348h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        m0();
        b0();
        this.f127331j.G0(z10 ? "true" : "false");
        int[] iArr = this.f127344d;
        int i10 = this.f127341a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q a() throws IOException {
        if (!this.f127348h) {
            m0();
            return j0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.q
    public q b() throws IOException {
        if (!this.f127348h) {
            m0();
            return j0(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f127331j.close();
        int i10 = this.f127341a;
        if (i10 > 1 || (i10 == 1 && this.f127342b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f127341a = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f127341a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f127331j.flush();
    }

    @Override // com.squareup.moshi.q
    public q l(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f127341a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iU = u();
        if ((iU != 3 && iU != 5) || this.f127333l != null || this.f127348h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f127333l = str;
        this.f127343c[this.f127341a - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.q
    public q m() throws IOException {
        if (this.f127348h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        if (this.f127333l != null) {
            if (!this.f127347g) {
                this.f127333l = null;
                return this;
            }
            m0();
        }
        b0();
        this.f127331j.G0(BuildConfig.TRAVIS);
        int[] iArr = this.f127344d;
        int i10 = this.f127341a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    n(InterfaceC14417f interfaceC14417f) {
        if (interfaceC14417f != null) {
            this.f127331j = interfaceC14417f;
            z(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    private void Y() throws IOException {
        int iU = u();
        if (iU == 5) {
            this.f127331j.writeByte(44);
        } else if (iU != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        h0();
        A(4);
    }

    private void b0() throws IOException {
        int iU = u();
        int i10 = 2;
        if (iU != 1) {
            if (iU != 2) {
                if (iU != 4) {
                    if (iU != 9) {
                        i10 = 7;
                        if (iU != 6) {
                            if (iU == 7) {
                                if (!this.f127346f) {
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
                    this.f127331j.G0(this.f127332k);
                    i10 = 5;
                }
            } else {
                this.f127331j.writeByte(44);
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
        if (this.f127333l == null) {
            int i12 = this.f127341a;
            int i13 = this.f127349i;
            if (i12 == (~i13)) {
                this.f127349i = ~i13;
                return this;
            }
            int i14 = i12 - 1;
            this.f127341a = i14;
            this.f127343c[i14] = null;
            int[] iArr = this.f127344d;
            int i15 = i12 - 2;
            iArr[i15] = iArr[i15] + 1;
            if (iU == i11) {
                h0();
            }
            this.f127331j.writeByte(c10);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f127333l);
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
        this.f127332k = str2;
    }
}
