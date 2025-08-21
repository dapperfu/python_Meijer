package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.rF0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9392rF0 extends HE0 {

    /* renamed from: s, reason: collision with root package name */
    private static final H7 f78815s;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC7791cF0[] f78816k;

    /* renamed from: l, reason: collision with root package name */
    private final List f78817l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC7432Wl[] f78818m;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList f78819n;

    /* renamed from: o, reason: collision with root package name */
    private int f78820o = -1;

    /* renamed from: p, reason: collision with root package name */
    private long[][] f78821p;

    /* renamed from: q, reason: collision with root package name */
    private zzuv f78822q;

    /* renamed from: r, reason: collision with root package name */
    private final KE0 f78823r;

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void a(YE0 ye0) {
        C9072oF0 c9072oF0 = (C9072oF0) ye0;
        for (int i10 = 0; i10 < this.f78816k.length; i10++) {
            List list = (List) this.f78817l.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((C9179pF0) list.get(i11)).f78386b.equals(ye0)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            this.f78816k[i10].a(c9072oF0.e(i10));
        }
    }

    static {
        E1 e12 = new E1();
        e12.a("MergingMediaSource");
        f78815s = e12.c();
    }

    @Override // com.google.android.gms.internal.ads.HE0
    protected final /* bridge */ /* synthetic */ void A(Object obj, InterfaceC7791cF0 interfaceC7791cF0, AbstractC7432Wl abstractC7432Wl) {
        int iB;
        Integer num = (Integer) obj;
        if (this.f78822q != null) {
            return;
        }
        if (this.f78820o == -1) {
            iB = abstractC7432Wl.b();
            this.f78820o = iB;
        } else {
            int iB2 = abstractC7432Wl.b();
            int i10 = this.f78820o;
            if (iB2 != i10) {
                this.f78822q = new zzuv(0);
                return;
            }
            iB = i10;
        }
        if (this.f78821p.length == 0) {
            this.f78821p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iB, this.f78818m.length);
        }
        this.f78819n.remove(interfaceC7791cF0);
        this.f78818m[num.intValue()] = abstractC7432Wl;
        if (this.f78819n.isEmpty()) {
            x(this.f78818m[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.HE0
    protected final /* bridge */ /* synthetic */ C7578aF0 E(Object obj, C7578aF0 c7578aF0) {
        List list = (List) this.f78817l.get(((Integer) obj).intValue());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((C9179pF0) list.get(i10)).f78385a.equals(c7578aF0)) {
                return ((C9179pF0) ((List) this.f78817l.get(0)).get(i10)).f78385a;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10246zE0, com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void b(H7 h72) {
        this.f78816k[0].b(h72);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final YE0 h(C7578aF0 c7578aF0, C8115fH0 c8115fH0, long j10) {
        AbstractC7432Wl[] abstractC7432WlArr = this.f78818m;
        int length = this.f78816k.length;
        YE0[] ye0Arr = new YE0[length];
        int iA = abstractC7432WlArr[0].a(c7578aF0.f73222a);
        for (int i10 = 0; i10 < length; i10++) {
            C7578aF0 c7578aF0A = c7578aF0.a(this.f78818m[i10].f(iA));
            ye0Arr[i10] = this.f78816k[i10].h(c7578aF0A, c8115fH0, j10 - this.f78821p[iA][i10]);
            ((List) this.f78817l.get(i10)).add(new C9179pF0(c7578aF0A, ye0Arr[i10], null));
        }
        return new C9072oF0(this.f78823r, this.f78821p[iA], ye0Arr);
    }

    @Override // com.google.android.gms.internal.ads.HE0, com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void j() throws IOException {
        zzuv zzuvVar = this.f78822q;
        if (zzuvVar != null) {
            throw zzuvVar;
        }
        super.j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final H7 k() {
        InterfaceC7791cF0[] interfaceC7791cF0Arr = this.f78816k;
        return interfaceC7791cF0Arr.length > 0 ? interfaceC7791cF0Arr[0].k() : f78815s;
    }

    public C9392rF0(boolean z10, boolean z11, KE0 ke0, InterfaceC7791cF0... interfaceC7791cF0Arr) {
        this.f78816k = interfaceC7791cF0Arr;
        this.f78823r = ke0;
        this.f78819n = new ArrayList(Arrays.asList(interfaceC7791cF0Arr));
        this.f78817l = new ArrayList(interfaceC7791cF0Arr.length);
        int i10 = 0;
        while (true) {
            int length = interfaceC7791cF0Arr.length;
            if (i10 < length) {
                this.f78817l.add(new ArrayList());
                i10++;
            } else {
                this.f78818m = new AbstractC7432Wl[length];
                this.f78821p = new long[0][];
                new HashMap();
                C7024Kh0.a(8).b(2).c();
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.HE0, com.google.android.gms.internal.ads.AbstractC10246zE0
    protected final void w(Pu0 pu0) {
        super.w(pu0);
        int i10 = 0;
        while (true) {
            InterfaceC7791cF0[] interfaceC7791cF0Arr = this.f78816k;
            if (i10 < interfaceC7791cF0Arr.length) {
                B(Integer.valueOf(i10), interfaceC7791cF0Arr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.HE0, com.google.android.gms.internal.ads.AbstractC10246zE0
    protected final void y() {
        super.y();
        Arrays.fill(this.f78818m, (Object) null);
        this.f78820o = -1;
        this.f78822q = null;
        this.f78819n.clear();
        Collections.addAll(this.f78819n, this.f78816k);
    }
}
