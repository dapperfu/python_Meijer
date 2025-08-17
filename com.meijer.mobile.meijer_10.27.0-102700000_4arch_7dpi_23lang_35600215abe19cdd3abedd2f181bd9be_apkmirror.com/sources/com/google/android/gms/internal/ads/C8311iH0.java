package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.iH0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8311iH0 implements InterfaceC7883eH0, Pu0 {

    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC7917eh0 f74924l = AbstractC7917eh0.y(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: m, reason: collision with root package name */
    public static final AbstractC7917eh0 f74925m = AbstractC7917eh0.y(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: n, reason: collision with root package name */
    public static final AbstractC7917eh0 f74926n = AbstractC7917eh0.y(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: o, reason: collision with root package name */
    public static final AbstractC7917eh0 f74927o = AbstractC7917eh0.y(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC7917eh0 f74928p = AbstractC7917eh0.y(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: q, reason: collision with root package name */
    public static final AbstractC7917eh0 f74929q = AbstractC7917eh0.y(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: r, reason: collision with root package name */
    private static C8311iH0 f74930r;

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8238hh0 f74931a;

    /* renamed from: b, reason: collision with root package name */
    private final C7670cH0 f74932b = new C7670cH0();

    /* renamed from: c, reason: collision with root package name */
    private final C10020yH0 f74933c = new C10020yH0(2000);

    /* renamed from: d, reason: collision with root package name */
    private int f74934d;

    /* renamed from: e, reason: collision with root package name */
    private long f74935e;

    /* renamed from: f, reason: collision with root package name */
    private long f74936f;

    /* renamed from: g, reason: collision with root package name */
    private long f74937g;

    /* renamed from: h, reason: collision with root package name */
    private long f74938h;

    /* renamed from: i, reason: collision with root package name */
    private long f74939i;

    /* renamed from: j, reason: collision with root package name */
    private long f74940j;

    /* renamed from: k, reason: collision with root package name */
    private int f74941k;

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void h(int i10) throws Throwable {
        Throwable th2;
        int i11;
        try {
            try {
                if (this.f74941k != i10) {
                    this.f74941k = i10;
                    if (i10 != 1 && i10 != 0 && i10 != 8) {
                        this.f74939i = f(i10);
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (this.f74934d > 0) {
                            try {
                                i11 = (int) (jElapsedRealtime - this.f74935e);
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        } else {
                            i11 = 0;
                        }
                        g(i11, this.f74936f, this.f74939i);
                        this.f74935e = jElapsedRealtime;
                        this.f74936f = 0L;
                        this.f74938h = 0L;
                        this.f74937g = 0L;
                        this.f74933c.c();
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0145, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x015d, code lost:
    
        if (r3.equals("WS") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0167, code lost:
    
        if (r3.equals("WF") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0171, code lost:
    
        if (r3.equals("VU") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01a5, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01af, code lost:
    
        if (r3.equals("VC") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b9, code lost:
    
        if (r3.equals("VA") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01fb, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0221, code lost:
    
        if (r3.equals("TV") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0239, code lost:
    
        if (r3.equals("TR") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x025f, code lost:
    
        if (r3.equals("TM") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0269, code lost:
    
        if (r3.equals("TL") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0273, code lost:
    
        if (r3.equals("TJ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x027d, code lost:
    
        if (r3.equals("TH") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0295, code lost:
    
        if (r3.equals("TD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02ad, code lost:
    
        if (r3.equals("SZ") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02b7, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02c1, code lost:
    
        if (r3.equals("SX") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02e7, code lost:
    
        if (r3.equals("SS") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x031b, code lost:
    
        if (r3.equals("SM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0325, code lost:
    
        if (r3.equals("SL") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x033d, code lost:
    
        if (r3.equals("SJ") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0347, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0351, code lost:
    
        if (r3.equals("SH") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0369, code lost:
    
        if (r3.equals("SE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0373, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x037d, code lost:
    
        if (r3.equals("SC") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r3.equals("CI") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0387, code lost:
    
        if (r3.equals("SB") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x038e, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x03f7, code lost:
    
        if (r3.equals("PY") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x040f, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0435, code lost:
    
        if (r3.equals("PM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0469, code lost:
    
        if (r3.equals("PG") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x048f, code lost:
    
        if (r3.equals("PA") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x04b5, code lost:
    
        if (r3.equals("NU") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x04bf, code lost:
    
        if (r3.equals("NR") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x04f3, code lost:
    
        if (r3.equals("NI") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x050b, code lost:
    
        if (r3.equals("NF") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0515, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x051f, code lost:
    
        if (r3.equals("NC") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0526, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x053b, code lost:
    
        if (r3.equals("MZ") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0542, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x058f, code lost:
    
        if (r3.equals("MT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0599, code lost:
    
        if (r3.equals("MS") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x05a3, code lost:
    
        if (r3.equals("MR") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x05bb, code lost:
    
        if (r3.equals("MP") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x05c2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05e5, code lost:
    
        if (r3.equals("MM") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x05ef, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0607, code lost:
    
        if (r3.equals("MH") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x060e, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0615, code lost:
    
        if (r3.equals("MG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0649, code lost:
    
        if (r3.equals("MC") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0661, code lost:
    
        if (r3.equals("LY") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x066b, code lost:
    
        if (r3.equals("LV") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0691, code lost:
    
        if (r3.equals("LS") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0698, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x069f, code lost:
    
        if (r3.equals("LR") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x06a9, code lost:
    
        if (r3.equals("LK") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x06b0, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x06b7, code lost:
    
        if (r3.equals("LI") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x06f9, code lost:
    
        if (r3.equals("KY") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0703, code lost:
    
        if (r3.equals("KW") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        if (r3.equals("BQ") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x071b, code lost:
    
        if (r3.equals("KN") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0725, code lost:
    
        if (r3.equals("KM") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x072c, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0733, code lost:
    
        if (r3.equals("KI") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0775, code lost:
    
        if (r3.equals("JO") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x078d, code lost:
    
        if (r3.equals("JE") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x07a5, code lost:
    
        if (r3.equals("IS") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x07e7, code lost:
    
        if (r3.equals("IM") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x081b, code lost:
    
        if (r3.equals("HU") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0825, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x082f, code lost:
    
        if (r3.equals("HR") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0836, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0891, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x08b7, code lost:
    
        if (r3.equals("GM") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x08be, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x08c5, code lost:
    
        if (r3.equals("GL") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08cc, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x08d3, code lost:
    
        if (r3.equals("GI") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x08da, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cd, code lost:
    
        if (r3.equals("BL") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x096d, code lost:
    
        if (r3.equals("FK") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0974, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x09b3, code lost:
    
        if (r3.equals("ER") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x09ba, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x09c1, code lost:
    
        if (r3.equals("EG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x09c8, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x09cf, code lost:
    
        if (r3.equals("EE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x09d6, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x09eb, code lost:
    
        if (r3.equals("DZ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x09f2, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x09f9, code lost:
    
        if (r3.equals("DO") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x0a00, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e5, code lost:
    
        if (r3.equals("AT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x0a07, code lost:
    
        if (r3.equals("DM") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x0a1f, code lost:
    
        if (r3.equals("DJ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0a53, code lost:
    
        if (r3.equals("CX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0a5d, code lost:
    
        if (r3.equals("CW") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0a75, code lost:
    
        if (r3.equals("CU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0a7c, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x0a83, code lost:
    
        if (r3.equals("CR") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0a8a, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0aad, code lost:
    
        if (r3.equals("CM") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0ab4, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0abb, code lost:
    
        if (r3.equals("CL") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0ac2, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x0ac9, code lost:
    
        if (r3.equals("CK") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0ad3, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x0ada, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0ae1, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0ae8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0b0b, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0b12, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0b27, code lost:
    
        if (r3.equals("BG") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0b2e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0b35, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0b3c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0b5f, code lost:
    
        if (r3.equals("AZ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0b66, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0b7b, code lost:
    
        if (r3.equals("AI") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010b, code lost:
    
        if (r3.equals("AQ") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x0b84, code lost:
    
        if (r3.equals("AG") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x0b8b, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0b92, code lost:
    
        if (r3.equals("AF") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0b99, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x0bae, code lost:
    
        if (r3.equals("AD") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0bb7, code lost:
    
        if (r3.equals("BZ") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x0bbe, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x0bd3, code lost:
    
        if (r3.equals("BB") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:886:0x0bda, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0be1, code lost:
    
        if (r3.equals("BA") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0115, code lost:
    
        if (r3.equals("ZW") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x0be8, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x0bef, code lost:
    
        if (r3.equals("AX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x0bf6, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:900:0x0c0b, code lost:
    
        if (r3.equals("AM") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x0c12, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x013b, code lost:
    
        if (r3.equals("YT") != false) goto L390;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int[] j(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 6672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8311iH0.j(java.lang.String):int[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[Catch: all -> 0x006f, TRY_ENTER, TryCatch #2 {all -> 0x006f, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0010, B:13:0x002b, B:23:0x005d, B:22:0x0052), top: B:36:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.Pu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(com.google.android.gms.internal.ads.InterfaceC9305rh0 r11, com.google.android.gms.internal.ads.C8030fk0 r12, boolean r13) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = i(r12, r13)     // Catch: java.lang.Throwable -> L6f
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.f74934d     // Catch: java.lang.Throwable -> L6f
            if (r11 <= 0) goto Lf
            r11 = 1
            goto L10
        Lf:
            r11 = 0
        L10:
            com.google.android.gms.internal.ads.C8086gC.f(r11)     // Catch: java.lang.Throwable -> L6f
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6f
            long r0 = r10.f74935e     // Catch: java.lang.Throwable -> L6f
            long r0 = r11 - r0
            long r2 = r10.f74937g     // Catch: java.lang.Throwable -> L6f
            int r5 = (int) r0     // Catch: java.lang.Throwable -> L6f
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L6f
            long r2 = r2 + r0
            r10.f74937g = r2     // Catch: java.lang.Throwable -> L6f
            long r0 = r10.f74938h     // Catch: java.lang.Throwable -> L6f
            long r2 = r10.f74936f     // Catch: java.lang.Throwable -> L6f
            long r0 = r0 + r2
            r10.f74938h = r0     // Catch: java.lang.Throwable -> L6f
            if (r5 <= 0) goto L72
            float r13 = (float) r2     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.yH0 r0 = r10.f74933c     // Catch: java.lang.Throwable -> L6f
            double r1 = (double) r2     // Catch: java.lang.Throwable -> L6f
            double r1 = java.lang.Math.sqrt(r1)     // Catch: java.lang.Throwable -> L6f
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L6f
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r13 = r13 * r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> L6f
            float r13 = r13 / r2
            r0.b(r1, r13)     // Catch: java.lang.Throwable -> L6f
            long r0 = r10.f74937g     // Catch: java.lang.Throwable -> L6f
            r2 = 2000(0x7d0, double:9.88E-321)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 >= 0) goto L52
            long r0 = r10.f74938h     // Catch: java.lang.Throwable -> L4e
            r2 = 524288(0x80000, double:2.590327E-318)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 < 0) goto L5d
            goto L52
        L4e:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7b
        L52:
            com.google.android.gms.internal.ads.yH0 r13 = r10.f74933c     // Catch: java.lang.Throwable -> L6f
            r0 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13.a(r0)     // Catch: java.lang.Throwable -> L6f
            long r0 = (long) r13     // Catch: java.lang.Throwable -> L6f
            r10.f74939i = r0     // Catch: java.lang.Throwable -> L6f
        L5d:
            long r6 = r10.f74936f     // Catch: java.lang.Throwable -> L6f
            long r8 = r10.f74939i     // Catch: java.lang.Throwable -> L6f
            r4 = r10
            r4.g(r5, r6, r8)     // Catch: java.lang.Throwable -> L6c
            r4.f74935e = r11     // Catch: java.lang.Throwable -> L6c
            r11 = 0
            r4.f74936f = r11     // Catch: java.lang.Throwable -> L6c
            goto L73
        L6c:
            r0 = move-exception
        L6d:
            r11 = r0
            goto L7b
        L6f:
            r0 = move-exception
            r4 = r10
            goto L6d
        L72:
            r4 = r10
        L73:
            int r11 = r4.f74934d     // Catch: java.lang.Throwable -> L6c
            int r11 = r11 + (-1)
            r4.f74934d = r11     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r10)
            return
        L7b:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6c
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8311iH0.c(com.google.android.gms.internal.ads.rh0, com.google.android.gms.internal.ads.fk0, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final synchronized void l(InterfaceC9305rh0 interfaceC9305rh0, C8030fk0 c8030fk0, boolean z10, int i10) {
        if (i(c8030fk0, z10)) {
            this.f74936f += i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void p(InterfaceC9305rh0 interfaceC9305rh0, C8030fk0 c8030fk0, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final synchronized void q(InterfaceC9305rh0 interfaceC9305rh0, C8030fk0 c8030fk0, boolean z10) {
        try {
            if (i(c8030fk0, z10)) {
                if (this.f74934d == 0) {
                    this.f74935e = SystemClock.elapsedRealtime();
                }
                this.f74934d++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7883eH0
    public final Pu0 zze() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x0003, B:10:0x0011, B:12:0x0015, B:14:0x001f, B:16:0x0029, B:20:0x003e, B:19:0x0032, B:9:0x000c, B:21:0x00e4), top: B:26:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.google.android.gms.internal.ads.C8311iH0 d(android.content.Context r10) {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.iH0> r1 = com.google.android.gms.internal.ads.C8311iH0.class
            monitor-enter(r1)
            com.google.android.gms.internal.ads.iH0 r0 = com.google.android.gms.internal.ads.C8311iH0.f74930r     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto Le4
            if (r10 != 0) goto Lc
            r0 = 0
        La:
            r3 = r0
            goto L11
        Lc:
            android.content.Context r0 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L2e
            goto La
        L11:
            int r0 = com.google.android.gms.internal.ads.OV.f69091a     // Catch: java.lang.Throwable -> L2e
            if (r10 == 0) goto L32
            java.lang.String r0 = "phone"
            java.lang.Object r10 = r10.getSystemService(r0)     // Catch: java.lang.Throwable -> L2e
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.Throwable -> L2e
            if (r10 == 0) goto L32
            java.lang.String r10 = r10.getNetworkCountryIso()     // Catch: java.lang.Throwable -> L2e
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L32
            java.lang.String r10 = com.google.android.gms.internal.ads.C8446jf0.b(r10)     // Catch: java.lang.Throwable -> L2e
            goto L3e
        L2e:
            r0 = move-exception
            r10 = r0
            goto Le8
        L32:
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = r10.getCountry()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = com.google.android.gms.internal.ads.C8446jf0.b(r10)     // Catch: java.lang.Throwable -> L2e
        L3e:
            int[] r10 = j(r10)     // Catch: java.lang.Throwable -> L2e
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2e
            r0 = 8
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2e
            r5 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L2e
            r4.put(r2, r5)     // Catch: java.lang.Throwable -> L2e
            r2 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.eh0 r6 = com.google.android.gms.internal.ads.C8311iH0.f74924l     // Catch: java.lang.Throwable -> L2e
            r7 = r10[r0]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r6.get(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> L2e
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> L2e
            r5 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.eh0 r8 = com.google.android.gms.internal.ads.C8311iH0.f74925m     // Catch: java.lang.Throwable -> L2e
            r9 = 1
            r9 = r10[r9]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = r8.get(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L2e
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L2e
            r7 = 4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.eh0 r9 = com.google.android.gms.internal.ads.C8311iH0.f74926n     // Catch: java.lang.Throwable -> L2e
            r2 = r10[r2]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r9.get(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L2e
            r4.put(r8, r2)     // Catch: java.lang.Throwable -> L2e
            r2 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.eh0 r9 = com.google.android.gms.internal.ads.C8311iH0.f74927o     // Catch: java.lang.Throwable -> L2e
            r5 = r10[r5]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r9.get(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L2e
            r4.put(r8, r5)     // Catch: java.lang.Throwable -> L2e
            r5 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.eh0 r8 = com.google.android.gms.internal.ads.C8311iH0.f74928p     // Catch: java.lang.Throwable -> L2e
            r7 = r10[r7]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r8.get(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> L2e
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> L2e
            r5 = 9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.eh0 r7 = com.google.android.gms.internal.ads.C8311iH0.f74929q     // Catch: java.lang.Throwable -> L2e
            r2 = r10[r2]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r7.get(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L2e
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L2e
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            r10 = r10[r0]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r6.get(r10)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Throwable -> L2e
            r4.put(r2, r10)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.HC r6 = com.google.android.gms.internal.ads.HC.f67408a     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.iH0 r2 = new com.google.android.gms.internal.ads.iH0     // Catch: java.lang.Throwable -> L2e
            r7 = 1
            r8 = 0
            r5 = 2000(0x7d0, float:2.803E-42)
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.C8311iH0.f74930r = r2     // Catch: java.lang.Throwable -> L2e
        Le4:
            com.google.android.gms.internal.ads.iH0 r10 = com.google.android.gms.internal.ads.C8311iH0.f74930r     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r1)
            return r10
        Le8:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8311iH0.d(android.content.Context):com.google.android.gms.internal.ads.iH0");
    }

    private final long f(int i10) {
        Long l10 = (Long) this.f74931a.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = (Long) this.f74931a.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    private final void g(int i10, long j10, long j11) {
        int i11;
        long j12;
        if (i10 == 0) {
            if (j10 != 0) {
                j12 = j10;
            } else if (j11 == this.f74940j) {
                return;
            } else {
                j12 = 0;
            }
            i11 = 0;
        } else {
            i11 = i10;
            j12 = j10;
        }
        this.f74940j = j11;
        this.f74932b.b(i11, j12, j11);
    }

    private static boolean i(C8030fk0 c8030fk0, boolean z10) {
        return z10 && !c8030fk0.b(8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7883eH0
    public final void b(InterfaceC7777dH0 interfaceC7777dH0) {
        this.f74932b.c(interfaceC7777dH0);
    }

    /* synthetic */ C8311iH0(Context context, Map map, int i10, HC hc2, boolean z10, C8204hH0 c8204hH0) {
        this.f74931a = AbstractC8238hh0.c(map);
        if (context != null) {
            EP epB = EP.b(context);
            int iA = epB.a();
            this.f74941k = iA;
            this.f74939i = f(iA);
            epB.d(new C8097gH0(this));
            return;
        }
        this.f74941k = 0;
        this.f74939i = f(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7883eH0
    public final void a(Handler handler, InterfaceC7777dH0 interfaceC7777dH0) {
        interfaceC7777dH0.getClass();
        this.f74932b.a(handler, interfaceC7777dH0);
    }
}
