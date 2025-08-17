package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.y3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9991y3 implements InterfaceC9130q0 {

    /* renamed from: J, reason: collision with root package name */
    private static final byte[] f79919J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K, reason: collision with root package name */
    private static final C f79920K;

    /* renamed from: A, reason: collision with root package name */
    private int f79921A;

    /* renamed from: B, reason: collision with root package name */
    private int f79922B;

    /* renamed from: C, reason: collision with root package name */
    private int f79923C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f79924D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f79925E;

    /* renamed from: I, reason: collision with root package name */
    private boolean f79929I;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8710m4 f79930a;

    /* renamed from: b, reason: collision with root package name */
    private final int f79931b;

    /* renamed from: c, reason: collision with root package name */
    private final List f79932c;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f79937h;

    /* renamed from: i, reason: collision with root package name */
    private final GQ f79938i;

    /* renamed from: p, reason: collision with root package name */
    private int f79945p;

    /* renamed from: q, reason: collision with root package name */
    private int f79946q;

    /* renamed from: r, reason: collision with root package name */
    private long f79947r;

    /* renamed from: s, reason: collision with root package name */
    private int f79948s;

    /* renamed from: t, reason: collision with root package name */
    private GQ f79949t;

    /* renamed from: u, reason: collision with root package name */
    private long f79950u;

    /* renamed from: v, reason: collision with root package name */
    private int f79951v;

    /* renamed from: z, reason: collision with root package name */
    private C9884x3 f79955z;

    /* renamed from: j, reason: collision with root package name */
    private final Q1 f79939j = new Q1();

    /* renamed from: k, reason: collision with root package name */
    private final GQ f79940k = new GQ(16);

    /* renamed from: e, reason: collision with root package name */
    private final GQ f79934e = new GQ(C9185qa0.f77796a);

    /* renamed from: f, reason: collision with root package name */
    private final GQ f79935f = new GQ(5);

    /* renamed from: g, reason: collision with root package name */
    private final GQ f79936g = new GQ();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayDeque f79941l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    private final ArrayDeque f79942m = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray f79933d = new SparseArray();

    /* renamed from: o, reason: collision with root package name */
    private AbstractC7917eh0 f79944o = AbstractC7917eh0.t();

    /* renamed from: x, reason: collision with root package name */
    private long f79953x = -9223372036854775807L;

    /* renamed from: w, reason: collision with root package name */
    private long f79952w = -9223372036854775807L;

    /* renamed from: y, reason: collision with root package name */
    private long f79954y = -9223372036854775807L;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC9450t0 f79926F = InterfaceC9450t0.f78464h3;

    /* renamed from: G, reason: collision with root package name */
    private X0[] f79927G = new X0[0];

    /* renamed from: H, reason: collision with root package name */
    private X0[] f79928H = new X0[0];

    /* renamed from: n, reason: collision with root package name */
    private final C9616uc0 f79943n = new C9616uc0(new InterfaceC9400sb0() { // from class: com.google.android.gms.internal.ads.v3
        @Override // com.google.android.gms.internal.ads.InterfaceC9400sb0
        public final void a(long j10, GQ gq2) {
            this.f78976a.e(j10, gq2);
        }
    });

    private final void h() {
        this.f79945p = 0;
        this.f79948s = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f8, code lost:
    
        if (r37.f79925E == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fa, code lost:
    
        r37.f79936g.i(r13);
        r38.zzi(r37.f79936g.n(), 0, r37.f79923C);
        r5.c(r37.f79936g, r37.f79923C);
        r8 = r37.f79923C;
        r10 = r37.f79936g;
        r10 = com.google.android.gms.internal.ads.C9185qa0.b(r10.n(), r10.u());
        r37.f79936g.l("video/hevc".equals(r3.f68024g.f65664o) ? 1 : 0);
        r37.f79936g.k(r10);
        r4 = r3.f68024g.f65666q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0239, code lost:
    
        if (r4 == (-1)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0241, code lost:
    
        if (r4 == r37.f79943n.a()) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0243, code lost:
    
        r37.f79943n.d(r3.f68024g.f65666q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024c, code lost:
    
        r37.f79943n.b(r6, r37.f79936g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0259, code lost:
    
        if ((r2.a() & 5) == 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x025b, code lost:
    
        r37.f79943n.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0261, code lost:
    
        r8 = r5.b(r38, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0266, code lost:
    
        r37.f79922B += r8;
        r37.f79923C -= r8;
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
    
        r25 = r1.f68249c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0282, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0284, code lost:
    
        r5.a(r6, r22, r37.f79921A, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0297, code lost:
    
        if (r37.f79942m.isEmpty() != false) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0299, code lost:
    
        r1 = (com.google.android.gms.internal.ads.C9777w3) r37.f79942m.removeFirst();
        r37.f79951v -= r1.f79408c;
        r3 = r1.f79406a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02ac, code lost:
    
        if (r1.f79407b == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ae, code lost:
    
        r3 = r3 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b0, code lost:
    
        r6 = r3;
        r3 = r37.f79927G;
        r4 = r3.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02b5, code lost:
    
        if (r12 >= r4) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02b7, code lost:
    
        r3[r12].a(r6, 1, r1.f79408c, r37.f79951v, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02c9, code lost:
    
        if (r2.k() != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02cb, code lost:
    
        r37.f79955z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ce, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02cf, code lost:
    
        r37.f79945p = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02d3, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        if (r37.f79945p != 3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        r3 = r2.b();
        r37.f79921A = r3;
        r37.f79924D = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        if (r2.f79651f >= r2.f79654i) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        r38.e(r3);
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        if (r1 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
    
        r3 = r2.f79647b.f68500n;
        r1 = r1.f68250d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
    
        if (r1 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
    
        r3.m(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
    
        if (r2.f79647b.b(r2.f79651f) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        r3.m(r3.G() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
    
        if (r2.k() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
    
        r37.f79955z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00df, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
    
        if (r2.f79649d.f68794a.f68025h != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ea, code lost:
    
        r37.f79921A = r3 - 8;
        r38.e(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ff, code lost:
    
        if ("audio/ac4".equals(r2.f79649d.f68794a.f68024g.f65664o) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        r37.f79922B = r2.c(r37.f79921A, 7);
        com.google.android.gms.internal.ads.T.b(r37.f79921A, r37.f79938i);
        r2.f79646a.c(r37.f79938i, 7);
        r3 = r37.f79922B + 7;
        r37.f79922B = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011e, code lost:
    
        r3 = r2.c(r37.f79921A, 0);
        r37.f79922B = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
    
        r37.f79921A += r3;
        r37.f79945p = 4;
        r37.f79923C = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0130, code lost:
    
        r3 = r2.f79649d.f68794a;
        r5 = r2.f79646a;
        r6 = r2.e();
        r11 = r3.f68028k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
    
        if (r11 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013e, code lost:
    
        r3 = r37.f79922B;
        r4 = r37.f79921A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0142, code lost:
    
        if (r3 >= r4) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0144, code lost:
    
        r37.f79922B += r5.b(r38, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014f, code lost:
    
        r12 = r37.f79935f.n();
        r12[0] = 0;
        r12[1] = 0;
        r12[r39] = 0;
        r14 = r11 + 1;
        r11 = 4 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0165, code lost:
    
        if (r37.f79922B >= r37.f79921A) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
    
        r13 = r37.f79923C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016b, code lost:
    
        if (r13 != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016d, code lost:
    
        r38.zzi(r12, r11, r14);
        r37.f79935f.l(r10);
        r13 = r37.f79935f.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017b, code lost:
    
        if (r13 <= 0) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017d, code lost:
    
        r37.f79923C = r13 - 1;
        r37.f79934e.l(r10);
        r5.c(r37.f79934e, 4);
        r5.c(r37.f79935f, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0198, code lost:
    
        if (r37.f79928H.length <= 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019a, code lost:
    
        r13 = r3.f68024g;
        r19 = r12[4];
        r20 = com.google.android.gms.internal.ads.C9185qa0.f77796a;
        r13 = r13.f65664o;
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
    
        r37.f79925E = r8;
        r37.f79922B += 5;
        r37.f79921A += r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cd, code lost:
    
        if (r37.f79924D != false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01db, code lost:
    
        if (java.util.Objects.equals(r2.f79649d.f68794a.f68024g.f65664o, "video/avc") == false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e5, code lost:
    
        if (com.google.android.gms.internal.ads.C9185qa0.i(r12[4]) == false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e7, code lost:
    
        r37.f79924D = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e9, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f5, code lost:
    
        throw com.google.android.gms.internal.ads.zzbc.a("Invalid NAL length", null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.ads.InterfaceC9236r0 r38, com.google.android.gms.internal.ads.N0 r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9991y3.b(com.google.android.gms.internal.ads.r0, com.google.android.gms.internal.ads.N0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return this.f79944o;
    }

    static {
        C9592uH0 c9592uH0 = new C9592uH0();
        c9592uH0.B("application/x-emsg");
        f79920K = c9592uH0.H();
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
        int i11 = C9349s3.f78120b;
        if ((iW & 1) != 0) {
            throw zzbc.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iW & 2) != 0;
        int iF = gq2.F();
        if (iF == 0) {
            Arrays.fill(m32.f68498l, 0, m32.f68491e, false);
            return;
        }
        int i12 = m32.f68491e;
        if (iF != i12) {
            throw zzbc.a("Senc sample count " + iF + " is different from fragment sample count" + i12, null);
        }
        Arrays.fill(m32.f68498l, 0, iF, z10);
        m32.a(gq2.r());
        GQ gq3 = m32.f68500n;
        gq2.h(gq3.n(), 0, gq3.u());
        m32.f68500n.l(0);
        m32.f68501o = false;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9991y3.j(long):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        int size = this.f79933d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C9884x3) this.f79933d.valueAt(i10)).i();
        }
        this.f79942m.clear();
        this.f79951v = 0;
        this.f79943n.c();
        this.f79952w = j11;
        this.f79941l.clear();
        h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        int i10;
        if ((this.f79931b & 32) == 0) {
            interfaceC9450t0 = new C9031p4(interfaceC9450t0, this.f79930a);
        }
        this.f79926F = interfaceC9450t0;
        h();
        X0[] x0Arr = new X0[2];
        this.f79927G = x0Arr;
        int i11 = 100;
        int i12 = 0;
        if ((this.f79931b & 4) != 0) {
            x0Arr[0] = this.f79926F.a(100, 5);
            i10 = 1;
            i11 = 101;
        } else {
            i10 = 0;
        }
        X0[] x0Arr2 = (X0[]) OV.n(this.f79927G, i10);
        this.f79927G = x0Arr2;
        for (X0 x02 : x0Arr2) {
            x02.d(f79920K);
        }
        this.f79928H = new X0[this.f79932c.size()];
        while (i12 < this.f79928H.length) {
            X0 x0A = this.f79926F.a(i11, 3);
            x0A.d((C) this.f79932c.get(i12));
            this.f79928H[i12] = x0A;
            i12++;
            i11++;
        }
    }

    final /* synthetic */ void e(long j10, GQ gq2) {
        C7635c0.a(j10, gq2, this.f79928H);
    }

    public C9991y3(InterfaceC8710m4 interfaceC8710m4, int i10, C8857nU c8857nU, K3 k32, List list, X0 x02) {
        this.f79930a = interfaceC8710m4;
        this.f79931b = i10;
        this.f79932c = Collections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.f79937h = bArr;
        this.f79938i = new GQ(bArr);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9991y3.g(java.util.List):com.google.android.gms.internal.ads.TE0");
    }

    private static final C9456t3 k(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (C9456t3) sparseArray.valueAt(0);
        }
        C9456t3 c9456t3 = (C9456t3) sparseArray.get(i10);
        c9456t3.getClass();
        return c9456t3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        AbstractC7917eh0 abstractC7917eh0T;
        U0 u0A = J3.a(interfaceC9236r0);
        if (u0A != null) {
            abstractC7917eh0T = AbstractC7917eh0.u(u0A);
        } else {
            abstractC7917eh0T = AbstractC7917eh0.t();
        }
        this.f79944o = abstractC7917eh0T;
        if (u0A == null) {
            return true;
        }
        return false;
    }
}
