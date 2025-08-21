package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes6.dex */
public final class JH0 extends AbstractC8323hE0 implements InterfaceC8826m {

    /* renamed from: g1, reason: collision with root package name */
    private static final int[] f68699g1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: h1, reason: collision with root package name */
    private static boolean f68700h1;

    /* renamed from: i1, reason: collision with root package name */
    private static boolean f68701i1;

    /* renamed from: A0, reason: collision with root package name */
    private final boolean f68702A0;

    /* renamed from: B0, reason: collision with root package name */
    private final E f68703B0;

    /* renamed from: C0, reason: collision with root package name */
    private final boolean f68704C0;

    /* renamed from: D0, reason: collision with root package name */
    private final C8933n f68705D0;

    /* renamed from: E0, reason: collision with root package name */
    private final C8719l f68706E0;

    /* renamed from: F0, reason: collision with root package name */
    private IH0 f68707F0;

    /* renamed from: G0, reason: collision with root package name */
    private boolean f68708G0;

    /* renamed from: H0, reason: collision with root package name */
    private boolean f68709H0;

    /* renamed from: I0, reason: collision with root package name */
    private J f68710I0;

    /* renamed from: J0, reason: collision with root package name */
    private boolean f68711J0;

    /* renamed from: K0, reason: collision with root package name */
    private List f68712K0;

    /* renamed from: L0, reason: collision with root package name */
    private Surface f68713L0;

    /* renamed from: M0, reason: collision with root package name */
    private MH0 f68714M0;

    /* renamed from: N0, reason: collision with root package name */
    private C8232gR f68715N0;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f68716O0;

    /* renamed from: P0, reason: collision with root package name */
    private int f68717P0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f68718Q0;

    /* renamed from: R0, reason: collision with root package name */
    private long f68719R0;

    /* renamed from: S0, reason: collision with root package name */
    private int f68720S0;

    /* renamed from: T0, reason: collision with root package name */
    private int f68721T0;

    /* renamed from: U0, reason: collision with root package name */
    private int f68722U0;

    /* renamed from: V0, reason: collision with root package name */
    private long f68723V0;

    /* renamed from: W0, reason: collision with root package name */
    private int f68724W0;

    /* renamed from: X0, reason: collision with root package name */
    private long f68725X0;

    /* renamed from: Y0, reason: collision with root package name */
    private C9238ps f68726Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private C9238ps f68727Z0;

    /* renamed from: a1, reason: collision with root package name */
    private int f68728a1;

    /* renamed from: b1, reason: collision with root package name */
    private int f68729b1;

    /* renamed from: c1, reason: collision with root package name */
    private InterfaceC8612k f68730c1;

    /* renamed from: d1, reason: collision with root package name */
    private long f68731d1;

    /* renamed from: e1, reason: collision with root package name */
    private long f68732e1;

    /* renamed from: f1, reason: collision with root package name */
    private boolean f68733f1;

    /* renamed from: z0, reason: collision with root package name */
    private final Context f68734z0;

