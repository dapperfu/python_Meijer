package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8256gh0 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f75209a;

    /* renamed from: b, reason: collision with root package name */
    int f75210b;

    /* renamed from: c, reason: collision with root package name */
    C8149fh0 f75211c;

    public C8256gh0() {
        this(4);
    }

    C8256gh0(int i10) {
        this.f75209a = new Object[i10 + i10];
        this.f75210b = 0;
    }

    private final void d(int i10) {
        Object[] objArr = this.f75209a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f75209a = Arrays.copyOf(objArr, AbstractC7493Yg0.b(length, i11));
        }
    }

    public final C8256gh0 a(Object obj, Object obj2) {
        d(this.f75210b + 1);
        C6682Ag0.b(obj, obj2);
        Object[] objArr = this.f75209a;
        int i10 = this.f75210b;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.f75210b = i10 + 1;
        return this;
    }

    public final C8256gh0 b(Iterable iterable) {
        if (iterable instanceof Collection) {
            d(this.f75210b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final AbstractC8363hh0 c() {
        C8149fh0 c8149fh0 = this.f75211c;
        if (c8149fh0 != null) {
            throw c8149fh0.a();
        }
        Vh0 vh0K = Vh0.k(this.f75210b, this.f75209a, this);
        C8149fh0 c8149fh02 = this.f75211c;
        if (c8149fh02 == null) {
            return vh0K;
        }
        throw c8149fh02.a();
    }
}
