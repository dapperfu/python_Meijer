package U6;

import com.bugsnag.android.repackaged.dslplatform.json.ParsingException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Formatter;

/* loaded from: classes4.dex */
public final class i<TContext> {

    /* renamed from: A, reason: collision with root package name */
    private static final Charset f37226A = Charset.forName("UTF-8");

    /* renamed from: B, reason: collision with root package name */
    private static final EOFException f37227B;

    /* renamed from: z, reason: collision with root package name */
    private static final boolean[] f37228z;

    /* renamed from: a, reason: collision with root package name */
    private int f37229a;

    /* renamed from: b, reason: collision with root package name */
    private int f37230b;

    /* renamed from: c, reason: collision with root package name */
    private long f37231c;

    /* renamed from: d, reason: collision with root package name */
    private byte f37232d;

    /* renamed from: e, reason: collision with root package name */
    private int f37233e;

    /* renamed from: f, reason: collision with root package name */
    private final char[] f37234f;

    /* renamed from: g, reason: collision with root package name */
    public final TContext f37235g;

    /* renamed from: h, reason: collision with root package name */
    protected byte[] f37236h;

    /* renamed from: i, reason: collision with root package name */
    protected char[] f37237i;

    /* renamed from: j, reason: collision with root package name */
    private InputStream f37238j;

    /* renamed from: k, reason: collision with root package name */
    private int f37239k;

    /* renamed from: l, reason: collision with root package name */
    private int f37240l;

    /* renamed from: m, reason: collision with root package name */
    private final n f37241m;

    /* renamed from: n, reason: collision with root package name */
    private final n f37242n;

    /* renamed from: o, reason: collision with root package name */
    private final p f37243o;

    /* renamed from: p, reason: collision with root package name */
    private final byte[] f37244p;

    /* renamed from: q, reason: collision with root package name */
    private final int f37245q;

    /* renamed from: r, reason: collision with root package name */
    protected final d f37246r;

    /* renamed from: s, reason: collision with root package name */
    protected final b f37247s;

    /* renamed from: t, reason: collision with root package name */
    protected final int f37248t;

    /* renamed from: u, reason: collision with root package name */
    protected final g f37249u;

    /* renamed from: v, reason: collision with root package name */
    protected final int f37250v;

    /* renamed from: w, reason: collision with root package name */
    private final int f37251w;

    /* renamed from: x, reason: collision with root package name */
    private final StringBuilder f37252x;

    /* renamed from: y, reason: collision with root package name */
    private final Formatter f37253y;

