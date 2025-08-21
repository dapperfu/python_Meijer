package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ih0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8469ih0 extends C7460Xg0 {

    /* renamed from: d, reason: collision with root package name */
    Object[] f75836d;

    /* renamed from: e, reason: collision with root package name */
    private int f75837e;

    public C8469ih0() {
        super(4);
    }

    C8469ih0(int i10, boolean z10) {
        super(i10);
        this.f75836d = new Object[AbstractC8575jh0.n(i10)];
    }

    public final C8469ih0 h(Object... objArr) {
        if (this.f75836d == null) {
            e(objArr, 2);
            return this;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            g(objArr[i10]);
        }
        return this;
    }

    public final AbstractC8575jh0 j() {
        AbstractC8575jh0 abstractC8575jh0C;
        int i10 = this.f72219b;
        if (i10 == 0) {
            return Wh0.f71978i;
        }
        if (i10 == 1) {
            Object obj = this.f72218a[0];
            Objects.requireNonNull(obj);
            return new C8365hi0(obj);
        }
        if (this.f75836d == null || AbstractC8575jh0.n(i10) != this.f75836d.length) {
            abstractC8575jh0C = AbstractC8575jh0.C(this.f72219b, this.f72218a);
            this.f72219b = abstractC8575jh0C.size();
        } else {
            int i11 = this.f72219b;
            Object[] objArrCopyOf = this.f72218a;
            if (AbstractC8575jh0.D(i11, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            abstractC8575jh0C = new Wh0(objArrCopyOf, this.f75837e, this.f75836d, r6.length - 1, this.f72219b);
        }
        this.f72220c = true;
        this.f75836d = null;
        return abstractC8575jh0C;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7493Yg0
    public final /* bridge */ /* synthetic */ AbstractC7493Yg0 a(Object obj) {
        g(obj);
        return this;
    }

    public final C8469ih0 g(Object obj) {
        obj.getClass();
        if (this.f75836d != null) {
            int iN = AbstractC8575jh0.n(this.f72219b);
            Object[] objArr = this.f75836d;
            if (iN <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iA = C7427Wg0.a(iHashCode);
                while (true) {
                    int i10 = iA & length;
                    Object[] objArr2 = this.f75836d;
                    Object obj2 = objArr2[i10];
                    if (obj2 == null) {
                        objArr2[i10] = obj;
                        this.f75837e += iHashCode;
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
        this.f75836d = null;
        super.c(obj);
        return this;
    }

    public final C8469ih0 i(Iterable iterable) {
        iterable.getClass();
        if (this.f75836d != null) {
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
