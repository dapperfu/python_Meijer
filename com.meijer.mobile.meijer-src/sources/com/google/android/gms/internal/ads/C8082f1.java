package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.f1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8082f1 implements InterfaceC9255q0 {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f74836p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f74837q = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f74838r;

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f74839s;

    /* renamed from: b, reason: collision with root package name */
    private final X0 f74841b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f74842c;

    /* renamed from: d, reason: collision with root package name */
    private long f74843d;

    /* renamed from: e, reason: collision with root package name */
    private int f74844e;

    /* renamed from: f, reason: collision with root package name */
    private int f74845f;

    /* renamed from: h, reason: collision with root package name */
    private int f74847h;

    /* renamed from: i, reason: collision with root package name */
    private long f74848i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC9575t0 f74849j;

    /* renamed from: k, reason: collision with root package name */
    private X0 f74850k;

    /* renamed from: l, reason: collision with root package name */
    private X0 f74851l;

    /* renamed from: m, reason: collision with root package name */
    private Q0 f74852m;

    /* renamed from: n, reason: collision with root package name */
    private long f74853n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f74854o;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f74840a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    private int f74846g = -1;

    public C8082f1(int i10) {
        C8720l0 c8720l0 = new C8720l0();
        this.f74841b = c8720l0;
        this.f74851l = c8720l0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        this.f74843d = 0L;
        this.f74844e = 0;
        this.f74845f = 0;
        this.f74853n = j11;
        this.f74848i = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    static {
        int i10 = OV.f69931a;
        Charset charset = StandardCharsets.UTF_8;
        f74838r = "#!AMR\n".getBytes(charset);
        f74839s = "#!AMR-WB\n".getBytes(charset);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: EOFException -> 0x008d, TryCatch #0 {EOFException -> 0x008d, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x0036, B:22:0x003f, B:21:0x003b, B:31:0x0059, B:32:0x0076, B:33:0x0077, B:34:0x008c), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[Catch: EOFException -> 0x008d, TryCatch #0 {EOFException -> 0x008d, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x0036, B:22:0x003f, B:21:0x003b, B:31:0x0059, B:32:0x0076, B:33:0x0077, B:34:0x008c), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int e(com.google.android.gms.internal.ads.InterfaceC9361r0 r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f74845f
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L8e
            r12.zzj()     // Catch: java.io.EOFException -> L8d
            byte[] r0 = r11.f74840a     // Catch: java.io.EOFException -> L8d
            r12.g(r0, r3, r2)     // Catch: java.io.EOFException -> L8d
            byte[] r0 = r11.f74840a     // Catch: java.io.EOFException -> L8d
            r0 = r0[r3]     // Catch: java.io.EOFException -> L8d
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L77
            int r0 = r0 >> 3
            boolean r4 = r11.f74842c     // Catch: java.io.EOFException -> L8d
            r0 = r0 & 15
            if (r4 == 0) goto L29
            r6 = 10
            if (r0 < r6) goto L34
            r6 = 13
            if (r0 <= r6) goto L29
            goto L34
        L29:
            if (r4 != 0) goto L52
            r6 = 12
            if (r0 < r6) goto L34
            r6 = 14
            if (r0 > r6) goto L34
            goto L52
        L34:
            if (r4 == 0) goto L3b
            int[] r4 = com.google.android.gms.internal.ads.C8082f1.f74837q     // Catch: java.io.EOFException -> L8d
            r0 = r4[r0]     // Catch: java.io.EOFException -> L8d
            goto L3f
        L3b:
            int[] r4 = com.google.android.gms.internal.ads.C8082f1.f74836p     // Catch: java.io.EOFException -> L8d
            r0 = r4[r0]     // Catch: java.io.EOFException -> L8d
        L3f:
            r11.f74844e = r0     // Catch: java.io.EOFException -> L8d
            r11.f74845f = r0
            int r4 = r11.f74846g
            if (r4 != r1) goto L4a
            r11.f74846g = r0
            r4 = r0
        L4a:
            if (r4 != r0) goto L8e
            int r4 = r11.f74847h
            int r4 = r4 + r2
            r11.f74847h = r4
            goto L8e
        L52:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L59
            r12 = r3
        L59:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L8d
            r2.<init>()     // Catch: java.io.EOFException -> L8d
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch: java.io.EOFException -> L8d
            r2.append(r12)     // Catch: java.io.EOFException -> L8d
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch: java.io.EOFException -> L8d
            r2.append(r0)     // Catch: java.io.EOFException -> L8d
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> L8d
            com.google.android.gms.internal.ads.zzbc r12 = com.google.android.gms.internal.ads.zzbc.a(r12, r5)     // Catch: java.io.EOFException -> L8d
            throw r12     // Catch: java.io.EOFException -> L8d
        L77:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L8d
            r12.<init>()     // Catch: java.io.EOFException -> L8d
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch: java.io.EOFException -> L8d
            r12.append(r0)     // Catch: java.io.EOFException -> L8d
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> L8d
            com.google.android.gms.internal.ads.zzbc r12 = com.google.android.gms.internal.ads.zzbc.a(r12, r5)     // Catch: java.io.EOFException -> L8d
            throw r12     // Catch: java.io.EOFException -> L8d
        L8d:
            return r1
        L8e:
            com.google.android.gms.internal.ads.X0 r4 = r11.f74851l
            int r12 = r4.b(r12, r0, r2)
            if (r12 != r1) goto L97
            return r1
        L97:
            int r0 = r11.f74845f
            int r0 = r0 - r12
            r11.f74845f = r0
            if (r0 <= 0) goto L9f
            return r3
        L9f:
            com.google.android.gms.internal.ads.X0 r4 = r11.f74851l
            long r5 = r11.f74843d
            int r8 = r11.f74844e
            r9 = 0
            r10 = 0
            r7 = 1
            r4.a(r5, r7, r8, r9, r10)
            long r0 = r11.f74843d
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f74843d = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8082f1.e(com.google.android.gms.internal.ads.r0):int");
    }

    private final boolean g(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        byte[] bArr = f74838r;
        if (f(interfaceC9361r0, bArr)) {
            this.f74842c = false;
            interfaceC9361r0.e(bArr.length);
            return true;
        }
        byte[] bArr2 = f74839s;
        if (!f(interfaceC9361r0, bArr2)) {
            return false;
        }
        this.f74842c = true;
        interfaceC9361r0.e(bArr2.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final int b(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        C8211gC.b(this.f74850k);
        int i10 = OV.f69931a;
        if (interfaceC9361r0.zzf() == 0 && !g(interfaceC9361r0)) {
            throw zzbc.a("Could not find AMR header.", null);
        }
        if (!this.f74854o) {
            this.f74854o = true;
            boolean z10 = this.f74842c;
            String str = true != z10 ? "audio/3gpp" : "audio/amr-wb";
            int i11 = true != z10 ? 8000 : 16000;
            int i12 = z10 ? f74837q[8] : f74836p[7];
            X0 x02 = this.f74851l;
            C9717uH0 c9717uH0 = new C9717uH0();
            c9717uH0.B(str);
            c9717uH0.r(i12);
            c9717uH0.r0(1);
            c9717uH0.C(i11);
            x02.d(c9717uH0.H());
        }
        int iE = e(interfaceC9361r0);
        if (this.f74852m == null) {
            P0 p02 = new P0(-9223372036854775807L, 0L);
            this.f74852m = p02;
            this.f74849j.m(p02);
        }
        return iE == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f74849j = interfaceC9575t0;
        X0 x0A = interfaceC9575t0.a(0, 1);
        this.f74850k = x0A;
        this.f74851l = x0A;
        interfaceC9575t0.e();
    }

    private static boolean f(InterfaceC9361r0 interfaceC9361r0, byte[] bArr) throws IOException {
        interfaceC9361r0.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        interfaceC9361r0.g(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        return g(interfaceC9361r0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
