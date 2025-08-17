package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
final class Yz0 implements Handler.Callback, XE0, VG0, InterfaceC9578uA0, Ty0, InterfaceC10113zA0 {

    /* renamed from: T, reason: collision with root package name */
    private static final long f71906T = OV.N(10000);

    /* renamed from: B, reason: collision with root package name */
    private boolean f71908B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f71909C;

    /* renamed from: E, reason: collision with root package name */
    private boolean f71911E;

    /* renamed from: H, reason: collision with root package name */
    private boolean f71914H;

    /* renamed from: I, reason: collision with root package name */
    private int f71915I;

    /* renamed from: J, reason: collision with root package name */
    private Wz0 f71916J;

    /* renamed from: K, reason: collision with root package name */
    private long f71917K;

    /* renamed from: L, reason: collision with root package name */
    private long f71918L;

    /* renamed from: M, reason: collision with root package name */
    private int f71919M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f71920N;

    /* renamed from: O, reason: collision with root package name */
    private zzib f71921O;

    /* renamed from: Q, reason: collision with root package name */
    private C8060fz0 f71923Q;

    /* renamed from: R, reason: collision with root package name */
    private final C9341rz0 f71924R;

    /* renamed from: S, reason: collision with root package name */
    private final Py0 f71925S;

    /* renamed from: a, reason: collision with root package name */
    private final KA0[] f71926a;

    /* renamed from: b, reason: collision with root package name */
    private final IA0[] f71927b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f71928c;

    /* renamed from: d, reason: collision with root package name */
    private final WG0 f71929d;

    /* renamed from: e, reason: collision with root package name */
    private final XG0 f71930e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC7550bA0 f71931f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC7883eH0 f71932g;

    /* renamed from: h, reason: collision with root package name */
    private final QH f71933h;

    /* renamed from: i, reason: collision with root package name */
    private final C10006yA0 f71934i;

    /* renamed from: j, reason: collision with root package name */
    private final Looper f71935j;

    /* renamed from: k, reason: collision with root package name */
    private final C9954xl f71936k;

    /* renamed from: l, reason: collision with root package name */
    private final C7306Wk f71937l;

    /* renamed from: m, reason: collision with root package name */
    private final long f71938m;

    /* renamed from: n, reason: collision with root package name */
    private final Vy0 f71939n;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList f71940o;

    /* renamed from: p, reason: collision with root package name */
    private final HC f71941p;

    /* renamed from: q, reason: collision with root package name */
    private final C8402jA0 f71942q;

    /* renamed from: r, reason: collision with root package name */
    private final C9792wA0 f71943r;

    /* renamed from: s, reason: collision with root package name */
    private final long f71944s;

    /* renamed from: t, reason: collision with root package name */
    private final C7980fC0 f71945t;

    /* renamed from: u, reason: collision with root package name */
    private final PA0 f71946u;

    /* renamed from: v, reason: collision with root package name */
    private final QH f71947v;

    /* renamed from: w, reason: collision with root package name */
    private LA0 f71948w;

    /* renamed from: x, reason: collision with root package name */
    private C9899xA0 f71949x;

    /* renamed from: y, reason: collision with root package name */
    private Uz0 f71950y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f71951z;

    /* renamed from: F, reason: collision with root package name */
    private int f71912F = 0;

    /* renamed from: G, reason: collision with root package name */
    private boolean f71913G = false;

    /* renamed from: A, reason: collision with root package name */
    private boolean f71907A = false;

    /* renamed from: P, reason: collision with root package name */
    private long f71922P = -9223372036854775807L;

    /* renamed from: D, reason: collision with root package name */
    private long f71910D = -9223372036854775807L;

    public Yz0(FA0[] fa0Arr, WG0 wg0, XG0 xg0, InterfaceC7550bA0 interfaceC7550bA0, InterfaceC7883eH0 interfaceC7883eH0, int i10, boolean z10, PA0 pa0, LA0 la0, Py0 py0, long j10, boolean z11, boolean z12, Looper looper, HC hc2, C9341rz0 c9341rz0, C7980fC0 c7980fC0, C10006yA0 c10006yA0, C8060fz0 c8060fz0) {
        this.f71924R = c9341rz0;
        this.f71929d = wg0;
        this.f71930e = xg0;
        this.f71931f = interfaceC7550bA0;
        this.f71932g = interfaceC7883eH0;
        this.f71948w = la0;
        this.f71925S = py0;
        this.f71944s = j10;
        this.f71941p = hc2;
        this.f71945t = c7980fC0;
        this.f71923Q = c8060fz0;
        this.f71946u = pa0;
        this.f71938m = interfaceC7550bA0.d(c7980fC0);
        interfaceC7550bA0.a(c7980fC0);
        AbstractC7307Wl abstractC7307Wl = AbstractC7307Wl.f71155a;
        C9899xA0 c9899xA0G = C9899xA0.g(xg0);
        this.f71949x = c9899xA0G;
        this.f71950y = new Uz0(c9899xA0G);
        int length = fa0Arr.length;
        this.f71927b = new IA0[2];
        this.f71928c = new boolean[2];
        HA0 ha0B = wg0.b();
        this.f71926a = new KA0[2];
        for (int i11 = 0; i11 < 2; i11++) {
            fa0Arr[i11].i(i11, c7980fC0, hc2);
            this.f71927b[i11] = fa0Arr[i11].zzm();
            this.f71927b[i11].q(ha0B);
            this.f71926a[i11] = new KA0(fa0Arr[i11], i11);
        }
        this.f71939n = new Vy0(this, hc2);
        this.f71940o = new ArrayList();
        this.f71936k = new C9954xl();
        this.f71937l = new C7306Wk();
        wg0.i(this, interfaceC7883eH0);
        this.f71920N = true;
        QH qhA = hc2.a(looper, null);
        this.f71947v = qhA;
        this.f71942q = new C8402jA0(pa0, qhA, new Nz0(this), c8060fz0);
        this.f71943r = new C9792wA0(this, pa0, qhA, c7980fC0);
        C10006yA0 c10006yA02 = new C10006yA0(null);
        this.f71934i = c10006yA02;
        Looper looperA = c10006yA02.a();
        this.f71935j = looperA;
        this.f71933h = hc2.a(looperA, this);
    }

    private final void F(boolean z10, boolean z11) {
        v(z10 || !this.f71914H, false, true, false);
        this.f71950y.a(z11 ? 1 : 0);
        this.f71931f.e(this.f71945t);
        D(1);
    }

