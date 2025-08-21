package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class T2 implements InterfaceC9255q0 {

    /* renamed from: e0, reason: collision with root package name */
    private static final byte[] f71058e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: f0, reason: collision with root package name */
    private static final byte[] f71059f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final byte[] f71060g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final byte[] f71061h0;

    /* renamed from: i0, reason: collision with root package name */
    private static final UUID f71062i0;

    /* renamed from: j0, reason: collision with root package name */
    private static final Map f71063j0;

    /* renamed from: A, reason: collision with root package name */
    private long f71064A;

    /* renamed from: B, reason: collision with root package name */
    private long f71065B;

    /* renamed from: C, reason: collision with root package name */
    private long f71066C;

    /* renamed from: D, reason: collision with root package name */
    private XL f71067D;

    /* renamed from: E, reason: collision with root package name */
    private XL f71068E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f71069F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f71070G;

    /* renamed from: H, reason: collision with root package name */
    private int f71071H;

    /* renamed from: I, reason: collision with root package name */
    private long f71072I;

    /* renamed from: J, reason: collision with root package name */
    private long f71073J;

    /* renamed from: K, reason: collision with root package name */
    private int f71074K;

    /* renamed from: L, reason: collision with root package name */
    private int f71075L;

    /* renamed from: M, reason: collision with root package name */
    private int[] f71076M;

    /* renamed from: N, reason: collision with root package name */
    private int f71077N;

    /* renamed from: O, reason: collision with root package name */
    private int f71078O;

    /* renamed from: P, reason: collision with root package name */
    private int f71079P;

    /* renamed from: Q, reason: collision with root package name */
    private int f71080Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f71081R;

    /* renamed from: S, reason: collision with root package name */
    private long f71082S;

    /* renamed from: T, reason: collision with root package name */
    private int f71083T;

    /* renamed from: U, reason: collision with root package name */
    private int f71084U;

    /* renamed from: V, reason: collision with root package name */
    private int f71085V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f71086W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f71087X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f71088Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f71089Z;

    /* renamed from: a, reason: collision with root package name */
    private final V2 f71090a;

    /* renamed from: a0, reason: collision with root package name */
    private byte f71091a0;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f71092b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f71093b0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f71094c;

    /* renamed from: c0, reason: collision with root package name */
    private InterfaceC9575t0 f71095c0;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f71096d;

    /* renamed from: d0, reason: collision with root package name */
    private final O2 f71097d0;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8835m4 f71098e;

    /* renamed from: f, reason: collision with root package name */
    private final GQ f71099f;

    /* renamed from: g, reason: collision with root package name */
    private final GQ f71100g;

    /* renamed from: h, reason: collision with root package name */
    private final GQ f71101h;

    /* renamed from: i, reason: collision with root package name */
    private final GQ f71102i;

    /* renamed from: j, reason: collision with root package name */
    private final GQ f71103j;

    /* renamed from: k, reason: collision with root package name */
    private final GQ f71104k;

    /* renamed from: l, reason: collision with root package name */
    private final GQ f71105l;

    /* renamed from: m, reason: collision with root package name */
    private final GQ f71106m;

    /* renamed from: n, reason: collision with root package name */
    private final GQ f71107n;

    /* renamed from: o, reason: collision with root package name */
    private final GQ f71108o;

    /* renamed from: p, reason: collision with root package name */
    private ByteBuffer f71109p;

    /* renamed from: q, reason: collision with root package name */
    private long f71110q;

    /* renamed from: r, reason: collision with root package name */
    private long f71111r;

    /* renamed from: s, reason: collision with root package name */
    private long f71112s;

    /* renamed from: t, reason: collision with root package name */
    private long f71113t;

    /* renamed from: u, reason: collision with root package name */
    private long f71114u;

    /* renamed from: v, reason: collision with root package name */
    private R2 f71115v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f71116w;

    /* renamed from: x, reason: collision with root package name */
    private int f71117x;

    /* renamed from: y, reason: collision with root package name */
    private long f71118y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f71119z;

    @Deprecated
    public T2() {
        this(new O2(), 2, InterfaceC8835m4.f77550a);
    }

    private final void u() {
        this.f71083T = 0;
        this.f71084U = 0;
        this.f71085V = 0;
        this.f71086W = false;
        this.f71087X = false;
        this.f71088Y = false;
        this.f71089Z = 0;
        this.f71091a0 = (byte) 0;
        this.f71093b0 = false;
        this.f71104k.i(0);
    }

    private final void v(InterfaceC9361r0 interfaceC9361r0, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = length + i10;
        if (this.f71105l.s() < i11) {
            GQ gq2 = this.f71105l;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            gq2.j(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f71105l.n(), 0, length);
        }
        interfaceC9361r0.zzi(this.f71105l.n(), length, i10);
        this.f71105l.l(0);
        this.f71105l.k(i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final int b(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        this.f71070G = false;
        while (!this.f71070G) {
            if (!this.f71097d0.c(interfaceC9361r0)) {
                for (int i10 = 0; i10 < this.f71092b.size(); i10++) {
                    R2 r22 = (R2) this.f71092b.valueAt(i10);
                    r22.f70575Y.getClass();
                    Y0 y02 = r22.f70571U;
                    if (y02 != null) {
                        y02.a(r22.f70575Y, r22.f70586j);
                    }
                }
                return -1;
            }
            long jZzf = interfaceC9361r0.zzf();
            if (this.f71119z) {
                this.f71065B = jZzf;
                n02.f69630a = this.f71064A;
                this.f71119z = false;
                return 1;
            }
            if (this.f71116w) {
                long j10 = this.f71065B;
                if (j10 != -1) {
                    n02.f69630a = j10;
                    this.f71065B = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    static {
        int i10 = OV.f69931a;
        f71059f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f71060g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f71061h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f71062i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f71063j0 = Collections.unmodifiableMap(map);
    }

    T2(O2 o22, int i10, InterfaceC8835m4 interfaceC8835m4) {
        this.f71111r = -1L;
        this.f71112s = -9223372036854775807L;
        this.f71113t = -9223372036854775807L;
        this.f71114u = -9223372036854775807L;
        this.f71064A = -1L;
        this.f71065B = -1L;
        this.f71066C = -9223372036854775807L;
        this.f71097d0 = o22;
        o22.a(new Q2(this, null));
        this.f71098e = interfaceC8835m4;
        this.f71094c = 1 == ((i10 & 1) ^ 1);
        this.f71096d = (i10 & 2) == 0;
        this.f71090a = new V2();
        this.f71092b = new SparseArray();
        this.f71101h = new GQ(4);
        this.f71102i = new GQ(ByteBuffer.allocate(4).putInt(-1).array());
        this.f71103j = new GQ(4);
        this.f71099f = new GQ(C9310qa0.f78636a);
        this.f71100g = new GQ(4);
        this.f71104k = new GQ();
        this.f71105l = new GQ();
        this.f71106m = new GQ(8);
        this.f71107n = new GQ();
        this.f71108o = new GQ();
        this.f71076M = new int[1];
    }

    private final int n(InterfaceC9361r0 interfaceC9361r0, R2 r22, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(r22.f70578b)) {
            v(interfaceC9361r0, f71058e0, i10);
            int i12 = this.f71084U;
            u();
            return i12;
        }
        if ("S_TEXT/ASS".equals(r22.f70578b)) {
            v(interfaceC9361r0, f71060g0, i10);
            int i13 = this.f71084U;
            u();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(r22.f70578b)) {
            v(interfaceC9361r0, f71061h0, i10);
            int i14 = this.f71084U;
            u();
            return i14;
        }
        X0 x02 = r22.f70575Y;
        if (!this.f71086W) {
            if (r22.f70584h) {
                this.f71079P &= -1073741825;
                if (!this.f71087X) {
                    interfaceC9361r0.zzi(this.f71101h.n(), 0, 1);
                    this.f71083T++;
                    if ((this.f71101h.n()[0] & 128) == 128) {
                        throw zzbc.a("Extension bit is set in signal byte", null);
                    }
                    this.f71091a0 = this.f71101h.n()[0];
                    this.f71087X = true;
                }
                byte b10 = this.f71091a0;
                if ((b10 & 1) == 1) {
                    int i15 = b10 & 2;
                    this.f71079P |= 1073741824;
                    if (!this.f71093b0) {
                        interfaceC9361r0.zzi(this.f71106m.n(), 0, 8);
                        this.f71083T += 8;
                        this.f71093b0 = true;
                        this.f71101h.n()[0] = (byte) ((i15 != 2 ? 0 : 128) | 8);
                        this.f71101h.l(0);
                        x02.g(this.f71101h, 1, 1);
                        this.f71084U++;
                        this.f71106m.l(0);
                        x02.g(this.f71106m, 8, 1);
                        this.f71084U += 8;
                    }
                    if (i15 == 2) {
                        if (!this.f71088Y) {
                            interfaceC9361r0.zzi(this.f71101h.n(), 0, 1);
                            this.f71083T++;
                            this.f71101h.l(0);
                            this.f71089Z = this.f71101h.C();
                            this.f71088Y = true;
                        }
                        int i16 = this.f71089Z * 4;
                        this.f71101h.i(i16);
                        interfaceC9361r0.zzi(this.f71101h.n(), 0, i16);
                        this.f71083T += i16;
                        int i17 = (this.f71089Z >> 1) + 1;
                        int i18 = (i17 * 6) + 2;
                        ByteBuffer byteBuffer = this.f71109p;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.f71109p = ByteBuffer.allocate(i18);
                        }
                        this.f71109p.position(0);
                        this.f71109p.putShort((short) i17);
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            i11 = this.f71089Z;
                            if (i19 >= i11) {
                                break;
                            }
                            int iF = this.f71101h.F();
                            int i21 = iF - i20;
                            if (i19 % 2 == 0) {
                                this.f71109p.putShort((short) i21);
                            } else {
                                this.f71109p.putInt(i21);
                            }
                            i19++;
                            i20 = iF;
                        }
                        int i22 = (i10 - this.f71083T) - i20;
                        if ((i11 & 1) == 1) {
                            this.f71109p.putInt(i22);
                        } else {
                            this.f71109p.putShort((short) i22);
                            this.f71109p.putInt(0);
                        }
                        this.f71107n.j(this.f71109p.array(), i18);
                        x02.g(this.f71107n, i18, 1);
                        this.f71084U += i18;
                    }
                }
            } else {
                byte[] bArr = r22.f70585i;
                if (bArr != null) {
                    this.f71104k.j(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(r22.f70578b) ? r22.f70582f > 0 : z10) {
                this.f71079P |= 268435456;
                this.f71108o.i(0);
                int iU = (this.f71104k.u() + i10) - this.f71083T;
                this.f71101h.i(4);
                this.f71101h.n()[0] = (byte) ((iU >> 24) & com.medallia.digital.mobilesdk.l3.f93323c);
                this.f71101h.n()[1] = (byte) ((iU >> 16) & com.medallia.digital.mobilesdk.l3.f93323c);
                this.f71101h.n()[2] = (byte) ((iU >> 8) & com.medallia.digital.mobilesdk.l3.f93323c);
                this.f71101h.n()[3] = (byte) (iU & com.medallia.digital.mobilesdk.l3.f93323c);
                x02.g(this.f71101h, 4, 2);
                this.f71084U += 4;
            }
            this.f71086W = true;
        }
        int iU2 = i10 + this.f71104k.u();
        if (!"V_MPEG4/ISO/AVC".equals(r22.f70578b) && !"V_MPEGH/ISO/HEVC".equals(r22.f70578b)) {
            if (r22.f70571U != null) {
                C8211gC.f(this.f71104k.u() == 0);
                r22.f70571U.d(interfaceC9361r0);
            }
            while (true) {
                int i23 = this.f71083T;
                if (i23 >= iU2) {
                    break;
                }
                int iO = o(interfaceC9361r0, x02, iU2 - i23);
                this.f71083T += iO;
                this.f71084U += iO;
            }
        } else {
            byte[] bArrN = this.f71100g.n();
            bArrN[0] = 0;
            bArrN[1] = 0;
            bArrN[2] = 0;
            int i24 = r22.f70576Z;
            int i25 = 4 - i24;
            while (this.f71083T < iU2) {
                int i26 = this.f71085V;
                if (i26 == 0) {
                    int iMin = Math.min(i24, this.f71104k.r());
                    interfaceC9361r0.zzi(bArrN, i25 + iMin, i24 - iMin);
                    if (iMin > 0) {
                        this.f71104k.h(bArrN, i25, iMin);
                    }
                    this.f71083T += i24;
                    this.f71100g.l(0);
                    this.f71085V = this.f71100g.F();
                    this.f71099f.l(0);
                    x02.c(this.f71099f, 4);
                    this.f71084U += 4;
                } else {
                    int iO2 = o(interfaceC9361r0, x02, i26);
                    this.f71083T += iO2;
                    this.f71084U += iO2;
                    this.f71085V -= iO2;
                }
            }
        }
        if ("A_VORBIS".equals(r22.f70578b)) {
            this.f71102i.l(0);
            x02.c(this.f71102i, 4);
            this.f71084U += 4;
        }
        int i27 = this.f71084U;
        u();
        return i27;
    }

    private final int o(InterfaceC9361r0 interfaceC9361r0, X0 x02, int i10) throws IOException {
        int iR = this.f71104k.r();
        if (iR <= 0) {
            return x02.b(interfaceC9361r0, i10, false);
        }
        int iMin = Math.min(i10, iR);
        x02.c(this.f71104k, iMin);
        return iMin;
    }

    private final long p(long j10) throws zzbc {
        long j11 = this.f71112s;
        if (j11 != -9223372036854775807L) {
            return OV.M(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw zzbc.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void q(int i10) throws zzbc {
        if (this.f71067D == null || this.f71068E == null) {
            throw zzbc.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private final void r(int i10) throws zzbc {
        if (this.f71115v != null) {
            return;
        }
        throw zzbc.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:51:0x00e0 BREAK  A[LOOP:0: B:45:0x00c5->B:50:0x00dd], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s(com.google.android.gms.internal.ads.R2 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.T2.s(com.google.android.gms.internal.ads.R2, long, int, int, int):void");
    }

    private final void t(InterfaceC9361r0 interfaceC9361r0, int i10) throws IOException {
        if (this.f71101h.u() >= i10) {
            return;
        }
        if (this.f71101h.s() < i10) {
            GQ gq2 = this.f71101h;
            int iS = gq2.s();
            gq2.f(Math.max(iS + iS, i10));
        }
        GQ gq3 = this.f71101h;
        interfaceC9361r0.zzi(gq3.n(), gq3.u(), i10 - gq3.u());
        this.f71101h.k(i10);
    }

    private static int[] x(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        return new U2().a(interfaceC9361r0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        if (this.f71096d) {
            interfaceC9575t0 = new C9156p4(interfaceC9575t0, this.f71098e);
        }
        this.f71095c0 = interfaceC9575t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void g(int i10, int i11, InterfaceC9361r0 interfaceC9361r0) throws IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = i10;
        int i22 = 1;
        int i23 = 0;
        if (i21 != 161 && i21 != 163) {
            if (i21 == 165) {
                if (this.f71071H != 2) {
                    return;
                }
                R2 r22 = (R2) this.f71092b.get(this.f71077N);
                if (this.f71080Q != 4 || !"V_VP9".equals(r22.f70578b)) {
                    interfaceC9361r0.e(i11);
                    return;
                } else {
                    this.f71108o.i(i11);
                    interfaceC9361r0.zzi(this.f71108o.n(), 0, i11);
                    return;
                }
            }
            if (i21 == 16877) {
                r(i10);
                R2 r23 = this.f71115v;
                if (r23.f70583g != 1685485123 && r23.f70583g != 1685480259) {
                    interfaceC9361r0.e(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                r23.f70565O = bArr;
                interfaceC9361r0.zzi(bArr, 0, i11);
                return;
            }
            if (i21 == 16981) {
                r(i10);
                byte[] bArr2 = new byte[i11];
                this.f71115v.f70585i = bArr2;
                interfaceC9361r0.zzi(bArr2, 0, i11);
                return;
            }
            if (i21 == 18402) {
                byte[] bArr3 = new byte[i11];
                interfaceC9361r0.zzi(bArr3, 0, i11);
                r(i10);
                this.f71115v.f70586j = new W0(1, bArr3, 0, 0);
                return;
            }
            if (i21 == 21419) {
                Arrays.fill(this.f71103j.n(), (byte) 0);
                interfaceC9361r0.zzi(this.f71103j.n(), 4 - i11, i11);
                this.f71103j.l(0);
                this.f71117x = (int) this.f71103j.K();
                return;
            }
            if (i21 == 25506) {
                r(i10);
                byte[] bArr4 = new byte[i11];
                this.f71115v.f70587k = bArr4;
                interfaceC9361r0.zzi(bArr4, 0, i11);
                return;
            }
            if (i21 != 30322) {
                throw zzbc.a("Unexpected id: " + i21, null);
            }
            r(i10);
            byte[] bArr5 = new byte[i11];
            this.f71115v.f70599w = bArr5;
            interfaceC9361r0.zzi(bArr5, 0, i11);
            return;
        }
        int i24 = 8;
        if (this.f71071H == 0) {
            this.f71077N = (int) this.f71090a.d(interfaceC9361r0, false, true, 8);
            this.f71078O = this.f71090a.a();
            this.f71073J = -9223372036854775807L;
            this.f71071H = 1;
            this.f71101h.i(0);
        }
        R2 r24 = (R2) this.f71092b.get(this.f71077N);
        if (r24 == null) {
            interfaceC9361r0.e(i11 - this.f71078O);
            this.f71071H = 0;
            return;
        }
        r24.f70575Y.getClass();
        if (this.f71071H == 1) {
            t(interfaceC9361r0, 3);
            int i25 = (this.f71101h.n()[2] & 6) >> 1;
            if (i25 == 0) {
                this.f71075L = 1;
                int[] iArrX = x(this.f71076M, 1);
                this.f71076M = iArrX;
                iArrX[0] = (i11 - this.f71078O) - 3;
            } else {
                t(interfaceC9361r0, 4);
                int i26 = (this.f71101h.n()[3] & 255) + 1;
                this.f71075L = i26;
                int[] iArrX2 = x(this.f71076M, i26);
                this.f71076M = iArrX2;
                if (i25 == 2) {
                    int i27 = (i11 - this.f71078O) - 4;
                    int i28 = this.f71075L;
                    Arrays.fill(iArrX2, 0, i28, i27 / i28);
                } else {
                    if (i25 != 1) {
                        if (i25 != 3) {
                            throw zzbc.a("Unexpected lacing value: 2", null);
                        }
                        int i29 = 0;
                        int i30 = 0;
                        int i31 = 4;
                        while (true) {
                            int i32 = this.f71075L - 1;
                            if (i29 >= i32) {
                                i12 = i22;
                                i14 = i23;
                                this.f71076M[i32] = ((i11 - this.f71078O) - i31) - i30;
                                break;
                            }
                            this.f71076M[i29] = i23;
                            int i33 = i31 + 1;
                            t(interfaceC9361r0, i33);
                            int i34 = i22;
                            if (this.f71101h.n()[i31] == 0) {
                                throw zzbc.a("No valid varint length mask found", null);
                            }
                            int i35 = i23;
                            while (true) {
                                if (i35 >= i24) {
                                    i15 = i23;
                                    i16 = i24;
                                    j10 = 0;
                                    break;
                                }
                                i16 = i24;
                                int i36 = i34 << (7 - i35);
                                i15 = i23;
                                if ((this.f71101h.n()[i31] & i36) != 0) {
                                    i33 += i35;
                                    t(interfaceC9361r0, i33);
                                    j10 = this.f71101h.n()[i31] & 255 & (~i36);
                                    for (int i37 = i31 + 1; i37 < i33; i37++) {
                                        j10 = (j10 << i16) | (this.f71101h.n()[i37] & 255);
                                    }
                                    if (i29 > 0) {
                                        j10 -= (1 << ((i35 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i35++;
                                    i23 = i15;
                                    i24 = i16;
                                }
                            }
                            i31 = i33;
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.f71076M;
                            int i38 = (int) j10;
                            if (i29 != 0) {
                                i38 += iArr[i29 - 1];
                            }
                            iArr[i29] = i38;
                            i30 += i38;
                            i29++;
                            i22 = i34;
                            i23 = i15;
                            i24 = i16;
                        }
                        throw zzbc.a("EBML lacing sample size out of range.", null);
                    }
                    int i39 = 0;
                    int i40 = 0;
                    int i41 = 4;
                    while (true) {
                        i17 = this.f71075L - 1;
                        if (i39 >= i17) {
                            break;
                        }
                        this.f71076M[i39] = 0;
                        while (true) {
                            i18 = i41 + 1;
                            t(interfaceC9361r0, i18);
                            int i42 = this.f71101h.n()[i41] & 255;
                            int[] iArr2 = this.f71076M;
                            i19 = iArr2[i39] + i42;
                            iArr2[i39] = i19;
                            if (i42 != 255) {
                                break;
                            } else {
                                i41 = i18;
                            }
                        }
                        i40 += i19;
                        i39++;
                        i41 = i18;
                    }
                    this.f71076M[i17] = ((i11 - this.f71078O) - i41) - i40;
                }
            }
            i12 = 1;
            i14 = 0;
            this.f71072I = this.f71066C + p((this.f71101h.n()[i14] << 8) | (this.f71101h.n()[i12] & 255));
            if (r24.f70580d == 2) {
                i20 = i12;
            } else if (i21 == 163) {
                i20 = (this.f71101h.n()[2] & 128) == 128 ? i12 : i14;
                i21 = 163;
            } else {
                i20 = i14;
            }
            this.f71079P = i20;
            this.f71071H = 2;
            this.f71074K = i14;
            i13 = 163;
        } else {
            i12 = 1;
            i13 = 163;
        }
        if (i21 == i13) {
            while (true) {
                int i43 = this.f71074K;
                if (i43 >= this.f71075L) {
                    this.f71071H = 0;
                    return;
                }
                int iN = n(interfaceC9361r0, r24, this.f71076M[i43], false);
                R2 r25 = r24;
                s(r25, this.f71072I + ((this.f71074K * r24.f70581e) / 1000), this.f71079P, iN, 0);
                this.f71074K++;
                r24 = r25;
            }
        } else {
            while (true) {
                int i44 = this.f71074K;
                if (i44 >= this.f71075L) {
                    return;
                }
                int[] iArr3 = this.f71076M;
                boolean z10 = i12;
                iArr3[i44] = n(interfaceC9361r0, r24, iArr3[i44], z10);
                this.f71074K += z10 ? 1 : 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0313  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void h(int r24) throws com.google.android.gms.internal.ads.zzbc {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.T2.h(int):void");
    }

    protected final void i(int i10, double d10) throws zzbc {
        if (i10 == 181) {
            r(i10);
            this.f71115v.f70568R = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f71113t = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                r(i10);
                this.f71115v.f70555E = (float) d10;
                break;
            case 21970:
                r(i10);
                this.f71115v.f70556F = (float) d10;
                break;
            case 21971:
                r(i10);
                this.f71115v.f70557G = (float) d10;
                break;
            case 21972:
                r(i10);
                this.f71115v.f70558H = (float) d10;
                break;
            case 21973:
                r(i10);
                this.f71115v.f70559I = (float) d10;
                break;
            case 21974:
                r(i10);
                this.f71115v.f70560J = (float) d10;
                break;
            case 21975:
                r(i10);
                this.f71115v.f70561K = (float) d10;
                break;
            case 21976:
                r(i10);
                this.f71115v.f70562L = (float) d10;
                break;
            case 21977:
                r(i10);
                this.f71115v.f70563M = (float) d10;
                break;
            case 21978:
                r(i10);
                this.f71115v.f70564N = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        r(i10);
                        this.f71115v.f70596t = (float) d10;
                        break;
                    case 30324:
                        r(i10);
                        this.f71115v.f70597u = (float) d10;
                        break;
                    case 30325:
                        r(i10);
                        this.f71115v.f70598v = (float) d10;
                        break;
                }
        }
    }

    protected final void j(int i10, long j10) throws zzbc {
        boolean z10;
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw zzbc.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw zzbc.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                r(i10);
                this.f71115v.f70580d = (int) j10;
                return;
            case 136:
                z10 = j10 == 1;
                r(i10);
                this.f71115v.f70573W = z10;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.f71073J = p(j10);
                return;
            case 159:
                r(i10);
                this.f71115v.f70566P = (int) j10;
                return;
            case 176:
                r(i10);
                this.f71115v.f70589m = (int) j10;
                return;
            case 179:
                q(i10);
                this.f71067D.c(p(j10));
                return;
            case 186:
                r(i10);
                this.f71115v.f70590n = (int) j10;
                return;
            case 215:
                r(i10);
                this.f71115v.f70579c = (int) j10;
                return;
            case 231:
                this.f71066C = p(j10);
                return;
            case 238:
                this.f71080Q = (int) j10;
                return;
            case 241:
                if (this.f71069F) {
                    return;
                }
                q(i10);
                this.f71068E.c(j10);
                this.f71069F = true;
                return;
            case 251:
                this.f71081R = true;
                return;
            case 16871:
                r(i10);
                this.f71115v.f70583g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw zzbc.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw zzbc.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw zzbc.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw zzbc.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw zzbc.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f71118y = j10 + this.f71111r;
                return;
            case 21432:
                int i11 = (int) j10;
                r(i10);
                if (i11 == 0) {
                    this.f71115v.f70600x = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f71115v.f70600x = 2;
                    return;
                } else if (i11 == 3) {
                    this.f71115v.f70600x = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f71115v.f70600x = 3;
                    return;
                }
            case 21680:
                r(i10);
                this.f71115v.f70592p = (int) j10;
                return;
            case 21682:
                r(i10);
                this.f71115v.f70594r = (int) j10;
                return;
            case 21690:
                r(i10);
                this.f71115v.f70593q = (int) j10;
                return;
            case 21930:
                z10 = j10 == 1;
                r(i10);
                this.f71115v.f70572V = z10;
                return;
            case 21938:
                r(i10);
                R2 r22 = this.f71115v;
                r22.f70601y = true;
                r22.f70591o = (int) j10;
                return;
            case 21998:
                r(i10);
                this.f71115v.f70582f = (int) j10;
                return;
            case 22186:
                r(i10);
                this.f71115v.f70569S = j10;
                return;
            case 22203:
                r(i10);
                this.f71115v.f70570T = j10;
                return;
            case 25188:
                r(i10);
                this.f71115v.f70567Q = (int) j10;
                return;
            case 30114:
                this.f71082S = j10;
                return;
            case 30321:
                int i12 = (int) j10;
                r(i10);
                if (i12 == 0) {
                    this.f71115v.f70595s = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f71115v.f70595s = 1;
                    return;
                } else if (i12 == 2) {
                    this.f71115v.f70595s = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f71115v.f70595s = 3;
                    return;
                }
            case 2352003:
                r(i10);
                this.f71115v.f70581e = (int) j10;
                return;
            case 2807729:
                this.f71112s = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i13 = (int) j10;
                        r(i10);
                        if (i13 == 1) {
                            this.f71115v.f70552B = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f71115v.f70552B = 1;
                            return;
                        }
                    case 21946:
                        r(i10);
                        int iB = Vz0.b((int) j10);
                        if (iB != -1) {
                            this.f71115v.f70551A = iB;
                            return;
                        }
                        return;
                    case 21947:
                        r(i10);
                        this.f71115v.f70601y = true;
                        int iA = Vz0.a((int) j10);
                        if (iA != -1) {
                            this.f71115v.f70602z = iA;
                            return;
                        }
                        return;
                    case 21948:
                        r(i10);
                        this.f71115v.f70553C = (int) j10;
                        return;
                    case 21949:
                        r(i10);
                        this.f71115v.f70554D = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void k(int i10, long j10, long j11) throws zzbc {
        C8211gC.b(this.f71095c0);
        if (i10 == 160) {
            this.f71081R = false;
            this.f71082S = 0L;
            return;
        }
        if (i10 == 174) {
            this.f71115v = new R2();
            return;
        }
        if (i10 == 187) {
            this.f71069F = false;
            return;
        }
        if (i10 == 19899) {
            this.f71117x = -1;
            this.f71118y = -1L;
            return;
        }
        if (i10 == 20533) {
            r(i10);
            this.f71115v.f70584h = true;
            return;
        }
        if (i10 == 21968) {
            r(i10);
            this.f71115v.f70601y = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f71111r;
            if (j12 != -1 && j12 != j10) {
                throw zzbc.a("Multiple Segment elements not supported", null);
            }
            this.f71111r = j10;
            this.f71110q = j11;
            return;
        }
        if (i10 == 475249515) {
            this.f71067D = new XL(32);
            this.f71068E = new XL(32);
        } else if (i10 == 524531317 && !this.f71116w) {
            if (this.f71094c && this.f71064A != -1) {
                this.f71119z = true;
            } else {
                this.f71095c0.m(new P0(this.f71114u, 0L));
                this.f71116w = true;
            }
        }
    }

    protected final void l(int i10, String str) throws zzbc {
        if (i10 == 134) {
            r(i10);
            this.f71115v.f70578b = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzbc.a("DocType " + str + " not supported", null);
        }
        if (i10 == 21358) {
            r(i10);
            this.f71115v.f70577a = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            r(i10);
            this.f71115v.f70574X = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }

    private static byte[] w(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.d(z10);
        Locale locale = Locale.US;
        int i10 = (int) (j10 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i10);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i11);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        int i13 = OV.f69931a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        this.f71066C = -9223372036854775807L;
        this.f71071H = 0;
        this.f71097d0.b();
        this.f71090a.e();
        u();
        for (int i10 = 0; i10 < this.f71092b.size(); i10++) {
            Y0 y02 = ((R2) this.f71092b.valueAt(i10)).f70571U;
            if (y02 != null) {
                y02.b();
            }
        }
    }

    public T2(InterfaceC8835m4 interfaceC8835m4, int i10) {
        this(new O2(), 0, interfaceC8835m4);
    }
}
