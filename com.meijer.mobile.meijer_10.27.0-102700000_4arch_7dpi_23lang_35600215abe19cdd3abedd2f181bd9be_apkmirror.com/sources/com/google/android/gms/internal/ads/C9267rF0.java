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
public final class C9267rF0 extends HE0 {

    /* renamed from: s, reason: collision with root package name */
    private static final H7 f77975s;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC7666cF0[] f77976k;

    /* renamed from: l, reason: collision with root package name */
    private final List f77977l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC7307Wl[] f77978m;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList f77979n;

    /* renamed from: o, reason: collision with root package name */
    private int f77980o = -1;

    /* renamed from: p, reason: collision with root package name */
    private long[][] f77981p;

    /* renamed from: q, reason: collision with root package name */
    private zzuv f77982q;

    /* renamed from: r, reason: collision with root package name */
    private final KE0 f77983r;

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void a(YE0 ye0) {
        C8947oF0 c8947oF0 = (C8947oF0) ye0;
        for (int i10 = 0; i10 < this.f77976k.length; i10++) {
            List list = (List) this.f77977l.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((C9054pF0) list.get(i11)).f77546b.equals(ye0)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            this.f77976k[i10].a(c8947oF0.e(i10));
        }
    }

    static {
        E1 e12 = new E1();
        e12.a("MergingMediaSource");
        f77975s = e12.c();
    }

    @Override // com.google.android.gms.internal.ads.HE0
    protected final /* bridge */ /* synthetic */ void A(Object obj, InterfaceC7666cF0 interfaceC7666cF0, AbstractC7307Wl abstractC7307Wl) {
        int iB;
        Integer num = (Integer) obj;
        if (this.f77982q != null) {
            return;
        }
        if (this.f77980o == -1) {
            iB = abstractC7307Wl.b();
            this.f77980o = iB;
        } else {
            int iB2 = abstractC7307Wl.b();
            int i10 = this.f77980o;
            if (iB2 != i10) {
                this.f77982q = new zzuv(0);
                return;
            }
            iB = i10;
        }
        if (this.f77981p.length == 0) {
            this.f77981p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iB, this.f77978m.length);
        }
        this.f77979n.remove(interfaceC7666cF0);
        this.f77978m[num.intValue()] = abstractC7307Wl;
        if (this.f77979n.isEmpty()) {
            x(this.f77978m[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.HE0
    protected final /* bridge */ /* synthetic */ C7453aF0 E(Object obj, C7453aF0 c7453aF0) {
        List list = (List) this.f77977l.get(((Integer) obj).intValue());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((C9054pF0) list.get(i10)).f77545a.equals(c7453aF0)) {
                return ((C9054pF0) ((List) this.f77977l.get(0)).get(i10)).f77545a;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10121zE0, com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void b(H7 h72) {
        this.f77976k[0].b(h72);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final YE0 h(C7453aF0 c7453aF0, C7990fH0 c7990fH0, long j10) {
        AbstractC7307Wl[] abstractC7307WlArr = this.f77978m;
        int length = this.f77976k.length;
        YE0[] ye0Arr = new YE0[length];
        int iA = abstractC7307WlArr[0].a(c7453aF0.f72382a);
        for (int i10 = 0; i10 < length; i10++) {
            C7453aF0 c7453aF0A = c7453aF0.a(this.f77978m[i10].f(iA));
            ye0Arr[i10] = this.f77976k[i10].h(c7453aF0A, c7990fH0, j10 - this.f77981p[iA][i10]);
            ((List) this.f77977l.get(i10)).add(new C9054pF0(c7453aF0A, ye0Arr[i10], null));
        }
        return new C8947oF0(this.f77983r, this.f77981p[iA], ye0Arr);
    }

    @Override // com.google.android.gms.internal.ads.HE0, com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void j() throws IOException {
        zzuv zzuvVar = this.f77982q;
        if (zzuvVar != null) {
            throw zzuvVar;
        }
        super.j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final H7 k() {
        InterfaceC7666cF0[] interfaceC7666cF0Arr = this.f77976k;
        return interfaceC7666cF0Arr.length > 0 ? interfaceC7666cF0Arr[0].k() : f77975s;
    }

    public C9267rF0(boolean z10, boolean z11, KE0 ke0, InterfaceC7666cF0... interfaceC7666cF0Arr) {
        this.f77976k = interfaceC7666cF0Arr;
        this.f77983r = ke0;
        this.f77979n = new ArrayList(Arrays.asList(interfaceC7666cF0Arr));
        this.f77977l = new ArrayList(interfaceC7666cF0Arr.length);
        int i10 = 0;
        while (true) {
            int length = interfaceC7666cF0Arr.length;
            if (i10 < length) {
                this.f77977l.add(new ArrayList());
                i10++;
            } else {
                this.f77978m = new AbstractC7307Wl[length];
                this.f77981p = new long[0][];
                new HashMap();
                C6899Kh0.a(8).b(2).c();
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.HE0, com.google.android.gms.internal.ads.AbstractC10121zE0
    protected final void w(Pu0 pu0) {
        super.w(pu0);
        int i10 = 0;
        while (true) {
            InterfaceC7666cF0[] interfaceC7666cF0Arr = this.f77976k;
            if (i10 < interfaceC7666cF0Arr.length) {
                B(Integer.valueOf(i10), interfaceC7666cF0Arr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.HE0, com.google.android.gms.internal.ads.AbstractC10121zE0
    protected final void y() {
        super.y();
        Arrays.fill(this.f77978m, (Object) null);
        this.f77980o = -1;
        this.f77982q = null;
        this.f77979n.clear();
        Collections.addAll(this.f77979n, this.f77976k);
    }
}
