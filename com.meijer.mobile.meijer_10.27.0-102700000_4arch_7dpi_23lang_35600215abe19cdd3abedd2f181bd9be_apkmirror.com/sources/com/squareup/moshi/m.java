package com.squareup.moshi;

import com.google.maps.android.BuildConfig;
import com.squareup.moshi.k;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15330g;

/* loaded from: classes11.dex */
final class m extends k {

    /* renamed from: m, reason: collision with root package name */
    private static final C15331h f126367m = C15331h.p("'\\");

    /* renamed from: n, reason: collision with root package name */
    private static final C15331h f126368n = C15331h.p("\"\\");

    /* renamed from: o, reason: collision with root package name */
    private static final C15331h f126369o = C15331h.p("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: p, reason: collision with root package name */
    private static final C15331h f126370p = C15331h.p("\n\r");

    /* renamed from: q, reason: collision with root package name */
    private static final C15331h f126371q = C15331h.p("*/");

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC15330g f126372g;

    /* renamed from: h, reason: collision with root package name */
    private final C15328e f126373h;

    /* renamed from: i, reason: collision with root package name */
    private int f126374i;

    /* renamed from: j, reason: collision with root package name */
    private long f126375j;

    /* renamed from: k, reason: collision with root package name */
    private int f126376k;

    /* renamed from: l, reason: collision with root package name */
    private String f126377l;

    m(InterfaceC15330g interfaceC15330g) {
        this.f126374i = 0;
        if (interfaceC15330g == null) {
            throw new NullPointerException("source == null");
        }
        this.f126372g = interfaceC15330g;
        this.f126373h = interfaceC15330g.e();
        u(6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.f126373h.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r2 != 47) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r6.f126372g.t(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        O();
        r3 = r6.f126373h.l(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r3 == 42) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r6.f126373h.readByte();
        r6.f126373h.readByte();
        r0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r6.f126373h.readByte();
        r6.f126373h.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (q0() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        throw J("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        O();
        r0();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int e0(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kw.g r2 = r6.f126372g
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.t(r4)
            if (r2 == 0) goto L80
            kw.e r2 = r6.f126373h
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
            kw.e r3 = r6.f126373h
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            kw.g r3 = r6.f126372g
            r4 = 2
            boolean r3 = r3.t(r4)
            if (r3 != 0) goto L3a
            goto L7d
        L3a:
            r6.O()
            kw.e r3 = r6.f126373h
            r4 = 1
            byte r3 = r3.l(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            goto L7d
        L4c:
            kw.e r1 = r6.f126373h
            r1.readByte()
            kw.e r1 = r6.f126373h
            r1.readByte()
            r6.r0()
            goto L1
        L5a:
            kw.e r1 = r6.f126373h
            r1.readByte()
            kw.e r1 = r6.f126373h
            r1.readByte()
            boolean r1 = r6.q0()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            com.squareup.moshi.JsonEncodingException r7 = r6.J(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.O()
            r6.r0()
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
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.m.e0(boolean):int");
    }

    private String h0(C15331h c15331h) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long jE3 = this.f126372g.e3(c15331h);
            if (jE3 == -1) {
                throw J("Unterminated string");
            }
            if (this.f126373h.l(jE3) != 92) {
                if (sb2 == null) {
                    String strK1 = this.f126373h.K1(jE3);
                    this.f126373h.readByte();
                    return strK1;
                }
                sb2.append(this.f126373h.K1(jE3));
                this.f126373h.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f126373h.K1(jE3));
            this.f126373h.readByte();
            sb2.append(m0());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f126374i = 0;
        this.f126348b[0] = 8;
        this.f126347a = 1;
        this.f126373h.a();
        this.f126372g.close();
    }

    private void O() throws IOException {
        if (!this.f126351e) {
            throw J("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int R() throws IOException {
        int[] iArr = this.f126348b;
        int i10 = this.f126347a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iE0 = e0(true);
            this.f126373h.readByte();
            if (iE0 != 44) {
                if (iE0 != 59) {
                    if (iE0 != 93) {
                        throw J("Unterminated array");
                    }
                    this.f126374i = 4;
                    return 4;
                }
                O();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iE02 = e0(true);
                    this.f126373h.readByte();
                    if (iE02 != 44) {
                        if (iE02 != 59) {
                            if (iE02 != 125) {
                                throw J("Unterminated object");
                            }
                            this.f126374i = 2;
                            return 2;
                        }
                        O();
                    }
                }
                int iE03 = e0(true);
                if (iE03 == 34) {
                    this.f126373h.readByte();
                    this.f126374i = 13;
                    return 13;
                }
                if (iE03 == 39) {
                    this.f126373h.readByte();
                    O();
                    this.f126374i = 12;
                    return 12;
                }
                if (iE03 != 125) {
                    O();
                    if (!c0((char) iE03)) {
                        throw J("Expected name");
                    }
                    this.f126374i = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw J("Expected name");
                }
                this.f126373h.readByte();
                this.f126374i = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iE04 = e0(true);
                this.f126373h.readByte();
                if (iE04 != 58) {
                    if (iE04 != 61) {
                        throw J("Expected ':'");
                    }
                    O();
                    if (this.f126372g.t(1L) && this.f126373h.l(0L) == 62) {
                        this.f126373h.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (e0(false) == -1) {
                    this.f126374i = 18;
                    return 18;
                }
                O();
            } else {
                if (i11 == 9) {
                    throw null;
                }
                if (i11 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iE05 = e0(true);
        if (iE05 == 34) {
            this.f126373h.readByte();
            this.f126374i = 9;
            return 9;
        }
        if (iE05 == 39) {
            O();
            this.f126373h.readByte();
            this.f126374i = 8;
            return 8;
        }
        if (iE05 != 44 && iE05 != 59) {
            if (iE05 == 91) {
                this.f126373h.readByte();
                this.f126374i = 3;
                return 3;
            }
            if (iE05 != 93) {
                if (iE05 == 123) {
                    this.f126373h.readByte();
                    this.f126374i = 1;
                    return 1;
                }
                int iJ0 = j0();
                if (iJ0 != 0) {
                    return iJ0;
                }
                int iL0 = l0();
                if (iL0 != 0) {
                    return iL0;
                }
                if (!c0(this.f126373h.l(0L))) {
                    throw J("Expected value");
                }
                O();
                this.f126374i = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f126373h.readByte();
                this.f126374i = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw J("Unexpected value");
        }
        O();
        this.f126374i = 7;
        return 7;
    }

    private int T(String str, k.b bVar) {
        int length = bVar.f126354a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f126354a[i10])) {
                this.f126374i = 0;
                this.f126349c[this.f126347a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private int Z(String str, k.b bVar) {
        int length = bVar.f126354a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f126354a[i10])) {
                this.f126374i = 0;
                int[] iArr = this.f126350d;
                int i11 = this.f126347a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    private boolean c0(int i10) throws IOException {
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
        O();
        return false;
    }

    private String i0() throws IOException {
        long jE3 = this.f126372g.e3(f126369o);
        return jE3 != -1 ? this.f126373h.K1(jE3) : this.f126373h.n3();
    }

    private int j0() throws IOException {
        String str;
        String str2;
        int i10;
        byte bL = this.f126373h.l(0L);
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
            if (!this.f126372g.t(i12)) {
                return 0;
            }
            byte bL2 = this.f126373h.l(i11);
            if (bL2 != str.charAt(i11) && bL2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f126372g.t(length + 1) && c0(this.f126373h.l(length))) {
            return 0;
        }
        this.f126373h.skip(length);
        this.f126374i = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        if (c0(r1) != false) goto L66;
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
    
        r19.f126375j = r8;
        r19.f126373h.skip(r5);
        r19.f126374i = 16;
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
    
        r19.f126376k = r5;
        r19.f126374i = 17;
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
    private int l0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.m.l0():int");
    }

    private char m0() throws IOException {
        int i10;
        if (!this.f126372g.t(1L)) {
            throw J("Unterminated escape sequence");
        }
        byte b10 = this.f126373h.readByte();
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
            if (this.f126351e) {
                return (char) b10;
            }
            throw J("Invalid escape sequence: \\" + ((char) b10));
        }
        if (!this.f126372g.t(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bL = this.f126373h.l(i11);
            char c11 = (char) (c10 << 4);
            if (bL >= 48 && bL <= 57) {
                i10 = bL - 48;
            } else if (bL >= 97 && bL <= 102) {
                i10 = bL - 87;
            } else {
                if (bL < 65 || bL > 70) {
                    throw J("\\u" + this.f126373h.K1(4L));
                }
                i10 = bL - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f126373h.skip(4L);
        return c10;
    }

    private void n0(C15331h c15331h) throws IOException {
        while (true) {
            long jE3 = this.f126372g.e3(c15331h);
            if (jE3 == -1) {
                throw J("Unterminated string");
            }
            if (this.f126373h.l(jE3) != 92) {
                this.f126373h.skip(jE3 + 1);
                return;
            } else {
                this.f126373h.skip(jE3 + 1);
                m0();
            }
        }
    }

    private boolean q0() throws IOException {
        long jX0 = this.f126372g.x0(f126371q);
        boolean z10 = jX0 != -1;
        C15328e c15328e = this.f126373h;
        c15328e.skip(z10 ? jX0 + r1.V() : c15328e.getSize());
        return z10;
    }

    private void r0() throws IOException {
        long jE3 = this.f126372g.e3(f126370p);
        C15328e c15328e = this.f126373h;
        c15328e.skip(jE3 != -1 ? jE3 + 1 : c15328e.getSize());
    }

    private void v0() throws IOException {
        long jE3 = this.f126372g.e3(f126369o);
        C15328e c15328e = this.f126373h;
        if (jE3 == -1) {
            jE3 = c15328e.getSize();
        }
        c15328e.skip(jE3);
    }

    @Override // com.squareup.moshi.k
    public int A(k.b bVar) throws IOException {
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR < 8 || iR > 11) {
            return -1;
        }
        if (iR == 11) {
            return Z(this.f126377l, bVar);
        }
        int iU2 = this.f126372g.U2(bVar.f126355b);
        if (iU2 != -1) {
            this.f126374i = 0;
            int[] iArr = this.f126350d;
            int i10 = this.f126347a - 1;
            iArr[i10] = iArr[i10] + 1;
            return iU2;
        }
        String strNextString = nextString();
        int iZ = Z(strNextString, bVar);
        if (iZ == -1) {
            this.f126374i = 11;
            this.f126377l = strNextString;
            this.f126350d[this.f126347a - 1] = r0[r1] - 1;
        }
        return iZ;
    }

    @Override // com.squareup.moshi.k
    public void H() throws IOException {
        if (this.f126352f) {
            k.c cVarL = l();
            nextName();
            throw new JsonDataException("Cannot skip unexpected " + cVarL + " at " + getPath());
        }
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 14) {
            v0();
        } else if (iR == 13) {
            n0(f126368n);
        } else if (iR == 12) {
            n0(f126367m);
        } else if (iR != 15) {
            throw new JsonDataException("Expected a name but was " + l() + " at path " + getPath());
        }
        this.f126374i = 0;
        this.f126349c[this.f126347a - 1] = BuildConfig.TRAVIS;
    }

    @Override // com.squareup.moshi.k
    public void a() throws IOException {
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 3) {
            u(1);
            this.f126350d[this.f126347a - 1] = 0;
            this.f126374i = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + l() + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.k
    public void b() throws IOException {
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 1) {
            u(3);
            this.f126374i = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + l() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.k
    public void c() throws IOException {
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + l() + " at path " + getPath());
        }
        int i10 = this.f126347a;
        this.f126347a = i10 - 1;
        int[] iArr = this.f126350d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f126374i = 0;
    }

    @Override // com.squareup.moshi.k
    public void d() throws IOException {
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + l() + " at path " + getPath());
        }
        int i10 = this.f126347a;
        int i11 = i10 - 1;
        this.f126347a = i11;
        this.f126349c[i11] = null;
        int[] iArr = this.f126350d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f126374i = 0;
    }

    @Override // com.squareup.moshi.k
    public boolean hasNext() throws IOException {
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        return (iR == 2 || iR == 4 || iR == 18) ? false : true;
    }

    @Override // com.squareup.moshi.k
    public <T> T i() throws IOException {
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 7) {
            this.f126374i = 0;
            int[] iArr = this.f126350d;
            int i10 = this.f126347a - 1;
            iArr[i10] = iArr[i10] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + l() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.k
    public k.c l() throws IOException {
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        switch (iR) {
            case 1:
                return k.c.BEGIN_OBJECT;
            case 2:
                return k.c.END_OBJECT;
            case 3:
                return k.c.BEGIN_ARRAY;
            case 4:
                return k.c.END_ARRAY;
            case 5:
            case 6:
                return k.c.BOOLEAN;
            case 7:
                return k.c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return k.c.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return k.c.NAME;
            case 16:
            case 17:
                return k.c.NUMBER;
            case 18:
                return k.c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.squareup.moshi.k
    public k m() {
        return new m(this);
    }

    @Override // com.squareup.moshi.k
    public boolean nextBoolean() throws IOException {
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 5) {
            this.f126374i = 0;
            int[] iArr = this.f126350d;
            int i10 = this.f126347a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iR == 6) {
            this.f126374i = 0;
            int[] iArr2 = this.f126350d;
            int i11 = this.f126347a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + l() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.k
    public double nextDouble() throws IOException, NumberFormatException {
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 16) {
            this.f126374i = 0;
            int[] iArr = this.f126350d;
            int i10 = this.f126347a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f126375j;
        }
        if (iR == 17) {
            this.f126377l = this.f126373h.K1(this.f126376k);
        } else if (iR == 9) {
            this.f126377l = h0(f126368n);
        } else if (iR == 8) {
            this.f126377l = h0(f126367m);
        } else if (iR == 10) {
            this.f126377l = i0();
        } else if (iR != 11) {
            throw new JsonDataException("Expected a double but was " + l() + " at path " + getPath());
        }
        this.f126374i = 11;
        try {
            double d10 = Double.parseDouble(this.f126377l);
            if (this.f126351e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f126377l = null;
                this.f126374i = 0;
                int[] iArr2 = this.f126350d;
                int i11 = this.f126347a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + d10 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f126377l + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.k
    public int nextInt() throws IOException, NumberFormatException {
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 16) {
            long j10 = this.f126375j;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f126374i = 0;
                int[] iArr = this.f126350d;
                int i11 = this.f126347a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new JsonDataException("Expected an int but was " + this.f126375j + " at path " + getPath());
        }
        if (iR == 17) {
            this.f126377l = this.f126373h.K1(this.f126376k);
        } else if (iR == 9 || iR == 8) {
            String strH0 = iR == 9 ? h0(f126368n) : h0(f126367m);
            this.f126377l = strH0;
            try {
                int i12 = Integer.parseInt(strH0);
                this.f126374i = 0;
                int[] iArr2 = this.f126350d;
                int i13 = this.f126347a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iR != 11) {
            throw new JsonDataException("Expected an int but was " + l() + " at path " + getPath());
        }
        this.f126374i = 11;
        try {
            double d10 = Double.parseDouble(this.f126377l);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f126377l = null;
                this.f126374i = 0;
                int[] iArr3 = this.f126350d;
                int i15 = this.f126347a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new JsonDataException("Expected an int but was " + this.f126377l + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f126377l + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.k
    public long nextLong() throws IOException, NumberFormatException {
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 16) {
            this.f126374i = 0;
            int[] iArr = this.f126350d;
            int i10 = this.f126347a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f126375j;
        }
        if (iR == 17) {
            this.f126377l = this.f126373h.K1(this.f126376k);
        } else if (iR == 9 || iR == 8) {
            String strH0 = iR == 9 ? h0(f126368n) : h0(f126367m);
            this.f126377l = strH0;
            try {
                long j10 = Long.parseLong(strH0);
                this.f126374i = 0;
                int[] iArr2 = this.f126350d;
                int i11 = this.f126347a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        } else if (iR != 11) {
            throw new JsonDataException("Expected a long but was " + l() + " at path " + getPath());
        }
        this.f126374i = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f126377l).longValueExact();
            this.f126377l = null;
            this.f126374i = 0;
            int[] iArr3 = this.f126350d;
            int i12 = this.f126347a - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f126377l + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.k
    public String nextName() throws IOException {
        String strH0;
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 14) {
            strH0 = i0();
        } else if (iR == 13) {
            strH0 = h0(f126368n);
        } else if (iR == 12) {
            strH0 = h0(f126367m);
        } else {
            if (iR != 15) {
                throw new JsonDataException("Expected a name but was " + l() + " at path " + getPath());
            }
            strH0 = this.f126377l;
            this.f126377l = null;
        }
        this.f126374i = 0;
        this.f126349c[this.f126347a - 1] = strH0;
        return strH0;
    }

    @Override // com.squareup.moshi.k
    public String nextString() throws IOException {
        String strK1;
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 10) {
            strK1 = i0();
        } else if (iR == 9) {
            strK1 = h0(f126368n);
        } else if (iR == 8) {
            strK1 = h0(f126367m);
        } else if (iR == 11) {
            strK1 = this.f126377l;
            this.f126377l = null;
        } else if (iR == 16) {
            strK1 = Long.toString(this.f126375j);
        } else {
            if (iR != 17) {
                throw new JsonDataException("Expected a string but was " + l() + " at path " + getPath());
            }
            strK1 = this.f126373h.K1(this.f126376k);
        }
        this.f126374i = 0;
        int[] iArr = this.f126350d;
        int i10 = this.f126347a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strK1;
    }

    @Override // com.squareup.moshi.k
    public void skipValue() throws IOException {
        if (this.f126352f) {
            throw new JsonDataException("Cannot skip unexpected " + l() + " at " + getPath());
        }
        int i10 = 0;
        do {
            int iR = this.f126374i;
            if (iR == 0) {
                iR = R();
            }
            if (iR == 3) {
                u(1);
            } else if (iR == 1) {
                u(3);
            } else {
                if (iR == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new JsonDataException("Expected a value but was " + l() + " at path " + getPath());
                    }
                    this.f126347a--;
                } else if (iR == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new JsonDataException("Expected a value but was " + l() + " at path " + getPath());
                    }
                    this.f126347a--;
                } else if (iR == 14 || iR == 10) {
                    v0();
                } else if (iR == 9 || iR == 13) {
                    n0(f126368n);
                } else if (iR == 8 || iR == 12) {
                    n0(f126367m);
                } else if (iR == 17) {
                    this.f126373h.skip(this.f126376k);
                } else if (iR == 18) {
                    throw new JsonDataException("Expected a value but was " + l() + " at path " + getPath());
                }
                this.f126374i = 0;
            }
            i10++;
            this.f126374i = 0;
        } while (i10 != 0);
        int[] iArr = this.f126350d;
        int i11 = this.f126347a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f126349c[i11 - 1] = BuildConfig.TRAVIS;
    }

    public String toString() {
        return "JsonReader(" + this.f126372g + ")";
    }

    @Override // com.squareup.moshi.k
    public int z(k.b bVar) throws IOException {
        int iR = this.f126374i;
        if (iR == 0) {
            iR = R();
        }
        if (iR < 12 || iR > 15) {
            return -1;
        }
        if (iR == 15) {
            return T(this.f126377l, bVar);
        }
        int iU2 = this.f126372g.U2(bVar.f126355b);
        if (iU2 != -1) {
            this.f126374i = 0;
            this.f126349c[this.f126347a - 1] = bVar.f126354a[iU2];
            return iU2;
        }
        String str = this.f126349c[this.f126347a - 1];
        String strNextName = nextName();
        int iT = T(strNextName, bVar);
        if (iT == -1) {
            this.f126374i = 15;
            this.f126377l = strNextName;
            this.f126349c[this.f126347a - 1] = str;
        }
        return iT;
    }

    @Override // com.squareup.moshi.k
    public void p() throws IOException {
        if (hasNext()) {
            this.f126377l = nextName();
            this.f126374i = 11;
        }
    }

    m(m mVar) {
        super(mVar);
        this.f126374i = 0;
        InterfaceC15330g interfaceC15330gPeek = mVar.f126372g.peek();
        this.f126372g = interfaceC15330gPeek;
        this.f126373h = interfaceC15330gPeek.e();
        this.f126374i = mVar.f126374i;
        this.f126375j = mVar.f126375j;
        this.f126376k = mVar.f126376k;
        this.f126377l = mVar.f126377l;
        try {
            interfaceC15330gPeek.B1(mVar.f126373h.getSize());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