    private static class c extends EOFException {
        private c() {
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public enum d {
        WITH_STACK_TRACE,
        DESCRIPTION_AND_POSITION,
        DESCRIPTION_ONLY,
        MINIMAL
    }

    public interface e<T extends h> {
        T a(i iVar) throws IOException;
    }

    public interface f<T> {
        T a(i iVar) throws IOException;
    }

    public enum g {
        LONG_AND_BIGDECIMAL,
        LONG_AND_DOUBLE,
        BIGDECIMAL,
        DOUBLE
    }

    private i(char[] cArr, byte[] bArr, int i10, TContext tcontext, n nVar, n nVar2, p pVar, d dVar, b bVar, g gVar, int i11, int i12) {
        this.f37230b = 0;
        this.f37231c = 0L;
        this.f37232d = (byte) 32;
        StringBuilder sb2 = new StringBuilder(0);
        this.f37252x = sb2;
        this.f37253y = new Formatter(sb2);
        this.f37234f = cArr;
        this.f37236h = bArr;
        this.f37233e = i10;
        int length = bArr.length - 38;
        this.f37240l = length;
        this.f37235g = tcontext;
        this.f37237i = cArr;
        this.f37241m = nVar;
        this.f37242n = nVar2;
        this.f37243o = pVar;
        this.f37246r = dVar;
        this.f37247s = bVar;
        this.f37249u = gVar;
        this.f37250v = i11;
        this.f37251w = i12;
        this.f37248t = bVar.f37259a + 15;
        this.f37244p = bArr;
        this.f37245q = length;
    }

    private static int E(byte[] bArr, InputStream inputStream, int i10) throws IOException {
        int i11;
        while (i10 < bArr.length && (i11 = inputStream.read(bArr, i10, bArr.length - i10)) != -1) {
            i10 += i11;
        }
        return i10;
    }

    public final ParsingException p(String str) {
        return q(str, 0);
    }

    public enum b {
        EXACT(0),
        HIGH(1),
        DEFAULT(3),
        LOW(4);


        /* renamed from: a, reason: collision with root package name */
        final int f37259a;

        b(int i10) {
            this.f37259a = i10;
        }
    }

    static {
        boolean[] zArr = new boolean[256];
        f37228z = zArr;
        zArr[137] = true;
        zArr[138] = true;
        zArr[139] = true;
        zArr[140] = true;
        zArr[141] = true;
        zArr[160] = true;
        zArr[32] = true;
        zArr[97] = true;
        zArr[98] = true;
        zArr[99] = true;
        f37227B = new c();
    }

    private int A() throws IOException {
        int i10 = this.f37233e;
        int i11 = this.f37230b;
        int i12 = i10 - i11;
        byte[] bArr = this.f37236h;
        System.arraycopy(bArr, i11, bArr, 0, i12);
        int iE = E(this.f37236h, this.f37238j, i12);
        long j10 = this.f37231c;
        int i13 = this.f37230b;
        this.f37231c = j10 + i13;
        if (iE == i12) {
            int i14 = this.f37233e - i13;
            this.f37239k = i14;
            this.f37233e = i14;
            this.f37230b = 0;
            return iE;
        }
        int i15 = this.f37240l;
        if (iE < i15) {
            i15 = iE;
        }
        this.f37239k = i15;
        this.f37233e = iE;
        this.f37230b = 0;
        return iE;
    }

    private boolean O() {
        byte b10 = this.f37232d;
        if (b10 != -96 && b10 != 32) {
            switch (b10) {
                case -31:
                    int i10 = this.f37230b;
                    if (i10 + 1 < this.f37233e) {
                        byte[] bArr = this.f37236h;
                        if (bArr[i10] == -102 && bArr[i10 + 1] == Byte.MIN_VALUE) {
                            this.f37230b = i10 + 2;
                            this.f37232d = (byte) 32;
                            return true;
                        }
                    }
                    return false;
                case -30:
                    int i11 = this.f37230b;
                    if (i11 + 1 >= this.f37233e) {
                        return false;
                    }
                    byte[] bArr2 = this.f37236h;
                    byte b11 = bArr2[i11];
                    byte b12 = bArr2[i11 + 1];
                    if (b11 == -127 && b12 == -97) {
                        this.f37230b = i11 + 2;
                        this.f37232d = (byte) 32;
                        return true;
                    }
                    if (b11 != Byte.MIN_VALUE) {
                        return false;
                    }
                    if (b12 != -88 && b12 != -87 && b12 != -81) {
                        switch (b12) {
                            case Byte.MIN_VALUE:
                            case -127:
                            case -126:
                            case -125:
                            case -124:
                            case -123:
                            case -122:
                            case -121:
                            case -120:
                            case -119:
                            case -118:
                                break;
                            default:
                                return false;
                        }
                    }
                    this.f37230b = i11 + 2;
                    this.f37232d = (byte) 32;
                    return true;
                case -29:
                    int i12 = this.f37230b;
                    if (i12 + 1 < this.f37233e) {
                        byte[] bArr3 = this.f37236h;
                        if (bArr3[i12] == Byte.MIN_VALUE && bArr3[i12 + 1] == Byte.MIN_VALUE) {
                            this.f37230b = i12 + 2;
                            this.f37232d = (byte) 32;
                            return true;
                        }
                    }
                    return false;
                default:
                    switch (b10) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    private int l(byte b10) throws ParsingException {
        if (b10 >= 48 && b10 <= 57) {
            return b10 - 48;
        }
        if (b10 >= 65 && b10 <= 70) {
            return b10 - 55;
        }
        if (b10 < 97 || b10 > 102) {
            throw v("Could not parse unicode escape, expected a hexadecimal digit", Byte.valueOf(b10));
        }
        return b10 - 87;
    }

    private void x(int i10, StringBuilder sb2) {
        sb2.append("at position: ");
        sb2.append(y(i10));
        int i11 = this.f37230b;
        if (i11 > i10) {
            try {
                int iMin = Math.min(i11 - i10, 20);
                String str = new String(this.f37236h, (this.f37230b - i10) - iMin, iMin, f37226A);
                sb2.append(", following: `");
                sb2.append(str);
                sb2.append('`');
            } catch (Exception unused) {
            }
        }
        int i12 = this.f37230b;
        int i13 = i12 - i10;
        int i14 = this.f37239k;
        if (i13 < i14) {
            try {
                String str2 = new String(this.f37236h, this.f37230b - i10, Math.min((i14 - i12) + i10, 20), f37226A);
                sb2.append(", before: `");
                sb2.append(str2);
                sb2.append('`');
            } catch (Exception unused2) {
            }
        }
    }

    public final i<TContext> B(InputStream inputStream) throws IOException {
        this.f37231c = 0L;
        this.f37230b = 0;
        this.f37238j = inputStream;
        if (inputStream != null) {
            int i10 = this.f37233e;
            int i11 = this.f37240l;
            if (i10 >= i11) {
                i10 = i11;
            }
            this.f37239k = i10;
            int iE = E(this.f37236h, inputStream, 0);
            int i12 = this.f37240l;
            if (iE < i12) {
                i12 = iE;
            }
            this.f37239k = i12;
            this.f37233e = iE;
        }
        return this;
    }

    public final byte C() throws IOException {
        if (this.f37238j != null && this.f37230b > this.f37239k) {
            A();
        }
        int i10 = this.f37230b;
        if (i10 >= this.f37233e) {
            throw ParsingException.a("Unexpected end of JSON input", f37227B, P());
        }
        byte[] bArr = this.f37236h;
        this.f37230b = i10 + 1;
        byte b10 = bArr[i10];
        this.f37232d = b10;
        return b10;
    }

    public final byte[] D() throws IOException {
        if (this.f37238j != null && U6.a.c(this.f37236h, this.f37230b) == this.f37236h.length) {
            int iW = w();
            byte[] bArr = new byte[iW];
            for (int i10 = 0; i10 < iW; i10++) {
                bArr[i10] = (byte) this.f37237i[i10];
            }
            return U6.a.a(bArr, 0, iW);
        }
        if (this.f37232d != 34) {
            throw p("Expecting '\"' for base64 start");
        }
        int i11 = this.f37230b;
        int iC = U6.a.c(this.f37236h, i11);
        byte[] bArr2 = this.f37236h;
        this.f37230b = iC + 1;
        byte b10 = bArr2[iC];
        this.f37232d = b10;
        if (b10 == 34) {
            return U6.a.a(bArr2, i11, iC);
        }
        throw p("Expecting '\"' for base64 end");
    }

    public final char[] G() throws ParsingException {
        char[] cArr;
        if (this.f37232d != 34) {
            throw p("Expecting '\"' for string start");
        }
        int i10 = this.f37230b;
        this.f37229a = i10;
        int i11 = 0;
        while (true) {
            try {
                cArr = this.f37234f;
                if (i11 >= cArr.length) {
                    break;
                }
                int i12 = i10 + 1;
                byte b10 = this.f37236h[i10];
                if (b10 == 34) {
                    i10 = i12;
                    break;
                }
                cArr[i11] = (char) b10;
                i11++;
                i10 = i12;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw r("JSON string was not closed with a double quote", 0);
            }
        }
        if (i10 > this.f37233e) {
            throw r("JSON string was not closed with a double quote", 0);
        }
        this.f37230b = i10;
        return cArr;
    }

    public final String H() throws ParsingException {
        char[] cArr;
        if (this.f37232d != 34) {
            throw p("Expecting '\"' for string start");
        }
        int i10 = this.f37230b;
        int i11 = 0;
        while (true) {
            try {
                cArr = this.f37234f;
                if (i11 >= cArr.length) {
                    break;
                }
                int i12 = i10 + 1;
                byte b10 = this.f37236h[i10];
                if (b10 == 34) {
                    i10 = i12;
                    break;
                }
                int i13 = i11 + 1;
                cArr[i11] = (char) b10;
                i11 = i13;
                i10 = i12;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw r("JSON string was not closed with a double quote", 0);
            }
        }
        if (i10 > this.f37233e) {
            throw r("JSON string was not closed with a double quote", 0);
        }
        this.f37230b = i10;
        return new String(cArr, 0, i11);
    }

    final void J() {
        this.f37236h = this.f37244p;
        this.f37240l = this.f37245q;
        this.f37230b = 0;
        this.f37233e = 0;
        this.f37239k = 0;
        this.f37238j = null;
    }

    public final int K() {
        int i10 = this.f37230b;
        this.f37229a = i10 - 1;
        byte b10 = this.f37232d;
        int i11 = 1;
        while (i10 < this.f37233e) {
            int i12 = i10 + 1;
            b10 = this.f37236h[i10];
            if (b10 == 44 || b10 == 125 || b10 == 93) {
                break;
            }
            i11++;
            i10 = i12;
        }
        this.f37230b += i11 - 1;
        this.f37232d = b10;
        return this.f37229a;
    }

    public final boolean L() throws ParsingException {
        if (this.f37232d != 102) {
            return false;
        }
        int i10 = this.f37230b;
        if (i10 + 3 < this.f37233e) {
            byte[] bArr = this.f37236h;
            if (bArr[i10] == 97 && bArr[i10 + 1] == 108 && bArr[i10 + 2] == 115 && bArr[i10 + 3] == 101) {
                this.f37230b = i10 + 4;
                this.f37232d = (byte) 101;
                return true;
            }
        }
        throw r("Invalid false constant found", 0);
    }

    public final boolean M() throws ParsingException {
        if (this.f37232d != 110) {
            return false;
        }
        int i10 = this.f37230b;
        if (i10 + 2 < this.f37233e) {
            byte[] bArr = this.f37236h;
            if (bArr[i10] == 117 && bArr[i10 + 1] == 108 && bArr[i10 + 2] == 108) {
                this.f37230b = i10 + 3;
                this.f37232d = (byte) 108;
                return true;
            }
        }
        throw r("Invalid null constant found", 0);
    }

    public final boolean N() throws ParsingException {
        if (this.f37232d != 116) {
            return false;
        }
        int i10 = this.f37230b;
        if (i10 + 2 < this.f37233e) {
            byte[] bArr = this.f37236h;
            if (bArr[i10] == 114 && bArr[i10 + 1] == 117 && bArr[i10 + 2] == 101) {
                this.f37230b = i10 + 3;
                this.f37232d = (byte) 101;
                return true;
            }
        }
        throw r("Invalid true constant found", 0);
    }

    boolean P() {
        return this.f37246r == d.WITH_STACK_TRACE;
    }

    final boolean a(int i10, int i11) {
        byte[] bArr = this.f37236h;
        while (i10 < i11) {
            if (!f37228z[bArr[i10] + 128]) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final void d() throws IOException {
        if (this.f37232d != 93) {
            if (this.f37230b < this.f37233e) {
                throw p("Expecting ']' as array end");
            }
            throw s("Unexpected end of JSON in collection", 0, f37227B);
        }
    }

    public final <T extends h> ArrayList<T> e(e<T> eVar) throws IOException {
        ArrayList<T> arrayList = new ArrayList<>(4);
        f(eVar, arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends h> void f(e<T> eVar, Collection<T> collection) throws IOException {
        if (this.f37232d == 123) {
            j();
            collection.add(eVar.a(this));
        } else {
            if (!M()) {
                throw p("Expecting '{' as collection start");
            }
            collection.add(null);
        }
        while (j() == 44) {
            if (j() == 123) {
                j();
                collection.add(eVar.a(this));
            } else {
                if (!M()) {
                    throw p("Expecting '{' as object start within a collection");
                }
                collection.add(null);
            }
        }
        d();
    }

    public final <T, S extends T> ArrayList<T> h(f<S> fVar) throws IOException {
        ArrayList<T> arrayList = new ArrayList<>(4);
        g(fVar, arrayList);
        return arrayList;
    }

    public final int i() {
        return this.f37230b;
    }

    public final int k() {
        return this.f37229a;
    }

    final boolean m() throws IOException {
        return this.f37238j == null ? this.f37233e == this.f37230b : this.f37233e == this.f37230b && A() == 0;
    }

    public final byte n() {
        return this.f37232d;
    }

    public final int o() {
        return this.f37233e;
    }

    public final ParsingException q(String str, int i10) {
        if (this.f37246r == d.MINIMAL) {
            return ParsingException.b(str, false);
        }
        this.f37252x.setLength(0);
        this.f37252x.append(str);
        this.f37252x.append(". Found ");
        this.f37252x.append((char) this.f37232d);
        if (this.f37246r == d.DESCRIPTION_ONLY) {
            return ParsingException.b(this.f37252x.toString(), false);
        }
        this.f37252x.append(" ");
        x(i10, this.f37252x);
        return ParsingException.b(this.f37252x.toString(), P());
    }

    public final ParsingException r(String str, int i10) {
        d dVar = this.f37246r;
        if (dVar == d.MINIMAL || dVar == d.DESCRIPTION_ONLY) {
            return ParsingException.b(str, false);
        }
        this.f37252x.setLength(0);
        this.f37252x.append(str);
        this.f37252x.append(" ");
        x(i10, this.f37252x);
        return ParsingException.b(this.f37252x.toString(), P());
    }

    public final ParsingException s(String str, int i10, Exception exc) {
        if (exc == null) {
            throw new IllegalArgumentException("cause can't be null");
        }
        if (this.f37246r == d.MINIMAL) {
            return ParsingException.a(str, exc, false);
        }
        this.f37252x.setLength(0);
        String message = exc.getMessage();
        if (message != null && message.length() > 0) {
            this.f37252x.append(message);
            if (!message.endsWith(".")) {
                this.f37252x.append(".");
            }
            this.f37252x.append(" ");
        }
        this.f37252x.append(str);
        if (this.f37246r == d.DESCRIPTION_ONLY) {
            return ParsingException.a(this.f37252x.toString(), exc, false);
        }
        this.f37252x.append(" ");
        x(i10, this.f37252x);
        return ParsingException.b(this.f37252x.toString(), P());
    }

    public final ParsingException t(String str, int i10, String str2, Object... objArr) {
        if (this.f37246r == d.MINIMAL) {
            return ParsingException.b(str, false);
        }
        this.f37252x.setLength(0);
        this.f37253y.format(str2, objArr);
        if (this.f37246r == d.DESCRIPTION_ONLY) {
            return ParsingException.b(this.f37252x.toString(), false);
        }
        this.f37252x.append(" ");
        x(i10, this.f37252x);
        return ParsingException.b(this.f37252x.toString(), P());
    }

    public String toString() {
        return new String(this.f37236h, 0, this.f37233e, f37226A);
    }

    public final ParsingException u(String str, int i10, String str2, String str3, Object obj, String str4) {
        if (this.f37246r == d.MINIMAL) {
            return ParsingException.b(str, false);
        }
        this.f37252x.setLength(0);
        this.f37252x.append(str2);
        this.f37252x.append(str3);
        if (obj != null) {
            this.f37252x.append(": '");
            this.f37252x.append(obj.toString());
            this.f37252x.append("'");
        }
        this.f37252x.append(str4);
        if (this.f37246r == d.DESCRIPTION_ONLY) {
            return ParsingException.b(this.f37252x.toString(), false);
        }
        this.f37252x.append(" ");
        x(i10, this.f37252x);
        return ParsingException.b(this.f37252x.toString(), P());
    }

    public final ParsingException v(String str, Object obj) {
        return u(str, 0, "", str, obj, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d0, code lost:
    
        throw v("Maximum string buffer limit exceeded", java.lang.Integer.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d1, code lost:
    
        r5[r7] = (char) r1;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01df, code lost:
    
        throw r("JSON string was not closed with a double quote", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        if (r6 != r5.length) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        r2 = r17.f37237i;
        r5 = r2.length * 2;
        r6 = r17.f37251w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r5 > r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        r5 = java.util.Arrays.copyOf(r2, r5);
        r17.f37237i = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        throw v("Maximum string buffer limit exceeded", java.lang.Integer.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        r2 = r5.length;
        r7 = r7 - 1;
        r17.f37230b = r7;
        r7 = r7 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (m() != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        r1 = C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r1 != 34) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        if (r1 != 92) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        if (r7 < (r2 - 6)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        r1 = r17.f37237i;
        r2 = r1.length * 2;
        r5 = r17.f37251w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if (r2 > r5) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        r5 = java.util.Arrays.copyOf(r1, r2);
        r17.f37237i = r5;
        r2 = r5.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
    
        throw v("Maximum string buffer limit exceeded", java.lang.Integer.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        r1 = r17.f37236h;
        r10 = r17.f37230b;
        r11 = r10 + 1;
        r17.f37230b = r11;
        r12 = r1[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        if (r12 == 34) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
    
        if (r12 == 47) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        if (r12 == 92) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        if (r12 == 98) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
    
        if (r12 == 102) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        if (r12 == 110) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00aa, code lost:
    
        if (r12 == 114) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
    
        if (r12 == 116) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b2, code lost:
    
        if (r12 != 117) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b4, code lost:
    
        r17.f37230b = r10 + 2;
        r1 = l(r1[r11]) << 12;
        r6 = r17.f37236h;
        r8 = r17.f37230b;
        r17.f37230b = r8 + 1;
        r1 = r1 + (l(r6[r8]) << 8);
        r6 = r17.f37236h;
        r8 = r17.f37230b;
        r17.f37230b = r8 + 1;
        r1 = r1 + (l(r6[r8]) << 4);
        r6 = r17.f37236h;
        r8 = r17.f37230b;
        r17.f37230b = r8 + 1;
        r6 = l(r6[r8]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ee, code lost:
    
        r1 = r1 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fb, code lost:
    
        throw v("Invalid escape combination detected", java.lang.Integer.valueOf(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fc, code lost:
    
        r1 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0100, code lost:
    
        r1 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0104, code lost:
    
        r1 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0108, code lost:
    
        r1 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010b, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010e, code lost:
    
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0113, code lost:
    
        if ((r1 & 128) == 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0117, code lost:
    
        if (r7 < (r2 - 4)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0119, code lost:
    
        r2 = r17.f37237i;
        r5 = r2.length * 2;
        r6 = r17.f37251w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0120, code lost:
    
        if (r5 > r6) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0122, code lost:
    
        r2 = java.util.Arrays.copyOf(r2, r5);
        r17.f37237i = r2;
        r5 = r2;
        r2 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0137, code lost:
    
        throw v("Maximum string buffer limit exceeded", java.lang.Integer.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0138, code lost:
    
        r6 = r17.f37236h;
        r10 = r17.f37230b;
        r11 = r10 + 1;
        r17.f37230b = r11;
        r12 = r6[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0146, code lost:
    
        if ((r1 & 224) != 192) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0148, code lost:
    
        r1 = (r1 & 31) << 6;
        r6 = r12 & 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014f, code lost:
    
        r13 = r10 + 2;
        r17.f37230b = r13;
        r11 = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0159, code lost:
    
        if ((r1 & 240) != 224) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015b, code lost:
    
        r1 = ((r1 & 15) << 12) + ((r12 & 63) << 6);
        r6 = r11 & 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0166, code lost:
    
        r17.f37230b = r10 + 3;
        r6 = r6[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0172, code lost:
    
        if ((r1 & 248) != 240) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0174, code lost:
    
        r1 = ((((r1 & 7) << 18) + ((r12 & 63) << 12)) + ((r11 & 63) << 6)) + (r6 & 63);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0187, code lost:
    
        if (r1 < 65536) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018b, code lost:
    
        if (r1 >= 1114112) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018d, code lost:
    
        r1 = r1 - 65536;
        r6 = r7 + 1;
        r5[r7] = (char) ((r1 >>> 10) + 55296);
        r7 = r7 + 2;
        r5[r6] = (char) ((r1 & 1023) + 56320);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01aa, code lost:
    
        throw r("Invalid unicode character detected", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01af, code lost:
    
        throw r("Invalid unicode character detected", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b0, code lost:
    
        if (r7 < r2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b2, code lost:
    
        r2 = r17.f37237i;
        r5 = r2.length * 2;
        r6 = r17.f37251w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
    
        if (r5 > r6) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bb, code lost:
    
        r2 = java.util.Arrays.copyOf(r2, r5);
        r17.f37237i = r2;
        r5 = r2;
        r2 = r2.length;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int w() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U6.i.w():int");
    }

    public final long y(int i10) {
        return (this.f37231c + this.f37230b) - i10;
    }

    final char[] z(int i10, int i11) throws ParsingException {
        char[] cArr;
        if (i11 > this.f37250v) {
            throw u("Too many digits detected in number", i11, "", "Too many digits detected in number", Integer.valueOf(i11), "");
        }
        while (true) {
            cArr = this.f37237i;
            if (cArr.length >= i11) {
                break;
            }
            this.f37237i = Arrays.copyOf(cArr, cArr.length * 2);
        }
        byte[] bArr = this.f37236h;
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i12] = (char) bArr[i10 + i12];
        }
        return cArr;
    }

    public final String F() throws IOException {
        String str;
        int iW = w();
        n nVar = this.f37241m;
        if (nVar != null) {
            str = nVar.a(this.f37237i, iW);
        } else {
            str = new String(this.f37237i, 0, iW);
        }
        if (j() == 58) {
            j();
            return str;
        }
        throw p("Expecting ':' after attribute name");
    }

    public final String I() throws IOException {
        int iW = w();
        n nVar = this.f37242n;
        if (nVar == null) {
            return new String(this.f37237i, 0, iW);
        }
        return nVar.a(this.f37237i, iW);
    }

    public final StringBuffer b(StringBuffer stringBuffer) throws IOException {
        stringBuffer.append(this.f37237i, 0, w());
        return stringBuffer;
    }

    public final StringBuilder c(StringBuilder sb2) throws IOException {
        sb2.append(this.f37237i, 0, w());
        return sb2;
    }

    public final <T, S extends T> void g(f<S> fVar, Collection<T> collection) throws IOException {
        if (M()) {
            collection.add(null);
        } else {
            collection.add(fVar.a(this));
        }
        while (j() == 44) {
            j();
            if (M()) {
                collection.add(null);
            } else {
                collection.add(fVar.a(this));
            }
        }
        d();
    }

    public final byte j() throws IOException {
        C();
        if (f37228z[this.f37232d + 128]) {
            while (O()) {
                C();
            }
        }
        return this.f37232d;
    }

    i(byte[] bArr, int i10, TContext tcontext, char[] cArr, n nVar, n nVar2, p pVar, d dVar, b bVar, g gVar, int i11, int i12) {
        this(cArr, bArr, i10, tcontext, nVar, nVar2, pVar, dVar, bVar, gVar, i11, i12);
        if (cArr != null) {
            if (i10 <= bArr.length) {
                if (i10 < bArr.length) {
                    bArr[i10] = 0;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("length can't be longer than buffer.length");
        }
        throw new IllegalArgumentException("tmp buffer provided as null.");
    }
}
