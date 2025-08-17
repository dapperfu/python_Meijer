package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8131gh0 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f74369a;

    /* renamed from: b, reason: collision with root package name */
    int f74370b;

    /* renamed from: c, reason: collision with root package name */
    C8024fh0 f74371c;

    public C8131gh0() {
        this(4);
    }

    C8131gh0(int i10) {
        this.f74369a = new Object[i10 + i10];
        this.f74370b = 0;
    }

    private final void d(int i10) {
        Object[] objArr = this.f74369a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f74369a = Arrays.copyOf(objArr, AbstractC7368Yg0.b(length, i11));
        }
    }

    public final C8131gh0 a(Object obj, Object obj2) {
        d(this.f74370b + 1);
        C6557Ag0.b(obj, obj2);
        Object[] objArr = this.f74369a;
        int i10 = this.f74370b;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.f74370b = i10 + 1;
        return this;
    }

    public final C8131gh0 b(Iterable iterable) {
        if (iterable instanceof Collection) {
            d(this.f74370b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final AbstractC8238hh0 c() {
        C8024fh0 c8024fh0 = this.f74371c;
        if (c8024fh0 != null) {
            throw c8024fh0.a();
        }
        Vh0 vh0K = Vh0.k(this.f74370b, this.f74369a, this);
        C8024fh0 c8024fh02 = this.f74371c;
        if (c8024fh02 == null) {
            return vh0K;
        }
        throw c8024fh02.a();
    }
}
