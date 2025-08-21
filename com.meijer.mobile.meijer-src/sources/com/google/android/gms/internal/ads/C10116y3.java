package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.y3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10116y3 implements InterfaceC9255q0 {

    /* renamed from: J, reason: collision with root package name */
    private static final byte[] f80759J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K, reason: collision with root package name */
    private static final C f80760K;

    /* renamed from: A, reason: collision with root package name */
    private int f80761A;

    /* renamed from: B, reason: collision with root package name */
    private int f80762B;

    /* renamed from: C, reason: collision with root package name */
    private int f80763C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f80764D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f80765E;

    /* renamed from: I, reason: collision with root package name */
    private boolean f80769I;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8835m4 f80770a;

    /* renamed from: b, reason: collision with root package name */
    private final int f80771b;

    /* renamed from: c, reason: collision with root package name */
    private final List f80772c;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f80777h;

    /* renamed from: i, reason: collision with root package name */
    private final GQ f80778i;

    /* renamed from: p, reason: collision with root package name */
    private int f80785p;

    /* renamed from: q, reason: collision with root package name */
    private int f80786q;

    /* renamed from: r, reason: collision with root package name */
    private long f80787r;

    /* renamed from: s, reason: collision with root package name */
    private int f80788s;

    /* renamed from: t, reason: collision with root package name */
    private GQ f80789t;

    /* renamed from: u, reason: collision with root package name */
    private long f80790u;

    /* renamed from: v, reason: collision with root package name */
    private int f80791v;

    /* renamed from: z, reason: collision with root package name */
    private C10009x3 f80795z;

    /* renamed from: j, reason: collision with root package name */
    private final Q1 f80779j = new Q1();

    /* renamed from: k, reason: collision with root package name */
    private final GQ f80780k = new GQ(16);

    /* renamed from: e, reason: collision with root package name */
    private final GQ f80774e = new GQ(C9310qa0.f78636a);

    /* renamed from: f, reason: collision with root package name */
    private final GQ f80775f = new GQ(5);

    /* renamed from: g, reason: collision with root package name */
    private final GQ f80776g = new GQ();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayDeque f80781l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    private final ArrayDeque f80782m = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray f80773d = new SparseArray();

    /* renamed from: o, reason: collision with root package name */
    private AbstractC8042eh0 f80784o = AbstractC8042eh0.t();

    /* renamed from: x, reason: collision with root package name */
    private long f80793x = -9223372036854775807L;

    /* renamed from: w, reason: collision with root package name */
    private long f80792w = -9223372036854775807L;

    /* renamed from: y, reason: collision with root package name */
    private long f80794y = -9223372036854775807L;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC9575t0 f80766F = InterfaceC9575t0.f79304h3;

    /* renamed from: G, reason: collision with root package name */
    private X0[] f80767G = new X0[0];

    /* renamed from: H, reason: collision with root package name */
    private X0[] f80768H = new X0[0];

    /* renamed from: n, reason: collision with root package name */
    private final C9741uc0 f80783n = new C9741uc0(new InterfaceC9525sb0() { // from class: com.google.android.gms.internal.ads.v3
        @Override // com.google.android.gms.internal.ads.InterfaceC9525sb0
        public final void a(long j10, GQ gq2) {
            this.f79816a.e(j10, gq2);
        }
    });

    private final void h() {
        this.f80785p = 0;
        this.f80788s = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f8, code lost:
    
        if (r37.f80765E == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fa, code lost:
    
        r37.f80776g.i(r13);
        r38.zzi(r37.f80776g.n(), 0, r37.f80763C);
        r5.c(r37.f80776g, r37.f80763C);
        r8 = r37.f80763C;
        r10 = r37.f80776g;
        r10 = com.google.android.gms.internal.ads.C9310qa0.b(r10.n(), r10.u());
        r37.f80776g.l("video/hevc".equals(r3.f68864g.f66504o) ? 1 : 0);
        r37.f80776g.k(r10);
        r4 = r3.f68864g.f66506q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0239, code lost:
    
        if (r4 == (-1)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0241, code lost:
    
        if (r4 == r37.f80783n.a()) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0243, code lost:
    
        r37.f80783n.d(r3.f68864g.f66506q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024c, code lost:
    
        r37.f80783n.b(r6, r37.f80776g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0259, code lost:
    
        if ((r2.a() & 5) == 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x025b, code lost:
    
        r37.f80783n.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0261, code lost:
    
        r8 = r5.b(r38, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0266, code lost:
    
        r37.f80762B += r8;
        r37.f80763C -= r8;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0273, code lost:
    
        r22 = r2.a();
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027b, code lost:
    
        if (r1 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x027d, code lost:
    
        r25 = r1.f69089c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0282, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0284, code lost:
    
        r5.a(r6, r22, r37.f80761A, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0297, code lost:
    
        if (r37.f80782m.isEmpty() != false) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0299, code lost:
    
        r1 = (com.google.android.gms.internal.ads.C9902w3) r37.f80782m.removeFirst();
        r37.f80791v -= r1.f80248c;
        r3 = r1.f80246a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02ac, code lost:
    
        if (r1.f80247b == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ae, code lost:
    
        r3 = r3 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b0, code lost:
    
        r6 = r3;
        r3 = r37.f80767G;
        r4 = r3.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02b5, code lost:
    
        if (r12 >= r4) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02b7, code lost:
    
        r3[r12].a(r6, 1, r1.f80248c, r37.f80791v, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02c9, code lost:
    
        if (r2.k() != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02cb, code lost:
    
        r37.f80795z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ce, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02cf, code lost:
    
        r37.f80785p = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02d3, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        if (r37.f80785p != 3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        r3 = r2.b();
        r37.f80761A = r3;
        r37.f80764D = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        if (r2.f80491f >= r2.f80494i) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        r38.e(r3);
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        if (r1 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
    
        r3 = r2.f80487b.f69340n;
        r1 = r1.f69090d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
    
        if (r1 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
    
        r3.m(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
    
        if (r2.f80487b.b(r2.f80491f) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        r3.m(r3.G() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
    
        if (r2.k() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
    
        r37.f80795z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00df, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
    
        if (r2.f80489d.f69634a.f68865h != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ea, code lost:
    
        r37.f80761A = r3 - 8;
        r38.e(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ff, code lost:
    
        if ("audio/ac4".equals(r2.f80489d.f69634a.f68864g.f66504o) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        r37.f80762B = r2.c(r37.f80761A, 7);
        com.google.android.gms.internal.ads.T.b(r37.f80761A, r37.f80778i);
        r2.f80486a.c(r37.f80778i, 7);
        r3 = r37.f80762B + 7;
        r37.f80762B = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011e, code lost:
    
        r3 = r2.c(r37.f80761A, 0);
        r37.f80762B = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
    
        r37.f80761A += r3;
        r37.f80785p = 4;
        r37.f80763C = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0130, code lost:
    
        r3 = r2.f80489d.f69634a;
        r5 = r2.f80486a;
        r6 = r2.e();
        r11 = r3.f68868k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
    
        if (r11 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013e, code lost:
    
        r3 = r37.f80762B;
        r4 = r37.f80761A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0142, code lost:
    
        if (r3 >= r4) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0144, code lost:
    
        r37.f80762B += r5.b(r38, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014f, code lost:
    
        r12 = r37.f80775f.n();
        r12[0] = 0;
        r12[1] = 0;
        r12[r39] = 0;
        r14 = r11 + 1;
        r11 = 4 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0165, code lost:
    
        if (r37.f80762B >= r37.f80761A) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
    
        r13 = r37.f80763C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016b, code lost:
    
        if (r13 != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016d, code lost:
    
        r38.zzi(r12, r11, r14);
        r37.f80775f.l(r10);
        r13 = r37.f80775f.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017b, code lost:
    
        if (r13 <= 0) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017d, code lost:
    
        r37.f80763C = r13 - 1;
        r37.f80774e.l(r10);
        r5.c(r37.f80774e, 4);
        r5.c(r37.f80775f, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0198, code lost:
    
        if (r37.f80768H.length <= 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019a, code lost:
    
        r13 = r3.f68864g;
        r19 = r12[4];
        r20 = com.google.android.gms.internal.ads.C9310qa0.f78636a;
        r13 = r13.f66504o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a6, code lost:
    
        if ("video/avc".equals(r13) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01aa, code lost:
    
        if ((r19 & 31) == r4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ad, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b3, code lost:
    
        if ("video/hevc".equals(r13) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ba, code lost:
    
        if (((r19 & 126) >> 1) != 39) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bd, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01be, code lost:
    
        r37.f80765E = r8;
        r37.f80762B += 5;
        r37.f80761A += r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cd, code lost:
    
        if (r37.f80764D != false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01db, code lost:
    
        if (java.util.Objects.equals(r2.f80489d.f69634a.f68864g.f66504o, "video/avc") == false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e5, code lost:
    
        if (com.google.android.gms.internal.ads.C9310qa0.i(r12[4]) == false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e7, code lost:
    
        r37.f80764D = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e9, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f5, code lost:
    
        throw com.google.android.gms.internal.ads.zzbc.a("Invalid NAL length", null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.ads.InterfaceC9361r0 r38, com.google.android.gms.internal.ads.N0 r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10116y3.b(com.google.android.gms.internal.ads.r0, com.google.android.gms.internal.ads.N0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return this.f80784o;
    }

    static {
        C9717uH0 c9717uH0 = new C9717uH0();
        c9717uH0.B("application/x-emsg");
        f80760K = c9717uH0.H();
    }

    private static int f(int i10) throws zzbc {
        if (i10 >= 0) {
            return i10;
        }
        throw zzbc.a("Unexpected negative value: " + i10, null);
    }

    private static void i(GQ gq2, int i10, M3 m32) throws zzbc {
        gq2.l(i10 + 8);
        int iW = gq2.w();
        int i11 = C9474s3.f78960b;
        if ((iW & 1) != 0) {
            throw zzbc.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iW & 2) != 0;
        int iF = gq2.F();
        if (iF == 0) {
            Arrays.fill(m32.f69338l, 0, m32.f69331e, false);
            return;
        }
        int i12 = m32.f69331e;
        if (iF != i12) {
            throw zzbc.a("Senc sample count " + iF + " is different from fragment sample count" + i12, null);
        }
        Arrays.fill(m32.f69338l, 0, iF, z10);
        m32.a(gq2.r());
        GQ gq3 = m32.f69340n;
        gq2.h(gq3.n(), 0, gq3.u());
        m32.f69340n.l(0);
        m32.f69341o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j(long r53) throws com.google.android.gms.internal.ads.zzbc {
        /*
            Method dump skipped, instructions count: 1807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10116y3.j(long):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        int size = this.f80773d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C10009x3) this.f80773d.valueAt(i10)).i();
        }
        this.f80782m.clear();
        this.f80791v = 0;
        this.f80783n.c();
        this.f80792w = j11;
        this.f80781l.clear();
        h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        int i10;
        if ((this.f80771b & 32) == 0) {
            interfaceC9575t0 = new C9156p4(interfaceC9575t0, this.f80770a);
        }
        this.f80766F = interfaceC9575t0;
        h();
        X0[] x0Arr = new X0[2];
        this.f80767G = x0Arr;
        int i11 = 100;
        int i12 = 0;
        if ((this.f80771b & 4) != 0) {
            x0Arr[0] = this.f80766F.a(100, 5);
            i10 = 1;
            i11 = 101;
        } else {
            i10 = 0;
        }
        X0[] x0Arr2 = (X0[]) OV.n(this.f80767G, i10);
        this.f80767G = x0Arr2;
        for (X0 x02 : x0Arr2) {
            x02.d(f80760K);
        }
        this.f80768H = new X0[this.f80772c.size()];
        while (i12 < this.f80768H.length) {
            X0 x0A = this.f80766F.a(i11, 3);
            x0A.d((C) this.f80772c.get(i12));
            this.f80768H[i12] = x0A;
            i12++;
            i11++;
        }
    }

    final /* synthetic */ void e(long j10, GQ gq2) {
        C7760c0.a(j10, gq2, this.f80768H);
    }

    public C10116y3(InterfaceC8835m4 interfaceC8835m4, int i10, C8982nU c8982nU, K3 k32, List list, X0 x02) {
        this.f80770a = interfaceC8835m4;
        this.f80771b = i10;
        this.f80772c = Collections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.f80777h = bArr;
        this.f80778i = new GQ(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.TE0 g(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10116y3.g(java.util.List):com.google.android.gms.internal.ads.TE0");
    }

    private static final C9581t3 k(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (C9581t3) sparseArray.valueAt(0);
        }
        C9581t3 c9581t3 = (C9581t3) sparseArray.get(i10);
        c9581t3.getClass();
        return c9581t3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        AbstractC8042eh0 abstractC8042eh0T;
        U0 u0A = J3.a(interfaceC9361r0);
        if (u0A != null) {
            abstractC8042eh0T = AbstractC8042eh0.u(u0A);
        } else {
            abstractC8042eh0T = AbstractC8042eh0.t();
        }
        this.f80784o = abstractC8042eh0T;
        if (u0A == null) {
            return true;
        }
        return false;
    }
}
