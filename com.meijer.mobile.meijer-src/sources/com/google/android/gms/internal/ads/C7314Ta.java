package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7314Ta extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private final boolean f71246h;

    public C7314Ta(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11) {
        super(c8988na, "dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", c8736l8, i10, 61);
        this.f71246h = c8988na.s();
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f74045e.invoke(null, this.f74041a.b(), Boolean.valueOf(this.f71246h))).longValue();
        synchronized (this.f74044d) {
            this.f74044d.y(jLongValue);
        }
    }
}
