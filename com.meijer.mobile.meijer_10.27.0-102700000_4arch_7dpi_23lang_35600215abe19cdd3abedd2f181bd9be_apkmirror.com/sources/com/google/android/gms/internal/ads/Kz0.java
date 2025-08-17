package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes6.dex */
final class Kz0 extends AbstractC9201qi0 implements InterfaceC8167gz0 {

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ int f68196V = 0;

    /* renamed from: A, reason: collision with root package name */
    private LA0 f68197A;

    /* renamed from: B, reason: collision with root package name */
    private C8060fz0 f68198B;

    /* renamed from: C, reason: collision with root package name */
    private C7597bh f68199C;

    /* renamed from: D, reason: collision with root package name */
    private L9 f68200D;

    /* renamed from: E, reason: collision with root package name */
    private Object f68201E;

    /* renamed from: F, reason: collision with root package name */
    private Surface f68202F;

    /* renamed from: G, reason: collision with root package name */
    private int f68203G;

    /* renamed from: H, reason: collision with root package name */
    private C8107gR f68204H;

    /* renamed from: I, reason: collision with root package name */
    private int f68205I;

    /* renamed from: J, reason: collision with root package name */
    private HR f68206J;

    /* renamed from: K, reason: collision with root package name */
    private float f68207K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f68208L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f68209M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f68210N;

    /* renamed from: O, reason: collision with root package name */
    private int f68211O;

    /* renamed from: P, reason: collision with root package name */
    private L9 f68212P;

    /* renamed from: Q, reason: collision with root package name */
    private C9899xA0 f68213Q;

    /* renamed from: R, reason: collision with root package name */
    private int f68214R;

    /* renamed from: S, reason: collision with root package name */
    private long f68215S;

    /* renamed from: T, reason: collision with root package name */
    private final C9341rz0 f68216T;

    /* renamed from: U, reason: collision with root package name */
    private WF0 f68217U;

    /* renamed from: b, reason: collision with root package name */
    final XG0 f68218b;

    /* renamed from: c, reason: collision with root package name */
    final C7597bh f68219c;

    /* renamed from: d, reason: collision with root package name */
    private final C8623lE f68220d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f68221e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC7494aj f68222f;

    /* renamed from: g, reason: collision with root package name */
    private final FA0[] f68223g;

    /* renamed from: h, reason: collision with root package name */
    private final WG0 f68224h;

    /* renamed from: i, reason: collision with root package name */
    private final QH f68225i;

    /* renamed from: j, reason: collision with root package name */
    private final Yz0 f68226j;

    /* renamed from: k, reason: collision with root package name */
    private final WK f68227k;

    /* renamed from: l, reason: collision with root package name */
    private final CopyOnWriteArraySet f68228l;

    /* renamed from: m, reason: collision with root package name */
    private final C7306Wk f68229m;

    /* renamed from: n, reason: collision with root package name */
    private final List f68230n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f68231o;

    /* renamed from: p, reason: collision with root package name */
    private final PA0 f68232p;

    /* renamed from: q, reason: collision with root package name */
    private final Looper f68233q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC7883eH0 f68234r;

    /* renamed from: s, reason: collision with root package name */
    private final HC f68235s;

    /* renamed from: t, reason: collision with root package name */
    private final Gz0 f68236t;

    /* renamed from: u, reason: collision with root package name */
    private final Hz0 f68237u;

    /* renamed from: v, reason: collision with root package name */
    private final Ky0 f68238v;

    /* renamed from: w, reason: collision with root package name */
    private final long f68239w;

    /* renamed from: x, reason: collision with root package name */
    private int f68240x;