    public JH0(Context context, XD0 xd0, InterfaceC8535jE0 interfaceC8535jE0, long j10, boolean z10, Handler handler, F f10, int i10, float f11) {
        super(2, xd0, interfaceC8535jE0, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f68734z0 = applicationContext;
        this.f68710I0 = null;
        this.f68703B0 = new E(handler, f10);
        this.f68702A0 = true;
        this.f68705D0 = new C8933n(applicationContext, this, 0L);
        this.f68706E0 = new C8719l();
        this.f68704C0 = "NVIDIA".equals(OV.f69933c);
        this.f68715N0 = C8232gR.f75152c;
        this.f68717P0 = 1;
        this.f68718Q0 = 0;
        this.f68726Y0 = C9238ps.f78484d;
        this.f68729b1 = 0;
        this.f68727Z0 = null;
        this.f68728a1 = -1000;
        this.f68731d1 = -9223372036854775807L;
        this.f68732e1 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final void B0(String str, WD0 wd0, long j10, long j11) {
        this.f68703B0.a(str, j10, j11);
        this.f68708G0 = T0(str);
        C7683bE0 c7683bE0T = T();
        c7683bE0T.getClass();
        boolean z10 = false;
        if (OV.f69931a >= 29 && "video/x-vnd.on2.vp9".equals(c7683bE0T.f73608b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = c7683bE0T.h();
            int length = codecProfileLevelArrH.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArrH[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.f68709H0 = z10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0, com.google.android.gms.internal.ads.Ly0
    protected final void O() {
        this.f68727Z0 = null;
        this.f68732e1 = -9223372036854775807L;
        J j10 = this.f68710I0;
        if (j10 != null) {
            j10.zzh();
        } else {
            this.f68705D0.d();
        }
        this.f68716O0 = false;
        try {
            super.O();
        } finally {
            this.f68703B0.c(this.f75528s0);
            this.f68703B0.t(C9238ps.f78484d);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final float R(float f10, C c10, C[] cArr) {
        float fMax = -1.0f;
        for (C c11 : cArr) {
            float f11 = c11.f66513x;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    protected final void R0(long j10) {
        My0 my0 = this.f75528s0;
        my0.f69618k += j10;
        my0.f69619l++;
        this.f68723V0 += j10;
        this.f68724W0++;
    }

    @Override // com.google.android.gms.internal.ads.FA0, com.google.android.gms.internal.ads.IA0
    public final String b() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0, com.google.android.gms.internal.ads.Ly0, com.google.android.gms.internal.ads.AA0
    public final void v(int i10, Object obj) throws zzib {
        if (i10 == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            if (this.f68713L0 == surface) {
                if (surface != null) {
                    X0();
                    Surface surface2 = this.f68713L0;
                    if (surface2 == null || !this.f68716O0) {
                        return;
                    }
                    this.f68703B0.q(surface2);
                    return;
                }
                return;
            }
            this.f68713L0 = surface;
            if (this.f68710I0 == null) {
                this.f68705D0.m(surface);
            }
            this.f68716O0 = false;
            int iK = k();
            ZD0 zd0O0 = O0();
            if (zd0O0 != null && this.f68710I0 == null) {
                C7683bE0 c7683bE0T = T();
                c7683bE0T.getClass();
                boolean zF1 = f1(c7683bE0T);
                int i11 = OV.f69931a;
                if (i11 < 23 || !zF1 || this.f68708G0) {
                    Y();
                    U();
                } else {
                    Surface surfaceV0 = V0(c7683bE0T);
                    if (i11 >= 23 && surfaceV0 != null) {
                        zd0O0.b(surfaceV0);
                    } else {
                        if (i11 < 35) {
                            throw new IllegalStateException();
                        }
                        zd0O0.zzi();
                    }
                }
            }
            if (surface == null) {
                this.f68727Z0 = null;
                J j10 = this.f68710I0;
                if (j10 != null) {
                    j10.zzb();
                    return;
                }
                return;
            }
            X0();
            if (iK == 2) {
                J j11 = this.f68710I0;
                if (j11 != null) {
                    j11.n0(true);
                    return;
                } else {
                    this.f68705D0.c(true);
                    return;
                }
            }
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            InterfaceC8612k interfaceC8612k = (InterfaceC8612k) obj;
            this.f68730c1 = interfaceC8612k;
            J j12 = this.f68710I0;
            if (j12 != null) {
                j12.e(interfaceC8612k);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f68729b1 != iIntValue) {
                this.f68729b1 = iIntValue;
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.f68728a1 = ((Integer) obj).intValue();
            ZD0 zd0O02 = O0();
            if (zd0O02 == null || OV.f69931a < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f68728a1));
            zd0O02.u(bundle);
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f68717P0 = iIntValue2;
            ZD0 zd0O03 = O0();
            if (zd0O03 != null) {
                zd0O03.H0(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f68718Q0 = iIntValue3;
            J j13 = this.f68710I0;
            if (j13 != null) {
                j13.b(iIntValue3);
                return;
            } else {
                this.f68705D0.j(iIntValue3);
                return;
            }
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f68712K0 = list;
            J j14 = this.f68710I0;
            if (j14 != null) {
                j14.j0(list);
                return;
            }
            return;
        }
        if (i10 != 14) {
            super.v(i10, obj);
            return;
        }
        obj.getClass();
        C8232gR c8232gR = (C8232gR) obj;
        if (c8232gR.b() == 0 || c8232gR.a() == 0) {
            return;
        }
        this.f68715N0 = c8232gR;
        J j15 = this.f68710I0;
        if (j15 != null) {
            Surface surface3 = this.f68713L0;
            C8211gC.b(surface3);
            j15.f(surface3, c8232gR);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ly0
    protected final void z() {
        this.f68720S0 = 0;
        this.f68719R0 = K().zzb();
        this.f68723V0 = 0L;
        this.f68724W0 = 0;
        J j10 = this.f68710I0;
        if (j10 != null) {
            j10.zzj();
        } else {
            this.f68705D0.g();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final boolean T0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.JH0.T0(java.lang.String):boolean");
    }

    protected static final boolean U0(C7683bE0 c7683bE0) {
        return OV.f69931a >= 35 && c7683bE0.f73614h;
    }

    private final Surface V0(C7683bE0 c7683bE0) {
        J j10 = this.f68710I0;
        if (j10 != null) {
            return j10.zza();
        }
        Surface surface = this.f68713L0;
        if (surface != null) {
            return surface;
        }
        if (U0(c7683bE0)) {
            return null;
        }
        C8211gC.f(g1(c7683bE0));
        MH0 mh0 = this.f68714M0;
        if (mh0 != null) {
            if (mh0.f69460a != c7683bE0.f73612f) {
                e1();
            }
        }
        if (this.f68714M0 == null) {
            this.f68714M0 = MH0.a(this.f68734z0, c7683bE0.f73612f);
        }
        return this.f68714M0;
    }

    private static List W0(Context context, InterfaceC8535jE0 interfaceC8535jE0, C c10, boolean z10, boolean z11) throws zzsu {
        String str = c10.f66504o;
        if (str == null) {
            return AbstractC8042eh0.t();
        }
        if (OV.f69931a >= 26 && "video/dolby-vision".equals(str) && !HH0.a(context)) {
            List listC = C9711uE0.c(interfaceC8535jE0, c10, z10, z11);
            if (!listC.isEmpty()) {
                return listC;
            }
        }
        return C9711uE0.e(interfaceC8535jE0, c10, z10, z11);
    }

    private final void X0() {
        C9238ps c9238ps = this.f68727Z0;
        if (c9238ps != null) {
            this.f68703B0.t(c9238ps);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0() {
        this.f68703B0.q(this.f68713L0);
        this.f68716O0 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int Z0(com.google.android.gms.internal.ads.C7683bE0 r10, com.google.android.gms.internal.ads.C r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.JH0.Z0(com.google.android.gms.internal.ads.bE0, com.google.android.gms.internal.ads.C):int");
    }

    protected static int a1(C7683bE0 c7683bE0, C c10) {
        if (c10.f66505p == -1) {
            return Z0(c7683bE0, c10);
        }
        int size = c10.f66507r.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) c10.f66507r.get(i10)).length;
        }
        return c10.f66505p + length;
    }

    private final void e1() {
        MH0 mh0 = this.f68714M0;
        if (mh0 != null) {
            mh0.release();
            this.f68714M0 = null;
        }
    }

    private final boolean f1(C7683bE0 c7683bE0) {
        Surface surface = this.f68713L0;
        return (surface != null && surface.isValid()) || U0(c7683bE0) || g1(c7683bE0);
    }

    private final boolean g1(C7683bE0 c7683bE0) {
        if (OV.f69931a < 23 || T0(c7683bE0.f73607a)) {
            return false;
        }
        return !c7683bE0.f73612f || MH0.b(this.f68734z0);
    }

    @Override // com.google.android.gms.internal.ads.Ly0
    protected final void A() {
        if (this.f68720S0 > 0) {
            long jZzb = K().zzb();
            this.f68703B0.d(this.f68720S0, jZzb - this.f68719R0);
            this.f68720S0 = 0;
            this.f68719R0 = jZzb;
        }
        int i10 = this.f68724W0;
        if (i10 != 0) {
            this.f68703B0.r(this.f68723V0, i10);
            this.f68723V0 = 0L;
            this.f68724W0 = 0;
        }
        J j10 = this.f68710I0;
        if (j10 != null) {
            j10.zzk();
        } else {
            this.f68705D0.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final void A0(Exception exc) {
        C10042xL.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f68703B0.s(exc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final void C0(String str) {
        this.f68703B0.b(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final void F0() {
        J j10 = this.f68710I0;
        if (j10 != null) {
            j10.d(M0(), L0(), -this.f68731d1, I());
        } else {
            this.f68705D0.f();
        }
        this.f68733f1 = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final boolean H0(long j10, long j11, ZD0 zd0, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C c10) throws zzib {
        zd0.getClass();
        long jL0 = j12 - L0();
        J j13 = this.f68710I0;
        if (j13 != null) {
            try {
                return j13.i(j12 + (-this.f68731d1), z11, j10, j11, new GH0(this, zd0, i10, jL0));
            } catch (zzabg e10) {
                throw G(e10, e10.f81412a, false, 7001);
            }
        }
        int iA = this.f68705D0.a(j12, j10, j11, M0(), z11, this.f68706E0);
        if (iA == 4) {
            return false;
        }
        if (z10 && !z11) {
            P0(zd0, i10, jL0);
            return true;
        }
        if (this.f68713L0 == null) {
            if (this.f68706E0.c() >= 30000) {
                return false;
            }
            P0(zd0, i10, jL0);
            R0(this.f68706E0.c());
            return true;
        }
        if (iA == 0) {
            d1(zd0, i10, jL0, K().zzc());
            R0(this.f68706E0.c());
            return true;
        }
        if (iA == 1) {
            C8719l c8719l = this.f68706E0;
            long jD = c8719l.d();
            long jC = c8719l.c();
            if (jD == this.f68725X0) {
                P0(zd0, i10, jL0);
            } else {
                d1(zd0, i10, jL0, jD);
            }
            R0(jC);
            this.f68725X0 = jD;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            zd0.e(i10, false);
            Trace.endSection();
            Q0(0, 1);
            R0(this.f68706E0.c());
            return true;
        }
        if (iA != 3) {
            if (iA == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(iA));
        }
        P0(zd0, i10, jL0);
        R0(this.f68706E0.c());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final int K0(By0 by0) {
        int i10 = OV.f69931a;
        return 0;
    }

    protected final void P0(ZD0 zd0, int i10, long j10) {
        Trace.beginSection("skipVideoBuffer");
        zd0.e(i10, false);
        Trace.endSection();
        this.f75528s0.f69613f++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0, com.google.android.gms.internal.ads.Ly0
    protected final void Q(long j10, boolean z10) throws zzib {
        J j11 = this.f68710I0;
        if (j11 != null) {
            j11.c(true);
            this.f68710I0.d(M0(), L0(), -this.f68731d1, I());
            this.f68733f1 = true;
        }
        super.Q(j10, z10);
        if (this.f68710I0 == null) {
            this.f68705D0.i();
        }
        if (z10) {
            J j12 = this.f68710I0;
            if (j12 != null) {
                j12.n0(false);
            } else {
                this.f68705D0.c(false);
            }
        }
        this.f68721T0 = 0;
    }

    protected final void Q0(int i10, int i11) {
        My0 my0 = this.f75528s0;
        my0.f69615h += i10;
        int i12 = i10 + i11;
        my0.f69614g += i12;
        this.f68720S0 += i12;
        int i13 = this.f68721T0 + i12;
        this.f68721T0 = i13;
        my0.f69616i = Math.max(i13, my0.f69616i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final zzsf S(Throwable th2, C7683bE0 c7683bE0) {
        return new zzzk(th2, c7683bE0, this.f68713L0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final void W(By0 by0) throws zzib {
        this.f68722U0++;
        int i10 = OV.f69931a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final void X(C c10) throws zzib {
        J j10 = this.f68710I0;
        if (j10 == null || j10.zzw()) {
            return;
        }
        try {
            j10.g(c10);
        } catch (zzabg e10) {
            throw G(e10, c10, false, 7000);
        }
    }

    protected final void d1(ZD0 zd0, int i10, long j10, long j11) {
        Trace.beginSection("releaseOutputBuffer");
        zd0.d(i10, j11);
        Trace.endSection();
        this.f75528s0.f69612e++;
        this.f68721T0 = 0;
        if (this.f68710I0 == null) {
            C9238ps c9238ps = this.f68726Y0;
            if (!c9238ps.equals(C9238ps.f78484d) && !c9238ps.equals(this.f68727Z0)) {
                this.f68727Z0 = c9238ps;
                this.f68703B0.t(c9238ps);
            }
            if (!this.f68705D0.p() || this.f68713L0 == null) {
                return;
            }
            Y0();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final int q0(InterfaceC8535jE0 interfaceC8535jE0, C c10) throws zzsu {
        boolean z10;
        if (!C7182Pc.i(c10.f66504o)) {
            return 128;
        }
        Context context = this.f68734z0;
        int i10 = 0;
        boolean z11 = c10.f66508s != null;
        List listW0 = W0(context, interfaceC8535jE0, c10, z11, false);
        if (z11 && listW0.isEmpty()) {
            listW0 = W0(context, interfaceC8535jE0, c10, false, false);
        }
        if (listW0.isEmpty()) {
            return 129;
        }
        if (!AbstractC8323hE0.h0(c10)) {
            return 130;
        }
        C7683bE0 c7683bE0 = (C7683bE0) listW0.get(0);
        boolean zE = c7683bE0.e(c10);
        if (zE) {
            z10 = true;
        } else {
            for (int i11 = 1; i11 < listW0.size(); i11++) {
                C7683bE0 c7683bE02 = (C7683bE0) listW0.get(i11);
                if (c7683bE02.e(c10)) {
                    zE = true;
                    z10 = false;
                    c7683bE0 = c7683bE02;
                    break;
                }
            }
            z10 = true;
        }
        int i12 = true != zE ? 3 : 4;
        int i13 = true != c7683bE0.f(c10) ? 8 : 16;
        int i14 = true != c7683bE0.f73613g ? 0 : 64;
        int i15 = true != z10 ? 0 : 128;
        if (OV.f69931a >= 26 && "video/dolby-vision".equals(c10.f66504o) && !HH0.a(context)) {
            i15 = 256;
        }
        if (zE) {
            List listW02 = W0(context, interfaceC8535jE0, c10, z11, true);
            if (!listW02.isEmpty()) {
                C7683bE0 c7683bE03 = (C7683bE0) C9711uE0.f(listW02, c10).get(0);
                if (c7683bE03.e(c10) && c7683bE03.f(c10)) {
                    i10 = 32;
                }
            }
        }
        return i12 | i13 | i10 | i14 | i15;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final WD0 v0(C7683bE0 c7683bE0, C c10, MediaCrypto mediaCrypto, float f10) {
        Point pointA;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int iZ0;
        C[] cArrD = D();
        int length = cArrD.length;
        int iA1 = a1(c7683bE0, c10);
        int iMax = c10.f66511v;
        int iMax2 = c10.f66512w;
        if (length != 1) {
            boolean z11 = false;
            for (int i14 = 0; i14 < length; i14++) {
                C cH = cArrD[i14];
                if (c10.f66480C != null && cH.f66480C == null) {
                    C9717uH0 c9717uH0B = cH.b();
                    c9717uH0B.b(c10.f66480C);
                    cH = c9717uH0B.H();
                }
                if (c7683bE0.b(c10, cH).f69820d != 0) {
                    int i15 = cH.f66511v;
                    z11 |= i15 == -1 || cH.f66512w == -1;
                    iMax = Math.max(iMax, i15);
                    iMax2 = Math.max(iMax2, cH.f66512w);
                    iA1 = Math.max(iA1, a1(c7683bE0, cH));
                }
            }
            if (z11) {
                C10042xL.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i16 = c10.f66512w;
                int i17 = c10.f66511v;
                boolean z12 = i16 > i17;
                int i18 = z12 ? i16 : i17;
                if (true == z12) {
                    i16 = i17;
                }
                int[] iArr = f68699g1;
                int i19 = 0;
                while (i19 < 9) {
                    float f11 = i16;
                    float f12 = i18;
                    int[] iArr2 = iArr;
                    int i20 = iArr2[i19];
                    float f13 = i20;
                    if (i20 <= i18 || (i10 = (int) (f13 * (f11 / f12))) <= i16) {
                        break;
                    }
                    if (true != z12) {
                        i11 = i16;
                        i12 = i20;
                    } else {
                        i11 = i16;
                        i12 = i10;
                    }
                    if (true != z12) {
                        i20 = i10;
                    }
                    pointA = c7683bE0.a(i12, i20);
                    float f14 = c10.f66513x;
                    if (pointA != null) {
                        z10 = z12;
                        if (c7683bE0.g(pointA.x, pointA.y, f14)) {
                            break;
                        }
                    } else {
                        z10 = z12;
                    }
                    i19++;
                    iArr = iArr2;
                    i16 = i11;
                    z12 = z10;
                }
                pointA = null;
                if (pointA != null) {
                    iMax = Math.max(iMax, pointA.x);
                    iMax2 = Math.max(iMax2, pointA.y);
                    C9717uH0 c9717uH0B2 = c10.b();
                    c9717uH0B2.G(iMax);
                    c9717uH0B2.k(iMax2);
                    iA1 = Math.max(iA1, Z0(c7683bE0, c9717uH0B2.H()));
                    C10042xL.f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
        } else if (iA1 != -1 && (iZ0 = Z0(c7683bE0, c10)) != -1) {
            iA1 = Math.min((int) (iA1 * 1.5f), iZ0);
        }
        String str = c7683bE0.f73609c;
        IH0 ih0 = new IH0(iMax, iMax2, iA1);
        this.f68707F0 = ih0;
        boolean z13 = this.f68704C0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c10.f66511v);
        mediaFormat.setInteger("height", c10.f66512w);
        ZM.b(mediaFormat, c10.f66507r);
        float f15 = c10.f66513x;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        ZM.a(mediaFormat, "rotation-degrees", c10.f66514y);
        Vz0 vz0 = c10.f66480C;
        if (vz0 != null) {
            ZM.a(mediaFormat, "color-transfer", vz0.f71802c);
            ZM.a(mediaFormat, "color-standard", vz0.f71800a);
            ZM.a(mediaFormat, "color-range", vz0.f71801b);
            byte[] bArr = vz0.f71803d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c10.f66504o)) {
            int i21 = C9711uE0.f79617b;
            Pair pairA = C8427iD.a(c10);
            if (pairA != null) {
                ZM.a(mediaFormat, "profile", ((Integer) pairA.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", ih0.f68428a);
        mediaFormat.setInteger("max-height", ih0.f68429b);
        ZM.a(mediaFormat, "max-input-size", ih0.f68430c);
        int i22 = OV.f69931a;
        if (i22 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z13) {
            mediaFormat.setInteger("no-post-process", 1);
            i13 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i13 = 0;
        }
        if (i22 >= 35) {
            mediaFormat.setInteger("importance", Math.max(i13, -this.f68728a1));
        }
        Surface surfaceV0 = V0(c7683bE0);
        if (this.f68710I0 != null && !OV.k(this.f68734z0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return WD0.b(c7683bE0, mediaFormat, c10, surfaceV0, null);
    }

    @Override // com.google.android.gms.internal.ads.Ly0
    protected final void w() {
        J j10 = this.f68710I0;
        if (j10 == null || !this.f68702A0) {
            return;
        }
        j10.zzl();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final List w0(InterfaceC8535jE0 interfaceC8535jE0, C c10, boolean z10) throws zzsu {
        return C9711uE0.f(W0(this.f68734z0, interfaceC8535jE0, c10, false, false), c10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    @TargetApi(29)
    protected final void z0(By0 by0) throws zzib {
        if (this.f68709H0) {
            ByteBuffer byteBuffer = by0.f66474g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        ZD0 zd0O0 = O0();
                        zd0O0.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zd0O0.u(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ly0, com.google.android.gms.internal.ads.FA0
    public final void zzt() {
        J j10 = this.f68710I0;
        if (j10 != null) {
            j10.zzc();
        } else {
            this.f68705D0.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0, com.google.android.gms.internal.ads.Ly0
    protected final void B(C[] cArr, long j10, long j11, C7578aF0 c7578aF0) throws zzib {
        super.B(cArr, j10, j11, c7578aF0);
        if (this.f68731d1 == -9223372036854775807L) {
            this.f68731d1 = j10;
        }
        AbstractC7432Wl abstractC7432WlJ = J();
        if (abstractC7432WlJ.o()) {
            this.f68732e1 = -9223372036854775807L;
        } else {
            this.f68732e1 = abstractC7432WlJ.n(c7578aF0.f73222a, new C7431Wk()).f71991d;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final void D0(C c10, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        ZD0 zd0O0 = O0();
        if (zd0O0 != null) {
            zd0O0.H0(this.f68717P0);
        }
        mediaFormat.getClass();
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        float integer3 = c10.f66515z;
        if (OV.f69931a >= 30 && mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            integer3 = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        int i10 = c10.f66514y;
        if (i10 == 90 || i10 == 270) {
            integer3 = 1.0f / integer3;
            int i11 = integer2;
            integer2 = integer;
            integer = i11;
        }
        this.f68726Y0 = new C9238ps(integer, integer2, integer3);
        J j10 = this.f68710I0;
        if (j10 != null && this.f68733f1) {
            C9717uH0 c9717uH0B = c10.b();
            c9717uH0B.G(integer);
            c9717uH0B.k(integer2);
            c9717uH0B.w(integer3);
            j10.j(1, c9717uH0B.H());
        } else {
            this.f68705D0.l(c10.f66513x);
        }
        this.f68733f1 = false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0, com.google.android.gms.internal.ads.Ly0
    protected final void P(boolean z10, boolean z11) throws zzib {
        super.P(z10, z11);
        M();
        this.f68703B0.e(this.f75528s0);
        if (!this.f68711J0) {
            if (this.f68712K0 != null && this.f68710I0 == null) {
                QH0 qh0 = new QH0(this.f68734z0, this.f68705D0);
                qh0.d(K());
                this.f68710I0 = qh0.e().h();
            }
            this.f68711J0 = true;
        }
        J j10 = this.f68710I0;
        if (j10 != null) {
            j10.m(new FH0(this), C8048ek0.c());
            InterfaceC8612k interfaceC8612k = this.f68730c1;
            if (interfaceC8612k != null) {
                this.f68710I0.e(interfaceC8612k);
            }
            if (this.f68713L0 != null && !this.f68715N0.equals(C8232gR.f75152c)) {
                this.f68710I0.f(this.f68713L0, this.f68715N0);
            }
            this.f68710I0.b(this.f68718Q0);
            this.f68710I0.M(J0());
            List list = this.f68712K0;
            if (list != null) {
                this.f68710I0.j0(list);
            }
            this.f68710I0.h(z11);
            return;
        }
        this.f68705D0.k(K());
        this.f68705D0.e(z11);
    }

    protected final boolean S0(long j10, boolean z10) throws zzib {
        int iH = H(j10);
        if (iH == 0) {
            return false;
        }
        if (z10) {
            My0 my0 = this.f75528s0;
            my0.f69611d += iH;
            my0.f69613f += this.f68722U0;
        } else {
            this.f75528s0.f69617j++;
            Q0(iH, this.f68722U0);
        }
        b0();
        J j11 = this.f68710I0;
        if (j11 != null) {
            j11.c(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final void V(long j10) {
        super.V(j10);
        this.f68722U0--;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final void Z() {
        super.Z();
        this.f68722U0 = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0, com.google.android.gms.internal.ads.FA0
    public final boolean a() {
        if (super.a()) {
            J j10 = this.f68710I0;
            if (j10 == null) {
                return true;
            }
            j10.zzv();
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final boolean f0(C7683bE0 c7683bE0) {
        return f1(c7683bE0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final boolean g0(By0 by0) {
        if (by0.i() && !d() && !by0.h() && this.f68732e1 != -9223372036854775807L) {
            if (this.f68732e1 - (by0.f66473f - L0()) > 100000 && !by0.l() && by0.f66473f < I()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0, com.google.android.gms.internal.ads.FA0
    public final void m(long j10, long j11) throws zzib {
        super.m(j10, j11);
        J j12 = this.f68710I0;
        if (j12 != null) {
            try {
                j12.k(j10, j11);
            } catch (zzabg e10) {
                throw G(e10, e10.f81412a, false, 7001);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0, com.google.android.gms.internal.ads.FA0
    public final boolean o() {
        boolean zO = super.o();
        J j10 = this.f68710I0;
        if (j10 != null) {
            return j10.I(zO);
        }
        if (zO && (O0() == null || this.f68713L0 == null)) {
            return true;
        }
        return this.f68705D0.o(zO);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final Ny0 r0(C7683bE0 c7683bE0, C c10, C c11) {
        int i10;
        int i11;
        Ny0 ny0B = c7683bE0.b(c10, c11);
        int i12 = ny0B.f69821e;
        IH0 ih0 = this.f68707F0;
        ih0.getClass();
        if (c11.f66511v > ih0.f68428a || c11.f66512w > ih0.f68429b) {
            i12 |= 256;
        }
        if (a1(c7683bE0, c11) > ih0.f68430c) {
            i12 |= 64;
        }
        String str = c7683bE0.f73607a;
        if (i12 != 0) {
            i11 = 0;
            i10 = i12;
        } else {
            i10 = 0;
            i11 = ny0B.f69820d;
        }
        return new Ny0(str, c10, c11, i11, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0, com.google.android.gms.internal.ads.Ly0, com.google.android.gms.internal.ads.FA0
    public final void s(float f10, float f11) throws zzib {
        super.s(f10, f11);
        J j10 = this.f68710I0;
        if (j10 != null) {
            j10.M(f10);
        } else {
            this.f68705D0.n(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0
    protected final Ny0 s0(Zz0 zz0) throws zzib {
        Ny0 ny0S0 = super.s0(zz0);
        C c10 = zz0.f73158a;
        c10.getClass();
        this.f68703B0.f(c10, ny0S0);
        return ny0S0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8323hE0, com.google.android.gms.internal.ads.Ly0
    protected final void y() {
        try {
            super.y();
        } finally {
            this.f68711J0 = false;
            this.f68731d1 = -9223372036854775807L;
            e1();
        }
    }
}
