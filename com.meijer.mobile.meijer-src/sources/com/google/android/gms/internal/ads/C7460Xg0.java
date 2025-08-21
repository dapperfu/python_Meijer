package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Xg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C7460Xg0 extends AbstractC7493Yg0 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f72218a;

    /* renamed from: b, reason: collision with root package name */
    int f72219b;

    /* renamed from: c, reason: collision with root package name */
    boolean f72220c;

    final void e(Object[] objArr, int i10) {
        C7159Oh0.b(objArr, 2);
        f(2);
        System.arraycopy(objArr, 0, this.f72218a, this.f72219b, 2);
        this.f72219b += 2;
    }

    private final void f(int i10) {
        int length = this.f72218a.length;
        int iB = AbstractC7493Yg0.b(length, this.f72219b + i10);
        if (iB > length || this.f72220c) {
            this.f72218a = Arrays.copyOf(this.f72218a, iB);
            this.f72220c = false;
        }
    }

    public final AbstractC7493Yg0 d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size());
            if (collection instanceof AbstractC7526Zg0) {
                this.f72219b = ((AbstractC7526Zg0) collection).a(this.f72218a, this.f72219b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    C7460Xg0(int i10) {
        C6682Ag0.a(i10, "initialCapacity");
        this.f72218a = new Object[i10];
        this.f72219b = 0;
    }

    public final C7460Xg0 c(Object obj) {
        obj.getClass();
        f(1);
        Object[] objArr = this.f72218a;
        int i10 = this.f72219b;
        this.f72219b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
