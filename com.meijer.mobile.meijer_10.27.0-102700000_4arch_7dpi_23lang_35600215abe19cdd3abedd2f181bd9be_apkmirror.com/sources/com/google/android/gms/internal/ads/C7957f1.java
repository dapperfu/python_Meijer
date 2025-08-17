package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.f1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7957f1 implements InterfaceC9130q0 {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f73996p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f73997q = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f73998r;

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f73999s;

    /* renamed from: b, reason: collision with root package name */
    private final X0 f74001b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f74002c;

    /* renamed from: d, reason: collision with root package name */
    private long f74003d;

    /* renamed from: e, reason: collision with root package name */
    private int f74004e;

    /* renamed from: f, reason: collision with root package name */
    private int f74005f;

    /* renamed from: h, reason: collision with root package name */
    private int f74007h;

    /* renamed from: i, reason: collision with root package name */
    private long f74008i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC9450t0 f74009j;

    /* renamed from: k, reason: collision with root package name */
    private X0 f74010k;

    /* renamed from: l, reason: collision with root package name */
    private X0 f74011l;

    /* renamed from: m, reason: collision with root package name */
    private Q0 f74012m;

    /* renamed from: n, reason: collision with root package name */
    private long f74013n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f74014o;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f74000a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    private int f74006g = -1;

    public C7957f1(int i10) {
        C8595l0 c8595l0 = new C8595l0();
        this.f74001b = c8595l0;
        this.f74011l = c8595l0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        this.f74003d = 0L;
        this.f74004e = 0;
        this.f74005f = 0;
        this.f74013n = j11;
        this.f74008i = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    static {
        int i10 = OV.f69091a;
        Charset charset = StandardCharsets.UTF_8;
        f73998r = "#!AMR\n".getBytes(charset);
        f73999s = "#!AMR-WB\n".getBytes(charset);
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
    private final int e(com.google.android.gms.internal.ads.InterfaceC9236r0 r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f74005f
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L8e
            r12.zzj()     // Catch: java.io.EOFException -> L8d
            byte[] r0 = r11.f74000a     // Catch: java.io.EOFException -> L8d
            r12.g(r0, r3, r2)     // Catch: java.io.EOFException -> L8d
            byte[] r0 = r11.f74000a     // Catch: java.io.EOFException -> L8d
            r0 = r0[r3]     // Catch: java.io.EOFException -> L8d
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L77
            int r0 = r0 >> 3
            boolean r4 = r11.f74002c     // Catch: java.io.EOFException -> L8d
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
            int[] r4 = com.google.android.gms.internal.ads.C7957f1.f73997q     // Catch: java.io.EOFException -> L8d
            r0 = r4[r0]     // Catch: java.io.EOFException -> L8d
            goto L3f
        L3b:
            int[] r4 = com.google.android.gms.internal.ads.C7957f1.f73996p     // Catch: java.io.EOFException -> L8d
            r0 = r4[r0]     // Catch: java.io.EOFException -> L8d
        L3f:
            r11.f74004e = r0     // Catch: java.io.EOFException -> L8d
            r11.f74005f = r0
            int r4 = r11.f74006g
            if (r4 != r1) goto L4a
            r11.f74006g = r0
            r4 = r0
        L4a:
            if (r4 != r0) goto L8e
            int r4 = r11.f74007h
            int r4 = r4 + r2
            r11.f74007h = r4
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
            com.google.android.gms.internal.ads.X0 r4 = r11.f74011l
            int r12 = r4.b(r12, r0, r2)
            if (r12 != r1) goto L97
            return r1
        L97:
            int r0 = r11.f74005f
            int r0 = r0 - r12
            r11.f74005f = r0
            if (r0 <= 0) goto L9f
            return r3
        L9f:
            com.google.android.gms.internal.ads.X0 r4 = r11.f74011l
            long r5 = r11.f74003d
            int r8 = r11.f74004e
            r9 = 0
            r10 = 0
            r7 = 1
            r4.a(r5, r7, r8, r9, r10)
            long r0 = r11.f74003d
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f74003d = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7957f1.e(com.google.android.gms.internal.ads.r0):int");
    }

    private final boolean g(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        byte[] bArr = f73998r;
        if (f(interfaceC9236r0, bArr)) {
            this.f74002c = false;
            interfaceC9236r0.e(bArr.length);
            return true;
        }
        byte[] bArr2 = f73999s;
        if (!f(interfaceC9236r0, bArr2)) {
            return false;
        }
        this.f74002c = true;
        interfaceC9236r0.e(bArr2.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final int b(InterfaceC9236r0 interfaceC9236r0, N0 n02) throws IOException {
        C8086gC.b(this.f74010k);
        int i10 = OV.f69091a;
        if (interfaceC9236r0.zzf() == 0 && !g(interfaceC9236r0)) {
            throw zzbc.a("Could not find AMR header.", null);
        }
        if (!this.f74014o) {
            this.f74014o = true;
            boolean z10 = this.f74002c;
            String str = true != z10 ? "audio/3gpp" : "audio/amr-wb";
            int i11 = true != z10 ? 8000 : 16000;
            int i12 = z10 ? f73997q[8] : f73996p[7];
            X0 x02 = this.f74011l;
            C9592uH0 c9592uH0 = new C9592uH0();
            c9592uH0.B(str);
            c9592uH0.r(i12);
            c9592uH0.r0(1);
            c9592uH0.C(i11);
            x02.d(c9592uH0.H());
        }
        int iE = e(interfaceC9236r0);
        if (this.f74012m == null) {
            P0 p02 = new P0(-9223372036854775807L, 0L);
            this.f74012m = p02;
            this.f74009j.m(p02);
        }
        return iE == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f74009j = interfaceC9450t0;
        X0 x0A = interfaceC9450t0.a(0, 1);
        this.f74010k = x0A;
        this.f74011l = x0A;
        interfaceC9450t0.e();
    }

    private static boolean f(InterfaceC9236r0 interfaceC9236r0, byte[] bArr) throws IOException {
        interfaceC9236r0.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        interfaceC9236r0.g(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        return g(interfaceC9236r0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