    /* renamed from: y, reason: collision with root package name */
    private int f68241y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f68242z;

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(boolean z10, int i10, int i11) {
        boolean z11 = z10 && i10 != -1;
        int i12 = i10 == 0 ? 1 : 0;
        C9899xA0 c9899xA0 = this.f68213Q;
        if (c9899xA0.f79698l == z11 && c9899xA0.f79700n == i12 && c9899xA0.f79699m == i11) {
            return;
        }
        this.f68240x++;
        C9899xA0 c9899xA0C = c9899xA0.c(z11, i11, i12);
        this.f68226j.b0(z11, i11, i12);
        K(c9899xA0C, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(int i10) {
        return i10 == -1 ? 2 : 1;
    }

    static {
        C8292i8.b("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public Kz0(C7953ez0 c7953ez0, InterfaceC7494aj interfaceC7494aj) {
        C7980fC0 c7980fC0;
        C8623lE c8623lE = new C8623lE(HC.f67408a);
        this.f68220d = c8623lE;
        try {
            C9917xL.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + OV.f69095e + "]");
            Context applicationContext = c7953ez0.f73965a.getApplicationContext();
            this.f68221e = applicationContext;
            PA0 pa0 = (PA0) c7953ez0.f73972h.apply(c7953ez0.f73966b);
            this.f68232p = pa0;
            this.f68211O = c7953ez0.f73974j;
            this.f68206J = c7953ez0.f73975k;
            this.f68203G = c7953ez0.f73976l;
            this.f68208L = false;
            this.f68239w = c7953ez0.f73980p;
            Jz0 jz0 = null;
            Gz0 gz0 = new Gz0(this, jz0);
            this.f68236t = gz0;
            Hz0 hz0 = new Hz0(jz0);
            this.f68237u = hz0;
            Handler handler = new Handler(c7953ez0.f73973i);
            FA0[] fa0ArrA = ((Xy0) c7953ez0.f73967c).f71443a.a(handler, gz0, gz0, gz0, gz0);
            this.f68223g = fa0ArrA;
            int length = fa0ArrA.length;
            WG0 wg0 = (WG0) c7953ez0.f73969e.zza();
            this.f68224h = wg0;
            C7953ez0.a(((Yy0) c7953ez0.f73968d).f71904a);
            C8311iH0 c8311iH0D = C8311iH0.d(((C7633bz0) c7953ez0.f73971g).f73051a);
            this.f68234r = c8311iH0D;
            this.f68231o = c7953ez0.f73977m;
            this.f68197A = c7953ez0.f73978n;
            Looper looper = c7953ez0.f73973i;
            this.f68233q = looper;
            HC hc2 = c7953ez0.f73966b;
            this.f68235s = hc2;
            this.f68222f = interfaceC7494aj;
            WK wk2 = new WK(looper, hc2, new UJ(this) { // from class: com.google.android.gms.internal.ads.qz0
                @Override // com.google.android.gms.internal.ads.UJ
                public final void a(Object obj, C9483tG0 c9483tG0) {
                }
            });
            this.f68227k = wk2;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f68228l = copyOnWriteArraySet;
            this.f68230n = new ArrayList();
            this.f68217U = new WF0(0);
            this.f68198B = C8060fz0.f74208b;
            int length2 = fa0ArrA.length;
            XG0 xg0 = new XG0(new JA0[2], new PG0[2], C7008Np.f68951b, null);
            this.f68218b = xg0;
            this.f68229m = new C7306Wk();
            C6590Bg c6590Bg = new C6590Bg();
            c6590Bg.c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            wg0.e();
            c6590Bg.d(29, true);
            c6590Bg.d(23, false);
            c6590Bg.d(25, false);
            c6590Bg.d(33, false);
            c6590Bg.d(26, false);
            c6590Bg.d(34, false);
            C7597bh c7597bhE = c6590Bg.e();
            this.f68219c = c7597bhE;
            C6590Bg c6590Bg2 = new C6590Bg();
            c6590Bg2.b(c7597bhE);
            c6590Bg2.a(4);
            c6590Bg2.a(10);
            this.f68199C = c6590Bg2.e();
            this.f68225i = hc2.a(looper, null);
            C9341rz0 c9341rz0 = new C9341rz0(this);
            this.f68216T = c9341rz0;
            this.f68213Q = C9899xA0.g(xg0);
            pa0.M(interfaceC7494aj, looper);
            if (OV.f69091a < 31) {
                c7980fC0 = new C7980fC0(c7953ez0.f73983s);
            } else {
                boolean z10 = c7953ez0.f73981q;
                String str = c7953ez0.f73983s;
                C7554bC0 c7554bC0Q = C7554bC0.q(applicationContext);
                if (c7554bC0Q == null) {
                    C9917xL.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    c7980fC0 = new C7980fC0(LogSessionId.LOG_SESSION_ID_NONE, str);
                } else {
                    if (z10) {
                        c(c7554bC0Q);
                    }
                    c7980fC0 = new C7980fC0(c7554bC0Q.p(), str);
                }
            }
            this.f68226j = new Yz0(fa0ArrA, wg0, xg0, (InterfaceC7550bA0) c7953ez0.f73970f.zza(), c8311iH0D, 0, false, pa0, this.f68197A, c7953ez0.f73984t, c7953ez0.f73979o, false, false, looper, hc2, c9341rz0, c7980fC0, null, this.f68198B);
            this.f68207K = 1.0f;
            L9 l92 = L9.f68266z;
            this.f68200D = l92;
            this.f68212P = l92;
            this.f68214R = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            this.f68205I = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            int i10 = C6576Ay.f65375a;
            this.f68209M = true;
            if (pa0 == null) {
                throw null;
            }
            wk2.b(pa0);
            c8311iH0D.a(new Handler(looper), pa0);
            copyOnWriteArraySet.add(gz0);
            new Fy0(c7953ez0.f73965a, handler, gz0);
            this.f68238v = new Ky0(c7953ez0.f73965a, handler, gz0);
            c7953ez0.f73965a.getApplicationContext();
            c7953ez0.f73965a.getApplicationContext();
            new YB0(0).a();
            C9113ps c9113ps = C9113ps.f77644d;
            this.f68204H = C8107gR.f74312c;
            wg0.d(this.f68206J);
            F(1, 10, Integer.valueOf(this.f68205I));
            F(2, 10, Integer.valueOf(this.f68205I));
            F(1, 3, this.f68206J);
            F(2, 4, Integer.valueOf(this.f68203G));
            F(2, 5, 0);
            F(1, 9, Boolean.valueOf(this.f68208L));
            F(2, 7, hz0);
            F(6, 8, hz0);
            F(-1, 16, Integer.valueOf(this.f68211O));
            c8623lE.e();
        } catch (Throwable th2) {
            this.f68220d.e();
            throw th2;
        }
    }

    private static long A(C9899xA0 c9899xA0) {
        C9954xl c9954xl = new C9954xl();
        C7306Wk c7306Wk = new C7306Wk();
        c9899xA0.f79687a.n(c9899xA0.f79688b.f72382a, c7306Wk);
        long j10 = c9899xA0.f79689c;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = c9899xA0.f79687a.e(c7306Wk.f71150c, c9954xl, 0L).f79856k;
        return 0L;
    }

    private final long B(AbstractC7307Wl abstractC7307Wl, C7453aF0 c7453aF0, long j10) {
        abstractC7307Wl.n(c7453aF0.f72382a, this.f68229m);
        return j10;
    }

    private final C9899xA0 D(C9899xA0 c9899xA0, AbstractC7307Wl abstractC7307Wl, Pair pair) {
        C8086gC.d(abstractC7307Wl.o() || pair != null);
        AbstractC7307Wl abstractC7307Wl2 = c9899xA0.f79687a;
        long jY = y(c9899xA0);
        C9899xA0 c9899xA0F = c9899xA0.f(abstractC7307Wl);
        if (abstractC7307Wl.o()) {
            C7453aF0 c7453aF0H = C9899xA0.h();
            long jK = OV.K(this.f68215S);
            C9899xA0 c9899xA0A = c9899xA0F.b(c7453aF0H, jK, jK, jK, 0L, C7775dG0.f73384d, this.f68218b, AbstractC7917eh0.t()).a(c7453aF0H);
            c9899xA0A.f79703q = c9899xA0A.f79705s;
            return c9899xA0A;
        }
        Object obj = c9899xA0F.f79688b.f72382a;
        int i10 = OV.f69091a;
        boolean zEquals = obj.equals(pair.first);
        C7453aF0 c7453aF0 = !zEquals ? new C7453aF0(pair.first, -1L) : c9899xA0F.f79688b;
        long jLongValue = ((Long) pair.second).longValue();
        long jK2 = OV.K(jY);
        if (!abstractC7307Wl2.o()) {
            abstractC7307Wl2.n(obj, this.f68229m);
        }
        if (!zEquals || jLongValue < jK2) {
            C7453aF0 c7453aF02 = c7453aF0;
            C8086gC.f(!c7453aF02.b());
            C9899xA0 c9899xA0A2 = c9899xA0F.b(c7453aF02, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? C7775dG0.f73384d : c9899xA0F.f79694h, !zEquals ? this.f68218b : c9899xA0F.f79695i, !zEquals ? AbstractC7917eh0.t() : c9899xA0F.f79696j).a(c7453aF02);
            c9899xA0A2.f79703q = jLongValue;
            return c9899xA0A2;
        }
        if (jLongValue != jK2) {
            C7453aF0 c7453aF03 = c7453aF0;
            C8086gC.f(!c7453aF03.b());
            long jMax = Math.max(0L, c9899xA0F.f79704r - (jLongValue - jK2));
            long j10 = c9899xA0F.f79703q;
            if (c9899xA0F.f79697k.equals(c9899xA0F.f79688b)) {
                j10 = jLongValue + jMax;
            }
            C9899xA0 c9899xA0B = c9899xA0F.b(c7453aF03, jLongValue, jLongValue, jLongValue, jMax, c9899xA0F.f79694h, c9899xA0F.f79695i, c9899xA0F.f79696j);
            c9899xA0B.f79703q = j10;
            return c9899xA0B;
        }
        int iA = abstractC7307Wl.a(c9899xA0F.f79697k.f72382a);
        if (iA != -1 && abstractC7307Wl.d(iA, this.f68229m, false).f71150c == abstractC7307Wl.n(c7453aF0.f72382a, this.f68229m).f71150c) {
            return c9899xA0F;
        }
        abstractC7307Wl.n(c7453aF0.f72382a, this.f68229m);
        long jF = c7453aF0.b() ? this.f68229m.f(c7453aF0.f72383b, c7453aF0.f72384c) : this.f68229m.f71151d;
        C7453aF0 c7453aF04 = c7453aF0;
        C9899xA0 c9899xA0A3 = c9899xA0F.b(c7453aF04, c9899xA0F.f79705s, c9899xA0F.f79705s, c9899xA0F.f79690d, jF - c9899xA0F.f79705s, c9899xA0F.f79694h, c9899xA0F.f79695i, c9899xA0F.f79696j).a(c7453aF04);
        c9899xA0A3.f79703q = jF;
        return c9899xA0A3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(final int i10, final int i11) {
        if (i10 == this.f68204H.b() && i11 == this.f68204H.a()) {
            return;
        }
        this.f68204H = new C8107gR(i10, i11);
        WK wk2 = this.f68227k;
        wk2.d(24, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.nz0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
                int i12 = Kz0.f68196V;
                ((InterfaceC6558Ah) obj).zzo(i10, i11);
            }
        });
        wk2.c();
        F(2, 14, new C8107gR(i10, i11));
    }

    private final void F(int i10, int i11, Object obj) {
        FA0[] fa0Arr = this.f68223g;
        int length = fa0Arr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            FA0 fa0 = fa0Arr[i12];
            if (i10 == -1 || fa0.zzb() == i10) {
                int iW = w(this.f68213Q);
                Yz0 yz0 = this.f68226j;
                int i13 = iW;
                AbstractC7307Wl abstractC7307Wl = this.f68213Q.f79687a;
                if (i13 == -1) {
                    i13 = 0;
                }
                BA0 ba0 = new BA0(yz0, fa0, abstractC7307Wl, i13, this.f68235s, yz0.V());
                ba0.f(i11);
                ba0.e(obj);
                ba0.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        F(1, 2, Float.valueOf(this.f68207K * this.f68238v.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Object obj) {
        Object obj2 = this.f68201E;
        boolean z10 = false;
        if (obj2 != null && obj2 != obj) {
            z10 = true;
        }
        boolean zE0 = this.f68226j.e0(obj, z10 ? this.f68239w : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.f68201E;
            Surface surface = this.f68202F;
            if (obj3 == surface) {
                surface.release();
                this.f68202F = null;
            }
        }
        this.f68201E = obj;
        if (zE0) {
            return;
        }
        I(zzib.d(new zzkd(3), 1003));
    }

    private final void I(zzib zzibVar) {
        C9899xA0 c9899xA0 = this.f68213Q;
        C9899xA0 c9899xA0A = c9899xA0.a(c9899xA0.f79688b);
        c9899xA0A.f79703q = c9899xA0A.f79705s;
        c9899xA0A.f79704r = 0L;
        C9899xA0 c9899xA0E = c9899xA0A.e(1);
        if (zzibVar != null) {
            c9899xA0E = c9899xA0E.d(zzibVar);
        }
        this.f68240x++;
        this.f68226j.c0();
        K(c9899xA0E, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0489 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0493 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x049d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029e  */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void K(final com.google.android.gms.internal.ads.C9899xA0 r35, final int r36, boolean r37, int r38, long r39, int r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Kz0.K(com.google.android.gms.internal.ads.xA0, int, boolean, int, long, int, boolean):void");
    }

    private final void M() {
        this.f68220d.b();
        if (Thread.currentThread() != this.f68233q.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f68233q.getThread().getName());
            if (this.f68209M) {
                throw new IllegalStateException(str);
            }
            C9917xL.g("ExoPlayerImpl", str, this.f68210N ? null : new IllegalStateException());
            this.f68210N = true;
        }
    }

    static /* bridge */ /* synthetic */ void o(Kz0 kz0, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        kz0.H(surface);
        kz0.f68202F = surface;
    }

    private final int w(C9899xA0 c9899xA0) {
        return c9899xA0.f79687a.o() ? this.f68214R : c9899xA0.f79687a.n(c9899xA0.f79688b.f72382a, this.f68229m).f71150c;
    }

    private final long y(C9899xA0 c9899xA0) {
        if (!c9899xA0.f79688b.b()) {
            return OV.N(z(c9899xA0));
        }
        c9899xA0.f79687a.n(c9899xA0.f79688b.f72382a, this.f68229m);
        long j10 = c9899xA0.f79689c;
        if (j10 == -9223372036854775807L) {
            long j11 = c9899xA0.f79687a.e(w(c9899xA0), this.f77831a, 0L).f79856k;
            return OV.N(0L);
        }
        return OV.N(0L) + OV.N(j10);
    }

    private final long z(C9899xA0 c9899xA0) {
        if (c9899xA0.f79687a.o()) {
            return OV.K(this.f68215S);
        }
        long j10 = c9899xA0.f79705s;
        if (c9899xA0.f79688b.b()) {
            return j10;
        }
        B(c9899xA0.f79687a, c9899xA0.f79688b, j10);
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8167gz0
    public final void c(SA0 sa0) {
        this.f68232p.L(sa0);
    }

    final /* synthetic */ void r(final Uz0 uz0) {
        this.f68225i.b(new Runnable() { // from class: com.google.android.gms.internal.ads.sz0
            @Override // java.lang.Runnable
            public final void run() {
                this.f78458a.t(uz0);
            }
        });
    }

    final /* synthetic */ void t(Uz0 uz0) {
        boolean z10;
        int i10 = this.f68240x - uz0.f70745c;
        this.f68240x = i10;
        boolean z11 = true;
        if (uz0.f70746d) {
            this.f68241y = uz0.f70747e;
            this.f68242z = true;
        }
        if (i10 == 0) {
            AbstractC7307Wl abstractC7307Wl = uz0.f70744b.f79687a;
            if (!this.f68213Q.f79687a.o() && abstractC7307Wl.o()) {
                this.f68214R = -1;
                this.f68215S = 0L;
            }
            if (!abstractC7307Wl.o()) {
                List listY = ((DA0) abstractC7307Wl).y();
                C8086gC.f(listY.size() == this.f68230n.size());
                for (int i11 = 0; i11 < listY.size(); i11++) {
                    ((Iz0) this.f68230n.get(i11)).a((AbstractC7307Wl) listY.get(i11));
                }
            }
            long j10 = -9223372036854775807L;
            if (this.f68242z) {
                if (uz0.f70744b.f79688b.equals(this.f68213Q.f79688b) && uz0.f70744b.f79690d == this.f68213Q.f79705s) {
                    z11 = false;
                }
                if (z11) {
                    if (abstractC7307Wl.o() || uz0.f70744b.f79688b.b()) {
                        j10 = uz0.f70744b.f79690d;
                    } else {
                        C9899xA0 c9899xA0 = uz0.f70744b;
                        C7453aF0 c7453aF0 = c9899xA0.f79688b;
                        long j11 = c9899xA0.f79690d;
                        B(abstractC7307Wl, c7453aF0, j11);
                        j10 = j11;
                    }
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            this.f68242z = false;
            K(uz0.f70744b, 1, z10, this.f68241y, j10, -1, false);
        }
    }

    final /* synthetic */ void u(InterfaceC6558Ah interfaceC6558Ah) {
        interfaceC6558Ah.u(this.f68199C);
    }

    private final Pair C(AbstractC7307Wl abstractC7307Wl, int i10, long j10) {
        if (abstractC7307Wl.o()) {
            this.f68214R = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f68215S = j10;
            return null;
        }
        if (i10 == -1 || i10 >= abstractC7307Wl.c()) {
            i10 = abstractC7307Wl.g(false);
            long j11 = abstractC7307Wl.e(i10, this.f77831a, 0L).f79856k;
            j10 = OV.N(0L);
        }
        return abstractC7307Wl.l(this.f77831a, this.f68229m, i10, OV.K(j10));
    }

    private final void L() {
        int iZzf = zzf();
        if (iZzf != 2 && iZzf != 3) {
            return;
        }
        M();
        boolean z10 = this.f68213Q.f79702p;
        zzu();
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final void B0(boolean z10) {
        M();
        this.f68238v.b(z10, zzf());
        J(z10, 1, x(1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final void a(Surface surface) {
        int i10;
        M();
        H(surface);
        if (surface == null) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        E(i10, i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8167gz0
    public final void b(InterfaceC7666cF0 interfaceC7666cF0) {
        M();
        List listSingletonList = Collections.singletonList(interfaceC7666cF0);
        M();
        M();
        w(this.f68213Q);
        zzk();
        boolean z10 = true;
        this.f68240x++;
        if (!this.f68230n.isEmpty()) {
            int size = this.f68230n.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.f68230n.remove(i10);
            }
            this.f68217U = this.f68217U.h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < listSingletonList.size(); i11++) {
            C9471tA0 c9471tA0 = new C9471tA0((InterfaceC7666cF0) listSingletonList.get(i11), this.f68231o);
            arrayList.add(c9471tA0);
            this.f68230n.add(i11, new Iz0(c9471tA0.f78499b, c9471tA0.f78498a));
        }
        this.f68217U = this.f68217U.g(0, arrayList.size());
        DA0 da0 = new DA0(this.f68230n, this.f68217U);
        if (!da0.o() && da0.c() < 0) {
            throw new zzac(da0, -1, -9223372036854775807L);
        }
        int iG = da0.g(false);
        C9899xA0 c9899xA0D = D(this.f68213Q, da0, C(da0, iG, -9223372036854775807L));
        int i12 = c9899xA0D.f79691e;
        if (iG != -1 && i12 != 1) {
            i12 = 4;
            if (!da0.o() && iG < da0.c()) {
                i12 = 2;
            }
        }
        C9899xA0 c9899xA0E = c9899xA0D.e(i12);
        this.f68226j.f0(arrayList, iG, OV.K(-9223372036854775807L), this.f68217U);
        if (this.f68213Q.f79688b.f72382a.equals(c9899xA0E.f79688b.f72382a) || this.f68213Q.f79687a.o()) {
            z10 = false;
        }
        K(c9899xA0E, 0, z10, 4, z(c9899xA0E), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8167gz0
    public final void d(SA0 sa0) {
        M();
        this.f68232p.K(sa0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9201qi0
    public final void e(int i10, long j10, int i11, boolean z10) {
        boolean z11;
        M();
        if (i10 != -1) {
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C8086gC.d(z11);
            AbstractC7307Wl abstractC7307Wl = this.f68213Q.f79687a;
            if (!abstractC7307Wl.o() && i10 >= abstractC7307Wl.c()) {
                return;
            }
            this.f68232p.zzu();
            this.f68240x++;
            if (zzw()) {
                C9917xL.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                Uz0 uz0 = new Uz0(this.f68213Q);
                uz0.a(1);
                this.f68216T.f78099a.r(uz0);
                return;
            }
            C9899xA0 c9899xA0E = this.f68213Q;
            int i12 = c9899xA0E.f79691e;
            if (i12 == 3 || (i12 == 4 && !abstractC7307Wl.o())) {
                c9899xA0E = this.f68213Q.e(2);
            }
            int iZzd = zzd();
            C9899xA0 c9899xA0D = D(c9899xA0E, abstractC7307Wl, C(abstractC7307Wl, i10, j10));
            this.f68226j.a0(abstractC7307Wl, i10, OV.K(j10));
            K(c9899xA0D, 0, true, 1, z(c9899xA0D), iZzd, false);
        }
    }

    public final zzib h() {
        M();
        return this.f68213Q.f79692f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8167gz0
    public final void j() {
        C9917xL.e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + OV.f69095e + "] [" + C8292i8.a() + "]");
        M();
        this.f68238v.d();
        if (!this.f68226j.d0()) {
            WK wk2 = this.f68227k;
            wk2.d(10, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.oz0
                @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
                public final void zza(Object obj) {
                    ((InterfaceC6558Ah) obj).Q(zzib.d(new zzkd(1), 1003));
                }
            });
            wk2.c();
        }
        this.f68227k.e();
        this.f68225i.zze(null);
        this.f68234r.b(this.f68232p);
        C9899xA0 c9899xA0 = this.f68213Q;
        boolean z10 = c9899xA0.f79702p;
        C9899xA0 c9899xA0E = c9899xA0.e(1);
        this.f68213Q = c9899xA0E;
        C9899xA0 c9899xA0A = c9899xA0E.a(c9899xA0E.f79688b);
        this.f68213Q = c9899xA0A;
        c9899xA0A.f79703q = c9899xA0A.f79705s;
        this.f68213Q.f79704r = 0L;
        this.f68232p.d();
        this.f68224h.c();
        Surface surface = this.f68202F;
        if (surface != null) {
            surface.release();
            this.f68202F = null;
        }
        int i10 = C6576Ay.f65375a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final void s(float f10) {
        M();
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.f68207K == fMax) {
            return;
        }
        this.f68207K = fMax;
        G();
        WK wk2 = this.f68227k;
        wk2.d(22, new InterfaceC9487tJ() { // from class: com.google.android.gms.internal.ads.mz0
            @Override // com.google.android.gms.internal.ads.InterfaceC9487tJ
            public final void zza(Object obj) {
                int i10 = Kz0.f68196V;
                ((InterfaceC6558Ah) obj).s(fMax);
            }
        });
        wk2.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final int zzb() {
        M();
        if (zzw()) {
            return this.f68213Q.f79688b.f72383b;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final int zzc() {
        M();
        if (zzw()) {
            return this.f68213Q.f79688b.f72384c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final int zzd() {
        M();
        int iW = w(this.f68213Q);
        if (iW == -1) {
            return 0;
        }
        return iW;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final int zze() {
        M();
        if (this.f68213Q.f79687a.o()) {
            return 0;
        }
        C9899xA0 c9899xA0 = this.f68213Q;
        return c9899xA0.f79687a.a(c9899xA0.f79688b.f72382a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final int zzf() {
        M();
        return this.f68213Q.f79691e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final int zzg() {
        M();
        return this.f68213Q.f79700n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final int zzh() {
        M();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final long zzi() {
        M();
        if (zzw()) {
            C9899xA0 c9899xA0 = this.f68213Q;
            if (c9899xA0.f79697k.equals(c9899xA0.f79688b)) {
                return OV.N(this.f68213Q.f79703q);
            }
            return zzl();
        }
        M();
        if (this.f68213Q.f79687a.o()) {
            return this.f68215S;
        }
        C9899xA0 c9899xA02 = this.f68213Q;
        long j10 = 0;
        if (c9899xA02.f79697k.f72385d != c9899xA02.f79688b.f72385d) {
            return OV.N(c9899xA02.f79687a.e(zzd(), this.f77831a, 0L).f79857l);
        }
        long j11 = c9899xA02.f79703q;
        if (this.f68213Q.f79697k.b()) {
            C9899xA0 c9899xA03 = this.f68213Q;
            c9899xA03.f79687a.n(c9899xA03.f79697k.f72382a, this.f68229m).g(this.f68213Q.f79697k.f72383b);
        } else {
            j10 = j11;
        }
        C9899xA0 c9899xA04 = this.f68213Q;
        B(c9899xA04.f79687a, c9899xA04.f79697k, j10);
        return OV.N(j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final long zzj() {
        M();
        return y(this.f68213Q);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final long zzk() {
        M();
        return OV.N(z(this.f68213Q));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final long zzl() {
        M();
        if (!zzw()) {
            AbstractC7307Wl abstractC7307WlZzn = zzn();
            if (abstractC7307WlZzn.o()) {
                return -9223372036854775807L;
            }
            return OV.N(abstractC7307WlZzn.e(zzd(), this.f77831a, 0L).f79857l);
        }
        C9899xA0 c9899xA0 = this.f68213Q;
        C7453aF0 c7453aF0 = c9899xA0.f79688b;
        c9899xA0.f79687a.n(c7453aF0.f72382a, this.f68229m);
        return OV.N(this.f68229m.f(c7453aF0.f72383b, c7453aF0.f72384c));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final long zzm() {
        M();
        return OV.N(this.f68213Q.f79704r);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final AbstractC7307Wl zzn() {
        M();
        return this.f68213Q.f79687a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final C7008Np zzo() {
        M();
        return this.f68213Q.f79695i.f71310d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final void zzp() {
        M();
        Ky0 ky0 = this.f68238v;
        boolean zZzu = zzu();
        int i10 = 2;
        ky0.b(zZzu, 2);
        J(zZzu, 1, x(1));
        C9899xA0 c9899xA0 = this.f68213Q;
        if (c9899xA0.f79691e != 1) {
            return;
        }
        C9899xA0 c9899xA0D = c9899xA0.d(null);
        if (true == c9899xA0D.f79687a.o()) {
            i10 = 4;
        }
        C9899xA0 c9899xA0E = c9899xA0D.e(i10);
        this.f68240x++;
        this.f68226j.Z();
        K(c9899xA0E, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final void zzt() {
        M();
        this.f68238v.b(zzu(), 1);
        I(null);
        int i10 = C6576Ay.f65375a;
        AbstractC7917eh0 abstractC7917eh0T = AbstractC7917eh0.t();
        long j10 = this.f68213Q.f79705s;
        AbstractC7917eh0.r(abstractC7917eh0T);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final boolean zzu() {
        M();
        return this.f68213Q.f79698l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final boolean zzv() {
        M();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7494aj
    public final boolean zzw() {
        M();
        return this.f68213Q.f79688b.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8167gz0
    public final int zzx() {
        M();
        int length = this.f68223g.length;
        return 2;
    }
}
