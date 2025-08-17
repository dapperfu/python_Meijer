package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.gms.internal.ads.oF0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8947oF0 implements YE0, XE0 {

    /* renamed from: a, reason: collision with root package name */
    private final YE0[] f77346a;

    /* renamed from: e, reason: collision with root package name */
    private XE0 f77350e;

    /* renamed from: f, reason: collision with root package name */
    private C7775dG0 f77351f;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f77348c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f77349d = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private VF0 f77353h = new JE0(AbstractC7917eh0.t(), AbstractC7917eh0.t());

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap f77347b = new IdentityHashMap();

    /* renamed from: g, reason: collision with root package name */
    private YE0[] f77352g = new YE0[0];

    @Override // com.google.android.gms.internal.ads.YE0
    public final void zzk() throws IOException {
        int i10 = 0;
        while (true) {
            YE0[] ye0Arr = this.f77346a;
            if (i10 >= ye0Arr.length) {
                return;
            }
            ye0Arr[i10].zzk();
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.XE0
    public final void a(YE0 ye0) {
        this.f77348c.remove(ye0);
        if (!this.f77348c.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (YE0 ye02 : this.f77346a) {
            i10 += ye02.zzh().f73385a;
        }
        C9742vm[] c9742vmArr = new C9742vm[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            YE0[] ye0Arr = this.f77346a;
            if (i11 >= ye0Arr.length) {
                this.f77351f = new C7775dG0(c9742vmArr);
                XE0 xe0 = this.f77350e;
                xe0.getClass();
                xe0.a(this);
                return;
            }
            C7775dG0 c7775dG0Zzh = ye0Arr[i11].zzh();
            int i13 = c7775dG0Zzh.f73385a;
            int i14 = 0;
            while (i14 < i13) {
                C9742vm c9742vmB = c7775dG0Zzh.b(i14);
                C[] cArr = new C[c9742vmB.f79121a];
                for (int i15 = 0; i15 < c9742vmB.f79121a; i15++) {
                    C cB = c9742vmB.b(i15);
                    C9592uH0 c9592uH0B = cB.b();
                    String str = cB.f65650a;
                    if (str == null) {
                        str = "";
                    }
                    c9592uH0B.m(i11 + ":" + str);
                    cArr[i15] = c9592uH0B.H();
                }
                C9742vm c9742vm = new C9742vm(i11 + ":" + c9742vmB.f79122b, cArr);
                this.f77349d.put(c9742vm, c9742vmB);
                c9742vmArr[i12] = c9742vm;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final void b(long j10) {
        this.f77353h.b(j10);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean c(C7869eA0 c7869eA0) {
        if (this.f77348c.isEmpty()) {
            return this.f77353h.c(c7869eA0);
        }
        int size = this.f77348c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((YE0) this.f77348c.get(i10)).c(c7869eA0);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.TF0
    public final /* bridge */ /* synthetic */ void d(VF0 vf0) {
        XE0 xe0 = this.f77350e;
        xe0.getClass();
        xe0.d(this);
    }

    public final YE0 e(int i10) {
        YE0 ye0 = this.f77346a[i10];
        return ye0 instanceof C7455aG0 ? ((C7455aG0) ye0).e() : ye0;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long f(long j10) {
        long jF = this.f77352g[0].f(j10);
        int i10 = 1;
        while (true) {
            YE0[] ye0Arr = this.f77352g;
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
        YE0[] ye0Arr = this.f77352g;
        return (ye0Arr.length > 0 ? ye0Arr[0] : this.f77346a[0]).g(j10, la0);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void k(long j10, boolean z10) {
        for (YE0 ye0 : this.f77352g) {
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
            Integer num = sf0 == null ? null : (Integer) this.f77347b.get(sf0);
            iArr[i11] = num == null ? -1 : num.intValue();
            PG0 pg0 = pg0Arr[i11];
            if (pg0 != null) {
                String str = pg0.zzg().f79122b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        this.f77347b.clear();
        SF0[] sf0Arr2 = new SF0[length];
        SF0[] sf0Arr3 = new SF0[length];
        PG0[] pg0Arr2 = new PG0[length];
        ArrayList arrayList = new ArrayList(this.f77346a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f77346a.length) {
            for (int i13 = i10; i13 < pg0Arr.length; i13++) {
                sf0Arr3[i13] = iArr[i13] == i12 ? sf0Arr[i13] : null;
                if (iArr2[i13] == i12) {
                    PG0 pg02 = pg0Arr[i13];
                    pg02.getClass();
                    C9742vm c9742vm = (C9742vm) this.f77349d.get(pg02.zzg());
                    c9742vm.getClass();
                    pg0Arr2[i13] = new C8840nF0(pg02, c9742vm);
                } else {
                    pg0Arr2[i13] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            long jN = this.f77346a[i12].n(pg0Arr2, zArr, sf0Arr3, zArr2, j11);
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
                    this.f77347b.put(sf02, Integer.valueOf(i12));
                    z10 = true;
                } else if (iArr[i14] == i12) {
                    C8086gC.f(sf0Arr3[i14] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.f77346a[i12]);
            }
            i12++;
            arrayList = arrayList2;
            i10 = 0;
        }
        int i15 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(sf0Arr2, i15, sf0Arr, i15, length);
        this.f77352g = (YE0[]) arrayList3.toArray(new YE0[i15]);
        this.f77353h = new JE0(arrayList3, C9733vh0.b(arrayList3, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.mF0
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return ((YE0) obj).zzh().c();
            }
        }));
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void o(XE0 xe0, long j10) {
        this.f77350e = xe0;
        Collections.addAll(this.f77348c, this.f77346a);
        int i10 = 0;
        while (true) {
            YE0[] ye0Arr = this.f77346a;
            if (i10 >= ye0Arr.length) {
                return;
            }
            ye0Arr[i10].o(this, j10);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzb() {
        return this.f77353h.zzb();
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzc() {
        return this.f77353h.zzc();
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long zzd() {
        long j10 = -9223372036854775807L;
        for (YE0 ye0 : this.f77352g) {
            long jZzd = ye0.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && ye0.f(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (YE0 ye02 : this.f77352g) {
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
    public final C7775dG0 zzh() {
        C7775dG0 c7775dG0 = this.f77351f;
        c7775dG0.getClass();
        return c7775dG0;
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean zzp() {
        return this.f77353h.zzp();
    }

    public C8947oF0(KE0 ke0, long[] jArr, YE0... ye0Arr) {
        this.f77346a = ye0Arr;
        for (int i10 = 0; i10 < ye0Arr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f77346a[i10] = new C7455aG0(ye0Arr[i10], j10);
            }
        }
    }
}