    private final synchronized void M(InterfaceC7300Wf0 interfaceC7300Wf0, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) interfaceC7300Wf0.zza()).booleanValue() && j10 > 0) {
            try {
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private static C[] R(PG0 pg0) {
        int iZzd = pg0 != null ? pg0.zzd() : 0;
        C[] cArr = new C[iZzd];
        for (int i10 = 0; i10 < iZzd; i10++) {
            cArr[i10] = pg0.zze(i10);
        }
        return cArr;
    }

    private static final boolean T(C8083gA0 c8083gA0) {
        if (c8083gA0 != null) {
            try {
                if (c8083gA0.f74266e) {
                    SF0[] sf0Arr = c8083gA0.f74264c;
                    for (int i10 = 0; i10 < 2; i10++) {
                        SF0 sf0 = sf0Arr[i10];
                        if (sf0 != null) {
                            sf0.zzd();
                        }
                    }
                } else {
                    c8083gA0.f74262a.zzk();
                }
                if (c8083gA0.d() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    static int U(C9954xl c9954xl, C7306Wk c7306Wk, int i10, boolean z10, Object obj, AbstractC7307Wl abstractC7307Wl, AbstractC7307Wl abstractC7307Wl2) {
        C9954xl c9954xl2 = c9954xl;
        AbstractC7307Wl abstractC7307Wl3 = abstractC7307Wl;
        Object obj2 = abstractC7307Wl3.e(abstractC7307Wl3.n(obj, c7306Wk).f71150c, c9954xl, 0L).f79846a;
        for (int i11 = 0; i11 < abstractC7307Wl2.c(); i11++) {
            if (abstractC7307Wl2.e(i11, c9954xl, 0L).f79846a.equals(obj2)) {
                return i11;
            }
        }
        int iA = abstractC7307Wl3.a(obj);
        int iB = abstractC7307Wl3.b();
        int iA2 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= iB || iA2 != -1) {
                break;
            }
            AbstractC7307Wl abstractC7307Wl4 = abstractC7307Wl3;
            int i13 = abstractC7307Wl4.i(iA, c7306Wk, c9954xl2, i10, z10);
            if (i13 == -1) {
                iA2 = -1;
                break;
            }
            iA2 = abstractC7307Wl2.a(abstractC7307Wl4.f(i13));
            i12++;
            abstractC7307Wl3 = abstractC7307Wl4;
            iA = i13;
            c9954xl2 = c9954xl;
        }
        if (iA2 == -1) {
            return -1;
        }
        return abstractC7307Wl2.d(iA2, c7306Wk, false).f71150c;
    }

    private final void g() {
        for (int i10 = 0; i10 < 2; i10++) {
            f(i10);
        }
    }

    public final Looper V() {
        return this.f71935j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10113zA0
    public final synchronized void c(BA0 ba0) {
        if (!this.f71951z && this.f71935j.getThread().isAlive()) {
            this.f71933h.a(14, ba0).zza();
            return;
        }
        C9917xL.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        ba0.h(false);
    }

    public final synchronized boolean d0() {
        if (!this.f71951z && this.f71935j.getThread().isAlive()) {
            this.f71933h.zzi(7);
            M(new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.Lz0
                @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
                public final Object zza() {
                    return this.f68478a.X();
                }
            }, this.f71944s);
            return this.f71951z;
        }
        return true;
    }

    public final synchronized boolean e0(Object obj, long j10) {
        if (!this.f71951z && this.f71935j.getThread().isAlive()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f71933h.a(30, new Pair(obj, atomicBoolean)).zza();
            if (j10 != -9223372036854775807L) {
                M(new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.Oz0
                    @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
                    public final Object zza() {
                        return Boolean.valueOf(atomicBoolean.get());
                    }
                }, j10);
                return atomicBoolean.get();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x08aa A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztg -> 0x0030, zzfz -> 0x0033, zzbc -> 0x0036, zzqy -> 0x0039, zzib -> 0x003c, TryCatch #15 {zzbc -> 0x0036, zzfz -> 0x0033, zzib -> 0x003c, zzqy -> 0x0039, zztg -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:24:0x0041, B:30:0x004e, B:31:0x004f, B:34:0x0069, B:35:0x007d, B:36:0x008d, B:37:0x00a4, B:38:0x00a8, B:39:0x00ac, B:43:0x00b3, B:45:0x00bc, B:47:0x00ca, B:48:0x00d2, B:49:0x00dd, B:50:0x00f1, B:51:0x0109, B:52:0x011f, B:54:0x012e, B:55:0x0132, B:56:0x0143, B:58:0x0152, B:59:0x016e, B:60:0x0181, B:61:0x018a, B:63:0x019c, B:64:0x01a8, B:65:0x01b8, B:67:0x01c4, B:70:0x01cf, B:71:0x01d6, B:72:0x01e1, B:76:0x01e8, B:78:0x01f0, B:80:0x01f4, B:82:0x01f9, B:84:0x0201, B:85:0x0204, B:87:0x0209, B:93:0x0215, B:94:0x0216, B:98:0x021d, B:100:0x022b, B:101:0x022e, B:102:0x0233, B:104:0x0243, B:105:0x0246, B:106:0x024b, B:107:0x0250, B:109:0x025c, B:110:0x0268, B:112:0x0270, B:113:0x0275, B:115:0x0281, B:117:0x0289, B:119:0x028d, B:120:0x029e, B:122:0x02b5, B:123:0x02d5, B:124:0x02da, B:125:0x02db, B:127:0x02e3, B:129:0x0302, B:137:0x032a, B:138:0x032f, B:144:0x0339, B:153:0x034a, B:154:0x034f, B:155:0x0357, B:159:0x038f, B:232:0x04ba, B:210:0x0481, B:209:0x047d, B:240:0x04ca, B:241:0x04d2, B:167:0x03e2, B:169:0x03f9, B:256:0x04f6, B:258:0x0511, B:261:0x0524, B:263:0x0533, B:265:0x053f, B:267:0x0549, B:271:0x0560, B:273:0x0568, B:274:0x056d, B:268:0x054f, B:270:0x0553, B:275:0x0570, B:277:0x0574, B:279:0x0587, B:342:0x06b8, B:344:0x06c0, B:346:0x06c8, B:349:0x06cd, B:350:0x06d9, B:352:0x06dd, B:354:0x06e5, B:357:0x06f1, B:359:0x06f7, B:360:0x0717, B:362:0x071f, B:364:0x0725, B:366:0x072a, B:368:0x072e, B:407:0x07e8, B:408:0x07ec, B:412:0x07f9, B:414:0x0801, B:415:0x0807, B:417:0x0815, B:418:0x082e, B:420:0x0832, B:422:0x083a, B:436:0x0867, B:423:0x0840, B:425:0x084b, B:429:0x0854, B:435:0x0864, B:439:0x0878, B:441:0x087e, B:445:0x0886, B:447:0x088e, B:449:0x0892, B:450:0x089c, B:452:0x08a2, B:503:0x09ac, B:506:0x09b3, B:508:0x09b7, B:510:0x09bf, B:511:0x09c2, B:512:0x09c5, B:514:0x09cb, B:516:0x09d4, B:518:0x09e0, B:520:0x09e6, B:527:0x0a07, B:529:0x0a0d, B:533:0x0a16, B:542:0x0a2c, B:539:0x0a25, B:541:0x0a29, B:521:0x09ed, B:524:0x09fb, B:525:0x0a02, B:526:0x0a03, B:453:0x08aa, B:455:0x08b0, B:457:0x08b4, B:482:0x094e, B:484:0x095b, B:460:0x08be, B:462:0x08c2, B:464:0x08d6, B:466:0x08e1, B:468:0x08ed, B:472:0x08f6, B:474:0x0900, B:480:0x090b, B:485:0x0967, B:487:0x096d, B:489:0x0971, B:493:0x097a, B:495:0x0988, B:497:0x0990, B:499:0x099a, B:500:0x099f, B:501:0x09a4, B:502:0x09a9, B:438:0x086f, B:371:0x073c, B:373:0x0740, B:375:0x0748, B:377:0x074e, B:379:0x0758, B:382:0x075e, B:383:0x0761, B:385:0x0769, B:387:0x077b, B:389:0x0783, B:391:0x078b, B:395:0x0795, B:397:0x07bc, B:398:0x07bf, B:400:0x07cc, B:402:0x07d2, B:403:0x07d9, B:406:0x07e7, B:282:0x0594, B:284:0x059a, B:287:0x05a3, B:290:0x05ae, B:292:0x05b3, B:294:0x05bb, B:296:0x05c3, B:298:0x05cb, B:300:0x05d9, B:302:0x0614, B:304:0x061e, B:306:0x0627, B:307:0x062f, B:309:0x0635, B:312:0x0645, B:314:0x064f, B:316:0x0659, B:318:0x066a, B:320:0x0670, B:321:0x067b, B:322:0x067e, B:324:0x0684, B:327:0x0689, B:329:0x068d, B:341:0x06b5, B:332:0x0696, B:334:0x069c, B:338:0x06aa, B:340:0x06b2, B:278:0x0584, B:543:0x0a31, B:547:0x0a38, B:145:0x033a, B:146:0x033f, B:149:0x0346, B:152:0x0349), top: B:622:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x095b A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztg -> 0x0030, zzfz -> 0x0033, zzbc -> 0x0036, zzqy -> 0x0039, zzib -> 0x003c, TryCatch #15 {zzbc -> 0x0036, zzfz -> 0x0033, zzib -> 0x003c, zzqy -> 0x0039, zztg -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:24:0x0041, B:30:0x004e, B:31:0x004f, B:34:0x0069, B:35:0x007d, B:36:0x008d, B:37:0x00a4, B:38:0x00a8, B:39:0x00ac, B:43:0x00b3, B:45:0x00bc, B:47:0x00ca, B:48:0x00d2, B:49:0x00dd, B:50:0x00f1, B:51:0x0109, B:52:0x011f, B:54:0x012e, B:55:0x0132, B:56:0x0143, B:58:0x0152, B:59:0x016e, B:60:0x0181, B:61:0x018a, B:63:0x019c, B:64:0x01a8, B:65:0x01b8, B:67:0x01c4, B:70:0x01cf, B:71:0x01d6, B:72:0x01e1, B:76:0x01e8, B:78:0x01f0, B:80:0x01f4, B:82:0x01f9, B:84:0x0201, B:85:0x0204, B:87:0x0209, B:93:0x0215, B:94:0x0216, B:98:0x021d, B:100:0x022b, B:101:0x022e, B:102:0x0233, B:104:0x0243, B:105:0x0246, B:106:0x024b, B:107:0x0250, B:109:0x025c, B:110:0x0268, B:112:0x0270, B:113:0x0275, B:115:0x0281, B:117:0x0289, B:119:0x028d, B:120:0x029e, B:122:0x02b5, B:123:0x02d5, B:124:0x02da, B:125:0x02db, B:127:0x02e3, B:129:0x0302, B:137:0x032a, B:138:0x032f, B:144:0x0339, B:153:0x034a, B:154:0x034f, B:155:0x0357, B:159:0x038f, B:232:0x04ba, B:210:0x0481, B:209:0x047d, B:240:0x04ca, B:241:0x04d2, B:167:0x03e2, B:169:0x03f9, B:256:0x04f6, B:258:0x0511, B:261:0x0524, B:263:0x0533, B:265:0x053f, B:267:0x0549, B:271:0x0560, B:273:0x0568, B:274:0x056d, B:268:0x054f, B:270:0x0553, B:275:0x0570, B:277:0x0574, B:279:0x0587, B:342:0x06b8, B:344:0x06c0, B:346:0x06c8, B:349:0x06cd, B:350:0x06d9, B:352:0x06dd, B:354:0x06e5, B:357:0x06f1, B:359:0x06f7, B:360:0x0717, B:362:0x071f, B:364:0x0725, B:366:0x072a, B:368:0x072e, B:407:0x07e8, B:408:0x07ec, B:412:0x07f9, B:414:0x0801, B:415:0x0807, B:417:0x0815, B:418:0x082e, B:420:0x0832, B:422:0x083a, B:436:0x0867, B:423:0x0840, B:425:0x084b, B:429:0x0854, B:435:0x0864, B:439:0x0878, B:441:0x087e, B:445:0x0886, B:447:0x088e, B:449:0x0892, B:450:0x089c, B:452:0x08a2, B:503:0x09ac, B:506:0x09b3, B:508:0x09b7, B:510:0x09bf, B:511:0x09c2, B:512:0x09c5, B:514:0x09cb, B:516:0x09d4, B:518:0x09e0, B:520:0x09e6, B:527:0x0a07, B:529:0x0a0d, B:533:0x0a16, B:542:0x0a2c, B:539:0x0a25, B:541:0x0a29, B:521:0x09ed, B:524:0x09fb, B:525:0x0a02, B:526:0x0a03, B:453:0x08aa, B:455:0x08b0, B:457:0x08b4, B:482:0x094e, B:484:0x095b, B:460:0x08be, B:462:0x08c2, B:464:0x08d6, B:466:0x08e1, B:468:0x08ed, B:472:0x08f6, B:474:0x0900, B:480:0x090b, B:485:0x0967, B:487:0x096d, B:489:0x0971, B:493:0x097a, B:495:0x0988, B:497:0x0990, B:499:0x099a, B:500:0x099f, B:501:0x09a4, B:502:0x09a9, B:438:0x086f, B:371:0x073c, B:373:0x0740, B:375:0x0748, B:377:0x074e, B:379:0x0758, B:382:0x075e, B:383:0x0761, B:385:0x0769, B:387:0x077b, B:389:0x0783, B:391:0x078b, B:395:0x0795, B:397:0x07bc, B:398:0x07bf, B:400:0x07cc, B:402:0x07d2, B:403:0x07d9, B:406:0x07e7, B:282:0x0594, B:284:0x059a, B:287:0x05a3, B:290:0x05ae, B:292:0x05b3, B:294:0x05bb, B:296:0x05c3, B:298:0x05cb, B:300:0x05d9, B:302:0x0614, B:304:0x061e, B:306:0x0627, B:307:0x062f, B:309:0x0635, B:312:0x0645, B:314:0x064f, B:316:0x0659, B:318:0x066a, B:320:0x0670, B:321:0x067b, B:322:0x067e, B:324:0x0684, B:327:0x0689, B:329:0x068d, B:341:0x06b5, B:332:0x0696, B:334:0x069c, B:338:0x06aa, B:340:0x06b2, B:278:0x0584, B:543:0x0a31, B:547:0x0a38, B:145:0x033a, B:146:0x033f, B:149:0x0346, B:152:0x0349), top: B:622:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0967 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztg -> 0x0030, zzfz -> 0x0033, zzbc -> 0x0036, zzqy -> 0x0039, zzib -> 0x003c, TryCatch #15 {zzbc -> 0x0036, zzfz -> 0x0033, zzib -> 0x003c, zzqy -> 0x0039, zztg -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:24:0x0041, B:30:0x004e, B:31:0x004f, B:34:0x0069, B:35:0x007d, B:36:0x008d, B:37:0x00a4, B:38:0x00a8, B:39:0x00ac, B:43:0x00b3, B:45:0x00bc, B:47:0x00ca, B:48:0x00d2, B:49:0x00dd, B:50:0x00f1, B:51:0x0109, B:52:0x011f, B:54:0x012e, B:55:0x0132, B:56:0x0143, B:58:0x0152, B:59:0x016e, B:60:0x0181, B:61:0x018a, B:63:0x019c, B:64:0x01a8, B:65:0x01b8, B:67:0x01c4, B:70:0x01cf, B:71:0x01d6, B:72:0x01e1, B:76:0x01e8, B:78:0x01f0, B:80:0x01f4, B:82:0x01f9, B:84:0x0201, B:85:0x0204, B:87:0x0209, B:93:0x0215, B:94:0x0216, B:98:0x021d, B:100:0x022b, B:101:0x022e, B:102:0x0233, B:104:0x0243, B:105:0x0246, B:106:0x024b, B:107:0x0250, B:109:0x025c, B:110:0x0268, B:112:0x0270, B:113:0x0275, B:115:0x0281, B:117:0x0289, B:119:0x028d, B:120:0x029e, B:122:0x02b5, B:123:0x02d5, B:124:0x02da, B:125:0x02db, B:127:0x02e3, B:129:0x0302, B:137:0x032a, B:138:0x032f, B:144:0x0339, B:153:0x034a, B:154:0x034f, B:155:0x0357, B:159:0x038f, B:232:0x04ba, B:210:0x0481, B:209:0x047d, B:240:0x04ca, B:241:0x04d2, B:167:0x03e2, B:169:0x03f9, B:256:0x04f6, B:258:0x0511, B:261:0x0524, B:263:0x0533, B:265:0x053f, B:267:0x0549, B:271:0x0560, B:273:0x0568, B:274:0x056d, B:268:0x054f, B:270:0x0553, B:275:0x0570, B:277:0x0574, B:279:0x0587, B:342:0x06b8, B:344:0x06c0, B:346:0x06c8, B:349:0x06cd, B:350:0x06d9, B:352:0x06dd, B:354:0x06e5, B:357:0x06f1, B:359:0x06f7, B:360:0x0717, B:362:0x071f, B:364:0x0725, B:366:0x072a, B:368:0x072e, B:407:0x07e8, B:408:0x07ec, B:412:0x07f9, B:414:0x0801, B:415:0x0807, B:417:0x0815, B:418:0x082e, B:420:0x0832, B:422:0x083a, B:436:0x0867, B:423:0x0840, B:425:0x084b, B:429:0x0854, B:435:0x0864, B:439:0x0878, B:441:0x087e, B:445:0x0886, B:447:0x088e, B:449:0x0892, B:450:0x089c, B:452:0x08a2, B:503:0x09ac, B:506:0x09b3, B:508:0x09b7, B:510:0x09bf, B:511:0x09c2, B:512:0x09c5, B:514:0x09cb, B:516:0x09d4, B:518:0x09e0, B:520:0x09e6, B:527:0x0a07, B:529:0x0a0d, B:533:0x0a16, B:542:0x0a2c, B:539:0x0a25, B:541:0x0a29, B:521:0x09ed, B:524:0x09fb, B:525:0x0a02, B:526:0x0a03, B:453:0x08aa, B:455:0x08b0, B:457:0x08b4, B:482:0x094e, B:484:0x095b, B:460:0x08be, B:462:0x08c2, B:464:0x08d6, B:466:0x08e1, B:468:0x08ed, B:472:0x08f6, B:474:0x0900, B:480:0x090b, B:485:0x0967, B:487:0x096d, B:489:0x0971, B:493:0x097a, B:495:0x0988, B:497:0x0990, B:499:0x099a, B:500:0x099f, B:501:0x09a4, B:502:0x09a9, B:438:0x086f, B:371:0x073c, B:373:0x0740, B:375:0x0748, B:377:0x074e, B:379:0x0758, B:382:0x075e, B:383:0x0761, B:385:0x0769, B:387:0x077b, B:389:0x0783, B:391:0x078b, B:395:0x0795, B:397:0x07bc, B:398:0x07bf, B:400:0x07cc, B:402:0x07d2, B:403:0x07d9, B:406:0x07e7, B:282:0x0594, B:284:0x059a, B:287:0x05a3, B:290:0x05ae, B:292:0x05b3, B:294:0x05bb, B:296:0x05c3, B:298:0x05cb, B:300:0x05d9, B:302:0x0614, B:304:0x061e, B:306:0x0627, B:307:0x062f, B:309:0x0635, B:312:0x0645, B:314:0x064f, B:316:0x0659, B:318:0x066a, B:320:0x0670, B:321:0x067b, B:322:0x067e, B:324:0x0684, B:327:0x0689, B:329:0x068d, B:341:0x06b5, B:332:0x0696, B:334:0x069c, B:338:0x06aa, B:340:0x06b2, B:278:0x0584, B:543:0x0a31, B:547:0x0a38, B:145:0x033a, B:146:0x033f, B:149:0x0346, B:152:0x0349), top: B:622:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x096d A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztg -> 0x0030, zzfz -> 0x0033, zzbc -> 0x0036, zzqy -> 0x0039, zzib -> 0x003c, TryCatch #15 {zzbc -> 0x0036, zzfz -> 0x0033, zzib -> 0x003c, zzqy -> 0x0039, zztg -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:24:0x0041, B:30:0x004e, B:31:0x004f, B:34:0x0069, B:35:0x007d, B:36:0x008d, B:37:0x00a4, B:38:0x00a8, B:39:0x00ac, B:43:0x00b3, B:45:0x00bc, B:47:0x00ca, B:48:0x00d2, B:49:0x00dd, B:50:0x00f1, B:51:0x0109, B:52:0x011f, B:54:0x012e, B:55:0x0132, B:56:0x0143, B:58:0x0152, B:59:0x016e, B:60:0x0181, B:61:0x018a, B:63:0x019c, B:64:0x01a8, B:65:0x01b8, B:67:0x01c4, B:70:0x01cf, B:71:0x01d6, B:72:0x01e1, B:76:0x01e8, B:78:0x01f0, B:80:0x01f4, B:82:0x01f9, B:84:0x0201, B:85:0x0204, B:87:0x0209, B:93:0x0215, B:94:0x0216, B:98:0x021d, B:100:0x022b, B:101:0x022e, B:102:0x0233, B:104:0x0243, B:105:0x0246, B:106:0x024b, B:107:0x0250, B:109:0x025c, B:110:0x0268, B:112:0x0270, B:113:0x0275, B:115:0x0281, B:117:0x0289, B:119:0x028d, B:120:0x029e, B:122:0x02b5, B:123:0x02d5, B:124:0x02da, B:125:0x02db, B:127:0x02e3, B:129:0x0302, B:137:0x032a, B:138:0x032f, B:144:0x0339, B:153:0x034a, B:154:0x034f, B:155:0x0357, B:159:0x038f, B:232:0x04ba, B:210:0x0481, B:209:0x047d, B:240:0x04ca, B:241:0x04d2, B:167:0x03e2, B:169:0x03f9, B:256:0x04f6, B:258:0x0511, B:261:0x0524, B:263:0x0533, B:265:0x053f, B:267:0x0549, B:271:0x0560, B:273:0x0568, B:274:0x056d, B:268:0x054f, B:270:0x0553, B:275:0x0570, B:277:0x0574, B:279:0x0587, B:342:0x06b8, B:344:0x06c0, B:346:0x06c8, B:349:0x06cd, B:350:0x06d9, B:352:0x06dd, B:354:0x06e5, B:357:0x06f1, B:359:0x06f7, B:360:0x0717, B:362:0x071f, B:364:0x0725, B:366:0x072a, B:368:0x072e, B:407:0x07e8, B:408:0x07ec, B:412:0x07f9, B:414:0x0801, B:415:0x0807, B:417:0x0815, B:418:0x082e, B:420:0x0832, B:422:0x083a, B:436:0x0867, B:423:0x0840, B:425:0x084b, B:429:0x0854, B:435:0x0864, B:439:0x0878, B:441:0x087e, B:445:0x0886, B:447:0x088e, B:449:0x0892, B:450:0x089c, B:452:0x08a2, B:503:0x09ac, B:506:0x09b3, B:508:0x09b7, B:510:0x09bf, B:511:0x09c2, B:512:0x09c5, B:514:0x09cb, B:516:0x09d4, B:518:0x09e0, B:520:0x09e6, B:527:0x0a07, B:529:0x0a0d, B:533:0x0a16, B:542:0x0a2c, B:539:0x0a25, B:541:0x0a29, B:521:0x09ed, B:524:0x09fb, B:525:0x0a02, B:526:0x0a03, B:453:0x08aa, B:455:0x08b0, B:457:0x08b4, B:482:0x094e, B:484:0x095b, B:460:0x08be, B:462:0x08c2, B:464:0x08d6, B:466:0x08e1, B:468:0x08ed, B:472:0x08f6, B:474:0x0900, B:480:0x090b, B:485:0x0967, B:487:0x096d, B:489:0x0971, B:493:0x097a, B:495:0x0988, B:497:0x0990, B:499:0x099a, B:500:0x099f, B:501:0x09a4, B:502:0x09a9, B:438:0x086f, B:371:0x073c, B:373:0x0740, B:375:0x0748, B:377:0x074e, B:379:0x0758, B:382:0x075e, B:383:0x0761, B:385:0x0769, B:387:0x077b, B:389:0x0783, B:391:0x078b, B:395:0x0795, B:397:0x07bc, B:398:0x07bf, B:400:0x07cc, B:402:0x07d2, B:403:0x07d9, B:406:0x07e7, B:282:0x0594, B:284:0x059a, B:287:0x05a3, B:290:0x05ae, B:292:0x05b3, B:294:0x05bb, B:296:0x05c3, B:298:0x05cb, B:300:0x05d9, B:302:0x0614, B:304:0x061e, B:306:0x0627, B:307:0x062f, B:309:0x0635, B:312:0x0645, B:314:0x064f, B:316:0x0659, B:318:0x066a, B:320:0x0670, B:321:0x067b, B:322:0x067e, B:324:0x0684, B:327:0x0689, B:329:0x068d, B:341:0x06b5, B:332:0x0696, B:334:0x069c, B:338:0x06aa, B:340:0x06b2, B:278:0x0584, B:543:0x0a31, B:547:0x0a38, B:145:0x033a, B:146:0x033f, B:149:0x0346, B:152:0x0349), top: B:622:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0988 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztg -> 0x0030, zzfz -> 0x0033, zzbc -> 0x0036, zzqy -> 0x0039, zzib -> 0x003c, TryCatch #15 {zzbc -> 0x0036, zzfz -> 0x0033, zzib -> 0x003c, zzqy -> 0x0039, zztg -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:24:0x0041, B:30:0x004e, B:31:0x004f, B:34:0x0069, B:35:0x007d, B:36:0x008d, B:37:0x00a4, B:38:0x00a8, B:39:0x00ac, B:43:0x00b3, B:45:0x00bc, B:47:0x00ca, B:48:0x00d2, B:49:0x00dd, B:50:0x00f1, B:51:0x0109, B:52:0x011f, B:54:0x012e, B:55:0x0132, B:56:0x0143, B:58:0x0152, B:59:0x016e, B:60:0x0181, B:61:0x018a, B:63:0x019c, B:64:0x01a8, B:65:0x01b8, B:67:0x01c4, B:70:0x01cf, B:71:0x01d6, B:72:0x01e1, B:76:0x01e8, B:78:0x01f0, B:80:0x01f4, B:82:0x01f9, B:84:0x0201, B:85:0x0204, B:87:0x0209, B:93:0x0215, B:94:0x0216, B:98:0x021d, B:100:0x022b, B:101:0x022e, B:102:0x0233, B:104:0x0243, B:105:0x0246, B:106:0x024b, B:107:0x0250, B:109:0x025c, B:110:0x0268, B:112:0x0270, B:113:0x0275, B:115:0x0281, B:117:0x0289, B:119:0x028d, B:120:0x029e, B:122:0x02b5, B:123:0x02d5, B:124:0x02da, B:125:0x02db, B:127:0x02e3, B:129:0x0302, B:137:0x032a, B:138:0x032f, B:144:0x0339, B:153:0x034a, B:154:0x034f, B:155:0x0357, B:159:0x038f, B:232:0x04ba, B:210:0x0481, B:209:0x047d, B:240:0x04ca, B:241:0x04d2, B:167:0x03e2, B:169:0x03f9, B:256:0x04f6, B:258:0x0511, B:261:0x0524, B:263:0x0533, B:265:0x053f, B:267:0x0549, B:271:0x0560, B:273:0x0568, B:274:0x056d, B:268:0x054f, B:270:0x0553, B:275:0x0570, B:277:0x0574, B:279:0x0587, B:342:0x06b8, B:344:0x06c0, B:346:0x06c8, B:349:0x06cd, B:350:0x06d9, B:352:0x06dd, B:354:0x06e5, B:357:0x06f1, B:359:0x06f7, B:360:0x0717, B:362:0x071f, B:364:0x0725, B:366:0x072a, B:368:0x072e, B:407:0x07e8, B:408:0x07ec, B:412:0x07f9, B:414:0x0801, B:415:0x0807, B:417:0x0815, B:418:0x082e, B:420:0x0832, B:422:0x083a, B:436:0x0867, B:423:0x0840, B:425:0x084b, B:429:0x0854, B:435:0x0864, B:439:0x0878, B:441:0x087e, B:445:0x0886, B:447:0x088e, B:449:0x0892, B:450:0x089c, B:452:0x08a2, B:503:0x09ac, B:506:0x09b3, B:508:0x09b7, B:510:0x09bf, B:511:0x09c2, B:512:0x09c5, B:514:0x09cb, B:516:0x09d4, B:518:0x09e0, B:520:0x09e6, B:527:0x0a07, B:529:0x0a0d, B:533:0x0a16, B:542:0x0a2c, B:539:0x0a25, B:541:0x0a29, B:521:0x09ed, B:524:0x09fb, B:525:0x0a02, B:526:0x0a03, B:453:0x08aa, B:455:0x08b0, B:457:0x08b4, B:482:0x094e, B:484:0x095b, B:460:0x08be, B:462:0x08c2, B:464:0x08d6, B:466:0x08e1, B:468:0x08ed, B:472:0x08f6, B:474:0x0900, B:480:0x090b, B:485:0x0967, B:487:0x096d, B:489:0x0971, B:493:0x097a, B:495:0x0988, B:497:0x0990, B:499:0x099a, B:500:0x099f, B:501:0x09a4, B:502:0x09a9, B:438:0x086f, B:371:0x073c, B:373:0x0740, B:375:0x0748, B:377:0x074e, B:379:0x0758, B:382:0x075e, B:383:0x0761, B:385:0x0769, B:387:0x077b, B:389:0x0783, B:391:0x078b, B:395:0x0795, B:397:0x07bc, B:398:0x07bf, B:400:0x07cc, B:402:0x07d2, B:403:0x07d9, B:406:0x07e7, B:282:0x0594, B:284:0x059a, B:287:0x05a3, B:290:0x05ae, B:292:0x05b3, B:294:0x05bb, B:296:0x05c3, B:298:0x05cb, B:300:0x05d9, B:302:0x0614, B:304:0x061e, B:306:0x0627, B:307:0x062f, B:309:0x0635, B:312:0x0645, B:314:0x064f, B:316:0x0659, B:318:0x066a, B:320:0x0670, B:321:0x067b, B:322:0x067e, B:324:0x0684, B:327:0x0689, B:329:0x068d, B:341:0x06b5, B:332:0x0696, B:334:0x069c, B:338:0x06aa, B:340:0x06b2, B:278:0x0584, B:543:0x0a31, B:547:0x0a38, B:145:0x033a, B:146:0x033f, B:149:0x0346, B:152:0x0349), top: B:622:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0a03 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztg -> 0x0030, zzfz -> 0x0033, zzbc -> 0x0036, zzqy -> 0x0039, zzib -> 0x003c, TryCatch #15 {zzbc -> 0x0036, zzfz -> 0x0033, zzib -> 0x003c, zzqy -> 0x0039, zztg -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000f, B:6:0x0013, B:8:0x0022, B:24:0x0041, B:30:0x004e, B:31:0x004f, B:34:0x0069, B:35:0x007d, B:36:0x008d, B:37:0x00a4, B:38:0x00a8, B:39:0x00ac, B:43:0x00b3, B:45:0x00bc, B:47:0x00ca, B:48:0x00d2, B:49:0x00dd, B:50:0x00f1, B:51:0x0109, B:52:0x011f, B:54:0x012e, B:55:0x0132, B:56:0x0143, B:58:0x0152, B:59:0x016e, B:60:0x0181, B:61:0x018a, B:63:0x019c, B:64:0x01a8, B:65:0x01b8, B:67:0x01c4, B:70:0x01cf, B:71:0x01d6, B:72:0x01e1, B:76:0x01e8, B:78:0x01f0, B:80:0x01f4, B:82:0x01f9, B:84:0x0201, B:85:0x0204, B:87:0x0209, B:93:0x0215, B:94:0x0216, B:98:0x021d, B:100:0x022b, B:101:0x022e, B:102:0x0233, B:104:0x0243, B:105:0x0246, B:106:0x024b, B:107:0x0250, B:109:0x025c, B:110:0x0268, B:112:0x0270, B:113:0x0275, B:115:0x0281, B:117:0x0289, B:119:0x028d, B:120:0x029e, B:122:0x02b5, B:123:0x02d5, B:124:0x02da, B:125:0x02db, B:127:0x02e3, B:129:0x0302, B:137:0x032a, B:138:0x032f, B:144:0x0339, B:153:0x034a, B:154:0x034f, B:155:0x0357, B:159:0x038f, B:232:0x04ba, B:210:0x0481, B:209:0x047d, B:240:0x04ca, B:241:0x04d2, B:167:0x03e2, B:169:0x03f9, B:256:0x04f6, B:258:0x0511, B:261:0x0524, B:263:0x0533, B:265:0x053f, B:267:0x0549, B:271:0x0560, B:273:0x0568, B:274:0x056d, B:268:0x054f, B:270:0x0553, B:275:0x0570, B:277:0x0574, B:279:0x0587, B:342:0x06b8, B:344:0x06c0, B:346:0x06c8, B:349:0x06cd, B:350:0x06d9, B:352:0x06dd, B:354:0x06e5, B:357:0x06f1, B:359:0x06f7, B:360:0x0717, B:362:0x071f, B:364:0x0725, B:366:0x072a, B:368:0x072e, B:407:0x07e8, B:408:0x07ec, B:412:0x07f9, B:414:0x0801, B:415:0x0807, B:417:0x0815, B:418:0x082e, B:420:0x0832, B:422:0x083a, B:436:0x0867, B:423:0x0840, B:425:0x084b, B:429:0x0854, B:435:0x0864, B:439:0x0878, B:441:0x087e, B:445:0x0886, B:447:0x088e, B:449:0x0892, B:450:0x089c, B:452:0x08a2, B:503:0x09ac, B:506:0x09b3, B:508:0x09b7, B:510:0x09bf, B:511:0x09c2, B:512:0x09c5, B:514:0x09cb, B:516:0x09d4, B:518:0x09e0, B:520:0x09e6, B:527:0x0a07, B:529:0x0a0d, B:533:0x0a16, B:542:0x0a2c, B:539:0x0a25, B:541:0x0a29, B:521:0x09ed, B:524:0x09fb, B:525:0x0a02, B:526:0x0a03, B:453:0x08aa, B:455:0x08b0, B:457:0x08b4, B:482:0x094e, B:484:0x095b, B:460:0x08be, B:462:0x08c2, B:464:0x08d6, B:466:0x08e1, B:468:0x08ed, B:472:0x08f6, B:474:0x0900, B:480:0x090b, B:485:0x0967, B:487:0x096d, B:489:0x0971, B:493:0x097a, B:495:0x0988, B:497:0x0990, B:499:0x099a, B:500:0x099f, B:501:0x09a4, B:502:0x09a9, B:438:0x086f, B:371:0x073c, B:373:0x0740, B:375:0x0748, B:377:0x074e, B:379:0x0758, B:382:0x075e, B:383:0x0761, B:385:0x0769, B:387:0x077b, B:389:0x0783, B:391:0x078b, B:395:0x0795, B:397:0x07bc, B:398:0x07bf, B:400:0x07cc, B:402:0x07d2, B:403:0x07d9, B:406:0x07e7, B:282:0x0594, B:284:0x059a, B:287:0x05a3, B:290:0x05ae, B:292:0x05b3, B:294:0x05bb, B:296:0x05c3, B:298:0x05cb, B:300:0x05d9, B:302:0x0614, B:304:0x061e, B:306:0x0627, B:307:0x062f, B:309:0x0635, B:312:0x0645, B:314:0x064f, B:316:0x0659, B:318:0x066a, B:320:0x0670, B:321:0x067b, B:322:0x067e, B:324:0x0684, B:327:0x0689, B:329:0x068d, B:341:0x06b5, B:332:0x0696, B:334:0x069c, B:338:0x06aa, B:340:0x06b2, B:278:0x0584, B:543:0x0a31, B:547:0x0a38, B:145:0x033a, B:146:0x033f, B:149:0x0346, B:152:0x0349), top: B:622:0x0006 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Yz0.handleMessage(android.os.Message):boolean");
    }

    private final void A(boolean z10) throws zzib {
        C7453aF0 c7453aF0 = this.f71942q.p().f74268g.f74617a;
        long jL0 = l0(c7453aF0, this.f71949x.f79705s, true, false);
        if (jL0 != this.f71949x.f79705s) {
            C9899xA0 c9899xA0 = this.f71949x;
            this.f71949x = e(c7453aF0, jL0, c9899xA0.f79689c, c9899xA0.f79690d, z10, 5);
        }
    }

    private final void B(C7488ag c7488ag) {
        this.f71933h.zzf(16);
        this.f71939n.r(c7488ag);
    }

    private final void C(boolean z10, int i10, boolean z11, int i11) throws zzib {
        this.f71950y.a(z11 ? 1 : 0);
        this.f71949x = this.f71949x.c(z10, i11, i10);
        L(false, false);
        for (C8083gA0 c8083gA0P = this.f71942q.p(); c8083gA0P != null; c8083gA0P = c8083gA0P.g()) {
            for (PG0 pg0 : c8083gA0P.i().f71309c) {
            }
        }
        if (!P()) {
            G();
            J();
            return;
        }
        int i12 = this.f71949x.f79691e;
        if (i12 == 3) {
            this.f71939n.e();
            E();
            this.f71933h.zzi(2);
        } else if (i12 == 2) {
            this.f71933h.zzi(2);
        }
    }

    private final void D(int i10) {
        C9899xA0 c9899xA0 = this.f71949x;
        if (c9899xA0.f79691e != i10) {
            if (i10 != 2) {
                this.f71922P = -9223372036854775807L;
            }
            this.f71949x = c9899xA0.e(i10);
        }
    }

    private final void E() throws zzib {
        C8083gA0 c8083gA0P = this.f71942q.p();
        if (c8083gA0P == null) {
            return;
        }
        XG0 xg0I = c8083gA0P.i();
        for (int i10 = 0; i10 < 2; i10++) {
            if (xg0I.b(i10)) {
                this.f71926a[i10].s();
            }
        }
    }

    private final void G() throws zzib {
        this.f71939n.f();
        int i10 = 0;
        while (true) {
            KA0[] ka0Arr = this.f71926a;
            if (i10 >= 2) {
                return;
            }
            ka0Arr[i10].t();
            i10++;
        }
    }

    private final void H() {
        C8083gA0 c8083gA0O = this.f71942q.o();
        boolean z10 = this.f71911E || (c8083gA0O != null && c8083gA0O.f74262a.zzp());
        C9899xA0 c9899xA0 = this.f71949x;
        if (z10 != c9899xA0.f79693g) {
            this.f71949x = new C9899xA0(c9899xA0.f79687a, c9899xA0.f79688b, c9899xA0.f79689c, c9899xA0.f79690d, c9899xA0.f79691e, c9899xA0.f79692f, z10, c9899xA0.f79694h, c9899xA0.f79695i, c9899xA0.f79696j, c9899xA0.f79697k, c9899xA0.f79698l, c9899xA0.f79699m, c9899xA0.f79700n, c9899xA0.f79701o, c9899xA0.f79703q, c9899xA0.f79704r, c9899xA0.f79705s, c9899xA0.f79706t, false);
        }
    }

    private final void I(C7453aF0 c7453aF0, C7775dG0 c7775dG0, XG0 xg0) {
        long jE;
        long jE2;
        C8083gA0 c8083gA0O = this.f71942q.o();
        c8083gA0O.getClass();
        if (c8083gA0O == this.f71942q.p()) {
            jE = this.f71917K;
            jE2 = c8083gA0O.e();
        } else {
            jE = this.f71917K - c8083gA0O.e();
            jE2 = c8083gA0O.f74268g.f74618b;
        }
        this.f71931f.i(new C7443aA0(this.f71945t, this.f71949x.f79687a, c7453aF0, jE - jE2, j0(c8083gA0O.c()), this.f71939n.zzc().f72461a, this.f71949x.f79698l, this.f71909C, Q(this.f71949x.f79687a, c8083gA0O.f74268g.f74617a) ? this.f71925S.b() : -9223372036854775807L), c7775dG0, xg0.f71309c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J() throws com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Yz0.J():void");
    }

    private final void L(boolean z10, boolean z11) {
        this.f71909C = z10;
        long jElapsedRealtime = -9223372036854775807L;
        if (z10 && !z11) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f71910D = jElapsedRealtime;
    }

    private final boolean N() {
        C8083gA0 c8083gA0P = this.f71942q.p();
        long j10 = c8083gA0P.f74268g.f74621e;
        if (c8083gA0P.f74266e) {
            return j10 == -9223372036854775807L || this.f71949x.f79705s < j10 || !P();
        }
        return false;
    }

    private static boolean O(C9899xA0 c9899xA0, C7306Wk c7306Wk) {
        C7453aF0 c7453aF0 = c9899xA0.f79688b;
        AbstractC7307Wl abstractC7307Wl = c9899xA0.f79687a;
        return abstractC7307Wl.o() || abstractC7307Wl.n(c7453aF0.f72382a, c7306Wk).f71153f;
    }

    private final boolean P() {
        C9899xA0 c9899xA0 = this.f71949x;
        return c9899xA0.f79698l && c9899xA0.f79700n == 0;
    }

    public static /* synthetic */ C8083gA0 W(Yz0 yz0, C8190hA0 c8190hA0, long j10) {
        C7990fH0 c7990fH0Zzk = yz0.f71931f.zzk();
        long j11 = yz0.f71923Q.f74209a;
        XG0 xg0 = yz0.f71930e;
        C9792wA0 c9792wA0 = yz0.f71943r;
        return new C8083gA0(yz0.f71927b, j10, yz0.f71929d, c7990fH0Zzk, c9792wA0, c8190hA0, xg0, -9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.C9899xA0 e(com.google.android.gms.internal.ads.C7453aF0 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Yz0.e(com.google.android.gms.internal.ads.aF0, long, long, long, boolean, int):com.google.android.gms.internal.ads.xA0");
    }

    private final void f(int i10) {
        int iB = this.f71926a[i10].b();
        this.f71926a[i10].e(this.f71939n);
        s(i10, false);
        this.f71915I -= iB;
    }

    private final void h() throws zzib {
        i(new boolean[2], this.f71942q.s().f());
    }

    private final long h0(AbstractC7307Wl abstractC7307Wl, Object obj, long j10) {
        abstractC7307Wl.e(abstractC7307Wl.n(obj, this.f71937l).f71150c, this.f71936k, 0L);
        C9954xl c9954xl = this.f71936k;
        if (c9954xl.f79850e != -9223372036854775807L && c9954xl.b()) {
            C9954xl c9954xl2 = this.f71936k;
            if (c9954xl2.f79853h) {
                long j11 = c9954xl2.f79851f;
                return OV.K((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - this.f71936k.f79850e) - j10;
            }
        }
        return -9223372036854775807L;
    }

    private final void i(boolean[] zArr, long j10) throws zzib {
        C8083gA0 c8083gA0S = this.f71942q.s();
        XG0 xg0I = c8083gA0S.i();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!xg0I.b(i10)) {
                this.f71926a[i10].m();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (xg0I.b(i11)) {
                boolean z10 = zArr[i11];
                C8402jA0 c8402jA0 = this.f71942q;
                KA0[] ka0Arr = this.f71926a;
                C8083gA0 c8083gA0S2 = c8402jA0.s();
                KA0 ka0 = ka0Arr[i11];
                if (ka0.b() <= 0) {
                    boolean z11 = c8083gA0S2 == this.f71942q.p();
                    XG0 xg0I2 = c8083gA0S2.i();
                    JA0 ja0 = xg0I2.f71308b[i11];
                    C[] cArrR = R(xg0I2.f71309c[i11]);
                    boolean z12 = P() && this.f71949x.f79691e == 3;
                    boolean z13 = !z10 && z12;
                    this.f71915I++;
                    ka0.f(ja0, cArrR, c8083gA0S2.f74264c[i11], this.f71917K, z13, z11, j10, c8083gA0S2.e(), c8083gA0S2.f74268g.f74617a, this.f71939n);
                    ka0.h(11, new Qz0(this));
                    if (z12 && z11) {
                        ka0.s();
                    }
                }
            }
        }
        c8083gA0S.f74269h = true;
    }

    private final long i0() {
        return j0(this.f71949x.f79703q);
    }

    private final void j(IOException iOException, int i10) {
        C8402jA0 c8402jA0 = this.f71942q;
        zzib zzibVarC = zzib.c(iOException, i10);
        C8083gA0 c8083gA0P = c8402jA0.p();
        if (c8083gA0P != null) {
            zzibVarC = zzibVarC.a(c8083gA0P.f74268g.f74617a);
        }
        C9917xL.d("ExoPlayerImplInternal", "Playback error", zzibVarC);
        F(false, false);
        this.f71949x = this.f71949x.d(zzibVarC);
    }

    private final long j0(long j10) {
        C8083gA0 c8083gA0O = this.f71942q.o();
        if (c8083gA0O == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.f71917K - c8083gA0O.e()));
    }

    private final void k(boolean z10) {
        C8083gA0 c8083gA0O = this.f71942q.o();
        C7453aF0 c7453aF0 = c8083gA0O == null ? this.f71949x.f79688b : c8083gA0O.f74268g.f74617a;
        boolean zEquals = this.f71949x.f79697k.equals(c7453aF0);
        if (!zEquals) {
            this.f71949x = this.f71949x.a(c7453aF0);
        }
        C9899xA0 c9899xA0 = this.f71949x;
        c9899xA0.f79703q = c8083gA0O == null ? c9899xA0.f79705s : c8083gA0O.c();
        this.f71949x.f79704r = i0();
        if ((!zEquals || z10) && c8083gA0O != null && c8083gA0O.f74266e) {
            I(c8083gA0O.f74268g.f74617a, c8083gA0O.h(), c8083gA0O.i());
        }
    }

    private final long k0(C7453aF0 c7453aF0, long j10, boolean z10) throws zzib {
        C8402jA0 c8402jA0 = this.f71942q;
        return l0(c7453aF0, j10, c8402jA0.p() != c8402jA0.s(), z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02cb A[Catch: all -> 0x02cf, TRY_ENTER, TryCatch #6 {all -> 0x02cf, blocks: (B:146:0x02cb, B:153:0x02e2, B:155:0x02ee, B:157:0x02f6, B:159:0x0300, B:160:0x030d, B:161:0x0312), top: B:235:0x0251 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0416  */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32, types: [int] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l(com.google.android.gms.internal.ads.AbstractC7307Wl r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Yz0.l(com.google.android.gms.internal.ads.Wl, boolean):void");
    }

    private final void m(C7488ag c7488ag, boolean z10) throws zzib {
        n(c7488ag, c7488ag.f72461a, true, z10);
    }

    private final void n(C7488ag c7488ag, float f10, boolean z10, boolean z11) throws zzib {
        C7488ag c7488ag2;
        int i10;
        if (z10) {
            if (z11) {
                this.f71950y.a(1);
            }
            C9899xA0 c9899xA0 = this.f71949x;
            C9899xA0 c9899xA02 = new C9899xA0(c9899xA0.f79687a, c9899xA0.f79688b, c9899xA0.f79689c, c9899xA0.f79690d, c9899xA0.f79691e, c9899xA0.f79692f, c9899xA0.f79693g, c9899xA0.f79694h, c9899xA0.f79695i, c9899xA0.f79696j, c9899xA0.f79697k, c9899xA0.f79698l, c9899xA0.f79699m, c9899xA0.f79700n, c7488ag, c9899xA0.f79703q, c9899xA0.f79704r, c9899xA0.f79705s, c9899xA0.f79706t, false);
            c7488ag2 = c7488ag;
            this.f71949x = c9899xA02;
        } else {
            c7488ag2 = c7488ag;
        }
        float f11 = c7488ag2.f72461a;
        C8083gA0 c8083gA0P = this.f71942q.p();
        while (true) {
            i10 = 0;
            if (c8083gA0P == null) {
                break;
            }
            PG0[] pg0Arr = c8083gA0P.i().f71309c;
            int length = pg0Arr.length;
            while (i10 < length) {
                PG0 pg0 = pg0Arr[i10];
                i10++;
            }
            c8083gA0P = c8083gA0P.g();
        }
        KA0[] ka0Arr = this.f71926a;
        while (i10 < 2) {
            ka0Arr[i10].p(f10, c7488ag2.f72461a);
            i10++;
        }
    }

    private static Pair n0(AbstractC7307Wl abstractC7307Wl, Wz0 wz0, boolean z10, int i10, boolean z11, C9954xl c9954xl, C7306Wk c7306Wk) {
        Pair pairL;
        AbstractC7307Wl abstractC7307Wl2;
        AbstractC7307Wl abstractC7307Wl3 = wz0.f71220a;
        if (abstractC7307Wl.o()) {
            return null;
        }
        if (true == abstractC7307Wl3.o()) {
            abstractC7307Wl3 = abstractC7307Wl;
        }
        try {
            pairL = abstractC7307Wl3.l(c9954xl, c7306Wk, wz0.f71221b, wz0.f71222c);
            abstractC7307Wl2 = abstractC7307Wl3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC7307Wl.equals(abstractC7307Wl2)) {
            return pairL;
        }
        if (abstractC7307Wl.a(pairL.first) != -1) {
            return (abstractC7307Wl2.n(pairL.first, c7306Wk).f71153f && abstractC7307Wl2.e(c7306Wk.f71150c, c9954xl, 0L).f79858m == abstractC7307Wl2.a(pairL.first)) ? abstractC7307Wl.l(c9954xl, c7306Wk, abstractC7307Wl.n(pairL.first, c7306Wk).f71150c, wz0.f71222c) : pairL;
        }
        int iU = U(c9954xl, c7306Wk, i10, z11, pairL.first, abstractC7307Wl2, abstractC7307Wl);
        if (iU != -1) {
            return abstractC7307Wl.l(c9954xl, c7306Wk, iU, -9223372036854775807L);
        }
        return null;
    }

    private final void o() {
        long jE;
        long jE2;
        boolean zB = false;
        if (T(this.f71942q.o())) {
            C8083gA0 c8083gA0O = this.f71942q.o();
            long jJ0 = j0(c8083gA0O.d());
            if (c8083gA0O == this.f71942q.p()) {
                jE = this.f71917K;
                jE2 = c8083gA0O.e();
            } else {
                jE = this.f71917K - c8083gA0O.e();
                jE2 = c8083gA0O.f74268g.f74618b;
            }
            C7443aA0 c7443aA0 = new C7443aA0(this.f71945t, this.f71949x.f79687a, c8083gA0O.f74268g.f74617a, jE - jE2, jJ0, this.f71939n.zzc().f72461a, this.f71949x.f79698l, this.f71909C, Q(this.f71949x.f79687a, c8083gA0O.f74268g.f74617a) ? this.f71925S.b() : -9223372036854775807L);
            boolean zB2 = this.f71931f.b(c7443aA0);
            C8083gA0 c8083gA0P = this.f71942q.p();
            if (zB2 || !c8083gA0P.f74266e || jJ0 >= 500000 || this.f71938m <= 0) {
                zB = zB2;
            } else {
                c8083gA0P.f74262a.k(this.f71949x.f79705s, false);
                zB = this.f71931f.b(c7443aA0);
            }
        }
        this.f71911E = zB;
        if (zB) {
            C8083gA0 c8083gA0O2 = this.f71942q.o();
            c8083gA0O2.getClass();
            C7656cA0 c7656cA0 = new C7656cA0();
            c7656cA0.e(this.f71917K - c8083gA0O2.e());
            c7656cA0.f(this.f71939n.zzc().f72461a);
            c7656cA0.d(this.f71910D);
            c8083gA0O2.k(new C7869eA0(c7656cA0, null));
        }
        H();
    }

    private final void p() {
        this.f71942q.y();
        C8083gA0 c8083gA0R = this.f71942q.r();
        if (c8083gA0R != null) {
            if ((!c8083gA0R.f74265d || c8083gA0R.f74266e) && !c8083gA0R.f74262a.zzp()) {
                if (this.f71931f.h(this.f71949x.f79687a, c8083gA0R.f74268g.f74617a, c8083gA0R.f74266e ? c8083gA0R.f74262a.zzb() : 0L)) {
                    if (!c8083gA0R.f74265d) {
                        c8083gA0R.m(this, c8083gA0R.f74268g.f74618b);
                        return;
                    }
                    C7656cA0 c7656cA0 = new C7656cA0();
                    c7656cA0.e(this.f71917K - c8083gA0R.e());
                    c7656cA0.f(this.f71939n.zzc().f72461a);
                    c7656cA0.d(this.f71910D);
                    c8083gA0R.k(new C7869eA0(c7656cA0, null));
                }
            }
        }
    }

    private final void q() {
        this.f71950y.b(this.f71949x);
        if (this.f71950y.f70743a) {
            C9341rz0 c9341rz0 = this.f71924R;
            c9341rz0.f78099a.r(this.f71950y);
            this.f71950y = new Uz0(this.f71949x);
        }
    }

    private final void r(int i10) throws zzib, IOException {
        KA0 ka0 = this.f71926a[i10];
        try {
            ka0.i();
        } catch (IOException | RuntimeException e10) {
            ka0.c();
            throw e10;
        }
    }

    private final void s(final int i10, final boolean z10) {
        boolean[] zArr = this.f71928c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f71947v.b(new Runnable() { // from class: com.google.android.gms.internal.ads.Mz0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68781a.Y(i10, z10);
                }
            });
        }
    }

    private final void t() throws zzib {
        int i10;
        int i11;
        float f10 = this.f71939n.zzc().f72461a;
        C8402jA0 c8402jA0 = this.f71942q;
        C8083gA0 c8083gA0P = c8402jA0.p();
        C8083gA0 c8083gA0S = c8402jA0.s();
        XG0 xg0 = null;
        boolean z10 = true;
        while (c8083gA0P != null && c8083gA0P.f74266e) {
            C9899xA0 c9899xA0 = this.f71949x;
            XG0 xg0J = c8083gA0P.j(f10, c9899xA0.f79687a, c9899xA0.f79698l);
            XG0 xg02 = c8083gA0P == this.f71942q.p() ? xg0J : xg0;
            XG0 xg0I = c8083gA0P.i();
            boolean z11 = false;
            if (xg0I != null) {
                if (xg0I.f71309c.length == xg0J.f71309c.length) {
                    for (int i12 = 0; i12 < xg0J.f71309c.length; i12++) {
                        if (xg0J.a(xg0I, i12)) {
                        }
                    }
                    if (c8083gA0P != c8083gA0S) {
                        z11 = true;
                    }
                    z10 &= z11;
                    c8083gA0P = c8083gA0P.g();
                    xg0 = xg02;
                }
            }
            if (z10) {
                C8402jA0 c8402jA02 = this.f71942q;
                C8083gA0 c8083gA0P2 = c8402jA02.p();
                boolean zF = c8402jA02.F(c8083gA0P2);
                boolean[] zArr = new boolean[2];
                xg02.getClass();
                long jB = c8083gA0P2.b(xg02, this.f71949x.f79705s, zF, zArr);
                C9899xA0 c9899xA02 = this.f71949x;
                boolean z12 = (c9899xA02.f79691e == 4 || jB == c9899xA02.f79705s) ? false : true;
                C9899xA0 c9899xA03 = this.f71949x;
                i11 = 2;
                i10 = 4;
                this.f71949x = e(c9899xA03.f79688b, jB, c9899xA03.f79689c, c9899xA03.f79690d, z12, 5);
                if (z12) {
                    x(jB);
                }
                boolean[] zArr2 = new boolean[2];
                int i13 = 0;
                while (true) {
                    KA0[] ka0Arr = this.f71926a;
                    if (i13 >= 2) {
                        break;
                    }
                    int iB = ka0Arr[i13].b();
                    zArr2[i13] = 1 == iB;
                    if (iB != 0) {
                        if (!this.f71926a[i13].z(c8083gA0P2)) {
                            f(i13);
                        } else if (zArr[i13]) {
                            this.f71926a[i13].n(this.f71917K);
                        }
                    }
                    i13++;
                }
                i(zArr2, this.f71917K);
            } else {
                i10 = 4;
                i11 = 2;
                this.f71942q.F(c8083gA0P);
                if (c8083gA0P.f74266e) {
                    c8083gA0P.a(xg0J, Math.max(c8083gA0P.f74268g.f74618b, this.f71917K - c8083gA0P.e()), false);
                }
            }
            k(true);
            if (this.f71949x.f79691e != i10) {
                o();
                J();
                this.f71933h.zzi(i11);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[PHI: r2 r7 r9
      0x008e: PHI (r2v2 com.google.android.gms.internal.ads.aF0) = (r2v1 com.google.android.gms.internal.ads.aF0), (r2v12 com.google.android.gms.internal.ads.aF0) binds: [B:23:0x0064, B:25:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r7v3 long) = (r7v2 long), (r7v8 long) binds: [B:23:0x0064, B:25:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r9v2 long) = (r9v1 long), (r9v7 long) binds: [B:23:0x0064, B:25:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6 A[PHI: r0
      0x00d6: PHI (r0v11 com.google.android.gms.internal.ads.Wl) = 
      (r0v10 com.google.android.gms.internal.ads.Wl)
      (r0v10 com.google.android.gms.internal.ads.Wl)
      (r0v21 com.google.android.gms.internal.ads.Wl)
      (r0v21 com.google.android.gms.internal.ads.Wl)
     binds: [B:29:0x009b, B:31:0x009f, B:33:0x00b0, B:35:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Yz0.v(boolean, boolean, boolean, boolean):void");
    }

    private final void w() {
        C8083gA0 c8083gA0P = this.f71942q.p();
        boolean z10 = false;
        if (c8083gA0P != null && c8083gA0P.f74268g.f74624h && this.f71907A) {
            z10 = true;
        }
        this.f71908B = z10;
    }

    private final void x(long j10) throws zzib {
        C8083gA0 c8083gA0P = this.f71942q.p();
        long jE = j10 + (c8083gA0P == null ? 1000000000000L : c8083gA0P.e());
        this.f71917K = jE;
        this.f71939n.d(jE);
        KA0[] ka0Arr = this.f71926a;
        for (int i10 = 0; i10 < 2; i10++) {
            ka0Arr[i10].n(this.f71917K);
        }
        for (C8083gA0 c8083gA0P2 = this.f71942q.p(); c8083gA0P2 != null; c8083gA0P2 = c8083gA0P2.g()) {
            for (PG0 pg0 : c8083gA0P2.i().f71309c) {
            }
        }
    }

    private final void z(long j10) {
        this.f71933h.zzj(2, j10 + ((this.f71949x.f79691e != 3 || P()) ? f71906T : 1000L));
    }

    final /* synthetic */ Boolean X() {
        return Boolean.valueOf(this.f71951z);
    }

    final /* synthetic */ void Y(int i10, boolean z10) {
        this.f71946u.h(i10, this.f71926a[i10].c(), z10);
    }

    public final void Z() {
        this.f71933h.zzb(29).zza();
    }

    @Override // com.google.android.gms.internal.ads.XE0
    public final void a(YE0 ye0) {
        this.f71933h.a(8, ye0).zza();
    }

    public final void a0(AbstractC7307Wl abstractC7307Wl, int i10, long j10) {
        this.f71933h.a(3, new Wz0(abstractC7307Wl, i10, j10)).zza();
    }

    @Override // com.google.android.gms.internal.ads.Ty0
    public final void b(C7488ag c7488ag) {
        this.f71933h.a(16, c7488ag).zza();
    }

    public final void b0(boolean z10, int i10, int i11) {
        this.f71933h.c(1, z10 ? 1 : 0, i10 | (i11 << 4)).zza();
    }

    public final void c0() {
        this.f71933h.zzb(6).zza();
    }

    @Override // com.google.android.gms.internal.ads.TF0
    public final /* bridge */ /* synthetic */ void d(VF0 vf0) {
        this.f71933h.a(9, (YE0) vf0).zza();
    }

    public final void f0(List list, int i10, long j10, WF0 wf0) {
        this.f71933h.a(17, new Rz0(list, wf0, i10, j10, null)).zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9578uA0
    public final void zzh() {
        this.f71933h.zzf(2);
        this.f71933h.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.VG0
    public final void zzj() {
        this.f71933h.zzi(10);
    }

    private final void K(AbstractC7307Wl abstractC7307Wl, C7453aF0 c7453aF0, AbstractC7307Wl abstractC7307Wl2, C7453aF0 c7453aF02, long j10, boolean z10) throws zzib {
        Object obj;
        C7488ag c7488ag;
        if (!Q(abstractC7307Wl, c7453aF0)) {
            if (c7453aF0.b()) {
                c7488ag = C7488ag.f72460d;
            } else {
                c7488ag = this.f71949x.f79701o;
            }
            if (!this.f71939n.zzc().equals(c7488ag)) {
                B(c7488ag);
                n(this.f71949x.f79701o, c7488ag.f72461a, false, false);
                return;
            }
            return;
        }
        abstractC7307Wl.e(abstractC7307Wl.n(c7453aF0.f72382a, this.f71937l).f71150c, this.f71936k, 0L);
        Py0 py0 = this.f71925S;
        J4 j42 = this.f71936k.f79854i;
        int i10 = OV.f69091a;
        py0.d(j42);
        if (j10 != -9223372036854775807L) {
            this.f71925S.e(h0(abstractC7307Wl, c7453aF0.f72382a, j10));
            return;
        }
        Object obj2 = this.f71936k.f79846a;
        if (!abstractC7307Wl2.o()) {
            obj = abstractC7307Wl2.e(abstractC7307Wl2.n(c7453aF02.f72382a, this.f71937l).f71150c, this.f71936k, 0L).f79846a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj2) && !z10) {
            return;
        }
        this.f71925S.e(-9223372036854775807L);
    }

    private final boolean Q(AbstractC7307Wl abstractC7307Wl, C7453aF0 c7453aF0) {
        if (!c7453aF0.b() && !abstractC7307Wl.o()) {
            abstractC7307Wl.e(abstractC7307Wl.n(c7453aF0.f72382a, this.f71937l).f71150c, this.f71936k, 0L);
            if (this.f71936k.b()) {
                C9954xl c9954xl = this.f71936k;
                if (c9954xl.f79853h && c9954xl.f79850e != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final void S(BA0 ba0) throws zzib {
        ba0.i();
        try {
            ba0.c().v(ba0.a(), ba0.g());
        } finally {
            ba0.h(true);
        }
    }

    static final /* synthetic */ void g0(BA0 ba0) {
        try {
            S(ba0);
        } catch (zzib e10) {
            C9917xL.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private final long l0(C7453aF0 c7453aF0, long j10, boolean z10, boolean z11) throws zzib {
        G();
        L(false, true);
        if (z11 || this.f71949x.f79691e == 3) {
            D(2);
        }
        C8083gA0 c8083gA0P = this.f71942q.p();
        C8083gA0 c8083gA0G = c8083gA0P;
        while (c8083gA0G != null && !c7453aF0.equals(c8083gA0G.f74268g.f74617a)) {
            c8083gA0G = c8083gA0G.g();
        }
        if (z10 || c8083gA0P != c8083gA0G || (c8083gA0G != null && c8083gA0G.e() + j10 < 0)) {
            g();
            if (c8083gA0G != null) {
                while (this.f71942q.p() != c8083gA0G) {
                    this.f71942q.l();
                }
                this.f71942q.F(c8083gA0G);
                c8083gA0G.q(1000000000000L);
                h();
            }
        }
        if (c8083gA0G != null) {
            this.f71942q.F(c8083gA0G);
            if (!c8083gA0G.f74266e) {
                c8083gA0G.f74268g = c8083gA0G.f74268g.b(j10);
            } else if (c8083gA0G.f74267f) {
                j10 = c8083gA0G.f74262a.f(j10);
                c8083gA0G.f74262a.k(j10 - this.f71938m, false);
            }
            x(j10);
            o();
        } else {
            this.f71942q.w();
            x(j10);
        }
        k(false);
        this.f71933h.zzi(2);
        return j10;
    }

    private final Pair m0(AbstractC7307Wl abstractC7307Wl) {
        long j10 = 0;
        if (abstractC7307Wl.o()) {
            return Pair.create(C9899xA0.h(), 0L);
        }
        Pair pairL = abstractC7307Wl.l(this.f71936k, this.f71937l, abstractC7307Wl.g(this.f71913G), -9223372036854775807L);
        C7453aF0 c7453aF0V = this.f71942q.v(abstractC7307Wl, pairL.first, 0L);
        long jLongValue = ((Long) pairL.second).longValue();
        if (c7453aF0V.b()) {
            abstractC7307Wl.n(c7453aF0V.f72382a, this.f71937l);
            if (c7453aF0V.f72384c == this.f71937l.e(c7453aF0V.f72383b)) {
                this.f71937l.h();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(c7453aF0V, Long.valueOf(j10));
    }

    private final void u() throws zzib {
        t();
        A(true);
    }

    private final void y(AbstractC7307Wl abstractC7307Wl, AbstractC7307Wl abstractC7307Wl2) {
        if (abstractC7307Wl.o() && abstractC7307Wl2.o()) {
            return;
        }
        int size = this.f71940o.size() - 1;
        if (size < 0) {
            Collections.sort(this.f71940o);
        } else {
            Object obj = ((Tz0) this.f71940o.get(size)).f70501a;
            int i10 = OV.f69091a;
            throw null;
        }
    }
}
