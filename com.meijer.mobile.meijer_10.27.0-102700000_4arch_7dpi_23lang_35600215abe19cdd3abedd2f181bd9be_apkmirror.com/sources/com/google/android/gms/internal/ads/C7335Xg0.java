package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Xg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C7335Xg0 extends AbstractC7368Yg0 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f71378a;

    /* renamed from: b, reason: collision with root package name */
    int f71379b;

    /* renamed from: c, reason: collision with root package name */
    boolean f71380c;

    final void e(Object[] objArr, int i10) {
        C7034Oh0.b(objArr, 2);
        f(2);
        System.arraycopy(objArr, 0, this.f71378a, this.f71379b, 2);
        this.f71379b += 2;
    }

    private final void f(int i10) {
        int length = this.f71378a.length;
        int iB = AbstractC7368Yg0.b(length, this.f71379b + i10);
        if (iB > length || this.f71380c) {
            this.f71378a = Arrays.copyOf(this.f71378a, iB);
            this.f71380c = false;
        }
    }

    public final AbstractC7368Yg0 d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size());
            if (collection instanceof AbstractC7401Zg0) {
                this.f71379b = ((AbstractC7401Zg0) collection).a(this.f71378a, this.f71379b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    C7335Xg0(int i10) {
        C6557Ag0.a(i10, "initialCapacity");
        this.f71378a = new Object[i10];
        this.f71379b = 0;
    }

    public final C7335Xg0 c(Object obj) {
        obj.getClass();
        f(1);
        Object[] objArr = this.f71378a;
        int i10 = this.f71379b;
        this.f71379b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
