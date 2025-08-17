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
public final class T2 implements InterfaceC9130q0 {

    /* renamed from: e0, reason: collision with root package name */
    private static final byte[] f70218e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: f0, reason: collision with root package name */
    private static final byte[] f70219f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final byte[] f70220g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final byte[] f70221h0;

    /* renamed from: i0, reason: collision with root package name */
    private static final UUID f70222i0;

    /* renamed from: j0, reason: collision with root package name */
    private static final Map f70223j0;

    /* renamed from: A, reason: collision with root package name */
    private long f70224A;

    /* renamed from: B, reason: collision with root package name */
    private long f70225B;

    /* renamed from: C, reason: collision with root package name */
    private long f70226C;

    /* renamed from: D, reason: collision with root package name */
    private XL f70227D;

    /* renamed from: E, reason: collision with root package name */
    private XL f70228E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f70229F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f70230G;

    /* renamed from: H, reason: collision with root package name */
    private int f70231H;

    /* renamed from: I, reason: collision with root package name */
    private long f70232I;

    /* renamed from: J, reason: collision with root package name */
    private long f70233J;

    /* renamed from: K, reason: collision with root package name */
    private int f70234K;

    /* renamed from: L, reason: collision with root package name */
    private int f70235L;

    /* renamed from: M, reason: collision with root package name */
    private int[] f70236M;

    /* renamed from: N, reason: collision with root package name */
    private int f70237N;

    /* renamed from: O, reason: collision with root package name */
    private int f70238O;

    /* renamed from: P, reason: collision with root package name */
    private int f70239P;

    /* renamed from: Q, reason: collision with root package name */
    private int f70240Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f70241R;

    /* renamed from: S, reason: collision with root package name */
    private long f70242S;

    /* renamed from: T, reason: collision with root package name */
    private int f70243T;

    /* renamed from: U, reason: collision with root package name */
    private int f70244U;

    /* renamed from: V, reason: collision with root package name */
    private int f70245V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f70246W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f70247X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f70248Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f70249Z;

    /* renamed from: a, reason: collision with root package name */
    private final V2 f70250a;

    /* renamed from: a0, reason: collision with root package name */
    private byte f70251a0;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f70252b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f70253b0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f70254c;

    /* renamed from: c0, reason: collision with root package name */
    private InterfaceC9450t0 f70255c0;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f70256d;

    /* renamed from: d0, reason: collision with root package name */
    private final O2 f70257d0;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8710m4 f70258e;

    /* renamed from: f, reason: collision with root package name */
    private final GQ f70259f;

    /* renamed from: g, reason: collision with root package name */
    private final GQ f70260g;

    /* renamed from: h, reason: collision with root package name */
    private final GQ f70261h;

    /* renamed from: i, reason: collision with root package name */
    private final GQ f70262i;

    /* renamed from: j, reason: collision with root package name */
    private final GQ f70263j;

    /* renamed from: k, reason: collision with root package name */
    private final GQ f70264k;

    /* renamed from: l, reason: collision with root package name */
    private final GQ f70265l;

    /* renamed from: m, reason: collision with root package name */
    private final GQ f70266m;

    /* renamed from: n, reason: collision with root package name */
    private final GQ f70267n;

    /* renamed from: o, reason: collision with root package name */
    private final GQ f70268o;

    /* renamed from: p, reason: collision with root package name */
    private ByteBuffer f70269p;

    /* renamed from: q, reason: collision with root package name */
    private long f70270q;

    /* renamed from: r, reason: collision with root package name */
    private long f70271r;

    /* renamed from: s, reason: collision with root package name */
    private long f70272s;

    /* renamed from: t, reason: collision with root package name */
    private long f70273t;

    /* renamed from: u, reason: collision with root package name */
    private long f70274u;

    /* renamed from: v, reason: collision with root package name */
    private R2 f70275v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f70276w;

    /* renamed from: x, reason: collision with root package name */
    private int f70277x;

    /* renamed from: y, reason: collision with root package name */
    private long f70278y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f70279z;

    @Deprecated
    public T2() {
        this(new O2(), 2, InterfaceC8710m4.f76710a);
    }

