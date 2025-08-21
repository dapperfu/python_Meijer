package com.bugsnag.android;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.bugsnag.android.w0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6626w0 implements Closeable, Flushable {

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f64460j = new String[128];

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f64461k;

    /* renamed from: a, reason: collision with root package name */
    private final Writer f64462a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f64463b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    private int f64464c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f64465d;

    /* renamed from: e, reason: collision with root package name */
    private String f64466e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f64467f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f64468g;

    /* renamed from: h, reason: collision with root package name */
    private String f64469h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f64470i;

    public C6626w0 h() throws IOException {
        return g(1, 2, "]");
    }

    public C6626w0 i() throws IOException {
        return g(3, 5, "}");
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f64460j[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f64460j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f64461k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    private void A(int i10) {
        this.f64463b[this.f64464c - 1] = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void D(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f64468g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.bugsnag.android.C6626w0.f64461k
            goto L9
        L7:
            java.lang.String[] r0 = com.bugsnag.android.C6626w0.f64460j
        L9:
            java.io.Writer r1 = r8.f64462a
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f64462a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f64462a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f64462a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f64462a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C6626w0.D(java.lang.String):void");
    }

    private void T() throws IOException {
        if (this.f64469h != null) {
            a();
            D(this.f64469h);
            this.f64469h = null;
        }
    }

    private void m() throws IOException {
        if (this.f64465d == null) {
            return;
        }
        this.f64462a.write("\n");
        int i10 = this.f64464c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f64462a.write(this.f64465d);
        }
    }

    private int w() {
        int i10 = this.f64464c;
        if (i10 != 0) {
            return this.f64463b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void z(int i10) {
        int i11 = this.f64464c;
        int[] iArr = this.f64463b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[i11 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f64463b = iArr2;
        }
        int[] iArr3 = this.f64463b;
        int i12 = this.f64464c;
        this.f64464c = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void B(boolean z10) {
        this.f64470i = z10;
    }

    public C6626w0 J(Boolean bool) throws IOException {
        if (bool == null) {
            return p();
        }
        T();
        b();
        this.f64462a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public C6626w0 K(Number number) throws IOException {
        if (number == null) {
            return p();
        }
        String string = number.toString();
        if (!this.f64467f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            this.f64469h = null;
            return this;
        }
        T();
        b();
        this.f64462a.write(string);
        return this;
    }

    public C6626w0 O(String str) throws IOException {
        if (str == null) {
            return p();
        }
        T();
        b();
        D(str);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f64462a.close();
        int i10 = this.f64464c;
        if (i10 > 1 || (i10 == 1 && this.f64463b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f64464c = 0;
    }

    public void flush() throws IOException {
        if (this.f64464c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f64462a.flush();
    }

    public final boolean j() {
        return this.f64470i;
    }

    public C6626w0 l(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f64469h != null) {
            throw new IllegalStateException();
        }
        if (this.f64464c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f64469h = str;
        return this;
    }

    public C6626w0 p() throws IOException {
        if (this.f64469h != null) {
            if (!this.f64470i) {
                this.f64469h = null;
                return this;
            }
            T();
        }
        b();
        this.f64462a.write(com.google.maps.android.BuildConfig.TRAVIS);
        return this;
    }

    public C6626w0(Writer writer) {
        z(6);
        this.f64466e = ":";
        this.f64470i = true;
        if (writer != null) {
            this.f64462a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private void a() throws IOException {
        int iW = w();
        if (iW == 5) {
            this.f64462a.write(44);
        } else if (iW != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m();
        A(4);
    }

    private C6626w0 g(int i10, int i11, String str) throws IOException {
        int iW = w();
        if (iW != i11 && iW != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f64469h == null) {
            this.f64464c--;
            if (iW == i11) {
                m();
            }
            this.f64462a.write(str);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f64469h);
    }

    private C6626w0 u(int i10, String str) throws IOException {
        b();
        z(i10);
        this.f64462a.write(str);
        return this;
    }

    public C6626w0 H(long j10) throws IOException {
        T();
        b();
        this.f64462a.write(Long.toString(j10));
        return this;
    }

    public C6626w0 R(boolean z10) throws IOException {
        String str;
        T();
        b();
        Writer writer = this.f64462a;
        if (z10) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    void b() throws IOException {
        int iW = w();
        if (iW != 1) {
            if (iW != 2) {
                if (iW != 4) {
                    if (iW != 6) {
                        if (iW == 7) {
                            if (!this.f64467f) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    A(7);
                    return;
                }
                this.f64462a.write(this.f64466e);
                A(5);
                return;
            }
            this.f64462a.write(44);
            m();
            return;
        }
        A(2);
        m();
    }

    public C6626w0 c() throws IOException {
        T();
        return u(1, "[");
    }

    public C6626w0 d() throws IOException {
        T();
        return u(3, "{");
    }
}
