package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.q5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9265q5 implements InterfaceC9692u5 {

    /* renamed from: w, reason: collision with root package name */
    private static final byte[] f78546w = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f78547a;

    /* renamed from: b, reason: collision with root package name */
    private final C8124fQ f78548b = new C8124fQ(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    private final GQ f78549c = new GQ(Arrays.copyOf(f78546w, 10));

    /* renamed from: d, reason: collision with root package name */
    private final String f78550d;

    /* renamed from: e, reason: collision with root package name */
    private final int f78551e;

    /* renamed from: f, reason: collision with root package name */
    private String f78552f;

    /* renamed from: g, reason: collision with root package name */
    private X0 f78553g;

    /* renamed from: h, reason: collision with root package name */
    private X0 f78554h;

    /* renamed from: i, reason: collision with root package name */
    private int f78555i;

    /* renamed from: j, reason: collision with root package name */
    private int f78556j;

    /* renamed from: k, reason: collision with root package name */
    private int f78557k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f78558l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f78559m;

    /* renamed from: n, reason: collision with root package name */
    private int f78560n;

    /* renamed from: o, reason: collision with root package name */
    private int f78561o;

    /* renamed from: p, reason: collision with root package name */
    private int f78562p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f78563q;

    /* renamed from: r, reason: collision with root package name */
    private long f78564r;

    /* renamed from: s, reason: collision with root package name */
    private int f78565s;

    /* renamed from: t, reason: collision with root package name */
    private long f78566t;

    /* renamed from: u, reason: collision with root package name */
    private X0 f78567u;

    /* renamed from: v, reason: collision with root package name */
    private long f78568v;

    public static boolean d(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void e() {
        this.f78559m = false;
        f();
    }

    private final void f() {
        this.f78555i = 0;
        this.f78556j = 0;
        this.f78557k = 256;
    }

    private final void g() {
        this.f78555i = 3;
        this.f78556j = 0;
    }

    private final void h(X0 x02, long j10, int i10, int i11) {
        this.f78555i = 4;
        this.f78556j = i10;
        this.f78567u = x02;
        this.f78568v = j10;
        this.f78565s = i11;
    }

    private static final boolean j(byte b10, byte b11) {
        return d((b11 & 255) | 65280);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void b(long j10, int i10) {
        this.f78566t = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zzc(boolean z10) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x026d, code lost:
    
        r18.f78558l = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0271, code lost:
    
        if (r18.f78559m != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0273, code lost:
    
        r18.f78555i = 1;
        r18.f78556j = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0279, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x027c, code lost:
    
        r19.l(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x025f, code lost:
    
        r18.f78562p = (r14 & 8) >> 3;
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
    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.GQ r19) throws com.google.android.gms.internal.ads.zzbc {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9265q5.a(com.google.android.gms.internal.ads.GQ):void");
    }

    public C9265q5(boolean z10, String str, int i10) {
        f();
        this.f78560n = -1;
        this.f78561o = -1;
        this.f78564r = -9223372036854775807L;
        this.f78566t = -9223372036854775807L;
        this.f78547a = z10;
        this.f78550d = str;
        this.f78551e = i10;
    }

    private final boolean i(GQ gq2, byte[] bArr, int i10) {
        int iMin = Math.min(gq2.r(), i10 - this.f78556j);
        gq2.h(bArr, this.f78556j, iMin);
        int i11 = this.f78556j + iMin;
        this.f78556j = i11;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void c(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        c8518j6.c();
        this.f78552f = c8518j6.b();
        X0 x0A = interfaceC9575t0.a(c8518j6.a(), 1);
        this.f78553g = x0A;
        this.f78567u = x0A;
        if (this.f78547a) {
            c8518j6.c();
            X0 x0A2 = interfaceC9575t0.a(c8518j6.a(), 5);
            this.f78554h = x0A2;
            C9717uH0 c9717uH0 = new C9717uH0();
            c9717uH0.m(c8518j6.b());
            c9717uH0.B("application/id3");
            x0A2.d(c9717uH0.H());
            return;
        }
        this.f78554h = new C8720l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zze() {
        this.f78566t = -9223372036854775807L;
        e();
    }
}
