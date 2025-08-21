package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    Object[] f81661a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    int f81662b = 0;

    /* renamed from: c, reason: collision with root package name */
    G f81663c;

    private final void d(int i10) {
        Object[] objArr = this.f81661a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = a.e.API_PRIORITY_OTHER;
            }
            this.f81661a = Arrays.copyOf(objArr, i12);
        }
    }

    public final H a(Object obj, Object obj2) {
        d(this.f81662b + 1);
        C10399z.a(obj, obj2);
        Object[] objArr = this.f81661a;
        int i10 = this.f81662b;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.f81662b = i10 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final H b(Iterable iterable) {
        d(this.f81662b + iterable.size());
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final I c() {
        G g10 = this.f81663c;
        if (g10 != null) {
            throw g10.a();
        }
        S sG = S.g(this.f81662b, this.f81661a, this);
        G g11 = this.f81663c;
        if (g11 == null) {
            return sG;
        }
        throw g11.a();
    }
}
