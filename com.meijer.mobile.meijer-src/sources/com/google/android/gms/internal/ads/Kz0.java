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
final class Kz0 extends AbstractC9326qi0 implements InterfaceC8292gz0 {

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ int f69036V = 0;

    /* renamed from: A, reason: collision with root package name */
    private LA0 f69037A;

    /* renamed from: B, reason: collision with root package name */
    private C8185fz0 f69038B;

    /* renamed from: C, reason: collision with root package name */
    private C7722bh f69039C;

    /* renamed from: D, reason: collision with root package name */
    private L9 f69040D;

    /* renamed from: E, reason: collision with root package name */
    private Object f69041E;

    /* renamed from: F, reason: collision with root package name */
    private Surface f69042F;

    /* renamed from: G, reason: collision with root package name */
    private int f69043G;

    /* renamed from: H, reason: collision with root package name */
    private C8232gR f69044H;

    /* renamed from: I, reason: collision with root package name */
    private int f69045I;

    /* renamed from: J, reason: collision with root package name */
    private HR f69046J;

    /* renamed from: K, reason: collision with root package name */
    private float f69047K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f69048L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f69049M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f69050N;

    /* renamed from: O, reason: collision with root package name */
    private int f69051O;

    /* renamed from: P, reason: collision with root package name */
    private L9 f69052P;

    /* renamed from: Q, reason: collision with root package name */
    private C10024xA0 f69053Q;

    /* renamed from: R, reason: collision with root package name */
    private int f69054R;

    /* renamed from: S, reason: collision with root package name */
    private long f69055S;

    /* renamed from: T, reason: collision with root package name */
    private final C9466rz0 f69056T;

    /* renamed from: U, reason: collision with root package name */
    private WF0 f69057U;

    /* renamed from: b, reason: collision with root package name */
    final XG0 f69058b;

    /* renamed from: c, reason: collision with root package name */
    final C7722bh f69059c;

    /* renamed from: d, reason: collision with root package name */
    private final C8748lE f69060d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f69061e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC7619aj f69062f;

    /* renamed from: g, reason: collision with root package name */
    private final FA0[] f69063g;

    /* renamed from: h, reason: collision with root package name */
    private final WG0 f69064h;

    /* renamed from: i, reason: collision with root package name */
    private final QH f69065i;

    /* renamed from: j, reason: collision with root package name */
    private final Yz0 f69066j;

    /* renamed from: k, reason: collision with root package name */
    private final WK f69067k;

    /* renamed from: l, reason: collision with root package name */
    private final CopyOnWriteArraySet f69068l;

    /* renamed from: m, reason: collision with root package name */
    private final C7431Wk f69069m;

    /* renamed from: n, reason: collision with root package name */
    private final List f69070n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f69071o;

    /* renamed from: p, reason: collision with root package name */
    private final PA0 f69072p;

    /* renamed from: q, reason: collision with root package name */
    private final Looper f69073q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC8008eH0 f69074r;

    /* renamed from: s, reason: collision with root package name */
    private final HC f69075s;

    /* renamed from: t, reason: collision with root package name */
    private final Gz0 f69076t;

    /* renamed from: u, reason: collision with root package name */
    private final Hz0 f69077u;

    /* renamed from: v, reason: collision with root package name */
    private final Ky0 f69078v;

    /* renamed from: w, reason: collision with root package name */
    private final long f69079w;

    /* renamed from: x, reason: collision with root package name */
    private int f69080x;

