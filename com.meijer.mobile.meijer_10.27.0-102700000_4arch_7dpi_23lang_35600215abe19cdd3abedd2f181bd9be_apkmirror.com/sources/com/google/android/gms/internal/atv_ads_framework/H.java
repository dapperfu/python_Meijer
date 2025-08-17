package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    Object[] f80821a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    int f80822b = 0;

    /* renamed from: c, reason: collision with root package name */
    G f80823c;

    private final void d(int i10) {
        Object[] objArr = this.f80821a;
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
            this.f80821a = Arrays.copyOf(objArr, i12);
        }
    }

    public final H a(Object obj, Object obj2) {
        d(this.f80822b + 1);
        C10274z.a(obj, obj2);
        Object[] objArr = this.f80821a;
        int i10 = this.f80822b;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.f80822b = i10 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final H b(Iterable iterable) {
        d(this.f80822b + iterable.size());
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final I c() {
        G g10 = this.f80823c;
        if (g10 != null) {
            throw g10.a();
        }
        S sG = S.g(this.f80822b, this.f80821a, this);
        G g11 = this.f80823c;
        if (g11 == null) {
            return sG;
        }
        throw g11.a();
    }
}
