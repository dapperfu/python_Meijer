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
final class Yz0 implements Handler.Callback, XE0, VG0, InterfaceC9703uA0, Ty0, InterfaceC10238zA0 {

    /* renamed from: T, reason: collision with root package name */
    private static final long f72746T = OV.N(10000);

    /* renamed from: B, reason: collision with root package name */
    private boolean f72748B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f72749C;

    /* renamed from: E, reason: collision with root package name */
    private boolean f72751E;

    /* renamed from: H, reason: collision with root package name */
    private boolean f72754H;

    /* renamed from: I, reason: collision with root package name */
    private int f72755I;

    /* renamed from: J, reason: collision with root package name */
    private Wz0 f72756J;

    /* renamed from: K, reason: collision with root package name */
    private long f72757K;

    /* renamed from: L, reason: collision with root package name */
    private long f72758L;

    /* renamed from: M, reason: collision with root package name */
    private int f72759M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f72760N;

    /* renamed from: O, reason: collision with root package name */
    private zzib f72761O;

    /* renamed from: Q, reason: collision with root package name */
    private C8185fz0 f72763Q;

    /* renamed from: R, reason: collision with root package name */
    private final C9466rz0 f72764R;

    /* renamed from: S, reason: collision with root package name */
    private final Py0 f72765S;

    /* renamed from: a, reason: collision with root package name */
    private final KA0[] f72766a;

    /* renamed from: b, reason: collision with root package name */
    private final IA0[] f72767b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f72768c;

    /* renamed from: d, reason: collision with root package name */
    private final WG0 f72769d;

    /* renamed from: e, reason: collision with root package name */
    private final XG0 f72770e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC7675bA0 f72771f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC8008eH0 f72772g;

    /* renamed from: h, reason: collision with root package name */
    private final QH f72773h;

    /* renamed from: i, reason: collision with root package name */
    private final C10131yA0 f72774i;

    /* renamed from: j, reason: collision with root package name */
    private final Looper f72775j;

    /* renamed from: k, reason: collision with root package name */
    private final C10079xl f72776k;

    /* renamed from: l, reason: collision with root package name */
    private final C7431Wk f72777l;

    /* renamed from: m, reason: collision with root package name */
    private final long f72778m;

    /* renamed from: n, reason: collision with root package name */
    private final Vy0 f72779n;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList f72780o;

    /* renamed from: p, reason: collision with root package name */
    private final HC f72781p;

    /* renamed from: q, reason: collision with root package name */
    private final C8527jA0 f72782q;

    /* renamed from: r, reason: collision with root package name */
    private final C9917wA0 f72783r;

    /* renamed from: s, reason: collision with root package name */
    private final long f72784s;

    /* renamed from: t, reason: collision with root package name */
    private final C8105fC0 f72785t;

    /* renamed from: u, reason: collision with root package name */
    private final PA0 f72786u;

    /* renamed from: v, reason: collision with root package name */
    private final QH f72787v;

    /* renamed from: w, reason: collision with root package name */
    private LA0 f72788w;

    /* renamed from: x, reason: collision with root package name */
    private C10024xA0 f72789x;

    /* renamed from: y, reason: collision with root package name */
    private Uz0 f72790y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f72791z;

    /* renamed from: F, reason: collision with root package name */
    private int f72752F = 0;

    /* renamed from: G, reason: collision with root package name */
    private boolean f72753G = false;

    /* renamed from: A, reason: collision with root package name */
    private boolean f72747A = false;

    /* renamed from: P, reason: collision with root package name */
    private long f72762P = -9223372036854775807L;

    /* renamed from: D, reason: collision with root package name */
    private long f72750D = -9223372036854775807L;

