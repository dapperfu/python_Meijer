package t6;

import com.google.maps.android.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15330g;
import t6.AbstractC17067c;

/* loaded from: classes4.dex */
final class e extends AbstractC17067c {

    /* renamed from: n, reason: collision with root package name */
    private static final C15331h f161503n = C15331h.p("'\\");

    /* renamed from: o, reason: collision with root package name */
    private static final C15331h f161504o = C15331h.p("\"\\");

    /* renamed from: p, reason: collision with root package name */
    private static final C15331h f161505p = C15331h.p("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: q, reason: collision with root package name */
    private static final C15331h f161506q = C15331h.p("\n\r");

    /* renamed from: r, reason: collision with root package name */
    private static final C15331h f161507r = C15331h.p("*/");

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC15330g f161508h;

    /* renamed from: i, reason: collision with root package name */
    private final C15328e f161509i;

    /* renamed from: j, reason: collision with root package name */
    private int f161510j = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f161511k;

    /* renamed from: l, reason: collision with root package name */
    private int f161512l;

    /* renamed from: m, reason: collision with root package name */
    private String f161513m;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.f161509i.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r2 != 47) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r6.f161508h.t(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        w();
        r3 = r6.f161509i.l(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r3 == 42) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r6.f161509i.readByte();
        r6.f161509i.readByte();
        c0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r6.f161509i.readByte();
        r6.f161509i.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (Z() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        throw u("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        w();
        c0();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int D(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kw.g r2 = r6.f161508h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.t(r4)
            if (r2 == 0) goto L80
            kw.e r2 = r6.f161509i
            long r4 = (long) r1
            byte r2 = r2.l(r4)
            r4 = 10
            if (r2 == r4) goto L7e
            r4 = 32
            if (r2 == r4) goto L7e
            r4 = 13
            if (r2 == r4) goto L7e
            r4 = 9
            if (r2 != r4) goto L25
            goto L7e
        L25:
            kw.e r3 = r6.f161509i
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            kw.g r3 = r6.f161508h
            r4 = 2
            boolean r3 = r3.t(r4)
            if (r3 != 0) goto L3a
            goto L7d
        L3a:
            r6.w()
            kw.e r3 = r6.f161509i
            r4 = 1
            byte r3 = r3.l(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            goto L7d
        L4c:
            kw.e r1 = r6.f161509i
            r1.readByte()
            kw.e r1 = r6.f161509i
            r1.readByte()
            r6.c0()
            goto L1
        L5a:
            kw.e r1 = r6.f161509i
            r1.readByte()
            kw.e r1 = r6.f161509i
            r1.readByte()
            boolean r1 = r6.Z()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            t6.b r7 = r6.u(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.w()
            r6.c0()
            goto L1
        L7d:
            return r2
        L7e:
            r1 = r3
            goto L2
        L80:
            if (r7 != 0) goto L84
            r7 = -1
            return r7
        L84:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.e.D(boolean):int");
    }

    private String H(C15331h c15331h) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long jE3 = this.f161508h.e3(c15331h);
            if (jE3 == -1) {
                throw u("Unterminated string");
            }
            if (this.f161509i.l(jE3) != 92) {
                if (sb2 == null) {
                    String strK1 = this.f161509i.K1(jE3);
                    this.f161509i.readByte();
                    return strK1;
                }
                sb2.append(this.f161509i.K1(jE3));
                this.f161509i.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f161509i.K1(jE3));
            this.f161509i.readByte();
            sb2.append(R());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f161510j = 0;
        this.f161485b[0] = 8;
        this.f161484a = 1;
        this.f161509i.a();
        this.f161508h.close();
    }

    private int A(String str, AbstractC17067c.a aVar) {
        int length = aVar.f161490a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f161490a[i10])) {
                this.f161510j = 0;
                this.f161486c[this.f161484a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private boolean B(int i10) throws IOException {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        w();
        return false;
    }

    private String J() throws IOException {
        long jE3 = this.f161508h.e3(f161505p);
        return jE3 != -1 ? this.f161509i.K1(jE3) : this.f161509i.n3();
    }

    private int K() throws IOException {
        String str;
        String str2;
        int i10;
        byte bL = this.f161509i.l(0L);
        if (bL == 116 || bL == 84) {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (bL == 102 || bL == 70) {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (bL != 110 && bL != 78) {
                return 0;
            }
            str = BuildConfig.TRAVIS;
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f161508h.t(i12)) {
                return 0;
            }
            byte bL2 = this.f161509i.l(i11);
            if (bL2 != str.charAt(i11) && bL2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f161508h.t(length + 1) && B(this.f161509i.l(length))) {
            return 0;
        }
        this.f161509i.skip(length);
        this.f161510j = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        if (B(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (r6 != 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r7 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
    
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
    
        if (r8 != r16) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
    
        if (r10 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
    
        if (r10 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
    
        r19.f161511k = r8;
        r19.f161509i.skip(r5);
        r19.f161510j = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ad, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        if (r6 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b0, code lost:
    
        if (r6 == 4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
    
        if (r6 != 7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b6, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b7, code lost:
    
        r19.f161512l = r5;
        r19.f161510j = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00be, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int O() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.e.O():int");
    }

    private char R() throws IOException {
        int i10;
        if (!this.f161508h.t(1L)) {
            throw u("Unterminated escape sequence");
        }
        byte b10 = this.f161509i.readByte();
        if (b10 == 10 || b10 == 34 || b10 == 39 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            if (this.f161488e) {
                return (char) b10;
            }
            throw u("Invalid escape sequence: \\" + ((char) b10));
        }
        if (!this.f161508h.t(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bL = this.f161509i.l(i11);
            char c11 = (char) (c10 << 4);
            if (bL >= 48 && bL <= 57) {
                i10 = bL - 48;
            } else if (bL >= 97 && bL <= 102) {
                i10 = bL - 87;
            } else {
                if (bL < 65 || bL > 70) {
                    throw u("\\u" + this.f161509i.K1(4L));
                }
                i10 = bL - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f161509i.skip(4L);
        return c10;
    }

    private void T(C15331h c15331h) throws IOException {
        while (true) {
            long jE3 = this.f161508h.e3(c15331h);
            if (jE3 == -1) {
                throw u("Unterminated string");
            }
            if (this.f161509i.l(jE3) != 92) {
                this.f161509i.skip(jE3 + 1);
                return;
            } else {
                this.f161509i.skip(jE3 + 1);
                R();
            }
        }
    }

    private boolean Z() throws IOException {
        long jX0 = this.f161508h.x0(f161507r);
        boolean z10 = jX0 != -1;
        C15328e c15328e = this.f161509i;
        c15328e.skip(z10 ? jX0 + r1.V() : c15328e.getSize());
        return z10;
    }

    private void c0() throws IOException {
        long jE3 = this.f161508h.e3(f161506q);
        C15328e c15328e = this.f161509i;
        c15328e.skip(jE3 != -1 ? jE3 + 1 : c15328e.getSize());
    }

    private void e0() throws IOException {
        long jE3 = this.f161508h.e3(f161505p);
        C15328e c15328e = this.f161509i;
        if (jE3 == -1) {
            jE3 = c15328e.getSize();
        }
        c15328e.skip(jE3);
    }

    private void w() throws IOException {
        if (!this.f161488e) {
            throw u("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int z() throws IOException {
        int[] iArr = this.f161485b;
        int i10 = this.f161484a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iD = D(true);
            this.f161509i.readByte();
            if (iD != 44) {
                if (iD != 59) {
                    if (iD != 93) {
                        throw u("Unterminated array");
                    }
                    this.f161510j = 4;
                    return 4;
                }
                w();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iD2 = D(true);
                    this.f161509i.readByte();
                    if (iD2 != 44) {
                        if (iD2 != 59) {
                            if (iD2 != 125) {
                                throw u("Unterminated object");
                            }
                            this.f161510j = 2;
                            return 2;
                        }
                        w();
                    }
                }
                int iD3 = D(true);
                if (iD3 == 34) {
                    this.f161509i.readByte();
                    this.f161510j = 13;
                    return 13;
                }
                if (iD3 == 39) {
                    this.f161509i.readByte();
                    w();
                    this.f161510j = 12;
                    return 12;
                }
                if (iD3 != 125) {
                    w();
                    if (!B((char) iD3)) {
                        throw u("Expected name");
                    }
                    this.f161510j = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw u("Expected name");
                }
                this.f161509i.readByte();
                this.f161510j = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iD4 = D(true);
                this.f161509i.readByte();
                if (iD4 != 58) {
                    if (iD4 != 61) {
                        throw u("Expected ':'");
                    }
                    w();
                    if (this.f161508h.t(1L) && this.f161509i.l(0L) == 62) {
                        this.f161509i.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (D(false) == -1) {
                    this.f161510j = 18;
                    return 18;
                }
                w();
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iD5 = D(true);
        if (iD5 == 34) {
            this.f161509i.readByte();
            this.f161510j = 9;
            return 9;
        }
        if (iD5 == 39) {
            w();
            this.f161509i.readByte();
            this.f161510j = 8;
            return 8;
        }
        if (iD5 != 44 && iD5 != 59) {
            if (iD5 == 91) {
                this.f161509i.readByte();
                this.f161510j = 3;
                return 3;
            }
            if (iD5 != 93) {
                if (iD5 == 123) {
                    this.f161509i.readByte();
                    this.f161510j = 1;
                    return 1;
                }
                int iK = K();
                if (iK != 0) {
                    return iK;
                }
                int iO = O();
                if (iO != 0) {
                    return iO;
                }
                if (!B(this.f161509i.l(0L))) {
                    throw u("Expected value");
                }
                w();
                this.f161510j = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f161509i.readByte();
                this.f161510j = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw u("Unexpected value");
        }
        w();
        this.f161510j = 7;
        return 7;
    }

    @Override // t6.AbstractC17067c
    public void b() throws IOException {
        int iZ = this.f161510j;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 3) {
            j(1);
            this.f161487d[this.f161484a - 1] = 0;
            this.f161510j = 0;
        } else {
            throw new C17065a("Expected BEGIN_ARRAY but was " + i() + " at path " + getPath());
        }
    }

    @Override // t6.AbstractC17067c
    public void c() throws IOException {
        int iZ = this.f161510j;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 1) {
            j(3);
            this.f161510j = 0;
            return;
        }
        throw new C17065a("Expected BEGIN_OBJECT but was " + i() + " at path " + getPath());
    }

    @Override // t6.AbstractC17067c
    public void d() throws IOException {
        int iZ = this.f161510j;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ != 4) {
            throw new C17065a("Expected END_ARRAY but was " + i() + " at path " + getPath());
        }
        int i10 = this.f161484a;
        this.f161484a = i10 - 1;
        int[] iArr = this.f161487d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f161510j = 0;
    }

    @Override // t6.AbstractC17067c
    public void g() throws IOException {
        int iZ = this.f161510j;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ != 2) {
            throw new C17065a("Expected END_OBJECT but was " + i() + " at path " + getPath());
        }
        int i10 = this.f161484a;
        int i11 = i10 - 1;
        this.f161484a = i11;
        this.f161486c[i11] = null;
        int[] iArr = this.f161487d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f161510j = 0;
    }

    @Override // t6.AbstractC17067c
    public boolean hasNext() throws IOException {
        int iZ = this.f161510j;
        if (iZ == 0) {
            iZ = z();
        }
        return (iZ == 2 || iZ == 4 || iZ == 18) ? false : true;
    }

    @Override // t6.AbstractC17067c
    public AbstractC17067c.b i() throws IOException {
        int iZ = this.f161510j;
        if (iZ == 0) {
            iZ = z();
        }
        switch (iZ) {
            case 1:
                return AbstractC17067c.b.BEGIN_OBJECT;
            case 2:
                return AbstractC17067c.b.END_OBJECT;
            case 3:
                return AbstractC17067c.b.BEGIN_ARRAY;
            case 4:
                return AbstractC17067c.b.END_ARRAY;
            case 5:
            case 6:
                return AbstractC17067c.b.BOOLEAN;
            case 7:
                return AbstractC17067c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC17067c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC17067c.b.NAME;
            case 16:
            case 17:
                return AbstractC17067c.b.NUMBER;
            case 18:
                return AbstractC17067c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // t6.AbstractC17067c
    public int l(AbstractC17067c.a aVar) throws IOException {
        int iZ = this.f161510j;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ < 12 || iZ > 15) {
            return -1;
        }
        if (iZ == 15) {
            return A(this.f161513m, aVar);
        }
        int iU2 = this.f161508h.U2(aVar.f161491b);
        if (iU2 != -1) {
            this.f161510j = 0;
            this.f161486c[this.f161484a - 1] = aVar.f161490a[iU2];
            return iU2;
        }
        String str = this.f161486c[this.f161484a - 1];
        String strNextName = nextName();
        int iA = A(strNextName, aVar);
        if (iA == -1) {
            this.f161510j = 15;
            this.f161513m = strNextName;
            this.f161486c[this.f161484a - 1] = str;
        }
        return iA;
    }

    @Override // t6.AbstractC17067c
    public void m() throws IOException {
        if (this.f161489f) {
            throw new C17065a("Cannot skip unexpected " + i() + " at " + getPath());
        }
        int iZ = this.f161510j;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 14) {
            e0();
        } else if (iZ == 13) {
            T(f161504o);
        } else if (iZ == 12) {
            T(f161503n);
        } else if (iZ != 15) {
            throw new C17065a("Expected a name but was " + i() + " at path " + getPath());
        }
        this.f161510j = 0;
        this.f161486c[this.f161484a - 1] = BuildConfig.TRAVIS;
    }

    @Override // t6.AbstractC17067c
    public boolean nextBoolean() throws IOException {
        int iZ = this.f161510j;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 5) {
            this.f161510j = 0;
            int[] iArr = this.f161487d;
            int i10 = this.f161484a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iZ == 6) {
            this.f161510j = 0;
            int[] iArr2 = this.f161487d;
            int i11 = this.f161484a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new C17065a("Expected a boolean but was " + i() + " at path " + getPath());
    }

    @Override // t6.AbstractC17067c
    public double nextDouble() throws IOException, NumberFormatException {
        int iZ = this.f161510j;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 16) {
            this.f161510j = 0;
            int[] iArr = this.f161487d;
            int i10 = this.f161484a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f161511k;
        }
        if (iZ == 17) {
            this.f161513m = this.f161509i.K1(this.f161512l);
        } else if (iZ == 9) {
            this.f161513m = H(f161504o);
        } else if (iZ == 8) {
            this.f161513m = H(f161503n);
        } else if (iZ == 10) {
            this.f161513m = J();
        } else if (iZ != 11) {
            throw new C17065a("Expected a double but was " + i() + " at path " + getPath());
        }
        this.f161510j = 11;
        try {
            double d10 = Double.parseDouble(this.f161513m);
            if (this.f161488e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f161513m = null;
                this.f161510j = 0;
                int[] iArr2 = this.f161487d;
                int i11 = this.f161484a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new C17066b("JSON forbids NaN and infinities: " + d10 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new C17065a("Expected a double but was " + this.f161513m + " at path " + getPath());
        }
    }

    @Override // t6.AbstractC17067c
    public int nextInt() throws IOException, NumberFormatException {
        int iZ = this.f161510j;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 16) {
            long j10 = this.f161511k;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f161510j = 0;
                int[] iArr = this.f161487d;
                int i11 = this.f161484a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new C17065a("Expected an int but was " + this.f161511k + " at path " + getPath());
        }
        if (iZ == 17) {
            this.f161513m = this.f161509i.K1(this.f161512l);
        } else if (iZ == 9 || iZ == 8) {
            String strH = iZ == 9 ? H(f161504o) : H(f161503n);
            this.f161513m = strH;
            try {
                int i12 = Integer.parseInt(strH);
                this.f161510j = 0;
                int[] iArr2 = this.f161487d;
                int i13 = this.f161484a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iZ != 11) {
            throw new C17065a("Expected an int but was " + i() + " at path " + getPath());
        }
        this.f161510j = 11;
        try {
            double d10 = Double.parseDouble(this.f161513m);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f161513m = null;
                this.f161510j = 0;
                int[] iArr3 = this.f161487d;
                int i15 = this.f161484a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new C17065a("Expected an int but was " + this.f161513m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new C17065a("Expected an int but was " + this.f161513m + " at path " + getPath());
        }
    }

    @Override // t6.AbstractC17067c
    public String nextName() throws IOException {
        String strH;
        int iZ = this.f161510j;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 14) {
            strH = J();
        } else if (iZ == 13) {
            strH = H(f161504o);
        } else if (iZ == 12) {
            strH = H(f161503n);
        } else {
            if (iZ != 15) {
                throw new C17065a("Expected a name but was " + i() + " at path " + getPath());
            }
            strH = this.f161513m;
        }
        this.f161510j = 0;
        this.f161486c[this.f161484a - 1] = strH;
        return strH;
    }

    @Override // t6.AbstractC17067c
    public String nextString() throws IOException {
        String strK1;
        int iZ = this.f161510j;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 10) {
            strK1 = J();
        } else if (iZ == 9) {
            strK1 = H(f161504o);
        } else if (iZ == 8) {
            strK1 = H(f161503n);
        } else if (iZ == 11) {
            strK1 = this.f161513m;
            this.f161513m = null;
        } else if (iZ == 16) {
            strK1 = Long.toString(this.f161511k);
        } else {
            if (iZ != 17) {
                throw new C17065a("Expected a string but was " + i() + " at path " + getPath());
            }
            strK1 = this.f161509i.K1(this.f161512l);
        }
        this.f161510j = 0;
        int[] iArr = this.f161487d;
        int i10 = this.f161484a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strK1;
    }

    @Override // t6.AbstractC17067c
    public void skipValue() throws IOException {
        if (this.f161489f) {
            throw new C17065a("Cannot skip unexpected " + i() + " at " + getPath());
        }
        int i10 = 0;
        do {
            int iZ = this.f161510j;
            if (iZ == 0) {
                iZ = z();
            }
            if (iZ == 3) {
                j(1);
            } else if (iZ == 1) {
                j(3);
            } else {
                if (iZ == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new C17065a("Expected a value but was " + i() + " at path " + getPath());
                    }
                    this.f161484a--;
                } else if (iZ == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new C17065a("Expected a value but was " + i() + " at path " + getPath());
                    }
                    this.f161484a--;
                } else if (iZ == 14 || iZ == 10) {
                    e0();
                } else if (iZ == 9 || iZ == 13) {
                    T(f161504o);
                } else if (iZ == 8 || iZ == 12) {
                    T(f161503n);
                } else if (iZ == 17) {
                    this.f161509i.skip(this.f161512l);
                } else if (iZ == 18) {
                    throw new C17065a("Expected a value but was " + i() + " at path " + getPath());
                }
                this.f161510j = 0;
            }
            i10++;
            this.f161510j = 0;
        } while (i10 != 0);
        int[] iArr = this.f161487d;
        int i11 = this.f161484a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f161486c[i11 - 1] = BuildConfig.TRAVIS;
    }

    public String toString() {
        return "JsonReader(" + this.f161508h + ")";
    }

    e(InterfaceC15330g interfaceC15330g) {
        if (interfaceC15330g != null) {
            this.f161508h = interfaceC15330g;
            this.f161509i = interfaceC15330g.getBufferField();
            j(6);
            return;
        }
        throw new NullPointerException("source == null");
    }
}