    private final void u() {
        this.f70243T = 0;
        this.f70244U = 0;
        this.f70245V = 0;
        this.f70246W = false;
        this.f70247X = false;
        this.f70248Y = false;
        this.f70249Z = 0;
        this.f70251a0 = (byte) 0;
        this.f70253b0 = false;
        this.f70264k.i(0);
    }

    private final void v(InterfaceC9236r0 interfaceC9236r0, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = length + i10;
        if (this.f70265l.s() < i11) {
            GQ gq2 = this.f70265l;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            gq2.j(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f70265l.n(), 0, length);
        }
        interfaceC9236r0.zzi(this.f70265l.n(), length, i10);
        this.f70265l.l(0);
        this.f70265l.k(i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final int b(InterfaceC9236r0 interfaceC9236r0, N0 n02) throws IOException {
        this.f70230G = false;
        while (!this.f70230G) {
            if (!this.f70257d0.c(interfaceC9236r0)) {
                for (int i10 = 0; i10 < this.f70252b.size(); i10++) {
                    R2 r22 = (R2) this.f70252b.valueAt(i10);
                    r22.f69735Y.getClass();
                    Y0 y02 = r22.f69731U;
                    if (y02 != null) {
                        y02.a(r22.f69735Y, r22.f69746j);
                    }
                }
                return -1;
            }
            long jZzf = interfaceC9236r0.zzf();
            if (this.f70279z) {
                this.f70225B = jZzf;
                n02.f68790a = this.f70224A;
                this.f70279z = false;
                return 1;
            }
            if (this.f70276w) {
                long j10 = this.f70225B;
                if (j10 != -1) {
                    n02.f68790a = j10;
                    this.f70225B = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    static {
        int i10 = OV.f69091a;
        f70219f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f70220g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f70221h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f70222i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f70223j0 = Collections.unmodifiableMap(map);
    }

    T2(O2 o22, int i10, InterfaceC8710m4 interfaceC8710m4) {
        this.f70271r = -1L;
        this.f70272s = -9223372036854775807L;
        this.f70273t = -9223372036854775807L;
        this.f70274u = -9223372036854775807L;
        this.f70224A = -1L;
        this.f70225B = -1L;
        this.f70226C = -9223372036854775807L;
        this.f70257d0 = o22;
        o22.a(new Q2(this, null));
        this.f70258e = interfaceC8710m4;
        this.f70254c = 1 == ((i10 & 1) ^ 1);
        this.f70256d = (i10 & 2) == 0;
        this.f70250a = new V2();
        this.f70252b = new SparseArray();
        this.f70261h = new GQ(4);
        this.f70262i = new GQ(ByteBuffer.allocate(4).putInt(-1).array());
        this.f70263j = new GQ(4);
        this.f70259f = new GQ(C9185qa0.f77796a);
        this.f70260g = new GQ(4);
        this.f70264k = new GQ();
        this.f70265l = new GQ();
        this.f70266m = new GQ(8);
        this.f70267n = new GQ();
        this.f70268o = new GQ();
        this.f70236M = new int[1];
    }

    private final int n(InterfaceC9236r0 interfaceC9236r0, R2 r22, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(r22.f69738b)) {
            v(interfaceC9236r0, f70218e0, i10);
            int i12 = this.f70244U;
            u();
            return i12;
        }
        if ("S_TEXT/ASS".equals(r22.f69738b)) {
            v(interfaceC9236r0, f70220g0, i10);
            int i13 = this.f70244U;
            u();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(r22.f69738b)) {
            v(interfaceC9236r0, f70221h0, i10);
            int i14 = this.f70244U;
            u();
            return i14;
        }
        X0 x02 = r22.f69735Y;
        if (!this.f70246W) {
            if (r22.f69744h) {
                this.f70239P &= -1073741825;
                if (!this.f70247X) {
                    interfaceC9236r0.zzi(this.f70261h.n(), 0, 1);
                    this.f70243T++;
                    if ((this.f70261h.n()[0] & 128) == 128) {
                        throw zzbc.a("Extension bit is set in signal byte", null);
                    }
                    this.f70251a0 = this.f70261h.n()[0];
                    this.f70247X = true;
                }
                byte b10 = this.f70251a0;
                if ((b10 & 1) == 1) {
                    int i15 = b10 & 2;
                    this.f70239P |= 1073741824;
                    if (!this.f70253b0) {
                        interfaceC9236r0.zzi(this.f70266m.n(), 0, 8);
                        this.f70243T += 8;
                        this.f70253b0 = true;
                        this.f70261h.n()[0] = (byte) ((i15 != 2 ? 0 : 128) | 8);
                        this.f70261h.l(0);
                        x02.g(this.f70261h, 1, 1);
                        this.f70244U++;
                        this.f70266m.l(0);
                        x02.g(this.f70266m, 8, 1);
                        this.f70244U += 8;
                    }
                    if (i15 == 2) {
                        if (!this.f70248Y) {
                            interfaceC9236r0.zzi(this.f70261h.n(), 0, 1);
                            this.f70243T++;
                            this.f70261h.l(0);
                            this.f70249Z = this.f70261h.C();
                            this.f70248Y = true;
                        }
                        int i16 = this.f70249Z * 4;
                        this.f70261h.i(i16);
                        interfaceC9236r0.zzi(this.f70261h.n(), 0, i16);
                        this.f70243T += i16;
                        int i17 = (this.f70249Z >> 1) + 1;
                        int i18 = (i17 * 6) + 2;
                        ByteBuffer byteBuffer = this.f70269p;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.f70269p = ByteBuffer.allocate(i18);
                        }
                        this.f70269p.position(0);
                        this.f70269p.putShort((short) i17);
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            i11 = this.f70249Z;
                            if (i19 >= i11) {
                                break;
                            }
                            int iF = this.f70261h.F();
                            int i21 = iF - i20;
                            if (i19 % 2 == 0) {
                                this.f70269p.putShort((short) i21);
                            } else {
                                this.f70269p.putInt(i21);
                            }
                            i19++;
                            i20 = iF;
                        }
                        int i22 = (i10 - this.f70243T) - i20;
                        if ((i11 & 1) == 1) {
                            this.f70269p.putInt(i22);
                        } else {
                            this.f70269p.putShort((short) i22);
                            this.f70269p.putInt(0);
                        }
                        this.f70267n.j(this.f70269p.array(), i18);
                        x02.g(this.f70267n, i18, 1);
                        this.f70244U += i18;
                    }
                }
            } else {
                byte[] bArr = r22.f69745i;
                if (bArr != null) {
                    this.f70264k.j(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(r22.f69738b) ? r22.f69742f > 0 : z10) {
                this.f70239P |= 268435456;
                this.f70268o.i(0);
                int iU = (this.f70264k.u() + i10) - this.f70243T;
                this.f70261h.i(4);
                this.f70261h.n()[0] = (byte) ((iU >> 24) & com.medallia.digital.mobilesdk.l3.f92484c);
                this.f70261h.n()[1] = (byte) ((iU >> 16) & com.medallia.digital.mobilesdk.l3.f92484c);
                this.f70261h.n()[2] = (byte) ((iU >> 8) & com.medallia.digital.mobilesdk.l3.f92484c);
                this.f70261h.n()[3] = (byte) (iU & com.medallia.digital.mobilesdk.l3.f92484c);
                x02.g(this.f70261h, 4, 2);
                this.f70244U += 4;
            }
            this.f70246W = true;
        }
        int iU2 = i10 + this.f70264k.u();
        if (!"V_MPEG4/ISO/AVC".equals(r22.f69738b) && !"V_MPEGH/ISO/HEVC".equals(r22.f69738b)) {
            if (r22.f69731U != null) {
                C8086gC.f(this.f70264k.u() == 0);
                r22.f69731U.d(interfaceC9236r0);
            }
            while (true) {
                int i23 = this.f70243T;
                if (i23 >= iU2) {
                    break;
                }
                int iO = o(interfaceC9236r0, x02, iU2 - i23);
                this.f70243T += iO;
                this.f70244U += iO;
            }
        } else {
            byte[] bArrN = this.f70260g.n();
            bArrN[0] = 0;
            bArrN[1] = 0;
            bArrN[2] = 0;
            int i24 = r22.f69736Z;
            int i25 = 4 - i24;
            while (this.f70243T < iU2) {
                int i26 = this.f70245V;
                if (i26 == 0) {
                    int iMin = Math.min(i24, this.f70264k.r());
                    interfaceC9236r0.zzi(bArrN, i25 + iMin, i24 - iMin);
                    if (iMin > 0) {
                        this.f70264k.h(bArrN, i25, iMin);
                    }
                    this.f70243T += i24;
                    this.f70260g.l(0);
                    this.f70245V = this.f70260g.F();
                    this.f70259f.l(0);
                    x02.c(this.f70259f, 4);
                    this.f70244U += 4;
                } else {
                    int iO2 = o(interfaceC9236r0, x02, i26);
                    this.f70243T += iO2;
                    this.f70244U += iO2;
                    this.f70245V -= iO2;
                }
            }
        }
        if ("A_VORBIS".equals(r22.f69738b)) {
            this.f70262i.l(0);
            x02.c(this.f70262i, 4);
            this.f70244U += 4;
        }
        int i27 = this.f70244U;
        u();
        return i27;
    }

    private final int o(InterfaceC9236r0 interfaceC9236r0, X0 x02, int i10) throws IOException {
        int iR = this.f70264k.r();
        if (iR <= 0) {
            return x02.b(interfaceC9236r0, i10, false);
        }
        int iMin = Math.min(i10, iR);
        x02.c(this.f70264k, iMin);
        return iMin;
    }

    private final long p(long j10) throws zzbc {
        long j11 = this.f70272s;
        if (j11 != -9223372036854775807L) {
            return OV.M(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw zzbc.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void q(int i10) throws zzbc {
        if (this.f70227D == null || this.f70228E == null) {
            throw zzbc.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private final void r(int i10) throws zzbc {
        if (this.f70275v != null) {
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

    private final void t(InterfaceC9236r0 interfaceC9236r0, int i10) throws IOException {
        if (this.f70261h.u() >= i10) {
            return;
        }
        if (this.f70261h.s() < i10) {
            GQ gq2 = this.f70261h;
            int iS = gq2.s();
            gq2.f(Math.max(iS + iS, i10));
        }
        GQ gq3 = this.f70261h;
        interfaceC9236r0.zzi(gq3.n(), gq3.u(), i10 - gq3.u());
        this.f70261h.k(i10);
    }

    private static int[] x(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        return new U2().a(interfaceC9236r0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        if (this.f70256d) {
            interfaceC9450t0 = new C9031p4(interfaceC9450t0, this.f70258e);
        }
        this.f70255c0 = interfaceC9450t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void g(int i10, int i11, InterfaceC9236r0 interfaceC9236r0) throws IOException {
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
                if (this.f70231H != 2) {
                    return;
                }
                R2 r22 = (R2) this.f70252b.get(this.f70237N);
                if (this.f70240Q != 4 || !"V_VP9".equals(r22.f69738b)) {
                    interfaceC9236r0.e(i11);
                    return;
                } else {
                    this.f70268o.i(i11);
                    interfaceC9236r0.zzi(this.f70268o.n(), 0, i11);
                    return;
                }
            }
            if (i21 == 16877) {
                r(i10);
                R2 r23 = this.f70275v;
                if (r23.f69743g != 1685485123 && r23.f69743g != 1685480259) {
                    interfaceC9236r0.e(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                r23.f69725O = bArr;
                interfaceC9236r0.zzi(bArr, 0, i11);
                return;
            }
            if (i21 == 16981) {
                r(i10);
                byte[] bArr2 = new byte[i11];
                this.f70275v.f69745i = bArr2;
                interfaceC9236r0.zzi(bArr2, 0, i11);
                return;
            }
            if (i21 == 18402) {
                byte[] bArr3 = new byte[i11];
                interfaceC9236r0.zzi(bArr3, 0, i11);
                r(i10);
                this.f70275v.f69746j = new W0(1, bArr3, 0, 0);
                return;
            }
            if (i21 == 21419) {
                Arrays.fill(this.f70263j.n(), (byte) 0);
                interfaceC9236r0.zzi(this.f70263j.n(), 4 - i11, i11);
                this.f70263j.l(0);
                this.f70277x = (int) this.f70263j.K();
                return;
            }
            if (i21 == 25506) {
                r(i10);
                byte[] bArr4 = new byte[i11];
                this.f70275v.f69747k = bArr4;
                interfaceC9236r0.zzi(bArr4, 0, i11);
                return;
            }
            if (i21 != 30322) {
                throw zzbc.a("Unexpected id: " + i21, null);
            }
            r(i10);
            byte[] bArr5 = new byte[i11];
            this.f70275v.f69759w = bArr5;
            interfaceC9236r0.zzi(bArr5, 0, i11);
            return;
        }
        int i24 = 8;
        if (this.f70231H == 0) {
            this.f70237N = (int) this.f70250a.d(interfaceC9236r0, false, true, 8);
            this.f70238O = this.f70250a.a();
            this.f70233J = -9223372036854775807L;
            this.f70231H = 1;
            this.f70261h.i(0);
        }
        R2 r24 = (R2) this.f70252b.get(this.f70237N);
        if (r24 == null) {
            interfaceC9236r0.e(i11 - this.f70238O);
            this.f70231H = 0;
            return;
        }
        r24.f69735Y.getClass();
        if (this.f70231H == 1) {
            t(interfaceC9236r0, 3);
            int i25 = (this.f70261h.n()[2] & 6) >> 1;
            if (i25 == 0) {
                this.f70235L = 1;
                int[] iArrX = x(this.f70236M, 1);
                this.f70236M = iArrX;
                iArrX[0] = (i11 - this.f70238O) - 3;
            } else {
                t(interfaceC9236r0, 4);
                int i26 = (this.f70261h.n()[3] & 255) + 1;
                this.f70235L = i26;
                int[] iArrX2 = x(this.f70236M, i26);
                this.f70236M = iArrX2;
                if (i25 == 2) {
                    int i27 = (i11 - this.f70238O) - 4;
                    int i28 = this.f70235L;
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
                            int i32 = this.f70235L - 1;
                            if (i29 >= i32) {
                                i12 = i22;
                                i14 = i23;
                                this.f70236M[i32] = ((i11 - this.f70238O) - i31) - i30;
                                break;
                            }
                            this.f70236M[i29] = i23;
                            int i33 = i31 + 1;
                            t(interfaceC9236r0, i33);
                            int i34 = i22;
                            if (this.f70261h.n()[i31] == 0) {
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
                                if ((this.f70261h.n()[i31] & i36) != 0) {
                                    i33 += i35;
                                    t(interfaceC9236r0, i33);
                                    j10 = this.f70261h.n()[i31] & 255 & (~i36);
                                    for (int i37 = i31 + 1; i37 < i33; i37++) {
                                        j10 = (j10 << i16) | (this.f70261h.n()[i37] & 255);
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
                            int[] iArr = this.f70236M;
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
                        i17 = this.f70235L - 1;
                        if (i39 >= i17) {
                            break;
                        }
                        this.f70236M[i39] = 0;
                        while (true) {
                            i18 = i41 + 1;
                            t(interfaceC9236r0, i18);
                            int i42 = this.f70261h.n()[i41] & 255;
                            int[] iArr2 = this.f70236M;
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
                    this.f70236M[i17] = ((i11 - this.f70238O) - i41) - i40;
                }
            }
            i12 = 1;
            i14 = 0;
            this.f70232I = this.f70226C + p((this.f70261h.n()[i14] << 8) | (this.f70261h.n()[i12] & 255));
            if (r24.f69740d == 2) {
                i20 = i12;
            } else if (i21 == 163) {
                i20 = (this.f70261h.n()[2] & 128) == 128 ? i12 : i14;
                i21 = 163;
            } else {
                i20 = i14;
            }
            this.f70239P = i20;
            this.f70231H = 2;
            this.f70234K = i14;
            i13 = 163;
        } else {
            i12 = 1;
            i13 = 163;
        }
        if (i21 == i13) {
            while (true) {
                int i43 = this.f70234K;
                if (i43 >= this.f70235L) {
                    this.f70231H = 0;
                    return;
                }
                int iN = n(interfaceC9236r0, r24, this.f70236M[i43], false);
                R2 r25 = r24;
                s(r25, this.f70232I + ((this.f70234K * r24.f69741e) / 1000), this.f70239P, iN, 0);
                this.f70234K++;
                r24 = r25;
            }
        } else {
            while (true) {
                int i44 = this.f70234K;
                if (i44 >= this.f70235L) {
                    return;
                }
                int[] iArr3 = this.f70236M;
                boolean z10 = i12;
                iArr3[i44] = n(interfaceC9236r0, r24, iArr3[i44], z10);
                this.f70234K += z10 ? 1 : 0;
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
            this.f70275v.f69728R = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f70273t = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                r(i10);
                this.f70275v.f69715E = (float) d10;
                break;
            case 21970:
                r(i10);
                this.f70275v.f69716F = (float) d10;
                break;
            case 21971:
                r(i10);
                this.f70275v.f69717G = (float) d10;
                break;
            case 21972:
                r(i10);
                this.f70275v.f69718H = (float) d10;
                break;
            case 21973:
                r(i10);
                this.f70275v.f69719I = (float) d10;
                break;
            case 21974:
                r(i10);
                this.f70275v.f69720J = (float) d10;
                break;
            case 21975:
                r(i10);
                this.f70275v.f69721K = (float) d10;
                break;
            case 21976:
                r(i10);
                this.f70275v.f69722L = (float) d10;
                break;
            case 21977:
                r(i10);
                this.f70275v.f69723M = (float) d10;
                break;
            case 21978:
                r(i10);
                this.f70275v.f69724N = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        r(i10);
                        this.f70275v.f69756t = (float) d10;
                        break;
                    case 30324:
                        r(i10);
                        this.f70275v.f69757u = (float) d10;
                        break;
                    case 30325:
                        r(i10);
                        this.f70275v.f69758v = (float) d10;
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
                this.f70275v.f69740d = (int) j10;
                return;
            case 136:
                z10 = j10 == 1;
                r(i10);
                this.f70275v.f69733W = z10;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.f70233J = p(j10);
                return;
            case 159:
                r(i10);
                this.f70275v.f69726P = (int) j10;
                return;
            case 176:
                r(i10);
                this.f70275v.f69749m = (int) j10;
                return;
            case 179:
                q(i10);
                this.f70227D.c(p(j10));
                return;
            case 186:
                r(i10);
                this.f70275v.f69750n = (int) j10;
                return;
            case 215:
                r(i10);
                this.f70275v.f69739c = (int) j10;
                return;
            case 231:
                this.f70226C = p(j10);
                return;
            case 238:
                this.f70240Q = (int) j10;
                return;
            case 241:
                if (this.f70229F) {
                    return;
                }
                q(i10);
                this.f70228E.c(j10);
                this.f70229F = true;
                return;
            case 251:
                this.f70241R = true;
                return;
            case 16871:
                r(i10);
                this.f70275v.f69743g = (int) j10;
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
                this.f70278y = j10 + this.f70271r;
                return;
            case 21432:
                int i11 = (int) j10;
                r(i10);
                if (i11 == 0) {
                    this.f70275v.f69760x = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f70275v.f69760x = 2;
                    return;
                } else if (i11 == 3) {
                    this.f70275v.f69760x = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f70275v.f69760x = 3;
                    return;
                }
            case 21680:
                r(i10);
                this.f70275v.f69752p = (int) j10;
                return;
            case 21682:
                r(i10);
                this.f70275v.f69754r = (int) j10;
                return;
            case 21690:
                r(i10);
                this.f70275v.f69753q = (int) j10;
                return;
            case 21930:
                z10 = j10 == 1;
                r(i10);
                this.f70275v.f69732V = z10;
                return;
            case 21938:
                r(i10);
                R2 r22 = this.f70275v;
                r22.f69761y = true;
                r22.f69751o = (int) j10;
                return;
            case 21998:
                r(i10);
                this.f70275v.f69742f = (int) j10;
                return;
            case 22186:
                r(i10);
                this.f70275v.f69729S = j10;
                return;
            case 22203:
                r(i10);
                this.f70275v.f69730T = j10;
                return;
            case 25188:
                r(i10);
                this.f70275v.f69727Q = (int) j10;
                return;
            case 30114:
                this.f70242S = j10;
                return;
            case 30321:
                int i12 = (int) j10;
                r(i10);
                if (i12 == 0) {
                    this.f70275v.f69755s = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f70275v.f69755s = 1;
                    return;
                } else if (i12 == 2) {
                    this.f70275v.f69755s = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f70275v.f69755s = 3;
                    return;
                }
            case 2352003:
                r(i10);
                this.f70275v.f69741e = (int) j10;
                return;
            case 2807729:
                this.f70272s = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i13 = (int) j10;
                        r(i10);
                        if (i13 == 1) {
                            this.f70275v.f69712B = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f70275v.f69712B = 1;
                            return;
                        }
                    case 21946:
                        r(i10);
                        int iB = Vz0.b((int) j10);
                        if (iB != -1) {
                            this.f70275v.f69711A = iB;
                            return;
                        }
                        return;
                    case 21947:
                        r(i10);
                        this.f70275v.f69761y = true;
                        int iA = Vz0.a((int) j10);
                        if (iA != -1) {
                            this.f70275v.f69762z = iA;
                            return;
                        }
                        return;
                    case 21948:
                        r(i10);
                        this.f70275v.f69713C = (int) j10;
                        return;
                    case 21949:
                        r(i10);
                        this.f70275v.f69714D = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void k(int i10, long j10, long j11) throws zzbc {
        C8086gC.b(this.f70255c0);
        if (i10 == 160) {
            this.f70241R = false;
            this.f70242S = 0L;
            return;
        }
        if (i10 == 174) {
            this.f70275v = new R2();
            return;
        }
        if (i10 == 187) {
            this.f70229F = false;
            return;
        }
        if (i10 == 19899) {
            this.f70277x = -1;
            this.f70278y = -1L;
            return;
        }
        if (i10 == 20533) {
            r(i10);
            this.f70275v.f69744h = true;
            return;
        }
        if (i10 == 21968) {
            r(i10);
            this.f70275v.f69761y = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f70271r;
            if (j12 != -1 && j12 != j10) {
                throw zzbc.a("Multiple Segment elements not supported", null);
            }
            this.f70271r = j10;
            this.f70270q = j11;
            return;
        }
        if (i10 == 475249515) {
            this.f70227D = new XL(32);
            this.f70228E = new XL(32);
        } else if (i10 == 524531317 && !this.f70276w) {
            if (this.f70254c && this.f70224A != -1) {
                this.f70279z = true;
            } else {
                this.f70255c0.m(new P0(this.f70274u, 0L));
                this.f70276w = true;
            }
        }
    }

    protected final void l(int i10, String str) throws zzbc {
        if (i10 == 134) {
            r(i10);
            this.f70275v.f69738b = str;
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
            this.f70275v.f69737a = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            r(i10);
            this.f70275v.f69734X = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }

    private static byte[] w(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8086gC.d(z10);
        Locale locale = Locale.US;
        int i10 = (int) (j10 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i10);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i11);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        int i13 = OV.f69091a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        this.f70226C = -9223372036854775807L;
        this.f70231H = 0;
        this.f70257d0.b();
        this.f70250a.e();
        u();
        for (int i10 = 0; i10 < this.f70252b.size(); i10++) {
            Y0 y02 = ((R2) this.f70252b.valueAt(i10)).f69731U;
            if (y02 != null) {
                y02.b();
            }
        }
    }

    public T2(InterfaceC8710m4 interfaceC8710m4, int i10) {
        this(new O2(), 0, interfaceC8710m4);
    }
}
