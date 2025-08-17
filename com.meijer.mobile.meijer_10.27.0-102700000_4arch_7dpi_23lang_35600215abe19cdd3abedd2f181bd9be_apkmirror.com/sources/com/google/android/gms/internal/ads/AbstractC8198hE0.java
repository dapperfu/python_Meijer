package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import fsimpl.C14045dq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.hE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8198hE0 extends Ly0 {

    /* renamed from: y0, reason: collision with root package name */
    private static final byte[] f74641y0 = {0, 0, 1, 103, 66, -64, C14045dq.DST_ATOP, -38, 37, -112, 0, 0, 1, 104, -50, C14045dq.MULTIPLY, 19, 32, 0, 0, 1, 101, -120, -124, C14045dq.DARKEN, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    private final C9157qD0 f74642A;

    /* renamed from: B, reason: collision with root package name */
    private C f74643B;

    /* renamed from: C, reason: collision with root package name */
    private C f74644C;

    /* renamed from: D, reason: collision with root package name */
    private EA0 f74645D;

    /* renamed from: E, reason: collision with root package name */
    private MediaCrypto f74646E;

    /* renamed from: F, reason: collision with root package name */
    private float f74647F;

    /* renamed from: G, reason: collision with root package name */
    private float f74648G;

    /* renamed from: H, reason: collision with root package name */
    private ZD0 f74649H;

    /* renamed from: I, reason: collision with root package name */
    private C f74650I;

    /* renamed from: J, reason: collision with root package name */
    private MediaFormat f74651J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f74652K;

    /* renamed from: L, reason: collision with root package name */
    private float f74653L;

    /* renamed from: M, reason: collision with root package name */
    private ArrayDeque f74654M;

    /* renamed from: N, reason: collision with root package name */
    private zzsj f74655N;

    /* renamed from: O, reason: collision with root package name */
    private C7558bE0 f74656O;

    /* renamed from: P, reason: collision with root package name */
    private int f74657P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f74658Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f74659R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f74660S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f74661T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f74662U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f74663V;

    /* renamed from: W, reason: collision with root package name */
    private long f74664W;

    /* renamed from: X, reason: collision with root package name */
    private long f74665X;

    /* renamed from: Y, reason: collision with root package name */
    private int f74666Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f74667Z;

    /* renamed from: a0, reason: collision with root package name */
    private ByteBuffer f74668a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f74669b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f74670c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f74671d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f74672e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f74673f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f74674g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f74675h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f74676i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f74677j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f74678k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f74679l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f74680m0;

    /* renamed from: n0, reason: collision with root package name */
    private long f74681n0;

    /* renamed from: o0, reason: collision with root package name */
    private long f74682o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f74683p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f74684q0;

    /* renamed from: r, reason: collision with root package name */
    private final XD0 f74685r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f74686r0;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC8410jE0 f74687s;

    /* renamed from: s0, reason: collision with root package name */
    protected My0 f74688s0;

    /* renamed from: t, reason: collision with root package name */
    private final float f74689t;

    /* renamed from: t0, reason: collision with root package name */
    private C7984fE0 f74690t0;

    /* renamed from: u, reason: collision with root package name */
    private final By0 f74691u;

    /* renamed from: u0, reason: collision with root package name */
    private long f74692u0;

    /* renamed from: v, reason: collision with root package name */
    private final By0 f74693v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f74694v0;

    /* renamed from: w, reason: collision with root package name */
    private final By0 f74695w;

    /* renamed from: w0, reason: collision with root package name */
    private CD0 f74696w0;

    /* renamed from: x, reason: collision with root package name */
    private final PD0 f74697x;

    /* renamed from: x0, reason: collision with root package name */
    private CD0 f74698x0;

    /* renamed from: y, reason: collision with root package name */
    private final MediaCodec.BufferInfo f74699y;

    /* renamed from: z, reason: collision with root package name */
    private final ArrayDeque f74700z;

    private final void E0() {
        this.f74666Y = -1;
        this.f74693v.f65631d = null;
    }

    private final void i0() {
        this.f74667Z = -1;
        this.f74668a0 = null;
    }

    private final void j0(C7984fE0 c7984fE0) {
        this.f74690t0 = c7984fE0;
        if (c7984fE0.f74066c != -9223372036854775807L) {
            this.f74694v0 = true;
        }
    }

    private final boolean m0() {
        return this.f74667Z >= 0;
    }

    private final void t0() {
        this.f74673f0 = false;
        this.f74697x.b();
        this.f74695w.b();
        this.f74672e0 = false;
        this.f74671d0 = false;
        this.f74642A.b();
    }

    protected abstract void A0(Exception exc);

    protected abstract void B0(String str, WD0 wd0, long j10, long j11);

    protected abstract void C0(String str);

    protected abstract void D0(C c10, MediaFormat mediaFormat) throws zzib;

    protected abstract void F0();

    protected void G0() throws zzib {
    }

    protected abstract boolean H0(long j10, long j11, ZD0 zd0, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C c10) throws zzib;

    protected boolean I0(C c10) {
        return false;
    }

    protected final float J0() {
        return this.f74647F;
    }

    protected int K0(By0 by0) {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Ly0
    protected void O() {
        this.f74643B = null;
        j0(C7984fE0.f74063e);
        this.f74700z.clear();
        c0();
    }

    protected final ZD0 O0() {
        return this.f74649H;
    }

    @Override // com.google.android.gms.internal.ads.Ly0
    protected void P(boolean z10, boolean z11) throws zzib {
        this.f74688s0 = new My0();
    }

    @Override // com.google.android.gms.internal.ads.Ly0
    protected void Q(long j10, boolean z10) throws zzib {
        this.f74683p0 = false;
        this.f74684q0 = false;
        if (this.f74671d0) {
            this.f74697x.b();
            this.f74695w.b();
            this.f74672e0 = false;
            this.f74642A.b();
        } else {
            b0();
        }
        MT mt2 = this.f74690t0.f74067d;
        if (mt2.a() > 0) {
            this.f74686r0 = true;
        }
        mt2.e();
        this.f74700z.clear();
    }

    protected abstract float R(float f10, C c10, C[] cArr);

    protected final C7558bE0 T() {
        return this.f74656O;
    }

    protected void W(By0 by0) throws zzib {
    }

    protected void X(C c10) throws zzib {
    }

    protected final void Y() {
        try {
            ZD0 zd0 = this.f74649H;
            if (zd0 != null) {
                zd0.zzm();
                this.f74688s0.f68769b++;
                C7558bE0 c7558bE0 = this.f74656O;
                if (c7558bE0 == null) {
                    throw null;
                }
                C0(c7558bE0.f72767a);
            }
            this.f74649H = null;
            this.f74646E = null;
            this.f74696w0 = null;
            a0();
        } catch (Throwable th2) {
            this.f74649H = null;
            this.f74646E = null;
            this.f74696w0 = null;
            a0();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public boolean a() {
        return this.f74684q0;
    }

    protected final boolean d0() {
        return this.f74671d0;
    }

    protected boolean f0(C7558bE0 c7558bE0) {
        return true;
    }

    protected boolean g0(By0 by0) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x0360, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0362, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x03f8, code lost:
    
        if (r18.f74663V != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x03fa, code lost:
    
        r18.f74679l0 = true;
        r2.a(r18.f74666Y, 0, 0, 0, 4);
        E0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x040d, code lost:
    
        r18.f74676i0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x060d  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.google.android.gms.internal.ads.Ly0, com.google.android.gms.internal.ads.hE0] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // com.google.android.gms.internal.ads.FA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(long r19, long r21) throws com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instructions count: 1574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC8198hE0.m(long, long):void");
    }

    protected abstract int q0(InterfaceC8410jE0 interfaceC8410jE0, C c10) throws zzsu;

    protected abstract Ny0 r0(C7558bE0 c7558bE0, C c10, C c11);

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.google.android.gms.internal.ads.Ny0 s0(com.google.android.gms.internal.ads.Zz0 r12) throws com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC8198hE0.s0(com.google.android.gms.internal.ads.Zz0):com.google.android.gms.internal.ads.Ny0");
    }

    protected abstract WD0 v0(C7558bE0 c7558bE0, C c10, MediaCrypto mediaCrypto, float f10);

    protected abstract List w0(InterfaceC8410jE0 interfaceC8410jE0, C c10, boolean z10) throws zzsu;

    @Override // com.google.android.gms.internal.ads.Ly0
    protected void y() {
        try {
            t0();
            Y();
        } finally {
            this.f74698x0 = null;
        }
    }

    protected abstract void z0(By0 by0) throws zzib;

    @Override // com.google.android.gms.internal.ads.Ly0, com.google.android.gms.internal.ads.IA0
    public final int zze() {
        return 8;
    }

    protected static boolean h0(C c10) {
        return c10.f65648K == 0;
    }

    private final void k0() throws zzib {
        CD0 cd0 = this.f74698x0;
        cd0.getClass();
        this.f74696w0 = cd0;
        this.f74676i0 = 0;
        this.f74677j0 = 0;
    }

    @TargetApi(23)
    private final boolean l0() throws zzib {
        if (this.f74678k0) {
            this.f74676i0 = 1;
            if (this.f74659R) {
                this.f74677j0 = 3;
                return false;
            }
            this.f74677j0 = 2;
        } else {
            k0();
        }
        return true;
    }

    private final boolean n0(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        C c10 = this.f74644C;
        return (c10 != null && Objects.equals(c10.f65664o, "audio/opus") && M0.f(j10, j11)) ? false : true;
    }

    private final boolean o0(int i10) throws zzib {
        By0 by0 = this.f74691u;
        Zz0 zz0L = L();
        by0.b();
        int iF = F(zz0L, this.f74691u, i10 | 4);
        if (iF == -5) {
            s0(zz0L);
            return true;
        }
        if (iF != -4 || !this.f74691u.f()) {
            return false;
        }
        this.f74683p0 = true;
        y0();
        return false;
    }

    private final boolean p0(C c10) throws zzib {
        if (OV.f69091a >= 23 && this.f74649H != null && this.f74677j0 != 3 && k() != 0) {
            float f10 = this.f74648G;
            c10.getClass();
            float fR = R(f10, c10, D());
            float f11 = this.f74653L;
            if (f11 != fR) {
                if (fR == -1.0f) {
                    u0();
                    return false;
                }
                if (f11 != -1.0f || fR > this.f74689t) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fR);
                    ZD0 zd0 = this.f74649H;
                    zd0.getClass();
                    zd0.u(bundle);
                    this.f74653L = fR;
                }
            }
        }
        return true;
    }

    private final void u0() throws zzib {
        if (this.f74678k0) {
            this.f74676i0 = 1;
            this.f74677j0 = 3;
        } else {
            Y();
            U();
        }
    }

    private final void x0() {
        try {
            ZD0 zd0 = this.f74649H;
            C8086gC.b(zd0);
            zd0.zzj();
        } finally {
            Z();
        }
    }

    @TargetApi(23)
    private final void y0() throws zzib {
        int i10 = this.f74677j0;
        if (i10 == 1) {
            x0();
            return;
        }
        if (i10 == 2) {
            x0();
            k0();
        } else if (i10 != 3) {
            this.f74684q0 = true;
            G0();
        } else {
            Y();
            U();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.Ly0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void B(com.google.android.gms.internal.ads.C[] r13, long r14, long r16, com.google.android.gms.internal.ads.C7453aF0 r18) throws com.google.android.gms.internal.ads.zzib {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.fE0 r13 = r12.f74690t0
            long r0 = r13.f74066c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            com.google.android.gms.internal.ads.fE0 r4 = new com.google.android.gms.internal.ads.fE0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.j0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.f74700z
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L52
            long r0 = r12.f74681n0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L36
            long r4 = r12.f74692u0
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 == 0) goto L52
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L52
        L36:
            com.google.android.gms.internal.ads.fE0 r5 = new com.google.android.gms.internal.ads.fE0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.j0(r5)
            com.google.android.gms.internal.ads.fE0 r13 = r12.f74690t0
            long r13 = r13.f74066c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.F0()
        L51:
            return
        L52:
            java.util.ArrayDeque r13 = r12.f74700z
            com.google.android.gms.internal.ads.fE0 r5 = new com.google.android.gms.internal.ads.fE0
            long r6 = r12.f74681n0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC8198hE0.B(com.google.android.gms.internal.ads.C[], long, long, com.google.android.gms.internal.ads.aF0):void");
    }

    protected final long L0() {
        return this.f74690t0.f74066c;
    }

    protected final long M0() {
        return this.f74690t0.f74065b;
    }

    protected zzsf S(Throwable th2, C7558bE0 c7558bE0) {
        return new zzsf(th2, c7558bE0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x043a A[Catch: Exception -> 0x0176, TryCatch #3 {Exception -> 0x0176, blocks: (B:77:0x0153, B:79:0x016b, B:82:0x0179, B:84:0x017e, B:85:0x0188, B:87:0x018c, B:88:0x0196, B:90:0x019a, B:91:0x01a0, B:93:0x01a8, B:95:0x01b6, B:110:0x0215, B:97:0x01be, B:99:0x01c6, B:100:0x01cc, B:102:0x01d4, B:103:0x01da, B:105:0x01e2, B:106:0x01e8, B:108:0x01f0, B:109:0x01f6, B:111:0x021a, B:113:0x022a, B:115:0x022f, B:117:0x0233, B:118:0x0247, B:120:0x024b, B:122:0x0251, B:124:0x0257, B:125:0x0265, B:127:0x026b, B:128:0x0275, B:130:0x027a, B:131:0x0284, B:133:0x0289, B:134:0x0293, B:136:0x0297, B:137:0x02a1, B:140:0x02ab, B:141:0x02c1, B:143:0x02c5, B:145:0x02d5, B:146:0x02da, B:148:0x02de, B:149:0x02e3, B:150:0x02e9, B:152:0x02ed, B:154:0x02fd, B:156:0x0309, B:158:0x030d, B:159:0x0312, B:161:0x0316, B:162:0x031b, B:164:0x031f, B:165:0x0324, B:167:0x0328, B:168:0x032d, B:170:0x0331, B:171:0x0336, B:173:0x033a, B:174:0x033f, B:176:0x0343, B:177:0x0348, B:179:0x034c, B:180:0x0351, B:182:0x0355, B:183:0x035a, B:185:0x035e, B:186:0x0363, B:188:0x0367, B:189:0x036c, B:191:0x0370, B:192:0x0375, B:194:0x0379, B:195:0x037e, B:197:0x0382, B:198:0x0387, B:200:0x038b, B:201:0x0390, B:203:0x039a, B:205:0x03a0, B:206:0x03aa, B:208:0x03c0, B:210:0x03cd, B:212:0x03d5, B:214:0x03df, B:216:0x03e7, B:218:0x03ef, B:238:0x0434, B:240:0x043a, B:244:0x0446, B:246:0x044c, B:250:0x0458, B:252:0x045e, B:256:0x046a, B:258:0x0470, B:283:0x04c8, B:285:0x04ce, B:287:0x04d4, B:288:0x04e1, B:290:0x04f9, B:263:0x047e, B:265:0x0486, B:267:0x048e, B:269:0x0496, B:271:0x049e, B:273:0x04a6, B:275:0x04ae, B:277:0x04b8, B:279:0x04c2, B:223:0x03fd, B:225:0x0405, B:229:0x0410, B:231:0x041a, B:233:0x0422, B:235:0x042a, B:292:0x04fb, B:293:0x0500, B:295:0x0505, B:72:0x0113), top: B:323:0x0153, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04ce A[Catch: Exception -> 0x0176, TryCatch #3 {Exception -> 0x0176, blocks: (B:77:0x0153, B:79:0x016b, B:82:0x0179, B:84:0x017e, B:85:0x0188, B:87:0x018c, B:88:0x0196, B:90:0x019a, B:91:0x01a0, B:93:0x01a8, B:95:0x01b6, B:110:0x0215, B:97:0x01be, B:99:0x01c6, B:100:0x01cc, B:102:0x01d4, B:103:0x01da, B:105:0x01e2, B:106:0x01e8, B:108:0x01f0, B:109:0x01f6, B:111:0x021a, B:113:0x022a, B:115:0x022f, B:117:0x0233, B:118:0x0247, B:120:0x024b, B:122:0x0251, B:124:0x0257, B:125:0x0265, B:127:0x026b, B:128:0x0275, B:130:0x027a, B:131:0x0284, B:133:0x0289, B:134:0x0293, B:136:0x0297, B:137:0x02a1, B:140:0x02ab, B:141:0x02c1, B:143:0x02c5, B:145:0x02d5, B:146:0x02da, B:148:0x02de, B:149:0x02e3, B:150:0x02e9, B:152:0x02ed, B:154:0x02fd, B:156:0x0309, B:158:0x030d, B:159:0x0312, B:161:0x0316, B:162:0x031b, B:164:0x031f, B:165:0x0324, B:167:0x0328, B:168:0x032d, B:170:0x0331, B:171:0x0336, B:173:0x033a, B:174:0x033f, B:176:0x0343, B:177:0x0348, B:179:0x034c, B:180:0x0351, B:182:0x0355, B:183:0x035a, B:185:0x035e, B:186:0x0363, B:188:0x0367, B:189:0x036c, B:191:0x0370, B:192:0x0375, B:194:0x0379, B:195:0x037e, B:197:0x0382, B:198:0x0387, B:200:0x038b, B:201:0x0390, B:203:0x039a, B:205:0x03a0, B:206:0x03aa, B:208:0x03c0, B:210:0x03cd, B:212:0x03d5, B:214:0x03df, B:216:0x03e7, B:218:0x03ef, B:238:0x0434, B:240:0x043a, B:244:0x0446, B:246:0x044c, B:250:0x0458, B:252:0x045e, B:256:0x046a, B:258:0x0470, B:283:0x04c8, B:285:0x04ce, B:287:0x04d4, B:288:0x04e1, B:290:0x04f9, B:263:0x047e, B:265:0x0486, B:267:0x048e, B:269:0x0496, B:271:0x049e, B:273:0x04a6, B:275:0x04ae, B:277:0x04b8, B:279:0x04c2, B:223:0x03fd, B:225:0x0405, B:229:0x0410, B:231:0x041a, B:233:0x0422, B:235:0x042a, B:292:0x04fb, B:293:0x0500, B:295:0x0505, B:72:0x0113), top: B:323:0x0153, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0521 A[Catch: zzsj -> 0x0082, TryCatch #5 {zzsj -> 0x0082, blocks: (B:25:0x0057, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:296:0x0506, B:298:0x0521, B:300:0x052a, B:303:0x0531, B:304:0x0533, B:299:0x0524, B:306:0x0536, B:307:0x0537, B:309:0x053c, B:310:0x053d, B:311:0x0547, B:38:0x008a, B:39:0x0092, B:313:0x0549), top: B:326:0x0057, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0524 A[Catch: zzsj -> 0x0082, TryCatch #5 {zzsj -> 0x0082, blocks: (B:25:0x0057, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:296:0x0506, B:298:0x0521, B:300:0x052a, B:303:0x0531, B:304:0x0533, B:299:0x0524, B:306:0x0536, B:307:0x0537, B:309:0x053c, B:310:0x053d, B:311:0x0547, B:38:0x008a, B:39:0x0092, B:313:0x0549), top: B:326:0x0057, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0531 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.media.MediaCrypto, com.google.android.gms.internal.ads.gE0] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void U() throws com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC8198hE0.U():void");
    }

    protected void V(long j10) {
        this.f74692u0 = j10;
        while (!this.f74700z.isEmpty() && j10 >= ((C7984fE0) this.f74700z.peek()).f74064a) {
            C7984fE0 c7984fE0 = (C7984fE0) this.f74700z.poll();
            c7984fE0.getClass();
            j0(c7984fE0);
            F0();
        }
    }

    protected final boolean c0() {
        if (this.f74649H == null) {
            return false;
        }
        int i10 = this.f74677j0;
        if (i10 == 3 || ((this.f74658Q && !this.f74680m0) || (this.f74659R && this.f74679l0))) {
            Y();
            return true;
        }
        if (i10 == 2) {
            int i11 = OV.f69091a;
            C8086gC.f(i11 >= 23);
            if (i11 >= 23) {
                try {
                    k0();
                } catch (zzib e10) {
                    C9917xL.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    Y();
                    return true;
                }
            }
        }
        x0();
        return false;
    }

    protected final boolean e0(C c10) {
        return this.f74698x0 == null && I0(c10);
    }

    @Override // com.google.android.gms.internal.ads.IA0
    public final int f(C c10) throws zzib {
        try {
            return q0(this.f74687s, c10);
        } catch (zzsu e10) {
            throw G(e10, c10, false, 4002);
        }
    }

    @Override // com.google.android.gms.internal.ads.FA0
    public boolean o() {
        if (this.f74643B == null) {
            return false;
        }
        if (C() || m0()) {
            return true;
        }
        return this.f74665X != -9223372036854775807L && K().zzb() < this.f74665X;
    }

    @Override // com.google.android.gms.internal.ads.Ly0, com.google.android.gms.internal.ads.FA0
    public void s(float f10, float f11) throws zzib {
        this.f74647F = f10;
        this.f74648G = f11;
        p0(this.f74650I);
    }

    @Override // com.google.android.gms.internal.ads.Ly0, com.google.android.gms.internal.ads.AA0
    public void v(int i10, Object obj) throws zzib {
        if (i10 == 11) {
            this.f74645D = (EA0) obj;
        }
    }

    public AbstractC8198hE0(int i10, XD0 xd0, InterfaceC8410jE0 interfaceC8410jE0, boolean z10, float f10) {
        super(i10);
        this.f74685r = xd0;
        this.f74687s = interfaceC8410jE0;
        this.f74689t = f10;
        this.f74691u = new By0(0, 0);
        this.f74693v = new By0(0, 0);
        this.f74695w = new By0(2, 0);
        PD0 pd0 = new PD0();
        this.f74697x = pd0;
        this.f74699y = new MediaCodec.BufferInfo();
        this.f74647F = 1.0f;
        this.f74648G = 1.0f;
        this.f74700z = new ArrayDeque();
        this.f74690t0 = C7984fE0.f74063e;
        pd0.j(0);
        pd0.f65631d.order(ByteOrder.nativeOrder());
        this.f74642A = new C9157qD0();
        this.f74653L = -1.0f;
        this.f74657P = 0;
        this.f74675h0 = 0;
        this.f74666Y = -1;
        this.f74667Z = -1;
        this.f74665X = -9223372036854775807L;
        this.f74681n0 = -9223372036854775807L;
        this.f74682o0 = -9223372036854775807L;
        this.f74692u0 = -9223372036854775807L;
        this.f74664W = -9223372036854775807L;
        this.f74676i0 = 0;
        this.f74677j0 = 0;
        this.f74688s0 = new My0();
    }

    protected void Z() {
        E0();
        i0();
        this.f74665X = -9223372036854775807L;
        this.f74679l0 = false;
        this.f74664W = -9223372036854775807L;
        this.f74678k0 = false;
        this.f74661T = false;
        this.f74662U = false;
        this.f74669b0 = false;
        this.f74670c0 = false;
        this.f74681n0 = -9223372036854775807L;
        this.f74682o0 = -9223372036854775807L;
        this.f74692u0 = -9223372036854775807L;
        this.f74676i0 = 0;
        this.f74677j0 = 0;
        this.f74675h0 = this.f74674g0 ? 1 : 0;
    }

    protected final void a0() {
        Z();
        this.f74654M = null;
        this.f74656O = null;
        this.f74650I = null;
        this.f74651J = null;
        this.f74652K = false;
        this.f74680m0 = false;
        this.f74653L = -1.0f;
        this.f74657P = 0;
        this.f74658Q = false;
        this.f74659R = false;
        this.f74660S = false;
        this.f74663V = false;
        this.f74674g0 = false;
        this.f74675h0 = 0;
    }

    protected final boolean b0() throws zzib {
        boolean zC0 = c0();
        if (zC0) {
            U();
        }
        return zC0;
    }
}