    public Yz0(FA0[] fa0Arr, WG0 wg0, XG0 xg0, InterfaceC7675bA0 interfaceC7675bA0, InterfaceC8008eH0 interfaceC8008eH0, int i10, boolean z10, PA0 pa0, LA0 la0, Py0 py0, long j10, boolean z11, boolean z12, Looper looper, HC hc2, C9466rz0 c9466rz0, C8105fC0 c8105fC0, C10131yA0 c10131yA0, C8185fz0 c8185fz0) {
        this.f72764R = c9466rz0;
        this.f72769d = wg0;
        this.f72770e = xg0;
        this.f72771f = interfaceC7675bA0;
        this.f72772g = interfaceC8008eH0;
        this.f72788w = la0;
        this.f72765S = py0;
        this.f72784s = j10;
        this.f72781p = hc2;
        this.f72785t = c8105fC0;
        this.f72763Q = c8185fz0;
        this.f72786u = pa0;
        this.f72778m = interfaceC7675bA0.d(c8105fC0);
        interfaceC7675bA0.a(c8105fC0);
        AbstractC7432Wl abstractC7432Wl = AbstractC7432Wl.f71995a;
        C10024xA0 c10024xA0G = C10024xA0.g(xg0);
        this.f72789x = c10024xA0G;
        this.f72790y = new Uz0(c10024xA0G);
        int length = fa0Arr.length;
        this.f72767b = new IA0[2];
        this.f72768c = new boolean[2];
        HA0 ha0B = wg0.b();
        this.f72766a = new KA0[2];
        for (int i11 = 0; i11 < 2; i11++) {
            fa0Arr[i11].i(i11, c8105fC0, hc2);
            this.f72767b[i11] = fa0Arr[i11].zzm();
            this.f72767b[i11].q(ha0B);
            this.f72766a[i11] = new KA0(fa0Arr[i11], i11);
        }
        this.f72779n = new Vy0(this, hc2);
        this.f72780o = new ArrayList();
        this.f72776k = new C10079xl();
        this.f72777l = new C7431Wk();
        wg0.i(this, interfaceC8008eH0);
        this.f72760N = true;
        QH qhA = hc2.a(looper, null);
        this.f72787v = qhA;
        this.f72782q = new C8527jA0(pa0, qhA, new Nz0(this), c8185fz0);
        this.f72783r = new C9917wA0(this, pa0, qhA, c8105fC0);
        C10131yA0 c10131yA02 = new C10131yA0(null);
        this.f72774i = c10131yA02;
        Looper looperA = c10131yA02.a();
        this.f72775j = looperA;
        this.f72773h = hc2.a(looperA, this);
    }

    private final void F(boolean z10, boolean z11) {
        v(z10 || !this.f72754H, false, true, false);
        this.f72790y.a(z11 ? 1 : 0);
        this.f72771f.e(this.f72785t);
        D(1);
    }

