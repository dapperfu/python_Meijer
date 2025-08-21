package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class NG0 extends SG0 implements HA0 {

    /* renamed from: j, reason: collision with root package name */
    private static final AbstractC7193Ph0 f69692j = AbstractC7193Ph0.b(new Comparator() { // from class: com.google.android.gms.internal.ads.mG0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i10 = NG0.f69693k;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f69693k = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Object f69694c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f69695d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f69696e;

    /* renamed from: f, reason: collision with root package name */
    private BG0 f69697f;

    /* renamed from: g, reason: collision with root package name */
    private FG0 f69698g;

    /* renamed from: h, reason: collision with root package name */
    private HR f69699h;

    /* renamed from: i, reason: collision with root package name */
    private final C8434iG0 f69700i;

    private static void t(C7900dG0 c7900dG0, C7098Mo c7098Mo, Map map) {
        for (int i10 = 0; i10 < c7900dG0.f74225a; i10++) {
            if (((C7367Um) c7098Mo.f69553B.get(c7900dG0.b(i10))) != null) {
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.WG0
    public final HA0 b() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.WG0
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.SG0
    protected final Pair k(RG0 rg0, int[][][] iArr, final int[] iArr2, C7578aF0 c7578aF0, AbstractC7432Wl abstractC7432Wl) throws zzib {
        final BG0 bg0;
        int i10;
        final boolean z10;
        final String str;
        int[] iArr3;
        int length;
        FG0 fg0;
        synchronized (this.f69694c) {
            try {
                bg0 = this.f69697f;
                if (bg0.f66344N && OV.f69931a >= 32 && (fg0 = this.f69698g) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    C8211gC.b(looperMyLooper);
                    fg0.b(this, looperMyLooper);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i11 = 2;
        OG0[] og0Arr = new OG0[2];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                z10 = false;
                break;
            }
            if (rg0.c(i13) == 2 && rg0.d(i13).f74225a > 0) {
                z10 = true;
                break;
            }
            i13++;
        }
        Pair pairV = v(1, rg0, iArr, new HG0() { // from class: com.google.android.gms.internal.ads.rG0
            @Override // com.google.android.gms.internal.ads.HG0
            public final List a(int i14, C9867vm c9867vm, int[] iArr4) {
                final NG0 ng0 = this.f78825a;
                InterfaceC6816Ef0 interfaceC6816Ef0 = new InterfaceC6816Ef0() { // from class: com.google.android.gms.internal.ads.uG0
                    @Override // com.google.android.gms.internal.ads.InterfaceC6816Ef0
                    public final boolean zza(Object obj) {
                        return NG0.s(ng0, (C) obj);
                    }
                };
                int i15 = iArr2[i14];
                C7723bh0 c7723bh0 = new C7723bh0();
                for (int i16 = 0; i16 < c9867vm.f79961a; i16++) {
                    c7723bh0.g(new C10036xG0(i14, c9867vm, i16, bg0, iArr4[i16], z10, interfaceC6816Ef0, i15));
                }
                return c7723bh0.j();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.sG0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C10036xG0) Collections.max((List) obj)).e((C10036xG0) Collections.max((List) obj2));
            }
        });
        if (pairV != null) {
            og0Arr[((Integer) pairV.second).intValue()] = (OG0) pairV.first;
        }
        if (pairV == null) {
            str = null;
        } else {
            Object obj = pairV.first;
            str = ((OG0) obj).f69897a.b(((OG0) obj).f69898b[0]).f66493d;
        }
        Pair pairV2 = v(2, rg0, iArr, new HG0() { // from class: com.google.android.gms.internal.ads.pG0
            /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
            @Override // com.google.android.gms.internal.ads.HG0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List a(int r18, com.google.android.gms.internal.ads.C9867vm r19, int[] r20) {
                /*
                    Method dump skipped, instructions count: 205
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9181pG0.a(int, com.google.android.gms.internal.ads.vm, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.qG0
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                List list = (List) obj2;
                List list2 = (List) obj3;
                return AbstractC7327Tg0.i().c((LG0) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.JG0
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return LG0.l((LG0) obj4, (LG0) obj5);
                    }
                }), (LG0) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.JG0
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return LG0.l((LG0) obj4, (LG0) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.JG0
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return LG0.l((LG0) obj4, (LG0) obj5);
                    }
                }).b(list.size(), list2.size()).c((LG0) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.KG0
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return LG0.e((LG0) obj4, (LG0) obj5);
                    }
                }), (LG0) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.KG0
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return LG0.e((LG0) obj4, (LG0) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.KG0
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return LG0.e((LG0) obj4, (LG0) obj5);
                    }
                }).a();
            }
        });
        int i14 = 4;
        Pair pairV3 = pairV2 == null ? v(4, rg0, iArr, new HG0() { // from class: com.google.android.gms.internal.ads.nG0
            @Override // com.google.android.gms.internal.ads.HG0
            public final List a(int i15, C9867vm c9867vm, int[] iArr4) {
                int i16 = NG0.f69693k;
                C7723bh0 c7723bh0 = new C7723bh0();
                for (int i17 = 0; i17 < c9867vm.f79961a; i17++) {
                    c7723bh0.g(new C10143yG0(i15, c9867vm, i17, bg0, iArr4[i17]));
                }
                return c7723bh0.j();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.oG0
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((C10143yG0) ((List) obj2).get(0)).compareTo((C10143yG0) ((List) obj3).get(0));
            }
        }) : null;
        if (pairV3 != null) {
            og0Arr[((Integer) pairV3.second).intValue()] = (OG0) pairV3.first;
        } else if (pairV2 != null) {
            og0Arr[((Integer) pairV2.second).intValue()] = (OG0) pairV2.first;
        }
        int i15 = 3;
        Pair pairV4 = v(3, rg0, iArr, new HG0() { // from class: com.google.android.gms.internal.ads.vG0
            @Override // com.google.android.gms.internal.ads.HG0
            public final List a(int i16, C9867vm c9867vm, int[] iArr4) {
                int i17 = NG0.f69693k;
                C7723bh0 c7723bh0 = new C7723bh0();
                for (int i18 = 0; i18 < c9867vm.f79961a; i18++) {
                    c7723bh0.g(new GG0(i16, c9867vm, i18, bg0, iArr4[i18], str));
                }
                return c7723bh0.j();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.wG0
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((GG0) ((List) obj2).get(0)).e((GG0) ((List) obj3).get(0));
            }
        });
        if (pairV4 != null) {
            og0Arr[((Integer) pairV4.second).intValue()] = (OG0) pairV4.first;
        }
        int i16 = 0;
        while (i16 < i11) {
            int iC = rg0.c(i16);
            if (iC != i11 && iC != i10 && iC != i15 && iC != i14) {
                C7900dG0 c7900dG0D = rg0.d(i16);
                int[][] iArr4 = iArr[i16];
                int i17 = i12;
                int i18 = i17;
                C9867vm c9867vm = null;
                C10250zG0 c10250zG0 = null;
                while (i17 < c7900dG0D.f74225a) {
                    C9867vm c9867vmB = c7900dG0D.b(i17);
                    int[] iArr5 = iArr4[i17];
                    C10250zG0 c10250zG02 = c10250zG0;
                    for (int i19 = i12; i19 < c9867vmB.f79961a; i19++) {
                        if (GA0.a(iArr5[i19], bg0.f66345O)) {
                            C10250zG0 c10250zG03 = new C10250zG0(c9867vmB.b(i19), iArr5[i19]);
                            if (c10250zG02 == null || c10250zG03.compareTo(c10250zG02) > 0) {
                                c10250zG02 = c10250zG03;
                                c9867vm = c9867vmB;
                                i18 = i19;
                            }
                        }
                    }
                    i17++;
                    c10250zG0 = c10250zG02;
                    i12 = 0;
                }
                og0Arr[i16] = c9867vm == null ? null : new OG0(c9867vm, new int[]{i18}, 0);
            }
            i16++;
            i11 = 2;
            i12 = 0;
            i10 = 1;
            i14 = 4;
            i15 = 3;
        }
        HashMap map = new HashMap();
        int i20 = 2;
        for (int i21 = 0; i21 < 2; i21++) {
            t(rg0.d(i21), bg0, map);
        }
        t(rg0.e(), bg0, map);
        for (int i22 = 0; i22 < 2; i22++) {
            if (((C7367Um) map.get(Integer.valueOf(rg0.c(i22)))) != null) {
                throw null;
            }
        }
        int i23 = 0;
        while (i23 < i20) {
            C7900dG0 c7900dG0D2 = rg0.d(i23);
            if (bg0.g(i23, c7900dG0D2)) {
                if (bg0.e(i23, c7900dG0D2) != null) {
                    throw null;
                }
                og0Arr[i23] = null;
            }
            i23++;
            i20 = 2;
        }
        int i24 = 0;
        while (i24 < i20) {
            int iC2 = rg0.c(i24);
            if (bg0.f(i24) || bg0.f69554C.contains(Integer.valueOf(iC2))) {
                og0Arr[i24] = null;
            }
            i24++;
            i20 = 2;
        }
        C8434iG0 c8434iG0 = this.f69700i;
        InterfaceC8008eH0 interfaceC8008eH0H = h();
        AbstractC8042eh0 abstractC8042eh0A = C8539jG0.a(og0Arr);
        int i25 = 2;
        PG0[] pg0Arr = new PG0[2];
        int i26 = 0;
        while (i26 < i25) {
            OG0 og0 = og0Arr[i26];
            if (og0 != null && (length = (iArr3 = og0.f69898b).length) != 0) {
                pg0Arr[i26] = length == 1 ? new QG0(og0.f69897a, iArr3[0], 0, 0, null) : c8434iG0.a(og0.f69897a, iArr3, 0, interfaceC8008eH0H, (AbstractC8042eh0) abstractC8042eh0A.get(i26));
            }
            i26++;
            i25 = 2;
        }
        JA0[] ja0Arr = new JA0[i25];
        for (int i27 = 0; i27 < i25; i27++) {
            ja0Arr[i27] = (bg0.f(i27) || bg0.f69554C.contains(Integer.valueOf(rg0.c(i27))) || (rg0.c(i27) != -2 && pg0Arr[i27] == null)) ? null : JA0.f68666b;
        }
        return Pair.create(ja0Arr, pg0Arr);
    }

    public NG0(Context context) {
        C8434iG0 c8434iG0 = new C8434iG0();
        BG0 bg0D = BG0.d(context);
        this.f69694c = new Object();
        this.f69695d = context != null ? context.getApplicationContext() : null;
        this.f69700i = c8434iG0;
        this.f69697f = bg0D;
        this.f69699h = HR.f68273b;
        boolean z10 = false;
        if (context != null && OV.m(context)) {
            z10 = true;
        }
        this.f69696e = z10;
        if (!z10 && context != null && OV.f69931a >= 32) {
            this.f69698g = FG0.a(context);
        }
        if (this.f69697f.f66344N && context == null) {
            C10042xL.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    static /* bridge */ /* synthetic */ int l(int i10, int i11) {
        return (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : a.e.API_PRIORITY_OTHER;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static /* synthetic */ boolean s(NG0 ng0, C c10) {
        boolean z10;
        FG0 fg0;
        FG0 fg02;
        synchronized (ng0.f69694c) {
            try {
                z10 = true;
                if (ng0.f69697f.f66344N && !ng0.f69696e) {
                    int i10 = c10.f66481D;
                    char c11 = 65535;
                    if (i10 != -1 && i10 > 2) {
                        String str = c10.f66504o;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2123537834:
                                    if (str.equals("audio/eac3-joc")) {
                                        c11 = 2;
                                        break;
                                    }
                                    break;
                                case 187078296:
                                    if (str.equals("audio/ac3")) {
                                        c11 = 0;
                                        break;
                                    }
                                    break;
                                case 187078297:
                                    if (str.equals("audio/ac4")) {
                                        c11 = 3;
                                        break;
                                    }
                                    break;
                                case 1504578661:
                                    if (str.equals("audio/eac3")) {
                                        c11 = 1;
                                        break;
                                    }
                                    break;
                            }
                            if ((c11 != 0 && c11 != 1 && c11 != 2 && c11 != 3) || (OV.f69931a >= 32 && (fg0 = ng0.f69698g) != null && fg0.g())) {
                            }
                        }
                        if (OV.f69931a < 32 || (fg02 = ng0.f69698g) == null || !fg02.g() || !fg02.e() || !ng0.f69698g.f() || !ng0.f69698g.d(ng0.f69699h, c10)) {
                            z10 = false;
                        }
                    }
                }
            } finally {
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        boolean z10;
        FG0 fg0;
        synchronized (this.f69694c) {
            try {
                z10 = false;
                if (this.f69697f.f66344N && !this.f69696e && OV.f69931a >= 32 && (fg0 = this.f69698g) != null && fg0.g()) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            j();
        }
    }

    private static final Pair v(int i10, RG0 rg0, int[][][] iArr, HG0 hg0, Comparator comparator) {
        RandomAccess randomAccessU;
        RG0 rg02 = rg0;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < 2) {
            if (i10 == rg02.c(i11)) {
                C7900dG0 c7900dG0D = rg02.d(i11);
                for (int i12 = 0; i12 < c7900dG0D.f74225a; i12++) {
                    C9867vm c9867vmB = c7900dG0D.b(i12);
                    List listA = hg0.a(i11, c9867vmB, iArr[i11][i12]);
                    boolean[] zArr = new boolean[c9867vmB.f79961a];
                    int i13 = 0;
                    while (i13 < c9867vmB.f79961a) {
                        int i14 = i13 + 1;
                        IG0 ig0 = (IG0) listA.get(i13);
                        int iA = ig0.a();
                        if (!zArr[i13] && iA != 0) {
                            if (iA == 1) {
                                randomAccessU = AbstractC8042eh0.u(ig0);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(ig0);
                                for (int i15 = i14; i15 < c9867vmB.f79961a; i15++) {
                                    IG0 ig02 = (IG0) listA.get(i15);
                                    if (ig02.a() == 2 && ig0.b(ig02)) {
                                        arrayList2.add(ig02);
                                        zArr[i15] = true;
                                    }
                                }
                                randomAccessU = arrayList2;
                            }
                            arrayList.add(randomAccessU);
                        }
                        i13 = i14;
                    }
                }
            }
            i11++;
            rg02 = rg0;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((IG0) list.get(i16)).f68425c;
        }
        IG0 ig03 = (IG0) list.get(0);
        return Pair.create(new OG0(ig03.f68424b, iArr2, 0), Integer.valueOf(ig03.f68423a));
    }

    @Override // com.google.android.gms.internal.ads.HA0
    public final void a(FA0 fa0) {
        synchronized (this.f69694c) {
            boolean z10 = this.f69697f.f66348R;
        }
    }

    @Override // com.google.android.gms.internal.ads.WG0
    public final void c() {
        FG0 fg0;
        synchronized (this.f69694c) {
            try {
                if (OV.f69931a >= 32 && (fg0 = this.f69698g) != null) {
                    fg0.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.c();
    }

    @Override // com.google.android.gms.internal.ads.WG0
    public final void d(HR hr2) {
        boolean zEquals;
        synchronized (this.f69694c) {
            zEquals = this.f69699h.equals(hr2);
            this.f69699h = hr2;
        }
        if (zEquals) {
            return;
        }
        u();
    }

    public final BG0 n() {
        BG0 bg0;
        synchronized (this.f69694c) {
            bg0 = this.f69697f;
        }
        return bg0;
    }

    public final void r(AG0 ag0) {
        boolean zEquals;
        BG0 bg0 = new BG0(ag0);
        synchronized (this.f69694c) {
            zEquals = this.f69697f.equals(bg0);
            this.f69697f = bg0;
        }
        if (zEquals) {
            return;
        }
        if (bg0.f66344N && this.f69695d == null) {
            C10042xL.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        j();
    }

    protected static int m(C c10, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(c10.f66493d)) {
            return 4;
        }
        String strP = p(str);
        String strP2 = p(c10.f66493d);
        if (strP2 != null && strP != null) {
            if (!strP2.startsWith(strP) && !strP.startsWith(strP2)) {
                int i10 = OV.f69931a;
                if (!strP2.split("-", 2)[0].equals(strP.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z10 || strP2 != null) {
            return 0;
        }
        return 1;
    }

    protected static String p(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }
}