    /* renamed from: y, reason: collision with root package name */
    private int f69081y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f69082z;

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(boolean z10, int i10, int i11) {
        boolean z11 = z10 && i10 != -1;
        int i12 = i10 == 0 ? 1 : 0;
        C10024xA0 c10024xA0 = this.f69053Q;
        if (c10024xA0.f80538l == z11 && c10024xA0.f80540n == i12 && c10024xA0.f80539m == i11) {
            return;
        }
        this.f69080x++;
        C10024xA0 c10024xA0C = c10024xA0.c(z11, i11, i12);
        this.f69066j.b0(z11, i11, i12);
        K(c10024xA0C, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(int i10) {
        return i10 == -1 ? 2 : 1;
    }

    static {
        C8417i8.b("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public Kz0(C8078ez0 c8078ez0, InterfaceC7619aj interfaceC7619aj) {
        C8105fC0 c8105fC0;
        C8748lE c8748lE = new C8748lE(HC.f68248a);
        this.f69060d = c8748lE;
        try {
            C10042xL.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + OV.f69935e + "]");
            Context applicationContext = c8078ez0.f74805a.getApplicationContext();
            this.f69061e = applicationContext;
            PA0 pa0 = (PA0) c8078ez0.f74812h.apply(c8078ez0.f74806b);
            this.f69072p = pa0;
            this.f69051O = c8078ez0.f74814j;
            this.f69046J = c8078ez0.f74815k;
            this.f69043G = c8078ez0.f74816l;
            this.f69048L = false;
            this.f69079w = c8078ez0.f74820p;
            Jz0 jz0 = null;
            Gz0 gz0 = new Gz0(this, jz0);
            this.f69076t = gz0;
            Hz0 hz0 = new Hz0(jz0);
            this.f69077u = hz0;
            Handler handler = new Handler(c8078ez0.f74813i);
            FA0[] fa0ArrA = ((Xy0) c8078ez0.f74807c).f72283a.a(handler, gz0, gz0, gz0, gz0);
            this.f69063g = fa0ArrA;
            int length = fa0ArrA.length;
            WG0 wg0 = (WG0) c8078ez0.f74809e.zza();
            this.f69064h = wg0;
            C8078ez0.a(((Yy0) c8078ez0.f74808d).f72744a);
            C8436iH0 c8436iH0D = C8436iH0.d(((C7758bz0) c8078ez0.f74811g).f73891a);
            this.f69074r = c8436iH0D;
            this.f69071o = c8078ez0.f74817m;
            this.f69037A = c8078ez0.f74818n;
            Looper looper = c8078ez0.f74813i;
            this.f69073q = looper;
            HC hc2 = c8078ez0.f74806b;
            this.f69075s = hc2;
            this.f69062f = interfaceC7619aj;
            WK wk2 = new WK(looper, hc2, new UJ(this) { // from class: com.google.android.gms.internal.ads.qz0
                @Override // com.google.android.gms.internal.ads.UJ
                public final void a(Object obj, C9608tG0 c9608tG0) {
                }
            });
            this.f69067k = wk2;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f69068l = copyOnWriteArraySet;
            this.f69070n = new ArrayList();
            this.f69057U = new WF0(0);
            this.f69038B = C8185fz0.f75048b;
            int length2 = fa0ArrA.length;
            XG0 xg0 = new XG0(new JA0[2], new PG0[2], C7133Np.f69791b, null);
            this.f69058b = xg0;
            this.f69069m = new C7431Wk();
            C6715Bg c6715Bg = new C6715Bg();
            c6715Bg.c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            wg0.e();
            c6715Bg.d(29, true);
            c6715Bg.d(23, false);
            c6715Bg.d(25, false);
            c6715Bg.d(33, false);
            c6715Bg.d(26, false);
            c6715Bg.d(34, false);
            C7722bh c7722bhE = c6715Bg.e();
            this.f69059c = c7722bhE;
            C6715Bg c6715Bg2 = new C6715Bg();
            c6715Bg2.b(c7722bhE);
            c6715Bg2.a(4);
            c6715Bg2.a(10);
            this.f69039C = c6715Bg2.e();
            this.f69065i = hc2.a(looper, null);
            C9466rz0 c9466rz0 = new C9466rz0(this);
            this.f69056T = c9466rz0;
            this.f69053Q = C10024xA0.g(xg0);
            pa0.M(interfaceC7619aj, looper);
            if (OV.f69931a < 31) {
                c8105fC0 = new C8105fC0(c8078ez0.f74823s);
            } else {
                boolean z10 = c8078ez0.f74821q;
                String str = c8078ez0.f74823s;
                C7679bC0 c7679bC0Q = C7679bC0.q(applicationContext);
                if (c7679bC0Q == null) {
                    C10042xL.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    c8105fC0 = new C8105fC0(LogSessionId.LOG_SESSION_ID_NONE, str);
                } else {
                    if (z10) {
                        c(c7679bC0Q);
                    }
                    c8105fC0 = new C8105fC0(c7679bC0Q.p(), str);
                }
            }
            this.f69066j = new Yz0(fa0ArrA, wg0, xg0, (InterfaceC7675bA0) c8078ez0.f74810f.zza(), c8436iH0D, 0, false, pa0, this.f69037A, c8078ez0.f74824t, c8078ez0.f74819o, false, false, looper, hc2, c9466rz0, c8105fC0, null, this.f69038B);
            this.f69047K = 1.0f;
            L9 l92 = L9.f69106z;
            this.f69040D = l92;
            this.f69052P = l92;
            this.f69054R = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            this.f69045I = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            int i10 = C6701Ay.f66215a;
            this.f69049M = true;
            if (pa0 == null) {
                throw null;
            }
            wk2.b(pa0);
            c8436iH0D.a(new Handler(looper), pa0);
            copyOnWriteArraySet.add(gz0);
            new Fy0(c8078ez0.f74805a, handler, gz0);
            this.f69078v = new Ky0(c8078ez0.f74805a, handler, gz0);
            c8078ez0.f74805a.getApplicationContext();
            c8078ez0.f74805a.getApplicationContext();
            new YB0(0).a();
            C9238ps c9238ps = C9238ps.f78484d;
            this.f69044H = C8232gR.f75152c;
            wg0.d(this.f69046J);
            F(1, 10, Integer.valueOf(this.f69045I));
            F(2, 10, Integer.valueOf(this.f69045I));
            F(1, 3, this.f69046J);
            F(2, 4, Integer.valueOf(this.f69043G));
            F(2, 5, 0);
            F(1, 9, Boolean.valueOf(this.f69048L));
            F(2, 7, hz0);
            F(6, 8, hz0);
            F(-1, 16, Integer.valueOf(this.f69051O));
            c8748lE.e();
        } catch (Throwable th2) {
            this.f69060d.e();
            throw th2;
        }
    }

    private static long A(C10024xA0 c10024xA0) {
        C10079xl c10079xl = new C10079xl();
        C7431Wk c7431Wk = new C7431Wk();
        c10024xA0.f80527a.n(c10024xA0.f80528b.f73222a, c7431Wk);
        long j10 = c10024xA0.f80529c;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = c10024xA0.f80527a.e(c7431Wk.f71990c, c10079xl, 0L).f80696k;
        return 0L;
    }

    private final long B(AbstractC7432Wl abstractC7432Wl, C7578aF0 c7578aF0, long j10) {
        abstractC7432Wl.n(c7578aF0.f73222a, this.f69069m);
        return j10;
    }

    private final C10024xA0 D(C10024xA0 c10024xA0, AbstractC7432Wl abstractC7432Wl, Pair pair) {
        C8211gC.d(abstractC7432Wl.o() || pair != null);
        AbstractC7432Wl abstractC7432Wl2 = c10024xA0.f80527a;
        long jY = y(c10024xA0);
        C10024xA0 c10024xA0F = c10024xA0.f(abstractC7432Wl);
        if (abstractC7432Wl.o()) {
            C7578aF0 c7578aF0H = C10024xA0.h();
            long jK = OV.K(this.f69055S);
            C10024xA0 c10024xA0A = c10024xA0F.b(c7578aF0H, jK, jK, jK, 0L, C7900dG0.f74224d, this.f69058b, AbstractC8042eh0.t()).a(c7578aF0H);
            c10024xA0A.f80543q = c10024xA0A.f80545s;
            return c10024xA0A;
        }
        Object obj = c10024xA0F.f80528b.f73222a;
        int i10 = OV.f69931a;
        boolean zEquals = obj.equals(pair.first);
        C7578aF0 c7578aF0 = !zEquals ? new C7578aF0(pair.first, -1L) : c10024xA0F.f80528b;
        long jLongValue = ((Long) pair.second).longValue();
        long jK2 = OV.K(jY);
        if (!abstractC7432Wl2.o()) {
            abstractC7432Wl2.n(obj, this.f69069m);
        }
        if (!zEquals || jLongValue < jK2) {
            C7578aF0 c7578aF02 = c7578aF0;
            C8211gC.f(!c7578aF02.b());
            C10024xA0 c10024xA0A2 = c10024xA0F.b(c7578aF02, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? C7900dG0.f74224d : c10024xA0F.f80534h, !zEquals ? this.f69058b : c10024xA0F.f80535i, !zEquals ? AbstractC8042eh0.t() : c10024xA0F.f80536j).a(c7578aF02);
            c10024xA0A2.f80543q = jLongValue;
            return c10024xA0A2;
        }
        if (jLongValue != jK2) {
            C7578aF0 c7578aF03 = c7578aF0;
            C8211gC.f(!c7578aF03.b());
            long jMax = Math.max(0L, c10024xA0F.f80544r - (jLongValue - jK2));
            long j10 = c10024xA0F.f80543q;
            if (c10024xA0F.f80537k.equals(c10024xA0F.f80528b)) {
                j10 = jLongValue + jMax;
            }
            C10024xA0 c10024xA0B = c10024xA0F.b(c7578aF03, jLongValue, jLongValue, jLongValue, jMax, c10024xA0F.f80534h, c10024xA0F.f80535i, c10024xA0F.f80536j);
            c10024xA0B.f80543q = j10;
            return c10024xA0B;
        }
        int iA = abstractC7432Wl.a(c10024xA0F.f80537k.f73222a);
        if (iA != -1 && abstractC7432Wl.d(iA, this.f69069m, false).f71990c == abstractC7432Wl.n(c7578aF0.f73222a, this.f69069m).f71990c) {
            return c10024xA0F;
        }
        abstractC7432Wl.n(c7578aF0.f73222a, this.f69069m);
        long jF = c7578aF0.b() ? this.f69069m.f(c7578aF0.f73223b, c7578aF0.f73224c) : this.f69069m.f71991d;
        C7578aF0 c7578aF04 = c7578aF0;
        C10024xA0 c10024xA0A3 = c10024xA0F.b(c7578aF04, c10024xA0F.f80545s, c10024xA0F.f80545s, c10024xA0F.f80530d, jF - c10024xA0F.f80545s, c10024xA0F.f80534h, c10024xA0F.f80535i, c10024xA0F.f80536j).a(c7578aF04);
        c10024xA0A3.f80543q = jF;
        return c10024xA0A3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(final int i10, final int i11) {
        if (i10 == this.f69044H.b() && i11 == this.f69044H.a()) {
            return;
        }
        this.f69044H = new C8232gR(i10, i11);
        WK wk2 = this.f69067k;
        wk2.d(24, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.nz0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                int i12 = Kz0.f69036V;
                ((InterfaceC6683Ah) obj).zzo(i10, i11);
            }
        });
        wk2.c();
        F(2, 14, new C8232gR(i10, i11));
    }

    private final void F(int i10, int i11, Object obj) {
        FA0[] fa0Arr = this.f69063g;
        int length = fa0Arr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            FA0 fa0 = fa0Arr[i12];
            if (i10 == -1 || fa0.zzb() == i10) {
                int iW = w(this.f69053Q);
                Yz0 yz0 = this.f69066j;
                int i13 = iW;
                AbstractC7432Wl abstractC7432Wl = this.f69053Q.f80527a;
                if (i13 == -1) {
                    i13 = 0;
                }
                BA0 ba0 = new BA0(yz0, fa0, abstractC7432Wl, i13, this.f69075s, yz0.V());
                ba0.f(i11);
                ba0.e(obj);
                ba0.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        F(1, 2, Float.valueOf(this.f69047K * this.f69078v.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Object obj) {
        Object obj2 = this.f69041E;
        boolean z10 = false;
        if (obj2 != null && obj2 != obj) {
            z10 = true;
        }
        boolean zE0 = this.f69066j.e0(obj, z10 ? this.f69079w : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.f69041E;
            Surface surface = this.f69042F;
            if (obj3 == surface) {
                surface.release();
                this.f69042F = null;
            }
        }
        this.f69041E = obj;
        if (zE0) {
            return;
        }
        I(zzib.d(new zzkd(3), 1003));
    }

    private final void I(zzib zzibVar) {
        C10024xA0 c10024xA0 = this.f69053Q;
        C10024xA0 c10024xA0A = c10024xA0.a(c10024xA0.f80528b);
        c10024xA0A.f80543q = c10024xA0A.f80545s;
        c10024xA0A.f80544r = 0L;
        C10024xA0 c10024xA0E = c10024xA0A.e(1);
        if (zzibVar != null) {
            c10024xA0E = c10024xA0E.d(zzibVar);
        }
        this.f69080x++;
        this.f69066j.c0();
        K(c10024xA0E, 0, false, 5, -9223372036854775807L, -1, false);
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
    private final void K(final com.google.android.gms.internal.ads.C10024xA0 r35, final int r36, boolean r37, int r38, long r39, int r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Kz0.K(com.google.android.gms.internal.ads.xA0, int, boolean, int, long, int, boolean):void");
    }

    private final void M() {
        this.f69060d.b();
        if (Thread.currentThread() != this.f69073q.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f69073q.getThread().getName());
            if (this.f69049M) {
                throw new IllegalStateException(str);
            }
            C10042xL.g("ExoPlayerImpl", str, this.f69050N ? null : new IllegalStateException());
            this.f69050N = true;
        }
    }

    static /* bridge */ /* synthetic */ void o(Kz0 kz0, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        kz0.H(surface);
        kz0.f69042F = surface;
    }

    private final int w(C10024xA0 c10024xA0) {
        return c10024xA0.f80527a.o() ? this.f69054R : c10024xA0.f80527a.n(c10024xA0.f80528b.f73222a, this.f69069m).f71990c;
    }

    private final long y(C10024xA0 c10024xA0) {
        if (!c10024xA0.f80528b.b()) {
            return OV.N(z(c10024xA0));
        }
        c10024xA0.f80527a.n(c10024xA0.f80528b.f73222a, this.f69069m);
        long j10 = c10024xA0.f80529c;
        if (j10 == -9223372036854775807L) {
            long j11 = c10024xA0.f80527a.e(w(c10024xA0), this.f78671a, 0L).f80696k;
            return OV.N(0L);
        }
        return OV.N(0L) + OV.N(j10);
    }

    private final long z(C10024xA0 c10024xA0) {
        if (c10024xA0.f80527a.o()) {
            return OV.K(this.f69055S);
        }
        long j10 = c10024xA0.f80545s;
        if (c10024xA0.f80528b.b()) {
            return j10;
        }
        B(c10024xA0.f80527a, c10024xA0.f80528b, j10);
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8292gz0
    public final void c(SA0 sa0) {
        this.f69072p.L(sa0);
    }

    final /* synthetic */ void r(final Uz0 uz0) {
        this.f69065i.b(new Runnable() { // from class: com.google.android.gms.internal.ads.sz0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79298a.t(uz0);
            }
        });
    }

    final /* synthetic */ void t(Uz0 uz0) {
        boolean z10;
        int i10 = this.f69080x - uz0.f71585c;
        this.f69080x = i10;
        boolean z11 = true;
        if (uz0.f71586d) {
            this.f69081y = uz0.f71587e;
            this.f69082z = true;
        }
        if (i10 == 0) {
            AbstractC7432Wl abstractC7432Wl = uz0.f71584b.f80527a;
            if (!this.f69053Q.f80527a.o() && abstractC7432Wl.o()) {
                this.f69054R = -1;
                this.f69055S = 0L;
            }
            if (!abstractC7432Wl.o()) {
                List listY = ((DA0) abstractC7432Wl).y();
                C8211gC.f(listY.size() == this.f69070n.size());
                for (int i11 = 0; i11 < listY.size(); i11++) {
                    ((Iz0) this.f69070n.get(i11)).a((AbstractC7432Wl) listY.get(i11));
                }
            }
            long j10 = -9223372036854775807L;
            if (this.f69082z) {
                if (uz0.f71584b.f80528b.equals(this.f69053Q.f80528b) && uz0.f71584b.f80530d == this.f69053Q.f80545s) {
                    z11 = false;
                }
                if (z11) {
                    if (abstractC7432Wl.o() || uz0.f71584b.f80528b.b()) {
                        j10 = uz0.f71584b.f80530d;
                    } else {
                        C10024xA0 c10024xA0 = uz0.f71584b;
                        C7578aF0 c7578aF0 = c10024xA0.f80528b;
                        long j11 = c10024xA0.f80530d;
                        B(abstractC7432Wl, c7578aF0, j11);
                        j10 = j11;
                    }
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            this.f69082z = false;
            K(uz0.f71584b, 1, z10, this.f69081y, j10, -1, false);
        }
    }

    final /* synthetic */ void u(InterfaceC6683Ah interfaceC6683Ah) {
        interfaceC6683Ah.u(this.f69039C);
    }

    private final Pair C(AbstractC7432Wl abstractC7432Wl, int i10, long j10) {
        if (abstractC7432Wl.o()) {
            this.f69054R = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f69055S = j10;
            return null;
        }
        if (i10 == -1 || i10 >= abstractC7432Wl.c()) {
            i10 = abstractC7432Wl.g(false);
            long j11 = abstractC7432Wl.e(i10, this.f78671a, 0L).f80696k;
            j10 = OV.N(0L);
        }
        return abstractC7432Wl.l(this.f78671a, this.f69069m, i10, OV.K(j10));
    }

    private final void L() {
        int iZzf = zzf();
        if (iZzf != 2 && iZzf != 3) {
            return;
        }
        M();
        boolean z10 = this.f69053Q.f80542p;
        zzu();
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final void E0(boolean z10) {
        M();
        this.f69078v.b(z10, zzf());
        J(z10, 1, x(1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
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

    @Override // com.google.android.gms.internal.ads.InterfaceC8292gz0
    public final void b(InterfaceC7791cF0 interfaceC7791cF0) {
        M();
        List listSingletonList = Collections.singletonList(interfaceC7791cF0);
        M();
        M();
        w(this.f69053Q);
        zzk();
        boolean z10 = true;
        this.f69080x++;
        if (!this.f69070n.isEmpty()) {
            int size = this.f69070n.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.f69070n.remove(i10);
            }
            this.f69057U = this.f69057U.h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < listSingletonList.size(); i11++) {
            C9596tA0 c9596tA0 = new C9596tA0((InterfaceC7791cF0) listSingletonList.get(i11), this.f69071o);
            arrayList.add(c9596tA0);
            this.f69070n.add(i11, new Iz0(c9596tA0.f79339b, c9596tA0.f79338a));
        }
        this.f69057U = this.f69057U.g(0, arrayList.size());
        DA0 da0 = new DA0(this.f69070n, this.f69057U);
        if (!da0.o() && da0.c() < 0) {
            throw new zzac(da0, -1, -9223372036854775807L);
        }
        int iG = da0.g(false);
        C10024xA0 c10024xA0D = D(this.f69053Q, da0, C(da0, iG, -9223372036854775807L));
        int i12 = c10024xA0D.f80531e;
        if (iG != -1 && i12 != 1) {
            i12 = 4;
            if (!da0.o() && iG < da0.c()) {
                i12 = 2;
            }
        }
        C10024xA0 c10024xA0E = c10024xA0D.e(i12);
        this.f69066j.f0(arrayList, iG, OV.K(-9223372036854775807L), this.f69057U);
        if (this.f69053Q.f80528b.f73222a.equals(c10024xA0E.f80528b.f73222a) || this.f69053Q.f80527a.o()) {
            z10 = false;
        }
        K(c10024xA0E, 0, z10, 4, z(c10024xA0E), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8292gz0
    public final void d(SA0 sa0) {
        M();
        this.f69072p.K(sa0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9326qi0
    public final void e(int i10, long j10, int i11, boolean z10) {
        boolean z11;
        M();
        if (i10 != -1) {
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C8211gC.d(z11);
            AbstractC7432Wl abstractC7432Wl = this.f69053Q.f80527a;
            if (!abstractC7432Wl.o() && i10 >= abstractC7432Wl.c()) {
                return;
            }
            this.f69072p.zzu();
            this.f69080x++;
            if (zzw()) {
                C10042xL.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                Uz0 uz0 = new Uz0(this.f69053Q);
                uz0.a(1);
                this.f69056T.f78939a.r(uz0);
                return;
            }
            C10024xA0 c10024xA0E = this.f69053Q;
            int i12 = c10024xA0E.f80531e;
            if (i12 == 3 || (i12 == 4 && !abstractC7432Wl.o())) {
                c10024xA0E = this.f69053Q.e(2);
            }
            int iZzd = zzd();
            C10024xA0 c10024xA0D = D(c10024xA0E, abstractC7432Wl, C(abstractC7432Wl, i10, j10));
            this.f69066j.a0(abstractC7432Wl, i10, OV.K(j10));
            K(c10024xA0D, 0, true, 1, z(c10024xA0D), iZzd, false);
        }
    }

    public final zzib h() {
        M();
        return this.f69053Q.f80532f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8292gz0
    public final void j() {
        C10042xL.e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-beta01] [" + OV.f69935e + "] [" + C8417i8.a() + "]");
        M();
        this.f69078v.d();
        if (!this.f69066j.d0()) {
            WK wk2 = this.f69067k;
            wk2.d(10, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.oz0
                @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
                public final void zza(Object obj) {
                    ((InterfaceC6683Ah) obj).Q(zzib.d(new zzkd(1), 1003));
                }
            });
            wk2.c();
        }
        this.f69067k.e();
        this.f69065i.zze(null);
        this.f69074r.b(this.f69072p);
        C10024xA0 c10024xA0 = this.f69053Q;
        boolean z10 = c10024xA0.f80542p;
        C10024xA0 c10024xA0E = c10024xA0.e(1);
        this.f69053Q = c10024xA0E;
        C10024xA0 c10024xA0A = c10024xA0E.a(c10024xA0E.f80528b);
        this.f69053Q = c10024xA0A;
        c10024xA0A.f80543q = c10024xA0A.f80545s;
        this.f69053Q.f80544r = 0L;
        this.f69072p.d();
        this.f69064h.c();
        Surface surface = this.f69042F;
        if (surface != null) {
            surface.release();
            this.f69042F = null;
        }
        int i10 = C6701Ay.f66215a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final void s(float f10) {
        M();
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.f69047K == fMax) {
            return;
        }
        this.f69047K = fMax;
        G();
        WK wk2 = this.f69067k;
        wk2.d(22, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.mz0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                int i10 = Kz0.f69036V;
                ((InterfaceC6683Ah) obj).s(fMax);
            }
        });
        wk2.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final int zzb() {
        M();
        if (zzw()) {
            return this.f69053Q.f80528b.f73223b;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final int zzc() {
        M();
        if (zzw()) {
            return this.f69053Q.f80528b.f73224c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final int zzd() {
        M();
        int iW = w(this.f69053Q);
        if (iW == -1) {
            return 0;
        }
        return iW;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final int zze() {
        M();
        if (this.f69053Q.f80527a.o()) {
            return 0;
        }
        C10024xA0 c10024xA0 = this.f69053Q;
        return c10024xA0.f80527a.a(c10024xA0.f80528b.f73222a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final int zzf() {
        M();
        return this.f69053Q.f80531e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final int zzg() {
        M();
        return this.f69053Q.f80540n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final int zzh() {
        M();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final long zzi() {
        M();
        if (zzw()) {
            C10024xA0 c10024xA0 = this.f69053Q;
            if (c10024xA0.f80537k.equals(c10024xA0.f80528b)) {
                return OV.N(this.f69053Q.f80543q);
            }
            return zzl();
        }
        M();
        if (this.f69053Q.f80527a.o()) {
            return this.f69055S;
        }
        C10024xA0 c10024xA02 = this.f69053Q;
        long j10 = 0;
        if (c10024xA02.f80537k.f73225d != c10024xA02.f80528b.f73225d) {
            return OV.N(c10024xA02.f80527a.e(zzd(), this.f78671a, 0L).f80697l);
        }
        long j11 = c10024xA02.f80543q;
        if (this.f69053Q.f80537k.b()) {
            C10024xA0 c10024xA03 = this.f69053Q;
            c10024xA03.f80527a.n(c10024xA03.f80537k.f73222a, this.f69069m).g(this.f69053Q.f80537k.f73223b);
        } else {
            j10 = j11;
        }
        C10024xA0 c10024xA04 = this.f69053Q;
        B(c10024xA04.f80527a, c10024xA04.f80537k, j10);
        return OV.N(j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final long zzj() {
        M();
        return y(this.f69053Q);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final long zzk() {
        M();
        return OV.N(z(this.f69053Q));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final long zzl() {
        M();
        if (!zzw()) {
            AbstractC7432Wl abstractC7432WlZzn = zzn();
            if (abstractC7432WlZzn.o()) {
                return -9223372036854775807L;
            }
            return OV.N(abstractC7432WlZzn.e(zzd(), this.f78671a, 0L).f80697l);
        }
        C10024xA0 c10024xA0 = this.f69053Q;
        C7578aF0 c7578aF0 = c10024xA0.f80528b;
        c10024xA0.f80527a.n(c7578aF0.f73222a, this.f69069m);
        return OV.N(this.f69069m.f(c7578aF0.f73223b, c7578aF0.f73224c));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final long zzm() {
        M();
        return OV.N(this.f69053Q.f80544r);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final AbstractC7432Wl zzn() {
        M();
        return this.f69053Q.f80527a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final C7133Np zzo() {
        M();
        return this.f69053Q.f80535i.f72150d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final void zzp() {
        M();
        Ky0 ky0 = this.f69078v;
        boolean zZzu = zzu();
        int i10 = 2;
        ky0.b(zZzu, 2);
        J(zZzu, 1, x(1));
        C10024xA0 c10024xA0 = this.f69053Q;
        if (c10024xA0.f80531e != 1) {
            return;
        }
        C10024xA0 c10024xA0D = c10024xA0.d(null);
        if (true == c10024xA0D.f80527a.o()) {
            i10 = 4;
        }
        C10024xA0 c10024xA0E = c10024xA0D.e(i10);
        this.f69080x++;
        this.f69066j.Z();
        K(c10024xA0E, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final void zzt() {
        M();
        this.f69078v.b(zzu(), 1);
        I(null);
        int i10 = C6701Ay.f66215a;
        AbstractC8042eh0 abstractC8042eh0T = AbstractC8042eh0.t();
        long j10 = this.f69053Q.f80545s;
        AbstractC8042eh0.r(abstractC8042eh0T);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final boolean zzu() {
        M();
        return this.f69053Q.f80538l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final boolean zzv() {
        M();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7619aj
    public final boolean zzw() {
        M();
        return this.f69053Q.f80528b.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8292gz0
    public final int zzx() {
        M();
        int length = this.f69063g.length;
        return 2;
    }
}
