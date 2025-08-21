package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
final class DA0 extends Cy0 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f67020k = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f67021d;

    /* renamed from: e, reason: collision with root package name */
    private final int f67022e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f67023f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f67024g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC7432Wl[] f67025h;

    /* renamed from: i, reason: collision with root package name */
    private final Object[] f67026i;

    /* renamed from: j, reason: collision with root package name */
    private final HashMap f67027j;

    /* JADX WARN: Illegal instructions before constructor call */
    public DA0(Collection collection, WF0 wf0) {
        AbstractC7432Wl[] abstractC7432WlArr = new AbstractC7432Wl[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            abstractC7432WlArr[i11] = ((InterfaceC8634kA0) it.next()).zza();
            i11++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((InterfaceC8634kA0) it2.next()).zzb();
            i10++;
        }
        this(abstractC7432WlArr, objArr, wf0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7432Wl
    public final int b() {
        return this.f67022e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7432Wl
    public final int c() {
        return this.f67021d;
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final int p(Object obj) {
        Integer num = (Integer) this.f67027j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final int q(int i10) {
        return OV.u(this.f67023f, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final int r(int i10) {
        return OV.u(this.f67024g, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final int s(int i10) {
        return this.f67023f[i10];
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final int t(int i10) {
        return this.f67024g[i10];
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final AbstractC7432Wl u(int i10) {
        return this.f67025h[i10];
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final Object v(int i10) {
        return this.f67026i[i10];
    }

    final List y() {
        return Arrays.asList(this.f67025h);
    }

    public final DA0 z(WF0 wf0) {
        AbstractC7432Wl[] abstractC7432WlArr = new AbstractC7432Wl[this.f67025h.length];
        int i10 = 0;
        while (true) {
            AbstractC7432Wl[] abstractC7432WlArr2 = this.f67025h;
            if (i10 >= abstractC7432WlArr2.length) {
                return new DA0(abstractC7432WlArr, this.f67026i, wf0);
            }
            abstractC7432WlArr[i10] = new CA0(this, abstractC7432WlArr2[i10]);
            i10++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private DA0(AbstractC7432Wl[] abstractC7432WlArr, Object[] objArr, WF0 wf0) {
        super(false, wf0);
        int i10 = 0;
        this.f67025h = abstractC7432WlArr;
        int length = abstractC7432WlArr.length;
        this.f67023f = new int[length];
        this.f67024g = new int[length];
        this.f67026i = objArr;
        this.f67027j = new HashMap();
        int iC = 0;
        int iB = 0;
        int i11 = 0;
        while (i10 < abstractC7432WlArr.length) {
            AbstractC7432Wl abstractC7432Wl = abstractC7432WlArr[i10];
            this.f67025h[i11] = abstractC7432Wl;
            this.f67024g[i11] = iC;
            this.f67023f[i11] = iB;
            iC += abstractC7432Wl.c();
            iB += this.f67025h[i11].b();
            this.f67027j.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f67021d = iC;
        this.f67022e = iB;
    }
}
