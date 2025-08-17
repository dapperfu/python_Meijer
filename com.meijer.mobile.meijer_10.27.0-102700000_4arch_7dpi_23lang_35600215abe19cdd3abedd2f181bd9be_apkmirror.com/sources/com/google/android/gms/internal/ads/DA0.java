package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
final class DA0 extends Cy0 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f66180k = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f66181d;

    /* renamed from: e, reason: collision with root package name */
    private final int f66182e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f66183f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f66184g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC7307Wl[] f66185h;

    /* renamed from: i, reason: collision with root package name */
    private final Object[] f66186i;

    /* renamed from: j, reason: collision with root package name */
    private final HashMap f66187j;

    /* JADX WARN: Illegal instructions before constructor call */
    public DA0(Collection collection, WF0 wf0) {
        AbstractC7307Wl[] abstractC7307WlArr = new AbstractC7307Wl[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            abstractC7307WlArr[i11] = ((InterfaceC8509kA0) it.next()).zza();
            i11++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((InterfaceC8509kA0) it2.next()).zzb();
            i10++;
        }
        this(abstractC7307WlArr, objArr, wf0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final int b() {
        return this.f66182e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final int c() {
        return this.f66181d;
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final int p(Object obj) {
        Integer num = (Integer) this.f66187j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final int q(int i10) {
        return OV.u(this.f66183f, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final int r(int i10) {
        return OV.u(this.f66184g, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final int s(int i10) {
        return this.f66183f[i10];
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final int t(int i10) {
        return this.f66184g[i10];
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final AbstractC7307Wl u(int i10) {
        return this.f66185h[i10];
    }

    @Override // com.google.android.gms.internal.ads.Cy0
    protected final Object v(int i10) {
        return this.f66186i[i10];
    }

    final List y() {
        return Arrays.asList(this.f66185h);
    }

    public final DA0 z(WF0 wf0) {
        AbstractC7307Wl[] abstractC7307WlArr = new AbstractC7307Wl[this.f66185h.length];
        int i10 = 0;
        while (true) {
            AbstractC7307Wl[] abstractC7307WlArr2 = this.f66185h;
            if (i10 >= abstractC7307WlArr2.length) {
                return new DA0(abstractC7307WlArr, this.f66186i, wf0);
            }
            abstractC7307WlArr[i10] = new CA0(this, abstractC7307WlArr2[i10]);
            i10++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private DA0(AbstractC7307Wl[] abstractC7307WlArr, Object[] objArr, WF0 wf0) {
        super(false, wf0);
        int i10 = 0;
        this.f66185h = abstractC7307WlArr;
        int length = abstractC7307WlArr.length;
        this.f66183f = new int[length];
        this.f66184g = new int[length];
        this.f66186i = objArr;
        this.f66187j = new HashMap();
        int iC = 0;
        int iB = 0;
        int i11 = 0;
        while (i10 < abstractC7307WlArr.length) {
            AbstractC7307Wl abstractC7307Wl = abstractC7307WlArr[i10];
            this.f66185h[i11] = abstractC7307Wl;
            this.f66184g[i11] = iC;
            this.f66183f[i11] = iB;
            iC += abstractC7307Wl.c();
            iB += this.f66185h[i11].b();
            this.f66187j.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f66181d = iC;
        this.f66182e = iB;
    }
}
