package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.q5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9140q5 implements InterfaceC9567u5 {

    /* renamed from: w, reason: collision with root package name */
    private static final byte[] f77706w = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f77707a;

    /* renamed from: b, reason: collision with root package name */
    private final C7999fQ f77708b = new C7999fQ(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    private final GQ f77709c = new GQ(Arrays.copyOf(f77706w, 10));

    /* renamed from: d, reason: collision with root package name */
    private final String f77710d;

    /* renamed from: e, reason: collision with root package name */
    private final int f77711e;

    /* renamed from: f, reason: collision with root package name */
    private String f77712f;

    /* renamed from: g, reason: collision with root package name */
    private X0 f77713g;

    /* renamed from: h, reason: collision with root package name */
    private X0 f77714h;

    /* renamed from: i, reason: collision with root package name */
    private int f77715i;

    /* renamed from: j, reason: collision with root package name */
    private int f77716j;

    /* renamed from: k, reason: collision with root package name */
    private int f77717k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f77718l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f77719m;

    /* renamed from: n, reason: collision with root package name */
    private int f77720n;

    /* renamed from: o, reason: collision with root package name */
    private int f77721o;

    /* renamed from: p, reason: collision with root package name */
    private int f77722p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f77723q;

    /* renamed from: r, reason: collision with root package name */
    private long f77724r;

    /* renamed from: s, reason: collision with root package name */
    private int f77725s;

    /* renamed from: t, reason: collision with root package name */
    private long f77726t;

    /* renamed from: u, reason: collision with root package name */
    private X0 f77727u;

    /* renamed from: v, reason: collision with root package name */
    private long f77728v;

    public static boolean d(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void e() {
        this.f77719m = false;
        f();
    }

    private final void f() {
        this.f77715i = 0;
        this.f77716j = 0;
        this.f77717k = 256;
    }

    private final void g() {
        this.f77715i = 3;
        this.f77716j = 0;
    }

    private final void h(X0 x02, long j10, int i10, int i11) {
        this.f77715i = 4;
        this.f77716j = i10;
        this.f77727u = x02;
        this.f77728v = j10;
        this.f77725s = i11;
    }

    private static final boolean j(byte b10, byte b11) {
        return d((b11 & 255) | 65280);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void b(long j10, int i10) {
        this.f77726t = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zzc(boolean z10) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x026d, code lost:
    
        r18.f77718l = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0271, code lost:
    
        if (r18.f77719m != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0273, code lost:
    
        r18.f77715i = 1;
        r18.f77716j = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0279, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x027c, code lost:
    
        r19.l(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x025f, code lost:
    
        r18.f77722p = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0268, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026a, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x026c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025f A[EDGE_INSN: B:144:0x025f->B:96:0x025f BREAK  A[LOOP:1: B:48:0x01a6->B:170:0x01a6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0215  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.GQ r19) throws com.google.android.gms.internal.ads.zzbc {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9140q5.a(com.google.android.gms.internal.ads.GQ):void");
    }

    public C9140q5(boolean z10, String str, int i10) {
        f();
        this.f77720n = -1;
        this.f77721o = -1;
        this.f77724r = -9223372036854775807L;
        this.f77726t = -9223372036854775807L;
        this.f77707a = z10;
        this.f77710d = str;
        this.f77711e = i10;
    }

    private final boolean i(GQ gq2, byte[] bArr, int i10) {
        int iMin = Math.min(gq2.r(), i10 - this.f77716j);
        gq2.h(bArr, this.f77716j, iMin);
        int i11 = this.f77716j + iMin;
        this.f77716j = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private static final boolean k(GQ gq2, byte[] bArr, int i10) {
        if (gq2.r() < i10) {
            return false;
        }
        gq2.h(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void c(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        c8393j6.c();
        this.f77712f = c8393j6.b();
        X0 x0A = interfaceC9450t0.a(c8393j6.a(), 1);
        this.f77713g = x0A;
        this.f77727u = x0A;
        if (this.f77707a) {
            c8393j6.c();
            X0 x0A2 = interfaceC9450t0.a(c8393j6.a(), 5);
            this.f77714h = x0A2;
            C9592uH0 c9592uH0 = new C9592uH0();
            c9592uH0.m(c8393j6.b());
            c9592uH0.B("application/id3");
            x0A2.d(c9592uH0.H());
            return;
        }
        this.f77714h = new C8595l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zze() {
        this.f77726t = -9223372036854775807L;
        e();
    }
}
