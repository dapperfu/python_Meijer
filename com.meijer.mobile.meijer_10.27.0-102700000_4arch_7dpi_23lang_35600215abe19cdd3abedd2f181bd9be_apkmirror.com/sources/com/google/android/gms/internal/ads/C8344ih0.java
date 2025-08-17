package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ih0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8344ih0 extends C7335Xg0 {

    /* renamed from: d, reason: collision with root package name */
    Object[] f74996d;

    /* renamed from: e, reason: collision with root package name */
    private int f74997e;

    public C8344ih0() {
        super(4);
    }

    C8344ih0(int i10, boolean z10) {
        super(i10);
        this.f74996d = new Object[AbstractC8450jh0.n(i10)];
    }

    public final C8344ih0 h(Object... objArr) {
        if (this.f74996d == null) {
            e(objArr, 2);
            return this;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            g(objArr[i10]);
        }
        return this;
    }

    public final AbstractC8450jh0 j() {
        AbstractC8450jh0 abstractC8450jh0C;
        int i10 = this.f71379b;
        if (i10 == 0) {
            return Wh0.f71138i;
        }
        if (i10 == 1) {
            Object obj = this.f71378a[0];
            Objects.requireNonNull(obj);
            return new C8240hi0(obj);
        }
        if (this.f74996d == null || AbstractC8450jh0.n(i10) != this.f74996d.length) {
            abstractC8450jh0C = AbstractC8450jh0.C(this.f71379b, this.f71378a);
            this.f71379b = abstractC8450jh0C.size();
        } else {
            int i11 = this.f71379b;
            Object[] objArrCopyOf = this.f71378a;
            if (AbstractC8450jh0.D(i11, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            abstractC8450jh0C = new Wh0(objArrCopyOf, this.f74997e, this.f74996d, r6.length - 1, this.f71379b);
        }
        this.f71380c = true;
        this.f74996d = null;
        return abstractC8450jh0C;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7368Yg0
    public final /* bridge */ /* synthetic */ AbstractC7368Yg0 a(Object obj) {
        g(obj);
        return this;
    }

    public final C8344ih0 g(Object obj) {
        obj.getClass();
        if (this.f74996d != null) {
            int iN = AbstractC8450jh0.n(this.f71379b);
            Object[] objArr = this.f74996d;
            if (iN <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iA = C7302Wg0.a(iHashCode);
                while (true) {
                    int i10 = iA & length;
                    Object[] objArr2 = this.f74996d;
                    Object obj2 = objArr2[i10];
                    if (obj2 == null) {
                        objArr2[i10] = obj;
                        this.f74997e += iHashCode;
                        super.c(obj);
                        return this;
                    }
                    if (!obj2.equals(obj)) {
                        iA = i10 + 1;
                    } else {
                        return this;
                    }
                }
            }
        }
        this.f74996d = null;
        super.c(obj);
        return this;
    }

    public final C8344ih0 i(Iterable iterable) {
        iterable.getClass();
        if (this.f74996d != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }
        super.d(iterable);
        return this;
    }
}
