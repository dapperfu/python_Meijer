package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.gms.internal.ads.oF0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9072oF0 implements YE0, XE0 {

    /* renamed from: a, reason: collision with root package name */
    private final YE0[] f78186a;

    /* renamed from: e, reason: collision with root package name */
    private XE0 f78190e;

    /* renamed from: f, reason: collision with root package name */
    private C7900dG0 f78191f;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f78188c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f78189d = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private VF0 f78193h = new JE0(AbstractC8042eh0.t(), AbstractC8042eh0.t());

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap f78187b = new IdentityHashMap();

    /* renamed from: g, reason: collision with root package name */
    private YE0[] f78192g = new YE0[0];

    @Override // com.google.android.gms.internal.ads.YE0
    public final void zzk() throws IOException {
        int i10 = 0;
        while (true) {
            YE0[] ye0Arr = this.f78186a;
            if (i10 >= ye0Arr.length) {
                return;
            }
            ye0Arr[i10].zzk();
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.XE0
    public final void a(YE0 ye0) {
        this.f78188c.remove(ye0);
        if (!this.f78188c.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (YE0 ye02 : this.f78186a) {
            i10 += ye02.zzh().f74225a;
        }
        C9867vm[] c9867vmArr = new C9867vm[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            YE0[] ye0Arr = this.f78186a;
            if (i11 >= ye0Arr.length) {
                this.f78191f = new C7900dG0(c9867vmArr);
                XE0 xe0 = this.f78190e;
                xe0.getClass();
                xe0.a(this);
                return;
            }
            C7900dG0 c7900dG0Zzh = ye0Arr[i11].zzh();
            int i13 = c7900dG0Zzh.f74225a;
            int i14 = 0;
            while (i14 < i13) {
                C9867vm c9867vmB = c7900dG0Zzh.b(i14);
                C[] cArr = new C[c9867vmB.f79961a];
                for (int i15 = 0; i15 < c9867vmB.f79961a; i15++) {
                    C cB = c9867vmB.b(i15);
                    C9717uH0 c9717uH0B = cB.b();
                    String str = cB.f66490a;
                    if (str == null) {
                        str = "";
                    }
                    c9717uH0B.m(i11 + ":" + str);
                    cArr[i15] = c9717uH0B.H();
                }
                C9867vm c9867vm = new C9867vm(i11 + ":" + c9867vmB.f79962b, cArr);
                this.f78189d.put(c9867vm, c9867vmB);
                c9867vmArr[i12] = c9867vm;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final void b(long j10) {
        this.f78193h.b(j10);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean c(C7994eA0 c7994eA0) {
        if (this.f78188c.isEmpty()) {
            return this.f78193h.c(c7994eA0);
        }
        int size = this.f78188c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((YE0) this.f78188c.get(i10)).c(c7994eA0);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.TF0
    public final /* bridge */ /* synthetic */ void d(VF0 vf0) {
        XE0 xe0 = this.f78190e;
        xe0.getClass();
        xe0.d(this);
    }

    public final YE0 e(int i10) {
        YE0 ye0 = this.f78186a[i10];
        return ye0 instanceof C7580aG0 ? ((C7580aG0) ye0).e() : ye0;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long f(long j10) {
        long jF = this.f78192g[0].f(j10);
        int i10 = 1;
        while (true) {
            YE0[] ye0Arr = this.f78192g;
            if (i10 >= ye0Arr.length) {
                return jF;
            }
            if (ye0Arr[i10].f(jF) != jF) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long g(long j10, LA0 la0) {
        YE0[] ye0Arr = this.f78192g;
        return (ye0Arr.length > 0 ? ye0Arr[0] : this.f78186a[0]).g(j10, la0);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void k(long j10, boolean z10) {
        for (YE0 ye0 : this.f78192g) {
            ye0.k(j10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long n(PG0[] pg0Arr, boolean[] zArr, SF0[] sf0Arr, boolean[] zArr2, long j10) {
        int length;
        int length2 = pg0Arr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = pg0Arr.length;
            if (i11 >= length) {
                break;
            }
            SF0 sf0 = sf0Arr[i11];
            Integer num = sf0 == null ? null : (Integer) this.f78187b.get(sf0);
            iArr[i11] = num == null ? -1 : num.intValue();
            PG0 pg0 = pg0Arr[i11];
            if (pg0 != null) {
                String str = pg0.zzg().f79962b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        this.f78187b.clear();
        SF0[] sf0Arr2 = new SF0[length];
        SF0[] sf0Arr3 = new SF0[length];
        PG0[] pg0Arr2 = new PG0[length];
        ArrayList arrayList = new ArrayList(this.f78186a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f78186a.length) {
            for (int i13 = i10; i13 < pg0Arr.length; i13++) {
                sf0Arr3[i13] = iArr[i13] == i12 ? sf0Arr[i13] : null;
                if (iArr2[i13] == i12) {
                    PG0 pg02 = pg0Arr[i13];
                    pg02.getClass();
                    C9867vm c9867vm = (C9867vm) this.f78189d.get(pg02.zzg());
                    c9867vm.getClass();
                    pg0Arr2[i13] = new C8965nF0(pg02, c9867vm);
                } else {
                    pg0Arr2[i13] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            long jN = this.f78186a[i12].n(pg0Arr2, zArr, sf0Arr3, zArr2, j11);
            if (i12 == 0) {
                j11 = jN;
            } else if (jN != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < pg0Arr.length; i14++) {
                if (iArr2[i14] == i12) {
                    SF0 sf02 = sf0Arr3[i14];
                    sf02.getClass();
                    sf0Arr2[i14] = sf02;
                    this.f78187b.put(sf02, Integer.valueOf(i12));
                    z10 = true;
                } else if (iArr[i14] == i12) {
                    C8211gC.f(sf0Arr3[i14] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.f78186a[i12]);
            }
            i12++;
            arrayList = arrayList2;
            i10 = 0;
        }
        int i15 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(sf0Arr2, i15, sf0Arr, i15, length);
        this.f78192g = (YE0[]) arrayList3.toArray(new YE0[i15]);
        this.f78193h = new JE0(arrayList3, C9858vh0.b(arrayList3, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.mF0
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return ((YE0) obj).zzh().c();
            }
        }));
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void o(XE0 xe0, long j10) {
        this.f78190e = xe0;
        Collections.addAll(this.f78188c, this.f78186a);
        int i10 = 0;
        while (true) {
            YE0[] ye0Arr = this.f78186a;
            if (i10 >= ye0Arr.length) {
                return;
            }
            ye0Arr[i10].o(this, j10);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzb() {
        return this.f78193h.zzb();
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzc() {
        return this.f78193h.zzc();
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long zzd() {
        long j10 = -9223372036854775807L;
        for (YE0 ye0 : this.f78192g) {
            long jZzd = ye0.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && ye0.f(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (YE0 ye02 : this.f78192g) {
                    if (ye02 == ye0) {
                        break;
                    }
                    if (ye02.f(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jZzd;
            } else if (jZzd != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final C7900dG0 zzh() {
        C7900dG0 c7900dG0 = this.f78191f;
        c7900dG0.getClass();
        return c7900dG0;
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean zzp() {
        return this.f78193h.zzp();
    }

    public C9072oF0(KE0 ke0, long[] jArr, YE0... ye0Arr) {
        this.f78186a = ye0Arr;
        for (int i10 = 0; i10 < ye0Arr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f78186a[i10] = new C7580aG0(ye0Arr[i10], j10);
            }
        }
    }
}
