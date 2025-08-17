package com.google.android.gms.internal.pal;

import com.google.maps.android.BuildConfig;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class H implements Closeable, Flushable {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f82629g = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f82630h = new String[128];

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f82631i;

    /* renamed from: a, reason: collision with root package name */
    private final Writer f82632a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f82633b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    private int f82634c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final String f82635d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f82636e;

    /* renamed from: f, reason: collision with root package name */
    private String f82637f;

    public final H c() throws IOException {
        u(1, 2, ']');
        return this;
    }

    public final H d() throws IOException {
        u(3, 5, '}');
        return this;
    }

    public final void m(boolean z10) {
        this.f82636e = true;
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f82630h[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f82630h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f82631i = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    private final void A(int i10) {
        int i11 = this.f82634c;
        int[] iArr = this.f82633b;
        if (i11 == iArr.length) {
            this.f82633b = Arrays.copyOf(iArr, i11 + i11);
        }
        int[] iArr2 = this.f82633b;
        int i12 = this.f82634c;
        this.f82634c = i12 + 1;
        iArr2[i12] = i10;
    }

    private final void B(int i10) {
        this.f82633b[this.f82634c - 1] = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void D(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String[] r0 = com.google.android.gms.internal.pal.H.f82630h
            java.io.Writer r1 = r8.f82632a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        Lf:
            if (r3 >= r1) goto L3e
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1e
            r5 = r0[r5]
            if (r5 != 0) goto L2b
            goto L3b
        L1e:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L25
            java.lang.String r5 = "\\u2028"
            goto L2b
        L25:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3b
            java.lang.String r5 = "\\u2029"
        L2b:
            if (r4 >= r3) goto L34
            java.io.Writer r6 = r8.f82632a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L34:
            java.io.Writer r4 = r8.f82632a
            r4.write(r5)
            int r4 = r3 + 1
        L3b:
            int r3 = r3 + 1
            goto Lf
        L3e:
            if (r4 >= r1) goto L46
            java.io.Writer r0 = r8.f82632a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L46:
            java.io.Writer r9 = r8.f82632a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.H.D(java.lang.String):void");
    }

    private final void H() throws IOException {
        if (this.f82637f != null) {
            int iP = p();
            if (iP == 5) {
                this.f82632a.write(44);
            } else if (iP != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            B(4);
            D(this.f82637f);
            this.f82637f = null;
        }
    }

    private final int p() {
        int i10 = this.f82634c;
        if (i10 != 0) {
            return this.f82633b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f82632a.close();
        int i10 = this.f82634c;
        if (i10 > 1 || (i10 == 1 && this.f82633b[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f82634c = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f82634c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f82632a.flush();
    }

    public final H g(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f82637f != null) {
            throw new IllegalStateException();
        }
        if (this.f82634c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f82637f = str;
        return this;
    }

    public final H h() throws IOException {
        if (this.f82637f != null) {
            H();
        }
        z();
        this.f82632a.write(BuildConfig.TRAVIS);
        return this;
    }

    public final H j(String str) throws IOException {
        if (str == null) {
            h();
            return this;
        }
        H();
        z();
        D(str);
        return this;
    }

    public H(Writer writer) {
        A(6);
        this.f82635d = ":";
        this.f82632a = writer;
    }

    private final H u(int i10, int i11, char c10) throws IOException {
        int iP = p();
        if (iP != i11 && iP != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f82637f;
        if (str == null) {
            this.f82634c--;
            this.f82632a.write(c10);
            return this;
        }
        throw new IllegalStateException("Dangling name: ".concat(str));
    }

    private final H w(int i10, char c10) throws IOException {
        z();
        A(i10);
        this.f82632a.write(c10);
        return this;
    }

    private final void z() throws IOException {
        int iP = p();
        if (iP != 1) {
            if (iP != 2) {
                if (iP != 4) {
                    if (iP != 6) {
                        if (iP == 7) {
                            if (!this.f82636e) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    B(7);
                    return;
                }
                this.f82632a.append((CharSequence) this.f82635d);
                B(5);
                return;
            }
            this.f82632a.append(',');
            return;
        }
        B(2);
    }

    public final H a() throws IOException {
        H();
        w(1, '[');
        return this;
    }

    public final H b() throws IOException {
        H();
        w(3, '{');
        return this;
    }

    public final H i(Number number) throws IOException {
        H();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f82629g.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f82636e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        z();
        this.f82632a.append((CharSequence) string);
        return this;
    }

    public final H l(boolean z10) throws IOException {
        String str;
        H();
        z();
        Writer writer = this.f82632a;
        if (true != z10) {
            str = "false";
        } else {
            str = "true";
        }
        writer.write(str);
        return this;
    }
}
