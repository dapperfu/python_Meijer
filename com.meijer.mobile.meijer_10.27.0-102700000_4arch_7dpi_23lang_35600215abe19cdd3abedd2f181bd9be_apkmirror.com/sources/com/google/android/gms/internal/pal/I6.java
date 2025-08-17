package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class I6 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f82656a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    int f82657b = 0;

    /* renamed from: c, reason: collision with root package name */
    H6 f82658c;

    private final void d(int i10) {
        int i11 = i10 + i10;
        Object[] objArr = this.f82656a;
        int length = objArr.length;
        if (i11 > length) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = a.e.API_PRIORITY_OTHER;
            }
            this.f82656a = Arrays.copyOf(objArr, i12);
        }
    }

    public final I6 a(Object obj, Object obj2) {
        d(this.f82657b + 1);
        A6.a(obj, obj2);
        Object[] objArr = this.f82656a;
        int i10 = this.f82657b;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.f82657b = i10 + 1;
        return this;
    }

    public final J6 c() {
        H6 h62 = this.f82658c;
        if (h62 != null) {
            throw h62.a();
        }
        Q6 q6N = Q6.n(this.f82657b, this.f82656a, this);
        H6 h63 = this.f82658c;
        if (h63 == null) {
            return q6N;
        }
        throw h63.a();
    }

    public final I6 b(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet instanceof Collection) {
            d(this.f82657b + setEntrySet.size());
        }
        for (Map.Entry entry : setEntrySet) {
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }
}