    private final synchronized void M(InterfaceC7425Wf0 interfaceC7425Wf0, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) interfaceC7425Wf0.zza()).booleanValue() && j10 > 0) {
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

    private static final boolean T(C8208gA0 c8208gA0) {
        if (c8208gA0 != null) {
            try {
                if (c8208gA0.f75106e) {
                    SF0[] sf0Arr = c8208gA0.f75104c;
                    for (int i10 = 0; i10 < 2; i10++) {
                        SF0 sf0 = sf0Arr[i10];
                        if (sf0 != null) {
                            sf0.zzd();
                        }
                    }
                } else {
                    c8208gA0.f75102a.zzk();
                }
                if (c8208gA0.d() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    static int U(C10079xl c10079xl, C7431Wk c7431Wk, int i10, boolean z10, Object obj, AbstractC7432Wl abstractC7432Wl, AbstractC7432Wl abstractC7432Wl2) {
        C10079xl c10079xl2 = c10079xl;
        AbstractC7432Wl abstractC7432Wl3 = abstractC7432Wl;
        Object obj2 = abstractC7432Wl3.e(abstractC7432Wl3.n(obj, c7431Wk).f71990c, c10079xl, 0L).f80686a;
        for (int i11 = 0; i11 < abstractC7432Wl2.c(); i11++) {
            if (abstractC7432Wl2.e(i11, c10079xl, 0L).f80686a.equals(obj2)) {
                return i11;
            }
        }
        int iA = abstractC7432Wl3.a(obj);
        int iB = abstractC7432Wl3.b();
        int iA2 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= iB || iA2 != -1) {
                break;
            }
            AbstractC7432Wl abstractC7432Wl4 = abstractC7432Wl3;
            int i13 = abstractC7432Wl4.i(iA, c7431Wk, c10079xl2, i10, z10);
            if (i13 == -1) {
                iA2 = -1;
                break;
            }
            iA2 = abstractC7432Wl2.a(abstractC7432Wl4.f(i13));
            i12++;
            abstractC7432Wl3 = abstractC7432Wl4;
            iA = i13;
            c10079xl2 = c10079xl;
        }
        if (iA2 == -1) {
            return -1;
        }
        return abstractC7432Wl2.d(iA2, c7431Wk, false).f71990c;
    }

    private final void g() {
        for (int i10 = 0; i10 < 2; i10++) {
            f(i10);
        }
    }

    public final Looper V() {
        return this.f72775j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10238zA0
    public final synchronized void c(BA0 ba0) {
        if (!this.f72791z && this.f72775j.getThread().isAlive()) {
            this.f72773h.a(14, ba0).zza();
            return;
        }
        C10042xL.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        ba0.h(false);
    }

    public final synchronized boolean d0() {
        if (!this.f72791z && this.f72775j.getThread().isAlive()) {
            this.f72773h.zzi(7);
            M(new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.Lz0
                @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
                public final Object zza() {
                    return this.f69318a.X();
                }
            }, this.f72784s);
            return this.f72791z;
        }
        return true;
    }

    public final synchronized boolean e0(Object obj, long j10) {
        if (!this.f72791z && this.f72775j.getThread().isAlive()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f72773h.a(30, new Pair(obj, atomicBoolean)).zza();
            if (j10 != -9223372036854775807L) {
                M(new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.Oz0
                    @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
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
        C7578aF0 c7578aF0 = this.f72782q.p().f75108g.f75457a;
        long jL0 = l0(c7578aF0, this.f72789x.f80545s, true, false);
        if (jL0 != this.f72789x.f80545s) {
            C10024xA0 c10024xA0 = this.f72789x;
            this.f72789x = e(c7578aF0, jL0, c10024xA0.f80529c, c10024xA0.f80530d, z10, 5);
        }
    }

    private final void B(C7613ag c7613ag) {
        this.f72773h.zzf(16);
        this.f72779n.r(c7613ag);
    }

    private final void C(boolean z10, int i10, boolean z11, int i11) throws zzib {
        this.f72790y.a(z11 ? 1 : 0);
        this.f72789x = this.f72789x.c(z10, i11, i10);
        L(false, false);
        for (C8208gA0 c8208gA0P = this.f72782q.p(); c8208gA0P != null; c8208gA0P = c8208gA0P.g()) {
            for (PG0 pg0 : c8208gA0P.i().f72149c) {
            }
        }
        if (!P()) {
            G();
            J();
            return;
        }
        int i12 = this.f72789x.f80531e;
        if (i12 == 3) {
            this.f72779n.e();
            E();
            this.f72773h.zzi(2);
        } else if (i12 == 2) {
            this.f72773h.zzi(2);
        }
    }

    private final void D(int i10) {
        C10024xA0 c10024xA0 = this.f72789x;
        if (c10024xA0.f80531e != i10) {
            if (i10 != 2) {
                this.f72762P = -9223372036854775807L;
            }
            this.f72789x = c10024xA0.e(i10);
        }
    }

    private final void E() throws zzib {
        C8208gA0 c8208gA0P = this.f72782q.p();
        if (c8208gA0P == null) {
            return;
        }
        XG0 xg0I = c8208gA0P.i();
        for (int i10 = 0; i10 < 2; i10++) {
            if (xg0I.b(i10)) {
                this.f72766a[i10].s();
            }
        }
    }

    private final void G() throws zzib {
        this.f72779n.f();
        int i10 = 0;
        while (true) {
            KA0[] ka0Arr = this.f72766a;
            if (i10 >= 2) {
                return;
            }
            ka0Arr[i10].t();
            i10++;
        }
    }

    private final void H() {
        C8208gA0 c8208gA0O = this.f72782q.o();
        boolean z10 = this.f72751E || (c8208gA0O != null && c8208gA0O.f75102a.zzp());
        C10024xA0 c10024xA0 = this.f72789x;
        if (z10 != c10024xA0.f80533g) {
            this.f72789x = new C10024xA0(c10024xA0.f80527a, c10024xA0.f80528b, c10024xA0.f80529c, c10024xA0.f80530d, c10024xA0.f80531e, c10024xA0.f80532f, z10, c10024xA0.f80534h, c10024xA0.f80535i, c10024xA0.f80536j, c10024xA0.f80537k, c10024xA0.f80538l, c10024xA0.f80539m, c10024xA0.f80540n, c10024xA0.f80541o, c10024xA0.f80543q, c10024xA0.f80544r, c10024xA0.f80545s, c10024xA0.f80546t, false);
        }
    }

    private final void I(C7578aF0 c7578aF0, C7900dG0 c7900dG0, XG0 xg0) {
        long jE;
        long jE2;
        C8208gA0 c8208gA0O = this.f72782q.o();
        c8208gA0O.getClass();
        if (c8208gA0O == this.f72782q.p()) {
            jE = this.f72757K;
            jE2 = c8208gA0O.e();
        } else {
            jE = this.f72757K - c8208gA0O.e();
            jE2 = c8208gA0O.f75108g.f75458b;
        }
        this.f72771f.i(new C7568aA0(this.f72785t, this.f72789x.f80527a, c7578aF0, jE - jE2, j0(c8208gA0O.c()), this.f72779n.zzc().f73301a, this.f72789x.f80538l, this.f72749C, Q(this.f72789x.f80527a, c8208gA0O.f75108g.f75457a) ? this.f72765S.b() : -9223372036854775807L), c7900dG0, xg0.f72149c);
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
        this.f72749C = z10;
        long jElapsedRealtime = -9223372036854775807L;
        if (z10 && !z11) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f72750D = jElapsedRealtime;
    }

    private final boolean N() {
        C8208gA0 c8208gA0P = this.f72782q.p();
        long j10 = c8208gA0P.f75108g.f75461e;
        if (c8208gA0P.f75106e) {
            return j10 == -9223372036854775807L || this.f72789x.f80545s < j10 || !P();
        }
        return false;
    }

    private static boolean O(C10024xA0 c10024xA0, C7431Wk c7431Wk) {
        C7578aF0 c7578aF0 = c10024xA0.f80528b;
        AbstractC7432Wl abstractC7432Wl = c10024xA0.f80527a;
        return abstractC7432Wl.o() || abstractC7432Wl.n(c7578aF0.f73222a, c7431Wk).f71993f;
    }

    private final boolean P() {
        C10024xA0 c10024xA0 = this.f72789x;
        return c10024xA0.f80538l && c10024xA0.f80540n == 0;
    }

    public static /* synthetic */ C8208gA0 W(Yz0 yz0, C8315hA0 c8315hA0, long j10) {
        C8115fH0 c8115fH0Zzk = yz0.f72771f.zzk();
        long j11 = yz0.f72763Q.f75049a;
        XG0 xg0 = yz0.f72770e;
        C9917wA0 c9917wA0 = yz0.f72783r;
        return new C8208gA0(yz0.f72767b, j10, yz0.f72769d, c8115fH0Zzk, c9917wA0, c8315hA0, xg0, -9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.C10024xA0 e(com.google.android.gms.internal.ads.C7578aF0 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Yz0.e(com.google.android.gms.internal.ads.aF0, long, long, long, boolean, int):com.google.android.gms.internal.ads.xA0");
    }

    private final void f(int i10) {
        int iB = this.f72766a[i10].b();
        this.f72766a[i10].e(this.f72779n);
        s(i10, false);
        this.f72755I -= iB;
    }

    private final void h() throws zzib {
        i(new boolean[2], this.f72782q.s().f());
    }

    private final long h0(AbstractC7432Wl abstractC7432Wl, Object obj, long j10) {
        abstractC7432Wl.e(abstractC7432Wl.n(obj, this.f72777l).f71990c, this.f72776k, 0L);
        C10079xl c10079xl = this.f72776k;
        if (c10079xl.f80690e != -9223372036854775807L && c10079xl.b()) {
            C10079xl c10079xl2 = this.f72776k;
            if (c10079xl2.f80693h) {
                long j11 = c10079xl2.f80691f;
                return OV.K((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - this.f72776k.f80690e) - j10;
            }
        }
        return -9223372036854775807L;
    }

    private final void i(boolean[] zArr, long j10) throws zzib {
        C8208gA0 c8208gA0S = this.f72782q.s();
        XG0 xg0I = c8208gA0S.i();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!xg0I.b(i10)) {
                this.f72766a[i10].m();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (xg0I.b(i11)) {
                boolean z10 = zArr[i11];
                C8527jA0 c8527jA0 = this.f72782q;
                KA0[] ka0Arr = this.f72766a;
                C8208gA0 c8208gA0S2 = c8527jA0.s();
                KA0 ka0 = ka0Arr[i11];
                if (ka0.b() <= 0) {
                    boolean z11 = c8208gA0S2 == this.f72782q.p();
                    XG0 xg0I2 = c8208gA0S2.i();
                    JA0 ja0 = xg0I2.f72148b[i11];
                    C[] cArrR = R(xg0I2.f72149c[i11]);
                    boolean z12 = P() && this.f72789x.f80531e == 3;
                    boolean z13 = !z10 && z12;
                    this.f72755I++;
                    ka0.f(ja0, cArrR, c8208gA0S2.f75104c[i11], this.f72757K, z13, z11, j10, c8208gA0S2.e(), c8208gA0S2.f75108g.f75457a, this.f72779n);
                    ka0.h(11, new Qz0(this));
                    if (z12 && z11) {
                        ka0.s();
                    }
                }
            }
        }
        c8208gA0S.f75109h = true;
    }

    private final long i0() {
        return j0(this.f72789x.f80543q);
    }

    private final void j(IOException iOException, int i10) {
        C8527jA0 c8527jA0 = this.f72782q;
        zzib zzibVarC = zzib.c(iOException, i10);
        C8208gA0 c8208gA0P = c8527jA0.p();
        if (c8208gA0P != null) {
            zzibVarC = zzibVarC.a(c8208gA0P.f75108g.f75457a);
        }
        C10042xL.d("ExoPlayerImplInternal", "Playback error", zzibVarC);
        F(false, false);
        this.f72789x = this.f72789x.d(zzibVarC);
    }

    private final long j0(long j10) {
        C8208gA0 c8208gA0O = this.f72782q.o();
        if (c8208gA0O == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.f72757K - c8208gA0O.e()));
    }

    private final void k(boolean z10) {
        C8208gA0 c8208gA0O = this.f72782q.o();
        C7578aF0 c7578aF0 = c8208gA0O == null ? this.f72789x.f80528b : c8208gA0O.f75108g.f75457a;
        boolean zEquals = this.f72789x.f80537k.equals(c7578aF0);
        if (!zEquals) {
            this.f72789x = this.f72789x.a(c7578aF0);
        }
        C10024xA0 c10024xA0 = this.f72789x;
        c10024xA0.f80543q = c8208gA0O == null ? c10024xA0.f80545s : c8208gA0O.c();
        this.f72789x.f80544r = i0();
        if ((!zEquals || z10) && c8208gA0O != null && c8208gA0O.f75106e) {
            I(c8208gA0O.f75108g.f75457a, c8208gA0O.h(), c8208gA0O.i());
        }
    }

    private final long k0(C7578aF0 c7578aF0, long j10, boolean z10) throws zzib {
        C8527jA0 c8527jA0 = this.f72782q;
        return l0(c7578aF0, j10, c8527jA0.p() != c8527jA0.s(), z10);
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
    private final void l(com.google.android.gms.internal.ads.AbstractC7432Wl r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Yz0.l(com.google.android.gms.internal.ads.Wl, boolean):void");
    }

    private final void m(C7613ag c7613ag, boolean z10) throws zzib {
        n(c7613ag, c7613ag.f73301a, true, z10);
    }

    private final void n(C7613ag c7613ag, float f10, boolean z10, boolean z11) throws zzib {
        C7613ag c7613ag2;
        int i10;
        if (z10) {
            if (z11) {
                this.f72790y.a(1);
            }
            C10024xA0 c10024xA0 = this.f72789x;
            C10024xA0 c10024xA02 = new C10024xA0(c10024xA0.f80527a, c10024xA0.f80528b, c10024xA0.f80529c, c10024xA0.f80530d, c10024xA0.f80531e, c10024xA0.f80532f, c10024xA0.f80533g, c10024xA0.f80534h, c10024xA0.f80535i, c10024xA0.f80536j, c10024xA0.f80537k, c10024xA0.f80538l, c10024xA0.f80539m, c10024xA0.f80540n, c7613ag, c10024xA0.f80543q, c10024xA0.f80544r, c10024xA0.f80545s, c10024xA0.f80546t, false);
            c7613ag2 = c7613ag;
            this.f72789x = c10024xA02;
        } else {
            c7613ag2 = c7613ag;
        }
        float f11 = c7613ag2.f73301a;
        C8208gA0 c8208gA0P = this.f72782q.p();
        while (true) {
            i10 = 0;
            if (c8208gA0P == null) {
                break;
            }
            PG0[] pg0Arr = c8208gA0P.i().f72149c;
            int length = pg0Arr.length;
            while (i10 < length) {
                PG0 pg0 = pg0Arr[i10];
                i10++;
            }
            c8208gA0P = c8208gA0P.g();
        }
        KA0[] ka0Arr = this.f72766a;
        while (i10 < 2) {
            ka0Arr[i10].p(f10, c7613ag2.f73301a);
            i10++;
        }
    }

    private static Pair n0(AbstractC7432Wl abstractC7432Wl, Wz0 wz0, boolean z10, int i10, boolean z11, C10079xl c10079xl, C7431Wk c7431Wk) {
        Pair pairL;
        AbstractC7432Wl abstractC7432Wl2;
        AbstractC7432Wl abstractC7432Wl3 = wz0.f72060a;
        if (abstractC7432Wl.o()) {
            return null;
        }
        if (true == abstractC7432Wl3.o()) {
            abstractC7432Wl3 = abstractC7432Wl;
        }
        try {
            pairL = abstractC7432Wl3.l(c10079xl, c7431Wk, wz0.f72061b, wz0.f72062c);
            abstractC7432Wl2 = abstractC7432Wl3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC7432Wl.equals(abstractC7432Wl2)) {
            return pairL;
        }
        if (abstractC7432Wl.a(pairL.first) != -1) {
            return (abstractC7432Wl2.n(pairL.first, c7431Wk).f71993f && abstractC7432Wl2.e(c7431Wk.f71990c, c10079xl, 0L).f80698m == abstractC7432Wl2.a(pairL.first)) ? abstractC7432Wl.l(c10079xl, c7431Wk, abstractC7432Wl.n(pairL.first, c7431Wk).f71990c, wz0.f72062c) : pairL;
        }
        int iU = U(c10079xl, c7431Wk, i10, z11, pairL.first, abstractC7432Wl2, abstractC7432Wl);
        if (iU != -1) {
            return abstractC7432Wl.l(c10079xl, c7431Wk, iU, -9223372036854775807L);
        }
        return null;
    }

    private final void o() {
        long jE;
        long jE2;
        boolean zB = false;
        if (T(this.f72782q.o())) {
            C8208gA0 c8208gA0O = this.f72782q.o();
            long jJ0 = j0(c8208gA0O.d());
            if (c8208gA0O == this.f72782q.p()) {
                jE = this.f72757K;
                jE2 = c8208gA0O.e();
            } else {
                jE = this.f72757K - c8208gA0O.e();
                jE2 = c8208gA0O.f75108g.f75458b;
            }
            C7568aA0 c7568aA0 = new C7568aA0(this.f72785t, this.f72789x.f80527a, c8208gA0O.f75108g.f75457a, jE - jE2, jJ0, this.f72779n.zzc().f73301a, this.f72789x.f80538l, this.f72749C, Q(this.f72789x.f80527a, c8208gA0O.f75108g.f75457a) ? this.f72765S.b() : -9223372036854775807L);
            boolean zB2 = this.f72771f.b(c7568aA0);
            C8208gA0 c8208gA0P = this.f72782q.p();
            if (zB2 || !c8208gA0P.f75106e || jJ0 >= 500000 || this.f72778m <= 0) {
                zB = zB2;
            } else {
                c8208gA0P.f75102a.k(this.f72789x.f80545s, false);
                zB = this.f72771f.b(c7568aA0);
            }
        }
        this.f72751E = zB;
        if (zB) {
            C8208gA0 c8208gA0O2 = this.f72782q.o();
            c8208gA0O2.getClass();
            C7781cA0 c7781cA0 = new C7781cA0();
            c7781cA0.e(this.f72757K - c8208gA0O2.e());
            c7781cA0.f(this.f72779n.zzc().f73301a);
            c7781cA0.d(this.f72750D);
            c8208gA0O2.k(new C7994eA0(c7781cA0, null));
        }
        H();
    }

    private final void p() {
        this.f72782q.y();
        C8208gA0 c8208gA0R = this.f72782q.r();
        if (c8208gA0R != null) {
            if ((!c8208gA0R.f75105d || c8208gA0R.f75106e) && !c8208gA0R.f75102a.zzp()) {
                if (this.f72771f.h(this.f72789x.f80527a, c8208gA0R.f75108g.f75457a, c8208gA0R.f75106e ? c8208gA0R.f75102a.zzb() : 0L)) {
                    if (!c8208gA0R.f75105d) {
                        c8208gA0R.m(this, c8208gA0R.f75108g.f75458b);
                        return;
                    }
                    C7781cA0 c7781cA0 = new C7781cA0();
                    c7781cA0.e(this.f72757K - c8208gA0R.e());
                    c7781cA0.f(this.f72779n.zzc().f73301a);
                    c7781cA0.d(this.f72750D);
                    c8208gA0R.k(new C7994eA0(c7781cA0, null));
                }
            }
        }
    }

    private final void q() {
        this.f72790y.b(this.f72789x);
        if (this.f72790y.f71583a) {
            C9466rz0 c9466rz0 = this.f72764R;
            c9466rz0.f78939a.r(this.f72790y);
            this.f72790y = new Uz0(this.f72789x);
        }
    }

    private final void r(int i10) throws zzib, IOException {
        KA0 ka0 = this.f72766a[i10];
        try {
            ka0.i();
        } catch (IOException | RuntimeException e10) {
            ka0.c();
            throw e10;
        }
    }

    private final void s(final int i10, final boolean z10) {
        boolean[] zArr = this.f72768c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f72787v.b(new Runnable() { // from class: com.google.android.gms.internal.ads.Mz0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69621a.Y(i10, z10);
                }
            });
        }
    }

    private final void t() throws zzib {
        int i10;
        int i11;
        float f10 = this.f72779n.zzc().f73301a;
        C8527jA0 c8527jA0 = this.f72782q;
        C8208gA0 c8208gA0P = c8527jA0.p();
        C8208gA0 c8208gA0S = c8527jA0.s();
        XG0 xg0 = null;
        boolean z10 = true;
        while (c8208gA0P != null && c8208gA0P.f75106e) {
            C10024xA0 c10024xA0 = this.f72789x;
            XG0 xg0J = c8208gA0P.j(f10, c10024xA0.f80527a, c10024xA0.f80538l);
            XG0 xg02 = c8208gA0P == this.f72782q.p() ? xg0J : xg0;
            XG0 xg0I = c8208gA0P.i();
            boolean z11 = false;
            if (xg0I != null) {
                if (xg0I.f72149c.length == xg0J.f72149c.length) {
                    for (int i12 = 0; i12 < xg0J.f72149c.length; i12++) {
                        if (xg0J.a(xg0I, i12)) {
                        }
                    }
                    if (c8208gA0P != c8208gA0S) {
                        z11 = true;
                    }
                    z10 &= z11;
                    c8208gA0P = c8208gA0P.g();
                    xg0 = xg02;
                }
            }
            if (z10) {
                C8527jA0 c8527jA02 = this.f72782q;
                C8208gA0 c8208gA0P2 = c8527jA02.p();
                boolean zF = c8527jA02.F(c8208gA0P2);
                boolean[] zArr = new boolean[2];
                xg02.getClass();
                long jB = c8208gA0P2.b(xg02, this.f72789x.f80545s, zF, zArr);
                C10024xA0 c10024xA02 = this.f72789x;
                boolean z12 = (c10024xA02.f80531e == 4 || jB == c10024xA02.f80545s) ? false : true;
                C10024xA0 c10024xA03 = this.f72789x;
                i11 = 2;
                i10 = 4;
                this.f72789x = e(c10024xA03.f80528b, jB, c10024xA03.f80529c, c10024xA03.f80530d, z12, 5);
                if (z12) {
                    x(jB);
                }
                boolean[] zArr2 = new boolean[2];
                int i13 = 0;
                while (true) {
                    KA0[] ka0Arr = this.f72766a;
                    if (i13 >= 2) {
                        break;
                    }
                    int iB = ka0Arr[i13].b();
                    zArr2[i13] = 1 == iB;
                    if (iB != 0) {
                        if (!this.f72766a[i13].z(c8208gA0P2)) {
                            f(i13);
                        } else if (zArr[i13]) {
                            this.f72766a[i13].n(this.f72757K);
                        }
                    }
                    i13++;
                }
                i(zArr2, this.f72757K);
            } else {
                i10 = 4;
                i11 = 2;
                this.f72782q.F(c8208gA0P);
                if (c8208gA0P.f75106e) {
                    c8208gA0P.a(xg0J, Math.max(c8208gA0P.f75108g.f75458b, this.f72757K - c8208gA0P.e()), false);
                }
            }
            k(true);
            if (this.f72789x.f80531e != i10) {
                o();
                J();
                this.f72773h.zzi(i11);
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
        C8208gA0 c8208gA0P = this.f72782q.p();
        boolean z10 = false;
        if (c8208gA0P != null && c8208gA0P.f75108g.f75464h && this.f72747A) {
            z10 = true;
        }
        this.f72748B = z10;
    }

    private final void x(long j10) throws zzib {
        C8208gA0 c8208gA0P = this.f72782q.p();
        long jE = j10 + (c8208gA0P == null ? 1000000000000L : c8208gA0P.e());
        this.f72757K = jE;
        this.f72779n.d(jE);
        KA0[] ka0Arr = this.f72766a;
        for (int i10 = 0; i10 < 2; i10++) {
            ka0Arr[i10].n(this.f72757K);
        }
        for (C8208gA0 c8208gA0P2 = this.f72782q.p(); c8208gA0P2 != null; c8208gA0P2 = c8208gA0P2.g()) {
            for (PG0 pg0 : c8208gA0P2.i().f72149c) {
            }
        }
    }

    private final void z(long j10) {
        this.f72773h.zzj(2, j10 + ((this.f72789x.f80531e != 3 || P()) ? f72746T : 1000L));
    }

    final /* synthetic */ Boolean X() {
        return Boolean.valueOf(this.f72791z);
    }

    final /* synthetic */ void Y(int i10, boolean z10) {
        this.f72786u.h(i10, this.f72766a[i10].c(), z10);
    }

    public final void Z() {
        this.f72773h.zzb(29).zza();
    }

    @Override // com.google.android.gms.internal.ads.XE0
    public final void a(YE0 ye0) {
        this.f72773h.a(8, ye0).zza();
    }

    public final void a0(AbstractC7432Wl abstractC7432Wl, int i10, long j10) {
        this.f72773h.a(3, new Wz0(abstractC7432Wl, i10, j10)).zza();
    }

    @Override // com.google.android.gms.internal.ads.Ty0
    public final void b(C7613ag c7613ag) {
        this.f72773h.a(16, c7613ag).zza();
    }

    public final void b0(boolean z10, int i10, int i11) {
        this.f72773h.c(1, z10 ? 1 : 0, i10 | (i11 << 4)).zza();
    }

    public final void c0() {
        this.f72773h.zzb(6).zza();
    }

    @Override // com.google.android.gms.internal.ads.TF0
    public final /* bridge */ /* synthetic */ void d(VF0 vf0) {
        this.f72773h.a(9, (YE0) vf0).zza();
    }

    public final void f0(List list, int i10, long j10, WF0 wf0) {
        this.f72773h.a(17, new Rz0(list, wf0, i10, j10, null)).zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9703uA0
    public final void zzh() {
        this.f72773h.zzf(2);
        this.f72773h.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.VG0
    public final void zzj() {
        this.f72773h.zzi(10);
    }

    private final void K(AbstractC7432Wl abstractC7432Wl, C7578aF0 c7578aF0, AbstractC7432Wl abstractC7432Wl2, C7578aF0 c7578aF02, long j10, boolean z10) throws zzib {
        Object obj;
        C7613ag c7613ag;
        if (!Q(abstractC7432Wl, c7578aF0)) {
            if (c7578aF0.b()) {
                c7613ag = C7613ag.f73300d;
            } else {
                c7613ag = this.f72789x.f80541o;
            }
            if (!this.f72779n.zzc().equals(c7613ag)) {
                B(c7613ag);
                n(this.f72789x.f80541o, c7613ag.f73301a, false, false);
                return;
            }
            return;
        }
        abstractC7432Wl.e(abstractC7432Wl.n(c7578aF0.f73222a, this.f72777l).f71990c, this.f72776k, 0L);
        Py0 py0 = this.f72765S;
        J4 j42 = this.f72776k.f80694i;
        int i10 = OV.f69931a;
        py0.d(j42);
        if (j10 != -9223372036854775807L) {
            this.f72765S.e(h0(abstractC7432Wl, c7578aF0.f73222a, j10));
            return;
        }
        Object obj2 = this.f72776k.f80686a;
        if (!abstractC7432Wl2.o()) {
            obj = abstractC7432Wl2.e(abstractC7432Wl2.n(c7578aF02.f73222a, this.f72777l).f71990c, this.f72776k, 0L).f80686a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj2) && !z10) {
            return;
        }
        this.f72765S.e(-9223372036854775807L);
    }

    private final boolean Q(AbstractC7432Wl abstractC7432Wl, C7578aF0 c7578aF0) {
        if (!c7578aF0.b() && !abstractC7432Wl.o()) {
            abstractC7432Wl.e(abstractC7432Wl.n(c7578aF0.f73222a, this.f72777l).f71990c, this.f72776k, 0L);
            if (this.f72776k.b()) {
                C10079xl c10079xl = this.f72776k;
                if (c10079xl.f80693h && c10079xl.f80690e != -9223372036854775807L) {
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
            C10042xL.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private final long l0(C7578aF0 c7578aF0, long j10, boolean z10, boolean z11) throws zzib {
        G();
        L(false, true);
        if (z11 || this.f72789x.f80531e == 3) {
            D(2);
        }
        C8208gA0 c8208gA0P = this.f72782q.p();
        C8208gA0 c8208gA0G = c8208gA0P;
        while (c8208gA0G != null && !c7578aF0.equals(c8208gA0G.f75108g.f75457a)) {
            c8208gA0G = c8208gA0G.g();
        }
        if (z10 || c8208gA0P != c8208gA0G || (c8208gA0G != null && c8208gA0G.e() + j10 < 0)) {
            g();
            if (c8208gA0G != null) {
                while (this.f72782q.p() != c8208gA0G) {
                    this.f72782q.l();
                }
                this.f72782q.F(c8208gA0G);
                c8208gA0G.q(1000000000000L);
                h();
            }
        }
        if (c8208gA0G != null) {
            this.f72782q.F(c8208gA0G);
            if (!c8208gA0G.f75106e) {
                c8208gA0G.f75108g = c8208gA0G.f75108g.b(j10);
            } else if (c8208gA0G.f75107f) {
                j10 = c8208gA0G.f75102a.f(j10);
                c8208gA0G.f75102a.k(j10 - this.f72778m, false);
            }
            x(j10);
            o();
        } else {
            this.f72782q.w();
            x(j10);
        }
        k(false);
        this.f72773h.zzi(2);
        return j10;
    }

    private final Pair m0(AbstractC7432Wl abstractC7432Wl) {
        long j10 = 0;
        if (abstractC7432Wl.o()) {
            return Pair.create(C10024xA0.h(), 0L);
        }
        Pair pairL = abstractC7432Wl.l(this.f72776k, this.f72777l, abstractC7432Wl.g(this.f72753G), -9223372036854775807L);
        C7578aF0 c7578aF0V = this.f72782q.v(abstractC7432Wl, pairL.first, 0L);
        long jLongValue = ((Long) pairL.second).longValue();
        if (c7578aF0V.b()) {
            abstractC7432Wl.n(c7578aF0V.f73222a, this.f72777l);
            if (c7578aF0V.f73224c == this.f72777l.e(c7578aF0V.f73223b)) {
                this.f72777l.h();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(c7578aF0V, Long.valueOf(j10));
    }

    private final void u() throws zzib {
        t();
        A(true);
    }

    private final void y(AbstractC7432Wl abstractC7432Wl, AbstractC7432Wl abstractC7432Wl2) {
        if (abstractC7432Wl.o() && abstractC7432Wl2.o()) {
            return;
        }
        int size = this.f72780o.size() - 1;
        if (size < 0) {
            Collections.sort(this.f72780o);
        } else {
            Object obj = ((Tz0) this.f72780o.get(size)).f71341a;
            int i10 = OV.f69931a;
            throw null;
        }
    }
}
